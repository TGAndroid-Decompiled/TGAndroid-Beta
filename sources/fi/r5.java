package fi;

import a8.ja;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import c8.cb;
import hi.kb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n11;
import org.telegram.ui.rt0;
public final class r5 implements Runnable {
    public final int f12267a;
    public final boolean f12268b;
    public final boolean f12269c;
    public final Object d;
    public final Object f12270e;
    public final Object f12271f;

    public r5(s6 s6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f12267a = 0;
        this.d = s6Var;
        this.f12268b = z10;
        this.f12270e = tL_stories_getAllStories;
        this.f12271f = tLObject;
        this.f12269c = z11;
    }

    @Override
    public final void run() {
        boolean z10;
        z10 z10Var;
        int[] iArr;
        int i7 = this.f12267a;
        boolean z11 = this.f12269c;
        boolean z12 = this.f12268b;
        Object obj = this.f12271f;
        Object obj2 = this.f12270e;
        Object obj3 = this.d;
        int i10 = 0;
        switch (i7) {
            case 0:
                s6 s6Var = (s6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = s6Var.f12319a;
                SharedPreferences sharedPreferences = s6Var.f12328l;
                if (z12) {
                    s6Var.f12334r = false;
                } else {
                    s6Var.f12333q = false;
                }
                org.telegram.messenger.a8.b("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    vr.a0(i11).m1(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        s6Var.f12337u = tL_stories_allStories.count;
                        s6Var.f12332p = tL_stories_allStories.has_more;
                        s6Var.f12331o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", s6Var.f12331o).putBoolean("last_stories_has_more", s6Var.f12332p).putInt("total_stores", s6Var.f12337u).apply();
                    } else {
                        s6Var.v = tL_stories_allStories.count;
                        s6Var.f12341z = tL_stories_allStories.has_more;
                        s6Var.f12340y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", s6Var.f12340y).putBoolean("last_stories_has_more_hidden", s6Var.f12341z).putInt("total_stores_hidden", s6Var.v).apply();
                    }
                    s6Var.b0(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        s6Var.f12332p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        s6Var.f12331o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", s6Var.f12331o).apply();
                    } else {
                        s6Var.f12341z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        s6Var.f12340y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", s6Var.f12340y).apply();
                    }
                    if (z12) {
                        z10 = s6Var.f12341z;
                    } else {
                        z10 = s6Var.f12332p;
                    }
                    if (z10) {
                        ns.f(i11).k(324, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                f7 f7Var = (f7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ai.o oVar = (ai.o) obj;
                int i12 = f7Var.f11708a;
                vr vrVar = f7Var.f11709b;
                SQLiteDatabase sQLiteDatabase = vrVar.f27222b;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i13);
                    long o4 = org.telegram.messenger.m5.o(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i14 = i10; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f10 = f7Var.f(arrayList2.get(i14).f28290id, o4);
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
                                TLRPC.User a22 = np.s1(i12).a2(Long.valueOf(longValue));
                                if (a22 == null) {
                                    a22 = vr.a0(i12).j0(longValue);
                                }
                                if (a22 == null || (a22.stories_hidden == z11 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j3 = -longValue;
                                TLRPC.Chat M0 = np.s1(i12).M0(Long.valueOf(j3));
                                if (M0 == null) {
                                    M0 = vr.a0(i12).O(j3);
                                }
                                if (M0 == null || (M0.stories_hidden == z11 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (org.telegram.messenger.r2.f26198a) {
                            org.telegram.messenger.a8.b("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList3));
                        }
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id IN(" + TextUtils.join(",", arrayList3) + ")").stepThis().dispose();
                    } catch (Throwable th2) {
                        vrVar.o(th2, true);
                    }
                }
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i15);
                    f7Var.g(org.telegram.messenger.m5.o(peerStories2.peer), peerStories2);
                }
                org.telegram.messenger.g0.h3(oVar);
                return;
            case 2:
                ProfileActivity.Z((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z12, z11);
                return;
            case 3:
                final n11 n11Var = (n11) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap hashMap = si.b0(n11Var.W).f26495r;
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean d = org.telegram.messenger.j6.d(str);
                final ArrayList arrayList6 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                final ArrayList arrayList7 = new ArrayList();
                final boolean z13 = this.f12268b;
                final boolean z14 = this.f12269c;
                z10 z10Var2 = new z10() {
                    @Override
                    public final void a(Object obj4) {
                        Runnable runnable = (Runnable) obj4;
                        final n11 n11Var2 = n11.this;
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
                                n11 n11Var3 = n11.this;
                                rz0 rz0Var = n11Var3.K1;
                                if (rz0Var != null) {
                                    org.telegram.messenger.g0.r(rz0Var);
                                    n11Var3.K1 = null;
                                }
                                String str3 = n11Var3.B1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                n11Var3.A1 = true;
                                n11Var3.z(true, z15);
                                f01 f01Var = n11Var3.f49382g0;
                                if (f01Var != null) {
                                    f01Var.d(true);
                                }
                                ArrayList arrayList12 = n11Var3.C1;
                                if (arrayList12 == null) {
                                    n11Var3.C1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                ArrayList arrayList13 = n11Var3.F1;
                                if (arrayList13 == null) {
                                    n11Var3.F1 = new ArrayList();
                                } else {
                                    arrayList13.clear();
                                }
                                ArrayList arrayList14 = n11Var3.E1;
                                if (arrayList14 == null) {
                                    n11Var3.E1 = new ArrayList();
                                } else {
                                    arrayList14.clear();
                                }
                                ArrayList arrayList15 = n11Var3.D1;
                                if (arrayList15 == null) {
                                    n11Var3.D1 = new ArrayList();
                                } else {
                                    arrayList15.clear();
                                }
                                int i16 = 0;
                                n11Var3.f49388j0.v0(0);
                                int i17 = n11Var3.f49365a0;
                                if (i17 == 1 || i17 == 14 || i17 == 11 || i17 == 2) {
                                    ArrayList arrayList16 = arrayList8;
                                    if (!arrayList16.isEmpty()) {
                                        n11Var3.C1.addAll(arrayList16);
                                    } else {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap3.get(str4);
                                        if (tL_availableReaction != null) {
                                            n11Var3.C1.add(ch.p0.c(tL_availableReaction));
                                        }
                                    }
                                    ArrayList arrayList17 = arrayList9;
                                    if (!arrayList17.isEmpty()) {
                                        n11Var3.D1.addAll(arrayList17);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l10 = (Long) it.next();
                                    l10.getClass();
                                    ArrayList arrayList18 = n11Var3.C1;
                                    ?? obj5 = new Object();
                                    long longValue2 = l10.longValue();
                                    obj5.f5189g = longValue2;
                                    obj5.h = longValue2;
                                    arrayList18.add(obj5);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    n11Var3.C1.add(ch.p0.b((String) it2.next()));
                                }
                                n11Var3.F1.addAll(arrayList10);
                                ArrayList arrayList19 = arrayList11;
                                int size = arrayList19.size();
                                while (i16 < size) {
                                    Object obj6 = arrayList19.get(i16);
                                    i16++;
                                    n11Var3.E1.addAll((ArrayList) obj6);
                                }
                                n11Var3.f49403r0.E(true ^ z16);
                            }
                        });
                    }
                };
                int i16 = n11Var.f49365a0;
                if (i16 == 13) {
                    Utilities.u(0, new z10() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    n11 n11Var2 = n11Var;
                                    org.telegram.messenger.si.b0(n11Var2.W).V(n11.f49362c2, str, false, new xi0(16, linkedHashSet2, (Runnable) obj4), false, false, false, false, 0);
                                    return;
                                default:
                                    n11 n11Var3 = n11Var;
                                    String str2 = str;
                                    org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(n11Var3.W);
                                    yz0 yz0Var = new yz0(linkedHashSet2, (Runnable) obj4, 0);
                                    if (str2 == null) {
                                        yz0Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.f22418g.c(new org.telegram.messenger.bm(str2, b02.s0(5), b02.f26501t0[1], yz0Var, 16));
                                    return;
                            }
                        }
                    }, z10Var2);
                    return;
                } else if (i16 == 14) {
                    if (d) {
                        z10Var = new z10() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.np.s1(n11Var.W).E0();
                                        if (E0 != null) {
                                            for (int i17 = 0; i17 < E0.effects.size(); i17++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i17);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(ch.p0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        n11 n11Var2 = n11Var;
                                        org.telegram.messenger.si.b0(n11Var2.W).V(n11.f49362c2, str, false, new a1.d(n11Var2, arrayList5, arrayList4, (Runnable) obj4, 18), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    } else {
                        z10Var = new z10() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.np.s1(n11Var.W).E0();
                                        if (E0 != null) {
                                            for (int i17 = 0; i17 < E0.effects.size(); i17++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i17);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList8 = arrayList5;
                                                        } else {
                                                            arrayList8 = arrayList4;
                                                        }
                                                        arrayList8.add(ch.p0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        n11 n11Var2 = n11Var;
                                        org.telegram.messenger.si.b0(n11Var2.W).V(n11.f49362c2, str, false, new a1.d(n11Var2, arrayList5, arrayList4, (Runnable) obj4, 18), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.u(0, z10Var, z10Var2);
                    return;
                } else {
                    Utilities.u(0, new kb(d, str, linkedHashSet, 4), new z10() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    n11 n11Var2 = n11Var;
                                    org.telegram.messenger.si.b0(n11Var2.W).V(n11.f49362c2, str, false, new xi0(16, linkedHashSet, (Runnable) obj4), false, false, false, false, 0);
                                    return;
                                default:
                                    n11 n11Var3 = n11Var;
                                    String str2 = str;
                                    org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(n11Var3.W);
                                    yz0 yz0Var = new yz0(linkedHashSet, (Runnable) obj4, 0);
                                    if (str2 == null) {
                                        yz0Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.f22418g.c(new org.telegram.messenger.bm(str2, b02.s0(5), b02.f26501t0[1], yz0Var, 16));
                                    return;
                            }
                        }
                    }, new bi.o1(n11Var, strArr, str, linkedHashSet, 13), new rt0(n11Var, d, linkedHashSet, str, hashMap, arrayList4), new bi.o1(n11Var, str, arrayList6, hashMap2, 14), new org.telegram.ui.x(n11Var, str, arrayList7, 12), z10Var2);
                    return;
                }
            case 4:
                p4.v vVar = (p4.v) obj;
                p4.d0 d0Var = ((p4.m0) ((m.b3) obj3).d).h;
                p4.g1 g1Var = d0Var.f54635t;
                cb.b(g1Var, (p4.w) obj2);
                int i17 = g1Var.i();
                if (z12) {
                    if (i17 == 1) {
                        if (g1Var.p0(2)) {
                            g1Var.a();
                        }
                    } else if (i17 == 4 && g1Var.p0(4)) {
                        g1Var.G();
                    }
                }
                if (z11 && g1Var.p0(1)) {
                    g1Var.f();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i18 : new int[]{31, 2}) {
                    ja.p(!false);
                    sparseBooleanArray.append(i18, true);
                }
                if (z11) {
                    ja.p(!false);
                    sparseBooleanArray.append(1, true);
                }
                ja.p(!false);
                d0Var.p(vVar);
                return;
            case 5:
                Runnable runnable = (Runnable) obj;
                ((sg.i0) obj3).l((sg.j0) obj2, z12, z11);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                sg.i0 i0Var = ((sg.s0) obj3).E.f56784c;
                nt0 nt0Var = i0Var.f56652g;
                sg.h0 h = i0Var.h(new RectF(0.0f, 0.0f, nt0Var.f37713a, nt0Var.f37714b), false, z12, z11);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f56642b;
                }
                countDownLatch.countDown();
                return;
        }
    }

    public r5(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i7) {
        this.f12267a = i7;
        this.d = obj;
        this.f12270e = obj2;
        this.f12268b = z10;
        this.f12269c = z11;
        this.f12271f = obj3;
    }

    public r5(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f12267a = 2;
        this.d = profileActivity;
        this.f12270e = user;
        this.f12271f = str;
        this.f12268b = z10;
        this.f12269c = z11;
    }

    public r5(sg.s0 s0Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f12267a = 6;
        this.d = s0Var;
        this.f12268b = z10;
        this.f12269c = z11;
        this.f12270e = bitmapArr;
        this.f12271f = countDownLatch;
    }
}
