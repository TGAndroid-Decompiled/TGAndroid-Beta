package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import ci.db;
import ci.e9;
import ci.hb;
import ci.ib;
import ci.mb;
import ci.nb;
import ci.qb;
import ci.tb;
import ci.v8;
import ci.wb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.m9;
import org.telegram.messenger.n10;
import org.telegram.messenger.q00;
import org.telegram.messenger.u10;
import org.telegram.messenger.x00;
import org.telegram.messenger.ye;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.i20;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
public final class c implements n10 {
    public final int f533a;
    public final Object f534b;

    public c(Object obj, int i3) {
        this.f533a = i3;
        this.f534b = obj;
    }

    private final void b(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        f41 f41Var = (f41) obj2;
        ((fi.p) this.f534b).getClass();
        ArrayList n4 = x00.n();
        int size = n4.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = n4.get(i3);
            i3++;
            int i10 = fi.n.f11627b;
            r31 K = r31.K(fi.n.class);
            K.G = (q00) obj3;
            arrayList.add(K);
        }
    }

    private final void c(Object obj, Object obj2) {
        int i3;
        gi.m mVar = (gi.m) this.f534b;
        Canvas canvas = (Canvas) obj;
        Runnable runnable = (Runnable) obj2;
        Paint paint = mVar.J;
        RectF rectF = mVar.f13170z0;
        gi.g gVar = mVar.f13144f;
        if (mVar.g()) {
            if (mVar.H == null) {
                runnable.run();
                return;
            }
            xs editText = gVar.getEditText();
            canvas.translate(-editText.f31429q0, 0.0f);
            canvas.saveLayerAlpha(0.0f, 0.0f, mVar.H.getWidth(), mVar.H.getHeight(), 255, 31);
            rectF.set(0.0f, 1.0f, mVar.H.getWidth(), mVar.H.getHeight() - 1);
            mVar.h(mVar.Q, canvas, rectF, 0.0f, true, (-gVar.getX()) - editText.getPaddingLeft(), ((-gVar.getY()) - editText.getPaddingTop()) - editText.getExtendedPaddingTop(), true);
            canvas.save();
            paint.setAlpha(165);
            canvas.drawBitmap(mVar.H, 0.0f, 0.0f, paint);
            canvas.restore();
            canvas.restore();
            return;
        }
        Paint c2 = mVar.Q.c(1.0f);
        xs editText2 = gVar.getEditText();
        if (c2 != null) {
            i3 = -1;
        } else {
            i3 = -2130706433;
        }
        editText2.setHintColor(i3);
        if (c2 == null) {
            runnable.run();
            return;
        }
        xs editText3 = gVar.getEditText();
        canvas.saveLayerAlpha(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), 255, 31);
        runnable.run();
        canvas.drawRect(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), c2);
        canvas.restore();
    }

    private final void d(Object obj, Object obj2) {
        gi.y1 y1Var = (gi.y1) this.f534b;
        String str = (String) obj;
        gi.i2 i2Var = y1Var.f13920s;
        i2Var.f12951j1 = str;
        i2Var.k1 = ((Integer) obj2).intValue();
        y1Var.f13915c.D(str);
    }

    private final void e(Object obj, Object obj2) {
        u10 u10Var;
        gi.h3 h3Var = (gi.h3) this.f534b;
        Bitmap bitmap = (Bitmap) obj2;
        if (obj != null) {
            if (h3Var.m1 == null && (obj instanceof ye) && (u10Var = h3Var.f12873n1) != null) {
                u10Var.a((ye) obj);
                return;
            }
            return;
        }
        h3Var.getClass();
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3;
        int i10;
        float f10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        float f11;
        float f12;
        boolean z12;
        int i13;
        boolean z13;
        String str;
        int i14;
        String f13;
        int i15;
        int i16;
        int i17;
        r31 j10;
        int i18 = this.f533a;
        int i19 = 0;
        Object obj3 = this.f534b;
        switch (i18) {
            case 0:
                g gVar = (g) obj3;
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = gVar.Q1;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        m9 m9Var = gVar.R1;
                        d dVar = new d(0, gVar, tL_StarGiftAuctionAcquiredGift);
                        int i20 = e.f594b;
                        r31 K = r31.K(e.class);
                        K.G = tL_StarGiftAuctionAcquiredGift;
                        K.H = m9Var;
                        K.D = dVar;
                        arrayList.add(K);
                    }
                    arrayList.add(r31.D(org.telegram.messenger.g0.L(16.0f)));
                    return;
                }
                return;
            case 1:
                f41 f41Var2 = (f41) obj2;
                ((ArrayList) obj).add(((j) obj3).Q1);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                f41 f41Var3 = (f41) obj2;
                arrayList2.add(((e0) obj3).R1);
                arrayList2.add(r31.D(org.telegram.messenger.g0.L(16.0f)));
                return;
            case 3:
                f41 f41Var4 = (f41) obj2;
                ((ArrayList) obj).add(r31.j(-1, ((s0) obj3).S1));
                return;
            case 4:
                f41 f41Var5 = (f41) obj2;
                ((ArrayList) obj).add(r31.j(-1, ((z0) obj3).S1));
                return;
            case 5:
                ((b3) obj3).d1((ArrayList) obj, (f41) obj2);
                return;
            case 6:
                o4 o4Var = (o4) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                f41 f41Var6 = (f41) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = o4Var.f858c;
                vp0 vp0Var = o4Var.f856a;
                v8 v8Var = o4Var.f859e;
                if (v8Var != null) {
                    if ((!v8Var.f6197e || v8Var.f6199g != 783) && v8Var.f6203l.size() <= 0) {
                        v8 v8Var2 = o4Var.f859e;
                        if (v8Var2.f6201j && !v8Var2.f6200i) {
                            return;
                        }
                    }
                    v8 v8Var3 = o4Var.f859e;
                    if (v8Var3 == null || (i12 = v8Var3.f6205n) == 0) {
                        i3 = 3;
                        i10 = 3;
                    } else {
                        i3 = 3;
                        i10 = Math.min(3, i12);
                    }
                    int max = Math.max(1, i10);
                    v8 v8Var4 = o4Var.f859e;
                    if (v8Var4 != null) {
                        ArrayList arrayList4 = v8Var4.f6203l;
                        int size = arrayList4.size();
                        int i21 = i3;
                        int i22 = 0;
                        while (i22 < size) {
                            Object obj4 = arrayList4.get(i22);
                            i22++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            boolean z14 = o4Var.d;
                            int i23 = p2.f878b;
                            r31 K2 = r31.K(p2.class);
                            K2.f37636u = 1;
                            K2.f37640z = 0;
                            K2.G = savedStarGift;
                            K2.f37632q = true;
                            K2.f37622f = false;
                            K2.f37633r = z14;
                            if (o4Var.h && (o4Var.f859e != vp0Var.d || savedStarGift.pinned_to_top)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            K2.h = z10;
                            arrayList3.add(K2);
                            i21--;
                            if (i21 == 0) {
                                i21 = 3;
                            }
                        }
                        v8 v8Var5 = o4Var.f859e;
                        if (v8Var5.f6200i || !v8Var5.f6201j) {
                            int i24 = 0;
                            while (true) {
                                if (i21 <= 0) {
                                    i11 = 3;
                                } else {
                                    i11 = i21;
                                }
                                if (i24 < i11) {
                                    i24++;
                                    r31 q10 = r31.q(i24, 34);
                                    q10.f37636u = 1;
                                    arrayList3.add(q10);
                                }
                            }
                        }
                    }
                    if (vp0Var.d == o4Var.f859e) {
                        arrayList3.add(r31.D(org.telegram.messenger.g0.L(20.0f)));
                        if (vp0Var.f1012c == h10.i(o4Var.f857b).e()) {
                            int i25 = org.telegram.ui.ActionBar.k6.f28290z6;
                            int w02 = org.telegram.ui.ActionBar.k6.w0(i25, e6Var);
                            String M0 = bd.M0(2131746679, null);
                            int L = org.telegram.messenger.g0.L(24.0f);
                            int i26 = p4.f881b;
                            r31 K3 = r31.K(p4.class);
                            K3.f37627l = M0;
                            K3.f37640z = 17;
                            K3.B = w02;
                            K3.A = 14.0f;
                            K3.f37624i = L;
                            K3.f37626k = 0;
                            K3.f37632q = false;
                            K3.G = e6Var;
                            K3.H = Integer.valueOf(i25);
                            arrayList3.add(K3);
                        }
                        arrayList3.add(r31.D(org.telegram.messenger.g0.L(82.0f)));
                    } else if (!arrayList3.isEmpty()) {
                        arrayList3.add(r31.D(org.telegram.messenger.g0.L(82.0f)));
                    }
                    if (!arrayList3.isEmpty()) {
                        if (o4Var.I) {
                            f10 = 42.0f;
                        } else {
                            f10 = 12.0f;
                        }
                        arrayList3.add(0, r31.D(org.telegram.messenger.g0.L(f10)));
                    }
                    if (o4Var.f860f.getSpanCount() != max) {
                        org.telegram.messenger.g0.h3(new o3(o4Var, max, 1));
                    }
                    vp0Var.p();
                    vp0Var.post(new s(vp0Var, 6));
                    return;
                }
                return;
            case 7:
                i6 i6Var = (i6) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                f41 f41Var7 = (f41) obj2;
                w5 w5Var = i6Var.d;
                ArrayList arrayList6 = w5Var.d;
                int size2 = arrayList6.size();
                int i27 = 0;
                while (i27 < size2) {
                    Object obj5 = arrayList6.get(i27);
                    i27++;
                    arrayList5.add(p2.i(0, (TL_stars.TL_starGiftUnique) obj5, false, false, false, true, false));
                }
                if (w5Var.f1084t || !w5Var.f1085u) {
                    r31 q11 = r31.q(-1, 34);
                    q11.f37636u = 1;
                    arrayList5.add(q11);
                    r31 q12 = r31.q(-2, 34);
                    q12.f37636u = 1;
                    arrayList5.add(q12);
                    r31 q13 = r31.q(-3, 34);
                    q13.f37636u = 1;
                    arrayList5.add(q13);
                    if (w5Var.d.isEmpty()) {
                        r31 q14 = r31.q(-4, 34);
                        q14.f37636u = 1;
                        arrayList5.add(q14);
                        r31 q15 = r31.q(-5, 34);
                        q15.f37636u = 1;
                        arrayList5.add(q15);
                        r31 q16 = r31.q(-6, 34);
                        q16.f37636u = 1;
                        arrayList5.add(q16);
                        r31 q17 = r31.q(-7, 34);
                        q17.f37636u = 1;
                        arrayList5.add(q17);
                        r31 q18 = r31.q(-8, 34);
                        q18.f37636u = 1;
                        arrayList5.add(q18);
                        r31 q19 = r31.q(-9, 34);
                        q19.f37636u = 1;
                        arrayList5.add(q19);
                        r31 q20 = r31.q(-10, 34);
                        q20.f37636u = 1;
                        arrayList5.add(q20);
                        r31 q21 = r31.q(-11, 34);
                        q21.f37636u = 1;
                        arrayList5.add(q21);
                        r31 q22 = r31.q(-12, 34);
                        q22.f37636u = 1;
                        arrayList5.add(q22);
                        r31 q23 = r31.q(-13, 34);
                        q23.f37636u = 1;
                        arrayList5.add(q23);
                        r31 q24 = r31.q(-14, 34);
                        q24.f37636u = 1;
                        arrayList5.add(q24);
                        r31 q25 = r31.q(-15, 34);
                        q25.f37636u = 1;
                        arrayList5.add(q25);
                    }
                }
                if (arrayList5.isEmpty() && !w5Var.f1084t) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i6Var.f726y != z11) {
                    i6Var.f726y = z11;
                    i6Var.f725x.setVisibility(0);
                    ViewPropertyAnimator animate = i6Var.f725x.animate();
                    float f14 = 1.0f;
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f11);
                    if (z11) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.95f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                    if (!z11) {
                        f14 = 0.95f;
                    }
                    scaleX.scaleY(f14).setInterpolator(xq.h).setDuration(320L).setListener(new e5(i6Var, z11, 1)).start();
                    return;
                }
                return;
            case 8:
                h6 h6Var = (h6) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                f41 f41Var8 = (f41) obj2;
                g6 g6Var = h6Var.R1;
                if (g6Var != null) {
                    v8 v8Var6 = g6Var.f665b;
                    w5 w5Var2 = g6Var.f666c;
                    if (v8Var6 != null && w5Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(h6Var.f28583a).getCurrentTime();
                        arrayList7.add(r31.t(-1, bd.M0(2131749778, null)));
                        ArrayList arrayList8 = v8Var6.f6203l;
                        int size3 = arrayList8.size();
                        boolean z15 = true;
                        int i28 = 0;
                        int i29 = 0;
                        while (i29 < size3) {
                            Object obj6 = arrayList8.get(i29);
                            i29++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            if (!h6Var.Z1.contains(Long.valueOf(savedStarGift2.gift.f27230id))) {
                                if (savedStarGift2.can_craft_at <= currentTime) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                r31 i30 = p2.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i30.f37623g = z12;
                                arrayList7.add(i30);
                                i28++;
                                z15 = false;
                            }
                        }
                        if (!v8Var6.f6200i && v8Var6.f6201j) {
                            if (z15) {
                                arrayList7.add(r31.g(bd.M0(2131749777, null)));
                            }
                        } else {
                            int i31 = i28 % 3;
                            int i32 = 6 - i31;
                            for (int i33 = 0; i33 < i32; i33++) {
                                r31 q26 = r31.q((i33 - i31) + 1, 35);
                                q26.f37636u = 1;
                                arrayList7.add(q26);
                            }
                        }
                        if (w5Var2.f1070e > 0 || h6Var.c2) {
                            h6Var.c2 = true;
                            String M02 = bd.M0(2131749780, null);
                            r31 r31Var = new r31(42);
                            r31Var.d = -2;
                            r31Var.f37630o = M02;
                            arrayList7.add(r31Var);
                            HorizontalScrollView horizontalScrollView = h6Var.S1;
                            if (horizontalScrollView != null) {
                                arrayList7.add(r31.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList9 = w5Var2.d;
                            int size4 = arrayList9.size();
                            int i34 = 0;
                            while (i34 < size4) {
                                Object obj7 = arrayList9.get(i34);
                                i34++;
                                arrayList7.add(p2.i(0, (TL_stars.TL_starGiftUnique) obj7, false, true, false, true, true));
                            }
                            if (w5Var2.f1084t || !w5Var2.f1085u) {
                                r31 q27 = r31.q(10, 35);
                                q27.f37636u = 1;
                                arrayList7.add(q27);
                                r31 q28 = r31.q(11, 35);
                                q28.f37636u = 1;
                                arrayList7.add(q28);
                                r31 q29 = r31.q(12, 35);
                                q29.f37636u = 1;
                                arrayList7.add(q29);
                                r31 q30 = r31.q(13, 35);
                                q30.f37636u = 1;
                                arrayList7.add(q30);
                                r31 q31 = r31.q(14, 35);
                                q31.f37636u = 1;
                                arrayList7.add(q31);
                                r31 q32 = r31.q(15, 35);
                                q32.f37636u = 1;
                                arrayList7.add(q32);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                m6 m6Var = (m6) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                f41 f41Var9 = (f41) obj2;
                v8 v8Var7 = m6Var.R1;
                if (v8Var7 != null) {
                    ArrayList arrayList11 = v8Var7.f6203l;
                    arrayList10.add(r31.D(org.telegram.messenger.g0.L(16.0f)));
                    if (v8Var7.f6200i && arrayList11.isEmpty()) {
                        r31 q33 = r31.q(1, 34);
                        q33.f37636u = 1;
                        arrayList10.add(q33);
                        r31 q34 = r31.q(2, 34);
                        q34.f37636u = 1;
                        arrayList10.add(q34);
                        r31 q35 = r31.q(3, 34);
                        q35.f37636u = 1;
                        arrayList10.add(q35);
                        r31 q36 = r31.q(4, 34);
                        q36.f37636u = 1;
                        arrayList10.add(q36);
                        r31 q37 = r31.q(5, 34);
                        q37.f37636u = 1;
                        arrayList10.add(q37);
                        r31 q38 = r31.q(6, 34);
                        q38.f37636u = 1;
                        arrayList10.add(q38);
                        r31 q39 = r31.q(7, 34);
                        q39.f37636u = 1;
                        arrayList10.add(q39);
                        r31 q40 = r31.q(8, 34);
                        q40.f37636u = 1;
                        arrayList10.add(q40);
                        r31 q41 = r31.q(9, 34);
                        q41.f37636u = 1;
                        arrayList10.add(q41);
                    } else {
                        int size5 = arrayList11.size();
                        int i35 = 0;
                        while (true) {
                            int i36 = 3;
                            while (i35 < size5) {
                                Object obj8 = arrayList11.get(i35);
                                i35++;
                                TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj8;
                                if (!savedStarGift3.collection_id.contains(Integer.valueOf(m6Var.Q1))) {
                                    int i37 = p2.f878b;
                                    r31 K4 = r31.K(p2.class);
                                    K4.f37636u = 1;
                                    K4.f37640z = 0;
                                    K4.G = savedStarGift3;
                                    K4.f37632q = true;
                                    K4.f37622f = true;
                                    K4.f37633r = false;
                                    HashSet hashSet = m6Var.S1;
                                    int i38 = savedStarGift3.msg_id;
                                    K4.L(hashSet.contains(Long.valueOf(i38 == 0 ? savedStarGift3.saved_id : i38)));
                                    K4.f37636u = 1;
                                    arrayList10.add(K4);
                                    i36--;
                                    if (i36 == 0) {
                                        break;
                                    }
                                }
                            }
                            if (v8Var7.f6200i || !v8Var7.f6201j) {
                                int i39 = 0;
                                while (true) {
                                    if (i36 <= 0) {
                                        i13 = 3;
                                    } else {
                                        i13 = i36;
                                    }
                                    if (i39 < i13) {
                                        i39++;
                                        r31 q42 = r31.q(i39, 34);
                                        q42.f37636u = 1;
                                        arrayList10.add(q42);
                                    }
                                }
                            }
                        }
                    }
                    arrayList10.add(r31.D(org.telegram.messenger.g0.L(68.0f)));
                    return;
                }
                return;
            case 10:
                bi.d dVar2 = (bi.d) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ArrayList arrayList12 = dVar2.f3693e;
                dVar2.f3692c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    dVar2.f3691b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        dVar2.f3691b.serializeToStream(serializedData);
                        hp.s1(dVar2.f3690a).f22999e7.edit().putString("qrBackdrops", Utilities.f(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                if (shareThemeBackdrops != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                dVar2.d = z13;
                ArrayList arrayList13 = new ArrayList(arrayList12);
                arrayList12.clear();
                int size6 = arrayList13.size();
                int i40 = 0;
                while (i40 < size6) {
                    Object obj9 = arrayList13.get(i40);
                    i40++;
                    ((Runnable) obj9).run();
                }
                return;
            case 11:
                f41 f41Var10 = (f41) obj2;
                ci.v.e0((ci.v) obj3, (ArrayList) obj);
                return;
            case 12:
                ci.u uVar = (ci.u) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                f41 f41Var11 = (f41) obj2;
                ArrayList arrayList15 = uVar.f6070b;
                int size7 = arrayList15.size();
                int i41 = 0;
                while (i41 < size7) {
                    Object obj10 = arrayList15.get(i41);
                    i41++;
                    int i42 = qb.f5855b;
                    r31 K5 = r31.K(qb.class);
                    K5.G = (TL_stars.StarsTransaction) obj10;
                    K5.f37632q = true;
                    arrayList14.add(K5);
                }
                if (uVar.h) {
                    arrayList14.add(r31.e(-1, bd.M0(2131746062, null)));
                    return;
                } else if (!uVar.f6073f) {
                    for (int i43 = 0; i43 < 3; i43++) {
                        arrayList14.add(r31.q(i43, 7));
                    }
                    return;
                } else {
                    return;
                }
            case 13:
                i20 i20Var = (i20) obj3;
                ArrayList arrayList16 = (ArrayList) obj;
                f41 f41Var12 = (f41) obj2;
                arrayList16.add(r31.k(i20Var.R1));
                arrayList16.add(ci.k0.i(bd.M0(2131750868, null), bd.M0(2131750869, null), 2131232172));
                arrayList16.add(ci.k0.i(bd.M0(2131750866, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(bd.M0(2131750867, null), new s(i20Var, 26)), true), 2131232072));
                arrayList16.add(ci.k0.i(bd.M0(2131750864, null), bd.M0(2131750865, null), 2131231907));
                arrayList16.add(ci.k0.i(bd.M0(2131750862, null), bd.M0(2131750863, null), 2131231809));
                arrayList16.add(r31.D(org.telegram.messenger.g0.L(68.0f)));
                return;
            case 14:
                ArrayList arrayList17 = (ArrayList) obj;
                f41 f41Var13 = (f41) obj2;
                r31 r31Var2 = ((ci.t0) obj3).f6010p2;
                if (r31Var2 != null) {
                    arrayList17.add(r31Var2);
                    return;
                }
                return;
            case 15:
                ci.p1 p1Var = (ci.p1) obj3;
                ArrayList arrayList18 = (ArrayList) obj;
                f41 f41Var14 = (f41) obj2;
                ArrayList arrayList19 = p1Var.W1;
                boolean z16 = p1Var.f5734n2;
                ci.a aVar = p1Var.Z1;
                ArrayList arrayList20 = p1Var.U1;
                ArrayList arrayList21 = p1Var.T1;
                ci.a aVar2 = p1Var.Y1;
                ci.a aVar3 = p1Var.X1;
                ArrayList arrayList22 = p1Var.V1;
                if (arrayList22 != null && arrayList21 != null && arrayList20 != null) {
                    arrayList18.add(r31.D(org.telegram.messenger.g0.L(315.0f)));
                    aVar3.f4783b = 0;
                    aVar3.c();
                    aVar2.f4783b = 0;
                    aVar2.c();
                    aVar.f4783b = 0;
                    aVar.c();
                    int i44 = p1Var.c2.f5671s;
                    if (i44 == 0) {
                        String str2 = "GiftPreviewCountModels";
                        if (!z16) {
                            str = "GiftPreviewCountModels";
                        } else {
                            str = "GiftPreviewCountModelsCrafting";
                        }
                        arrayList18.add(r31.g(org.telegram.messenger.g0.X2(bd.H(',', str, arrayList22.size()))));
                        int size8 = arrayList22.size();
                        int i45 = 0;
                        while (i45 < size8) {
                            Object obj11 = arrayList22.get(i45);
                            i45++;
                            arrayList18.add(ci.m1.i(i44, new ci.k1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) obj11)));
                        }
                        if (!arrayList19.isEmpty()) {
                            if (z16) {
                                str2 = "GiftPreviewCountModelsCrafting2";
                            }
                            arrayList18.add(r31.g(org.telegram.messenger.g0.X2(bd.H(',', str2, arrayList22.size()))));
                            int size9 = arrayList19.size();
                            int i46 = 0;
                            while (i46 < size9) {
                                Object obj12 = arrayList19.get(i46);
                                i46++;
                                arrayList18.add(ci.m1.i(i44, new ci.k1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) obj12)));
                            }
                            return;
                        }
                        return;
                    } else if (i44 == 1) {
                        arrayList18.add(r31.g(org.telegram.messenger.g0.X2(bd.H(',', "GiftPreviewCountBackdrops", arrayList21.size()))));
                        int size10 = arrayList21.size();
                        int i47 = 0;
                        while (i47 < size10) {
                            Object obj13 = arrayList21.get(i47);
                            i47++;
                            arrayList18.add(ci.m1.i(i44, new ci.k1((TL_stars.starGiftAttributeBackdrop) obj13, (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) aVar.c())));
                        }
                        return;
                    } else if (i44 == 2) {
                        arrayList18.add(r31.g(org.telegram.messenger.g0.X2(bd.H(',', "GiftPreviewCountSymbols", arrayList20.size()))));
                        int size11 = arrayList20.size();
                        int i48 = 0;
                        while (i48 < size11) {
                            Object obj14 = arrayList20.get(i48);
                            i48++;
                            arrayList18.add(ci.m1.i(i44, new ci.k1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) obj14, (TL_stars.starGiftAttributeModel) aVar.c())));
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                TextView textView = (TextView) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str3 = (String) obj2;
                if (wallettransaction != null) {
                    long j11 = wallettransaction.fee;
                    if (j11 > 0) {
                        textView.setText(bd.V(null, null, 2131743082, org.telegram.ui.Wallet.k0.s(j11, false)));
                        return;
                    }
                }
                textView.setVisibility(8);
                return;
            case 17:
                n10 n10Var = (n10) obj3;
                Long l10 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (n10Var != null) {
                    n10Var.a(l10, bool);
                    return;
                }
                return;
            case 18:
                ((wb) obj3).K0((ArrayList) obj, (f41) obj2);
                return;
            case 19:
                hb hbVar = (hb) obj3;
                ArrayList arrayList23 = (ArrayList) obj;
                f41 f41Var15 = (f41) obj2;
                arrayList23.add(r31.k(hbVar.Q1));
                arrayList23.add(r31.u(bd.M0(2131744224, null)));
                ArrayList u10 = e9.y(hbVar.f28583a, false).u();
                if (u10 != null && !u10.isEmpty()) {
                    int i49 = 1;
                    int i50 = 0;
                    for (int i51 = 0; i51 < u10.size(); i51++) {
                        TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i51);
                        if (!hbVar.V1 && tL_starsGiftOption.extended) {
                            i50++;
                        } else {
                            int i52 = i49 + 1;
                            int i53 = ib.f5317b;
                            r31 K6 = r31.K(ib.class);
                            K6.d = i51;
                            K6.f37640z = i49;
                            long j12 = tL_starsGiftOption.stars;
                            K6.B = j12;
                            K6.f37627l = bd.H(' ', "StarsCount", (int) j12);
                            if (tL_starsGiftOption.loadingStorePrice) {
                                f13 = null;
                            } else {
                                f13 = org.telegram.messenger.r1.i().f(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                            }
                            K6.f37628m = f13;
                            K6.G = tL_starsGiftOption;
                            arrayList23.add(K6);
                            i49 = i52;
                        }
                    }
                    boolean z17 = hbVar.V1;
                    if (!z17 && i50 > 0) {
                        if (z17) {
                            i14 = 2131747853;
                        } else {
                            i14 = 2131747844;
                        }
                        String M03 = bd.M0(i14, null);
                        int i54 = db.f4990b;
                        r31 K7 = r31.K(db.class);
                        K7.d = -1;
                        K7.f37627l = M03;
                        K7.f37622f = !hbVar.V1;
                        K7.f37632q = true;
                        arrayList23.add(K7);
                    }
                } else {
                    arrayList23.add(r31.p(31));
                    arrayList23.add(r31.p(31));
                    arrayList23.add(r31.p(31));
                }
                arrayList23.add(r31.k(hbVar.R1));
                return;
            case 20:
                mb mbVar = (mb) obj3;
                ArrayList arrayList24 = (ArrayList) obj;
                f41 f41Var16 = (f41) obj2;
                long j13 = mbVar.Q1;
                bh.a aVar4 = mbVar.R1;
                arrayList24.add(r31.m(aVar4));
                boolean z18 = mbVar.W1;
                if (z18) {
                    arrayList24.add(r31.u(bd.M0(2131744224, null)));
                }
                ArrayList z19 = e9.y(mbVar.f28583a, false).z();
                if (z18) {
                    if (z19 != null && !z19.isEmpty()) {
                        int i55 = 0;
                        int i56 = 0;
                        int i57 = 0;
                        boolean z20 = false;
                        int i58 = 1;
                        while (i55 < z19.size()) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z19.get(i55);
                            ArrayList arrayList25 = z19;
                            if (tL_starsTopupOption.stars >= j13) {
                                if (tL_starsTopupOption.extended && !mbVar.Y1 && z20) {
                                    i57++;
                                } else {
                                    arrayList24.add(ib.i(i55, i58, tL_starsTopupOption));
                                    i56++;
                                    i58++;
                                    z20 = true;
                                }
                            }
                            i55++;
                            z19 = arrayList25;
                        }
                        ArrayList arrayList26 = z19;
                        if (i56 < 3) {
                            arrayList24.clear();
                            arrayList24.add(r31.k(aVar4));
                            arrayList24.add(r31.u(bd.M0(2131744224, null)));
                            int i59 = 0;
                            int i60 = 0;
                            while (i59 < arrayList26.size()) {
                                ArrayList arrayList27 = arrayList26;
                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList27.get(i59);
                                if (tL_starsTopupOption2.stars >= j13) {
                                    arrayList24.add(ib.i(i59, i58, tL_starsTopupOption2));
                                    i60++;
                                    i58++;
                                }
                                i59++;
                                arrayList26 = arrayList27;
                            }
                            ArrayList arrayList28 = arrayList26;
                            if (i60 == 0) {
                                int i61 = i58;
                                int i62 = 0;
                                while (i62 < arrayList28.size()) {
                                    arrayList24.add(ib.i(i62, i61, (TL_stars.TL_starsTopupOption) arrayList28.get(i62)));
                                    i62++;
                                    i61++;
                                }
                                boolean z21 = mbVar.Y1;
                                if (!z21 && i57 > 0) {
                                    if (z21) {
                                        i16 = 2131747853;
                                    } else {
                                        i16 = 2131747844;
                                    }
                                    String M04 = bd.M0(i16, null);
                                    int i63 = db.f4990b;
                                    r31 K8 = r31.K(db.class);
                                    K8.d = -1;
                                    K8.f37627l = M04;
                                    K8.f37622f = !mbVar.Y1;
                                    K8.f37632q = true;
                                    arrayList24.add(K8);
                                }
                            } else {
                                mbVar.Y1 = true;
                            }
                        } else if (i56 > 0) {
                            boolean z22 = mbVar.Y1;
                            if (!z22 && i57 > 0) {
                                if (z22) {
                                    i15 = 2131747853;
                                } else {
                                    i15 = 2131747844;
                                }
                                String M05 = bd.M0(i15, null);
                                int i64 = db.f4990b;
                                r31 K9 = r31.K(db.class);
                                K9.d = -1;
                                K9.f37627l = M05;
                                K9.f37622f = !mbVar.Y1;
                                K9.f37632q = true;
                                arrayList24.add(K9);
                            }
                        } else {
                            int i65 = i58;
                            int i66 = 0;
                            while (i66 < arrayList26.size()) {
                                arrayList24.add(ib.i(i66, i65, (TL_stars.TL_starsTopupOption) arrayList26.get(i66)));
                                i66++;
                                i65++;
                            }
                        }
                    } else {
                        arrayList24.add(r31.p(31));
                        arrayList24.add(r31.p(31));
                        arrayList24.add(r31.p(31));
                    }
                }
                arrayList24.add(r31.k(mbVar.S1));
                return;
            case 21:
                nb nbVar = (nb) obj3;
                ArrayList arrayList29 = (ArrayList) obj;
                f41 f41Var17 = (f41) obj2;
                arrayList29.add(r31.u(bd.M0(2131744224, null)));
                ArrayList z23 = e9.y(nbVar.f28583a, false).z();
                if (z23 != null && !z23.isEmpty()) {
                    int i67 = 1;
                    int i68 = 0;
                    while (i19 < z23.size()) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) z23.get(i19);
                        if (tL_starsTopupOption3.extended && !nbVar.S1) {
                            i68++;
                        } else {
                            arrayList29.add(ib.i(i19, i67, tL_starsTopupOption3));
                            i67++;
                        }
                        i19++;
                    }
                    boolean z24 = nbVar.S1;
                    if (!z24 && i68 > 0) {
                        if (z24) {
                            i17 = 2131747853;
                        } else {
                            i17 = 2131747844;
                        }
                        String M06 = bd.M0(i17, null);
                        int i69 = db.f4990b;
                        r31 K10 = r31.K(db.class);
                        K10.d = -1;
                        K10.f37627l = M06;
                        K10.f37622f = !nbVar.S1;
                        K10.f37632q = true;
                        arrayList29.add(K10);
                    }
                } else {
                    arrayList29.add(r31.p(31));
                    arrayList29.add(r31.p(31));
                    arrayList29.add(r31.p(31));
                    arrayList29.add(r31.p(31));
                    arrayList29.add(r31.p(31));
                }
                arrayList29.add(r31.k(nbVar.Q1));
                return;
            case 22:
                tb tbVar = (tb) obj3;
                ArrayList arrayList30 = (ArrayList) obj;
                f41 f41Var18 = (f41) obj2;
                int i70 = tbVar.f6051c;
                int i71 = tbVar.d;
                long j14 = tbVar.f6053f;
                if (j14 != 0) {
                    ci.i0 g7 = ci.i0.g(i70);
                    ArrayList arrayList31 = g7.k(j14).f5203a[i71];
                    int size12 = arrayList31.size();
                    while (i19 < size12) {
                        Object obj15 = arrayList31.get(i19);
                        i19++;
                        int i72 = qb.f5855b;
                        r31 K11 = r31.K(qb.class);
                        K11.G = (TL_stars.StarsTransaction) obj15;
                        K11.f37632q = true;
                        arrayList30.add(K11);
                    }
                    if (!g7.k(j14).f5206e[i71]) {
                        arrayList30.add(r31.q(arrayList30.size(), 7));
                        arrayList30.add(r31.q(arrayList30.size(), 7));
                        arrayList30.add(r31.q(arrayList30.size(), 7));
                        return;
                    }
                    return;
                }
                e9 y9 = e9.y(i70, tbVar.f6052e);
                ArrayList arrayList32 = y9.f5043q[i71];
                int size13 = arrayList32.size();
                int i73 = 0;
                while (i73 < size13) {
                    Object obj16 = arrayList32.get(i73);
                    i73++;
                    int i74 = qb.f5855b;
                    r31 K12 = r31.K(qb.class);
                    K12.G = (TL_stars.StarsTransaction) obj16;
                    K12.f37632q = false;
                    arrayList30.add(K12);
                }
                if (!y9.f5047u[i71]) {
                    arrayList30.add(r31.q(arrayList30.size(), 7));
                    arrayList30.add(r31.q(arrayList30.size(), 7));
                    arrayList30.add(r31.q(arrayList30.size(), 7));
                    return;
                }
                return;
            case 23:
                dh.o oVar = (dh.o) obj3;
                ArrayList arrayList33 = (ArrayList) obj;
                f41 f41Var19 = (f41) obj2;
                ArrayList arrayList34 = oVar.G;
                q8 q8Var = oVar.f9104e;
                if (q8Var != null && oVar.f9105f != null) {
                    arrayList33.add(r31.j(1, q8Var));
                    arrayList33.add(r31.l(2, oVar.f9105f));
                    int i75 = oVar.Z;
                    if (i75 == 1 || i75 == 0 || oVar.f9099a) {
                        while (i19 < arrayList34.size()) {
                            View view = (View) arrayList34.get(i19);
                            if (((Boolean) oVar.H.get(i19)).booleanValue()) {
                                j10 = r31.l(i19 + 100, view);
                            } else {
                                j10 = r31.j(i19 + 100, view);
                            }
                            arrayList33.add(j10);
                            i19++;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 24:
                b(obj, obj2);
                return;
            case 25:
                c(obj, obj2);
                return;
            case 26:
                gi.t1 t1Var = (gi.t1) obj3;
                String str4 = (String) obj;
                gi.i2 i2Var = t1Var.f13606r;
                i2Var.f12951j1 = str4;
                i2Var.k1 = ((Integer) obj2).intValue();
                t1Var.f13602c.H(str4);
                return;
            case 27:
                d(obj, obj2);
                return;
            case 28:
                e(obj, obj2);
                return;
            default:
                gi.m5 m5Var = (gi.m5) obj3;
                m5Var.b0(m5Var.g0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                return;
        }
    }
}
