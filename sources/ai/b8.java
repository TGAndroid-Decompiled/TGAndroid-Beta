package ai;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import ci.dd;
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
import org.telegram.messenger.mk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c71;
import org.telegram.ui.dl0;
public final class b8 implements Runnable {
    public final int f657a;
    public final boolean f658b;
    public final boolean f659c;
    public final Object d;
    public final Object f660e;
    public final Object f661f;

    public b8(l9 l9Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f657a = 0;
        this.d = l9Var;
        this.f658b = z10;
        this.f660e = tL_stories_getAllStories;
        this.f661f = tLObject;
        this.f659c = z11;
    }

    @Override
    public final void run() {
        boolean z10;
        Utilities.Callback callback;
        int i10 = this.f657a;
        boolean z11 = this.f659c;
        boolean z12 = this.f658b;
        Object obj = this.f661f;
        Object obj2 = this.f660e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                l9 l9Var = (l9) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = l9Var.f1290a;
                SharedPreferences sharedPreferences = l9Var.f1299l;
                if (z12) {
                    l9Var.f1305r = false;
                } else {
                    l9Var.f1304q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i11).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        l9Var.f1308u = tL_stories_allStories.count;
                        l9Var.f1303p = tL_stories_allStories.has_more;
                        l9Var.f1302o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", l9Var.f1302o).putBoolean("last_stories_has_more", l9Var.f1303p).putInt("total_stores", l9Var.f1308u).apply();
                    } else {
                        l9Var.v = tL_stories_allStories.count;
                        l9Var.f1312z = tL_stories_allStories.has_more;
                        l9Var.f1311y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", l9Var.f1311y).putBoolean("last_stories_has_more_hidden", l9Var.f1312z).putInt("total_stores_hidden", l9Var.v).apply();
                    }
                    l9Var.Y(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        l9Var.f1303p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        l9Var.f1302o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", l9Var.f1302o).apply();
                    } else {
                        l9Var.f1312z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        l9Var.f1311y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", l9Var.f1311y).apply();
                    }
                    if (z12) {
                        z10 = l9Var.f1312z;
                    } else {
                        z10 = l9Var.f1303p;
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
                y9 y9Var = (y9) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                f fVar = (f) obj;
                int i12 = y9Var.f1915a;
                MessagesStorage messagesStorage = y9Var.f1916b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i13);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f7 = y9Var.f(arrayList2.get(i14).f20279id, peerDialogId);
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
                    y9Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(fVar);
                return;
            case 2:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z12, z11);
                return;
            case 3:
                final c71 c71Var = (c71) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(c71Var.V).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                ArrayList arrayList7 = new ArrayList();
                dl0 dl0Var = new dl0(c71Var, str, this.f658b, arrayList4, reactionsMap, arrayList5, linkedHashSet, linkedHashSet2, arrayList7, arrayList6, this.f659c);
                int i16 = c71Var.W;
                if (i16 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(c71Var.V).getEmojiSuggestions(c71.a2, str, false, new fs0(9, linkedHashSet2, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(c71Var.V).getAnimatedEmojiByKeywords(str, new m51(linkedHashSet2, runnable, 0));
                                    return;
                            }
                        }
                    }, dl0Var);
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
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(c71Var.V).getAvailableEffects();
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
                                                        arrayList8.add(zg.o0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        c71 c71Var2 = c71Var;
                                        MediaDataController.getInstance(c71Var2.V).getEmojiSuggestions(c71.a2, str, false, new a1.d(c71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
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
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(c71Var.V).getAvailableEffects();
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
                                                        arrayList8.add(zg.o0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        c71 c71Var2 = c71Var;
                                        MediaDataController.getInstance(c71Var2.V).getEmojiSuggestions(c71.a2, str, false, new a1.d(c71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, dl0Var);
                    return;
                } else {
                    Utilities.doCallbacks(new dd(fullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(c71Var.V).getEmojiSuggestions(c71.a2, str, false, new fs0(9, linkedHashSet, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(c71Var.V).getAnimatedEmojiByKeywords(str, new m51(linkedHashSet, runnable, 0));
                                    return;
                            }
                        }
                    }, new e4(c71Var, strArr, str, linkedHashSet, 12), new mk(c71Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new e4((Object) c71Var, str, arrayList6, (Object) hashMap, 13), new org.telegram.ui.z(c71Var, str, arrayList7, 12), dl0Var);
                    return;
                }
            case 4:
                Runnable runnable = (Runnable) obj;
                ((pg.s0) obj3).l((pg.t0) obj2, z12, z11);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                pg.s0 s0Var = ((pg.d1) obj3).f44458y.f44486c;
                fw0 fw0Var = s0Var.f44595g;
                n7.z0 h = s0Var.h(new RectF(0.0f, 0.0f, fw0Var.f26590a, fw0Var.f26591b), false, z12, z11);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f16851b;
                }
                countDownLatch.countDown();
                return;
        }
    }

    public b8(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f657a = i10;
        this.d = obj;
        this.f660e = obj2;
        this.f658b = z10;
        this.f659c = z11;
        this.f661f = obj3;
    }

    public b8(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f657a = 2;
        this.d = profileActivity;
        this.f660e = user;
        this.f661f = str;
        this.f658b = z10;
        this.f659c = z11;
    }

    public b8(pg.d1 d1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f657a = 5;
        this.d = d1Var;
        this.f658b = z10;
        this.f659c = z11;
        this.f660e = bitmapArr;
        this.f661f = countDownLatch;
    }
}
