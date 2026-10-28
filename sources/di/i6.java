package di;

import a8.ie;
import a8.yb;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import fi.kc;
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
import org.telegram.messenger.lk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f61;
public final class i6 implements Runnable {
    public final int f8680a;
    public final boolean f8681b;
    public final boolean f8682c;
    public final Object d;
    public final Object e;
    public final Object f8683f;

    public i6(h7 h7Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f8680a = 0;
        this.d = h7Var;
        this.f8681b = z10;
        this.e = tL_stories_getAllStories;
        this.f8683f = tLObject;
        this.f8682c = z11;
    }

    @Override
    public final void run() {
        boolean z10;
        int[] iArr;
        Utilities.Callback callback;
        int i10 = this.f8680a;
        boolean z11 = this.f8682c;
        boolean z12 = this.f8681b;
        Object obj = this.f8683f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        int i11 = 0;
        switch (i10) {
            case 0:
                h7 h7Var = (h7) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = h7Var.f8629a;
                SharedPreferences sharedPreferences = h7Var.f8637l;
                if (z12) {
                    h7Var.f8643r = false;
                } else {
                    h7Var.f8642q = false;
                }
                FileLog.d("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    MessagesStorage.getInstance(i12).putUsersAndChats(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        h7Var.f8646u = tL_stories_allStories.count;
                        h7Var.f8641p = tL_stories_allStories.has_more;
                        h7Var.f8640o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", h7Var.f8640o).putBoolean("last_stories_has_more", h7Var.f8641p).putInt("total_stores", h7Var.f8646u).apply();
                    } else {
                        h7Var.v = tL_stories_allStories.count;
                        h7Var.f8650z = tL_stories_allStories.has_more;
                        h7Var.f8649y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", h7Var.f8649y).putBoolean("last_stories_has_more_hidden", h7Var.f8650z).putInt("total_stores_hidden", h7Var.v).apply();
                    }
                    h7Var.b0(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        h7Var.f8641p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        h7Var.f8640o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", h7Var.f8640o).apply();
                    } else {
                        h7Var.f8650z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        h7Var.f8649y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", h7Var.f8649y).apply();
                    }
                    if (z12) {
                        z10 = h7Var.f8650z;
                    } else {
                        z10 = h7Var.f8641p;
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
                u7 u7Var = (u7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ag.c cVar = (ag.c) obj;
                int i13 = u7Var.f9233a;
                MessagesStorage messagesStorage = u7Var.f9234b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i14);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i15 = i11; i15 < arrayList2.size(); i15++) {
                            if (arrayList2.get(i15) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f7 = u7Var.f(arrayList2.get(i15).f22267id, peerDialogId);
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
                    u7Var.g(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2);
                }
                AndroidUtilities.runOnUIThread(cVar);
                return;
            case 2:
                m4.w wVar = (m4.w) obj;
                m4.f0 f0Var = ((m4.p0) ((m.d3) obj3).d).f18180g;
                m4.n1 n1Var = f0Var.f18056t;
                ie.b(n1Var, (m4.x) obj2);
                int d = n1Var.d();
                if (z12) {
                    if (d == 1) {
                        if (n1Var.o0(2)) {
                            n1Var.a();
                        }
                    } else if (d == 4 && n1Var.o0(4)) {
                        n1Var.G();
                    }
                }
                if (z11 && n1Var.o0(1)) {
                    n1Var.i();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i17 : new int[]{31, 2}) {
                    yb.p(!false);
                    sparseBooleanArray.append(i17, true);
                }
                if (z11) {
                    yb.p(!false);
                    sparseBooleanArray.append(1, true);
                }
                yb.p(!false);
                f0Var.p(wVar);
                return;
            case 3:
                ProfileActivity.h0((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z12, z11);
                return;
            case 4:
                final f61 f61Var = (f61) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap<String, TLRPC.TL_availableReaction> reactionsMap = MediaDataController.getInstance(f61Var.V).getReactionsMap();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean fullyConsistsOfEmojis = Emoji.fullyConsistsOfEmojis(str);
                final ArrayList arrayList6 = new ArrayList();
                HashMap hashMap = new HashMap();
                final ArrayList arrayList7 = new ArrayList();
                final boolean z13 = this.f8681b;
                final boolean z14 = this.f8682c;
                Utilities.Callback callback2 = new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        Runnable runnable = (Runnable) obj4;
                        final f61 f61Var2 = f61.this;
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
                                f61 f61Var3 = f61.this;
                                h41 h41Var = f61Var3.J1;
                                if (h41Var != null) {
                                    AndroidUtilities.cancelRunOnUIThread(h41Var);
                                    f61Var3.J1 = null;
                                }
                                String str3 = f61Var3.A1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                f61Var3.f39243z1 = true;
                                f61Var3.z(true, z15);
                                w41 w41Var = f61Var3.f39198f0;
                                if (w41Var != null) {
                                    w41Var.d(true);
                                }
                                ArrayList arrayList12 = f61Var3.B1;
                                if (arrayList12 == null) {
                                    f61Var3.B1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                ArrayList arrayList13 = f61Var3.E1;
                                if (arrayList13 == null) {
                                    f61Var3.E1 = new ArrayList();
                                } else {
                                    arrayList13.clear();
                                }
                                ArrayList arrayList14 = f61Var3.D1;
                                if (arrayList14 == null) {
                                    f61Var3.D1 = new ArrayList();
                                } else {
                                    arrayList14.clear();
                                }
                                ArrayList arrayList15 = f61Var3.C1;
                                if (arrayList15 == null) {
                                    f61Var3.C1 = new ArrayList();
                                } else {
                                    arrayList15.clear();
                                }
                                int i18 = 0;
                                f61Var3.f39204i0.v0(0);
                                int i19 = f61Var3.W;
                                if (i19 == 1 || i19 == 14 || i19 == 11 || i19 == 2) {
                                    ArrayList arrayList16 = arrayList8;
                                    if (!arrayList16.isEmpty()) {
                                        f61Var3.B1.addAll(arrayList16);
                                    } else {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap2.get(str4);
                                        if (tL_availableReaction != null) {
                                            f61Var3.B1.add(bh.x0.c(tL_availableReaction));
                                        }
                                    }
                                    ArrayList arrayList17 = arrayList9;
                                    if (!arrayList17.isEmpty()) {
                                        f61Var3.C1.addAll(arrayList17);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l4 = (Long) it.next();
                                    l4.getClass();
                                    ArrayList arrayList18 = f61Var3.B1;
                                    ?? obj5 = new Object();
                                    long longValue2 = l4.longValue();
                                    obj5.f4209g = longValue2;
                                    obj5.h = longValue2;
                                    arrayList18.add(obj5);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    f61Var3.B1.add(bh.x0.b((String) it2.next()));
                                }
                                f61Var3.E1.addAll(arrayList10);
                                ArrayList arrayList19 = arrayList11;
                                int size = arrayList19.size();
                                while (i18 < size) {
                                    Object obj6 = arrayList19.get(i18);
                                    i18++;
                                    f61Var3.D1.addAll((ArrayList) obj6);
                                }
                                f61Var3.f39219q0.E(true ^ z16);
                            }
                        });
                    }
                };
                int i18 = f61Var.W;
                if (i18 == 13) {
                    Utilities.doCallbacks(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(f61Var.V).getEmojiSuggestions(f61.f39181b2, str, false, new cf0(18, linkedHashSet2, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(f61Var.V).getAnimatedEmojiByKeywords(str, new o41(linkedHashSet2, runnable, 0));
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
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(f61Var.V).getAvailableEffects();
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
                                                        arrayList8.add(bh.x0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        f61 f61Var2 = f61Var;
                                        MediaDataController.getInstance(f61Var2.V).getEmojiSuggestions(f61.f39181b2, str, false, new a1.d(f61Var2, arrayList5, arrayList4, (Runnable) obj4, 17), null, false, false, false, 0);
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
                                        TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(f61Var.V).getAvailableEffects();
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
                                                        arrayList8.add(bh.x0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        f61 f61Var2 = f61Var;
                                        MediaDataController.getInstance(f61Var2.V).getEmojiSuggestions(f61.f39181b2, str, false, new a1.d(f61Var2, arrayList5, arrayList4, (Runnable) obj4, 17), null, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.doCallbacks(callback, callback2);
                    return;
                } else {
                    Utilities.doCallbacks(new kc(fullyConsistsOfEmojis, str, linkedHashSet, 4), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj4) {
                            Runnable runnable = (Runnable) obj4;
                            switch (r4) {
                                case 0:
                                    MediaDataController.getInstance(f61Var.V).getEmojiSuggestions(f61.f39181b2, str, false, new cf0(18, linkedHashSet, runnable), null, false, false, false, 0);
                                    return;
                                default:
                                    MediaDataController.getInstance(f61Var.V).getAnimatedEmojiByKeywords(str, new o41(linkedHashSet, runnable, 0));
                                    return;
                            }
                        }
                    }, new y2(f61Var, strArr, str, linkedHashSet, 12), new lk(f61Var, fullyConsistsOfEmojis, linkedHashSet, str, reactionsMap, arrayList4), new y2((Object) f61Var, str, arrayList6, (Object) hashMap, 13), new org.telegram.ui.y(f61Var, str, arrayList7, 12), callback2);
                    return;
                }
            case 5:
                Runnable runnable = (Runnable) obj;
                ((rg.q0) obj3).l((rg.r0) obj2, z12, z11);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                rg.q0 q0Var = ((rg.a1) obj3).f47403y.f47412c;
                rw0 rw0Var = q0Var.f47542g;
                m4.w1 h = q0Var.h(new RectF(0.0f, 0.0f, rw0Var.f32392a, rw0Var.f32393b), false, z12, z11);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f18292b;
                }
                countDownLatch.countDown();
                return;
        }
    }

    public i6(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f8680a = i10;
        this.d = obj;
        this.e = obj2;
        this.f8681b = z10;
        this.f8682c = z11;
        this.f8683f = obj3;
    }

    public i6(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f8680a = 3;
        this.d = profileActivity;
        this.e = user;
        this.f8683f = str;
        this.f8681b = z10;
        this.f8682c = z11;
    }

    public i6(rg.a1 a1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f8680a = 6;
        this.d = a1Var;
        this.f8681b = z10;
        this.f8682c = z11;
        this.e = bitmapArr;
        this.f8683f = countDownLatch;
    }
}
