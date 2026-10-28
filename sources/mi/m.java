package mi;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.cb;
import org.telegram.ui.Cells.g0;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.vo;
import org.telegram.ui.ug;
import org.telegram.ui.wn;
import s4.b1;
import s4.e1;
public abstract class m extends s4.l {
    public static final ds V = new ds(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final wn F;
    public final nm0 G;
    public boolean N;
    public e1 O;
    public vo P;
    public boolean Q;
    public final u6 R;
    public ug T;
    public ug U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public m(wn wnVar, nm0 nm0Var, u6 u6Var) {
        this.R = u6Var;
        this.F = wnVar;
        this.G = nm0Var;
        this.f47822o = V;
        this.f47799n = true;
        this.f47798m = false;
    }

    @Override
    public final void B(s4.j jVar) {
        View view;
        s4.j jVar2;
        e1 e1Var = jVar.f47812a;
        View view2 = null;
        if (e1Var == null) {
            view = null;
        } else {
            view = e1Var.f47773a;
        }
        e1 e1Var2 = jVar.f47813b;
        if (e1Var2 != null) {
            view2 = e1Var2.f47773a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(jVar.f47812a);
            duration.translationX(jVar.e - jVar.f47814c);
            duration.translationY(jVar.f47815f - jVar.d);
            jVar2 = jVar;
            duration.alpha(0.0f).setListener(new j(this, jVar2, duration, view, 0)).start();
        } else {
            jVar2 = jVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(jVar2.f47813b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new j(this, jVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(e1 e1Var, s4.k kVar) {
        T(e1Var, kVar, false);
    }

    @Override
    public final boolean J(s4.j jVar, e1 e1Var) {
        h21 h21Var;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(e1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = e1Var.f47773a;
        if (this.K.contains(view) && (h21Var = (h21) this.U.run()) != null) {
            h21Var.a(view);
        }
        if (jVar.f47813b == e1Var) {
            jVar.f47813b = null;
        } else if (jVar.f47812a == e1Var) {
            jVar.f47812a = null;
        } else {
            return false;
        }
        X(view);
        d(e1Var);
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

    public final void T(final s4.e1 r22, s4.k r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: mi.m.T(s4.e1, s4.k, boolean):void");
    }

    public final void U() {
        h21 h21Var;
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
        if (!this.K.isEmpty() && (h21Var = (h21) this.U.run()) != null) {
            ArrayList arrayList2 = h21Var.f28837c;
            if (!h21Var.e) {
                h21Var.e = true;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    g21 g21Var = (g21) obj2;
                    Runnable runnable = g21Var.d;
                    if (runnable != null) {
                        h21.b(runnable);
                        g21Var.d = null;
                    }
                }
                arrayList2.clear();
                f21 f21Var = h21Var.f28835a;
                if (f21Var != null) {
                    f21Var.i();
                }
                Runnable runnable2 = h21Var.d;
                if (runnable2 != null) {
                    h21Var.d = null;
                    h21.b(runnable2);
                }
            }
        }
    }

    public final void V(MessageObject.GroupedMessages groupedMessages) {
        if (groupedMessages == null) {
            return;
        }
        if (groupedMessages.messages.size() == 0) {
            groupedMessages.transitionParams.drawBackgroundForDeletedItems = true;
            return;
        }
        MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
        if (transitionParams.top == 0 && transitionParams.bottom == 0 && transitionParams.left == 0 && transitionParams.right == 0) {
            nm0 nm0Var = this.G;
            int childCount = nm0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = nm0Var.getChildAt(i10);
                if (childAt instanceof s1) {
                    s1 s1Var = (s1) childAt;
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (s1Var.getTransitionParams().f24939v0 && groupedMessages.messages.contains(messageObject)) {
                        groupedMessages.transitionParams.top = s1Var.getBackgroundDrawableTop() + s1Var.getPaddingTop() + s1Var.getTop();
                        groupedMessages.transitionParams.bottom = s1Var.getBackgroundDrawableBottom() + s1Var.getPaddingTop() + s1Var.getTop();
                        groupedMessages.transitionParams.left = s1Var.getBackgroundDrawableLeft() + s1Var.getLeft();
                        groupedMessages.transitionParams.right = s1Var.getBackgroundDrawableRight() + s1Var.getLeft();
                        groupedMessages.transitionParams.drawCaptionLayout = s1Var.P2();
                        groupedMessages.transitionParams.pinnedTop = s1Var.n3();
                        groupedMessages.transitionParams.pinnedBotton = s1Var.m3();
                        groupedMessages.transitionParams.isNewGroup = true;
                        break;
                    }
                }
                i10++;
            }
        }
        this.I.add(groupedMessages);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z10 = view instanceof g0;
        nm0 nm0Var = this.G;
        if (z10) {
            int measuredHeight = (nm0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((g0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof cb) {
            int measuredHeight2 = (nm0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((cb) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof s1) {
            s1 s1Var = (s1) view;
            s1Var.getTransitionParams().j();
            s1Var.setAnimationOffsetX(0.0f);
        } else if (view instanceof v0) {
            u0 transitionParams = ((v0) view).getTransitionParams();
            transitionParams.f25472b = false;
            transitionParams.f25473c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(ug ugVar, ug ugVar2) {
        this.T = ugVar;
        this.U = ugVar2;
    }

    public final boolean Z(View view) {
        e1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f47824q.contains(T) || this.f47831y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(e1 e1Var, b2.v0 v0Var, b2.v0 v0Var2) {
        ArrayList arrayList;
        int i10;
        boolean a2 = super.a(e1Var, v0Var, v0Var2);
        if (a2 && this.N) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.f47824q;
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((e1) arrayList.get(i11)).c() == 0) {
                    z10 = true;
                }
                i11++;
            }
            if (z10) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    i10 += ((e1) arrayList.get(i12)).f47773a.getHeight();
                }
            } else {
                i10 = 0;
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((e1) arrayList.get(i13)).f47773a.setTranslationY(i10);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        e1 T = this.G.T(view);
        if (T != null) {
            if (this.f47823p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(e1 e1Var) {
        h21 h21Var;
        Animator animator = (Animator) this.J.remove(e1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = e1Var.f47773a;
        if (this.K.contains(view) && (h21Var = (h21) this.U.run()) != null) {
            h21Var.a(view);
        }
        super.f(e1Var);
        X(view);
    }

    @Override
    public void g() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((MessageObject.GroupedMessages) obj).transitionParams.isNewGroup = false;
        }
        arrayList.clear();
        U();
        vo voVar = this.P;
        if (voVar != null) {
            voVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f47825r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.k kVar = (s4.k) arrayList2.get(size2);
            X(kVar.f47816a.f47773a);
            v(kVar.f47816a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f47823p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            e1 e1Var = (e1) arrayList3.get(size3);
            X(e1Var.f47773a);
            d(e1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f47824q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            e1 e1Var2 = (e1) arrayList4.get(size4);
            X(e1Var2.f47773a);
            u(e1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f47826s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((s4.j) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f47828u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                s4.k kVar2 = (s4.k) arrayList7.get(size7);
                X(kVar2.f47816a.f47773a);
                v(kVar2.f47816a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f47827t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                e1 e1Var3 = (e1) arrayList9.get(size9);
                X(e1Var3.f47773a);
                u(e1Var3);
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
                I((s4.j) arrayList11.get(size11));
                if (arrayList11.isEmpty()) {
                    arrayList10.remove(arrayList11);
                }
            }
        }
        E(this.A);
        E(this.f47832z);
        E(this.f47831y);
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
    public final b2.v0 l(b1 b1Var, e1 e1Var, int i10, List list) {
        b2.v0 l4 = super.l(b1Var, e1Var, i10, list);
        View view = e1Var.f47773a;
        if (view instanceof s1) {
            ?? obj = new Object();
            obj.f3511a = l4.f3511a;
            obj.f3512b = l4.f3512b;
            r1 transitionParams = ((s1) view).getTransitionParams();
            obj.f18530c = transitionParams.f24847a;
            obj.d = transitionParams.f24851b;
            obj.e = transitionParams.f24856c;
            obj.f18531f = transitionParams.d;
            return obj;
        }
        return l4;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: mi.m.m():void");
    }

    @Override
    public final void p(e1 e1Var) {
        R(e1Var);
        View view = e1Var.f47773a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof s1) {
            ((s1) view).getTransitionParams().h = true;
        }
        this.f47824q.add(e1Var);
    }

    @Override
    public final boolean q(e1 e1Var, e1 e1Var2, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        float translationX;
        if (e1Var == e1Var2) {
            return r(e1Var, v0Var, i10, i11, i12, i13);
        }
        View view = e1Var.f47773a;
        if (view instanceof s1) {
            translationX = ((s1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(e1Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof s1) {
            ((s1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = e1Var2.f47773a;
        R(e1Var2);
        if (view2 instanceof s1) {
            ((s1) view2).setAnimationOffsetX(-i14);
        } else {
            view2.setTranslationX(-i14);
        }
        view2.setTranslationY(-i15);
        view2.setAlpha(0.0f);
        this.f47826s.add(new s4.j(e1Var, e1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public final boolean r(e1 e1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        int translationX;
        int i14;
        s1 s1Var;
        v0 v0Var2;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean a2;
        View view;
        int i15;
        boolean z10;
        boolean z11;
        float f14;
        boolean z12;
        int i16;
        float f15;
        MessageObject.GroupedMessages groupedMessages;
        int i17;
        boolean z13;
        boolean isOutOwner;
        float f16;
        View view2 = e1Var.f47773a;
        if (view2 instanceof s1) {
            s1 s1Var2 = (s1) view2;
            translationX = i10 + ((int) s1Var2.getAnimationOffsetX());
            if (s1Var2.getTransitionParams().f24930s2 != s1Var2.getTopMediaOffset()) {
                i14 = (s1Var2.getTransitionParams().f24930s2 - s1Var2.getTopMediaOffset()) + i11;
            } else {
                i14 = i11;
            }
            s1Var = s1Var2;
            v0Var2 = null;
        } else if (view2 instanceof v0) {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            v0Var2 = (v0) view2;
            s1Var = null;
        } else {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            s1Var = null;
            v0Var2 = null;
        }
        int i18 = translationX;
        int translationY = i14 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (s1Var != null) {
            float imageX = s1Var.getPhotoImage().getImageX();
            float imageY = s1Var.getPhotoImage().getImageY();
            f11 = s1Var.getPhotoImage().getImageWidth();
            float imageHeight = s1Var.getPhotoImage().getImageHeight();
            f7 = 0.0f;
            for (int i19 = 0; i19 < 4; i19++) {
                iArr[i19] = s1Var.getPhotoImage().getRoundRadius()[i19];
            }
            f12 = imageX;
            f10 = imageHeight;
            f13 = imageY;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        R(e1Var);
        int i20 = i12 - i18;
        int i21 = i13 - translationY;
        if (i21 != 0) {
            view2.setTranslationY(-i21);
        }
        float f17 = f10;
        v0 v0Var3 = v0Var2;
        float f18 = f11;
        ?? kVar = new s4.k(e1Var, i18, translationY, i12, i13);
        if (s1Var != null) {
            r1 transitionParams = s1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f24932t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
            if (i20 != 0) {
                s1Var.setAnimationOffsetX(-i20);
            }
            boolean z14 = v0Var instanceof k;
            nm0 nm0Var = this.G;
            if (z14) {
                ImageReceiver photoImage = s1Var.getPhotoImage();
                view = view2;
                k kVar2 = (k) v0Var;
                i15 = i20;
                if (transitionParams.f24939v0 && kVar2.f18531f != f7 && kVar2.e != f7) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                kVar.f18539n = z13;
                if (z13) {
                    nm0Var.setClipChildren(false);
                    nm0Var.invalidate();
                    transitionParams.f24870f0 = true;
                    if (s1Var.getMessageObject().isRoundVideo()) {
                        transitionParams.m0 = f12;
                        transitionParams.f24907n0 = f13;
                        transitionParams.f24912o0 = f18;
                        transitionParams.f24916p0 = f17;
                        transitionParams.A0 = iArr;
                    } else {
                        transitionParams.m0 = photoImage.getImageX();
                        transitionParams.f24907n0 = photoImage.getImageY();
                        transitionParams.f24912o0 = photoImage.getImageWidth();
                        transitionParams.f24916p0 = photoImage.getImageHeight();
                        transitionParams.A0 = photoImage.getRoundRadius();
                    }
                    transitionParams.B0 = false;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= 4) {
                            break;
                        } else if (iArr2[i22] != transitionParams.A0[i22]) {
                            transitionParams.B0 = true;
                            break;
                        } else {
                            i22++;
                        }
                    }
                    float f19 = transitionParams.m0;
                    float f20 = kVar2.f18530c;
                    if (f19 == f20 && transitionParams.f24907n0 == kVar2.d && transitionParams.f24916p0 == kVar2.f18531f && transitionParams.f24912o0 == kVar2.e && !transitionParams.B0) {
                        transitionParams.f24870f0 = false;
                        kVar.f18539n = false;
                    } else {
                        kVar.f18540o = f20;
                        kVar.f18541p = kVar2.d;
                        kVar.f18542q = kVar2.e;
                        kVar.f18543r = kVar2.f18531f;
                        if (currentMessagesGroup != null) {
                            boolean z15 = currentMessagesGroup.hasCaption;
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            boolean z16 = transitionParams2.drawCaptionLayout;
                            if (z15 != z16) {
                                if (z16) {
                                    f16 = 1.0f;
                                } else {
                                    f16 = f7;
                                }
                                transitionParams2.captionEnterProgress = f16;
                            }
                        }
                        if (transitionParams.B0) {
                            if (transitionParams.A0 == photoImage.getRoundRadius()) {
                                transitionParams.A0 = new int[4];
                                for (int i23 = 0; i23 < 4; i23++) {
                                    transitionParams.A0[i23] = photoImage.getRoundRadius()[i23];
                                }
                            }
                            photoImage.setRoundRadius(iArr2);
                        }
                        s1Var.W3(kVar.f18540o, kVar.f18541p, kVar.f18542q, kVar.f18543r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f24939v0 && (((isOutOwner = s1Var.getMessageObject().isOutOwner()) && rect.left != s1Var.getBackgroundDrawableLeft()) || ((!isOutOwner && rect.right != s1Var.getBackgroundDrawableRight()) || rect.top != s1Var.getBackgroundDrawableTop() || rect.bottom != s1Var.getBackgroundDrawableBottom()))) {
                    kVar.v = s1Var.getBackgroundDrawableBottom() - rect.bottom;
                    kVar.f18546u = s1Var.getBackgroundDrawableTop() - rect.top;
                    if (s1Var.G8 != transitionParams.E0) {
                        kVar.f18544s = s1Var.getBackgroundDrawableLeft() - rect.left;
                        kVar.f18545t = s1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (isOutOwner) {
                        kVar.f18544s = s1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        kVar.f18545t = s1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    kVar.f18537l = true;
                    transitionParams.f24943w0 = true;
                    transitionParams.f24875g0 = -kVar.f18544s;
                    transitionParams.f24879h0 = -kVar.f18545t;
                    transitionParams.f24889j0 = -kVar.f18546u;
                    transitionParams.f24884i0 = -kVar.v;
                    nm0Var.setClipChildren(false);
                    nm0Var.invalidate();
                }
            } else {
                view = view2;
                i15 = i20;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    nm0 nm0Var2 = (nm0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z17 = true;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i24 < nm0Var2.getChildCount()) {
                        View childAt = nm0Var2.getChildAt(i24);
                        if (childAt instanceof s1) {
                            s1 s1Var3 = (s1) childAt;
                            if (s1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !s1Var3.getMessageObject().deleted) {
                                int backgroundDrawableLeft = s1Var3.getBackgroundDrawableLeft() + s1Var3.getLeft();
                                groupedMessages = currentMessagesGroup;
                                int backgroundDrawableRight = s1Var3.getBackgroundDrawableRight() + s1Var3.getLeft();
                                i17 = i24;
                                int backgroundDrawableTop = s1Var3.getBackgroundDrawableTop() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                int backgroundDrawableBottom = s1Var3.getBackgroundDrawableBottom() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                if (i27 == 0 || backgroundDrawableLeft < i27) {
                                    i27 = backgroundDrawableLeft;
                                }
                                if (i28 == 0 || backgroundDrawableRight > i28) {
                                    i28 = backgroundDrawableRight;
                                }
                                if (s1Var3.getTransitionParams().f24939v0 || transitionParams3.isNewGroup) {
                                    if (i25 == 0 || backgroundDrawableTop < i25) {
                                        i25 = backgroundDrawableTop;
                                    }
                                    if (i26 == 0 || backgroundDrawableBottom > i26) {
                                        i26 = backgroundDrawableBottom;
                                    }
                                    z17 = false;
                                }
                                i24 = i17 + 1;
                                currentMessagesGroup = groupedMessages;
                            }
                        }
                        groupedMessages = currentMessagesGroup;
                        i17 = i24;
                        i24 = i17 + 1;
                        currentMessagesGroup = groupedMessages;
                    }
                    transitionParams3.isNewGroup = false;
                    if (i25 == 0 && i26 == 0 && i27 == 0 && i28 == 0) {
                        kVar.f18535j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i29 = (-i25) + transitionParams3.top;
                        kVar.f18532f = i29;
                        int i30 = (-i26) + transitionParams3.bottom;
                        kVar.f18533g = i30;
                        int i31 = (-i27) + transitionParams3.left;
                        kVar.h = i31;
                        int i32 = (-i28) + transitionParams3.right;
                        kVar.f18534i = i32;
                        kVar.f18535j = true;
                        transitionParams3.backgroundChangeBounds = true;
                        transitionParams3.offsetTop = i29;
                        transitionParams3.offsetBottom = i30;
                        transitionParams3.offsetLeft = i31;
                        transitionParams3.offsetRight = i32;
                        if (transitionParams3.drawCaptionLayout) {
                            f15 = 1.0f;
                        } else {
                            f15 = f7;
                        }
                        transitionParams3.captionEnterProgress = f15;
                        nm0Var2.setClipChildren(false);
                        nm0Var2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z17;
                }
            }
            Integer valueOf = Integer.valueOf(s1Var.getMessageObject().getId());
            HashMap hashMap = this.H;
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hashMap.get(valueOf);
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                hashMap.remove(Integer.valueOf(s1Var.getMessageObject().getId()));
                if (transitionParams.f24939v0) {
                    int backgroundDrawableLeft2 = s1Var.getBackgroundDrawableLeft() + s1Var.getLeft();
                    int backgroundDrawableRight2 = s1Var.getBackgroundDrawableRight() + s1Var.getLeft();
                    int backgroundDrawableTop2 = s1Var.getBackgroundDrawableTop() + s1Var.getPaddingTop() + s1Var.getTop();
                    int backgroundDrawableBottom2 = s1Var.getBackgroundDrawableBottom() + s1Var.getPaddingTop() + s1Var.getTop();
                    kVar.f18547w = true;
                    transitionParams.f24943w0 = true;
                    kVar.f18544s = backgroundDrawableLeft2 - transitionParams4.left;
                    kVar.f18545t = backgroundDrawableRight2 - transitionParams4.right;
                    kVar.f18546u = backgroundDrawableTop2 - transitionParams4.top;
                    kVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    kVar.f18537l = false;
                    transitionParams.f24875g0 = (int) ((-i16) - s1Var.getAnimationOffsetX());
                    transitionParams.f24879h0 = (int) ((-kVar.f18545t) - s1Var.getAnimationOffsetX());
                    transitionParams.f24889j0 = (int) ((-kVar.f18546u) - s1Var.getTranslationY());
                    transitionParams.f24884i0 = (int) ((-kVar.v) - s1Var.getTranslationY());
                    transitionParams.C0 = true;
                    nm0Var.setClipChildren(false);
                    nm0Var.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = s1Var.L;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && s1Var.K.isDocuments) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!s1Var.f25165k8 && !s1Var.J && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (transitionParams.f24951y0 != z11) {
                z12 = true;
                kVar.f18536k = true;
                f14 = f7;
                transitionParams.f24955z0 = f14;
            } else {
                f14 = f7;
                z12 = true;
            }
            boolean f21 = transitionParams.f();
            kVar.f18538m = f21;
            if (f21) {
                transitionParams.f24874g = z12;
                transitionParams.K1 = f14;
            }
            if (i15 == 0 && i21 == 0 && !kVar.f18539n && !kVar.f18547w && !kVar.f18535j && !kVar.f18536k && !kVar.f18537l && !f21) {
                v(e1Var);
                return false;
            }
        } else if (v0Var3 != null) {
            u0 transitionParams5 = v0Var3.getTransitionParams();
            transitionParams5.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            if (!transitionParams5.f25471a) {
                a2 = false;
            } else {
                a2 = transitionParams5.d.E0.a();
            }
            kVar.f18538m = a2;
            if (a2) {
                transitionParams5.f25472b = true;
                transitionParams5.f25473c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a2) {
                v(e1Var);
                return false;
            }
        } else if (view2 instanceof g0) {
            ((g0) view2).setAnimating(true);
        } else if (view2 instanceof cb) {
            ((cb) view2).setAnimating(true);
        } else if (i20 == 0 && i21 == 0) {
            v(e1Var);
            return false;
        } else if (i20 != 0) {
            view2.setTranslationX(-i20);
        }
        this.f47825r.add(kVar);
        F();
        return true;
    }

    @Override
    public final void s(e1 e1Var, b2.v0 v0Var) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(e1Var, v0Var);
        View view = e1Var.f47773a;
        if (v0Var != null) {
            int i10 = v0Var.f3512b;
            int top = view.getTop();
            int left = view.getLeft() - v0Var.f3511a;
            int i11 = top - i10;
            if (i11 != 0) {
                view.setTranslationY(-i11);
            }
            if (view instanceof s1) {
                s1 s1Var = (s1) view;
                if (left != 0) {
                    s1Var.setAnimationOffsetX(-left);
                }
                if (v0Var instanceof k) {
                    k kVar = (k) v0Var;
                    s1Var.W3(kVar.f18530c, kVar.d, kVar.e, kVar.f18531f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
