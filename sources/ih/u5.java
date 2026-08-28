package ih;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import kh.oc;
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
import org.telegram.messenger.dk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b61;
import org.telegram.ui.qk0;
public final class u5 implements Runnable {
    public final int f12186a;
    public final boolean f12187b;
    public final boolean f12188c;
    public final Object d;
    public final Object f12189e;
    public final Object f12190f;

    public u5(v6 v6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f12186a = 0;
        this.d = v6Var;
        this.f12187b = z10;
        this.f12189e = tL_stories_getAllStories;
        this.f12190f = tLObject;
        this.f12188c = z11;
    }

    @Override
    public final void run() {
        boolean z10;
        Utilities.Callback callback;
        int i9 = this.f12186a;
        boolean z11 = this.f12188c;
        boolean z12 = this.f12187b;
        Object obj = this.f12190f;
        Object obj2 = this.f12189e;
        Object obj3 = this.d;
        switch (i9) {
            case 0:
                v6 v6Var = (v6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i10 = v6Var.f12236a;
                SharedPreferences sharedPreferences = v6Var.f12245l;
                if (z12) {
                    v6Var.f12251r = false;
                } else {
                    v6Var.f12250q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i10).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        v6Var.f12254u = tL_stories_allStories.count;
                        v6Var.f12249p = tL_stories_allStories.has_more;
                        v6Var.f12248o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", v6Var.f12248o).putBoolean("last_stories_has_more", v6Var.f12249p).putInt("total_stores", v6Var.f12254u).apply();
                    } else {
                        v6Var.v = tL_stories_allStories.count;
                        v6Var.f12258z = tL_stories_allStories.has_more;
                        v6Var.f12257y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", v6Var.f12257y).putBoolean("last_stories_has_more_hidden", v6Var.f12258z).putInt("total_stores_hidden", v6Var.v).apply();
                    }
                    v6Var.Y(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        v6Var.f12249p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        v6Var.f12248o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", v6Var.f12248o).apply();
                    } else {
                        v6Var.f12258z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        v6Var.f12257y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", v6Var.f12257y).apply();
                    }
                    if (z12) {
                        z10 = v6Var.f12258z;
                    } else {
                        z10 = v6Var.f12249p;
                    }
                    if (z10) {
                        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                i7 i7Var = (i7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                bg.d2 d2Var = (bg.d2) obj;
                int i11 = i7Var.f11619a;
                MessagesStorage messagesStorage = i7Var.f11620b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i12);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            if (arrayList2.get(i13) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f10 = i7Var.f(arrayList2.get(i13).f22617id, peerDialogId);
                                if (f10 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i13, f10);
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
                                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(longValue));
                                if (user == null) {
                                    user = MessagesStorage.getInstance(i11).getUser(longValue);
                                }
                                if (user == null || (user.stories_hidden == z11 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j10 = -longValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(j10));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i11).getChat(j10);
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
                    } catch (Throwable th) {
                        messagesStorage.checkSQLException(th);
                    }
                }
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i14);
                    i7Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(d2Var);
                return;
            case 2:
                ProfileActivity.l0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z12, z11);
                return;
            case 3:
                final b61 b61Var = (b61) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(b61Var.R).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                ArrayList arrayList7 = new ArrayList();
                qk0 qk0Var = new qk0(b61Var, str, this.f12187b, arrayList4, reactionsMap, arrayList5, linkedHashSet, linkedHashSet2, arrayList7, arrayList6, this.f12188c);
                int i15 = b61Var.S;
                if (i15 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(b61Var.R).getEmojiSuggestions(b61.W1, str, false, new nl0(16, linkedHashSet2, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(b61Var.R).getAnimatedEmojiByKeywords(str, new l41(linkedHashSet2, runnable, 0));
                                    return;
                            }
                        }
                    }, qk0Var);
                    return;
                } else if (i15 == 14) {
                    if (fullyConsistsOfEmojis) {
                        callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(b61Var.R).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i16 = 0; i16 < availableEffects.effects.size(); i16++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i16);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(hg.r0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        b61 b61Var2 = b61Var;
                                        MediaDataController.getInstance(b61Var2.R).getEmojiSuggestions(b61.W1, str, false, new a1.d(b61Var2, arrayList5, arrayList4, (Runnable) obj4, 17), null, false, false, false, 0);
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
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(b61Var.R).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i16 = 0; i16 < availableEffects.effects.size(); i16++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i16);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(hg.r0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        b61 b61Var2 = b61Var;
                                        MediaDataController.getInstance(b61Var2.R).getEmojiSuggestions(b61.W1, str, false, new a1.d(b61Var2, arrayList5, arrayList4, (Runnable) obj4, 17), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, qk0Var);
                    return;
                } else {
                    Utilities.doCallbacks(new oc(fullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(b61Var.R).getEmojiSuggestions(b61.W1, str, false, new nl0(16, linkedHashSet, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(b61Var.R).getAnimatedEmojiByKeywords(str, new l41(linkedHashSet, runnable, 0));
                                    return;
                            }
                        }
                    }, new bg.j1(b61Var, strArr, str, linkedHashSet, 13), new dk(b61Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new bg.j1((Object) b61Var, str, (Object) arrayList6, (Object) hashMap, 14), new org.telegram.ui.a0(b61Var, str, arrayList7, 8), qk0Var);
                    return;
                }
            case 4:
                Runnable runnable = (Runnable) obj;
                ((xf.q0) obj3).l((xf.r0) obj2, z12, z11);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                xf.q0 q0Var = ((xf.a1) obj3).f49169y.f49180c;
                qu0 qu0Var = q0Var.f49315g;
                w4.e h = q0Var.h(new RectF(0.0f, 0.0f, qu0Var.f32026a, qu0Var.f32027b), false, z12, z11);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f48761b;
                }
                countDownLatch.countDown();
                return;
        }
    }

    public u5(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i9) {
        this.f12186a = i9;
        this.d = obj;
        this.f12189e = obj2;
        this.f12187b = z10;
        this.f12188c = z11;
        this.f12190f = obj3;
    }

    public u5(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f12186a = 2;
        this.d = profileActivity;
        this.f12189e = user;
        this.f12190f = str;
        this.f12187b = z10;
        this.f12188c = z11;
    }

    public u5(xf.a1 a1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f12186a = 5;
        this.d = a1Var;
        this.f12187b = z10;
        this.f12188c = z11;
        this.f12189e = bitmapArr;
        this.f12190f = countDownLatch;
    }
}
