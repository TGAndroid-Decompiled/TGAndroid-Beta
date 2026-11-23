package fi;

import a8.ma;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import c8.kb;
import hi.fc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q11;
import org.telegram.ui.tt0;
public final class q5 implements Runnable {
    public final int f12458a;
    public final boolean f12459b;
    public final boolean f12460c;
    public final Object d;
    public final Object f12461e;
    public final Object f12462f;

    public q5(p6 p6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f12458a = 0;
        this.d = p6Var;
        this.f12459b = z10;
        this.f12461e = tL_stories_getAllStories;
        this.f12462f = tLObject;
        this.f12460c = z11;
    }

    @Override
    public final void run() {
        boolean z10;
        w10 w10Var;
        int[] iArr;
        int i7 = this.f12458a;
        boolean z11 = this.f12460c;
        boolean z12 = this.f12459b;
        Object obj = this.f12462f;
        Object obj2 = this.f12461e;
        Object obj3 = this.d;
        int i10 = 0;
        switch (i7) {
            case 0:
                p6 p6Var = (p6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = p6Var.f12387a;
                SharedPreferences sharedPreferences = p6Var.f12396l;
                if (z12) {
                    p6Var.f12402r = false;
                } else {
                    p6Var.f12401q = false;
                }
                org.telegram.messenger.a8.b("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    tr.a0(i11).m1(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        p6Var.f12405u = tL_stories_allStories.count;
                        p6Var.f12400p = tL_stories_allStories.has_more;
                        p6Var.f12399o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", p6Var.f12399o).putBoolean("last_stories_has_more", p6Var.f12400p).putInt("total_stores", p6Var.f12405u).apply();
                    } else {
                        p6Var.v = tL_stories_allStories.count;
                        p6Var.f12409z = tL_stories_allStories.has_more;
                        p6Var.f12408y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", p6Var.f12408y).putBoolean("last_stories_has_more_hidden", p6Var.f12409z).putInt("total_stores_hidden", p6Var.v).apply();
                    }
                    p6Var.b0(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        p6Var.f12400p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        p6Var.f12399o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", p6Var.f12399o).apply();
                    } else {
                        p6Var.f12409z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        p6Var.f12408y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", p6Var.f12408y).apply();
                    }
                    if (z12) {
                        z10 = p6Var.f12409z;
                    } else {
                        z10 = p6Var.f12400p;
                    }
                    if (z10) {
                        ks.f(i11).k(327, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                c7 c7Var = (c7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ai.k kVar = (ai.k) obj;
                int i12 = c7Var.f11819a;
                tr trVar = c7Var.f11820b;
                SQLiteDatabase sQLiteDatabase = trVar.f27151b;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i13);
                    long o4 = org.telegram.messenger.n5.o(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i14 = i10; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f10 = c7Var.f(arrayList2.get(i14).f28731id, o4);
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
                                TLRPC.User c22 = mp.u1(i12).c2(Long.valueOf(longValue));
                                if (c22 == null) {
                                    c22 = tr.a0(i12).j0(longValue);
                                }
                                if (c22 == null || (c22.stories_hidden == z11 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j3 = -longValue;
                                TLRPC.Chat O0 = mp.u1(i12).O0(Long.valueOf(j3));
                                if (O0 == null) {
                                    O0 = tr.a0(i12).O(j3);
                                }
                                if (O0 == null || (O0.stories_hidden == z11 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (org.telegram.messenger.s2.f26829a) {
                            org.telegram.messenger.a8.b("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList3));
                        }
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id IN(" + TextUtils.join(",", arrayList3) + ")").stepThis().dispose();
                    } catch (Throwable th2) {
                        trVar.o(th2, true);
                    }
                }
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i15);
                    c7Var.g(org.telegram.messenger.n5.o(peerStories2.peer), peerStories2);
                }
                org.telegram.messenger.g0.g3(kVar);
                return;
            case 2:
                ProfileActivity.Z((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z12, z11);
                return;
            case 3:
                final q11 q11Var = (q11) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap hashMap = ri.d0(q11Var.W).f26734r;
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean d = org.telegram.messenger.j6.d(str);
                final ArrayList arrayList6 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                final ArrayList arrayList7 = new ArrayList();
                final boolean z13 = this.f12459b;
                final boolean z14 = this.f12460c;
                w10 w10Var2 = new w10() {
                    @Override
                    public final void a(Object obj4) {
                        Runnable runnable = (Runnable) obj4;
                        final q11 q11Var2 = q11.this;
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
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                q11 q11Var3 = q11.this;
                                uz0 uz0Var = q11Var3.K1;
                                if (uz0Var != null) {
                                    org.telegram.messenger.g0.r(uz0Var);
                                    q11Var3.K1 = null;
                                }
                                String str3 = q11Var3.B1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                q11Var3.A1 = true;
                                q11Var3.z(true, z15);
                                i01 i01Var = q11Var3.f51243g0;
                                if (i01Var != null) {
                                    i01Var.d(true);
                                }
                                ArrayList arrayList12 = q11Var3.C1;
                                if (arrayList12 == null) {
                                    q11Var3.C1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                ArrayList arrayList13 = q11Var3.F1;
                                if (arrayList13 == null) {
                                    q11Var3.F1 = new ArrayList();
                                } else {
                                    arrayList13.clear();
                                }
                                ArrayList arrayList14 = q11Var3.E1;
                                if (arrayList14 == null) {
                                    q11Var3.E1 = new ArrayList();
                                } else {
                                    arrayList14.clear();
                                }
                                ArrayList arrayList15 = q11Var3.D1;
                                if (arrayList15 == null) {
                                    q11Var3.D1 = new ArrayList();
                                } else {
                                    arrayList15.clear();
                                }
                                int i16 = 0;
                                q11Var3.f51249j0.v0(0);
                                int i17 = q11Var3.f51226a0;
                                if (i17 == 1 || i17 == 14 || i17 == 11 || i17 == 2) {
                                    ArrayList arrayList16 = arrayList8;
                                    if (!arrayList16.isEmpty()) {
                                        q11Var3.C1.addAll(arrayList16);
                                    } else {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap3.get(str4);
                                        if (tL_availableReaction != null) {
                                            q11Var3.C1.add(ch.p0.c(tL_availableReaction));
                                        }
                                    }
                                    ArrayList arrayList17 = arrayList9;
                                    if (!arrayList17.isEmpty()) {
                                        q11Var3.D1.addAll(arrayList17);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l10 = (Long) it.next();
                                    l10.getClass();
                                    ArrayList arrayList18 = q11Var3.C1;
                                    ?? obj5 = new Object();
                                    long longValue2 = l10.longValue();
                                    obj5.f5471g = longValue2;
                                    obj5.h = longValue2;
                                    arrayList18.add(obj5);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    q11Var3.C1.add(ch.p0.b((String) it2.next()));
                                }
                                q11Var3.F1.addAll(arrayList10);
                                ArrayList arrayList19 = arrayList11;
                                int size = arrayList19.size();
                                while (i16 < size) {
                                    Object obj6 = arrayList19.get(i16);
                                    i16++;
                                    q11Var3.E1.addAll((ArrayList) obj6);
                                }
                                q11Var3.f51264r0.E(true ^ z16);
                            }
                        });
                    }
                };
                int i16 = q11Var.f51226a0;
                if (i16 == 13) {
                    Utilities.u(0, new w10() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    q11 q11Var2 = q11Var;
                                    org.telegram.messenger.ri.d0(q11Var2.W).X(q11.f51223c2, str, false, new yi0(15, linkedHashSet2, (Runnable) obj4), false, false, false, false, 0);
                                    return;
                                default:
                                    q11 q11Var3 = q11Var;
                                    String str2 = str;
                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(q11Var3.W);
                                    b01 b01Var = new b01(linkedHashSet2, (Runnable) obj4, 0);
                                    if (str2 == null) {
                                        b01Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.f22879g.c(new org.telegram.messenger.tl(str2, d02.u0(5), d02.f26740t0[1], b01Var, 16));
                                    return;
                            }
                        }
                    }, w10Var2);
                    return;
                } else if (i16 == 14) {
                    if (d) {
                        w10Var = new w10() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects G0 = org.telegram.messenger.mp.u1(q11Var.W).G0();
                                        if (G0 != null) {
                                            for (int i17 = 0; i17 < G0.effects.size(); i17++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = G0.effects.get(i17);
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
                                        q11 q11Var2 = q11Var;
                                        org.telegram.messenger.ri.d0(q11Var2.W).X(q11.f51223c2, str, false, new a1.d(q11Var2, arrayList5, arrayList4, (Runnable) obj4, 18), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    } else {
                        w10Var = new w10() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects G0 = org.telegram.messenger.mp.u1(q11Var.W).G0();
                                        if (G0 != null) {
                                            for (int i17 = 0; i17 < G0.effects.size(); i17++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = G0.effects.get(i17);
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
                                        q11 q11Var2 = q11Var;
                                        org.telegram.messenger.ri.d0(q11Var2.W).X(q11.f51223c2, str, false, new a1.d(q11Var2, arrayList5, arrayList4, (Runnable) obj4, 18), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.u(0, w10Var, w10Var2);
                    return;
                } else {
                    Utilities.u(0, new fc(d, str, linkedHashSet, 4), new w10() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    q11 q11Var2 = q11Var;
                                    org.telegram.messenger.ri.d0(q11Var2.W).X(q11.f51223c2, str, false, new yi0(15, linkedHashSet, (Runnable) obj4), false, false, false, false, 0);
                                    return;
                                default:
                                    q11 q11Var3 = q11Var;
                                    String str2 = str;
                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(q11Var3.W);
                                    b01 b01Var = new b01(linkedHashSet, (Runnable) obj4, 0);
                                    if (str2 == null) {
                                        b01Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.f22879g.c(new org.telegram.messenger.tl(str2, d02.u0(5), d02.f26740t0[1], b01Var, 16));
                                    return;
                            }
                        }
                    }, new bi.o2(q11Var, strArr, str, linkedHashSet, 13), new tt0(q11Var, d, linkedHashSet, str, hashMap, arrayList4), new bi.o2(q11Var, str, arrayList6, hashMap2, 14), new org.telegram.ui.x(q11Var, str, arrayList7, 12), w10Var2);
                    return;
                }
            case 4:
                p4.v vVar = (p4.v) obj;
                p4.d0 d0Var = ((p4.n0) ((m.b3) obj3).d).h;
                p4.h1 h1Var = d0Var.f55324t;
                kb.b(h1Var, (p4.w) obj2);
                int i17 = h1Var.i();
                if (z12) {
                    if (i17 == 1) {
                        if (h1Var.q0(2)) {
                            h1Var.a();
                        }
                    } else if (i17 == 4 && h1Var.q0(4)) {
                        h1Var.H();
                    }
                }
                if (z11 && h1Var.q0(1)) {
                    h1Var.f();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i18 : new int[]{31, 2}) {
                    ma.p(!false);
                    sparseBooleanArray.append(i18, true);
                }
                if (z11) {
                    ma.p(!false);
                    sparseBooleanArray.append(1, true);
                }
                ma.p(!false);
                d0Var.p(vVar);
                return;
            case 5:
                Runnable runnable = (Runnable) obj;
                ((sg.h0) obj3).l((sg.i0) obj2, z12, z11);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                sg.h0 h0Var = ((sg.r0) obj3).E.f57471c;
                xt0 xt0Var = h0Var.f57344g;
                s2.e h = h0Var.h(new RectF(0.0f, 0.0f, xt0Var.f42189a, xt0Var.f42190b), false, z12, z11);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f56892b;
                }
                countDownLatch.countDown();
                return;
        }
    }

    public q5(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i7) {
        this.f12458a = i7;
        this.d = obj;
        this.f12461e = obj2;
        this.f12459b = z10;
        this.f12460c = z11;
        this.f12462f = obj3;
    }

    public q5(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f12458a = 2;
        this.d = profileActivity;
        this.f12461e = user;
        this.f12462f = str;
        this.f12459b = z10;
        this.f12460c = z11;
    }

    public q5(sg.r0 r0Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f12458a = 6;
        this.d = r0Var;
        this.f12459b = z10;
        this.f12460c = z11;
        this.f12461e = bitmapArr;
        this.f12462f = countDownLatch;
    }
}
