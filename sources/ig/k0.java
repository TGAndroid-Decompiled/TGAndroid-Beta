package ig;

import ag.m2;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import m.c3;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.f8;
import org.telegram.messenger.is;
import org.telegram.messenger.k6;
import org.telegram.messenger.o5;
import org.telegram.messenger.r20;
import org.telegram.messenger.v2;
import org.telegram.messenger.vi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cv0;
import org.telegram.ui.g31;
import th.e5;
import th.r5;
import v7.t6;
public final class k0 implements Runnable {
    public final int f8340a;
    public final boolean f8341b;
    public final boolean f8342c;
    public final Object d;
    public final Object e;
    public final Object f8343f;

    public k0(a1 a1Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f8340a = 1;
        this.d = a1Var;
        this.f8341b = z10;
        this.f8342c = z11;
        this.e = bitmapArr;
        this.f8343f = countDownLatch;
    }

    @Override
    public final void run() {
        int[] iArr;
        r20 r20Var;
        boolean z10;
        int i10 = this.f8340a;
        boolean z11 = this.f8342c;
        boolean z12 = this.f8341b;
        Object obj = this.f8343f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                Runnable runnable = (Runnable) obj;
                ((q0) obj3).l((r0) obj2, z12, z11);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                q0 q0Var = ((a1) obj3).D.f8285c;
                qu0 qu0Var = q0Var.f8415g;
                n4.q h = q0Var.h(new RectF(0.0f, 0.0f, qu0Var.f29808a, qu0Var.f29809b), false, z12, z11);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f13527a;
                }
                countDownLatch.countDown();
                return;
            case 2:
                m4.w wVar = (m4.w) obj;
                m4.f0 f0Var = ((m4.p0) ((c3) obj3).d).h;
                m4.n1 n1Var = f0Var.f12755t;
                w7.y.b(n1Var, (m4.x) obj2);
                int h10 = n1Var.h();
                if (z12) {
                    if (h10 == 1) {
                        if (n1Var.n0(2)) {
                            n1Var.a();
                        }
                    } else if (h10 == 4 && n1Var.n0(4)) {
                        n1Var.G();
                    }
                }
                if (z11 && n1Var.n0(1)) {
                    n1Var.j();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i11 : new int[]{31, 2}) {
                    t6.p(!false);
                    sparseBooleanArray.append(i11, true);
                }
                if (z11) {
                    t6.p(!false);
                    sparseBooleanArray.append(1, true);
                }
                t6.p(!false);
                f0Var.p(wVar);
                return;
            case 3:
                ProfileActivity.Z((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z12, z11);
                return;
            case 4:
                final g31 g31Var = (g31) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap hashMap = vi.b0(g31Var.V).f18670r;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                boolean d = k6.d(str);
                final ArrayList arrayList3 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                final ArrayList arrayList4 = new ArrayList();
                final boolean z13 = this.f8341b;
                final boolean z14 = this.f8342c;
                r20 r20Var2 = new r20() {
                    @Override
                    public final void a(Object obj4) {
                        Runnable runnable2 = (Runnable) obj4;
                        final g31 g31Var2 = g31.this;
                        final String str2 = str;
                        final boolean z15 = z13;
                        final ArrayList arrayList5 = arrayList;
                        final HashMap hashMap3 = hashMap;
                        final ArrayList arrayList6 = arrayList2;
                        final LinkedHashSet linkedHashSet3 = linkedHashSet;
                        final LinkedHashSet linkedHashSet4 = linkedHashSet2;
                        final ArrayList arrayList7 = arrayList4;
                        final ArrayList arrayList8 = arrayList3;
                        final boolean z16 = z14;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                g31 g31Var3 = g31.this;
                                j11 j11Var = g31Var3.J1;
                                if (j11Var != null) {
                                    org.telegram.messenger.i0.r(j11Var);
                                    g31Var3.J1 = null;
                                }
                                String str3 = g31Var3.A1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                g31Var3.f37346z1 = true;
                                g31Var3.z(true, z15);
                                y11 y11Var = g31Var3.f37301f0;
                                if (y11Var != null) {
                                    y11Var.d(true);
                                }
                                ArrayList arrayList9 = g31Var3.B1;
                                if (arrayList9 == null) {
                                    g31Var3.B1 = new ArrayList();
                                } else {
                                    arrayList9.clear();
                                }
                                ArrayList arrayList10 = g31Var3.E1;
                                if (arrayList10 == null) {
                                    g31Var3.E1 = new ArrayList();
                                } else {
                                    arrayList10.clear();
                                }
                                ArrayList arrayList11 = g31Var3.D1;
                                if (arrayList11 == null) {
                                    g31Var3.D1 = new ArrayList();
                                } else {
                                    arrayList11.clear();
                                }
                                ArrayList arrayList12 = g31Var3.C1;
                                if (arrayList12 == null) {
                                    g31Var3.C1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                int i12 = 0;
                                g31Var3.f37307i0.v0(0);
                                int i13 = g31Var3.W;
                                if (i13 == 1 || i13 == 14 || i13 == 11 || i13 == 2) {
                                    ArrayList arrayList13 = arrayList5;
                                    if (!arrayList13.isEmpty()) {
                                        g31Var3.B1.addAll(arrayList13);
                                    } else {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap3.get(str4);
                                        if (tL_availableReaction != null) {
                                            g31Var3.B1.add(sg.o0.c(tL_availableReaction));
                                        }
                                    }
                                    ArrayList arrayList14 = arrayList6;
                                    if (!arrayList14.isEmpty()) {
                                        g31Var3.C1.addAll(arrayList14);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l4 = (Long) it.next();
                                    l4.getClass();
                                    ArrayList arrayList15 = g31Var3.B1;
                                    ?? obj5 = new Object();
                                    long longValue = l4.longValue();
                                    obj5.f48446g = longValue;
                                    obj5.h = longValue;
                                    arrayList15.add(obj5);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    g31Var3.B1.add(sg.o0.b((String) it2.next()));
                                }
                                g31Var3.E1.addAll(arrayList7);
                                ArrayList arrayList16 = arrayList8;
                                int size = arrayList16.size();
                                while (i12 < size) {
                                    Object obj6 = arrayList16.get(i12);
                                    i12++;
                                    g31Var3.D1.addAll((ArrayList) obj6);
                                }
                                g31Var3.f37322q0.E(true ^ z16);
                            }
                        });
                    }
                };
                int i12 = g31Var.W;
                if (i12 == 13) {
                    Utilities.u(0, new r20() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    g31 g31Var2 = g31Var;
                                    org.telegram.messenger.vi.b0(g31Var2.V).V(g31.f37284b2, str, false, new cp0(11, linkedHashSet2, (Runnable) obj4), false, false, false, false, 0);
                                    return;
                                default:
                                    g31 g31Var3 = g31Var;
                                    String str2 = str;
                                    org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(g31Var3.V);
                                    q11 q11Var = new q11(linkedHashSet2, (Runnable) obj4, 0);
                                    if (str2 == null) {
                                        q11Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.f14523g.c(new org.telegram.messenger.vl(str2, b02.s0(5), b02.f18674s0[1], q11Var, 16));
                                    return;
                            }
                        }
                    }, r20Var2);
                    return;
                } else if (i12 == 14) {
                    if (d) {
                        r20Var = new r20() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList5;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable2 = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.wp.r1(g31Var.V).E0();
                                        if (E0 != null) {
                                            for (int i13 = 0; i13 < E0.effects.size(); i13++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i13);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList5 = arrayList2;
                                                        } else {
                                                            arrayList5 = arrayList;
                                                        }
                                                        arrayList5.add(sg.o0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        return;
                                    default:
                                        g31 g31Var2 = g31Var;
                                        org.telegram.messenger.vi.b0(g31Var2.V).V(g31.f37284b2, str, false, new a1.d(g31Var2, arrayList2, arrayList, (Runnable) obj4, 14), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    } else {
                        r20Var = new r20() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList5;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable2 = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.wp.r1(g31Var.V).E0();
                                        if (E0 != null) {
                                            for (int i13 = 0; i13 < E0.effects.size(); i13++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i13);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList5 = arrayList2;
                                                        } else {
                                                            arrayList5 = arrayList;
                                                        }
                                                        arrayList5.add(sg.o0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable2.run();
                                        return;
                                    default:
                                        g31 g31Var2 = g31Var;
                                        org.telegram.messenger.vi.b0(g31Var2.V).V(g31.f37284b2, str, false, new a1.d(g31Var2, arrayList2, arrayList, (Runnable) obj4, 14), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.u(0, r20Var, r20Var2);
                    return;
                } else {
                    Utilities.u(0, new ll(d, str, linkedHashSet, 3), new r20() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    g31 g31Var2 = g31Var;
                                    org.telegram.messenger.vi.b0(g31Var2.V).V(g31.f37284b2, str, false, new cp0(11, linkedHashSet, (Runnable) obj4), false, false, false, false, 0);
                                    return;
                                default:
                                    g31 g31Var3 = g31Var;
                                    String str2 = str;
                                    org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(g31Var3.V);
                                    q11 q11Var = new q11(linkedHashSet, (Runnable) obj4, 0);
                                    if (str2 == null) {
                                        q11Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.f14523g.c(new org.telegram.messenger.vl(str2, b02.s0(5), b02.f18674s0[1], q11Var, 16));
                                    return;
                            }
                        }
                    }, new m2(g31Var, strArr, str, linkedHashSet, 12), new cv0(g31Var, d, linkedHashSet, str, hashMap, arrayList), new m2(g31Var, str, arrayList3, hashMap2, 13), new org.telegram.ui.w(g31Var, str, arrayList4, 12), r20Var2);
                    return;
                }
            case 5:
                e5 e5Var = (e5) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i13 = e5Var.f48918a;
                SharedPreferences sharedPreferences = e5Var.f48926l;
                if (z12) {
                    e5Var.f48932r = false;
                } else {
                    e5Var.f48931q = false;
                }
                f8.b("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    is.a0(i13).m1(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        e5Var.f48935u = tL_stories_allStories.count;
                        e5Var.f48930p = tL_stories_allStories.has_more;
                        e5Var.f48929o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", e5Var.f48929o).putBoolean("last_stories_has_more", e5Var.f48930p).putInt("total_stores", e5Var.f48935u).apply();
                    } else {
                        e5Var.v = tL_stories_allStories.count;
                        e5Var.f48939z = tL_stories_allStories.has_more;
                        e5Var.f48938y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", e5Var.f48938y).putBoolean("last_stories_has_more_hidden", e5Var.f48939z).putInt("total_stores_hidden", e5Var.v).apply();
                    }
                    e5Var.b0(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        e5Var.f48930p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        e5Var.f48929o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", e5Var.f48929o).apply();
                    } else {
                        e5Var.f48939z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        e5Var.f48938y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", e5Var.f48938y).apply();
                    }
                    if (z12) {
                        z10 = e5Var.f48939z;
                    } else {
                        z10 = e5Var.f48930p;
                    }
                    if (z10) {
                        at.f(i13).k(324, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                r5 r5Var = (r5) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                r5.a aVar = (r5.a) obj;
                int i14 = r5Var.f49425a;
                is isVar = r5Var.f49426b;
                SQLiteDatabase sQLiteDatabase = isVar.f16333b;
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList5.get(i15);
                    long o10 = o5.o(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList6 = peerStories.stories;
                        for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                            if (arrayList6.get(i16) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f7 = r5Var.f(arrayList6.get(i16).f20032id, o10);
                                if (f7 instanceof TL_stories.TL_storyItem) {
                                    arrayList6.set(i16, f7);
                                }
                            }
                        }
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                }
                if (!z12) {
                    try {
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList7 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User Z1 = wp.r1(i14).Z1(Long.valueOf(longValue));
                                if (Z1 == null) {
                                    Z1 = is.a0(i14).j0(longValue);
                                }
                                if (Z1 == null || (Z1.stories_hidden == z11 && !arrayList7.contains(Long.valueOf(longValue)))) {
                                    arrayList7.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j10 = -longValue;
                                TLRPC.Chat L0 = wp.r1(i14).L0(Long.valueOf(j10));
                                if (L0 == null) {
                                    L0 = is.a0(i14).O(j10);
                                }
                                if (L0 == null || (L0.stories_hidden == z11 && !arrayList7.contains(Long.valueOf(longValue)))) {
                                    arrayList7.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (v2.f18578a) {
                            f8.b("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList7));
                        }
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id IN(" + TextUtils.join(",", arrayList7) + ")").stepThis().dispose();
                    } catch (Throwable th2) {
                        isVar.o(th2, true);
                    }
                }
                for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList5.get(i17);
                    r5Var.g(o5.o(peerStories2.peer), peerStories2);
                }
                org.telegram.messenger.i0.g3(aVar);
                return;
        }
    }

    public k0(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f8340a = i10;
        this.d = obj;
        this.e = obj2;
        this.f8341b = z10;
        this.f8342c = z11;
        this.f8343f = obj3;
    }

    public k0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f8340a = 3;
        this.d = profileActivity;
        this.e = user;
        this.f8343f = str;
        this.f8341b = z10;
        this.f8342c = z11;
    }

    public k0(e5 e5Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f8340a = 5;
        this.d = e5Var;
        this.f8341b = z10;
        this.e = tL_stories_getAllStories;
        this.f8343f = tLObject;
        this.f8342c = z11;
    }
}
