package ci;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bj;
import org.telegram.messenger.dj;
import org.telegram.messenger.ej;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.v2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.r0;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.cf;
import org.telegram.ui.un;
import s4.c1;
import s4.z0;
public abstract class o extends s4.j {
    public static final gr V = new gr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final un F;
    public final tk0 G;
    public boolean N;
    public c1 O;
    public xn P;
    public boolean Q;
    public final p6 R;
    public cf T;
    public cf U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public o(un unVar, tk0 tk0Var, p6 p6Var) {
        this.R = p6Var;
        this.F = unVar;
        this.G = tk0Var;
        this.f47945o = V;
        this.f47928n = true;
        this.f47927m = false;
    }

    @Override
    public final void B(s4.h hVar) {
        View view;
        s4.h hVar2;
        c1 c1Var = hVar.f47935a;
        View view2 = null;
        if (c1Var == null) {
            view = null;
        } else {
            view = c1Var.f47898a;
        }
        c1 c1Var2 = hVar.f47936b;
        if (c1Var2 != null) {
            view2 = c1Var2.f47898a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(hVar.f47935a);
            duration.translationX(hVar.e - hVar.f47937c);
            duration.translationY(hVar.f47938f - hVar.d);
            hVar2 = hVar;
            duration.alpha(0.0f).setListener(new l(this, hVar2, duration, view, 0)).start();
        } else {
            hVar2 = hVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(hVar2.f47936b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new l(this, hVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(c1 c1Var, s4.i iVar) {
        T(c1Var, iVar, false);
    }

    @Override
    public final boolean J(s4.h hVar, c1 c1Var) {
        h01 h01Var;
        if (v2.f18448a) {
            f8.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(c1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = c1Var.f47898a;
        if (this.K.contains(view) && (h01Var = (h01) this.U.run()) != null) {
            h01Var.a(view);
        }
        if (hVar.f47936b == c1Var) {
            hVar.f47936b = null;
        } else if (hVar.f47935a == c1Var) {
            hVar.f47935a = null;
        } else {
            return false;
        }
        X(view);
        d(c1Var);
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

    public final void T(final s4.c1 r21, s4.i r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: ci.o.T(s4.c1, s4.i, boolean):void");
    }

    public final void U() {
        h01 h01Var;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (!this.K.isEmpty() && (h01Var = (h01) this.U.run()) != null) {
            ArrayList arrayList2 = h01Var.f26576c;
            if (!h01Var.e) {
                h01Var.e = true;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    g01 g01Var = (g01) obj2;
                    Runnable runnable = g01Var.d;
                    if (runnable != null) {
                        h01.b(runnable);
                        g01Var.d = null;
                    }
                }
                arrayList2.clear();
                f01 f01Var = h01Var.f26574a;
                if (f01Var != null) {
                    f01Var.h();
                }
                Runnable runnable2 = h01Var.d;
                if (runnable2 != null) {
                    h01Var.d = null;
                    h01.b(runnable2);
                }
            }
        }
    }

    public final void V(ej ejVar) {
        if (ejVar == null) {
            return;
        }
        ArrayList arrayList = ejVar.d;
        dj djVar = ejVar.f15403m;
        if (arrayList.size() == 0) {
            djVar.f15246i = true;
            return;
        }
        if (djVar.f15242b == 0 && djVar.d == 0 && djVar.f15241a == 0 && djVar.f15243c == 0) {
            tk0 tk0Var = this.G;
            int childCount = tk0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = tk0Var.getChildAt(i10);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    jj messageObject = q1Var.getMessageObject();
                    if (q1Var.getTransitionParams().f23550w0 && arrayList.contains(messageObject)) {
                        djVar.f15242b = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                        djVar.d = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                        djVar.f15241a = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                        djVar.f15243c = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                        djVar.f15252o = q1Var.a2();
                        djVar.f15248k = q1Var.F2();
                        djVar.f15249l = q1Var.E2();
                        djVar.f15253p = true;
                        break;
                    }
                }
                i10++;
            }
        }
        this.I.add(ejVar);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z10 = view instanceof f0;
        tk0 tk0Var = this.G;
        if (z10) {
            int measuredHeight = (tk0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((f0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof ra) {
            int measuredHeight2 = (tk0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
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
        } else if (view instanceof s0) {
            r0 transitionParams = ((s0) view).getTransitionParams();
            transitionParams.f22862b = false;
            transitionParams.f22863c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(cf cfVar, cf cfVar2) {
        this.T = cfVar;
        this.U = cfVar2;
    }

    public final boolean Z(View view) {
        c1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f47947q.contains(T) || this.f47954y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(c1 c1Var, ac.g gVar, ac.g gVar2) {
        ArrayList arrayList;
        int i10;
        boolean a2 = super.a(c1Var, gVar, gVar2);
        if (a2 && this.N) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.f47947q;
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((c1) arrayList.get(i11)).c() == 0) {
                    z10 = true;
                }
                i11++;
            }
            if (z10) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    i10 += ((c1) arrayList.get(i12)).f47898a.getHeight();
                }
            } else {
                i10 = 0;
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((c1) arrayList.get(i13)).f47898a.setTranslationY(i10);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        c1 T = this.G.T(view);
        if (T != null) {
            if (this.f47946p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(c1 c1Var) {
        h01 h01Var;
        Animator animator = (Animator) this.J.remove(c1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = c1Var.f47898a;
        if (this.K.contains(view) && (h01Var = (h01) this.U.run()) != null) {
            h01Var.a(view);
        }
        super.f(c1Var);
        X(view);
    }

    @Override
    public void g() {
        if (v2.f18448a) {
            f8.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ej) obj).f15403m.f15253p = false;
        }
        arrayList.clear();
        U();
        xn xnVar = this.P;
        if (xnVar != null) {
            xnVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f47948r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.i iVar = (s4.i) arrayList2.get(size2);
            X(iVar.f47942a.f47898a);
            v(iVar.f47942a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f47946p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            c1 c1Var = (c1) arrayList3.get(size3);
            X(c1Var.f47898a);
            d(c1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f47947q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            c1 c1Var2 = (c1) arrayList4.get(size4);
            X(c1Var2.f47898a);
            u(c1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f47949s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((s4.h) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f47951u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                s4.i iVar2 = (s4.i) arrayList7.get(size7);
                X(iVar2.f47942a.f47898a);
                v(iVar2.f47942a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f47950t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                c1 c1Var3 = (c1) arrayList9.get(size9);
                X(c1Var3.f47898a);
                u(c1Var3);
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
                I((s4.h) arrayList11.get(size11));
                if (arrayList11.isEmpty()) {
                    arrayList10.remove(arrayList11);
                }
            }
        }
        E(this.A);
        E(this.f47955z);
        E(this.f47954y);
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
    public final ac.g l(z0 z0Var, c1 c1Var, int i10, List list) {
        ac.g l4 = super.l(z0Var, c1Var, i10, list);
        View view = c1Var.f47898a;
        if (view instanceof q1) {
            ?? obj = new Object();
            obj.f385a = l4.f385a;
            obj.f386b = l4.f386b;
            x1 transitionParams = ((q1) view).getTransitionParams();
            obj.f4228c = transitionParams.f23459b;
            obj.d = transitionParams.f23464c;
            obj.e = transitionParams.d;
            obj.f4229f = transitionParams.e;
            return obj;
        }
        return l4;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: ci.o.m():void");
    }

    @Override
    public final void p(c1 c1Var) {
        R(c1Var);
        View view = c1Var.f47898a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof q1) {
            ((q1) view).getTransitionParams().f23491i = true;
        }
        this.f47947q.add(c1Var);
    }

    @Override
    public final boolean q(c1 c1Var, c1 c1Var2, ac.g gVar, int i10, int i11, int i12, int i13) {
        float translationX;
        if (c1Var == c1Var2) {
            return r(c1Var, gVar, i10, i11, i12, i13);
        }
        View view = c1Var.f47898a;
        if (view instanceof q1) {
            translationX = ((q1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(c1Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof q1) {
            ((q1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = c1Var2.f47898a;
        R(c1Var2);
        if (view2 instanceof q1) {
            ((q1) view2).setAnimationOffsetX(-i14);
        } else {
            view2.setTranslationX(-i14);
        }
        view2.setTranslationY(-i15);
        view2.setAlpha(0.0f);
        this.f47949s.add(new s4.h(c1Var, c1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public final boolean r(c1 c1Var, ac.g gVar, int i10, int i11, int i12, int i13) {
        int translationX;
        int i14;
        q1 q1Var;
        s0 s0Var;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        View view;
        int i15;
        float f14;
        boolean z10;
        int i16;
        ej ejVar;
        int i17;
        boolean P3;
        View view2 = c1Var.f47898a;
        if (view2 instanceof q1) {
            q1 q1Var2 = (q1) view2;
            translationX = i10 + ((int) q1Var2.getAnimationOffsetX());
            i14 = q1Var2.getTransitionParams().f23541t2 != q1Var2.getTopMediaOffset() ? (q1Var2.getTransitionParams().f23541t2 - q1Var2.getTopMediaOffset()) + i11 : i11;
            q1Var = q1Var2;
            s0Var = null;
        } else if (view2 instanceof s0) {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            s0Var = (s0) view2;
            q1Var = null;
        } else {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            q1Var = null;
            s0Var = null;
        }
        int i18 = translationX;
        int translationY = i14 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (q1Var != null) {
            float f15 = q1Var.getPhotoImage().K0;
            float f16 = q1Var.getPhotoImage().L0;
            float f17 = q1Var.getPhotoImage().M0;
            float f18 = q1Var.getPhotoImage().N0;
            f7 = 0.0f;
            int i19 = 0;
            for (int i20 = 4; i19 < i20; i20 = 4) {
                iArr[i19] = q1Var.getPhotoImage().W0[i19];
                i19++;
            }
            f11 = f15;
            f12 = f16;
            f10 = f18;
            f13 = f17;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        R(c1Var);
        int i21 = i12 - i18;
        int i22 = i13 - translationY;
        if (i22 != 0) {
            view2.setTranslationY(-i22);
        }
        float f19 = f10;
        s0 s0Var2 = s0Var;
        ?? iVar = new s4.i(c1Var, i18, translationY, i12, i13);
        if (q1Var != null) {
            x1 transitionParams = q1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f23543u0;
            Rect rect = transitionParams.E0;
            ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            if (i21 != 0) {
                q1Var.setAnimationOffsetX(-i21);
            }
            boolean z11 = gVar instanceof m;
            tk0 tk0Var = this.G;
            if (z11) {
                ImageReceiver photoImage = q1Var.getPhotoImage();
                view = view2;
                m mVar = (m) gVar;
                i15 = i21;
                boolean z12 = (!transitionParams.f23550w0 || mVar.f4229f == f7 || mVar.e == f7) ? false : true;
                iVar.f4237n = z12;
                if (z12) {
                    tk0Var.setClipChildren(false);
                    tk0Var.invalidate();
                    transitionParams.f23483g0 = true;
                    if (q1Var.getMessageObject().h4()) {
                        transitionParams.f23515n0 = f11;
                        transitionParams.f23519o0 = f12;
                        transitionParams.f23523p0 = f13;
                        transitionParams.f23527q0 = f19;
                        transitionParams.B0 = iArr;
                    } else {
                        transitionParams.f23515n0 = photoImage.K0;
                        transitionParams.f23519o0 = photoImage.L0;
                        transitionParams.f23523p0 = photoImage.M0;
                        transitionParams.f23527q0 = photoImage.N0;
                        transitionParams.B0 = photoImage.W0;
                    }
                    transitionParams.C0 = false;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= 4) {
                            break;
                        } else if (iArr2[i23] != transitionParams.B0[i23]) {
                            transitionParams.C0 = true;
                            break;
                        } else {
                            i23++;
                        }
                    }
                    float f20 = transitionParams.f23515n0;
                    float f21 = mVar.f4228c;
                    if (f20 == f21 && transitionParams.f23519o0 == mVar.d && transitionParams.f23527q0 == mVar.f4229f && transitionParams.f23523p0 == mVar.e && !transitionParams.C0) {
                        transitionParams.f23483g0 = false;
                        iVar.f4237n = false;
                    } else {
                        iVar.f4238o = f21;
                        iVar.f4239p = mVar.d;
                        iVar.f4240q = mVar.e;
                        iVar.f4241r = mVar.f4229f;
                        if (currentMessagesGroup != null) {
                            boolean z13 = currentMessagesGroup.f15396c;
                            dj djVar = currentMessagesGroup.f15403m;
                            boolean z14 = djVar.f15252o;
                            if (z13 != z14) {
                                djVar.f15251n = z14 ? 1.0f : f7;
                            }
                        }
                        if (transitionParams.C0) {
                            if (transitionParams.B0 == photoImage.W0) {
                                transitionParams.B0 = new int[4];
                                for (int i24 = 0; i24 < 4; i24++) {
                                    transitionParams.B0[i24] = photoImage.W0[i24];
                                }
                            }
                            photoImage.L0(iArr2);
                        }
                        q1Var.q3(iVar.f4238o, iVar.f4239p, iVar.f4240q, iVar.f4241r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f23550w0 && (((P3 = q1Var.getMessageObject().P3()) && rect.left != q1Var.getBackgroundDrawableLeft()) || ((!P3 && rect.right != q1Var.getBackgroundDrawableRight()) || rect.top != q1Var.getBackgroundDrawableTop() || rect.bottom != q1Var.getBackgroundDrawableBottom()))) {
                    iVar.v = q1Var.getBackgroundDrawableBottom() - rect.bottom;
                    iVar.f4244u = q1Var.getBackgroundDrawableTop() - rect.top;
                    if (q1Var.W6 != transitionParams.F0) {
                        iVar.f4242s = q1Var.getBackgroundDrawableLeft() - rect.left;
                        iVar.f4243t = q1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (P3) {
                        iVar.f4242s = q1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        iVar.f4243t = q1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    iVar.f4235l = true;
                    transitionParams.f23554x0 = true;
                    transitionParams.f23487h0 = -iVar.f4242s;
                    transitionParams.f23492i0 = -iVar.f4243t;
                    transitionParams.f23502k0 = -iVar.f4244u;
                    transitionParams.f23497j0 = -iVar.v;
                    tk0Var.setClipChildren(false);
                    tk0Var.invalidate();
                }
            } else {
                view = view2;
                i15 = i21;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    tk0 tk0Var2 = (tk0) view.getParent();
                    dj djVar2 = currentMessagesGroup.f15403m;
                    boolean z15 = true;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    while (i25 < tk0Var2.getChildCount()) {
                        View childAt = tk0Var2.getChildAt(i25);
                        if (childAt instanceof q1) {
                            q1 q1Var3 = (q1) childAt;
                            if (q1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !q1Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                ejVar = currentMessagesGroup;
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                i17 = i25;
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if (i28 == 0 || backgroundDrawableLeft < i28) {
                                    i28 = backgroundDrawableLeft;
                                }
                                if (i29 == 0 || backgroundDrawableRight > i29) {
                                    i29 = backgroundDrawableRight;
                                }
                                if (q1Var3.getTransitionParams().f23550w0 || djVar2.f15253p) {
                                    if (i26 == 0 || backgroundDrawableTop < i26) {
                                        i26 = backgroundDrawableTop;
                                    }
                                    if (i27 == 0 || backgroundDrawableBottom > i27) {
                                        i27 = backgroundDrawableBottom;
                                    }
                                    z15 = false;
                                }
                                i25 = i17 + 1;
                                currentMessagesGroup = ejVar;
                            }
                        }
                        ejVar = currentMessagesGroup;
                        i17 = i25;
                        i25 = i17 + 1;
                        currentMessagesGroup = ejVar;
                    }
                    djVar2.f15253p = false;
                    if (i26 == 0 && i27 == 0 && i28 == 0 && i29 == 0) {
                        iVar.f4233j = false;
                        djVar2.f15247j = false;
                    } else {
                        int i30 = (-i26) + djVar2.f15242b;
                        iVar.f4230f = i30;
                        int i31 = (-i27) + djVar2.d;
                        iVar.f4231g = i31;
                        int i32 = (-i28) + djVar2.f15241a;
                        iVar.h = i32;
                        int i33 = (-i29) + djVar2.f15243c;
                        iVar.f4232i = i33;
                        iVar.f4233j = true;
                        djVar2.f15247j = true;
                        djVar2.f15244f = i30;
                        djVar2.h = i31;
                        djVar2.e = i32;
                        djVar2.f15245g = i33;
                        djVar2.f15251n = djVar2.f15252o ? 1.0f : f7;
                        tk0Var2.setClipChildren(false);
                        tk0Var2.invalidate();
                    }
                    djVar2.f15246i = z15;
                }
            }
            Integer valueOf = Integer.valueOf(q1Var.getMessageObject().f1());
            HashMap hashMap = this.H;
            ej ejVar2 = (ej) hashMap.get(valueOf);
            if (ejVar2 != null) {
                dj djVar3 = ejVar2.f15403m;
                hashMap.remove(Integer.valueOf(q1Var.getMessageObject().f1()));
                if (transitionParams.f23550w0) {
                    int backgroundDrawableLeft2 = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                    int backgroundDrawableRight2 = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                    int backgroundDrawableTop2 = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                    int backgroundDrawableBottom2 = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                    iVar.f4245w = true;
                    transitionParams.f23554x0 = true;
                    iVar.f4242s = backgroundDrawableLeft2 - djVar3.f15241a;
                    iVar.f4243t = backgroundDrawableRight2 - djVar3.f15243c;
                    iVar.f4244u = backgroundDrawableTop2 - djVar3.f15242b;
                    iVar.v = backgroundDrawableBottom2 - djVar3.d;
                    iVar.f4235l = false;
                    transitionParams.f23487h0 = (int) ((-i16) - q1Var.getAnimationOffsetX());
                    transitionParams.f23492i0 = (int) ((-iVar.f4243t) - q1Var.getAnimationOffsetX());
                    transitionParams.f23502k0 = (int) ((-iVar.f4244u) - q1Var.getTranslationY());
                    transitionParams.f23497j0 = (int) ((-iVar.v) - q1Var.getTranslationY());
                    transitionParams.D0 = true;
                    tk0Var.setClipChildren(false);
                    tk0Var.invalidate();
                } else {
                    djVar3.f15246i = true;
                }
            }
            bj bjVar = q1Var.L;
            if (transitionParams.f23562z0 != (q1Var.A6 || q1Var.J || (bjVar != null && (bjVar.f14783l & 8) == 0 && q1Var.K.f15399i))) {
                z10 = true;
                iVar.f4234k = true;
                f14 = f7;
                transitionParams.A0 = f14;
            } else {
                f14 = f7;
                z10 = true;
            }
            boolean a2 = transitionParams.a();
            iVar.f4236m = a2;
            if (a2) {
                transitionParams.h = z10;
                transitionParams.L1 = f14;
            }
            if (i15 == 0 && i22 == 0 && !iVar.f4237n && !iVar.f4245w && !iVar.f4233j && !iVar.f4234k && !iVar.f4235l && !a2) {
                v(c1Var);
                return false;
            }
        } else if (s0Var2 != null) {
            r0 transitionParams2 = s0Var2.getTransitionParams();
            transitionParams2.getClass();
            if (i21 != 0) {
                view2.setTranslationX(-i21);
            }
            boolean a10 = !transitionParams2.f22861a ? false : transitionParams2.d.E0.a();
            iVar.f4236m = a10;
            if (a10) {
                transitionParams2.f22862b = true;
                transitionParams2.f22863c = 0.0f;
            }
            if (i21 == 0 && i22 == 0 && !a10) {
                v(c1Var);
                return false;
            }
        } else if (view2 instanceof f0) {
            ((f0) view2).setAnimating(true);
        } else if (view2 instanceof ra) {
            ((ra) view2).setAnimating(true);
        } else if (i21 == 0 && i22 == 0) {
            v(c1Var);
            return false;
        } else if (i21 != 0) {
            view2.setTranslationX(-i21);
        }
        this.f47948r.add(iVar);
        F();
        return true;
    }

    @Override
    public final void s(c1 c1Var, ac.g gVar) {
        if (v2.f18448a) {
            f8.b("animate remove");
        }
        super.s(c1Var, gVar);
        View view = c1Var.f47898a;
        if (gVar != null) {
            int i10 = gVar.f386b;
            int top = view.getTop();
            int left = view.getLeft() - gVar.f385a;
            int i11 = top - i10;
            if (i11 != 0) {
                view.setTranslationY(-i11);
            }
            if (view instanceof q1) {
                q1 q1Var = (q1) view;
                if (left != 0) {
                    q1Var.setAnimationOffsetX(-left);
                }
                if (gVar instanceof m) {
                    m mVar = (m) gVar;
                    q1Var.q3(mVar.f4228c, mVar.d, mVar.e, mVar.f4229f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
