package di;

import a8.ia;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import c8.ab;
import fi.nb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.t11;
import org.telegram.ui.xt0;
public final class a6 implements Runnable {
    public final int f8815a;
    public final boolean f8816b;
    public final boolean f8817c;
    public final Object d;
    public final Object f8818e;
    public final Object f8819f;

    public a6(z6 z6Var, boolean z9, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z10) {
        this.f8815a = 0;
        this.d = z6Var;
        this.f8816b = z9;
        this.f8818e = tL_stories_getAllStories;
        this.f8819f = tLObject;
        this.f8817c = z10;
    }

    @Override
    public final void run() {
        boolean z9;
        c20 c20Var;
        int[] iArr;
        int i7 = this.f8815a;
        boolean z10 = this.f8817c;
        boolean z11 = this.f8816b;
        Object obj = this.f8819f;
        Object obj2 = this.f8818e;
        Object obj3 = this.d;
        int i10 = 0;
        switch (i7) {
            case 0:
                z6 z6Var = (z6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = z6Var.f9997a;
                SharedPreferences sharedPreferences = z6Var.f10006l;
                if (z11) {
                    z6Var.f10012r = false;
                } else {
                    z6Var.f10011q = false;
                }
                org.telegram.messenger.a8.b("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    yr.a0(i11).m1(tL_stories_allStories.users, null, true, true);
                    if (!z11) {
                        z6Var.f10015u = tL_stories_allStories.count;
                        z6Var.f10010p = tL_stories_allStories.has_more;
                        z6Var.f10009o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", z6Var.f10009o).putBoolean("last_stories_has_more", z6Var.f10010p).putInt("total_stores", z6Var.f10015u).apply();
                    } else {
                        z6Var.v = tL_stories_allStories.count;
                        z6Var.f10019z = tL_stories_allStories.has_more;
                        z6Var.f10018y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", z6Var.f10018y).putBoolean("last_stories_has_more_hidden", z6Var.f10019z).putInt("total_stores_hidden", z6Var.v).apply();
                    }
                    z6Var.b0(tL_stories_allStories, z11, false, z10);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z11) {
                        z6Var.f10010p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        z6Var.f10009o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", z6Var.f10009o).apply();
                    } else {
                        z6Var.f10019z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        z6Var.f10018y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", z6Var.f10018y).apply();
                    }
                    if (z11) {
                        z9 = z6Var.f10019z;
                    } else {
                        z9 = z6Var.f10010p;
                    }
                    if (z9) {
                        qs.f(i11).k(324, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                m7 m7Var = (m7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ai.m0 m0Var = (ai.m0) obj;
                int i12 = m7Var.f9367a;
                yr yrVar = m7Var.f9368b;
                SQLiteDatabase sQLiteDatabase = yrVar.f26725b;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i13);
                    long o4 = org.telegram.messenger.m5.o(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i14 = i10; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f10 = m7Var.f(arrayList2.get(i14).f27199id, o4);
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
                if (!z11) {
                    try {
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User a22 = qp.s1(i12).a2(Long.valueOf(longValue));
                                if (a22 == null) {
                                    a22 = yr.a0(i12).j0(longValue);
                                }
                                if (a22 == null || (a22.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j3 = -longValue;
                                TLRPC.Chat M0 = qp.s1(i12).M0(Long.valueOf(j3));
                                if (M0 == null) {
                                    M0 = yr.a0(i12).O(j3);
                                }
                                if (M0 == null || (M0.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (org.telegram.messenger.r2.f25216a) {
                            org.telegram.messenger.a8.b("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList3));
                        }
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id IN(" + TextUtils.join(",", arrayList3) + ")").stepThis().dispose();
                    } catch (Throwable th2) {
                        yrVar.o(th2, true);
                    }
                }
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i15);
                    m7Var.g(org.telegram.messenger.m5.o(peerStories2.peer), peerStories2);
                }
                org.telegram.messenger.g0.h3(m0Var);
                return;
            case 2:
                ProfileActivity.Z((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z11, z10);
                return;
            case 3:
                final t11 t11Var = (t11) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap hashMap = ui.b0(t11Var.V).f25840r;
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean d = org.telegram.messenger.i6.d(str);
                final ArrayList arrayList6 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                final ArrayList arrayList7 = new ArrayList();
                final boolean z12 = this.f8816b;
                final boolean z13 = this.f8817c;
                c20 c20Var2 = new c20() {
                    @Override
                    public final void a(Object obj4) {
                        Runnable runnable = (Runnable) obj4;
                        final t11 t11Var2 = t11.this;
                        final String str2 = str;
                        final boolean z14 = z12;
                        final ArrayList arrayList8 = arrayList4;
                        final HashMap hashMap3 = hashMap;
                        final ArrayList arrayList9 = arrayList5;
                        final LinkedHashSet linkedHashSet3 = linkedHashSet;
                        final LinkedHashSet linkedHashSet4 = linkedHashSet2;
                        final ArrayList arrayList10 = arrayList7;
                        final ArrayList arrayList11 = arrayList6;
                        final boolean z15 = z13;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                t11 t11Var3 = t11.this;
                                xz0 xz0Var = t11Var3.J1;
                                if (xz0Var != null) {
                                    org.telegram.messenger.g0.r(xz0Var);
                                    t11Var3.J1 = null;
                                }
                                String str3 = t11Var3.A1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                t11Var3.f50076z1 = true;
                                t11Var3.z(true, z14);
                                l01 l01Var = t11Var3.f50032f0;
                                if (l01Var != null) {
                                    l01Var.d(true);
                                }
                                ArrayList arrayList12 = t11Var3.B1;
                                if (arrayList12 == null) {
                                    t11Var3.B1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                ArrayList arrayList13 = t11Var3.E1;
                                if (arrayList13 == null) {
                                    t11Var3.E1 = new ArrayList();
                                } else {
                                    arrayList13.clear();
                                }
                                ArrayList arrayList14 = t11Var3.D1;
                                if (arrayList14 == null) {
                                    t11Var3.D1 = new ArrayList();
                                } else {
                                    arrayList14.clear();
                                }
                                ArrayList arrayList15 = t11Var3.C1;
                                if (arrayList15 == null) {
                                    t11Var3.C1 = new ArrayList();
                                } else {
                                    arrayList15.clear();
                                }
                                int i16 = 0;
                                t11Var3.f50038i0.v0(0);
                                int i17 = t11Var3.W;
                                if (i17 == 1 || i17 == 14 || i17 == 11 || i17 == 2) {
                                    ArrayList arrayList16 = arrayList8;
                                    if (!arrayList16.isEmpty()) {
                                        t11Var3.B1.addAll(arrayList16);
                                    } else {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap3.get(str4);
                                        if (tL_availableReaction != null) {
                                            t11Var3.B1.add(ch.o0.c(tL_availableReaction));
                                        }
                                    }
                                    ArrayList arrayList17 = arrayList9;
                                    if (!arrayList17.isEmpty()) {
                                        t11Var3.C1.addAll(arrayList17);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l10 = (Long) it.next();
                                    l10.getClass();
                                    ArrayList arrayList18 = t11Var3.B1;
                                    ?? obj5 = new Object();
                                    long longValue2 = l10.longValue();
                                    obj5.f6360g = longValue2;
                                    obj5.h = longValue2;
                                    arrayList18.add(obj5);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    t11Var3.B1.add(ch.o0.b((String) it2.next()));
                                }
                                t11Var3.E1.addAll(arrayList10);
                                ArrayList arrayList19 = arrayList11;
                                int size = arrayList19.size();
                                while (i16 < size) {
                                    Object obj6 = arrayList19.get(i16);
                                    i16++;
                                    t11Var3.D1.addAll((ArrayList) obj6);
                                }
                                t11Var3.f50052q0.E(true ^ z15);
                            }
                        });
                    }
                };
                int i16 = t11Var.W;
                if (i16 == 13) {
                    Utilities.u(0, new c20() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    t11 t11Var2 = t11Var;
                                    org.telegram.messenger.ui.b0(t11Var2.V).V(t11.f50015b2, str, false, new ok0(12, linkedHashSet2, (Runnable) obj4), false, false, false, false, 0);
                                    return;
                                default:
                                    t11 t11Var3 = t11Var;
                                    String str2 = str;
                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(t11Var3.V);
                                    e01 e01Var = new e01(linkedHashSet2, (Runnable) obj4, 0);
                                    if (str2 == null) {
                                        e01Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.f21343g.c(new org.telegram.messenger.em(str2, b02.s0(5), b02.f25844s0[1], e01Var, 16));
                                    return;
                            }
                        }
                    }, c20Var2);
                    return;
                } else if (i16 == 14) {
                    if (d) {
                        c20Var = new c20() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.qp.s1(t11Var.V).E0();
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
                                                        arrayList8.add(ch.o0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        t11 t11Var2 = t11Var;
                                        org.telegram.messenger.ui.b0(t11Var2.V).V(t11.f50015b2, str, false, new a1.d(t11Var2, arrayList5, arrayList4, (Runnable) obj4, 18), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    } else {
                        c20Var = new c20() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList8;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.qp.s1(t11Var.V).E0();
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
                                                        arrayList8.add(ch.o0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        t11 t11Var2 = t11Var;
                                        org.telegram.messenger.ui.b0(t11Var2.V).V(t11.f50015b2, str, false, new a1.d(t11Var2, arrayList5, arrayList4, (Runnable) obj4, 18), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.u(0, c20Var, c20Var2);
                    return;
                } else {
                    Utilities.u(0, new nb(d, str, linkedHashSet, 4), new c20() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    t11 t11Var2 = t11Var;
                                    org.telegram.messenger.ui.b0(t11Var2.V).V(t11.f50015b2, str, false, new ok0(12, linkedHashSet, (Runnable) obj4), false, false, false, false, 0);
                                    return;
                                default:
                                    t11 t11Var3 = t11Var;
                                    String str2 = str;
                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(t11Var3.V);
                                    e01 e01Var = new e01(linkedHashSet, (Runnable) obj4, 0);
                                    if (str2 == null) {
                                        e01Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.f21343g.c(new org.telegram.messenger.em(str2, b02.s0(5), b02.f25844s0[1], e01Var, 16));
                                    return;
                            }
                        }
                    }, new s2(t11Var, strArr, str, linkedHashSet, 12), new xt0(t11Var, d, linkedHashSet, str, hashMap, arrayList4), new s2((Object) t11Var, str, arrayList6, (Object) hashMap2, 13), new org.telegram.ui.y(t11Var, str, arrayList7, 12), c20Var2);
                    return;
                }
            case 4:
                p4.v vVar = (p4.v) obj;
                p4.d0 d0Var = ((p4.m0) ((m.c3) obj3).d).h;
                p4.g1 g1Var = d0Var.f53229t;
                ab.b(g1Var, (p4.w) obj2);
                int i17 = g1Var.i();
                if (z11) {
                    if (i17 == 1) {
                        if (g1Var.p0(2)) {
                            g1Var.a();
                        }
                    } else if (i17 == 4 && g1Var.p0(4)) {
                        g1Var.G();
                    }
                }
                if (z10 && g1Var.p0(1)) {
                    g1Var.f();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i18 : new int[]{31, 2}) {
                    ia.p(!false);
                    sparseBooleanArray.append(i18, true);
                }
                if (z10) {
                    ia.p(!false);
                    sparseBooleanArray.append(1, true);
                }
                ia.p(!false);
                d0Var.p(vVar);
                return;
            case 5:
                Runnable runnable = (Runnable) obj;
                ((sg.j0) obj3).l((sg.k0) obj2, z11, z10);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                sg.j0 j0Var = ((sg.t0) obj3).D.f55235c;
                nt0 nt0Var = j0Var.f55103g;
                sg.i0 h = j0Var.h(new RectF(0.0f, 0.0f, nt0Var.f36392a, nt0Var.f36393b), false, z11, z10);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.f55091b;
                }
                countDownLatch.countDown();
                return;
        }
    }

    public a6(Object obj, Object obj2, boolean z9, boolean z10, Object obj3, int i7) {
        this.f8815a = i7;
        this.d = obj;
        this.f8818e = obj2;
        this.f8816b = z9;
        this.f8817c = z10;
        this.f8819f = obj3;
    }

    public a6(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z9, boolean z10) {
        this.f8815a = 2;
        this.d = profileActivity;
        this.f8818e = user;
        this.f8819f = str;
        this.f8816b = z9;
        this.f8817c = z10;
    }

    public a6(sg.t0 t0Var, boolean z9, boolean z10, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.f8815a = 6;
        this.d = t0Var;
        this.f8816b = z9;
        this.f8817c = z10;
        this.f8818e = bitmapArr;
        this.f8819f = countDownLatch;
    }
}
