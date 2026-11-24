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
public final class hw6 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public hw6(a79 a79Var, boolean z, boolean z2, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.a = (byte) 3;
        this.d = a79Var;
        this.b = z;
        this.c = z2;
        this.e = bitmapArr;
        this.f = countDownLatch;
    }

    @Override
    public final void run() {
        p8c p8cVar;
        boolean z;
        byte b = this.a;
        boolean z2 = this.c;
        boolean z3 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                su6 su6Var = (su6) obj;
                tv6 tv6Var = ((lw6) ((h24) obj3).d).j;
                tv6Var.t();
                ad8 ad8Var = tv6Var.t;
                woe.b(ad8Var, (tu6) obj2);
                int h = ad8Var.h();
                if (z3) {
                    if (h == 1) {
                        if (ad8Var.m0(2)) {
                            ad8Var.a();
                        }
                    } else if (h == 4 && ad8Var.m0(4)) {
                        ad8Var.E();
                    }
                }
                if (z2 && ad8Var.m0(1)) {
                    ad8Var.k();
                }
                jc8 jc8Var = new jc8();
                jc8Var.a.d(31, 2);
                jc8Var.a(1, z2);
                jc8Var.b();
                tv6Var.n(su6Var);
                return;
            case 1:
                wn5 wn5Var = (wn5) obj;
                ((gu7) obj3).l((dy7) obj2, z3, z2);
                if (wn5Var != null) {
                    wn5Var.run();
                    return;
                }
                return;
            case 2:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj3).E2((TLRPC.User) obj2, (String) obj, z3, z2);
                return;
            case 3:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                gu7 gu7Var = ((a79) obj3).E.c;
                via viaVar = gu7Var.g;
                sk4 h2 = gu7Var.h(new RectF(0.0f, 0.0f, viaVar.a, viaVar.b), false, z3, z2);
                if (h2 != null) {
                    bitmapArr[0] = (Bitmap) h2.b;
                }
                countDownLatch.countDown();
                return;
            case 4:
                final tx9 tx9Var = (tx9) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap hashMap = hq6.d0(tx9Var.W).r;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                boolean d = vu3.d(str);
                final ArrayList arrayList3 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                final ArrayList arrayList4 = new ArrayList();
                final boolean z4 = this.b;
                final boolean z5 = this.c;
                p8c p8cVar2 = new p8c() {
                    @Override
                    public final void a(Object obj4) {
                        Runnable runnable = (Runnable) obj4;
                        final tx9 tx9Var2 = tx9.this;
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
                        gl.d3(new Runnable() {
                            @Override
                            public final void run() {
                                tx9 tx9Var3 = tx9.this;
                                wv9 wv9Var = tx9Var3.K1;
                                if (wv9Var != null) {
                                    gl.r(wv9Var);
                                    tx9Var3.K1 = null;
                                }
                                String str3 = tx9Var3.B1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                tx9Var3.A1 = true;
                                tx9Var3.z(true, z6);
                                lw9 lw9Var = tx9Var3.g0;
                                if (lw9Var != null) {
                                    lw9Var.d(true);
                                }
                                ArrayList arrayList9 = tx9Var3.C1;
                                if (arrayList9 == null) {
                                    tx9Var3.C1 = new ArrayList();
                                } else {
                                    arrayList9.clear();
                                }
                                ArrayList arrayList10 = tx9Var3.F1;
                                if (arrayList10 == null) {
                                    tx9Var3.F1 = new ArrayList();
                                } else {
                                    arrayList10.clear();
                                }
                                ArrayList arrayList11 = tx9Var3.E1;
                                if (arrayList11 == null) {
                                    tx9Var3.E1 = new ArrayList();
                                } else {
                                    arrayList11.clear();
                                }
                                ArrayList arrayList12 = tx9Var3.D1;
                                if (arrayList12 == null) {
                                    tx9Var3.D1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                int i = 0;
                                tx9Var3.j0.w0(0);
                                int i2 = tx9Var3.a0;
                                if (i2 == 1 || i2 == 14 || i2 == 11 || i2 == 2) {
                                    ArrayList arrayList13 = arrayList5;
                                    if (!arrayList13.isEmpty()) {
                                        tx9Var3.C1.addAll(arrayList13);
                                    } else {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap3.get(str4);
                                        if (tL_availableReaction != null) {
                                            tx9Var3.C1.add(h19.c(tL_availableReaction));
                                        }
                                    }
                                    ArrayList arrayList14 = arrayList6;
                                    if (!arrayList14.isEmpty()) {
                                        tx9Var3.D1.addAll(arrayList14);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l = (Long) it.next();
                                    l.getClass();
                                    ArrayList arrayList15 = tx9Var3.C1;
                                    ?? obj5 = new Object();
                                    long longValue = l.longValue();
                                    obj5.g = longValue;
                                    obj5.h = longValue;
                                    arrayList15.add(obj5);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    tx9Var3.C1.add(h19.b((String) it2.next()));
                                }
                                tx9Var3.F1.addAll(arrayList7);
                                ArrayList arrayList16 = arrayList8;
                                int size = arrayList16.size();
                                while (i < size) {
                                    Object obj6 = arrayList16.get(i);
                                    i++;
                                    tx9Var3.E1.addAll((ArrayList) obj6);
                                }
                                tx9Var3.r0.E(!z7);
                            }
                        });
                    }
                };
                int i = tx9Var.a0;
                if (i == 13) {
                    Utilities.u(0, new p8c() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    tx9 tx9Var2 = tx9Var;
                                    hq6.d0(tx9Var2.W).X(tx9.c2, str, false, new kq8(linkedHashSet2, (Runnable) obj4, (byte) 15), false, false, false, false, 0);
                                    return;
                                default:
                                    tx9 tx9Var3 = tx9Var;
                                    String str2 = str;
                                    hq6 d0 = hq6.d0(tx9Var3.W);
                                    dw9 dw9Var = new dw9(linkedHashSet2, (Runnable) obj4, (byte) 0);
                                    if (str2 == null) {
                                        dw9Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.g.c(new e45(str2, d0.t0(5), d0.t0[1], dw9Var, (byte) 28));
                                    return;
                            }
                        }
                    }, p8cVar2);
                    return;
                } else if (i == 14) {
                    if (d) {
                        p8cVar = new p8c() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList5;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects C0 = na7.q1(tx9Var.W).C0();
                                        if (C0 != null) {
                                            for (int i2 = 0; i2 < C0.effects.size(); i2++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = C0.effects.get(i2);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList5 = arrayList2;
                                                        } else {
                                                            arrayList5 = arrayList;
                                                        }
                                                        arrayList5.add(h19.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        tx9 tx9Var2 = tx9Var;
                                        hq6.d0(tx9Var2.W).X(tx9.c2, str, false, new lt(tx9Var2, arrayList2, arrayList, (Runnable) obj4, (byte) 17), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    } else {
                        p8cVar = new p8c() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList5;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects C0 = na7.q1(tx9Var.W).C0();
                                        if (C0 != null) {
                                            for (int i2 = 0; i2 < C0.effects.size(); i2++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = C0.effects.get(i2);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList5 = arrayList2;
                                                        } else {
                                                            arrayList5 = arrayList;
                                                        }
                                                        arrayList5.add(h19.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        tx9 tx9Var2 = tx9Var;
                                        hq6.d0(tx9Var2.W).X(tx9.c2, str, false, new lt(tx9Var2, arrayList2, arrayList, (Runnable) obj4, (byte) 17), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.u(0, p8cVar, p8cVar2);
                    return;
                } else {
                    Utilities.u(0, new o42(d, str, linkedHashSet, (byte) 4), new p8c() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    tx9 tx9Var2 = tx9Var;
                                    hq6.d0(tx9Var2.W).X(tx9.c2, str, false, new kq8(linkedHashSet, (Runnable) obj4, (byte) 15), false, false, false, false, 0);
                                    return;
                                default:
                                    tx9 tx9Var3 = tx9Var;
                                    String str2 = str;
                                    hq6 d0 = hq6.d0(tx9Var3.W);
                                    dw9 dw9Var = new dw9(linkedHashSet, (Runnable) obj4, (byte) 0);
                                    if (str2 == null) {
                                        dw9Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.g.c(new e45(str2, d0.t0(5), d0.t0[1], dw9Var, (byte) 28));
                                    return;
                            }
                        }
                    }, new au0(tx9Var, strArr, str, linkedHashSet, (byte) 19), new rl8(tx9Var, d, linkedHashSet, str, hashMap, arrayList), new au0((Object) tx9Var, str, (Object) arrayList3, (Object) hashMap2, (byte) 20), new f28(tx9Var, str, arrayList4, (byte) 5), p8cVar2);
                    return;
                }
            case 5:
                g2b g2bVar = (g2b) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i2 = g2bVar.a;
                SharedPreferences sharedPreferences = g2bVar.l;
                if (z3) {
                    g2bVar.r = false;
                } else {
                    g2bVar.q = false;
                }
                fa4.b("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    ad7.Y(i2).j1(tL_stories_allStories.users, null, true, true);
                    int i3 = tL_stories_allStories.count;
                    if (!z3) {
                        g2bVar.u = i3;
                        g2bVar.p = tL_stories_allStories.has_more;
                        g2bVar.o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", g2bVar.o).putBoolean("last_stories_has_more", g2bVar.p).putInt("total_stores", g2bVar.u).apply();
                    } else {
                        g2bVar.v = i3;
                        g2bVar.z = tL_stories_allStories.has_more;
                        g2bVar.y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", g2bVar.y).putBoolean("last_stories_has_more_hidden", g2bVar.z).putInt("total_stores_hidden", g2bVar.v).apply();
                    }
                    g2bVar.a0(tL_stories_allStories, z3, false, z2);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z3) {
                        g2bVar.p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        g2bVar.o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", g2bVar.o).apply();
                        z = g2bVar.p;
                    } else {
                        g2bVar.z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        g2bVar.y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", g2bVar.y).apply();
                        z = g2bVar.z;
                    }
                    if (z) {
                        kk7.f(i2).k(327, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                s2b s2bVar = (s2b) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                jc jcVar = (jc) obj;
                int i4 = s2bVar.a;
                ad7 ad7Var = s2bVar.b;
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList5.get(i5);
                    long n = cf3.n(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList6 = peerStories.stories;
                        for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                            if (arrayList6.get(i6) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem e = s2bVar.e(arrayList6.get(i6).id, n);
                                if (e instanceof TL_stories.TL_storyItem) {
                                    arrayList6.set(i6, e);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
                if (!z3) {
                    try {
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList7 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User V1 = na7.q1(i4).V1(Long.valueOf(longValue));
                                if (V1 == null) {
                                    V1 = ad7.Y(i4).g0(longValue);
                                }
                                if (V1 == null || (V1.stories_hidden == z2 && !arrayList7.contains(Long.valueOf(longValue)))) {
                                    arrayList7.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j = -longValue;
                                TLRPC.Chat K0 = na7.q1(i4).K0(Long.valueOf(j));
                                if (K0 == null) {
                                    K0 = ad7.Y(i4).N(j);
                                }
                                if (K0 == null || (K0.stories_hidden == z2 && !arrayList7.contains(Long.valueOf(longValue)))) {
                                    arrayList7.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (w01.a) {
                            fa4.b("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList7));
                        }
                        Locale locale = Locale.US;
                        String join = TextUtils.join(",", arrayList7);
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id IN(" + join + ")").stepThis().dispose();
                    } catch (Throwable th) {
                        ad7Var.n(th, true);
                    }
                }
                for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList5.get(i7);
                    s2bVar.g(cf3.n(peerStories2.peer), peerStories2);
                }
                gl.d3(jcVar);
                return;
        }
    }

    public hw6(g2b g2bVar, boolean z, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z2) {
        this.a = (byte) 5;
        this.d = g2bVar;
        this.b = z;
        this.e = tL_stories_getAllStories;
        this.f = tLObject;
        this.c = z2;
    }

    public hw6(Object obj, Object obj2, boolean z, boolean z2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = z2;
        this.f = obj3;
    }

    public hw6(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z, boolean z2) {
        this.a = (byte) 2;
        this.d = profileActivity;
        this.e = user;
        this.f = str;
        this.b = z;
        this.c = z2;
    }
}
