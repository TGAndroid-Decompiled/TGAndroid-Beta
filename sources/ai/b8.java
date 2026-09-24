package ai;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import ci.ed;
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
import org.telegram.messenger.lk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a71;
import org.telegram.ui.zk0;
public final class b8 implements Runnable {
    public final int f606a;
    public final boolean f607b;
    public final boolean f608c;
    public final Object d;
    public final Object e;
    public final Object f609f;

    public b8(l9 l9Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f606a = 0;
        this.d = l9Var;
        this.f607b = z10;
        this.e = tL_stories_getAllStories;
        this.f609f = tLObject;
        this.f608c = z11;
    }

    @Override
    public final void run() {
        boolean z10;
        Utilities.Callback callback;
        int i10 = this.f606a;
        boolean z11 = this.f608c;
        boolean z12 = this.f607b;
        Object obj = this.f609f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                l9 l9Var = (l9) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = l9Var.f1192a;
                SharedPreferences sharedPreferences = l9Var.f1200l;
                if (z12) {
                    l9Var.f1206r = false;
                } else {
                    l9Var.f1205q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i11).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        l9Var.f1209u = tL_stories_allStories.count;
                        l9Var.f1204p = tL_stories_allStories.has_more;
                        l9Var.f1203o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", l9Var.f1203o).putBoolean("last_stories_has_more", l9Var.f1204p).putInt("total_stores", l9Var.f1209u).apply();
                    } else {
                        l9Var.v = tL_stories_allStories.count;
                        l9Var.f1213z = tL_stories_allStories.has_more;
                        l9Var.f1212y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", l9Var.f1212y).putBoolean("last_stories_has_more_hidden", l9Var.f1213z).putInt("total_stores_hidden", l9Var.v).apply();
                    }
                    l9Var.Y(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        l9Var.f1204p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        l9Var.f1203o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", l9Var.f1203o).apply();
                    } else {
                        l9Var.f1213z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        l9Var.f1212y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", l9Var.f1212y).apply();
                    }
                    if (z12) {
                        z10 = l9Var.f1213z;
                    } else {
                        z10 = l9Var.f1204p;
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
                int i12 = y9Var.f1761a;
                MessagesStorage messagesStorage = y9Var.f1762b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i13);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f7 = y9Var.f(arrayList2.get(i14).f18556id, peerDialogId);
                                if (f7 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i14, f7);
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
                final a71 a71Var = (a71) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(a71Var.V).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                ArrayList arrayList7 = new ArrayList();
                zk0 zk0Var = new zk0(a71Var, str, this.f607b, arrayList4, reactionsMap, arrayList5, linkedHashSet, linkedHashSet2, arrayList7, arrayList6, this.f608c);
                int i16 = a71Var.W;
                if (i16 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(a71Var.V).getEmojiSuggestions(a71.a2, str, false, new ds0(8, linkedHashSet2, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(a71Var.V).getAnimatedEmojiByKeywords(str, new j51(linkedHashSet2, runnable, 0));
                                    return;
                            }
                        }
                    }, zk0Var);
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
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(a71Var.V).getAvailableEffects();
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
                                        a71 a71Var2 = a71Var;
                                        MediaDataController.getInstance(a71Var2.V).getEmojiSuggestions(a71.a2, str, false, new a1.d(a71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
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
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(a71Var.V).getAvailableEffects();
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
                                        a71 a71Var2 = a71Var;
                                        MediaDataController.getInstance(a71Var2.V).getEmojiSuggestions(a71.a2, str, false, new a1.d(a71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, zk0Var);
                    return;
                } else {
                    Utilities.doCallbacks(new ed(fullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(a71Var.V).getEmojiSuggestions(a71.a2, str, false, new ds0(8, linkedHashSet, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(a71Var.V).getAnimatedEmojiByKeywords(str, new j51(linkedHashSet, runnable, 0));
                                    return;
                            }
                        }
                    }, new e4(a71Var, strArr, str, linkedHashSet, 12), new lk(a71Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new e4((Object) a71Var, str, arrayList6, (Object) hashMap, 13), new org.telegram.ui.z(a71Var, str, arrayList7, 12), zk0Var);
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
                pg.s0 s0Var = ((pg.d1) obj3).f41084y.f41111c;
                uv0 uv0Var = s0Var.f41211g;
                n7.z0 h = s0Var.h(new RectF(0.0f, 0.0f, uv0Var.f28926a, uv0Var.f28927b), false, z12, z11);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f15395b;
                }
                countDownLatch.countDown();
                return;
        }
    }

    public b8(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f606a = i10;
        this.d = obj;
        this.e = obj2;
        this.f607b = z10;
        this.f608c = z11;
        this.f609f = obj3;
    }

    public b8(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f606a = 2;
        this.d = profileActivity;
        this.e = user;
        this.f609f = str;
        this.f607b = z10;
        this.f608c = z11;
    }

    public b8(pg.d1 d1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f606a = 5;
        this.d = d1Var;
        this.f607b = z10;
        this.f608c = z11;
        this.e = bitmapArr;
        this.f609f = countDownLatch;
    }
}
