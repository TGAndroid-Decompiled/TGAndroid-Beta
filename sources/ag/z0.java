package ag;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import lh.f7;
import lh.s6;
import nh.yb;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d61;
import org.telegram.ui.mk0;
public final class z0 implements Runnable {
    public final int f727a;
    public final boolean f728b;
    public final boolean f729c;
    public final Object d;
    public final Object f730e;
    public final Object f731f;

    public z0(r1 r1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f727a = 1;
        this.d = r1Var;
        this.f728b = z10;
        this.f729c = z11;
        this.f730e = bitmapArr;
        this.f731f = countDownLatch;
    }

    @Override
    public final void run() {
        boolean z10;
        Utilities.Callback callback;
        int i10 = this.f727a;
        boolean z11 = this.f729c;
        boolean z12 = this.f728b;
        Object obj = this.f731f;
        Object obj2 = this.f730e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                Runnable runnable = (Runnable) obj;
                ((f1) obj3).l((g1) obj2, z12, z11);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                f1 f1Var = ((r1) obj3).f650y.f660c;
                bv0 bv0Var = f1Var.f474g;
                ze.b h = f1Var.h(new RectF(0.0f, 0.0f, bv0Var.f27238a, bv0Var.f27239b), false, z12, z11);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f50824a;
                }
                countDownLatch.countDown();
                return;
            case 2:
                s6 s6Var = (s6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = s6Var.f16218a;
                SharedPreferences sharedPreferences = s6Var.f16227l;
                if (z12) {
                    s6Var.f16233r = false;
                } else {
                    s6Var.f16232q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i11).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        s6Var.f16236u = tL_stories_allStories.count;
                        s6Var.f16231p = tL_stories_allStories.has_more;
                        s6Var.f16230o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", s6Var.f16230o).putBoolean("last_stories_has_more", s6Var.f16231p).putInt("total_stores", s6Var.f16236u).apply();
                    } else {
                        s6Var.v = tL_stories_allStories.count;
                        s6Var.f16240z = tL_stories_allStories.has_more;
                        s6Var.f16239y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", s6Var.f16239y).putBoolean("last_stories_has_more_hidden", s6Var.f16240z).putInt("total_stores_hidden", s6Var.v).apply();
                    }
                    s6Var.Y(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        s6Var.f16231p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        s6Var.f16230o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", s6Var.f16230o).apply();
                    } else {
                        s6Var.f16240z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        s6Var.f16239y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", s6Var.f16239y).apply();
                    }
                    if (z12) {
                        z10 = s6Var.f16240z;
                    } else {
                        z10 = s6Var.f16231p;
                    }
                    if (z10) {
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 3:
                f7 f7Var = (f7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                o0 o0Var = (o0) obj;
                int i12 = f7Var.f15599a;
                MessagesStorage messagesStorage = f7Var.f15600b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i13);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f9 = f7Var.f(arrayList2.get(i14).f22629id, peerDialogId);
                                if (f9 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i14, f9);
                                }
                            }
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (!z12) {
                    try {
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(longValue));
                                if (user == null) {
                                    user = MessagesStorage.getInstance(i12).getUser(longValue);
                                }
                                if (user == null || (user.stories_hidden == z11 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j10 = -longValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j10));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i12).getChat(j10);
                                }
                                if (chat == null || (chat.stories_hidden == z11 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList3));
                        }
                        Locale locale = Locale.US;
                        String join = TextUtils.join(",", arrayList3);
                        database.executeFast("DELETE FROM stories WHERE dialog_id IN(" + join + ")").stepThis().dispose();
                    } catch (Throwable th2) {
                        messagesStorage.checkSQLException(th2);
                    }
                }
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i15);
                    f7Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(o0Var);
                return;
            case 4:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z12, z11);
                return;
            default:
                final d61 d61Var = (d61) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(d61Var.R).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                ArrayList arrayList7 = new ArrayList();
                mk0 mk0Var = new mk0(d61Var, str, this.f728b, arrayList4, reactionsMap, arrayList5, linkedHashSet, linkedHashSet2, arrayList7, arrayList6, this.f729c);
                int i16 = d61Var.S;
                if (i16 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable2 = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(d61Var.R).getEmojiSuggestions(d61.W1, str, false, new kl0(16, linkedHashSet2, runnable2), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(d61Var.R).getAnimatedEmojiByKeywords(str, new n41(linkedHashSet2, runnable2, 0));
                                    return;
                            }
                        }
                    }, mk0Var);
                    return;
                } else if (i16 == 14) {
                    if (fullyConsistsOfEmojis) {
                        callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable2 = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(d61Var.R).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i17 = 0; i17 < availableEffects.effects.size(); i17++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i17);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(kg.q0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        return;
                                    default:
                                        d61 d61Var2 = d61Var;
                                        MediaDataController.getInstance(d61Var2.R).getEmojiSuggestions(d61.W1, str, false, new a1.d(d61Var2, arrayList5, arrayList4, (Runnable) obj4, 16), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    } else {
                        callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable2 = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(d61Var.R).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i17 = 0; i17 < availableEffects.effects.size(); i17++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i17);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(kg.q0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        return;
                                    default:
                                        d61 d61Var2 = d61Var;
                                        MediaDataController.getInstance(d61Var2.R).getEmojiSuggestions(d61.W1, str, false, new a1.d(d61Var2, arrayList5, arrayList4, (Runnable) obj4, 16), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, mk0Var);
                    return;
                } else {
                    Utilities.doCallbacks(new yb(fullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable2 = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(d61Var.R).getEmojiSuggestions(d61.W1, str, false, new kl0(16, linkedHashSet, runnable2), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(d61Var.R).getAnimatedEmojiByKeywords(str, new n41(linkedHashSet, runnable2, 0));
                                    return;
                            }
                        }
                    }, new eg.d1(d61Var, strArr, str, linkedHashSet, 13), new kk(d61Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new eg.d1((Object) d61Var, str, (Object) arrayList6, (Object) hashMap, 14), new org.telegram.ui.b0(d61Var, str, arrayList7, 8), mk0Var);
                    return;
                }
        }
    }

    public z0(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f727a = i10;
        this.d = obj;
        this.f730e = obj2;
        this.f728b = z10;
        this.f729c = z11;
        this.f731f = obj3;
    }

    public z0(s6 s6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f727a = 2;
        this.d = s6Var;
        this.f728b = z10;
        this.f730e = tL_stories_getAllStories;
        this.f731f = tLObject;
        this.f729c = z11;
    }

    public z0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f727a = 4;
        this.d = profileActivity;
        this.f730e = user;
        this.f731f = str;
        this.f728b = z10;
        this.f729c = z11;
    }
}
