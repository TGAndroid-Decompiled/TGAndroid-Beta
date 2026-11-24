package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ArticleViewer$WindowView;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class y extends k69 {
    public final byte a;
    public final Object b;

    public y(vg1 vg1Var) {
        this.a = (byte) 14;
        this.b = vg1Var;
        Typeface typeface = gm.a;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        b59 b59Var;
        int i2;
        b59 b59Var2;
        b59 b59Var3;
        int top;
        int i3;
        b59 b59Var4;
        b59 b59Var5;
        int top2;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 2:
                if (i == 1) {
                    gm.t1(((wc) obj).a);
                    return;
                }
                return;
            case 5:
                if (i == 0) {
                    ((m) obj).M.Q0.U();
                    return;
                }
                return;
            case 6:
                i30 i30Var = (i30) obj;
                p20 p20Var = i30Var.r1;
                if (i == 0) {
                    int L = gm.L(13.0f);
                    int i4 = i30Var.t2;
                    int i5 = i30Var.t0;
                    if (((i4 - i5) - L) + i5 < a.getCurrentActionBarHeight() && p20Var.canScrollVertically(1) && (b59Var = (b59) p20Var.K(i30Var.o2 ? 1 : 0)) != null) {
                        View view = b59Var.a;
                        if (view.getTop() > gm.L(7.0f)) {
                            p20Var.x0(0, view.getTop() - gm.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 1) {
                    gm.t1(i30Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 14:
                vg1 vg1Var = (vg1) obj;
                if (i == 1) {
                    vg1Var.T = true;
                    vg1Var.W = true;
                    return;
                } else if (i == 0) {
                    vg1Var.T = false;
                    vg1Var.W = false;
                    vg1Var.Q0(true);
                    return;
                } else {
                    return;
                }
            case 16:
                if (i == 1) {
                    gm.t1(((yv1) obj).m1);
                    return;
                }
                return;
            case 18:
                h32 h32Var = (h32) obj;
                fv fvVar = h32Var.n;
                i22 i22Var = h32Var.b;
                if (i == 0) {
                    int L2 = gm.L(13.0f);
                    r7 r7Var = i22Var.X2;
                    if (r7Var != null) {
                        i2 = gm.L(r7Var.getAlpha() * 26.0f);
                    } else {
                        i2 = 0;
                    }
                    int i6 = L2 + i2;
                    int i7 = i22Var.t0;
                    if (((i22Var.Y3[0] - i7) - i6) + i7 < a.getCurrentActionBarHeight() && (b59Var2 = (b59) fvVar.K(0)) != null) {
                        View view2 = b59Var2.a;
                        if (view2.getTop() > gm.L(7.0f)) {
                            fvVar.x0(0, view2.getTop() - gm.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                p42 p42Var = (p42) obj;
                i22 i22Var2 = p42Var.b;
                d42 d42Var = p42Var.r;
                if (i == 0) {
                    int L3 = gm.L(13.0f);
                    int i8 = i22Var2.t0;
                    if (((i22Var2.Y3[0] - i8) - L3) + i8 < a.getCurrentActionBarHeight() && (b59Var3 = (b59) d42Var.K(0)) != null && (top = (b59Var3.a.getTop() - gm.m) - gm.L(56.0f)) > 0) {
                        d42Var.x0(0, top, null);
                    }
                }
                if (i == 1 && p42Var.c0 && d42Var.getAdapter() == p42Var.E) {
                    gm.t1(i22Var2.getCurrentFocus());
                }
                if (i != 0) {
                    z = true;
                }
                p42Var.V = z;
                return;
            case 21:
                q42 q42Var = (q42) obj;
                r59 r59Var = q42Var.r;
                i22 i22Var3 = q42Var.b;
                if (i == 0) {
                    int L4 = gm.L(13.0f);
                    r7 r7Var2 = i22Var3.X2;
                    if (r7Var2 != null) {
                        i3 = gm.L(r7Var2.getAlpha() * 26.0f);
                    } else {
                        i3 = 0;
                    }
                    int i9 = L4 + i3;
                    int i10 = i22Var3.t0;
                    if (((i22Var3.Y3[0] - i10) - i9) + i10 < a.getCurrentActionBarHeight() && (b59Var4 = (b59) r59Var.K(0)) != null) {
                        View view3 = b59Var4.a;
                        if (view3.getTop() > gm.L(7.0f)) {
                            r59Var.x0(0, view3.getTop() - gm.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                v72 v72Var = (v72) obj;
                smb smbVar = v72Var.s;
                if (i == 0) {
                    int L5 = gm.L(13.0f);
                    i22 i22Var4 = v72Var.b;
                    int i11 = i22Var4.t0;
                    if (((i22Var4.Y3[0] - i11) - L5) + i11 < a.getCurrentActionBarHeight() && (b59Var5 = (b59) smbVar.K(1)) != null && (top2 = (b59Var5.a.getTop() - gm.m) - gm.L(65.0f)) > 0) {
                        smbVar.x0(0, top2, null);
                    }
                    int i12 = v72Var.X0;
                    if (i12 >= 0) {
                        v72Var.k0(i12);
                        v72Var.X0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 25:
                if (i == 1) {
                    gm.t1(((ke2) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 28:
                if (i == 1) {
                    gm.t1(((wg2) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        float f;
        sh4 sh4Var;
        ig5 ig5Var;
        u69 T;
        byte b = this.a;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((a1) obj).u1();
                return;
            case 1:
                ((pf2) obj).run();
                return;
            case 2:
                ((wc) obj).a();
                return;
            case 3:
                ht htVar = (ht) obj;
                if (!htVar.J && !htVar.r && htVar.d.M0() > htVar.F - 2) {
                    htVar.b0();
                    return;
                }
                return;
            case 4:
                o oVar = (o) obj;
                if (oVar.j0.x.J1) {
                    gm.t1(oVar.i0.c0);
                    return;
                }
                return;
            case 5:
                o oVar2 = ((m) obj).M;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    oVar2.Q0.F();
                    sx sxVar = oVar2.L;
                    if (sxVar != null) {
                        sxVar.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = oVar2.g0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    oVar2.d0();
                    sx sxVar2 = oVar2.L;
                    if (sxVar2 == null || sxVar2.G) {
                        oVar2.V(oVar2.K0 - i2);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                i30 i30Var = (i30) obj;
                u46 u46Var = i30Var.s1;
                i30Var.U0();
                i30Var.T0();
                if (!i30Var.p1) {
                    int K0 = u46Var.K0();
                    if (i30Var.o2) {
                        K0 = Math.max(0, K0 - 1);
                    }
                    if (K0 != -1) {
                        i3 = Math.abs(u46Var.M0() - K0) + 1;
                    }
                    int b2 = recyclerView.getAdapter().b();
                    MediaController.w();
                    if (gda.K0) {
                        if (K0 < 10) {
                            MediaController.w().O();
                            return;
                        }
                        return;
                    } else if (K0 + i3 > b2 - 10) {
                        MediaController.w().O();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 7:
                dn0 dn0Var = (dn0) obj;
                if (!dn0Var.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(dn0Var.w)) {
                        dn0Var.e.d();
                    } else {
                        cb cbVar = dn0Var.f;
                        if (cbVar != null) {
                            cbVar.d();
                        }
                    }
                }
                if (dn0Var.a.J1) {
                    gm.t1(dn0Var.fragmentView);
                    return;
                }
                return;
            case 8:
                py1 py1Var = (py1) obj;
                View m = py1Var.c.getLayoutManager().m(0);
                float f2 = 0.0f;
                if (m != null) {
                    f = m.getY();
                } else {
                    f = 0.0f;
                }
                if (f >= 0.0f) {
                    f2 = f;
                }
                py1Var.h = f2;
                py1Var.b();
                return;
            case 9:
                zt0 zt0Var = (zt0) obj;
                yt0 yt0Var = zt0Var.n;
                if (!recyclerView.canScrollVertically(1)) {
                    zt0Var.removeCallbacks(yt0Var);
                    zt0Var.post(yt0Var);
                    return;
                }
                return;
            case 10:
                ((ela) obj).invalidate();
                return;
            case 11:
                ((f51) obj).m0();
                return;
            case 12:
                y71 y71Var = (y71) obj;
                if (y71Var.b.canScrollVertically(-1) || y71.a0(y71Var).x()) {
                    z = true;
                }
                fn0 fn0Var = y71Var.T;
                if (fn0Var != null) {
                    fn0Var.a(z, true);
                    return;
                }
                return;
            case 13:
                ((k91) obj).t0();
                return;
            case 14:
                vg1 vg1Var = (vg1) obj;
                vg1Var.w.invalidate();
                if (i2 != 0 && vg1Var.T && !vg1Var.R && vg1Var.N.getTag() == null) {
                    AnimatorSet animatorSet = vg1Var.S;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    vg1Var.N.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    vg1Var.S = animatorSet2;
                    animatorSet2.setDuration(150L);
                    vg1Var.S.playTogether(ObjectAnimator.ofFloat(vg1Var.N, "alpha", 1.0f));
                    vg1Var.S.addListener(new b91(this, (byte) 3));
                    vg1Var.S.start();
                }
                vg1Var.L0(true);
                vg1Var.h1();
                return;
            case 15:
                mh1 mh1Var = (mh1) obj;
                long j = mh1Var.S;
                while (true) {
                    if (i4 < mh1Var.c.getChildCount()) {
                        if (!(mh1Var.c.getChildAt(i4) instanceof tk4)) {
                            i4++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                ku0.g(mh1.A0(mh1Var)).d(j).a();
                ku0.g(mh1.B0(mh1Var)).e(j).a();
                return;
            case 16:
            case 25:
            default:
                return;
            case 17:
                s22 s22Var = (s22) obj;
                s22Var.b.H1(s22Var, i2);
                return;
            case 18:
                h32 h32Var = (h32) obj;
                if (h32Var.n.getChildCount() > 0) {
                    h32Var.b.H1(h32Var, i2);
                    return;
                }
                return;
            case 19:
                w32 w32Var = (w32) obj;
                w32Var.b.H1(w32Var, i2);
                w32Var.S();
                return;
            case 20:
                p42 p42Var = (p42) obj;
                l32 l32Var = p42Var.F;
                p42Var.b.H1(p42Var, i2);
                p42Var.Z();
                y59 adapter = p42Var.r.getAdapter();
                o42 o42Var = p42Var.E;
                if (adapter == o42Var) {
                    int K02 = l32Var.K0();
                    int M0 = l32Var.M0();
                    int abs = Math.abs(M0 - K02) + 1;
                    int b3 = recyclerView.getAdapter().b();
                    if (abs > 0 && M0 >= b3 - 10) {
                        o42 o42Var2 = o42Var.Y.E;
                        if (!o42Var2.T && !o42Var2.W && (sh4Var = o42Var.E) != null) {
                            o42Var.Z(o42Var.y, o42Var.F, o42Var.G, sh4Var, o42Var.K, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                q42 q42Var = (q42) obj;
                q42Var.b.H1(q42Var, i2);
                q42Var.w.setTranslationY(Math.max(0, q42Var.getCurrentItemTop()));
                return;
            case 22:
                v72 v72Var = (v72) obj;
                l32 l32Var2 = v72Var.x;
                v72Var.b.H1(v72Var, i2);
                n72 n72Var = v72Var.y;
                if (n72Var != null && n72Var.s) {
                    ddb delegate = n72Var.getDelegate();
                    if (delegate instanceof ng8) {
                        smb smbVar = v72Var.s;
                        View F = smbVar.F((ng8) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = smbVar.T(F);
                        }
                        if (T != null) {
                            View view = T.a;
                            int b4 = T.b();
                            if (n72Var.getDirection() == 0) {
                                n72Var.setTranslationY((view.getY() - gm.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                n72Var.setTranslationY(view.getY());
                            }
                            if (b4 < l32Var2.K0() || b4 > l32Var2.M0()) {
                                n72Var.e();
                            }
                        } else {
                            n72Var.e();
                        }
                    } else {
                        n72Var.e();
                    }
                }
                if (i2 != 0 && (ig5Var = v72Var.E) != null) {
                    ig5Var.a();
                    return;
                }
                return;
            case 23:
                a82 a82Var = (a82) obj;
                a82Var.b.H1(a82Var, i2);
                a82Var.Q();
                return;
            case 24:
                q82 q82Var = (q82) obj;
                q82Var.b.H1(q82Var, i2);
                return;
            case 26:
                ((qe2) obj).c(true);
                return;
            case 27:
                if2 if2Var = (if2) obj;
                if (if2Var.w1.L0() + 10 >= if2Var.q1.b()) {
                    if2Var.K0();
                    return;
                }
                return;
            case 28:
                return;
            case 29:
                ap2 ap2Var = (ap2) obj;
                ap2Var.w.b(ap2Var.d);
                return;
        }
    }

    public y(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void c(RecyclerView recyclerView, int i, int i2) {
    }
}
