package cg;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import nh.g7;
import nh.t6;
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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.ll;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q61;
import org.telegram.ui.uk0;
public final class x0 implements Runnable {
    public final int f2567a;
    public final boolean f2568b;
    public final boolean f2569c;
    public final Object d;
    public final Object e;
    public final Object f2570f;

    public x0(n1 n1Var, boolean z4, boolean z10, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f2567a = 1;
        this.d = n1Var;
        this.f2568b = z4;
        this.f2569c = z10;
        this.e = bitmapArr;
        this.f2570f = countDownLatch;
    }

    @Override
    public final void run() {
        boolean z4;
        Utilities.Callback callback;
        int i10 = this.f2567a;
        boolean z10 = this.f2569c;
        boolean z11 = this.f2568b;
        Object obj = this.f2570f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                Runnable runnable = (Runnable) obj;
                ((d1) obj3).l((e1) obj2, z11, z10);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                d1 d1Var = ((n1) obj3).f2485y.f2494c;
                jv0 jv0Var = d1Var.f2338g;
                bf.b h = d1Var.h(new RectF(0.0f, 0.0f, jv0Var.f26052a, jv0Var.f26053b), false, z11, z10);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f1782b;
                }
                countDownLatch.countDown();
                return;
            case 2:
                t6 t6Var = (t6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = t6Var.f15917a;
                SharedPreferences sharedPreferences = t6Var.f15925l;
                if (z11) {
                    t6Var.f15931r = false;
                } else {
                    t6Var.f15930q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i11).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (!z11) {
                        t6Var.f15934u = tL_stories_allStories.count;
                        t6Var.f15929p = tL_stories_allStories.has_more;
                        t6Var.f15928o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", t6Var.f15928o).putBoolean("last_stories_has_more", t6Var.f15929p).putInt("total_stores", t6Var.f15934u).apply();
                    } else {
                        t6Var.v = tL_stories_allStories.count;
                        t6Var.f15938z = tL_stories_allStories.has_more;
                        t6Var.f15937y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", t6Var.f15937y).putBoolean("last_stories_has_more_hidden", t6Var.f15938z).putInt("total_stores_hidden", t6Var.v).apply();
                    }
                    t6Var.Y(tL_stories_allStories, z11, false, z10);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z11) {
                        t6Var.f15929p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        t6Var.f15928o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", t6Var.f15928o).apply();
                    } else {
                        t6Var.f15938z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        t6Var.f15937y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", t6Var.f15937y).apply();
                    }
                    if (z11) {
                        z4 = t6Var.f15938z;
                    } else {
                        z4 = t6Var.f15929p;
                    }
                    if (z4) {
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 3:
                g7 g7Var = (g7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                n0 n0Var = (n0) obj;
                int i12 = g7Var.f15365a;
                MessagesStorage messagesStorage = g7Var.f15366b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i13);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f10 = g7Var.f(arrayList2.get(i14).f19419id, peerDialogId);
                                if (f10 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i14, f10);
                                }
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (!z11) {
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
                                if (user == null || (user.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j10 = -longValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j10));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i12).getChat(j10);
                                }
                                if (chat == null || (chat.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
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
                    g7Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(n0Var);
                return;
            case 4:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z11, z10);
                return;
            default:
                final q61 q61Var = (q61) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(q61Var.S).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                ArrayList arrayList7 = new ArrayList();
                uk0 uk0Var = new uk0(q61Var, str, this.f2568b, arrayList4, reactionsMap, arrayList5, linkedHashSet, linkedHashSet2, arrayList7, arrayList6, this.f2569c);
                int i16 = q61Var.T;
                if (i16 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable2 = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(q61Var.S).getEmojiSuggestions(q61.X1, str, false, new tl0(15, linkedHashSet2, runnable2), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(q61Var.S).getAnimatedEmojiByKeywords(str, new x41(linkedHashSet2, runnable2, 0));
                                    return;
                            }
                        }
                    }, uk0Var);
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
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(q61Var.S).getAvailableEffects();
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
                                                        arrayList8.add(mg.q0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        return;
                                    default:
                                        q61 q61Var2 = q61Var;
                                        MediaDataController.getInstance(q61Var2.S).getEmojiSuggestions(q61.X1, str, false, new a1.d(q61Var2, arrayList5, arrayList4, (Runnable) obj4, 16), null, false, false, false, 0);
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
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(q61Var.S).getAvailableEffects();
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
                                                        arrayList8.add(mg.q0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        return;
                                    default:
                                        q61 q61Var2 = q61Var;
                                        MediaDataController.getInstance(q61Var2.S).getEmojiSuggestions(q61.X1, str, false, new a1.d(q61Var2, arrayList5, arrayList4, (Runnable) obj4, 16), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, uk0Var);
                    return;
                } else {
                    Utilities.doCallbacks(new ll(fullyConsistsOfEmojis, str, linkedHashSet, 3), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable2 = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(q61Var.S).getEmojiSuggestions(q61.X1, str, false, new tl0(15, linkedHashSet, runnable2), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(q61Var.S).getAnimatedEmojiByKeywords(str, new x41(linkedHashSet, runnable2, 0));
                                    return;
                            }
                        }
                    }, new gg.c1(q61Var, strArr, str, linkedHashSet, 13), new ok(q61Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new gg.c1(14, q61Var, arrayList6, hashMap, str), new org.telegram.ui.a0(q61Var, str, arrayList7, 8), uk0Var);
                    return;
                }
        }
    }

    public x0(Object obj, Object obj2, boolean z4, boolean z10, Object obj3, int i10) {
        this.f2567a = i10;
        this.d = obj;
        this.e = obj2;
        this.f2568b = z4;
        this.f2569c = z10;
        this.f2570f = obj3;
    }

    public x0(t6 t6Var, boolean z4, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z10) {
        this.f2567a = 2;
        this.d = t6Var;
        this.f2568b = z4;
        this.e = tL_stories_getAllStories;
        this.f2570f = tLObject;
        this.f2569c = z10;
    }

    public x0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z4, boolean z10) {
        this.f2567a = 4;
        this.d = profileActivity;
        this.e = user;
        this.f2570f = str;
        this.f2568b = z4;
        this.f2569c = z10;
    }
}
