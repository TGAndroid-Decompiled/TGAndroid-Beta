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
public final class po9 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public po9(gha ghaVar, q79 q79Var) {
        this.a = (byte) 13;
        this.b = ghaVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 14:
                fja fjaVar = (fja) this.b;
                AnimatorSet animatorSet = fjaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fjaVar.h = null;
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
                qo9 qo9Var = (qo9) obj;
                if (qo9Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qo9Var.getParent()).removeView(qo9Var);
                    return;
                }
                return;
            case 1:
                xu9 xu9Var = (xu9) obj;
                if (xu9Var.s != null) {
                    xu9Var.j();
                    xu9Var.s.invalidate();
                    xu9Var.e.invalidate();
                    xu9Var.invalidate();
                    xu9Var.s = null;
                    return;
                }
                return;
            case 2:
                ((cv9) obj).d = false;
                return;
            case 3:
                ((nx9) obj).P0.setVisibility(8);
                return;
            case 4:
                ((ay9) obj).d.Z.k0 = 1.0f;
                return;
            case 5:
                SecretMediaViewer secretMediaViewer = ((ay9) obj).d;
                secretMediaViewer.Z.setVisibility(4);
                secretMediaViewer.Z.k0 = 1.0f;
                return;
            case 6:
                n1a n1aVar = ((d0a) obj).e;
                n1aVar.T0.H = 0.0f;
                n1aVar.T0 = null;
                n1aVar.i0.invalidate();
                return;
            case 7:
                ri5.a();
                n1a n1aVar2 = (n1a) obj;
                k0a k0aVar = n1aVar2.i0;
                k0a k0aVar2 = n1aVar2.i0;
                k0aVar.setLayerType(0, null);
                e0a e0aVar = n1aVar2.g0;
                e0aVar.setLayerType(0, null);
                n1aVar2.f0.setLayerType(0, null);
                n1aVar2.c0.setLayerType(0, null);
                t62 t62Var = n1aVar2.o0;
                if (t62Var != null) {
                    t62Var.setLayerType(0, null);
                }
                View view = n1aVar2.n0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                e0aVar.a();
                n1aVar2.e0.m(false);
                jn7.e().k(100, 512);
                n1aVar2.Y1.e();
                hl.c3(new an7(jn7.e(), (byte) 3));
                n1aVar2.f();
                n1aVar2.E(1.0f);
                for (int i2 = 0; i2 < k0aVar2.getChildCount(); i2++) {
                    View childAt = k0aVar2.getChildAt(i2);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                while (true) {
                    int childCount = n1aVar2.e0.b.getChildCount();
                    xy3 xy3Var = n1aVar2.e0;
                    if (i < childCount) {
                        View childAt2 = xy3Var.b.getChildAt(i);
                        childAt2.setScaleX(1.0f);
                        childAt2.setScaleY(1.0f);
                        i++;
                    } else {
                        xy3Var.b.invalidate();
                        n1aVar2.l0.invalidate();
                        k0aVar2.invalidate();
                        return;
                    }
                }
            case 8:
                ((h3a) obj).N = null;
                return;
            case 9:
                r3a r3aVar = (r3a) obj;
                r3aVar.x = null;
                r3aVar.r = 1.0f;
                r3aVar.invalidate();
                return;
            case 10:
                c8a c8aVar = (c8a) obj;
                if (animator == c8aVar.h) {
                    c8aVar.h = null;
                    return;
                }
                return;
            case 11:
                ((yda) obj).f = null;
                return;
            case 12:
                ir8 ir8Var = (ir8) obj;
                if (ir8Var.getParent() != null) {
                    ((ViewGroup) ir8Var.getParent()).removeView(ir8Var);
                    return;
                }
                return;
            case 13:
                gha ghaVar = (gha) obj;
                tk4 tk4Var = ghaVar.c;
                tk4Var.setAlpha(1.0f);
                q79.w0(tk4Var);
                ghaVar.a.removeView(tk4Var);
                return;
            case 14:
                fja fjaVar = (fja) obj;
                AnimatorSet animatorSet = fjaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fjaVar.h = null;
                    return;
                }
                return;
            case 15:
                jja jjaVar = (jja) obj;
                jjaVar.n.P0 = true;
                jjaVar.invalidate();
                return;
            case 16:
                wla wlaVar = (wla) obj;
                if (wlaVar.f == animator) {
                    wlaVar.f = null;
                    return;
                }
                return;
            case 17:
                npa npaVar = (npa) obj;
                Stack stack = npaVar.c;
                Iterator it = npaVar.h.iterator();
                while (it.hasNext()) {
                    jpa jpaVar = (jpa) it.next();
                    if (stack.size() < npaVar.d) {
                        stack.push(jpaVar);
                    }
                    it.remove();
                }
                Runnable runnable = npaVar.q;
                if (runnable != null) {
                    runnable.run();
                    npaVar.q = null;
                }
                npaVar.r = null;
                npaVar.invalidateSelf();
                return;
            case 18:
                pta ptaVar = (pta) obj;
                ptaVar.F = 1.0f;
                ptaVar.G = -1;
                ota otaVar = ptaVar.I;
                if (otaVar != null && (z = otaVar.l) && z) {
                    otaVar.l = false;
                    otaVar.b();
                }
                ptaVar.H = null;
                return;
            case 19:
                qg2 qg2Var = ((cza) obj).c;
                qg2Var.setScaleX(1.0f);
                qg2Var.setScaleY(1.0f);
                return;
            case 20:
                ((w1b) obj).b0.setVisibility(8);
                return;
            case 21:
                t2b t2bVar = (t2b) obj;
                t2b.A1(t2bVar, ((Float) t2bVar.x3.getAnimatedValue()).floatValue());
                t2bVar.x3 = null;
                return;
            case 22:
                s4b s4bVar = (s4b) obj;
                s4bVar.w1.setVisibility(8);
                s4bVar.z1.setImageDrawable(null);
                return;
            case 23:
                int i3 = 0;
                while (true) {
                    j35[] j35VarArr = (j35[]) obj;
                    if (i3 < j35VarArr.length) {
                        j35 j35Var = j35VarArr[i3];
                        if (j35Var != null) {
                            j35Var.c = false;
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            case 24:
                super.onAnimationEnd(animator);
                ((b5b) obj).I = null;
                return;
            case 25:
            default:
                super.onAnimationEnd(animator);
                return;
            case 26:
                f7b f7bVar = (f7b) obj;
                f7bVar.I = false;
                f7bVar.H = 0.0f;
                f7bVar.invalidate();
                f7bVar.requestLayout();
                f7bVar.K.requestLayout();
                return;
            case 27:
                ((r9b) obj).O = false;
                return;
            case 28:
                p9b p9bVar = (p9b) obj;
                p9bVar.setTranslationY(0.0f);
                p9bVar.d = null;
                return;
            case 29:
                ((geb) obj).e = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                cv9 cv9Var = (cv9) obj;
                cv9Var.d = true;
                if (cv9Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) cv9Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            case 25:
                super.onAnimationStart(animator);
                g6b g6bVar = (g6b) obj;
                b29 b29Var = ((f6b) g6bVar.a.get(g6bVar.d)).c;
                b29Var.M = 2;
                b29Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public po9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
