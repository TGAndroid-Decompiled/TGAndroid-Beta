package bi;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import di.hd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
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
import org.telegram.messenger.nk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.il0;
import org.telegram.ui.j71;
public final class i7 implements Runnable {
    public final int f3099a;
    public final boolean f3100b;
    public final boolean f3101c;
    public final Object d;
    public final Object f3102e;
    public final Object f3103f;

    public i7(u8 u8Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f3099a = 0;
        this.d = u8Var;
        this.f3100b = z10;
        this.f3102e = tL_stories_getAllStories;
        this.f3103f = tLObject;
        this.f3101c = z11;
    }

    @Override
    public final void run() {
        boolean z10;
        Utilities.Callback callback;
        int i10 = this.f3099a;
        boolean z11 = this.f3101c;
        boolean z12 = this.f3100b;
        Object obj = this.f3103f;
        Object obj2 = this.f3102e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                u8 u8Var = (u8) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = u8Var.f3805a;
                SharedPreferences sharedPreferences = u8Var.f3814l;
                if (z12) {
                    u8Var.f3820r = false;
                } else {
                    u8Var.f3819q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i11).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        u8Var.f3823u = tL_stories_allStories.count;
                        u8Var.f3818p = tL_stories_allStories.has_more;
                        u8Var.f3817o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", u8Var.f3817o).putBoolean("last_stories_has_more", u8Var.f3818p).putInt("total_stores", u8Var.f3823u).apply();
                    } else {
                        u8Var.v = tL_stories_allStories.count;
                        u8Var.f3827z = tL_stories_allStories.has_more;
                        u8Var.f3826y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", u8Var.f3826y).putBoolean("last_stories_has_more_hidden", u8Var.f3827z).putInt("total_stores_hidden", u8Var.v).apply();
                    }
                    u8Var.Y(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        u8Var.f3818p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        u8Var.f3817o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", u8Var.f3817o).apply();
                    } else {
                        u8Var.f3827z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        u8Var.f3826y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", u8Var.f3826y).apply();
                    }
                    if (z12) {
                        z10 = u8Var.f3827z;
                    } else {
                        z10 = u8Var.f3818p;
                    }
                    if (z10) {
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                h9 h9Var = (h9) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ah.j jVar = (ah.j) obj;
                int i12 = h9Var.f3073a;
                MessagesStorage messagesStorage = h9Var.f3074b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i13);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f7 = h9Var.f(arrayList2.get(i14).f20107id, peerDialogId);
                                if (f7 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i14, f7);
                                }
                            }
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                                long j3 = -longValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j3));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i12).getChat(j3);
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
                    h9Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(jVar);
                return;
            case 2:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z12, z11);
                return;
            case 3:
                final j71 j71Var = (j71) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(j71Var.V).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                ArrayList arrayList7 = new ArrayList();
                il0 il0Var = new il0(j71Var, str, this.f3100b, arrayList4, reactionsMap, arrayList5, linkedHashSet, linkedHashSet2, arrayList7, arrayList6, this.f3101c);
                int i16 = j71Var.W;
                if (i16 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(j71Var.V).getEmojiSuggestions(j71.a2, str, false, new qv0(7, linkedHashSet2, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(j71Var.V).getAnimatedEmojiByKeywords(str, new s51(linkedHashSet2, runnable, 0));
                                    return;
                            }
                        }
                    }, il0Var);
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
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(j71Var.V).getAvailableEffects();
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
                                                        arrayList8.add(ah.j1.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        j71 j71Var2 = j71Var;
                                        MediaDataController.getInstance(j71Var2.V).getEmojiSuggestions(j71.a2, str, false, new a1.d(j71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
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
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(j71Var.V).getAvailableEffects();
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
                                                        arrayList8.add(ah.j1.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        j71 j71Var2 = j71Var;
                                        MediaDataController.getInstance(j71Var2.V).getEmojiSuggestions(j71.a2, str, false, new a1.d(j71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, il0Var);
                    return;
                } else {
                    Utilities.doCallbacks(new hd(fullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(j71Var.V).getEmojiSuggestions(j71.a2, str, false, new qv0(7, linkedHashSet, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(j71Var.V).getAnimatedEmojiByKeywords(str, new s51(linkedHashSet, runnable, 0));
                                    return;
                            }
                        }
                    }, new r3(j71Var, strArr, str, linkedHashSet, 11), new nk(j71Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new r3((Object) j71Var, str, arrayList6, (Object) hashMap, 12), new org.telegram.ui.y(j71Var, str, arrayList7, 8), il0Var);
                    return;
                }
            case 4:
                Runnable runnable = (Runnable) obj;
                ((qg.q0) obj3).l((qg.r0) obj2, z12, z11);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                qg.q0 q0Var = ((qg.a1) obj3).f44378y.f44389c;
                iv0 iv0Var = q0Var.f44523g;
                o0.a h = q0Var.h(new RectF(0.0f, 0.0f, iv0Var.f27271a, iv0Var.f27272b), false, z12, z11);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f16769b;
                }
                countDownLatch.countDown();
                return;
        }
    }

    public i7(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f3099a = i10;
        this.d = obj;
        this.f3102e = obj2;
        this.f3100b = z10;
        this.f3101c = z11;
        this.f3103f = obj3;
    }

    public i7(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f3099a = 2;
        this.d = profileActivity;
        this.f3102e = user;
        this.f3103f = str;
        this.f3100b = z10;
        this.f3101c = z11;
    }

    public i7(qg.a1 a1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f3099a = 5;
        this.d = a1Var;
        this.f3100b = z10;
        this.f3101c = z11;
        this.f3102e = bitmapArr;
        this.f3103f = countDownLatch;
    }
}
