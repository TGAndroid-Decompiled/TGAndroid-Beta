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
public final class ng9 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public ng9(pda pdaVar, d49 d49Var) {
        this.a = (byte) 14;
        this.b = pdaVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 15:
                ofa ofaVar = (ofa) this.b;
                AnimatorSet animatorSet = ofaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ofaVar.h = null;
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
                super.onAnimationEnd(animator);
                ((og9) obj).w = null;
                return;
            case 1:
                bl9 bl9Var = (bl9) obj;
                if (bl9Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) bl9Var.getParent()).removeView(bl9Var);
                    return;
                }
                return;
            case 2:
                er9 er9Var = (er9) obj;
                if (er9Var.s != null) {
                    er9Var.j();
                    er9Var.s.invalidate();
                    er9Var.e.invalidate();
                    er9Var.invalidate();
                    er9Var.s = null;
                    return;
                }
                return;
            case 3:
                ((jr9) obj).d = false;
                return;
            case 4:
                ((tt9) obj).P0.setVisibility(8);
                return;
            case 5:
                ((fu9) obj).d.Z.k0 = 1.0f;
                return;
            case 6:
                SecretMediaViewer secretMediaViewer = ((fu9) obj).d;
                secretMediaViewer.Z.setVisibility(4);
                secretMediaViewer.Z.k0 = 1.0f;
                return;
            case 7:
                tx9 tx9Var = ((kw9) obj).e;
                tx9Var.T0.H = 0.0f;
                tx9Var.T0 = null;
                tx9Var.i0.invalidate();
                return;
            case 8:
                pg5.a();
                tx9 tx9Var2 = (tx9) obj;
                rw9 rw9Var = tx9Var2.i0;
                rw9 rw9Var2 = tx9Var2.i0;
                rw9Var.setLayerType(0, null);
                lw9 lw9Var = tx9Var2.g0;
                lw9Var.setLayerType(0, null);
                tx9Var2.f0.setLayerType(0, null);
                tx9Var2.c0.setLayerType(0, null);
                d62 d62Var = tx9Var2.o0;
                if (d62Var != null) {
                    d62Var.setLayerType(0, null);
                }
                View view = tx9Var2.n0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                lw9Var.a();
                tx9Var2.e0.m(false);
                kk7.e().k(99, 512);
                tx9Var2.Y1.e();
                gl.c3(new bk7(kk7.e(), (byte) 3));
                tx9Var2.f();
                tx9Var2.E(1.0f);
                for (int i2 = 0; i2 < rw9Var2.getChildCount(); i2++) {
                    View childAt = rw9Var2.getChildAt(i2);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                while (true) {
                    int childCount = tx9Var2.e0.b.getChildCount();
                    cy3 cy3Var = tx9Var2.e0;
                    if (i < childCount) {
                        View childAt2 = cy3Var.b.getChildAt(i);
                        childAt2.setScaleX(1.0f);
                        childAt2.setScaleY(1.0f);
                        i++;
                    } else {
                        cy3Var.b.invalidate();
                        tx9Var2.l0.invalidate();
                        rw9Var2.invalidate();
                        return;
                    }
                }
            case 9:
                ((nz9) obj).N = null;
                return;
            case 10:
                xz9 xz9Var = (xz9) obj;
                xz9Var.x = null;
                xz9Var.r = 1.0f;
                xz9Var.invalidate();
                return;
            case 11:
                k4a k4aVar = (k4a) obj;
                if (animator == k4aVar.h) {
                    k4aVar.h = null;
                    return;
                }
                return;
            case 12:
                ((haa) obj).f = null;
                return;
            case 13:
                ar8 ar8Var = (ar8) obj;
                if (ar8Var.getParent() != null) {
                    ((ViewGroup) ar8Var.getParent()).removeView(ar8Var);
                    return;
                }
                return;
            case 14:
                pda pdaVar = (pda) obj;
                pi4 pi4Var = pdaVar.c;
                pi4Var.setAlpha(1.0f);
                d49.w0(pi4Var);
                pdaVar.a.removeView(pi4Var);
                return;
            case 15:
                ofa ofaVar = (ofa) obj;
                AnimatorSet animatorSet = ofaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ofaVar.h = null;
                    return;
                }
                return;
            case 16:
                qfa qfaVar = (qfa) obj;
                qfaVar.n.P0 = true;
                qfaVar.invalidate();
                return;
            case 17:
                bia biaVar = (bia) obj;
                if (biaVar.f == animator) {
                    biaVar.f = null;
                    return;
                }
                return;
            case 18:
                qla qlaVar = (qla) obj;
                Stack stack = qlaVar.c;
                Iterator it = qlaVar.h.iterator();
                while (it.hasNext()) {
                    mla mlaVar = (mla) it.next();
                    if (stack.size() < qlaVar.d) {
                        stack.push(mlaVar);
                    }
                    it.remove();
                }
                Runnable runnable = qlaVar.q;
                if (runnable != null) {
                    runnable.run();
                    qlaVar.q = null;
                }
                qlaVar.r = null;
                qlaVar.invalidateSelf();
                return;
            case 19:
                opa opaVar = (opa) obj;
                opaVar.F = 1.0f;
                opaVar.G = -1;
                npa npaVar = opaVar.I;
                if (npaVar != null && (z = npaVar.l) && z) {
                    npaVar.l = false;
                    npaVar.b();
                }
                opaVar.H = null;
                return;
            case 20:
                yf2 yf2Var = ((yua) obj).c;
                yf2Var.setScaleX(1.0f);
                yf2Var.setScaleY(1.0f);
                return;
            case 21:
                ((uxa) obj).b0.setVisibility(8);
                return;
            case 22:
                tya tyaVar = (tya) obj;
                tya.z1(tyaVar, ((Float) tyaVar.x3.getAnimatedValue()).floatValue());
                tyaVar.x3 = null;
                return;
            case 23:
                u0b u0bVar = (u0b) obj;
                u0bVar.w1.setVisibility(8);
                u0bVar.z1.setImageDrawable(null);
                return;
            case 24:
                int i3 = 0;
                while (true) {
                    f15[] f15VarArr = (f15[]) obj;
                    if (i3 < f15VarArr.length) {
                        f15 f15Var = f15VarArr[i3];
                        if (f15Var != null) {
                            f15Var.c = false;
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            case 25:
                super.onAnimationEnd(animator);
                ((e1b) obj).I = null;
                return;
            case 26:
            default:
                super.onAnimationEnd(animator);
                return;
            case 27:
                j3b j3bVar = (j3b) obj;
                j3bVar.I = false;
                j3bVar.H = 0.0f;
                j3bVar.invalidate();
                j3bVar.requestLayout();
                j3bVar.K.requestLayout();
                return;
            case 28:
                ((t5b) obj).O = false;
                return;
            case 29:
                r5b r5bVar = (r5b) obj;
                r5bVar.setTranslationY(0.0f);
                r5bVar.d = null;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                jr9 jr9Var = (jr9) obj;
                jr9Var.d = true;
                if (jr9Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) jr9Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            case 26:
                super.onAnimationStart(animator);
                k2b k2bVar = (k2b) obj;
                oy8 oy8Var = ((j2b) k2bVar.a.get(k2bVar.d)).c;
                oy8Var.M = 2;
                oy8Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ng9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
