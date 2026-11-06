package mi;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import e2.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.aj;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.messenger.r2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;
import org.telegram.ui.pe;
import v4.a1;
import v4.d1;
public abstract class l extends v4.k {
    public static final xq V = new xq(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final an F;
    public final pj0 G;
    public boolean N;
    public d1 O;
    public pn P;
    public boolean Q;
    public final f6 R;
    public pe T;
    public pe U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public l(an anVar, pj0 pj0Var, f6 f6Var) {
        this.R = f6Var;
        this.F = anVar;
        this.G = pj0Var;
        this.f57008o = V;
        this.f56980n = true;
        this.f56979m = false;
    }

    @Override
    public final void B(v4.i iVar) {
        View view;
        v4.i iVar2;
        d1 d1Var = iVar.f56996a;
        View view2 = null;
        if (d1Var == null) {
            view = null;
        } else {
            view = d1Var.f56952a;
        }
        d1 d1Var2 = iVar.f56997b;
        if (d1Var2 != null) {
            view2 = d1Var2.f56952a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(iVar.f56996a);
            duration.translationX(iVar.f56999e - iVar.f56998c);
            duration.translationY(iVar.f57000f - iVar.d);
            iVar2 = iVar;
            duration.alpha(0.0f).setListener(new i(this, iVar2, duration, view, 0)).start();
        } else {
            iVar2 = iVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(iVar2.f56997b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new i(this, iVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(d1 d1Var, v4.j jVar) {
        T(d1Var, jVar, false);
    }

    @Override
    public final boolean J(v4.i iVar, d1 d1Var) {
        cz0 cz0Var;
        if (r2.f25191a) {
            a8.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(d1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = d1Var.f56952a;
        if (this.K.contains(view) && (cz0Var = (cz0) this.U.run()) != null) {
            cz0Var.a(view);
        }
        if (iVar.f56997b == d1Var) {
            iVar.f56997b = null;
        } else if (iVar.f56996a == d1Var) {
            iVar.f56996a = null;
        } else {
            return false;
        }
        X(view);
        d(d1Var);
        return true;
    }

    @Override
    public final long L() {
        return 0L;
    }

    @Override
    public void N() {
        this.G.setClipChildren(true);
        while (true) {
            ArrayList arrayList = this.L;
            if (!arrayList.isEmpty()) {
                ((Runnable) arrayList.remove(0)).run();
            } else {
                U();
                return;
            }
        }
    }

    public final void T(final v4.d1 r21, v4.j r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: mi.l.T(v4.d1, v4.j, boolean):void");
    }

    public final void U() {
        cz0 cz0Var;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (!this.K.isEmpty() && (cz0Var = (cz0) this.U.run()) != null) {
            ArrayList arrayList2 = cz0Var.f32728c;
            if (!cz0Var.f32729e) {
                cz0Var.f32729e = true;
                int size2 = arrayList2.size();
                while (i7 < size2) {
                    Object obj2 = arrayList2.get(i7);
                    i7++;
                    bz0 bz0Var = (bz0) obj2;
                    Runnable runnable = bz0Var.d;
                    if (runnable != null) {
                        cz0.b(runnable);
                        bz0Var.d = null;
                    }
                }
                arrayList2.clear();
                az0 az0Var = cz0Var.f32726a;
                if (az0Var != null) {
                    az0Var.h();
                }
                Runnable runnable2 = cz0Var.d;
                if (runnable2 != null) {
                    cz0Var.d = null;
                    cz0.b(runnable2);
                }
            }
        }
    }

    public final void V(dj djVar) {
        if (djVar == null) {
            return;
        }
        ArrayList arrayList = djVar.d;
        cj cjVar = djVar.f22012m;
        if (arrayList.size() == 0) {
            cjVar.f21827i = true;
            return;
        }
        if (cjVar.f21822b == 0 && cjVar.d == 0 && cjVar.f21821a == 0 && cjVar.f21823c == 0) {
            pj0 pj0Var = this.G;
            int childCount = pj0Var.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = pj0Var.getChildAt(i7);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    ij messageObject = q1Var.getMessageObject();
                    if (q1Var.getTransitionParams().f30854w0 && arrayList.contains(messageObject)) {
                        cjVar.f21822b = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                        cjVar.d = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                        cjVar.f21821a = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                        cjVar.f21823c = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                        cjVar.f21833o = q1Var.c2();
                        cjVar.f21829k = q1Var.I2();
                        cjVar.f21830l = q1Var.H2();
                        cjVar.f21834p = true;
                        break;
                    }
                }
                i7++;
            }
        }
        this.I.add(djVar);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z9 = view instanceof f0;
        pj0 pj0Var = this.G;
        if (z9) {
            int measuredHeight = (pj0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((f0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof ra) {
            int measuredHeight2 = (pj0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((ra) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof q1) {
            q1 q1Var = (q1) view;
            q1Var.getTransitionParams().e();
            q1Var.setAnimationOffsetX(0.0f);
        } else if (view instanceof t0) {
            s0 transitionParams = ((t0) view).getTransitionParams();
            transitionParams.f30230b = false;
            transitionParams.f30231c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(pe peVar, pe peVar2) {
        this.T = peVar;
        this.U = peVar2;
    }

    public final boolean Z(View view) {
        d1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f57010q.contains(T) || this.f57017y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(d1 d1Var, r0 r0Var, r0 r0Var2) {
        ArrayList arrayList;
        int i7;
        boolean a10 = super.a(d1Var, r0Var, r0Var2);
        if (a10 && this.N) {
            int i10 = 0;
            boolean z9 = false;
            while (true) {
                arrayList = this.f57010q;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((d1) arrayList.get(i10)).c() == 0) {
                    z9 = true;
                }
                i10++;
            }
            if (z9) {
                i7 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i7 += ((d1) arrayList.get(i11)).f56952a.getHeight();
                }
            } else {
                i7 = 0;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((d1) arrayList.get(i12)).f56952a.setTranslationY(i7);
            }
        }
        return a10;
    }

    public final boolean a0(View view) {
        d1 T = this.G.T(view);
        if (T != null) {
            if (this.f57009p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(d1 d1Var) {
        cz0 cz0Var;
        Animator animator = (Animator) this.J.remove(d1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = d1Var.f56952a;
        if (this.K.contains(view) && (cz0Var = (cz0) this.U.run()) != null) {
            cz0Var.a(view);
        }
        super.f(d1Var);
        X(view);
    }

    @Override
    public void g() {
        if (r2.f25191a) {
            a8.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((dj) obj).f22012m.f21834p = false;
        }
        arrayList.clear();
        U();
        pn pnVar = this.P;
        if (pnVar != null) {
            pnVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f57011r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.j jVar = (v4.j) arrayList2.get(size2);
            X(jVar.f57001a.f56952a);
            v(jVar.f57001a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f57009p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            d1 d1Var = (d1) arrayList3.get(size3);
            X(d1Var.f56952a);
            d(d1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f57010q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            d1 d1Var2 = (d1) arrayList4.get(size4);
            X(d1Var2.f56952a);
            u(d1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f57012s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((v4.i) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f57014u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                v4.j jVar2 = (v4.j) arrayList7.get(size7);
                X(jVar2.f57001a.f56952a);
                v(jVar2.f57001a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f57013t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                d1 d1Var3 = (d1) arrayList9.get(size9);
                X(d1Var3.f56952a);
                u(d1Var3);
                arrayList9.remove(size9);
                if (arrayList9.isEmpty()) {
                    arrayList8.remove(arrayList9);
                }
            }
        }
        ArrayList arrayList10 = this.v;
        for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
            ArrayList arrayList11 = (ArrayList) arrayList10.get(size10);
            for (int size11 = arrayList11.size() - 1; size11 >= 0; size11--) {
                I((v4.i) arrayList11.get(size11));
                if (arrayList11.isEmpty()) {
                    arrayList10.remove(arrayList11);
                }
            }
        }
        E(this.A);
        E(this.f57018z);
        E(this.f57017y);
        E(this.B);
        e();
    }

    @Override
    public final long i() {
        return 250L;
    }

    @Override
    public final long j() {
        return 250L;
    }

    @Override
    public final r0 l(a1 a1Var, d1 d1Var, int i7, List list) {
        r0 l10 = super.l(a1Var, d1Var, i7, list);
        View view = d1Var.f56952a;
        if (view instanceof q1) {
            ?? obj = new Object();
            obj.f10533a = l10.f10533a;
            obj.f10534b = l10.f10534b;
            x1 transitionParams = ((q1) view).getTransitionParams();
            obj.f20082c = transitionParams.f30765b;
            obj.d = transitionParams.f30770c;
            obj.f20083e = transitionParams.d;
            obj.f20084f = transitionParams.f30778e;
            return obj;
        }
        return l10;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: mi.l.m():void");
    }

    @Override
    public final void p(d1 d1Var) {
        R(d1Var);
        View view = d1Var.f56952a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof q1) {
            ((q1) view).getTransitionParams().f30797i = true;
        }
        this.f57010q.add(d1Var);
    }

    @Override
    public final boolean q(d1 d1Var, d1 d1Var2, r0 r0Var, int i7, int i10, int i11, int i12) {
        float translationX;
        if (d1Var == d1Var2) {
            return r(d1Var, r0Var, i7, i10, i11, i12);
        }
        View view = d1Var.f56952a;
        if (view instanceof q1) {
            translationX = ((q1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(d1Var);
        int i13 = (int) ((i11 - i7) - translationX);
        int i14 = (int) ((i12 - i10) - translationY);
        if (view instanceof q1) {
            ((q1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = d1Var2.f56952a;
        R(d1Var2);
        if (view2 instanceof q1) {
            ((q1) view2).setAnimationOffsetX(-i13);
        } else {
            view2.setTranslationX(-i13);
        }
        view2.setTranslationY(-i14);
        view2.setAlpha(0.0f);
        this.f57012s.add(new v4.i(d1Var, d1Var2, i7, i10, i11, i12));
        F();
        return true;
    }

    @Override
    public final boolean r(d1 d1Var, r0 r0Var, int i7, int i10, int i11, int i12) {
        int translationX;
        int i13;
        q1 q1Var;
        t0 t0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean a10;
        View view;
        int i14;
        boolean z9;
        boolean z10;
        float f15;
        boolean z11;
        int i15;
        float f16;
        dj djVar;
        int i16;
        boolean z12;
        boolean Q3;
        float f17;
        View view2 = d1Var.f56952a;
        if (view2 instanceof q1) {
            q1 q1Var2 = (q1) view2;
            translationX = i7 + ((int) q1Var2.getAnimationOffsetX());
            if (q1Var2.getTransitionParams().f30845t2 != q1Var2.getTopMediaOffset()) {
                i13 = (q1Var2.getTransitionParams().f30845t2 - q1Var2.getTopMediaOffset()) + i10;
            } else {
                i13 = i10;
            }
            q1Var = q1Var2;
            t0Var = null;
        } else if (view2 instanceof t0) {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            t0Var = (t0) view2;
            q1Var = null;
        } else {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            q1Var = null;
            t0Var = null;
        }
        int i17 = translationX;
        int translationY = i13 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (q1Var != null) {
            float f18 = q1Var.getPhotoImage().K0;
            float f19 = q1Var.getPhotoImage().L0;
            float f20 = q1Var.getPhotoImage().M0;
            float f21 = q1Var.getPhotoImage().N0;
            f10 = 0.0f;
            int i18 = 0;
            for (int i19 = 4; i18 < i19; i19 = 4) {
                iArr[i18] = q1Var.getPhotoImage().W0[i18];
                i18++;
            }
            f12 = f18;
            f13 = f19;
            f11 = f21;
            f14 = f20;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        R(d1Var);
        int i20 = i11 - i17;
        int i21 = i12 - translationY;
        if (i21 != 0) {
            view2.setTranslationY(-i21);
        }
        float f22 = f11;
        t0 t0Var2 = t0Var;
        ?? jVar = new v4.j(d1Var, i17, translationY, i11, i12);
        if (q1Var != null) {
            x1 transitionParams = q1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f30847u0;
            Rect rect = transitionParams.E0;
            dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            if (i20 != 0) {
                q1Var.setAnimationOffsetX(-i20);
            }
            boolean z13 = r0Var instanceof j;
            pj0 pj0Var = this.G;
            if (z13) {
                ImageReceiver photoImage = q1Var.getPhotoImage();
                view = view2;
                j jVar2 = (j) r0Var;
                i14 = i20;
                if (transitionParams.f30854w0 && jVar2.f20084f != f10 && jVar2.f20083e != f10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                jVar.f20092n = z12;
                if (z12) {
                    pj0Var.setClipChildren(false);
                    pj0Var.invalidate();
                    transitionParams.f30789g0 = true;
                    if (q1Var.getMessageObject().i4()) {
                        transitionParams.f30820n0 = f12;
                        transitionParams.f30823o0 = f13;
                        transitionParams.f30827p0 = f14;
                        transitionParams.f30831q0 = f22;
                        transitionParams.B0 = iArr;
                    } else {
                        transitionParams.f30820n0 = photoImage.K0;
                        transitionParams.f30823o0 = photoImage.L0;
                        transitionParams.f30827p0 = photoImage.M0;
                        transitionParams.f30831q0 = photoImage.N0;
                        transitionParams.B0 = photoImage.W0;
                    }
                    transitionParams.C0 = false;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= 4) {
                            break;
                        } else if (iArr2[i22] != transitionParams.B0[i22]) {
                            transitionParams.C0 = true;
                            break;
                        } else {
                            i22++;
                        }
                    }
                    float f23 = transitionParams.f30820n0;
                    float f24 = jVar2.f20082c;
                    if (f23 == f24 && transitionParams.f30823o0 == jVar2.d && transitionParams.f30831q0 == jVar2.f20084f && transitionParams.f30827p0 == jVar2.f20083e && !transitionParams.C0) {
                        transitionParams.f30789g0 = false;
                        jVar.f20092n = false;
                    } else {
                        jVar.f20093o = f24;
                        jVar.f20094p = jVar2.d;
                        jVar.f20095q = jVar2.f20083e;
                        jVar.f20096r = jVar2.f20084f;
                        if (currentMessagesGroup != null) {
                            boolean z14 = currentMessagesGroup.f22004c;
                            cj cjVar = currentMessagesGroup.f22012m;
                            boolean z15 = cjVar.f21833o;
                            if (z14 != z15) {
                                if (z15) {
                                    f17 = 1.0f;
                                } else {
                                    f17 = f10;
                                }
                                cjVar.f21832n = f17;
                            }
                        }
                        if (transitionParams.C0) {
                            if (transitionParams.B0 == photoImage.W0) {
                                transitionParams.B0 = new int[4];
                                for (int i23 = 0; i23 < 4; i23++) {
                                    transitionParams.B0[i23] = photoImage.W0[i23];
                                }
                            }
                            photoImage.L0(iArr2);
                        }
                        q1Var.t3(jVar.f20093o, jVar.f20094p, jVar.f20095q, jVar.f20096r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f30854w0 && (((Q3 = q1Var.getMessageObject().Q3()) && rect.left != q1Var.getBackgroundDrawableLeft()) || ((!Q3 && rect.right != q1Var.getBackgroundDrawableRight()) || rect.top != q1Var.getBackgroundDrawableTop() || rect.bottom != q1Var.getBackgroundDrawableBottom()))) {
                    jVar.v = q1Var.getBackgroundDrawableBottom() - rect.bottom;
                    jVar.f20099u = q1Var.getBackgroundDrawableTop() - rect.top;
                    if (q1Var.X6 != transitionParams.F0) {
                        jVar.f20097s = q1Var.getBackgroundDrawableLeft() - rect.left;
                        jVar.f20098t = q1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (Q3) {
                        jVar.f20097s = q1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        jVar.f20098t = q1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    jVar.f20090l = true;
                    transitionParams.f30858x0 = true;
                    transitionParams.f30793h0 = -jVar.f20097s;
                    transitionParams.f30798i0 = -jVar.f20098t;
                    transitionParams.f30807k0 = -jVar.f20099u;
                    transitionParams.f30803j0 = -jVar.v;
                    pj0Var.setClipChildren(false);
                    pj0Var.invalidate();
                }
            } else {
                view = view2;
                i14 = i20;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    pj0 pj0Var2 = (pj0) view.getParent();
                    cj cjVar2 = currentMessagesGroup.f22012m;
                    boolean z16 = true;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i24 < pj0Var2.getChildCount()) {
                        View childAt = pj0Var2.getChildAt(i24);
                        if (childAt instanceof q1) {
                            q1 q1Var3 = (q1) childAt;
                            if (q1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !q1Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                djVar = currentMessagesGroup;
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                i16 = i24;
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if (i27 == 0 || backgroundDrawableLeft < i27) {
                                    i27 = backgroundDrawableLeft;
                                }
                                if (i28 == 0 || backgroundDrawableRight > i28) {
                                    i28 = backgroundDrawableRight;
                                }
                                if (q1Var3.getTransitionParams().f30854w0 || cjVar2.f21834p) {
                                    if (i25 == 0 || backgroundDrawableTop < i25) {
                                        i25 = backgroundDrawableTop;
                                    }
                                    if (i26 == 0 || backgroundDrawableBottom > i26) {
                                        i26 = backgroundDrawableBottom;
                                    }
                                    z16 = false;
                                }
                                i24 = i16 + 1;
                                currentMessagesGroup = djVar;
                            }
                        }
                        djVar = currentMessagesGroup;
                        i16 = i24;
                        i24 = i16 + 1;
                        currentMessagesGroup = djVar;
                    }
                    cjVar2.f21834p = false;
                    if (i25 == 0 && i26 == 0 && i27 == 0 && i28 == 0) {
                        jVar.f20088j = false;
                        cjVar2.f21828j = false;
                    } else {
                        int i29 = (-i25) + cjVar2.f21822b;
                        jVar.f20085f = i29;
                        int i30 = (-i26) + cjVar2.d;
                        jVar.f20086g = i30;
                        int i31 = (-i27) + cjVar2.f21821a;
                        jVar.h = i31;
                        int i32 = (-i28) + cjVar2.f21823c;
                        jVar.f20087i = i32;
                        jVar.f20088j = true;
                        cjVar2.f21828j = true;
                        cjVar2.f21825f = i29;
                        cjVar2.h = i30;
                        cjVar2.f21824e = i31;
                        cjVar2.f21826g = i32;
                        if (cjVar2.f21833o) {
                            f16 = 1.0f;
                        } else {
                            f16 = f10;
                        }
                        cjVar2.f21832n = f16;
                        pj0Var2.setClipChildren(false);
                        pj0Var2.invalidate();
                    }
                    cjVar2.f21827i = z16;
                }
            }
            Integer valueOf = Integer.valueOf(q1Var.getMessageObject().f1());
            HashMap hashMap = this.H;
            dj djVar2 = (dj) hashMap.get(valueOf);
            if (djVar2 != null) {
                cj cjVar3 = djVar2.f22012m;
                hashMap.remove(Integer.valueOf(q1Var.getMessageObject().f1()));
                if (transitionParams.f30854w0) {
                    int backgroundDrawableLeft2 = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                    int backgroundDrawableRight2 = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                    int backgroundDrawableTop2 = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                    int backgroundDrawableBottom2 = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                    jVar.f20100w = true;
                    transitionParams.f30858x0 = true;
                    jVar.f20097s = backgroundDrawableLeft2 - cjVar3.f21821a;
                    jVar.f20098t = backgroundDrawableRight2 - cjVar3.f21823c;
                    jVar.f20099u = backgroundDrawableTop2 - cjVar3.f21822b;
                    jVar.v = backgroundDrawableBottom2 - cjVar3.d;
                    jVar.f20090l = false;
                    transitionParams.f30793h0 = (int) ((-i15) - q1Var.getAnimationOffsetX());
                    transitionParams.f30798i0 = (int) ((-jVar.f20098t) - q1Var.getAnimationOffsetX());
                    transitionParams.f30807k0 = (int) ((-jVar.f20099u) - q1Var.getTranslationY());
                    transitionParams.f30803j0 = (int) ((-jVar.v) - q1Var.getTranslationY());
                    transitionParams.D0 = true;
                    pj0Var.setClipChildren(false);
                    pj0Var.invalidate();
                } else {
                    cjVar3.f21827i = true;
                }
            }
            aj ajVar = q1Var.L;
            if (ajVar != null && (ajVar.f21451l & 8) == 0 && q1Var.K.f22008i) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!q1Var.B6 && !q1Var.J && !z9) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (transitionParams.f30866z0 != z10) {
                z11 = true;
                jVar.f20089k = true;
                f15 = f10;
                transitionParams.A0 = f15;
            } else {
                f15 = f10;
                z11 = true;
            }
            boolean a11 = transitionParams.a();
            jVar.f20091m = a11;
            if (a11) {
                transitionParams.h = z11;
                transitionParams.L1 = f15;
            }
            if (i14 == 0 && i21 == 0 && !jVar.f20092n && !jVar.f20100w && !jVar.f20088j && !jVar.f20089k && !jVar.f20090l && !a11) {
                v(d1Var);
                return false;
            }
        } else if (t0Var2 != null) {
            s0 transitionParams2 = t0Var2.getTransitionParams();
            transitionParams2.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            if (!transitionParams2.f30229a) {
                a10 = false;
            } else {
                a10 = transitionParams2.d.E0.a();
            }
            jVar.f20091m = a10;
            if (a10) {
                transitionParams2.f30230b = true;
                transitionParams2.f30231c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a10) {
                v(d1Var);
                return false;
            }
        } else if (view2 instanceof f0) {
            ((f0) view2).setAnimating(true);
        } else if (view2 instanceof ra) {
            ((ra) view2).setAnimating(true);
        } else if (i20 == 0 && i21 == 0) {
            v(d1Var);
            return false;
        } else if (i20 != 0) {
            view2.setTranslationX(-i20);
        }
        this.f57011r.add(jVar);
        F();
        return true;
    }

    @Override
    public final void s(d1 d1Var, r0 r0Var) {
        if (r2.f25191a) {
            a8.b("animate remove");
        }
        super.s(d1Var, r0Var);
        View view = d1Var.f56952a;
        if (r0Var != null) {
            int i7 = r0Var.f10534b;
            int top = view.getTop();
            int left = view.getLeft() - r0Var.f10533a;
            int i10 = top - i7;
            if (i10 != 0) {
                view.setTranslationY(-i10);
            }
            if (view instanceof q1) {
                q1 q1Var = (q1) view;
                if (left != 0) {
                    q1Var.setAnimationOffsetX(-left);
                }
                if (r0Var instanceof j) {
                    j jVar = (j) r0Var;
                    q1Var.t3(jVar.f20082c, jVar.d, jVar.f20083e, jVar.f20084f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
