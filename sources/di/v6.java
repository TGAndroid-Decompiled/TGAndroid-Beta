package di;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.jl0;
import org.telegram.ui.za1;
public final class v6 implements jl0, u10, OnSuccessListener, sj0, q10, rj0, fi.x6, fi.z8, xh.j, r0.m, h9.g1, org.telegram.ui.ActionBar.q1, tg.a, hi.m7, gj0, sg.i1, CameraController.VideoTakeCallback, qt0, f3.g {
    public final int f9918a;
    public final Object f9919b;

    public v6(Object obj, int i7) {
        this.f9918a = i7;
        this.f9919b = obj;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public boolean b(int r37, final android.view.View r38) {
        throw new UnsupportedOperationException("Method not decompiled: di.v6.b(int, android.view.View):boolean");
    }

    @Override
    public void c(boolean z10) {
        fi.a5 a5Var = (fi.a5) this.f9919b;
        if (a5Var != null) {
            a5Var.c();
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        int i7 = this.f9918a;
        Object obj2 = this.f9919b;
        switch (i7) {
            case 6:
                Long l10 = (Long) number;
                return fi.t0.a((fi.t0) obj2, (Long) obj);
            default:
                eq0 eq0Var = (eq0) obj2;
                Integer num = (Integer) obj;
                if (((Integer) number).intValue() == -1) {
                    new gi.p(eq0Var.f13659a, gd.N0(2131746497, null), new ai.d0(eq0Var, 20)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void e(int i7) {
        switch (this.f9918a) {
            case 0:
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.f9919b;
                if (i7 == 1) {
                    f0Var.a(Boolean.TRUE, null);
                    return;
                } else if (i7 != 3) {
                    f0Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                bi.h8 h8Var = (bi.h8) this.f9919b;
                if (i7 == 1) {
                    h8Var.a(Boolean.TRUE, null);
                    return;
                } else if (i7 != 3) {
                    h8Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void f() {
        ((hi.w1) this.f9919b).invalidate();
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        long j3;
        long j10;
        int i10;
        int i11;
        int i12;
        fi.a2 a2Var = (fi.a2) this.f9919b;
        b1 b1Var = a2Var.f12564c;
        ArrayList arrayList = a2Var.f12574r;
        fi.s0 s0Var = ((fi.q0) view).f12454f;
        int i13 = a2Var.O;
        int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            j3 = 0;
            if (i15 >= s0Var.f12520f.size()) {
                break;
            }
            fi.r0 r0Var = (fi.r0) s0Var.f12520f.get(i15);
            long j11 = r0Var.f12484g;
            if (j11 > 0 && currentTime - r0Var.d <= fi.t.b(i13, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(r0Var.f12479a));
            }
            i15++;
        }
        fi.c1 c1Var = a2Var.Q;
        if (c1Var != null) {
            j3 = c1Var.j();
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < arrayList.size()) {
            fi.r0 r0Var2 = (fi.r0) arrayList.get(i16);
            if (!r0Var2.f12480b && r0Var2.f12482e && r0Var2.f12484g < j3) {
                j10 = j3;
            } else {
                if (hashSet.contains(Integer.valueOf(r0Var2.f12479a))) {
                    j10 = j3;
                    if (a2Var.f12577x != s0Var.f12517b || (i12 = a2Var.f12578y) == 0 || r0Var2.f12479a < i12) {
                        i10 = r0Var2.f12479a;
                        break;
                    }
                } else {
                    j10 = j3;
                }
                i17++;
            }
            i16++;
            j3 = j10;
        }
        j10 = j3;
        i10 = -1;
        if (i10 < 0) {
            int i18 = 0;
            while (true) {
                if (i14 < arrayList.size()) {
                    fi.r0 r0Var3 = (fi.r0) arrayList.get(i14);
                    if (r0Var3.f12480b || !r0Var3.f12482e || r0Var3.f12484g >= j10) {
                        if (hashSet.contains(Integer.valueOf(r0Var3.f12479a))) {
                            i11 = r0Var3.f12479a;
                            i17 = i18;
                            break;
                        }
                        i18++;
                    }
                    i14++;
                } else {
                    i17 = i18;
                    i11 = -1;
                    break;
                }
            }
        } else {
            i11 = i10;
        }
        if (i11 < 0) {
            return;
        }
        a2Var.f12577x = s0Var.f12517b;
        a2Var.f12578y = i11;
        a2Var.E = true;
        v4.n0 itemAnimator = b1Var.getItemAnimator();
        b1Var.setItemAnimator(null);
        a2Var.d.i1(i17, b1Var.getHeight() / 2, true);
        a2Var.f12567e.g(i17);
        b1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public long h(long j3) {
        f3.u uVar = (f3.u) this.f9919b;
        return h2.l0.j((j3 * uVar.f11202e) / 1000000, 0L, uVar.f11206j - 1);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f9918a) {
            case 17:
                hi.nb nbVar = ((hi.db) ((hi.s) this.f9919b)).S1;
                hi.bb bbVar = nbVar.Y0;
                if (bbVar != null) {
                    bbVar.s(null, null, true);
                }
                hi.pa paVar = nbVar.f15126w1;
                if (paVar != null) {
                    paVar.p0();
                }
                hi.db dbVar = nbVar.f15067d1;
                if (dbVar != null) {
                    dbVar.setHasRoundVideo(false);
                }
                hi.x7 x7Var = nbVar.L1;
                if (x7Var != null) {
                    File file = x7Var.f15764o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        nbVar.L1.f15764o0 = null;
                    }
                    if (nbVar.L1.f15766p0 != null) {
                        try {
                            new File(nbVar.L1.f15766p0).delete();
                        } catch (Exception unused2) {
                        }
                        nbVar.L1.f15766p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ((hi.o5) this.f9919b).f15156a.d2.r();
                return;
            default:
                ((TwoStepVerificationActivity) this.f9919b).presentFragment(new za1(6, null));
                return;
        }
    }

    @Override
    public float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.ActionBar.g2 T;
        switch (this.f9918a) {
            case 2:
                mb mbVar = (mb) this.f9919b;
                n41 n41Var = (n41) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                Object obj3 = n41Var.H;
                if (obj3 instanceof TL_stars.StarsTransaction) {
                    pb.l1(mbVar.getContext(), false, 0L, mbVar.f9324c, (TL_stars.StarsTransaction) n41Var.H, mbVar.f9323b);
                    return;
                } else if ((obj3 instanceof TL_wallet.walletTransaction) && (T = LaunchActivity.T()) != null) {
                    T.presentFragment(new org.telegram.ui.Wallet.o6());
                    return;
                } else {
                    return;
                }
            case 22:
                hi.ga gaVar = (hi.ga) this.f9919b;
                n41 n41Var2 = (n41) obj;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                int i7 = n41Var2.d;
                hi.x7 x7Var = (hi.x7) n41Var2.H;
                gaVar.c(false, true);
                hi.nb nbVar = gaVar.P;
                if (x7Var != nbVar.L1 && !nbVar.Y1) {
                    nbVar.f15070e1.setSelected(i7);
                    nbVar.Y1 = true;
                    ai.u0 u0Var = new ai.u0(nbVar, i7, 14);
                    hi.pa paVar = nbVar.f15126w1;
                    hi.x7 x7Var2 = nbVar.L1;
                    if (paVar != null && x7Var2 != null) {
                        if (!paVar.t0()) {
                            u0Var.run();
                            return;
                        }
                        x7Var2.f();
                        Utilities.f22879g.c(new hi.p9(nbVar, paVar, x7Var2.f15753i0, x7Var2.f15755j0, x7Var2, paVar.f15600y0.getPainting().E, paVar.t0(), u0Var, 0));
                        return;
                    }
                    u0Var.run();
                    return;
                }
                return;
            default:
                kg.e1 e1Var = (kg.e1) this.f9919b;
                n41 n41Var3 = (n41) obj;
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                float floatValue = ((Float) serializable).floatValue();
                Float f14 = (Float) serializable2;
                int i10 = n41Var3.d;
                if (i10 == -1) {
                    boolean z10 = !e1Var.d;
                    e1Var.d = z10;
                    ((org.telegram.ui.Cells.r8) view3).setChecked(z10);
                    e1Var.f18396a.f35323g3.O(true);
                    e1Var.d0(true);
                    return;
                } else if (i10 == -2) {
                    ?? g2Var = new org.telegram.ui.ActionBar.g2(null);
                    g2Var.f18637n = e1Var.f18401n;
                    g2Var.f18634c = new ai.s1(26, e1Var, view3);
                    e1Var.presentFragment((org.telegram.ui.ActionBar.g2) g2Var);
                    return;
                } else if (n41Var3.f56712a == 5 && i10 >= 0 && i10 < e1Var.f18400f.length) {
                    if (!gd.f24314a0 ? floatValue >= view3.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f) : floatValue <= org.telegram.messenger.g0.L(76.0f)) {
                        if (e1Var.f18400f[n41Var3.d].isEmpty()) {
                            ((org.telegram.ui.Cells.i5) view3).setChecked(true);
                            e1Var.f18400f[n41Var3.d].add(new kg.d1(0, 1439));
                            e1Var.c0(n41Var3.d);
                        } else {
                            e1Var.f18400f[n41Var3.d].clear();
                            ((org.telegram.ui.Cells.i5) view3).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.i5) view3).setValue(kg.e1.f0(e1Var.f18400f[n41Var3.d]));
                        e1Var.d0(true);
                        return;
                    }
                    int i11 = (n41Var3.d + 6) % 7;
                    int i12 = 0;
                    for (int i13 = 0; i13 < e1Var.f18400f[i11].size(); i13++) {
                        if (((kg.d1) e1Var.f18400f[i11].get(i13)).f18380b > i12) {
                            i12 = ((kg.d1) e1Var.f18400f[i11].get(i13)).f18380b;
                        }
                    }
                    int max = Math.max(0, i12 - 1439);
                    int i14 = (n41Var3.d + 1) % 7;
                    int i15 = 1440;
                    for (int i16 = 0; i16 < e1Var.f18400f[i14].size(); i16++) {
                        if (((kg.d1) e1Var.f18400f[i14].get(i16)).f18379a < i15) {
                            i15 = ((kg.d1) e1Var.f18400f[i14].get(i16)).f18379a;
                        }
                    }
                    int i17 = i15 + 1439;
                    CharSequence charSequence = n41Var3.f37655m;
                    ArrayList arrayList = e1Var.f18400f[n41Var3.d];
                    int i18 = 0;
                    for (int i19 = 0; i19 < 7; i19++) {
                        ArrayList arrayList2 = e1Var.f18400f[i19];
                        if (arrayList2 != null) {
                            i18 = Math.max(1, arrayList2.size()) + i18;
                        }
                    }
                    kg.h1 h1Var = new kg.h1(charSequence, arrayList, max, i17, 28 - i18);
                    h1Var.f18430f = new kg.i0(e1Var, 3);
                    h1Var.h = new ji.f(6, e1Var, n41Var3);
                    e1Var.presentFragment(h1Var);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public RecyclerView l(View view) {
        ((ob) this.f9919b).getClass();
        return ((mb) view).f9322a;
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        int a10;
        fi.f9 f9Var = (fi.f9) this.f9919b;
        int i7 = 0;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f9Var.f12007w.getLayoutParams();
        if (!f9Var.f11964c) {
            i7 = l1Var.d();
        }
        marginLayoutParams.topMargin = i7;
        if (f9Var.f11964c) {
            a10 = l1Var.f56381a.f(2).d;
        } else {
            a10 = l1Var.a();
        }
        marginLayoutParams.bottomMargin = a10;
        marginLayoutParams.leftMargin = I0.f15978a;
        marginLayoutParams.rightMargin = I0.f15980c;
        fi.t8 t8Var = f9Var.f11998s;
        if (t8Var != null) {
            t8Var.requestLayout();
        }
        fi.u8 u8Var = f9Var.f12007w;
        if (u8Var != null) {
            u8Var.requestLayout();
        }
        return r0.l1.f56380b;
    }

    @Override
    public float m(CharSequence charSequence) {
        return ((TextPaint) this.f9919b).measureText(charSequence, 0, charSequence.length());
    }

    @Override
    public void n(float f10, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f9919b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), (rectF.bottom + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void o(xh.f fVar, float f10, float f11) {
        fi.w7 w7Var;
        fi.v7 v7Var = (fi.v7) this.f9919b;
        if (!v7Var.v.f12717y) {
            fVar.f60689q = new fi.u7(v7Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(w7Var.getHeight(), 2.0d) + Math.pow(w7Var.getWidth(), 2.0d));
            ArrayList arrayList = v7Var.f12662i;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((xh.f) obj).j(f10, f11, sqrt, false);
            }
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        hi.ka kaVar = (hi.ka) this.f9919b;
        hi.nb nbVar = kaVar.f14800a;
        hi.n6 n6Var = nbVar.P0;
        int i7 = nbVar.f15062c;
        if (n6Var != null) {
            n6Var.g(true);
        }
        if (nbVar.p0()) {
            nbVar.f15111s.d();
        }
        if (nbVar.H1 != null && nbVar.C0 != null) {
            nbVar.R1 = false;
            nbVar.S1 = false;
            hi.j6 j6Var = nbVar.D0;
            if (j6Var != null) {
                j6Var.c(false);
            }
            if (j3 <= 800) {
                nbVar.g(false, true);
                nbVar.c0(false);
                nbVar.K0.b(false, true);
                hi.n6 n6Var2 = nbVar.P0;
                if (n6Var2 != null) {
                    n6Var2.g(true);
                }
                try {
                    nbVar.H1.delete();
                    nbVar.H1 = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                }
                return;
            }
            nbVar.h0(false, true);
            hi.x7 o4 = hi.x7.o(nbVar.H1, str, j3);
            o4.J0 = nbVar.f15125w0;
            o4.K0 = nbVar.f15129x0;
            o4.B();
            nbVar.g(false, true);
            nbVar.c0(false);
            nbVar.K0.b(false, true);
            hi.n6 n6Var3 = nbVar.P0;
            if (n6Var3 != null) {
                n6Var3.g(true);
            }
            if (nbVar.B0.j()) {
                nbVar.H1 = null;
                o4.P = 1.0f;
                if (nbVar.B0.l(o4)) {
                    hi.x7 a10 = hi.x7.a(nbVar.B0.getLayout(), nbVar.B0.getContent());
                    nbVar.L1 = a10;
                    hi.l9.a(i7, a10);
                    nbVar.M1 = false;
                    int videoWidth = nbVar.C0.getVideoWidth();
                    int videoHeight = nbVar.C0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        hi.x7 x7Var = nbVar.L1;
                        x7Var.f15757k0 = videoWidth;
                        x7Var.f15759l0 = videoHeight;
                        x7Var.A();
                    }
                }
                nbVar.l0(true);
                return;
            }
            nbVar.L1 = o4;
            hi.l9.a(i7, o4);
            nbVar.M1 = false;
            int videoWidth2 = nbVar.C0.getVideoWidth();
            int videoHeight2 = nbVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                hi.x7 x7Var2 = nbVar.L1;
                x7Var2.f15757k0 = videoWidth2;
                x7Var2.f15759l0 = videoHeight2;
                x7Var2.A();
            }
            nbVar.K(new hi.ia(kaVar, 3), 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        switch (this.f9918a) {
            case 3:
                ((e1.b) this.f9919b).invoke(obj);
                return;
            case 4:
                ((e1.b) this.f9919b).invoke(obj);
                return;
            default:
                ((ae.d) this.f9919b).invoke(obj);
                return;
        }
    }

    @Override
    public void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    @Override
    public Object u(Object obj, Object obj2) {
        return h9.o.y((List) ((Collection) obj2), new q4.q(((h9.l1) this.f9919b).f14012f, obj, false, 24));
    }

    @Override
    public void v() {
        float f10;
        hi.pa paVar = (hi.pa) this.f9919b;
        TextView textView = paVar.Y0;
        boolean a10 = paVar.f15579n0.a();
        ImageView imageView = paVar.X0;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f11 = 0.6f;
        if (a10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        animate.alpha(f10).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a10) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
