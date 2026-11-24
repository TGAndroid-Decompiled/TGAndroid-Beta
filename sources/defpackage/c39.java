package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import java.util.Iterator;
import java.util.Stack;
import org.telegram.ui.SecretMediaViewer;
public final class c39 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public c39(pfa pfaVar, f69 f69Var) {
        this.a = (byte) 16;
        this.b = pfaVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 17:
                pha phaVar = (pha) this.b;
                AnimatorSet animatorSet = phaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    phaVar.h = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((d39) obj).y.c();
                return;
            case 1:
                r59 r59Var = (r59) obj;
                View view = r59Var.b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (r59Var.c1()) {
                    r59Var.invalidate();
                    return;
                }
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((ri9) obj).w = null;
                return;
            case 3:
                bn9 bn9Var = (bn9) obj;
                if (bn9Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) bn9Var.getParent()).removeView(bn9Var);
                    return;
                }
                return;
            case 4:
                gt9 gt9Var = (gt9) obj;
                if (gt9Var.s != null) {
                    gt9Var.j();
                    gt9Var.s.invalidate();
                    gt9Var.e.invalidate();
                    gt9Var.invalidate();
                    gt9Var.s = null;
                    return;
                }
                return;
            case 5:
                ((lt9) obj).d = false;
                return;
            case 6:
                ((vv9) obj).P0.setVisibility(8);
                return;
            case 7:
                ((iw9) obj).d.Z.k0 = 1.0f;
                return;
            case 8:
                SecretMediaViewer secretMediaViewer = ((iw9) obj).d;
                secretMediaViewer.Z.setVisibility(4);
                secretMediaViewer.Z.k0 = 1.0f;
                return;
            case 9:
                vz9 vz9Var = ((my9) obj).e;
                vz9Var.T0.H = 0.0f;
                vz9Var.T0 = null;
                vz9Var.i0.invalidate();
                return;
            case 10:
                oi5.a();
                vz9 vz9Var2 = (vz9) obj;
                ty9 ty9Var = vz9Var2.i0;
                ty9 ty9Var2 = vz9Var2.i0;
                ty9Var.setLayerType(0, null);
                ny9 ny9Var = vz9Var2.g0;
                ny9Var.setLayerType(0, null);
                vz9Var2.f0.setLayerType(0, null);
                vz9Var2.c0.setLayerType(0, null);
                o72 o72Var = vz9Var2.o0;
                if (o72Var != null) {
                    o72Var.setLayerType(0, null);
                }
                View view2 = vz9Var2.n0;
                if (view2 != null) {
                    view2.setLayerType(0, null);
                }
                ny9Var.a();
                vz9Var2.e0.m(false);
                nm7.e().k(100, 512);
                vz9Var2.Y1.e();
                gm.c3(new em7(nm7.e(), (byte) 3));
                vz9Var2.f();
                vz9Var2.E(1.0f);
                for (int i2 = 0; i2 < ty9Var2.getChildCount(); i2++) {
                    View childAt = ty9Var2.getChildAt(i2);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                while (true) {
                    int childCount = vz9Var2.e0.b.getChildCount();
                    mz3 mz3Var = vz9Var2.e0;
                    if (i < childCount) {
                        View childAt2 = mz3Var.b.getChildAt(i);
                        childAt2.setScaleX(1.0f);
                        childAt2.setScaleY(1.0f);
                        i++;
                    } else {
                        mz3Var.b.invalidate();
                        vz9Var2.l0.invalidate();
                        ty9Var2.invalidate();
                        return;
                    }
                }
            case 11:
                ((p1a) obj).N = null;
                return;
            case 12:
                z1a z1aVar = (z1a) obj;
                z1aVar.x = null;
                z1aVar.r = 1.0f;
                z1aVar.invalidate();
                return;
            case 13:
                m6a m6aVar = (m6a) obj;
                if (animator == m6aVar.h) {
                    m6aVar.h = null;
                    return;
                }
                return;
            case 14:
                ((hca) obj).f = null;
                return;
            case 15:
                ct8 ct8Var = (ct8) obj;
                if (ct8Var.getParent() != null) {
                    ((ViewGroup) ct8Var.getParent()).removeView(ct8Var);
                    return;
                }
                return;
            case 16:
                pfa pfaVar = (pfa) obj;
                tk4 tk4Var = pfaVar.c;
                tk4Var.setAlpha(1.0f);
                f69.w0(tk4Var);
                pfaVar.a.removeView(tk4Var);
                return;
            case 17:
                pha phaVar = (pha) obj;
                AnimatorSet animatorSet = phaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    phaVar.h = null;
                    return;
                }
                return;
            case 18:
                sha shaVar = (sha) obj;
                shaVar.n.P0 = true;
                shaVar.invalidate();
                return;
            case 19:
                dka dkaVar = (dka) obj;
                if (dkaVar.f == animator) {
                    dkaVar.f = null;
                    return;
                }
                return;
            case 20:
                rna rnaVar = (rna) obj;
                Stack stack = rnaVar.c;
                Iterator it = rnaVar.h.iterator();
                while (it.hasNext()) {
                    nna nnaVar = (nna) it.next();
                    if (stack.size() < rnaVar.d) {
                        stack.push(nnaVar);
                    }
                    it.remove();
                }
                Runnable runnable = rnaVar.q;
                if (runnable != null) {
                    runnable.run();
                    rnaVar.q = null;
                }
                rnaVar.r = null;
                rnaVar.invalidateSelf();
                return;
            case 21:
                ora oraVar = (ora) obj;
                oraVar.F = 1.0f;
                oraVar.G = -1;
                nra nraVar = oraVar.I;
                if (nraVar != null && (z = nraVar.l) && z) {
                    nraVar.l = false;
                    nraVar.b();
                }
                oraVar.H = null;
                return;
            case 22:
                mh2 mh2Var = ((cxa) obj).c;
                mh2Var.setScaleX(1.0f);
                mh2Var.setScaleY(1.0f);
                return;
            case 23:
                ((xza) obj).b0.setVisibility(8);
                return;
            case 24:
                u0b u0bVar = (u0b) obj;
                u0b.z1(u0bVar, ((Float) u0bVar.x3.getAnimatedValue()).floatValue());
                u0bVar.x3 = null;
                return;
            case 25:
                x2b x2bVar = (x2b) obj;
                x2bVar.w1.setVisibility(8);
                x2bVar.z1.setImageDrawable(null);
                return;
            case 26:
                int i3 = 0;
                while (true) {
                    f35[] f35VarArr = (f35[]) obj;
                    if (i3 < f35VarArr.length) {
                        f35 f35Var = f35VarArr[i3];
                        if (f35Var != null) {
                            f35Var.c = false;
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            case 27:
                super.onAnimationEnd(animator);
                ((g3b) obj).I = null;
                return;
            case 28:
            default:
                super.onAnimationEnd(animator);
                return;
            case 29:
                k5b k5bVar = (k5b) obj;
                k5bVar.I = false;
                k5bVar.H = 0.0f;
                k5bVar.invalidate();
                k5bVar.requestLayout();
                k5bVar.K.requestLayout();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                lt9 lt9Var = (lt9) obj;
                lt9Var.d = true;
                if (lt9Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) lt9Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            case 28:
                super.onAnimationStart(animator);
                l4b l4bVar = (l4b) obj;
                p09 p09Var = ((k4b) l4bVar.a.get(l4bVar.d)).c;
                p09Var.M = 2;
                p09Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public c39(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
