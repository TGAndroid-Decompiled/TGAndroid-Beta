package fi;

import a8.la;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import c8.jb;
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
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s11;
import org.telegram.ui.ut0;
public final class q5 implements Runnable {
    public final int f12493a;
    public final boolean f12494b;
    public final boolean f12495c;
    public final Object d;
    public final Object f12496e;
    public final Object f12497f;

    public q5(p6 p6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.f12493a = 0;
        this.d = p6Var;
        this.f12494b = z10;
        this.f12496e = tL_stories_getAllStories;
        this.f12497f = tLObject;
        this.f12495c = z11;
    }

    @Override
    public final void run() {
        boolean z10;
        x10 x10Var;
        int[] iArr;
        int i7 = this.f12493a;
        boolean z11 = this.f12495c;
        boolean z12 = this.f12494b;
        Object obj = this.f12497f;
        Object obj2 = this.f12496e;
        Object obj3 = this.d;
        int i10 = 0;
        switch (i7) {
            case 0:
                p6 p6Var = (p6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = p6Var.f12422a;
                SharedPreferences sharedPreferences = p6Var.f12431l;
                if (z12) {
                    p6Var.f12437r = false;
                } else {
                    p6Var.f12436q = false;
                }
                org.telegram.messenger.a8.b("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    tr.a0(i11).m1(tL_stories_allStories.users, null, true, true);
                    if (!z12) {
                        p6Var.f12440u = tL_stories_allStories.count;
                        p6Var.f12435p = tL_stories_allStories.has_more;
                        p6Var.f12434o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", p6Var.f12434o).putBoolean("last_stories_has_more", p6Var.f12435p).putInt("total_stores", p6Var.f12440u).apply();
                    } else {
                        p6Var.v = tL_stories_allStories.count;
                        p6Var.f12444z = tL_stories_allStories.has_more;
                        p6Var.f12443y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", p6Var.f12443y).putBoolean("last_stories_has_more_hidden", p6Var.f12444z).putInt("total_stores_hidden", p6Var.v).apply();
                    }
                    p6Var.b0(tL_stories_allStories, z12, false, z11);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z12) {
                        p6Var.f12435p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        p6Var.f12434o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", p6Var.f12434o).apply();
                    } else {
                        p6Var.f12444z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        p6Var.f12443y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", p6Var.f12443y).apply();
                    }
                    if (z12) {
                        z10 = p6Var.f12444z;
                    } else {
                        z10 = p6Var.f12435p;
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
                ai.n nVar = (ai.n) obj;
                int i12 = c7Var.f11854a;
                tr trVar = c7Var.f11855b;
                SQLiteDatabase sQLiteDatabase = trVar.f27082b;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i13);
                    long o4 = org.telegram.messenger.n5.o(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i14 = i10; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f10 = c7Var.f(arrayList2.get(i14).f28670id, o4);
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
                        if (org.telegram.messenger.s2.f26749a) {
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
                org.telegram.messenger.g0.g3(nVar);
                return;
            case 2:
                ProfileActivity.Z((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z12, z11);
                return;
            case 3:
                final s11 s11Var = (s11) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap hashMap = ri.d0(s11Var.W).f26661r;
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean d = org.telegram.messenger.j6.d(str);
                final ArrayList arrayList6 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                final ArrayList arrayList7 = new ArrayList();
                final boolean z13 = this.f12494b;
                final boolean z14 = this.f12495c;
                x10 x10Var2 = new x10() {
                    @Override
                    public final void a(Object obj4) {
                        Runnable runnable = (Runnable) obj4;
                        final s11 s11Var2 = s11.this;
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
                                s11 s11Var3 = s11.this;
                                wz0 wz0Var = s11Var3.K1;
                                if (wz0Var != null) {
                                    org.telegram.messenger.g0.r(wz0Var);
                                    s11Var3.K1 = null;
                                }
                                String str3 = s11Var3.B1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                s11Var3.A1 = true;
                                s11Var3.z(true, z15);
                                k01 k01Var = s11Var3.f51836g0;
                                if (k01Var != null) {
                                    k01Var.d(true);
                                }
                                ArrayList arrayList12 = s11Var3.C1;
                                if (arrayList12 == null) {
                                    s11Var3.C1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                ArrayList arrayList13 = s11Var3.F1;
                                if (arrayList13 == null) {
                                    s11Var3.F1 = new ArrayList();
                                } else {
                                    arrayList13.clear();
                                }
                                ArrayList arrayList14 = s11Var3.E1;
                                if (arrayList14 == null) {
                                    s11Var3.E1 = new ArrayList();
                                } else {
                                    arrayList14.clear();
                                }
                                ArrayList arrayList15 = s11Var3.D1;
                                if (arrayList15 == null) {
                                    s11Var3.D1 = new ArrayList();
                                } else {
                                    arrayList15.clear();
                                }
                                int i16 = 0;
                                s11Var3.f51842j0.v0(0);
                                int i17 = s11Var3.f51819a0;
                                if (i17 == 1 || i17 == 14 || i17 == 11 || i17 == 2) {
                                    ArrayList arrayList16 = arrayList8;
                                    if (!arrayList16.isEmpty()) {
                                        s11Var3.C1.addAll(arrayList16);
                                    } else {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap3.get(str4);
                                        if (tL_availableReaction != null) {
                                            s11Var3.C1.add(ch.p0.c(tL_availableReaction));
                                        }
                                    }
                                    ArrayList arrayList17 = arrayList9;
                                    if (!arrayList17.isEmpty()) {
                                        s11Var3.D1.addAll(arrayList17);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l10 = (Long) it.next();
                                    l10.getClass();
                                    ArrayList arrayList18 = s11Var3.C1;
                                    ?? obj5 = new Object();
                                    long longValue2 = l10.longValue();
                                    obj5.f5505g = longValue2;
                                    obj5.h = longValue2;
                                    arrayList18.add(obj5);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    s11Var3.C1.add(ch.p0.b((String) it2.next()));
                                }
                                s11Var3.F1.addAll(arrayList10);
                                ArrayList arrayList19 = arrayList11;
                                int size = arrayList19.size();
                                while (i16 < size) {
                                    Object obj6 = arrayList19.get(i16);
                                    i16++;
                                    s11Var3.E1.addAll((ArrayList) obj6);
                                }
                                s11Var3.f51857r0.E(true ^ z16);
                            }
                        });
                    }
                };
                int i16 = s11Var.f51819a0;
                if (i16 == 13) {
                    Utilities.u(0, new x10() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    s11 s11Var2 = s11Var;
                                    org.telegram.messenger.ri.d0(s11Var2.W).X(s11.f51816c2, str, false, new aj0(15, linkedHashSet2, (Runnable) obj4), false, false, false, false, 0);
                                    return;
                                default:
                                    s11 s11Var3 = s11Var;
                                    String str2 = str;
                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(s11Var3.W);
                                    d01 d01Var = new d01(linkedHashSet2, (Runnable) obj4, 0);
                                    if (str2 == null) {
                                        d01Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.f22809g.c(new org.telegram.messenger.tl(str2, d02.u0(5), d02.f26667t0[1], d01Var, 16));
                                    return;
                            }
                        }
                    }, x10Var2);
                    return;
                } else if (i16 == 14) {
                    if (d) {
                        x10Var = new x10() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects G0 = org.telegram.messenger.mp.u1(s11Var.W).G0();
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
                                        s11 s11Var2 = s11Var;
                                        org.telegram.messenger.ri.d0(s11Var2.W).X(s11.f51816c2, str, false, new a1.d(s11Var2, arrayList5, arrayList4, (Runnable) obj4, 18), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    } else {
                        x10Var = new x10() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects G0 = org.telegram.messenger.mp.u1(s11Var.W).G0();
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
                                        s11 s11Var2 = s11Var;
                                        org.telegram.messenger.ri.d0(s11Var2.W).X(s11.f51816c2, str, false, new a1.d(s11Var2, arrayList5, arrayList4, (Runnable) obj4, 18), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.u(0, x10Var, x10Var2);
                    return;
                } else {
                    Utilities.u(0, new kb(d, str, linkedHashSet, 4), new x10() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    s11 s11Var2 = s11Var;
                                    org.telegram.messenger.ri.d0(s11Var2.W).X(s11.f51816c2, str, false, new aj0(15, linkedHashSet, (Runnable) obj4), false, false, false, false, 0);
                                    return;
                                default:
                                    s11 s11Var3 = s11Var;
                                    String str2 = str;
                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(s11Var3.W);
                                    d01 d01Var = new d01(linkedHashSet, (Runnable) obj4, 0);
                                    if (str2 == null) {
                                        d01Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.f22809g.c(new org.telegram.messenger.tl(str2, d02.u0(5), d02.f26667t0[1], d01Var, 16));
                                    return;
                            }
                        }
                    }, new bi.m2(s11Var, strArr, str, linkedHashSet, 13), new ut0(s11Var, d, linkedHashSet, str, hashMap, arrayList4), new bi.m2(s11Var, str, arrayList6, hashMap2, 14), new org.telegram.ui.x(s11Var, str, arrayList7, 12), x10Var2);
                    return;
                }
            case 4:
                p4.v vVar = (p4.v) obj;
                p4.e0 e0Var = ((p4.n0) ((m.b3) obj3).d).h;
                p4.i1 i1Var = e0Var.f55245t;
                jb.b(i1Var, (p4.w) obj2);
                int i17 = i1Var.i();
                if (z12) {
                    if (i17 == 1) {
                        if (i1Var.p0(2)) {
                            i1Var.a();
                        }
                    } else if (i17 == 4 && i1Var.p0(4)) {
                        i1Var.G();
                    }
                }
                if (z11 && i1Var.p0(1)) {
                    i1Var.f();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i18 : new int[]{31, 2}) {
                    la.p(!false);
                    sparseBooleanArray.append(i18, true);
                }
                if (z11) {
                    la.p(!false);
                    sparseBooleanArray.append(1, true);
                }
                la.p(!false);
                e0Var.p(vVar);
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
                sg.i0 i0Var = ((sg.s0) obj3).E.f57399c;
                yt0 yt0Var = i0Var.f57267g;
                sg.h0 h = i0Var.h(new RectF(0.0f, 0.0f, yt0Var.f42553a, yt0Var.f42554b), false, z12, z11);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f57257b;
                }
                countDownLatch.countDown();
                return;
        }
    }

    public q5(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i7) {
        this.f12493a = i7;
        this.d = obj;
        this.f12496e = obj2;
        this.f12494b = z10;
        this.f12495c = z11;
        this.f12497f = obj3;
    }

    public q5(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.f12493a = 2;
        this.d = profileActivity;
        this.f12496e = user;
        this.f12497f = str;
        this.f12494b = z10;
        this.f12495c = z11;
    }

    public q5(sg.s0 s0Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f12493a = 6;
        this.d = s0Var;
        this.f12494b = z10;
        this.f12495c = z11;
        this.f12496e = bitmapArr;
        this.f12497f = countDownLatch;
    }
}
