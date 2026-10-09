package ai;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import ci.ed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
import org.telegram.messenger.jk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k71;
public final class c8 implements Runnable {
    public final int f780a;
    public final boolean f781b;
    public final boolean f782c;
    public final Object d;
    public final Object f783e;
    public final Object f784f;

    public c8(m9 m9Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f780a = 0;
        this.d = m9Var;
        this.f781b = z10;
        this.f783e = tL_stories_getAllStories;
        this.f784f = tLObject;
        this.f782c = z11;
    }

    @Override
    public final void run() {
        boolean z10;
        Utilities.Callback callback;
        int i10 = this.f780a;
        boolean z11 = this.f782c;
        boolean z12 = this.f781b;
        Object obj = this.f784f;
        Object obj2 = this.f783e;
        Object obj3 = this.d;
        int i11 = 0;
        switch (i10) {
            case 0:
                m9 m9Var = (m9) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = m9Var.f1406a;
                SharedPreferences sharedPreferences = m9Var.f1415l;
                if (z12) {
                    m9Var.f1421r = false;
                } else {
                    m9Var.f1420q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i12).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        m9Var.f1424u = tL_stories_allStories.count;
                        m9Var.f1419p = tL_stories_allStories.has_more;
                        m9Var.f1418o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", m9Var.f1418o).putBoolean("last_stories_has_more", m9Var.f1419p).putInt("total_stores", m9Var.f1424u).apply();
                    } else {
                        m9Var.v = tL_stories_allStories.count;
                        m9Var.f1428z = tL_stories_allStories.has_more;
                        m9Var.f1427y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", m9Var.f1427y).putBoolean("last_stories_has_more_hidden", m9Var.f1428z).putInt("total_stores_hidden", m9Var.v).apply();
                    }
                    m9Var.Y(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        m9Var.f1419p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        m9Var.f1418o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", m9Var.f1418o).apply();
                    } else {
                        m9Var.f1428z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        m9Var.f1427y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", m9Var.f1427y).apply();
                    }
                    if (z12) {
                        z10 = m9Var.f1428z;
                    } else {
                        z10 = m9Var.f1419p;
                    }
                    if (z10) {
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                z9 z9Var = (z9) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                f fVar = (f) obj;
                int i13 = z9Var.f2021a;
                MessagesStorage messagesStorage = z9Var.f2022b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i14);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i15 = i11; i15 < arrayList2.size(); i15++) {
                            if (arrayList2.get(i15) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f7 = z9Var.f(arrayList2.get(i15).f20275id, peerDialogId);
                                if (f7 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i15, f7);
                                }
                            }
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    i14++;
                    i11 = 0;
                }
                if (!z12) {
                    try {
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(longValue));
                                if (user == null) {
                                    user = MessagesStorage.getInstance(i13).getUser(longValue);
                                }
                                if (user == null || (user.stories_hidden == z11 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j3 = -longValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(j3));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i13).getChat(j3);
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
                        database.executeFast("DELETE FROM stories WHERE dialog_id IN(" + TextUtils.join(",", arrayList3) + ")").stepThis().dispose();
                    } catch (Throwable th2) {
                        messagesStorage.checkSQLException(th2);
                    }
                }
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i16);
                    z9Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(fVar);
                return;
            case 2:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z12, z11);
                return;
            case 3:
                final k71 k71Var = (k71) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(k71Var.V).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                final ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                final ArrayList arrayList7 = new ArrayList();
                final boolean z13 = this.f781b;
                final boolean z14 = this.f782c;
                Utilities.Callback callback2 = new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        Runnable runnable = (Runnable) obj4;
                        final k71 k71Var2 = k71.this;
                        final String str2 = str;
                        final boolean z15 = z13;
                        final ArrayList arrayList8 = arrayList4;
                        final HashMap hashMap2 = reactionsMap;
                        final ArrayList arrayList9 = arrayList5;
                        final LinkedHashSet linkedHashSet3 = linkedHashSet;
                        final LinkedHashSet linkedHashSet4 = linkedHashSet2;
                        final ArrayList arrayList10 = arrayList7;
                        final ArrayList arrayList11 = arrayList6;
                        final boolean z16 = z14;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                k71 k71Var3 = k71.this;
                                m51 m51Var = k71Var3.I1;
                                if (m51Var != null) {
                                    AndroidUtilities.cancelRunOnUIThread(m51Var);
                                    k71Var3.I1 = null;
                                }
                                String str3 = k71Var3.f39171z1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                k71Var3.f39169y1 = true;
                                k71Var3.z(true, z15);
                                b61 b61Var = k71Var3.f39126f0;
                                if (b61Var != null) {
                                    b61Var.d(true);
                                }
                                ArrayList arrayList12 = k71Var3.A1;
                                if (arrayList12 == null) {
                                    k71Var3.A1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                ArrayList arrayList13 = k71Var3.D1;
                                if (arrayList13 == null) {
                                    k71Var3.D1 = new ArrayList();
                                } else {
                                    arrayList13.clear();
                                }
                                ArrayList arrayList14 = k71Var3.C1;
                                if (arrayList14 == null) {
                                    k71Var3.C1 = new ArrayList();
                                } else {
                                    arrayList14.clear();
                                }
                                ArrayList arrayList15 = k71Var3.B1;
                                if (arrayList15 == null) {
                                    k71Var3.B1 = new ArrayList();
                                } else {
                                    arrayList15.clear();
                                }
                                int i17 = 0;
                                k71Var3.f39132i0.u0(0);
                                int i18 = k71Var3.W;
                                if (i18 == 1 || i18 == 14 || i18 == 11 || i18 == 2) {
                                    ArrayList arrayList16 = arrayList8;
                                    if (!arrayList16.isEmpty()) {
                                        k71Var3.A1.addAll(arrayList16);
                                    } else {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap2.get(str4);
                                        if (tL_availableReaction != null) {
                                            k71Var3.A1.add(zg.n0.c(tL_availableReaction));
                                        }
                                    }
                                    ArrayList arrayList17 = arrayList9;
                                    if (!arrayList17.isEmpty()) {
                                        k71Var3.B1.addAll(arrayList17);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l4 = (Long) it.next();
                                    l4.getClass();
                                    ArrayList arrayList18 = k71Var3.A1;
                                    ?? obj5 = new Object();
                                    long longValue2 = l4.longValue();
                                    obj5.f54616g = longValue2;
                                    obj5.h = longValue2;
                                    arrayList18.add(obj5);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    k71Var3.A1.add(zg.n0.b((String) it2.next()));
                                }
                                k71Var3.D1.addAll(arrayList10);
                                ArrayList arrayList19 = arrayList11;
                                int size = arrayList19.size();
                                while (i17 < size) {
                                    Object obj6 = arrayList19.get(i17);
                                    i17++;
                                    k71Var3.C1.addAll((ArrayList) obj6);
                                }
                                k71Var3.f39147q0.E(true ^ z16);
                            }
                        });
                    }
                };
                int i17 = k71Var.W;
                if (i17 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(k71Var.V).getEmojiSuggestions(k71.a2, str, false, new ls0(8, linkedHashSet2, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(k71Var.V).getAnimatedEmojiByKeywords(str, new t51(linkedHashSet2, runnable, 0));
                                    return;
                            }
                        }
                    }, callback2);
                    return;
                } else if (i17 == 14) {
                    if (fullyConsistsOfEmojis) {
                        callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(k71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i18 = 0; i18 < availableEffects.effects.size(); i18++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i18);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(zg.n0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        k71 k71Var2 = k71Var;
                                        MediaDataController.getInstance(k71Var2.V).getEmojiSuggestions(k71.a2, str, false, new a1.d(k71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
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
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(k71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i18 = 0; i18 < availableEffects.effects.size(); i18++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i18);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(zg.n0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        k71 k71Var2 = k71Var;
                                        MediaDataController.getInstance(k71Var2.V).getEmojiSuggestions(k71.a2, str, false, new a1.d(k71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, callback2);
                    return;
                } else {
                    Utilities.doCallbacks(new ed(fullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(k71Var.V).getEmojiSuggestions(k71.a2, str, false, new ls0(8, linkedHashSet, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(k71Var.V).getAnimatedEmojiByKeywords(str, new t51(linkedHashSet, runnable, 0));
                                    return;
                            }
                        }
                    }, new f4(k71Var, strArr, str, linkedHashSet, 12), new jk(k71Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new f4((Object) k71Var, str, arrayList6, (Object) hashMap, 13), new org.telegram.ui.z(k71Var, str, arrayList7, 12), callback2);
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
                pg.s0 s0Var = ((pg.c1) obj3).f45606y.f45633c;
                mw0 mw0Var = s0Var.f45758g;
                n6.t h = s0Var.h(new RectF(0.0f, 0.0f, mw0Var.f28963a, mw0Var.f28964b), false, z12, z11);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f16717b;
                }
                countDownLatch.countDown();
                return;
        }
    }

    public c8(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f780a = i10;
        this.d = obj;
        this.f783e = obj2;
        this.f781b = z10;
        this.f782c = z11;
        this.f784f = obj3;
    }

    public c8(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f780a = 2;
        this.d = profileActivity;
        this.f783e = user;
        this.f784f = str;
        this.f781b = z10;
        this.f782c = z11;
    }

    public c8(pg.c1 c1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f780a = 5;
        this.d = c1Var;
        this.f781b = z10;
        this.f782c = z11;
        this.f783e = bitmapArr;
        this.f784f = countDownLatch;
    }
}
