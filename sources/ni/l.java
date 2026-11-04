package ni;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
import org.telegram.messenger.ri;
import org.telegram.messenger.ti;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.me;
import org.telegram.ui.wm;
import u4.a1;
import u4.d1;
public abstract class l extends u4.k {
    public static final xq V = new xq(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final wm F;
    public final tj0 G;
    public boolean N;
    public d1 O;
    public on P;
    public boolean Q;
    public final e6 R;
    public me T;
    public me U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public l(wm wmVar, tj0 tj0Var, e6 e6Var) {
        this.R = e6Var;
        this.F = wmVar;
        this.G = tj0Var;
        this.f55597o = V;
        this.f55568n = true;
        this.f55567m = false;
    }

    @Override
    public final void B(u4.i iVar) {
        View view;
        u4.i iVar2;
        d1 d1Var = iVar.f55585a;
        View view2 = null;
        if (d1Var == null) {
            view = null;
        } else {
            view = d1Var.f55540a;
        }
        d1 d1Var2 = iVar.f55586b;
        if (d1Var2 != null) {
            view2 = d1Var2.f55540a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(iVar.f55585a);
            duration.translationX(iVar.f55588e - iVar.f55587c);
            duration.translationY(iVar.f55589f - iVar.d);
            iVar2 = iVar;
            duration.alpha(0.0f).setListener(new i(this, iVar2, duration, view, 0)).start();
        } else {
            iVar2 = iVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(iVar2.f55586b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new i(this, iVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(d1 d1Var, u4.j jVar) {
        T(d1Var, jVar, false);
    }

    @Override
    public final boolean J(u4.i iVar, d1 d1Var) {
        cz0 cz0Var;
        if (r2.f25040a) {
            a8.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(d1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = d1Var.f55540a;
        if (this.K.contains(view) && (cz0Var = (cz0) this.U.run()) != null) {
            cz0Var.a(view);
        }
        if (iVar.f55586b == d1Var) {
            iVar.f55586b = null;
        } else if (iVar.f55585a == d1Var) {
            iVar.f55585a = null;
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

    public final void T(final u4.d1 r22, u4.j r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: ni.l.T(u4.d1, u4.j, boolean):void");
    }

    public final void U() {
        cz0 cz0Var;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i3 = 0;
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
            ArrayList arrayList2 = cz0Var.f32870c;
            if (!cz0Var.f32871e) {
                cz0Var.f32871e = true;
                int size2 = arrayList2.size();
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    bz0 bz0Var = (bz0) obj2;
                    Runnable runnable = bz0Var.d;
                    if (runnable != null) {
                        cz0.b(runnable);
                        bz0Var.d = null;
                    }
                }
                arrayList2.clear();
                az0 az0Var = cz0Var.f32868a;
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

    public final void V(ui uiVar) {
        if (uiVar == null) {
            return;
        }
        ArrayList arrayList = uiVar.d;
        ti tiVar = uiVar.f25709m;
        if (arrayList.size() == 0) {
            tiVar.f25533i = true;
            return;
        }
        if (tiVar.f25528b == 0 && tiVar.d == 0 && tiVar.f25527a == 0 && tiVar.f25529c == 0) {
            tj0 tj0Var = this.G;
            int childCount = tj0Var.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = tj0Var.getChildAt(i3);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    zi messageObject = q1Var.getMessageObject();
                    if (q1Var.getTransitionParams().f30932w0 && arrayList.contains(messageObject)) {
                        tiVar.f25528b = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                        tiVar.d = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                        tiVar.f25527a = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                        tiVar.f25529c = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                        tiVar.f25539o = q1Var.c2();
                        tiVar.f25535k = q1Var.H2();
                        tiVar.f25536l = q1Var.G2();
                        tiVar.f25540p = true;
                        break;
                    }
                }
                i3++;
            }
        }
        this.I.add(uiVar);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z10 = view instanceof f0;
        tj0 tj0Var = this.G;
        if (z10) {
            int measuredHeight = (tj0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((f0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof ra) {
            int measuredHeight2 = (tj0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
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
            transitionParams.f30308b = false;
            transitionParams.f30309c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(me meVar, me meVar2) {
        this.T = meVar;
        this.U = meVar2;
    }

    public final boolean Z(View view) {
        d1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f55599q.contains(T) || this.f55606y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(d1 d1Var, d2.t0 t0Var, d2.t0 t0Var2) {
        ArrayList arrayList;
        int i3;
        boolean a10 = super.a(d1Var, t0Var, t0Var2);
        if (a10 && this.N) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.f55599q;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((d1) arrayList.get(i10)).c() == 0) {
                    z10 = true;
                }
                i10++;
            }
            if (z10) {
                i3 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i3 += ((d1) arrayList.get(i11)).f55540a.getHeight();
                }
            } else {
                i3 = 0;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((d1) arrayList.get(i12)).f55540a.setTranslationY(i3);
            }
        }
        return a10;
    }

    public final boolean a0(View view) {
        d1 T = this.G.T(view);
        if (T != null) {
            if (this.f55598p.contains(T) || this.A.contains(T)) {
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
        View view = d1Var.f55540a;
        if (this.K.contains(view) && (cz0Var = (cz0) this.U.run()) != null) {
            cz0Var.a(view);
        }
        super.f(d1Var);
        X(view);
    }

    @Override
    public void g() {
        if (r2.f25040a) {
            a8.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((ui) obj).f25709m.f25540p = false;
        }
        arrayList.clear();
        U();
        on onVar = this.P;
        if (onVar != null) {
            onVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f55600r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            u4.j jVar = (u4.j) arrayList2.get(size2);
            X(jVar.f55590a.f55540a);
            v(jVar.f55590a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f55598p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            d1 d1Var = (d1) arrayList3.get(size3);
            X(d1Var.f55540a);
            d(d1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f55599q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            d1 d1Var2 = (d1) arrayList4.get(size4);
            X(d1Var2.f55540a);
            u(d1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f55601s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((u4.i) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f55603u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                u4.j jVar2 = (u4.j) arrayList7.get(size7);
                X(jVar2.f55590a.f55540a);
                v(jVar2.f55590a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f55602t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                d1 d1Var3 = (d1) arrayList9.get(size9);
                X(d1Var3.f55540a);
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
                I((u4.i) arrayList11.get(size11));
                if (arrayList11.isEmpty()) {
                    arrayList10.remove(arrayList11);
                }
            }
        }
        E(this.A);
        E(this.f55607z);
        E(this.f55606y);
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
    public final d2.t0 l(a1 a1Var, d1 d1Var, int i3, List list) {
        d2.t0 l10 = super.l(a1Var, d1Var, i3, list);
        View view = d1Var.f55540a;
        if (view instanceof q1) {
            ?? obj = new Object();
            obj.f8413a = l10.f8413a;
            obj.f8414b = l10.f8414b;
            x1 transitionParams = ((q1) view).getTransitionParams();
            obj.f20435c = transitionParams.f30843b;
            obj.d = transitionParams.f30848c;
            obj.f20436e = transitionParams.d;
            obj.f20437f = transitionParams.f30856e;
            return obj;
        }
        return l10;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: ni.l.m():void");
    }

    @Override
    public final void p(d1 d1Var) {
        R(d1Var);
        View view = d1Var.f55540a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof q1) {
            ((q1) view).getTransitionParams().f30875i = true;
        }
        this.f55599q.add(d1Var);
    }

    @Override
    public final boolean q(d1 d1Var, d1 d1Var2, d2.t0 t0Var, int i3, int i10, int i11, int i12) {
        float translationX;
        if (d1Var == d1Var2) {
            return r(d1Var, t0Var, i3, i10, i11, i12);
        }
        View view = d1Var.f55540a;
        if (view instanceof q1) {
            translationX = ((q1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(d1Var);
        int i13 = (int) ((i11 - i3) - translationX);
        int i14 = (int) ((i12 - i10) - translationY);
        if (view instanceof q1) {
            ((q1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = d1Var2.f55540a;
        R(d1Var2);
        if (view2 instanceof q1) {
            ((q1) view2).setAnimationOffsetX(-i13);
        } else {
            view2.setTranslationX(-i13);
        }
        view2.setTranslationY(-i14);
        view2.setAlpha(0.0f);
        this.f55601s.add(new u4.i(d1Var, d1Var2, i3, i10, i11, i12));
        F();
        return true;
    }

    @Override
    public final boolean r(d1 d1Var, d2.t0 t0Var, int i3, int i10, int i11, int i12) {
        int translationX;
        int i13;
        q1 q1Var;
        t0 t0Var2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        View view;
        int i14;
        float f15;
        boolean z10;
        int i15;
        ui uiVar;
        int i16;
        boolean Q3;
        View view2 = d1Var.f55540a;
        if (view2 instanceof q1) {
            q1 q1Var2 = (q1) view2;
            translationX = i3 + ((int) q1Var2.getAnimationOffsetX());
            i13 = q1Var2.getTransitionParams().f30923t2 != q1Var2.getTopMediaOffset() ? (q1Var2.getTransitionParams().f30923t2 - q1Var2.getTopMediaOffset()) + i10 : i10;
            q1Var = q1Var2;
            t0Var2 = null;
        } else if (view2 instanceof t0) {
            translationX = i3 + ((int) view2.getTranslationX());
            i13 = i10;
            t0Var2 = (t0) view2;
            q1Var = null;
        } else {
            translationX = i3 + ((int) view2.getTranslationX());
            i13 = i10;
            q1Var = null;
            t0Var2 = null;
        }
        int i17 = translationX;
        int translationY = i13 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (q1Var != null) {
            float f16 = q1Var.getPhotoImage().L0;
            float f17 = q1Var.getPhotoImage().M0;
            float f18 = q1Var.getPhotoImage().N0;
            float f19 = q1Var.getPhotoImage().O0;
            f10 = 0.0f;
            int i18 = 0;
            for (int i19 = 4; i18 < i19; i19 = 4) {
                iArr[i18] = q1Var.getPhotoImage().X0[i18];
                i18++;
            }
            f12 = f16;
            f13 = f17;
            f11 = f19;
            f14 = f18;
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
        float f20 = f11;
        t0 t0Var3 = t0Var2;
        ?? jVar = new u4.j(d1Var, i17, translationY, i11, i12);
        if (q1Var != null) {
            x1 transitionParams = q1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f30925u0;
            Rect rect = transitionParams.E0;
            ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            if (i20 != 0) {
                q1Var.setAnimationOffsetX(-i20);
            }
            boolean z11 = t0Var instanceof j;
            tj0 tj0Var = this.G;
            if (z11) {
                ImageReceiver photoImage = q1Var.getPhotoImage();
                view = view2;
                j jVar2 = (j) t0Var;
                i14 = i20;
                boolean z12 = (!transitionParams.f30932w0 || jVar2.f20437f == f10 || jVar2.f20436e == f10) ? false : true;
                jVar.f20445n = z12;
                if (z12) {
                    tj0Var.setClipChildren(false);
                    tj0Var.invalidate();
                    transitionParams.f30867g0 = true;
                    if (q1Var.getMessageObject().i4()) {
                        transitionParams.f30897n0 = f12;
                        transitionParams.f30901o0 = f13;
                        transitionParams.f30905p0 = f14;
                        transitionParams.f30909q0 = f20;
                        transitionParams.B0 = iArr;
                    } else {
                        transitionParams.f30897n0 = photoImage.L0;
                        transitionParams.f30901o0 = photoImage.M0;
                        transitionParams.f30905p0 = photoImage.N0;
                        transitionParams.f30909q0 = photoImage.O0;
                        transitionParams.B0 = photoImage.X0;
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
                    float f21 = transitionParams.f30897n0;
                    float f22 = jVar2.f20435c;
                    if (f21 == f22 && transitionParams.f30901o0 == jVar2.d && transitionParams.f30909q0 == jVar2.f20437f && transitionParams.f30905p0 == jVar2.f20436e && !transitionParams.C0) {
                        transitionParams.f30867g0 = false;
                        jVar.f20445n = false;
                    } else {
                        jVar.f20446o = f22;
                        jVar.f20447p = jVar2.d;
                        jVar.f20448q = jVar2.f20436e;
                        jVar.f20449r = jVar2.f20437f;
                        if (currentMessagesGroup != null) {
                            boolean z13 = currentMessagesGroup.f25701c;
                            ti tiVar = currentMessagesGroup.f25709m;
                            boolean z14 = tiVar.f25539o;
                            if (z13 != z14) {
                                tiVar.f25538n = z14 ? 1.0f : f10;
                            }
                        }
                        if (transitionParams.C0) {
                            if (transitionParams.B0 == photoImage.X0) {
                                transitionParams.B0 = new int[4];
                                for (int i23 = 0; i23 < 4; i23++) {
                                    transitionParams.B0[i23] = photoImage.X0[i23];
                                }
                            }
                            photoImage.L0(iArr2);
                        }
                        q1Var.s3(jVar.f20446o, jVar.f20447p, jVar.f20448q, jVar.f20449r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f30932w0 && (((Q3 = q1Var.getMessageObject().Q3()) && rect.left != q1Var.getBackgroundDrawableLeft()) || ((!Q3 && rect.right != q1Var.getBackgroundDrawableRight()) || rect.top != q1Var.getBackgroundDrawableTop() || rect.bottom != q1Var.getBackgroundDrawableBottom()))) {
                    jVar.v = q1Var.getBackgroundDrawableBottom() - rect.bottom;
                    jVar.f20452u = q1Var.getBackgroundDrawableTop() - rect.top;
                    if (q1Var.X6 != transitionParams.F0) {
                        jVar.f20450s = q1Var.getBackgroundDrawableLeft() - rect.left;
                        jVar.f20451t = q1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (Q3) {
                        jVar.f20450s = q1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        jVar.f20451t = q1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    jVar.f20443l = true;
                    transitionParams.f30936x0 = true;
                    transitionParams.f30871h0 = -jVar.f20450s;
                    transitionParams.f30876i0 = -jVar.f20451t;
                    transitionParams.f30885k0 = -jVar.f20452u;
                    transitionParams.f30880j0 = -jVar.v;
                    tj0Var.setClipChildren(false);
                    tj0Var.invalidate();
                }
            } else {
                view = view2;
                i14 = i20;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    tj0 tj0Var2 = (tj0) view.getParent();
                    ti tiVar2 = currentMessagesGroup.f25709m;
                    boolean z15 = true;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i24 < tj0Var2.getChildCount()) {
                        View childAt = tj0Var2.getChildAt(i24);
                        if (childAt instanceof q1) {
                            q1 q1Var3 = (q1) childAt;
                            if (q1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !q1Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                uiVar = currentMessagesGroup;
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
                                if (q1Var3.getTransitionParams().f30932w0 || tiVar2.f25540p) {
                                    if (i25 == 0 || backgroundDrawableTop < i25) {
                                        i25 = backgroundDrawableTop;
                                    }
                                    if (i26 == 0 || backgroundDrawableBottom > i26) {
                                        i26 = backgroundDrawableBottom;
                                    }
                                    z15 = false;
                                }
                                i24 = i16 + 1;
                                currentMessagesGroup = uiVar;
                            }
                        }
                        uiVar = currentMessagesGroup;
                        i16 = i24;
                        i24 = i16 + 1;
                        currentMessagesGroup = uiVar;
                    }
                    tiVar2.f25540p = false;
                    if (i25 == 0 && i26 == 0 && i27 == 0 && i28 == 0) {
                        jVar.f20441j = false;
                        tiVar2.f25534j = false;
                    } else {
                        int i29 = (-i25) + tiVar2.f25528b;
                        jVar.f20438f = i29;
                        int i30 = (-i26) + tiVar2.d;
                        jVar.f20439g = i30;
                        int i31 = (-i27) + tiVar2.f25527a;
                        jVar.h = i31;
                        int i32 = (-i28) + tiVar2.f25529c;
                        jVar.f20440i = i32;
                        jVar.f20441j = true;
                        tiVar2.f25534j = true;
                        tiVar2.f25531f = i29;
                        tiVar2.h = i30;
                        tiVar2.f25530e = i31;
                        tiVar2.f25532g = i32;
                        tiVar2.f25538n = tiVar2.f25539o ? 1.0f : f10;
                        tj0Var2.setClipChildren(false);
                        tj0Var2.invalidate();
                    }
                    tiVar2.f25533i = z15;
                }
            }
            Integer valueOf = Integer.valueOf(q1Var.getMessageObject().f1());
            HashMap hashMap = this.H;
            ui uiVar2 = (ui) hashMap.get(valueOf);
            if (uiVar2 != null) {
                ti tiVar3 = uiVar2.f25709m;
                hashMap.remove(Integer.valueOf(q1Var.getMessageObject().f1()));
                if (transitionParams.f30932w0) {
                    int backgroundDrawableLeft2 = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                    int backgroundDrawableRight2 = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                    int backgroundDrawableTop2 = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                    int backgroundDrawableBottom2 = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                    jVar.f20453w = true;
                    transitionParams.f30936x0 = true;
                    jVar.f20450s = backgroundDrawableLeft2 - tiVar3.f25527a;
                    jVar.f20451t = backgroundDrawableRight2 - tiVar3.f25529c;
                    jVar.f20452u = backgroundDrawableTop2 - tiVar3.f25528b;
                    jVar.v = backgroundDrawableBottom2 - tiVar3.d;
                    jVar.f20443l = false;
                    transitionParams.f30871h0 = (int) ((-i15) - q1Var.getAnimationOffsetX());
                    transitionParams.f30876i0 = (int) ((-jVar.f20451t) - q1Var.getAnimationOffsetX());
                    transitionParams.f30885k0 = (int) ((-jVar.f20452u) - q1Var.getTranslationY());
                    transitionParams.f30880j0 = (int) ((-jVar.v) - q1Var.getTranslationY());
                    transitionParams.D0 = true;
                    tj0Var.setClipChildren(false);
                    tj0Var.invalidate();
                } else {
                    tiVar3.f25533i = true;
                }
            }
            ri riVar = q1Var.M;
            if (transitionParams.f30944z0 != (q1Var.B6 || q1Var.K || (riVar != null && (riVar.f25149l & 8) == 0 && q1Var.L.f25705i))) {
                z10 = true;
                jVar.f20442k = true;
                f15 = f10;
                transitionParams.A0 = f15;
            } else {
                f15 = f10;
                z10 = true;
            }
            boolean a10 = transitionParams.a();
            jVar.f20444m = a10;
            if (a10) {
                transitionParams.h = z10;
                transitionParams.L1 = f15;
            }
            if (i14 == 0 && i21 == 0 && !jVar.f20445n && !jVar.f20453w && !jVar.f20441j && !jVar.f20442k && !jVar.f20443l && !a10) {
                v(d1Var);
                return false;
            }
        } else if (t0Var3 != null) {
            s0 transitionParams2 = t0Var3.getTransitionParams();
            transitionParams2.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            boolean a11 = !transitionParams2.f30307a ? false : transitionParams2.d.F0.a();
            jVar.f20444m = a11;
            if (a11) {
                transitionParams2.f30308b = true;
                transitionParams2.f30309c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a11) {
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
        this.f55600r.add(jVar);
        F();
        return true;
    }

    @Override
    public final void s(d1 d1Var, d2.t0 t0Var) {
        if (r2.f25040a) {
            a8.b("animate remove");
        }
        super.s(d1Var, t0Var);
        View view = d1Var.f55540a;
        if (t0Var != null) {
            int i3 = t0Var.f8414b;
            int top = view.getTop();
            int left = view.getLeft() - t0Var.f8413a;
            int i10 = top - i3;
            if (i10 != 0) {
                view.setTranslationY(-i10);
            }
            if (view instanceof q1) {
                q1 q1Var = (q1) view;
                if (left != 0) {
                    q1Var.setAnimationOffsetX(-left);
                }
                if (t0Var instanceof j) {
                    j jVar = (j) t0Var;
                    q1Var.s3(jVar.f20435c, jVar.d, jVar.f20436e, jVar.f20437f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
