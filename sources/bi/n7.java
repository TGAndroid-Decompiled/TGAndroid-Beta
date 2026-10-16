package bi;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import di.cd;
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
import org.telegram.messenger.mk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r71;
public final class n7 implements Runnable {
    public final int f3383a;
    public final boolean f3384b;
    public final boolean f3385c;
    public final Object d;
    public final Object e;
    public final Object f3386f;

    public n7(x8 x8Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f3383a = 0;
        this.d = x8Var;
        this.f3384b = z10;
        this.e = tL_stories_getAllStories;
        this.f3386f = tLObject;
        this.f3385c = z11;
    }

    @Override
    public final void run() {
        boolean z10;
        int[] iArr;
        Utilities.Callback callback;
        int i10 = this.f3383a;
        boolean z11 = this.f3385c;
        boolean z12 = this.f3384b;
        Object obj = this.f3386f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        int i11 = 0;
        switch (i10) {
            case 0:
                x8 x8Var = (x8) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = x8Var.f3966a;
                SharedPreferences sharedPreferences = x8Var.f3974l;
                if (z12) {
                    x8Var.f3980r = false;
                } else {
                    x8Var.f3979q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i12).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        x8Var.f3983u = tL_stories_allStories.count;
                        x8Var.f3978p = tL_stories_allStories.has_more;
                        x8Var.f3977o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", x8Var.f3977o).putBoolean("last_stories_has_more", x8Var.f3978p).putInt("total_stores", x8Var.f3983u).apply();
                    } else {
                        x8Var.v = tL_stories_allStories.count;
                        x8Var.f3987z = tL_stories_allStories.has_more;
                        x8Var.f3986y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", x8Var.f3986y).putBoolean("last_stories_has_more_hidden", x8Var.f3987z).putInt("total_stores_hidden", x8Var.v).apply();
                    }
                    x8Var.Y(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        x8Var.f3978p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        x8Var.f3977o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", x8Var.f3977o).apply();
                    } else {
                        x8Var.f3987z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        x8Var.f3986y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", x8Var.f3986y).apply();
                    }
                    if (z12) {
                        z10 = x8Var.f3987z;
                    } else {
                        z10 = x8Var.f3978p;
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
                k9 k9Var = (k9) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ah.j jVar = (ah.j) obj;
                int i13 = k9Var.f3255a;
                MessagesStorage messagesStorage = k9Var.f3256b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i14);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i15 = i11; i15 < arrayList2.size(); i15++) {
                            if (arrayList2.get(i15) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f7 = k9Var.f(arrayList2.get(i15).f19151id, peerDialogId);
                                if (f7 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i15, f7);
                                }
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
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
                                long j10 = -longValue;
                                TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(j10));
                                if (chat == null) {
                                    chat = MessagesStorage.getInstance(i13).getChat(j10);
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
                    k9Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(jVar);
                return;
            case 2:
                m4.v vVar = (m4.v) obj;
                m4.e0 e0Var = ((m4.p0) ((m.f3) obj3).d).f15303g;
                m4.m1 m1Var = e0Var.f15170t;
                w7.v.b(m1Var, (m4.w) obj2);
                int d = m1Var.d();
                if (z12) {
                    if (d == 1) {
                        if (m1Var.o0(2)) {
                            m1Var.b();
                        }
                    } else if (d == 4 && m1Var.o0(4)) {
                        m1Var.G();
                    }
                }
                if (z11 && m1Var.o0(1)) {
                    m1Var.i();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i17 : new int[]{31, 2}) {
                    v7.u6.p(!false);
                    sparseBooleanArray.append(i17, true);
                }
                if (z11) {
                    v7.u6.p(!false);
                    sparseBooleanArray.append(1, true);
                }
                v7.u6.p(!false);
                e0Var.p(vVar);
                return;
            case 3:
                ProfileActivity.m0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z12, z11);
                return;
            case 4:
                final r71 r71Var = (r71) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(r71Var.V).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                final ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                final ArrayList arrayList7 = new ArrayList();
                final boolean z13 = this.f3384b;
                final boolean z14 = this.f3385c;
                Utilities.Callback callback2 = new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        Runnable runnable = (Runnable) obj4;
                        final r71 r71Var2 = r71.this;
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
                                r71 r71Var3 = r71.this;
                                t51 t51Var = r71Var3.I1;
                                if (t51Var != null) {
                                    AndroidUtilities.cancelRunOnUIThread(t51Var);
                                    r71Var3.I1 = null;
                                }
                                String str3 = r71Var3.f39371z1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                r71Var3.f39369y1 = true;
                                r71Var3.z(true, z15);
                                i61 i61Var = r71Var3.f39326f0;
                                if (i61Var != null) {
                                    i61Var.e(true);
                                }
                                ArrayList arrayList12 = r71Var3.A1;
                                if (arrayList12 == null) {
                                    r71Var3.A1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                ArrayList arrayList13 = r71Var3.D1;
                                if (arrayList13 == null) {
                                    r71Var3.D1 = new ArrayList();
                                } else {
                                    arrayList13.clear();
                                }
                                ArrayList arrayList14 = r71Var3.C1;
                                if (arrayList14 == null) {
                                    r71Var3.C1 = new ArrayList();
                                } else {
                                    arrayList14.clear();
                                }
                                ArrayList arrayList15 = r71Var3.B1;
                                if (arrayList15 == null) {
                                    r71Var3.B1 = new ArrayList();
                                } else {
                                    arrayList15.clear();
                                }
                                int i18 = 0;
                                r71Var3.f39332i0.u0(0);
                                int i19 = r71Var3.W;
                                if (i19 == 1 || i19 == 14 || i19 == 11 || i19 == 2) {
                                    ArrayList arrayList16 = arrayList8;
                                    if (!arrayList16.isEmpty()) {
                                        r71Var3.A1.addAll(arrayList16);
                                    } else {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap2.get(str4);
                                        if (tL_availableReaction != null) {
                                            r71Var3.A1.add(ah.i1.c(tL_availableReaction));
                                        }
                                    }
                                    ArrayList arrayList17 = arrayList9;
                                    if (!arrayList17.isEmpty()) {
                                        r71Var3.B1.addAll(arrayList17);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l4 = (Long) it.next();
                                    l4.getClass();
                                    ArrayList arrayList18 = r71Var3.A1;
                                    ?? obj5 = new Object();
                                    long longValue2 = l4.longValue();
                                    obj5.f784g = longValue2;
                                    obj5.h = longValue2;
                                    arrayList18.add(obj5);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    r71Var3.A1.add(ah.i1.b((String) it2.next()));
                                }
                                r71Var3.D1.addAll(arrayList10);
                                ArrayList arrayList19 = arrayList11;
                                int size = arrayList19.size();
                                while (i18 < size) {
                                    Object obj6 = arrayList19.get(i18);
                                    i18++;
                                    r71Var3.C1.addAll((ArrayList) obj6);
                                }
                                r71Var3.f39347q0.E(true ^ z16);
                            }
                        });
                    }
                };
                int i18 = r71Var.W;
                if (i18 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(r71Var.V).getEmojiSuggestions(r71.a2, str, false, new bs0(10, linkedHashSet2, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(r71Var.V).getAnimatedEmojiByKeywords(str, new a61(linkedHashSet2, runnable, 0));
                                    return;
                            }
                        }
                    }, callback2);
                    return;
                } else if (i18 == 14) {
                    if (fullyConsistsOfEmojis) {
                        callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(r71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i19 = 0; i19 < availableEffects.effects.size(); i19++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i19);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(ah.i1.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        r71 r71Var2 = r71Var;
                                        MediaDataController.getInstance(r71Var2.V).getEmojiSuggestions(r71.a2, str, false, new a1.d(r71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
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
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(r71Var.V).getAvailableEffects();
                                        if (availableEffects != null) {
                                            for (int i19 = 0; i19 < availableEffects.effects.size(); i19++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i19);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(ah.i1.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        r71 r71Var2 = r71Var;
                                        MediaDataController.getInstance(r71Var2.V).getEmojiSuggestions(r71.a2, str, false, new a1.d(r71Var2, arrayList5, arrayList4, (Runnable) obj4, 15), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, callback2);
                    return;
                } else {
                    Utilities.doCallbacks(new cd(fullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(r71Var.V).getEmojiSuggestions(r71.a2, str, false, new bs0(10, linkedHashSet, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(r71Var.V).getAnimatedEmojiByKeywords(str, new a61(linkedHashSet, runnable, 0));
                                    return;
                            }
                        }
                    }, new u3(r71Var, strArr, str, linkedHashSet, 12), new mk(r71Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new u3((Object) r71Var, str, arrayList6, (Object) hashMap, 13), new org.telegram.ui.z(r71Var, str, arrayList7, 12), callback2);
                    return;
                }
            case 5:
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
                qg.q0 q0Var = ((qg.a1) obj3).f43131y.f43141c;
                iw0 iw0Var = q0Var.f43267g;
                m2.t h = q0Var.h(new RectF(0.0f, 0.0f, iw0Var.f25809a, iw0Var.f25810b), false, z12, z11);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f15110b;
                }
                countDownLatch.countDown();
                return;
        }
    }

    public n7(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f3383a = i10;
        this.d = obj;
        this.e = obj2;
        this.f3384b = z10;
        this.f3385c = z11;
        this.f3386f = obj3;
    }

    public n7(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f3383a = 3;
        this.d = profileActivity;
        this.e = user;
        this.f3386f = str;
        this.f3384b = z10;
        this.f3385c = z11;
    }

    public n7(qg.a1 a1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f3383a = 6;
        this.d = a1Var;
        this.f3384b = z10;
        this.f3385c = z11;
        this.e = bitmapArr;
        this.f3386f = countDownLatch;
    }
}
