package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ProfileActivity;
public final class hy6 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public hy6(c99 c99Var, boolean z, boolean z2, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.a = (byte) 3;
        this.d = c99Var;
        this.b = z;
        this.c = z2;
        this.e = bitmapArr;
        this.f = countDownLatch;
    }

    @Override
    public final void run() {
        qac qacVar;
        boolean z;
        byte b = this.a;
        boolean z2 = this.c;
        boolean z3 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                sw6 sw6Var = (sw6) obj;
                tx6 tx6Var = ((ly6) ((s34) obj3).d).j;
                tx6Var.t();
                cf8 cf8Var = tx6Var.t;
                zqe.b(cf8Var, (tw6) obj2);
                int h = cf8Var.h();
                if (z3) {
                    if (h == 1) {
                        if (cf8Var.m0(2)) {
                            cf8Var.a();
                        }
                    } else if (h == 4 && cf8Var.m0(4)) {
                        cf8Var.E();
                    }
                }
                if (z2 && cf8Var.m0(1)) {
                    cf8Var.j();
                }
                me8 me8Var = new me8();
                me8Var.a.d(31, 2);
                me8Var.a(1, z2);
                me8Var.b();
                tx6Var.n(sw6Var);
                return;
            case 1:
                wp5 wp5Var = (wp5) obj;
                ((hw7) obj3).l((f08) obj2, z3, z2);
                if (wp5Var != null) {
                    wp5Var.run();
                    return;
                }
                return;
            case 2:
                RectF rectF = ProfileActivity.e7;
                ((ProfileActivity) obj3).H2((TLRPC.User) obj2, (String) obj, z3, z2);
                return;
            case 3:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                hw7 hw7Var = ((c99) obj3).E.c;
                xka xkaVar = hw7Var.g;
                mj4 h2 = hw7Var.h(new RectF(0.0f, 0.0f, xkaVar.a, xkaVar.b), false, z3, z2);
                if (h2 != null) {
                    bitmapArr[0] = (Bitmap) h2.b;
                }
                countDownLatch.countDown();
                return;
            case 4:
                final vz9 vz9Var = (vz9) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap hashMap = hs6.d0(vz9Var.W).r;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                boolean d = gw3.d(str);
                final ArrayList arrayList3 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                final ArrayList arrayList4 = new ArrayList();
                final boolean z4 = this.b;
                final boolean z5 = this.c;
                qac qacVar2 = new qac() {
                    @Override
                    public final void a(Object obj4) {
                        Runnable runnable = (Runnable) obj4;
                        final vz9 vz9Var2 = vz9.this;
                        final String str2 = str;
                        final boolean z6 = z4;
                        final ArrayList arrayList5 = arrayList;
                        final HashMap hashMap3 = hashMap;
                        final ArrayList arrayList6 = arrayList2;
                        final LinkedHashSet linkedHashSet3 = linkedHashSet;
                        final LinkedHashSet linkedHashSet4 = linkedHashSet2;
                        final ArrayList arrayList7 = arrayList4;
                        final ArrayList arrayList8 = arrayList3;
                        final boolean z7 = z5;
                        gm.c3(new Runnable() {
                            @Override
                            public final void run() {
                                vz9 vz9Var3 = vz9.this;
                                zx9 zx9Var = vz9Var3.K1;
                                if (zx9Var != null) {
                                    gm.r(zx9Var);
                                    vz9Var3.K1 = null;
                                }
                                String str3 = vz9Var3.B1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                vz9Var3.A1 = true;
                                vz9Var3.z(true, z6);
                                ny9 ny9Var = vz9Var3.g0;
                                if (ny9Var != null) {
                                    ny9Var.d(true);
                                }
                                ArrayList arrayList9 = vz9Var3.C1;
                                if (arrayList9 == null) {
                                    vz9Var3.C1 = new ArrayList();
                                } else {
                                    arrayList9.clear();
                                }
                                ArrayList arrayList10 = vz9Var3.F1;
                                if (arrayList10 == null) {
                                    vz9Var3.F1 = new ArrayList();
                                } else {
                                    arrayList10.clear();
                                }
                                ArrayList arrayList11 = vz9Var3.E1;
                                if (arrayList11 == null) {
                                    vz9Var3.E1 = new ArrayList();
                                } else {
                                    arrayList11.clear();
                                }
                                ArrayList arrayList12 = vz9Var3.D1;
                                if (arrayList12 == null) {
                                    vz9Var3.D1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                int i = 0;
                                vz9Var3.j0.w0(0);
                                int i2 = vz9Var3.a0;
                                if (i2 == 1 || i2 == 14 || i2 == 11 || i2 == 2) {
                                    ArrayList arrayList13 = arrayList5;
                                    if (!arrayList13.isEmpty()) {
                                        vz9Var3.C1.addAll(arrayList13);
                                    } else {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap3.get(str4);
                                        if (tL_availableReaction != null) {
                                            vz9Var3.C1.add(k39.c(tL_availableReaction));
                                        }
                                    }
                                    ArrayList arrayList14 = arrayList6;
                                    if (!arrayList14.isEmpty()) {
                                        vz9Var3.D1.addAll(arrayList14);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l = (Long) it.next();
                                    l.getClass();
                                    ArrayList arrayList15 = vz9Var3.C1;
                                    ?? obj5 = new Object();
                                    long longValue = l.longValue();
                                    obj5.g = longValue;
                                    obj5.h = longValue;
                                    arrayList15.add(obj5);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    vz9Var3.C1.add(k39.b((String) it2.next()));
                                }
                                vz9Var3.F1.addAll(arrayList7);
                                ArrayList arrayList16 = arrayList8;
                                int size = arrayList16.size();
                                while (i < size) {
                                    Object obj6 = arrayList16.get(i);
                                    i++;
                                    vz9Var3.E1.addAll((ArrayList) obj6);
                                }
                                vz9Var3.r0.E(!z7);
                            }
                        });
                    }
                };
                int i = vz9Var.a0;
                if (i == 13) {
                    Utilities.u(0, new qac() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    vz9 vz9Var2 = vz9Var;
                                    hs6.d0(vz9Var2.W).X(vz9.c2, str, false, new xr8(linkedHashSet2, (Runnable) obj4, (byte) 16), false, false, false, false, 0);
                                    return;
                                default:
                                    vz9 vz9Var3 = vz9Var;
                                    String str2 = str;
                                    hs6 d0 = hs6.d0(vz9Var3.W);
                                    gy9 gy9Var = new gy9(linkedHashSet2, (Runnable) obj4, (byte) 0);
                                    if (str2 == null) {
                                        gy9Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.g.c(new d65(str2, d0.t0(5), d0.t0[1], gy9Var, (byte) 28));
                                    return;
                            }
                        }
                    }, qacVar2);
                    return;
                } else if (i == 14) {
                    if (d) {
                        qacVar = new qac() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList5;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects D0 = oc7.r1(vz9Var.W).D0();
                                        if (D0 != null) {
                                            for (int i2 = 0; i2 < D0.effects.size(); i2++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = D0.effects.get(i2);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList5 = arrayList2;
                                                        } else {
                                                            arrayList5 = arrayList;
                                                        }
                                                        arrayList5.add(k39.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        vz9 vz9Var2 = vz9Var;
                                        hs6.d0(vz9Var2.W).X(vz9.c2, str, false, new lu(vz9Var2, arrayList2, arrayList, (Runnable) obj4, (byte) 17), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    } else {
                        qacVar = new qac() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList5;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects D0 = oc7.r1(vz9Var.W).D0();
                                        if (D0 != null) {
                                            for (int i2 = 0; i2 < D0.effects.size(); i2++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = D0.effects.get(i2);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList5 = arrayList2;
                                                        } else {
                                                            arrayList5 = arrayList;
                                                        }
                                                        arrayList5.add(k39.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        vz9 vz9Var2 = vz9Var;
                                        hs6.d0(vz9Var2.W).X(vz9.c2, str, false, new lu(vz9Var2, arrayList2, arrayList, (Runnable) obj4, (byte) 17), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.u(0, qacVar, qacVar2);
                    return;
                } else {
                    Utilities.u(0, new z52(d, str, linkedHashSet, (byte) 4), new qac() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    vz9 vz9Var2 = vz9Var;
                                    hs6.d0(vz9Var2.W).X(vz9.c2, str, false, new xr8(linkedHashSet, (Runnable) obj4, (byte) 16), false, false, false, false, 0);
                                    return;
                                default:
                                    vz9 vz9Var3 = vz9Var;
                                    String str2 = str;
                                    hs6 d0 = hs6.d0(vz9Var3.W);
                                    gy9 gy9Var = new gy9(linkedHashSet, (Runnable) obj4, (byte) 0);
                                    if (str2 == null) {
                                        gy9Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.g.c(new d65(str2, d0.t0(5), d0.t0[1], gy9Var, (byte) 28));
                                    return;
                            }
                        }
                    }, new jv0(vz9Var, strArr, str, linkedHashSet, (byte) 19), new un8(vz9Var, d, linkedHashSet, str, hashMap, arrayList), new jv0((Object) vz9Var, str, (Object) arrayList3, (Object) hashMap2, (byte) 20), new i48(vz9Var, str, arrayList4, (byte) 5), qacVar2);
                    return;
                }
            case 5:
                h4b h4bVar = (h4b) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i2 = h4bVar.a;
                SharedPreferences sharedPreferences = h4bVar.l;
                if (z3) {
                    h4bVar.r = false;
                } else {
                    h4bVar.q = false;
                }
                fc4.b("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    cf7.Y(i2).j1(tL_stories_allStories.users, null, true, true);
                    int i3 = tL_stories_allStories.count;
                    if (!z3) {
                        h4bVar.u = i3;
                        h4bVar.p = tL_stories_allStories.has_more;
                        h4bVar.o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", h4bVar.o).putBoolean("last_stories_has_more", h4bVar.p).putInt("total_stores", h4bVar.u).apply();
                    } else {
                        h4bVar.v = i3;
                        h4bVar.z = tL_stories_allStories.has_more;
                        h4bVar.y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", h4bVar.y).putBoolean("last_stories_has_more_hidden", h4bVar.z).putInt("total_stores_hidden", h4bVar.v).apply();
                    }
                    h4bVar.a0(tL_stories_allStories, z3, false, z2);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z3) {
                        h4bVar.p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        h4bVar.o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", h4bVar.o).apply();
                        z = h4bVar.p;
                    } else {
                        h4bVar.z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        h4bVar.y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", h4bVar.y).apply();
                        z = h4bVar.z;
                    }
                    if (z) {
                        nm7.f(i2).k(329, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                t4b t4bVar = (t4b) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                jd jdVar = (jd) obj;
                int i4 = t4bVar.a;
                cf7 cf7Var = t4bVar.b;
                SQLiteDatabase sQLiteDatabase = cf7Var.b;
                for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList5.get(i5);
                    long n = pg3.n(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList6 = peerStories.stories;
                        for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                            if (arrayList6.get(i6) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem e = t4bVar.e(arrayList6.get(i6).id, n);
                                if (e instanceof TL_stories.TL_storyItem) {
                                    arrayList6.set(i6, e);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                }
                if (!z3) {
                    try {
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList7 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User W1 = oc7.r1(i4).W1(Long.valueOf(longValue));
                                if (W1 == null) {
                                    W1 = cf7.Y(i4).g0(longValue);
                                }
                                if (W1 == null || (W1.stories_hidden == z2 && !arrayList7.contains(Long.valueOf(longValue)))) {
                                    arrayList7.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j = -longValue;
                                TLRPC.Chat L0 = oc7.r1(i4).L0(Long.valueOf(j));
                                if (L0 == null) {
                                    L0 = cf7.Y(i4).N(j);
                                }
                                if (L0 == null || (L0.stories_hidden == z2 && !arrayList7.contains(Long.valueOf(longValue)))) {
                                    arrayList7.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (e21.a) {
                            fc4.b("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList7));
                        }
                        Locale locale = Locale.US;
                        String join = TextUtils.join(",", arrayList7);
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id IN(" + join + ")").stepThis().dispose();
                    } catch (Throwable th) {
                        cf7Var.n(th, true);
                    }
                }
                for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList5.get(i7);
                    t4bVar.g(pg3.n(peerStories2.peer), peerStories2);
                }
                gm.c3(jdVar);
                return;
        }
    }

    public hy6(h4b h4bVar, boolean z, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z2) {
        this.a = (byte) 5;
        this.d = h4bVar;
        this.b = z;
        this.e = tL_stories_getAllStories;
        this.f = tLObject;
        this.c = z2;
    }

    public hy6(Object obj, Object obj2, boolean z, boolean z2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = z2;
        this.f = obj3;
    }

    public hy6(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z, boolean z2) {
        this.a = (byte) 2;
        this.d = profileActivity;
        this.e = user;
        this.f = str;
        this.b = z;
        this.c = z2;
    }
}
