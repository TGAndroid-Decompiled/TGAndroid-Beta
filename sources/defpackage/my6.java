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
public final class my6 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public my6(na9 na9Var, boolean z, boolean z2, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.a = (byte) 3;
        this.d = na9Var;
        this.b = z;
        this.c = z2;
        this.e = bitmapArr;
        this.f = countDownLatch;
    }

    @Override
    public final void run() {
        pcc pccVar;
        boolean z;
        byte b = this.a;
        boolean z2 = this.c;
        boolean z3 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                xw6 xw6Var = (xw6) obj;
                yx6 yx6Var = ((qy6) ((c34) obj3).d).j;
                yx6Var.t();
                og8 og8Var = yx6Var.t;
                ote.b(og8Var, (yw6) obj2);
                int h = og8Var.h();
                if (z3) {
                    if (h == 1) {
                        if (og8Var.m0(2)) {
                            og8Var.a();
                        }
                    } else if (h == 4 && og8Var.m0(4)) {
                        og8Var.E();
                    }
                }
                if (z2 && og8Var.m0(1)) {
                    og8Var.j();
                }
                yf8 yf8Var = new yf8();
                yf8Var.a.d(31, 2);
                yf8Var.a(1, z2);
                yf8Var.b();
                yx6Var.n(xw6Var);
                return;
            case 1:
                zp5 zp5Var = (zp5) obj;
                ((nx7) obj3).l((j18) obj2, z3, z2);
                if (zp5Var != null) {
                    zp5Var.run();
                    return;
                }
                return;
            case 2:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj3).F2((TLRPC.User) obj2, (String) obj, z3, z2);
                return;
            case 3:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                nx7 nx7Var = ((na9) obj3).E.c;
                qma qmaVar = nx7Var.g;
                ym4 h2 = nx7Var.h(new RectF(0.0f, 0.0f, qmaVar.a, qmaVar.b), false, z3, z2);
                if (h2 != null) {
                    bitmapArr[0] = (Bitmap) h2.b;
                }
                countDownLatch.countDown();
                return;
            case 4:
                final n1a n1aVar = (n1a) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap hashMap = ls6.d0(n1aVar.W).r;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                boolean d = pv3.d(str);
                final ArrayList arrayList3 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                final ArrayList arrayList4 = new ArrayList();
                final boolean z4 = this.b;
                final boolean z5 = this.c;
                pcc pccVar2 = new pcc() {
                    @Override
                    public final void a(Object obj4) {
                        Runnable runnable = (Runnable) obj4;
                        final n1a n1aVar2 = n1a.this;
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
                        hl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                n1a n1aVar3 = n1a.this;
                                qz9 qz9Var = n1aVar3.K1;
                                if (qz9Var != null) {
                                    hl.r(qz9Var);
                                    n1aVar3.K1 = null;
                                }
                                String str3 = n1aVar3.B1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                n1aVar3.A1 = true;
                                n1aVar3.z(true, z6);
                                e0a e0aVar = n1aVar3.g0;
                                if (e0aVar != null) {
                                    e0aVar.d(true);
                                }
                                ArrayList arrayList9 = n1aVar3.C1;
                                if (arrayList9 == null) {
                                    n1aVar3.C1 = new ArrayList();
                                } else {
                                    arrayList9.clear();
                                }
                                ArrayList arrayList10 = n1aVar3.F1;
                                if (arrayList10 == null) {
                                    n1aVar3.F1 = new ArrayList();
                                } else {
                                    arrayList10.clear();
                                }
                                ArrayList arrayList11 = n1aVar3.E1;
                                if (arrayList11 == null) {
                                    n1aVar3.E1 = new ArrayList();
                                } else {
                                    arrayList11.clear();
                                }
                                ArrayList arrayList12 = n1aVar3.D1;
                                if (arrayList12 == null) {
                                    n1aVar3.D1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                int i = 0;
                                n1aVar3.j0.x0(0);
                                int i2 = n1aVar3.a0;
                                if (i2 == 1 || i2 == 14 || i2 == 11 || i2 == 2) {
                                    ArrayList arrayList13 = arrayList5;
                                    if (!arrayList13.isEmpty()) {
                                        n1aVar3.C1.addAll(arrayList13);
                                    } else {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap3.get(str4);
                                        if (tL_availableReaction != null) {
                                            n1aVar3.C1.add(w49.c(tL_availableReaction));
                                        }
                                    }
                                    ArrayList arrayList14 = arrayList6;
                                    if (!arrayList14.isEmpty()) {
                                        n1aVar3.D1.addAll(arrayList14);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l = (Long) it.next();
                                    l.getClass();
                                    ArrayList arrayList15 = n1aVar3.C1;
                                    ?? obj5 = new Object();
                                    long longValue = l.longValue();
                                    obj5.g = longValue;
                                    obj5.h = longValue;
                                    arrayList15.add(obj5);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    n1aVar3.C1.add(w49.b((String) it2.next()));
                                }
                                n1aVar3.F1.addAll(arrayList7);
                                ArrayList arrayList16 = arrayList8;
                                int size = arrayList16.size();
                                while (i < size) {
                                    Object obj6 = arrayList16.get(i);
                                    i++;
                                    n1aVar3.E1.addAll((ArrayList) obj6);
                                }
                                n1aVar3.r0.E(!z7);
                            }
                        });
                    }
                };
                int i = n1aVar.a0;
                if (i == 13) {
                    Utilities.u(0, new pcc() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    n1a n1aVar2 = n1aVar;
                                    ls6.d0(n1aVar2.W).X(n1a.c2, str, false, new yw9(linkedHashSet2, (Runnable) obj4, (byte) 1), false, false, false, false, 0);
                                    return;
                                default:
                                    n1a n1aVar3 = n1aVar;
                                    String str2 = str;
                                    ls6 d0 = ls6.d0(n1aVar3.W);
                                    xz9 xz9Var = new xz9(linkedHashSet2, (Runnable) obj4, (byte) 0);
                                    if (str2 == null) {
                                        xz9Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.g.c(new g65(str2, d0.t0(5), d0.t0[1], xz9Var, (byte) 28));
                                    return;
                            }
                        }
                    }, pccVar2);
                    return;
                } else if (i == 14) {
                    if (d) {
                        pccVar = new pcc() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList5;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = uc7.s1(n1aVar.W).E0();
                                        if (E0 != null) {
                                            for (int i2 = 0; i2 < E0.effects.size(); i2++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i2);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList5 = arrayList2;
                                                        } else {
                                                            arrayList5 = arrayList;
                                                        }
                                                        arrayList5.add(w49.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        n1a n1aVar2 = n1aVar;
                                        ls6.d0(n1aVar2.W).X(n1a.c2, str, false, new pt(n1aVar2, arrayList2, arrayList, (Runnable) obj4, (byte) 19), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    } else {
                        pccVar = new pcc() {
                            @Override
                            public final void a(Object obj4) {
                                ArrayList arrayList5;
                                switch (r5) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = uc7.s1(n1aVar.W).E0();
                                        if (E0 != null) {
                                            for (int i2 = 0; i2 < E0.effects.size(); i2++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i2);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        if (tL_availableEffect.effect_animation_id == 0) {
                                                            arrayList5 = arrayList2;
                                                        } else {
                                                            arrayList5 = arrayList;
                                                        }
                                                        arrayList5.add(w49.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        return;
                                    default:
                                        n1a n1aVar2 = n1aVar;
                                        ls6.d0(n1aVar2.W).X(n1a.c2, str, false, new pt(n1aVar2, arrayList2, arrayList, (Runnable) obj4, (byte) 19), false, false, false, false, 0);
                                        return;
                                }
                            }
                        };
                    }
                    Utilities.u(0, pccVar, pccVar2);
                    return;
                } else {
                    Utilities.u(0, new e52(d, str, linkedHashSet, (byte) 4), new pcc() {
                        @Override
                        public final void a(Object obj4) {
                            switch (r4) {
                                case 0:
                                    n1a n1aVar2 = n1aVar;
                                    ls6.d0(n1aVar2.W).X(n1a.c2, str, false, new yw9(linkedHashSet, (Runnable) obj4, (byte) 1), false, false, false, false, 0);
                                    return;
                                default:
                                    n1a n1aVar3 = n1aVar;
                                    String str2 = str;
                                    ls6 d0 = ls6.d0(n1aVar3.W);
                                    xz9 xz9Var = new xz9(linkedHashSet, (Runnable) obj4, (byte) 0);
                                    if (str2 == null) {
                                        xz9Var.a(new ArrayList());
                                        return;
                                    }
                                    Utilities.g.c(new g65(str2, d0.t0(5), d0.t0[1], xz9Var, (byte) 28));
                                    return;
                            }
                        }
                    }, new ku0(n1aVar, strArr, str, linkedHashSet, (byte) 19), new cp8(n1aVar, d, linkedHashSet, str, hashMap, arrayList), new ku0((Object) n1aVar, str, (Object) arrayList3, (Object) hashMap2, (byte) 20), new v58(n1aVar, str, arrayList4, (byte) 5), pccVar2);
                    return;
                }
            case 5:
                c6b c6bVar = (c6b) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i2 = c6bVar.a;
                SharedPreferences sharedPreferences = c6bVar.l;
                if (z3) {
                    c6bVar.r = false;
                } else {
                    c6bVar.q = false;
                }
                cc4.b("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    jf7.Y(i2).j1(tL_stories_allStories.users, null, true, true);
                    int i3 = tL_stories_allStories.count;
                    if (!z3) {
                        c6bVar.u = i3;
                        c6bVar.p = tL_stories_allStories.has_more;
                        c6bVar.o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", c6bVar.o).putBoolean("last_stories_has_more", c6bVar.p).putInt("total_stores", c6bVar.u).apply();
                    } else {
                        c6bVar.v = i3;
                        c6bVar.z = tL_stories_allStories.has_more;
                        c6bVar.y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", c6bVar.y).putBoolean("last_stories_has_more_hidden", c6bVar.z).putInt("total_stores_hidden", c6bVar.v).apply();
                    }
                    c6bVar.a0(tL_stories_allStories, z3, false, z2);
                    return;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (!z3) {
                        c6bVar.p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        c6bVar.o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", c6bVar.o).apply();
                        z = c6bVar.p;
                    } else {
                        c6bVar.z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        c6bVar.y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", c6bVar.y).apply();
                        z = c6bVar.z;
                    }
                    if (z) {
                        jn7.f(i2).k(328, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                o6b o6bVar = (o6b) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                kc kcVar = (kc) obj;
                int i4 = o6bVar.a;
                jf7 jf7Var = o6bVar.b;
                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList5.get(i5);
                    long n = wf3.n(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList6 = peerStories.stories;
                        for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                            if (arrayList6.get(i6) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem e = o6bVar.e(arrayList6.get(i6).id, n);
                                if (e instanceof TL_stories.TL_storyItem) {
                                    arrayList6.set(i6, e);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                }
                if (!z3) {
                    try {
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList7 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User X1 = uc7.s1(i4).X1(Long.valueOf(longValue));
                                if (X1 == null) {
                                    X1 = jf7.Y(i4).g0(longValue);
                                }
                                if (X1 == null || (X1.stories_hidden == z2 && !arrayList7.contains(Long.valueOf(longValue)))) {
                                    arrayList7.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j = -longValue;
                                TLRPC.Chat M0 = uc7.s1(i4).M0(Long.valueOf(j));
                                if (M0 == null) {
                                    M0 = jf7.Y(i4).N(j);
                                }
                                if (M0 == null || (M0.stories_hidden == z2 && !arrayList7.contains(Long.valueOf(longValue)))) {
                                    arrayList7.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (f11.a) {
                            cc4.b("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList7));
                        }
                        Locale locale = Locale.US;
                        String join = TextUtils.join(",", arrayList7);
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id IN(" + join + ")").stepThis().dispose();
                    } catch (Throwable th) {
                        jf7Var.n(th, true);
                    }
                }
                for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList5.get(i7);
                    o6bVar.g(wf3.n(peerStories2.peer), peerStories2);
                }
                hl.c3(kcVar);
                return;
        }
    }

    public my6(c6b c6bVar, boolean z, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z2) {
        this.a = (byte) 5;
        this.d = c6bVar;
        this.b = z;
        this.e = tL_stories_getAllStories;
        this.f = tLObject;
        this.c = z2;
    }

    public my6(Object obj, Object obj2, boolean z, boolean z2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = z2;
        this.f = obj3;
    }

    public my6(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z, boolean z2) {
        this.a = (byte) 2;
        this.d = profileActivity;
        this.e = user;
        this.f = str;
        this.b = z;
        this.c = z2;
    }
}
