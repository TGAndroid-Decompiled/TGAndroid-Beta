package og;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import bi.we;
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
import org.telegram.messenger.vk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hl0;
import org.telegram.ui.l71;
import zh.i5;
import zh.v5;
public final class p0 implements Runnable {
    public final int f14446a;
    public final boolean f14447b;
    public final boolean f14448c;
    public final Object d;
    public final Object e;
    public final Object f14449f;

    public p0(int i10, Object obj, Object obj2, Object obj3, boolean z10, boolean z11) {
        this.f14446a = i10;
        this.d = obj;
        this.e = obj2;
        this.f14447b = z10;
        this.f14448c = z11;
        this.f14449f = obj3;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        boolean z10;
        int i10 = this.f14446a;
        boolean z11 = this.f14448c;
        boolean z12 = this.f14447b;
        Object obj = this.f14449f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                Runnable runnable = (Runnable) obj;
                ((v0) obj3).l((w0) obj2, z12, z11);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                v0 v0Var = ((f1) obj3).f14363y.f14390c;
                tv0 tv0Var = v0Var.f14516g;
                u0 h = v0Var.h(new RectF(0.0f, 0.0f, tv0Var.f27499a, tv0Var.f27500b), false, z12, z11);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f14497b;
                }
                countDownLatch.countDown();
                return;
            case 2:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z12, z11);
                return;
            case 3:
                final l71 l71Var = (l71) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(l71Var.V).getReactionsMap();
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList3 = new ArrayList();
                HashMap hashMap = new HashMap();
                ArrayList arrayList4 = new ArrayList();
                hl0 hl0Var = new hl0(l71Var, str, this.f14447b, arrayList, reactionsMap, arrayList2, linkedHashSet, linkedHashSet2, arrayList4, arrayList3, this.f14448c);
                int i11 = l71Var.W;
                if (i11 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable2 = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(l71Var.V).getEmojiSuggestions(l71.a2, str, false, new fz0(2, linkedHashSet2, runnable2), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(l71Var.V).getAnimatedEmojiByKeywords(str, new v51(linkedHashSet2, runnable2, 0));
                                    return;
                            }
                        }
                    }, hl0Var);
                    return;
                } else if (i11 == 14) {
                    if (fullyConsistsOfEmojis) {
                        callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj4) {
                                ArrayList arrayList5;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable2 = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(l71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i12 = 0; i12 < availableEffects.effects.size(); i12++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i12);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList5 = arrayList2;
                                                        } else {
                                                            arrayList5 = arrayList;
                                                        }
                                                        arrayList5.add(yg.p0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        return;
                                    default:
                                        l71 l71Var2 = l71Var;
                                        MediaDataController.getInstance(l71Var2.V).getEmojiSuggestions(l71.a2, str, false, new a1.d(l71Var2, arrayList2, arrayList, (Runnable) obj4, 15), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    } else {
                        callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj4) {
                                ArrayList arrayList5;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable2 = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(l71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i12 = 0; i12 < availableEffects.effects.size(); i12++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i12);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList5 = arrayList2;
                                                        } else {
                                                            arrayList5 = arrayList;
                                                        }
                                                        arrayList5.add(yg.p0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        return;
                                    default:
                                        l71 l71Var2 = l71Var;
                                        MediaDataController.getInstance(l71Var2.V).getEmojiSuggestions(l71.a2, str, false, new a1.d(l71Var2, arrayList2, arrayList, (Runnable) obj4, 15), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, hl0Var);
                    return;
                } else {
                    Utilities.doCallbacks(new we(fullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable2 = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(l71Var.V).getEmojiSuggestions(l71.a2, str, false, new fz0(2, linkedHashSet, runnable2), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(l71Var.V).getAnimatedEmojiByKeywords(str, new v51(linkedHashSet, runnable2, 0));
                                    return;
                            }
                        }
                    }, new gg.u1(l71Var, strArr, str, linkedHashSet, 9), new vk(l71Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList), new gg.u1(l71Var, str, arrayList3, hashMap, 10), new org.telegram.ui.z(l71Var, str, arrayList4, 8), hl0Var);
                    return;
                }
            case 4:
                i5 i5Var = (i5) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = i5Var.f48499a;
                SharedPreferences sharedPreferences = i5Var.f48507l;
                if (z12) {
                    i5Var.f48513r = false;
                } else {
                    i5Var.f48512q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i12).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        i5Var.f48516u = tL_stories_allStories.count;
                        i5Var.f48511p = tL_stories_allStories.has_more;
                        i5Var.f48510o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", i5Var.f48510o).putBoolean("last_stories_has_more", i5Var.f48511p).putInt("total_stores", i5Var.f48516u).apply();
                    } else {
                        i5Var.v = tL_stories_allStories.count;
                        i5Var.f48520z = tL_stories_allStories.has_more;
                        i5Var.f48519y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", i5Var.f48519y).putBoolean("last_stories_has_more_hidden", i5Var.f48520z).putInt("total_stores_hidden", i5Var.v).apply();
                    }
                    i5Var.Y(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        i5Var.f48511p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        i5Var.f48510o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", i5Var.f48510o).apply();
                    } else {
                        i5Var.f48520z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        i5Var.f48519y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", i5Var.f48519y).apply();
                    }
                    if (z12) {
                        z10 = i5Var.f48520z;
                    } else {
                        z10 = i5Var.f48511p;
                    }
                    if (z10) {
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                v5 v5Var = (v5) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                int i13 = v5Var.f48989a;
                MessagesStorage messagesStorage = v5Var.f48990b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList5.get(i14);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList6 = peerStories.stories;
                        for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                            if (arrayList6.get(i15) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f7 = v5Var.f(arrayList6.get(i15).f17435id, peerDialogId);
                                if (f7 instanceof TL_stories.TL_storyItem) {
                                    arrayList6.set(i15, f7);
                                }
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (!z12) {
                    try {
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList7 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(longValue));
                                if (user == null) {
                                    user = MessagesStorage.getInstance(i13).getUser(longValue);
                                }
                                if (user == null || (user.stories_hidden == z11 && !arrayList7.contains(Long.valueOf(longValue)))) {
                                    arrayList7.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j3 = -longValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(j3));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i13).getChat(j3);
                                }
                                if (chat == null || (chat.stories_hidden == z11 && !arrayList7.contains(Long.valueOf(longValue)))) {
                                    arrayList7.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList7));
                        }
                        Locale locale = Locale.US;
                        String join = TextUtils.join(",", arrayList7);
                        database.executeFast("DELETE FROM stories WHERE dialog_id IN(" + join + ")").stepThis().dispose();
                    } catch (Throwable th2) {
                        messagesStorage.checkSQLException(th2);
                    }
                }
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList5.get(i16);
                    v5Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(d1Var);
                return;
        }
    }

    public p0(f1 f1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f14446a = 1;
        this.d = f1Var;
        this.f14447b = z10;
        this.f14448c = z11;
        this.e = bitmapArr;
        this.f14449f = countDownLatch;
    }

    public p0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f14446a = 2;
        this.d = profileActivity;
        this.e = user;
        this.f14449f = str;
        this.f14447b = z10;
        this.f14448c = z11;
    }

    public p0(i5 i5Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f14446a = 4;
        this.d = i5Var;
        this.f14447b = z10;
        this.e = tL_stories_getAllStories;
        this.f14449f = tLObject;
        this.f14448c = z11;
    }
}
