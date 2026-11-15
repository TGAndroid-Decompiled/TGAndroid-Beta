package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import di.cb;
import di.db;
import di.gb;
import di.jb;
import di.m8;
import di.mb;
import di.ta;
import di.v8;
import di.xa;
import di.ya;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.c10;
import org.telegram.messenger.ff;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.r9;
import org.telegram.messenger.s10;
import org.telegram.messenger.v00;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.wp0;
public final class b implements s10 {
    public final int f3386a;
    public final Object f3387b;

    public b(Object obj, int i7) {
        this.f3386a = i7;
        this.f3387b = obj;
    }

    private final void b(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        p41 p41Var = (p41) obj2;
        ((gi.p) this.f3387b).getClass();
        ArrayList n10 = c10.n();
        int size = n10.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj3 = n10.get(i7);
            i7++;
            int i10 = gi.n.f13348b;
            b41 K = b41.K(gi.n.class);
            K.G = (v00) obj3;
            arrayList.add(K);
        }
    }

    private final void c(Object obj, Object obj2) {
        int i7;
        hi.m mVar = (hi.m) this.f3387b;
        Canvas canvas = (Canvas) obj;
        Runnable runnable = (Runnable) obj2;
        Paint paint = mVar.J;
        RectF rectF = mVar.f14649z0;
        hi.g gVar = mVar.f14623f;
        if (mVar.g()) {
            if (mVar.H == null) {
                runnable.run();
                return;
            }
            ft editText = gVar.getEditText();
            canvas.translate(-editText.f32535q0, 0.0f);
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
        Paint c10 = mVar.Q.c(1.0f);
        ft editText2 = gVar.getEditText();
        if (c10 != null) {
            i7 = -1;
        } else {
            i7 = -2130706433;
        }
        editText2.setHintColor(i7);
        if (c10 == null) {
            runnable.run();
            return;
        }
        ft editText3 = gVar.getEditText();
        canvas.saveLayerAlpha(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), 255, 31);
        runnable.run();
        canvas.drawRect(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), c10);
        canvas.restore();
    }

    private final void d(Object obj, Object obj2) {
        hi.y1 y1Var = (hi.y1) this.f3387b;
        String str = (String) obj;
        hi.i2 i2Var = y1Var.f15414s;
        i2Var.f14403m1 = str;
        i2Var.n1 = ((Integer) obj2).intValue();
        y1Var.f15409c.D(str);
    }

    private final void e(Object obj, Object obj2) {
        z10 z10Var;
        hi.h3 h3Var = (hi.h3) this.f3387b;
        Bitmap bitmap = (Bitmap) obj2;
        if (obj != null) {
            if (h3Var.f14370p1 == null && (obj instanceof ff) && (z10Var = h3Var.f14371q1) != null) {
                z10Var.a((ff) obj);
                return;
            }
            return;
        }
        h3Var.getClass();
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
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
        b41 j3;
        boolean z13;
        String str;
        int i14;
        String f13;
        int i15;
        int i16;
        int i17;
        int i18 = this.f3386a;
        char c10 = 3;
        int i19 = 0;
        Object obj3 = this.f3387b;
        switch (i18) {
            case 0:
                e eVar = (e) obj3;
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = eVar.T1;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        r9 r9Var = eVar.U1;
                        ai.t2 t2Var = new ai.t2(1, eVar, tL_StarGiftAuctionAcquiredGift);
                        int i20 = c.f3401b;
                        b41 K = b41.K(c.class);
                        K.G = tL_StarGiftAuctionAcquiredGift;
                        K.H = r9Var;
                        K.D = t2Var;
                        arrayList.add(K);
                    }
                    arrayList.add(b41.D(org.telegram.messenger.g0.L(16.0f)));
                    return;
                }
                return;
            case 1:
                p41 p41Var2 = (p41) obj2;
                ((ArrayList) obj).add(((g) obj3).T1);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                p41 p41Var3 = (p41) obj2;
                arrayList2.add(((y) obj3).U1);
                arrayList2.add(b41.D(org.telegram.messenger.g0.L(16.0f)));
                return;
            case 3:
                p41 p41Var4 = (p41) obj2;
                ((ArrayList) obj).add(b41.j(-1, ((m0) obj3).V1));
                return;
            case 4:
                p41 p41Var5 = (p41) obj2;
                ((ArrayList) obj).add(b41.j(-1, ((t0) obj3).V1));
                return;
            case 5:
                ((s2) obj3).d1((ArrayList) obj, (p41) obj2);
                return;
            case 6:
                c4 c4Var = (c4) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                p41 p41Var6 = (p41) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = c4Var.f3411c;
                wp0 wp0Var = c4Var.f3409a;
                m8 m8Var = c4Var.f3412e;
                if (m8Var != null) {
                    if ((!m8Var.f9045e || m8Var.f9047g != 783) && m8Var.f9051l.size() <= 0) {
                        m8 m8Var2 = c4Var.f3412e;
                        if (m8Var2.f9049j && !m8Var2.f9048i) {
                            return;
                        }
                    }
                    m8 m8Var3 = c4Var.f3412e;
                    if (m8Var3 == null || (i12 = m8Var3.f9053n) == 0) {
                        i7 = 3;
                        i10 = 3;
                    } else {
                        i7 = 3;
                        i10 = Math.min(3, i12);
                    }
                    int max = Math.max(1, i10);
                    m8 m8Var4 = c4Var.f3412e;
                    if (m8Var4 != null) {
                        ArrayList arrayList4 = m8Var4.f9051l;
                        int size = arrayList4.size();
                        int i21 = i7;
                        int i22 = 0;
                        while (i22 < size) {
                            Object obj4 = arrayList4.get(i22);
                            i22++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            boolean z14 = c4Var.d;
                            int i23 = h2.f3561b;
                            b41 K2 = b41.K(h2.class);
                            K2.f33190u = 1;
                            K2.f33194z = 0;
                            K2.G = savedStarGift;
                            K2.f33186q = true;
                            K2.f33176f = false;
                            K2.f33187r = z14;
                            if (c4Var.h && (c4Var.f3412e != wp0Var.d || savedStarGift.pinned_to_top)) {
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
                        m8 m8Var5 = c4Var.f3412e;
                        if (m8Var5.f9048i || !m8Var5.f9049j) {
                            int i24 = 0;
                            while (true) {
                                if (i21 <= 0) {
                                    i11 = 3;
                                } else {
                                    i11 = i21;
                                }
                                if (i24 < i11) {
                                    i24++;
                                    b41 q10 = b41.q(i24, 34);
                                    q10.f33190u = 1;
                                    arrayList3.add(q10);
                                }
                            }
                        }
                    }
                    if (wp0Var.d == c4Var.f3412e) {
                        arrayList3.add(b41.D(org.telegram.messenger.g0.L(20.0f)));
                        if (wp0Var.f3609c == m10.i(c4Var.f3410b).e()) {
                            int i25 = org.telegram.ui.ActionBar.j6.f29260z6;
                            int w02 = org.telegram.ui.ActionBar.j6.w0(i25, e6Var);
                            String M0 = hd.M0(2131746671, null);
                            int L = org.telegram.messenger.g0.L(24.0f);
                            int i26 = d4.f3442b;
                            b41 K3 = b41.K(d4.class);
                            K3.f33181l = M0;
                            K3.f33194z = 17;
                            K3.B = w02;
                            K3.A = 14.0f;
                            K3.f33178i = L;
                            K3.f33180k = 0;
                            K3.f33186q = false;
                            K3.G = e6Var;
                            K3.H = Integer.valueOf(i25);
                            arrayList3.add(K3);
                        }
                        arrayList3.add(b41.D(org.telegram.messenger.g0.L(82.0f)));
                    } else if (!arrayList3.isEmpty()) {
                        arrayList3.add(b41.D(org.telegram.messenger.g0.L(82.0f)));
                    }
                    if (!arrayList3.isEmpty()) {
                        if (c4Var.I) {
                            f10 = 42.0f;
                        } else {
                            f10 = 12.0f;
                        }
                        arrayList3.add(0, b41.D(org.telegram.messenger.g0.L(f10)));
                    }
                    if (c4Var.f3413f.getSpanCount() != max) {
                        org.telegram.messenger.g0.h3(new d3(c4Var, max, 1));
                    }
                    wp0Var.p();
                    wp0Var.post(new a3.f(wp0Var, 24));
                    return;
                }
                return;
            case 7:
                a6 a6Var = (a6) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                p41 p41Var7 = (p41) obj2;
                o5 o5Var = a6Var.d;
                ArrayList arrayList6 = o5Var.d;
                int size2 = arrayList6.size();
                int i27 = 0;
                while (i27 < size2) {
                    Object obj5 = arrayList6.get(i27);
                    i27++;
                    arrayList5.add(h2.i(0, (TL_stars.TL_starGiftUnique) obj5, false, false, false, true, false));
                }
                if (o5Var.f3771t || !o5Var.f3772u) {
                    b41 q11 = b41.q(-1, 34);
                    q11.f33190u = 1;
                    arrayList5.add(q11);
                    b41 q12 = b41.q(-2, 34);
                    q12.f33190u = 1;
                    arrayList5.add(q12);
                    b41 q13 = b41.q(-3, 34);
                    q13.f33190u = 1;
                    arrayList5.add(q13);
                    if (o5Var.d.isEmpty()) {
                        b41 q14 = b41.q(-4, 34);
                        q14.f33190u = 1;
                        arrayList5.add(q14);
                        b41 q15 = b41.q(-5, 34);
                        q15.f33190u = 1;
                        arrayList5.add(q15);
                        b41 q16 = b41.q(-6, 34);
                        q16.f33190u = 1;
                        arrayList5.add(q16);
                        b41 q17 = b41.q(-7, 34);
                        q17.f33190u = 1;
                        arrayList5.add(q17);
                        b41 q18 = b41.q(-8, 34);
                        q18.f33190u = 1;
                        arrayList5.add(q18);
                        b41 q19 = b41.q(-9, 34);
                        q19.f33190u = 1;
                        arrayList5.add(q19);
                        b41 q20 = b41.q(-10, 34);
                        q20.f33190u = 1;
                        arrayList5.add(q20);
                        b41 q21 = b41.q(-11, 34);
                        q21.f33190u = 1;
                        arrayList5.add(q21);
                        b41 q22 = b41.q(-12, 34);
                        q22.f33190u = 1;
                        arrayList5.add(q22);
                        b41 q23 = b41.q(-13, 34);
                        q23.f33190u = 1;
                        arrayList5.add(q23);
                        b41 q24 = b41.q(-14, 34);
                        q24.f33190u = 1;
                        arrayList5.add(q24);
                        b41 q25 = b41.q(-15, 34);
                        q25.f33190u = 1;
                        arrayList5.add(q25);
                    }
                }
                if (arrayList5.isEmpty() && !o5Var.f3771t) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (a6Var.f3384x != z11) {
                    a6Var.f3384x = z11;
                    a6Var.f3383w.setVisibility(0);
                    ViewPropertyAnimator animate = a6Var.f3383w.animate();
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
                    scaleX.scaleY(f14).setInterpolator(er.h).setDuration(320L).setListener(new v4(0, a6Var, z11)).start();
                    return;
                }
                return;
            case 8:
                z5 z5Var = (z5) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                p41 p41Var8 = (p41) obj2;
                y5 y5Var = z5Var.U1;
                if (y5Var != null) {
                    m8 m8Var6 = y5Var.f4015b;
                    o5 o5Var2 = y5Var.f4016c;
                    if (m8Var6 != null && o5Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(z5Var.f29679a).getCurrentTime();
                        arrayList7.add(b41.t(-1, hd.M0(2131749770, null)));
                        ArrayList arrayList8 = m8Var6.f9051l;
                        int size3 = arrayList8.size();
                        boolean z15 = true;
                        int i28 = 0;
                        int i29 = 0;
                        while (i29 < size3) {
                            Object obj6 = arrayList8.get(i29);
                            i29++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            char c11 = c10;
                            if (z5Var.f4032c2.contains(Long.valueOf(savedStarGift2.gift.f28280id))) {
                                c10 = c11;
                            } else {
                                if (savedStarGift2.can_craft_at <= currentTime) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                b41 i30 = h2.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i30.f33177g = z12;
                                arrayList7.add(i30);
                                i28++;
                                c10 = c11;
                                z15 = false;
                            }
                        }
                        if (!m8Var6.f9048i && m8Var6.f9049j) {
                            if (z15) {
                                arrayList7.add(b41.g(hd.M0(2131749769, null)));
                            }
                        } else {
                            int i31 = i28 % 3;
                            int i32 = 6 - i31;
                            for (int i33 = 0; i33 < i32; i33++) {
                                b41 q26 = b41.q((i33 - i31) + 1, 35);
                                q26.f33190u = 1;
                                arrayList7.add(q26);
                            }
                        }
                        if (o5Var2.f3757e > 0 || z5Var.f4034f2) {
                            z5Var.f4034f2 = true;
                            String M02 = hd.M0(2131749772, null);
                            b41 b41Var = new b41(42);
                            b41Var.d = -2;
                            b41Var.f33184o = M02;
                            arrayList7.add(b41Var);
                            HorizontalScrollView horizontalScrollView = z5Var.V1;
                            if (horizontalScrollView != null) {
                                arrayList7.add(b41.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList9 = o5Var2.d;
                            int size4 = arrayList9.size();
                            int i34 = 0;
                            while (i34 < size4) {
                                Object obj7 = arrayList9.get(i34);
                                i34++;
                                arrayList7.add(h2.i(0, (TL_stars.TL_starGiftUnique) obj7, false, true, false, true, true));
                            }
                            if (o5Var2.f3771t || !o5Var2.f3772u) {
                                b41 q27 = b41.q(10, 35);
                                q27.f33190u = 1;
                                arrayList7.add(q27);
                                b41 q28 = b41.q(11, 35);
                                q28.f33190u = 1;
                                arrayList7.add(q28);
                                b41 q29 = b41.q(12, 35);
                                q29.f33190u = 1;
                                arrayList7.add(q29);
                                b41 q30 = b41.q(13, 35);
                                q30.f33190u = 1;
                                arrayList7.add(q30);
                                b41 q31 = b41.q(14, 35);
                                q31.f33190u = 1;
                                arrayList7.add(q31);
                                b41 q32 = b41.q(15, 35);
                                q32.f33190u = 1;
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
                e6 e6Var2 = (e6) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                p41 p41Var9 = (p41) obj2;
                m8 m8Var7 = e6Var2.U1;
                if (m8Var7 != null) {
                    ArrayList arrayList11 = m8Var7.f9051l;
                    arrayList10.add(b41.D(org.telegram.messenger.g0.L(16.0f)));
                    if (m8Var7.f9048i && arrayList11.isEmpty()) {
                        b41 q33 = b41.q(1, 34);
                        q33.f33190u = 1;
                        arrayList10.add(q33);
                        b41 q34 = b41.q(2, 34);
                        q34.f33190u = 1;
                        arrayList10.add(q34);
                        b41 q35 = b41.q(3, 34);
                        q35.f33190u = 1;
                        arrayList10.add(q35);
                        b41 q36 = b41.q(4, 34);
                        q36.f33190u = 1;
                        arrayList10.add(q36);
                        b41 q37 = b41.q(5, 34);
                        q37.f33190u = 1;
                        arrayList10.add(q37);
                        b41 q38 = b41.q(6, 34);
                        q38.f33190u = 1;
                        arrayList10.add(q38);
                        b41 q39 = b41.q(7, 34);
                        q39.f33190u = 1;
                        arrayList10.add(q39);
                        b41 q40 = b41.q(8, 34);
                        q40.f33190u = 1;
                        arrayList10.add(q40);
                        b41 q41 = b41.q(9, 34);
                        q41.f33190u = 1;
                        arrayList10.add(q41);
                    } else {
                        int size5 = arrayList11.size();
                        int i35 = 3;
                        int i36 = 0;
                        while (i36 < size5) {
                            Object obj8 = arrayList11.get(i36);
                            i36++;
                            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj8;
                            if (!savedStarGift3.collection_id.contains(Integer.valueOf(e6Var2.T1))) {
                                int i37 = h2.f3561b;
                                b41 K4 = b41.K(h2.class);
                                K4.f33190u = 1;
                                K4.f33194z = 0;
                                K4.G = savedStarGift3;
                                K4.f33186q = true;
                                K4.f33176f = true;
                                K4.f33187r = false;
                                HashSet hashSet = e6Var2.V1;
                                int i38 = savedStarGift3.msg_id;
                                K4.L(hashSet.contains(Long.valueOf(i38 == 0 ? savedStarGift3.saved_id : i38)));
                                K4.f33190u = 1;
                                arrayList10.add(K4);
                                i35--;
                                if (i35 == 0) {
                                    i35 = 3;
                                }
                            }
                        }
                        if (m8Var7.f9048i || !m8Var7.f9049j) {
                            int i39 = 0;
                            while (true) {
                                if (i35 <= 0) {
                                    i13 = 3;
                                } else {
                                    i13 = i35;
                                }
                                if (i39 < i13) {
                                    i39++;
                                    b41 q42 = b41.q(i39, 34);
                                    q42.f33190u = 1;
                                    arrayList10.add(q42);
                                }
                            }
                        }
                    }
                    arrayList10.add(b41.D(org.telegram.messenger.g0.L(68.0f)));
                    return;
                }
                return;
            case 10:
                ch.o oVar = (ch.o) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                p41 p41Var10 = (p41) obj2;
                ArrayList arrayList13 = oVar.G;
                q8 q8Var = oVar.f5173e;
                if (q8Var != null && oVar.f5174f != null) {
                    arrayList12.add(b41.j(1, q8Var));
                    arrayList12.add(b41.l(2, oVar.f5174f));
                    int i40 = oVar.Z;
                    if (i40 == 1 || i40 == 0 || oVar.f5168a) {
                        for (int i41 = 0; i41 < arrayList13.size(); i41++) {
                            View view = (View) arrayList13.get(i41);
                            if (((Boolean) oVar.H.get(i41)).booleanValue()) {
                                j3 = b41.l(i41 + 100, view);
                            } else {
                                j3 = b41.j(i41 + 100, view);
                            }
                            arrayList12.add(j3);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ci.d dVar = (ci.d) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ArrayList arrayList14 = dVar.f5334e;
                dVar.f5333c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    dVar.f5332b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        dVar.f5332b.serializeToStream(serializedData);
                        np.s1(dVar.f5331a).f25280f7.edit().putString("qrBackdrops", Utilities.f(serializedData.toByteArray())).apply();
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
                dVar.d = z13;
                ArrayList arrayList15 = new ArrayList(arrayList14);
                arrayList14.clear();
                int size6 = arrayList15.size();
                int i42 = 0;
                while (i42 < size6) {
                    Object obj9 = arrayList15.get(i42);
                    i42++;
                    ((Runnable) obj9).run();
                }
                return;
            case 12:
                p41 p41Var11 = (p41) obj2;
                di.t.e0((di.t) obj3, (ArrayList) obj);
                return;
            case 13:
                di.s sVar = (di.s) obj3;
                ArrayList arrayList16 = (ArrayList) obj;
                p41 p41Var12 = (p41) obj2;
                ArrayList arrayList17 = sVar.f9358b;
                int size7 = arrayList17.size();
                int i43 = 0;
                while (i43 < size7) {
                    Object obj10 = arrayList17.get(i43);
                    i43++;
                    int i44 = gb.f8624b;
                    b41 K5 = b41.K(gb.class);
                    K5.G = (TL_stars.StarsTransaction) obj10;
                    K5.f33186q = true;
                    arrayList16.add(K5);
                }
                if (sVar.h) {
                    arrayList16.add(b41.e(-1, hd.M0(2131746052, null)));
                    return;
                } else if (!sVar.f9361f) {
                    for (int i45 = 0; i45 < 3; i45++) {
                        arrayList16.add(b41.q(i45, 7));
                    }
                    return;
                } else {
                    return;
                }
            case 14:
                p20 p20Var = (p20) obj3;
                ArrayList arrayList18 = (ArrayList) obj;
                p41 p41Var13 = (p41) obj2;
                arrayList18.add(b41.k(p20Var.U1));
                arrayList18.add(di.g0.i(hd.M0(2131750867, null), hd.M0(2131750868, null), 2131232173));
                arrayList18.add(di.g0.i(hd.M0(2131750865, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(hd.M0(2131750866, null), new ch.w(p20Var, 7)), true), 2131232073));
                arrayList18.add(di.g0.i(hd.M0(2131750863, null), hd.M0(2131750864, null), 2131231907));
                arrayList18.add(di.g0.i(hd.M0(2131750861, null), hd.M0(2131750862, null), 2131231809));
                arrayList18.add(b41.D(org.telegram.messenger.g0.L(68.0f)));
                return;
            case 15:
                ArrayList arrayList19 = (ArrayList) obj;
                p41 p41Var14 = (p41) obj2;
                b41 b41Var2 = ((di.p0) obj3).f9213s2;
                if (b41Var2 != null) {
                    arrayList19.add(b41Var2);
                    return;
                }
                return;
            case 16:
                di.i1 i1Var = (di.i1) obj3;
                ArrayList arrayList20 = (ArrayList) obj;
                p41 p41Var15 = (p41) obj2;
                ArrayList arrayList21 = i1Var.Z1;
                boolean z16 = i1Var.f8780q2;
                com.google.android.gms.common.api.internal.p pVar = i1Var.f8767c2;
                ArrayList arrayList22 = i1Var.X1;
                ArrayList arrayList23 = i1Var.W1;
                com.google.android.gms.common.api.internal.p pVar2 = i1Var.f8766b2;
                com.google.android.gms.common.api.internal.p pVar3 = i1Var.f8765a2;
                ArrayList arrayList24 = i1Var.Y1;
                if (arrayList24 != null && arrayList23 != null && arrayList22 != null) {
                    arrayList20.add(b41.D(org.telegram.messenger.g0.L(315.0f)));
                    pVar3.f6058a = 0;
                    pVar3.c();
                    pVar2.f6058a = 0;
                    pVar2.c();
                    pVar.f6058a = 0;
                    pVar.c();
                    int i46 = i1Var.f8769f2.f8658s;
                    if (i46 == 0) {
                        String str2 = "GiftPreviewCountModels";
                        if (!z16) {
                            str = "GiftPreviewCountModels";
                        } else {
                            str = "GiftPreviewCountModelsCrafting";
                        }
                        arrayList20.add(b41.g(org.telegram.messenger.g0.X2(hd.H(',', str, arrayList24.size()))));
                        int size8 = arrayList24.size();
                        int i47 = 0;
                        while (i47 < size8) {
                            Object obj11 = arrayList24.get(i47);
                            i47++;
                            arrayList20.add(di.f1.i(i46, new di.d1((TL_stars.starGiftAttributeBackdrop) pVar3.c(), (TL_stars.starGiftAttributePattern) pVar2.c(), (TL_stars.starGiftAttributeModel) obj11)));
                        }
                        if (!arrayList21.isEmpty()) {
                            if (z16) {
                                str2 = "GiftPreviewCountModelsCrafting2";
                            }
                            arrayList20.add(b41.g(org.telegram.messenger.g0.X2(hd.H(',', str2, arrayList24.size()))));
                            int size9 = arrayList21.size();
                            int i48 = 0;
                            while (i48 < size9) {
                                Object obj12 = arrayList21.get(i48);
                                i48++;
                                arrayList20.add(di.f1.i(i46, new di.d1((TL_stars.starGiftAttributeBackdrop) pVar3.c(), (TL_stars.starGiftAttributePattern) pVar2.c(), (TL_stars.starGiftAttributeModel) obj12)));
                            }
                            return;
                        }
                        return;
                    } else if (i46 == 1) {
                        arrayList20.add(b41.g(org.telegram.messenger.g0.X2(hd.H(',', "GiftPreviewCountBackdrops", arrayList23.size()))));
                        int size10 = arrayList23.size();
                        int i49 = 0;
                        while (i49 < size10) {
                            Object obj13 = arrayList23.get(i49);
                            i49++;
                            arrayList20.add(di.f1.i(i46, new di.d1((TL_stars.starGiftAttributeBackdrop) obj13, (TL_stars.starGiftAttributePattern) pVar2.c(), (TL_stars.starGiftAttributeModel) pVar.c())));
                        }
                        return;
                    } else if (i46 == 2) {
                        arrayList20.add(b41.g(org.telegram.messenger.g0.X2(hd.H(',', "GiftPreviewCountSymbols", arrayList22.size()))));
                        int size11 = arrayList22.size();
                        int i50 = 0;
                        while (i50 < size11) {
                            Object obj14 = arrayList22.get(i50);
                            i50++;
                            arrayList20.add(di.f1.i(i46, new di.d1((TL_stars.starGiftAttributeBackdrop) pVar3.c(), (TL_stars.starGiftAttributePattern) obj14, (TL_stars.starGiftAttributeModel) pVar.c())));
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 17:
                TextView textView = (TextView) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str3 = (String) obj2;
                if (wallettransaction != null) {
                    long j10 = wallettransaction.fee;
                    if (j10 > 0) {
                        textView.setText(hd.V(null, null, 2131743072, org.telegram.ui.Wallet.l0.s(j10, false)));
                        return;
                    }
                }
                textView.setVisibility(8);
                return;
            case 18:
                s10 s10Var = (s10) obj3;
                Long l10 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (s10Var != null) {
                    s10Var.a(l10, bool);
                    return;
                }
                return;
            case 19:
                ((mb) obj3).K0((ArrayList) obj, (p41) obj2);
                return;
            case 20:
                xa xaVar = (xa) obj3;
                ArrayList arrayList25 = (ArrayList) obj;
                p41 p41Var16 = (p41) obj2;
                arrayList25.add(b41.k(xaVar.T1));
                arrayList25.add(b41.u(hd.M0(2131744214, null)));
                ArrayList u10 = v8.y(xaVar.f29679a, false).u();
                if (u10 != null && !u10.isEmpty()) {
                    int i51 = 1;
                    int i52 = 0;
                    for (int i53 = 0; i53 < u10.size(); i53++) {
                        TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i53);
                        if (!xaVar.Y1 && tL_starsGiftOption.extended) {
                            i52++;
                        } else {
                            int i54 = i51 + 1;
                            int i55 = ya.f9812b;
                            b41 K6 = b41.K(ya.class);
                            K6.d = i53;
                            K6.f33194z = i51;
                            long j11 = tL_starsGiftOption.stars;
                            K6.B = j11;
                            K6.f33181l = hd.H(' ', "StarsCount", (int) j11);
                            if (tL_starsGiftOption.loadingStorePrice) {
                                f13 = null;
                            } else {
                                f13 = org.telegram.messenger.r1.i().f(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                            }
                            K6.f33182m = f13;
                            K6.G = tL_starsGiftOption;
                            arrayList25.add(K6);
                            i51 = i54;
                        }
                    }
                    boolean z17 = xaVar.Y1;
                    if (!z17 && i52 > 0) {
                        if (z17) {
                            i14 = 2131747845;
                        } else {
                            i14 = 2131747836;
                        }
                        String M03 = hd.M0(i14, null);
                        int i56 = ta.f9493b;
                        b41 K7 = b41.K(ta.class);
                        K7.d = -1;
                        K7.f33181l = M03;
                        K7.f33176f = !xaVar.Y1;
                        K7.f33186q = true;
                        arrayList25.add(K7);
                    }
                } else {
                    arrayList25.add(b41.p(31));
                    arrayList25.add(b41.p(31));
                    arrayList25.add(b41.p(31));
                }
                arrayList25.add(b41.k(xaVar.U1));
                return;
            case 21:
                cb cbVar = (cb) obj3;
                ArrayList arrayList26 = (ArrayList) obj;
                p41 p41Var17 = (p41) obj2;
                long j12 = cbVar.T1;
                ah.a aVar = cbVar.U1;
                arrayList26.add(b41.m(aVar));
                boolean z18 = cbVar.Z1;
                if (z18) {
                    arrayList26.add(b41.u(hd.M0(2131744214, null)));
                }
                ArrayList z19 = v8.y(cbVar.f29679a, false).z();
                if (z18) {
                    if (z19 != null && !z19.isEmpty()) {
                        int i57 = 0;
                        int i58 = 0;
                        int i59 = 0;
                        boolean z20 = false;
                        int i60 = 1;
                        while (i57 < z19.size()) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z19.get(i57);
                            ArrayList arrayList27 = z19;
                            if (tL_starsTopupOption.stars >= j12) {
                                if (tL_starsTopupOption.extended && !cbVar.f8383b2 && z20) {
                                    i59++;
                                } else {
                                    arrayList26.add(ya.i(i57, i60, tL_starsTopupOption));
                                    i58++;
                                    i60++;
                                    z20 = true;
                                }
                            }
                            i57++;
                            z19 = arrayList27;
                        }
                        ArrayList arrayList28 = z19;
                        if (i58 < 3) {
                            arrayList26.clear();
                            arrayList26.add(b41.k(aVar));
                            arrayList26.add(b41.u(hd.M0(2131744214, null)));
                            int i61 = 0;
                            int i62 = 0;
                            while (i61 < arrayList28.size()) {
                                ArrayList arrayList29 = arrayList28;
                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList29.get(i61);
                                if (tL_starsTopupOption2.stars >= j12) {
                                    arrayList26.add(ya.i(i61, i60, tL_starsTopupOption2));
                                    i62++;
                                    i60++;
                                }
                                i61++;
                                arrayList28 = arrayList29;
                            }
                            ArrayList arrayList30 = arrayList28;
                            if (i62 == 0) {
                                int i63 = i60;
                                int i64 = 0;
                                while (i64 < arrayList30.size()) {
                                    arrayList26.add(ya.i(i64, i63, (TL_stars.TL_starsTopupOption) arrayList30.get(i64)));
                                    i64++;
                                    i63++;
                                }
                                boolean z21 = cbVar.f8383b2;
                                if (!z21 && i59 > 0) {
                                    if (z21) {
                                        i16 = 2131747845;
                                    } else {
                                        i16 = 2131747836;
                                    }
                                    String M04 = hd.M0(i16, null);
                                    int i65 = ta.f9493b;
                                    b41 K8 = b41.K(ta.class);
                                    K8.d = -1;
                                    K8.f33181l = M04;
                                    K8.f33176f = !cbVar.f8383b2;
                                    K8.f33186q = true;
                                    arrayList26.add(K8);
                                }
                            } else {
                                cbVar.f8383b2 = true;
                            }
                        } else if (i58 > 0) {
                            boolean z22 = cbVar.f8383b2;
                            if (!z22 && i59 > 0) {
                                if (z22) {
                                    i15 = 2131747845;
                                } else {
                                    i15 = 2131747836;
                                }
                                String M05 = hd.M0(i15, null);
                                int i66 = ta.f9493b;
                                b41 K9 = b41.K(ta.class);
                                K9.d = -1;
                                K9.f33181l = M05;
                                K9.f33176f = !cbVar.f8383b2;
                                K9.f33186q = true;
                                arrayList26.add(K9);
                            }
                        } else {
                            int i67 = i60;
                            int i68 = 0;
                            while (i68 < arrayList28.size()) {
                                arrayList26.add(ya.i(i68, i67, (TL_stars.TL_starsTopupOption) arrayList28.get(i68)));
                                i68++;
                                i67++;
                            }
                        }
                    } else {
                        arrayList26.add(b41.p(31));
                        arrayList26.add(b41.p(31));
                        arrayList26.add(b41.p(31));
                    }
                }
                arrayList26.add(b41.k(cbVar.V1));
                return;
            case 22:
                db dbVar = (db) obj3;
                ArrayList arrayList31 = (ArrayList) obj;
                p41 p41Var18 = (p41) obj2;
                arrayList31.add(b41.u(hd.M0(2131744214, null)));
                ArrayList z23 = v8.y(dbVar.f29679a, false).z();
                if (z23 != null && !z23.isEmpty()) {
                    int i69 = 0;
                    int i70 = 1;
                    while (i19 < z23.size()) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) z23.get(i19);
                        if (tL_starsTopupOption3.extended && !dbVar.V1) {
                            i69++;
                        } else {
                            arrayList31.add(ya.i(i19, i70, tL_starsTopupOption3));
                            i70++;
                        }
                        i19++;
                    }
                    boolean z24 = dbVar.V1;
                    if (!z24 && i69 > 0) {
                        if (z24) {
                            i17 = 2131747845;
                        } else {
                            i17 = 2131747836;
                        }
                        String M06 = hd.M0(i17, null);
                        int i71 = ta.f9493b;
                        b41 K10 = b41.K(ta.class);
                        K10.d = -1;
                        K10.f33181l = M06;
                        K10.f33176f = !dbVar.V1;
                        K10.f33186q = true;
                        arrayList31.add(K10);
                    }
                } else {
                    arrayList31.add(b41.p(31));
                    arrayList31.add(b41.p(31));
                    arrayList31.add(b41.p(31));
                    arrayList31.add(b41.p(31));
                    arrayList31.add(b41.p(31));
                }
                arrayList31.add(b41.k(dbVar.T1));
                return;
            case 23:
                jb jbVar = (jb) obj3;
                ArrayList arrayList32 = (ArrayList) obj;
                p41 p41Var19 = (p41) obj2;
                int i72 = jbVar.f8871c;
                int i73 = jbVar.d;
                long j13 = jbVar.f8873f;
                if (j13 != 0) {
                    di.e0 g10 = di.e0.g(i72);
                    ArrayList arrayList33 = g10.k(j13).f8388a[i73];
                    int size12 = arrayList33.size();
                    while (i19 < size12) {
                        Object obj15 = arrayList33.get(i19);
                        i19++;
                        int i74 = gb.f8624b;
                        b41 K11 = b41.K(gb.class);
                        K11.G = (TL_stars.StarsTransaction) obj15;
                        K11.f33186q = true;
                        arrayList32.add(K11);
                    }
                    if (!g10.k(j13).f8391e[i73]) {
                        arrayList32.add(b41.q(arrayList32.size(), 7));
                        arrayList32.add(b41.q(arrayList32.size(), 7));
                        arrayList32.add(b41.q(arrayList32.size(), 7));
                        return;
                    }
                    return;
                }
                v8 y10 = v8.y(i72, jbVar.f8872e);
                ArrayList arrayList34 = y10.f9612q[i73];
                int size13 = arrayList34.size();
                int i75 = 0;
                while (i75 < size13) {
                    Object obj16 = arrayList34.get(i75);
                    i75++;
                    int i76 = gb.f8624b;
                    b41 K12 = b41.K(gb.class);
                    K12.G = (TL_stars.StarsTransaction) obj16;
                    K12.f33186q = false;
                    arrayList32.add(K12);
                }
                if (!y10.f9616u[i73]) {
                    arrayList32.add(b41.q(arrayList32.size(), 7));
                    arrayList32.add(b41.q(arrayList32.size(), 7));
                    arrayList32.add(b41.q(arrayList32.size(), 7));
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
                hi.t1 t1Var = (hi.t1) obj3;
                String str4 = (String) obj;
                hi.i2 i2Var = t1Var.f15141r;
                i2Var.f14403m1 = str4;
                i2Var.n1 = ((Integer) obj2).intValue();
                t1Var.f15137c.H(str4);
                return;
            case 27:
                d(obj, obj2);
                return;
            case 28:
                e(obj, obj2);
                return;
            default:
                hi.m5 m5Var = (hi.m5) obj3;
                m5Var.b0(m5Var.g0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                return;
        }
    }
}
