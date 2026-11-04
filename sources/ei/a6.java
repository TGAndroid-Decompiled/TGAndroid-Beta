package ei;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import b8.xe;
import b8.zb;
import gi.nb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g11;
import org.telegram.ui.kt0;
public final class a6 implements Runnable {
    public final int f10090a;
    public final boolean f10091b;
    public final boolean f10092c;
    public final Object d;
    public final Object f10093e;
    public final Object f10094f;

    public a6(z6 z6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f10090a = 0;
        this.d = z6Var;
        this.f10091b = z10;
        this.f10093e = tL_stories_getAllStories;
        this.f10094f = tLObject;
        this.f10092c = z11;
    }

    @Override
    public final void run() {
        boolean z10;
        int[] iArr;
        u10 u10Var;
        int i3 = this.f10090a;
        boolean z11 = this.f10092c;
        boolean z12 = this.f10091b;
        Object obj = this.f10094f;
        Object obj2 = this.f10093e;
        Object obj3 = this.d;
        int i10 = 0;
        switch (i3) {
            case 0:
                z6 z6Var = (z6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = z6Var.f11274a;
                SharedPreferences sharedPreferences = z6Var.f11283l;
                if (z12) {
                    z6Var.f11289r = false;
                } else {
                    z6Var.f11288q = false;
                }
                org.telegram.messenger.a8.b("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    qr.a0(i11).m1(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        z6Var.f11292u = tL_stories_allStories.count;
                        z6Var.f11287p = tL_stories_allStories.has_more;
                        z6Var.f11286o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", z6Var.f11286o).putBoolean("last_stories_has_more", z6Var.f11287p).putInt("total_stores", z6Var.f11292u).apply();
                    } else {
                        z6Var.v = tL_stories_allStories.count;
                        z6Var.f11296z = tL_stories_allStories.has_more;
                        z6Var.f11295y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", z6Var.f11295y).putBoolean("last_stories_has_more_hidden", z6Var.f11296z).putInt("total_stores_hidden", z6Var.v).apply();
                    }
                    z6Var.b0(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        z6Var.f11287p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        z6Var.f11286o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", z6Var.f11286o).apply();
                    } else {
                        z6Var.f11296z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        z6Var.f11295y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", z6Var.f11295y).apply();
                    }
                    if (z12) {
                        z10 = z6Var.f11296z;
                    } else {
                        z10 = z6Var.f11287p;
                    }
                    if (z10) {
                        hs.f(i11).k(324, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                m7 m7Var = (m7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ai.y1 y1Var = (ai.y1) obj;
                int i12 = m7Var.f10643a;
                qr qrVar = m7Var.f10644b;
                SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i13);
                    long o10 = org.telegram.messenger.m5.o(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i14 = i10; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f10 = m7Var.f(arrayList2.get(i14).f27240id, o10);
                                if (f10 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i14, f10);
                                }
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    i13++;
                    i10 = 0;
                }
                if (!z12) {
                    try {
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User a22 = hp.s1(i12).a2(Long.valueOf(longValue));
                                if (a22 == null) {
                                    a22 = qr.a0(i12).j0(longValue);
                                }
                                if (a22 == null || (a22.stories_hidden == z11 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j10 = -longValue;
                                TLRPC.Chat M0 = hp.s1(i12).M0(Long.valueOf(j10));
                                if (M0 == null) {
                                    M0 = qr.a0(i12).O(j10);
                                }
                                if (M0 == null || (M0.stories_hidden == z11 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (org.telegram.messenger.r2.f25040a) {
                            org.telegram.messenger.a8.b("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList3));
                        }
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id IN(" + TextUtils.join(",", arrayList3) + ")").stepThis().dispose();
                    } catch (Throwable th2) {
                        qrVar.o(th2, true);
                    }
                }
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i15);
                    m7Var.g(org.telegram.messenger.m5.o(peerStories2.peer), peerStories2);
                }
                org.telegram.messenger.g0.h3(y1Var);
                return;
            case 2:
                o4.v vVar = (o4.v) obj;
                o4.e0 e0Var = ((o4.o0) ((m.b3) obj3).d).h;
                o4.l1 l1Var = e0Var.f20636t;
                xe.b(l1Var, (o4.w) obj2);
                int h = l1Var.h();
                if (z12) {
                    if (h == 1) {
                        if (l1Var.m0(2)) {
                            l1Var.a();
                        }
                    } else if (h == 4 && l1Var.m0(4)) {
                        l1Var.F();
                    }
                }
                if (z11 && l1Var.m0(1)) {
                    l1Var.j();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i16 : new int[]{31, 2}) {
                    zb.p(!false);
                    sparseBooleanArray.append(i16, true);
                }
                if (z11) {
                    zb.p(!false);
                    sparseBooleanArray.append(1, true);
                }
                zb.p(!false);
                e0Var.p(vVar);
                return;
            case 3:
                ProfileActivity.Z((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z12, z11);
                return;
            case 4:
                final g11 g11Var = (g11) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap hashMap = li.b0(g11Var.W).f24045r;
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean d = org.telegram.messenger.i6.d(str);
                final ArrayList arrayList6 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                final ArrayList arrayList7 = new ArrayList();
                final boolean z13 = this.f10091b;
                final boolean z14 = this.f10092c;
                u10 u10Var2 = new u10() {
                    @Override
                    public final void a(Object obj4) {
                        Runnable runnable = (Runnable) obj4;
                        final g11 g11Var2 = g11.this;
                        final String str2 = str;
                        final boolean z15 = z13;
                        final ArrayList arrayList8 = arrayList4;
                        final HashMap hashMap3 = hashMap;
                        final ArrayList arrayList9 = arrayList5;
                        final LinkedHashSet linkedHashSet3 = linkedHashSet;
                        final LinkedHashSet linkedHashSet4 = linkedHashSet2;
                        final ArrayList arrayList10 = arrayList7;
                        final ArrayList arrayList11 = arrayList6;
                        final boolean z16 = z14;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                g11 g11Var3 = g11.this;
                                kz0 kz0Var = g11Var3.K1;
                                if (kz0Var != null) {
                                    org.telegram.messenger.g0.r(kz0Var);
                                    g11Var3.K1 = null;
                                }
                                String str3 = g11Var3.B1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                g11Var3.A1 = true;
                                g11Var3.z(true, z15);
                                yz0 yz0Var = g11Var3.f45452g0;
                                if (yz0Var != null) {
                                    yz0Var.d(true);
                                }
                                ArrayList arrayList12 = g11Var3.C1;
                                if (arrayList12 == null) {
                                    g11Var3.C1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                ArrayList arrayList13 = g11Var3.F1;
                                if (arrayList13 == null) {
                                    g11Var3.F1 = new ArrayList();
                                } else {
                                    arrayList13.clear();
                                }
                                ArrayList arrayList14 = g11Var3.E1;
                                if (arrayList14 == null) {
                                    g11Var3.E1 = new ArrayList();
                                } else {
                                    arrayList14.clear();
                                }
                                ArrayList arrayList15 = g11Var3.D1;
                                if (arrayList15 == null) {
                                    g11Var3.D1 = new ArrayList();
                                } else {
                                    arrayList15.clear();
                                }
                                int i17 = 0;
                                g11Var3.f45458j0.v0(0);
                                int i18 = g11Var3.f45435a0;
                                if (i18 == 1 || i18 == 14 || i18 == 11 || i18 == 2) {
                                    ArrayList arrayList16 = arrayList8;
                                    if (!arrayList16.isEmpty()) {
                                        g11Var3.C1.addAll(arrayList16);
                                    } else {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap3.get(str4);
                                        if (tL_availableReaction != null) {
                                            g11Var3.C1.add(dh.n0.c(tL_availableReaction));
                                        }
                                    }
                                    ArrayList arrayList17 = arrayList9;
                                    if (!arrayList17.isEmpty()) {
                                        g11Var3.D1.addAll(arrayList17);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l10 = (Long) it.next();
                                    l10.getClass();
                                    ArrayList arrayList18 = g11Var3.C1;
                                    ?? obj5 = new Object();
                                    long longValue2 = l10.longValue();
                                    obj5.f9098g = longValue2;
                                    obj5.h = longValue2;
                                    arrayList18.add(obj5);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    g11Var3.C1.add(dh.n0.b((String) it2.next()));
                                }
                                g11Var3.F1.addAll(arrayList10);
                                ArrayList arrayList19 = arrayList11;
                                int size = arrayList19.size();
                                while (i17 < size) {
                                    Object obj6 = arrayList19.get(i17);
                                    i17++;
                                    g11Var3.E1.addAll((ArrayList) obj6);
                                }
                                g11Var3.f45473r0.E(true ^ z16);
                            }
                        });
                    }
                };
                int i17 = g11Var.f45435a0;
                if (i17 == 13) {
                    Utilities.u(0, new u10() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    g11 g11Var2 = g11Var;
                                    org.telegram.messenger.li.b0(g11Var2.W).V(g11.c2, str, false, new rb0(20, linkedHashSet2, (Runnable) obj4), false, false, false, false, 0);
                                    return;
                                default:
                                    g11 g11Var3 = g11Var;
                                    String str2 = str;
                                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(g11Var3.W);
                                    rz0 rz0Var = new rz0(linkedHashSet2, (Runnable) obj4, 0);
                                    if (str2 == null) {
                                        rz0Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.f21389g.c(new org.telegram.messenger.ul(str2, b02.s0(5), b02.f24051t0[1], rz0Var, 16));
                                    return;
                            }
                        }
                    }, u10Var2);
                    return;
                } else if (i17 == 14) {
                    if (d) {
                        u10Var = new u10() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.hp.s1(g11Var.W).E0();
                                        if (E0 != null) {
                                            for (int i18 = 0; i18 < E0.effects.size(); i18++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i18);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(dh.n0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        g11 g11Var2 = g11Var;
                                        org.telegram.messenger.li.b0(g11Var2.W).V(g11.c2, str, false, new a1.d(g11Var2, arrayList5, arrayList4, (Runnable) obj4, 17), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    } else {
                        u10Var = new u10() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.hp.s1(g11Var.W).E0();
                                        if (E0 != null) {
                                            for (int i18 = 0; i18 < E0.effects.size(); i18++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i18);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(dh.n0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        g11 g11Var2 = g11Var;
                                        org.telegram.messenger.li.b0(g11Var2.W).V(g11.c2, str, false, new a1.d(g11Var2, arrayList5, arrayList4, (Runnable) obj4, 17), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.u(0, u10Var, u10Var2);
                    return;
                } else {
                    Utilities.u(0, new nb(d, str, linkedHashSet, 4), new u10() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    g11 g11Var2 = g11Var;
                                    org.telegram.messenger.li.b0(g11Var2.W).V(g11.c2, str, false, new rb0(20, linkedHashSet, (Runnable) obj4), false, false, false, false, 0);
                                    return;
                                default:
                                    g11 g11Var3 = g11Var;
                                    String str2 = str;
                                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(g11Var3.W);
                                    rz0 rz0Var = new rz0(linkedHashSet, (Runnable) obj4, 0);
                                    if (str2 == null) {
                                        rz0Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.f21389g.c(new org.telegram.messenger.ul(str2, b02.s0(5), b02.f24051t0[1], rz0Var, 16));
                                    return;
                            }
                        }
                    }, new ai.v1(g11Var, strArr, str, linkedHashSet, 13), new kt0(g11Var, d, linkedHashSet, str, hashMap, arrayList4), new ai.v1(g11Var, str, arrayList6, hashMap2, 14), new org.telegram.ui.z(g11Var, str, arrayList7, 12), u10Var2);
                    return;
                }
            case 5:
                Runnable runnable = (Runnable) obj;
                ((tg.i0) obj3).l((tg.j0) obj2, z12, z11);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                tg.i0 i0Var = ((tg.s0) obj3).E.f55323c;
                lt0 lt0Var = i0Var.f55194g;
                m2.t h7 = i0Var.h(new RectF(0.0f, 0.0f, lt0Var.f35877a, lt0Var.f35878b), false, z12, z11);
                if (h7 != null) {
                    bitmapArr[0] = (Bitmap) h7.f19006b;
                }
                countDownLatch.countDown();
                return;
        }
    }

    public a6(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i3) {
        this.f10090a = i3;
        this.d = obj;
        this.f10093e = obj2;
        this.f10091b = z10;
        this.f10092c = z11;
        this.f10094f = obj3;
    }

    public a6(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f10090a = 3;
        this.d = profileActivity;
        this.f10093e = user;
        this.f10094f = str;
        this.f10091b = z10;
        this.f10092c = z11;
    }

    public a6(tg.s0 s0Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f10090a = 6;
        this.d = s0Var;
        this.f10091b = z10;
        this.f10092c = z11;
        this.f10093e = bitmapArr;
        this.f10094f = countDownLatch;
    }
}
