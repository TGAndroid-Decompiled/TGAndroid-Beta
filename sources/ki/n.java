package ki;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.x11;
import org.telegram.ui.Components.y11;
import org.telegram.ui.Components.z11;
import org.telegram.ui.eh;
import org.telegram.ui.fo;
import s4.b1;
import s4.y0;
public abstract class n extends s4.k {
    public static final es V = new es(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final fo F;
    public final mm0 G;
    public boolean N;
    public b1 O;
    public wo P;
    public boolean Q;
    public final c6 R;
    public eh T;
    public eh U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public n(fo foVar, mm0 mm0Var, c6 c6Var) {
        this.R = c6Var;
        this.F = foVar;
        this.G = mm0Var;
        this.f44901o = V;
        this.f44873n = true;
        this.f44872m = false;
    }

    @Override
    public final void B(s4.i iVar) {
        View view;
        s4.i iVar2;
        b1 b1Var = iVar.f44891a;
        View view2 = null;
        if (b1Var == null) {
            view = null;
        } else {
            view = b1Var.f44838a;
        }
        b1 b1Var2 = iVar.f44892b;
        if (b1Var2 != null) {
            view2 = b1Var2.f44838a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(iVar.f44891a);
            duration.translationX(iVar.e - iVar.f44893c);
            duration.translationY(iVar.f44894f - iVar.d);
            iVar2 = iVar;
            duration.alpha(0.0f).setListener(new k(this, iVar2, duration, view, 0)).start();
        } else {
            iVar2 = iVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(iVar2.f44892b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new k(this, iVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(b1 b1Var, s4.j jVar) {
        T(b1Var, jVar, false);
    }

    @Override
    public final boolean J(s4.i iVar, b1 b1Var) {
        z11 z11Var;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(b1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = b1Var.f44838a;
        if (this.K.contains(view) && (z11Var = (z11) this.U.run()) != null) {
            z11Var.a(view);
        }
        if (iVar.f44892b == b1Var) {
            iVar.f44892b = null;
        } else if (iVar.f44891a == b1Var) {
            iVar.f44891a = null;
        } else {
            return false;
        }
        X(view);
        d(b1Var);
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

    public final void T(final s4.b1 r22, s4.j r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: ki.n.T(s4.b1, s4.j, boolean):void");
    }

    public final void U() {
        z11 z11Var;
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
        if (!this.K.isEmpty() && (z11Var = (z11) this.U.run()) != null) {
            ArrayList arrayList2 = z11Var.f31426c;
            if (!z11Var.e) {
                z11Var.e = true;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    y11 y11Var = (y11) obj2;
                    Runnable runnable = y11Var.d;
                    if (runnable != null) {
                        z11.b(runnable);
                        y11Var.d = null;
                    }
                }
                arrayList2.clear();
                x11 x11Var = z11Var.f31424a;
                if (x11Var != null) {
                    x11Var.i();
                }
                Runnable runnable2 = z11Var.d;
                if (runnable2 != null) {
                    z11Var.d = null;
                    z11.b(runnable2);
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
            mm0 mm0Var = this.G;
            int childCount = mm0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = mm0Var.getChildAt(i10);
                if (childAt instanceof u1) {
                    u1 u1Var = (u1) childAt;
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (u1Var.getTransitionParams().f21748v0 && groupedMessages.messages.contains(messageObject)) {
                        groupedMessages.transitionParams.top = u1Var.getBackgroundDrawableTop() + u1Var.getPaddingTop() + u1Var.getTop();
                        groupedMessages.transitionParams.bottom = u1Var.getBackgroundDrawableBottom() + u1Var.getPaddingTop() + u1Var.getTop();
                        groupedMessages.transitionParams.left = u1Var.getBackgroundDrawableLeft() + u1Var.getLeft();
                        groupedMessages.transitionParams.right = u1Var.getBackgroundDrawableRight() + u1Var.getLeft();
                        groupedMessages.transitionParams.drawCaptionLayout = u1Var.P2();
                        groupedMessages.transitionParams.pinnedTop = u1Var.n3();
                        groupedMessages.transitionParams.pinnedBotton = u1Var.m3();
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
        boolean z10 = view instanceof h0;
        mm0 mm0Var = this.G;
        if (z10) {
            int measuredHeight = (mm0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((h0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof za) {
            int measuredHeight2 = (mm0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((za) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof u1) {
            u1 u1Var = (u1) view;
            u1Var.getTransitionParams().j();
            u1Var.setAnimationOffsetX(0.0f);
        } else if (view instanceof w0) {
            v0 transitionParams = ((w0) view).getTransitionParams();
            transitionParams.f22260b = false;
            transitionParams.f22261c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(eh ehVar, eh ehVar2) {
        this.T = ehVar;
        this.U = ehVar2;
    }

    public final boolean Z(View view) {
        b1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f44903q.contains(T) || this.f44910y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(b1 b1Var, b2.v0 v0Var, b2.v0 v0Var2) {
        ArrayList arrayList;
        int i10;
        boolean a2 = super.a(b1Var, v0Var, v0Var2);
        if (a2 && this.N) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.f44903q;
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((b1) arrayList.get(i11)).c() == 0) {
                    z10 = true;
                }
                i11++;
            }
            if (z10) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    i10 += ((b1) arrayList.get(i12)).f44838a.getHeight();
                }
            } else {
                i10 = 0;
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((b1) arrayList.get(i13)).f44838a.setTranslationY(i10);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        b1 T = this.G.T(view);
        if (T != null) {
            if (this.f44902p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(b1 b1Var) {
        z11 z11Var;
        Animator animator = (Animator) this.J.remove(b1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = b1Var.f44838a;
        if (this.K.contains(view) && (z11Var = (z11) this.U.run()) != null) {
            z11Var.a(view);
        }
        super.f(b1Var);
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
        wo woVar = this.P;
        if (woVar != null) {
            woVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f44904r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.j jVar = (s4.j) arrayList2.get(size2);
            X(jVar.f44898a.f44838a);
            v(jVar.f44898a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f44902p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            b1 b1Var = (b1) arrayList3.get(size3);
            X(b1Var.f44838a);
            d(b1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f44903q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            b1 b1Var2 = (b1) arrayList4.get(size4);
            X(b1Var2.f44838a);
            u(b1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f44905s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((s4.i) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f44907u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                s4.j jVar2 = (s4.j) arrayList7.get(size7);
                X(jVar2.f44898a.f44838a);
                v(jVar2.f44898a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f44906t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                b1 b1Var3 = (b1) arrayList9.get(size9);
                X(b1Var3.f44838a);
                u(b1Var3);
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
                I((s4.i) arrayList11.get(size11));
                if (arrayList11.isEmpty()) {
                    arrayList10.remove(arrayList11);
                }
            }
        }
        E(this.A);
        E(this.f44911z);
        E(this.f44910y);
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
    public final b2.v0 l(y0 y0Var, b1 b1Var, int i10, List list) {
        b2.v0 l4 = super.l(y0Var, b1Var, i10, list);
        View view = b1Var.f44838a;
        if (view instanceof u1) {
            ?? obj = new Object();
            obj.f2448a = l4.f2448a;
            obj.f2449b = l4.f2449b;
            t1 transitionParams = ((u1) view).getTransitionParams();
            obj.f14329c = transitionParams.f21657a;
            obj.d = transitionParams.f21661b;
            obj.e = transitionParams.f21666c;
            obj.f14330f = transitionParams.d;
            return obj;
        }
        return l4;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: ki.n.m():void");
    }

    @Override
    public final void p(b1 b1Var) {
        R(b1Var);
        View view = b1Var.f44838a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof u1) {
            ((u1) view).getTransitionParams().h = true;
        }
        this.f44903q.add(b1Var);
    }

    @Override
    public final boolean q(b1 b1Var, b1 b1Var2, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        float translationX;
        if (b1Var == b1Var2) {
            return r(b1Var, v0Var, i10, i11, i12, i13);
        }
        View view = b1Var.f44838a;
        if (view instanceof u1) {
            translationX = ((u1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(b1Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof u1) {
            ((u1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = b1Var2.f44838a;
        R(b1Var2);
        if (view2 instanceof u1) {
            ((u1) view2).setAnimationOffsetX(-i14);
        } else {
            view2.setTranslationX(-i14);
        }
        view2.setTranslationY(-i15);
        view2.setAlpha(0.0f);
        this.f44905s.add(new s4.i(b1Var, b1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public final boolean r(b1 b1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        int translationX;
        int i14;
        u1 u1Var;
        w0 w0Var;
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
        View view2 = b1Var.f44838a;
        if (view2 instanceof u1) {
            u1 u1Var2 = (u1) view2;
            translationX = i10 + ((int) u1Var2.getAnimationOffsetX());
            if (u1Var2.getTransitionParams().f21739s2 != u1Var2.getTopMediaOffset()) {
                i14 = (u1Var2.getTransitionParams().f21739s2 - u1Var2.getTopMediaOffset()) + i11;
            } else {
                i14 = i11;
            }
            u1Var = u1Var2;
            w0Var = null;
        } else if (view2 instanceof w0) {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            w0Var = (w0) view2;
            u1Var = null;
        } else {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            u1Var = null;
            w0Var = null;
        }
        int i18 = translationX;
        int translationY = i14 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (u1Var != null) {
            float imageX = u1Var.getPhotoImage().getImageX();
            float imageY = u1Var.getPhotoImage().getImageY();
            f11 = u1Var.getPhotoImage().getImageWidth();
            float imageHeight = u1Var.getPhotoImage().getImageHeight();
            f7 = 0.0f;
            for (int i19 = 0; i19 < 4; i19++) {
                iArr[i19] = u1Var.getPhotoImage().getRoundRadius()[i19];
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
        R(b1Var);
        int i20 = i12 - i18;
        int i21 = i13 - translationY;
        if (i21 != 0) {
            view2.setTranslationY(-i21);
        }
        float f17 = f10;
        w0 w0Var2 = w0Var;
        float f18 = f11;
        ?? jVar = new s4.j(b1Var, i18, translationY, i12, i13);
        if (u1Var != null) {
            t1 transitionParams = u1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f21741t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
            if (i20 != 0) {
                u1Var.setAnimationOffsetX(-i20);
            }
            boolean z14 = v0Var instanceof l;
            mm0 mm0Var = this.G;
            if (z14) {
                ImageReceiver photoImage = u1Var.getPhotoImage();
                view = view2;
                l lVar = (l) v0Var;
                i15 = i20;
                if (transitionParams.f21748v0 && lVar.f14330f != f7 && lVar.e != f7) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                jVar.f14338n = z13;
                if (z13) {
                    mm0Var.setClipChildren(false);
                    mm0Var.invalidate();
                    transitionParams.f21680f0 = true;
                    if (u1Var.getMessageObject().isRoundVideo()) {
                        transitionParams.m0 = f12;
                        transitionParams.f21717n0 = f13;
                        transitionParams.f21721o0 = f18;
                        transitionParams.f21725p0 = f17;
                        transitionParams.A0 = iArr;
                    } else {
                        transitionParams.m0 = photoImage.getImageX();
                        transitionParams.f21717n0 = photoImage.getImageY();
                        transitionParams.f21721o0 = photoImage.getImageWidth();
                        transitionParams.f21725p0 = photoImage.getImageHeight();
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
                    float f20 = lVar.f14329c;
                    if (f19 == f20 && transitionParams.f21717n0 == lVar.d && transitionParams.f21725p0 == lVar.f14330f && transitionParams.f21721o0 == lVar.e && !transitionParams.B0) {
                        transitionParams.f21680f0 = false;
                        jVar.f14338n = false;
                    } else {
                        jVar.f14339o = f20;
                        jVar.f14340p = lVar.d;
                        jVar.f14341q = lVar.e;
                        jVar.f14342r = lVar.f14330f;
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
                        u1Var.U3(jVar.f14339o, jVar.f14340p, jVar.f14341q, jVar.f14342r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f21748v0 && (((isOutOwner = u1Var.getMessageObject().isOutOwner()) && rect.left != u1Var.getBackgroundDrawableLeft()) || ((!isOutOwner && rect.right != u1Var.getBackgroundDrawableRight()) || rect.top != u1Var.getBackgroundDrawableTop() || rect.bottom != u1Var.getBackgroundDrawableBottom()))) {
                    jVar.v = u1Var.getBackgroundDrawableBottom() - rect.bottom;
                    jVar.f14345u = u1Var.getBackgroundDrawableTop() - rect.top;
                    if (u1Var.G8 != transitionParams.E0) {
                        jVar.f14343s = u1Var.getBackgroundDrawableLeft() - rect.left;
                        jVar.f14344t = u1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (isOutOwner) {
                        jVar.f14343s = u1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        jVar.f14344t = u1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    jVar.f14336l = true;
                    transitionParams.f21752w0 = true;
                    transitionParams.f21685g0 = -jVar.f14343s;
                    transitionParams.f21689h0 = -jVar.f14344t;
                    transitionParams.f21699j0 = -jVar.f14345u;
                    transitionParams.f21694i0 = -jVar.v;
                    mm0Var.setClipChildren(false);
                    mm0Var.invalidate();
                }
            } else {
                view = view2;
                i15 = i20;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    mm0 mm0Var2 = (mm0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z17 = true;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i24 < mm0Var2.getChildCount()) {
                        View childAt = mm0Var2.getChildAt(i24);
                        if (childAt instanceof u1) {
                            u1 u1Var3 = (u1) childAt;
                            if (u1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !u1Var3.getMessageObject().deleted) {
                                int backgroundDrawableLeft = u1Var3.getBackgroundDrawableLeft() + u1Var3.getLeft();
                                groupedMessages = currentMessagesGroup;
                                int backgroundDrawableRight = u1Var3.getBackgroundDrawableRight() + u1Var3.getLeft();
                                i17 = i24;
                                int backgroundDrawableTop = u1Var3.getBackgroundDrawableTop() + u1Var3.getPaddingTop() + u1Var3.getTop();
                                int backgroundDrawableBottom = u1Var3.getBackgroundDrawableBottom() + u1Var3.getPaddingTop() + u1Var3.getTop();
                                if (i27 == 0 || backgroundDrawableLeft < i27) {
                                    i27 = backgroundDrawableLeft;
                                }
                                if (i28 == 0 || backgroundDrawableRight > i28) {
                                    i28 = backgroundDrawableRight;
                                }
                                if (u1Var3.getTransitionParams().f21748v0 || transitionParams3.isNewGroup) {
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
                        jVar.f14334j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i29 = (-i25) + transitionParams3.top;
                        jVar.f14331f = i29;
                        int i30 = (-i26) + transitionParams3.bottom;
                        jVar.f14332g = i30;
                        int i31 = (-i27) + transitionParams3.left;
                        jVar.h = i31;
                        int i32 = (-i28) + transitionParams3.right;
                        jVar.f14333i = i32;
                        jVar.f14334j = true;
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
                        mm0Var2.setClipChildren(false);
                        mm0Var2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z17;
                }
            }
            Integer valueOf = Integer.valueOf(u1Var.getMessageObject().getId());
            HashMap hashMap = this.H;
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hashMap.get(valueOf);
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                hashMap.remove(Integer.valueOf(u1Var.getMessageObject().getId()));
                if (transitionParams.f21748v0) {
                    int backgroundDrawableLeft2 = u1Var.getBackgroundDrawableLeft() + u1Var.getLeft();
                    int backgroundDrawableRight2 = u1Var.getBackgroundDrawableRight() + u1Var.getLeft();
                    int backgroundDrawableTop2 = u1Var.getBackgroundDrawableTop() + u1Var.getPaddingTop() + u1Var.getTop();
                    int backgroundDrawableBottom2 = u1Var.getBackgroundDrawableBottom() + u1Var.getPaddingTop() + u1Var.getTop();
                    jVar.f14346w = true;
                    transitionParams.f21752w0 = true;
                    jVar.f14343s = backgroundDrawableLeft2 - transitionParams4.left;
                    jVar.f14344t = backgroundDrawableRight2 - transitionParams4.right;
                    jVar.f14345u = backgroundDrawableTop2 - transitionParams4.top;
                    jVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    jVar.f14336l = false;
                    transitionParams.f21685g0 = (int) ((-i16) - u1Var.getAnimationOffsetX());
                    transitionParams.f21689h0 = (int) ((-jVar.f14344t) - u1Var.getAnimationOffsetX());
                    transitionParams.f21699j0 = (int) ((-jVar.f14345u) - u1Var.getTranslationY());
                    transitionParams.f21694i0 = (int) ((-jVar.v) - u1Var.getTranslationY());
                    transitionParams.C0 = true;
                    mm0Var.setClipChildren(false);
                    mm0Var.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = u1Var.L;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && u1Var.K.isDocuments) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!u1Var.f21995k8 && !u1Var.J && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (transitionParams.f21760y0 != z11) {
                z12 = true;
                jVar.f14335k = true;
                f14 = f7;
                transitionParams.f21764z0 = f14;
            } else {
                f14 = f7;
                z12 = true;
            }
            boolean f21 = transitionParams.f();
            jVar.f14337m = f21;
            if (f21) {
                transitionParams.f21684g = z12;
                transitionParams.K1 = f14;
            }
            if (i15 == 0 && i21 == 0 && !jVar.f14338n && !jVar.f14346w && !jVar.f14334j && !jVar.f14335k && !jVar.f14336l && !f21) {
                v(b1Var);
                return false;
            }
        } else if (w0Var2 != null) {
            v0 transitionParams5 = w0Var2.getTransitionParams();
            transitionParams5.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            if (!transitionParams5.f22259a) {
                a2 = false;
            } else {
                a2 = transitionParams5.d.E0.a();
            }
            jVar.f14337m = a2;
            if (a2) {
                transitionParams5.f22260b = true;
                transitionParams5.f22261c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a2) {
                v(b1Var);
                return false;
            }
        } else if (view2 instanceof h0) {
            ((h0) view2).setAnimating(true);
        } else if (view2 instanceof za) {
            ((za) view2).setAnimating(true);
        } else if (i20 == 0 && i21 == 0) {
            v(b1Var);
            return false;
        } else if (i20 != 0) {
            view2.setTranslationX(-i20);
        }
        this.f44904r.add(jVar);
        F();
        return true;
    }

    @Override
    public final void s(b1 b1Var, b2.v0 v0Var) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(b1Var, v0Var);
        View view = b1Var.f44838a;
        if (v0Var != null) {
            int i10 = v0Var.f2449b;
            int top = view.getTop();
            int left = view.getLeft() - v0Var.f2448a;
            int i11 = top - i10;
            if (i11 != 0) {
                view.setTranslationY(-i11);
            }
            if (view instanceof u1) {
                u1 u1Var = (u1) view;
                if (left != 0) {
                    u1Var.setAnimationOffsetX(-left);
                }
                if (v0Var instanceof l) {
                    l lVar = (l) v0Var;
                    u1Var.U3(lVar.f14329c, lVar.d, lVar.e, lVar.f14330f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
