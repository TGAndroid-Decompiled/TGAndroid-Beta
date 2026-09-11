package ki;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import b2.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.w01;
import org.telegram.ui.bh;
import org.telegram.ui.co;
import s4.c1;
import s4.z0;
public abstract class o extends s4.j {
    public static final pr V = new pr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final co F;
    public final ll0 G;
    public boolean N;
    public c1 O;
    public io P;
    public boolean Q;
    public final f6 R;
    public bh T;
    public bh U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public o(co coVar, ll0 ll0Var, f6 f6Var) {
        this.R = f6Var;
        this.F = coVar;
        this.G = ll0Var;
        this.f45803o = V;
        this.f45778n = true;
        this.f45777m = false;
    }

    @Override
    public final void B(s4.h hVar) {
        View view;
        s4.h hVar2;
        c1 c1Var = hVar.f45789a;
        View view2 = null;
        if (c1Var == null) {
            view = null;
        } else {
            view = c1Var.f45738a;
        }
        c1 c1Var2 = hVar.f45790b;
        if (c1Var2 != null) {
            view2 = c1Var2.f45738a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(hVar.f45789a);
            duration.translationX(hVar.f45792e - hVar.f45791c);
            duration.translationY(hVar.f45793f - hVar.d);
            hVar2 = hVar;
            duration.alpha(0.0f).setListener(new l(this, hVar2, duration, view, 0)).start();
        } else {
            hVar2 = hVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(hVar2.f45790b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new l(this, hVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(c1 c1Var, s4.i iVar) {
        T(c1Var, iVar, false);
    }

    @Override
    public final boolean J(s4.h hVar, c1 c1Var) {
        w01 w01Var;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(c1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = c1Var.f45738a;
        if (this.K.contains(view) && (w01Var = (w01) this.U.run()) != null) {
            w01Var.a(view);
        }
        if (hVar.f45790b == c1Var) {
            hVar.f45790b = null;
        } else if (hVar.f45789a == c1Var) {
            hVar.f45789a = null;
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

    public final void T(final s4.c1 r22, s4.i r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: ki.o.T(s4.c1, s4.i, boolean):void");
    }

    public final void U() {
        w01 w01Var;
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
        if (!this.K.isEmpty() && (w01Var = (w01) this.U.run()) != null) {
            ArrayList arrayList2 = w01Var.f32054c;
            if (!w01Var.f32055e) {
                w01Var.f32055e = true;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    v01 v01Var = (v01) obj2;
                    Runnable runnable = v01Var.d;
                    if (runnable != null) {
                        w01.b(runnable);
                        v01Var.d = null;
                    }
                }
                arrayList2.clear();
                u01 u01Var = w01Var.f32052a;
                if (u01Var != null) {
                    u01Var.i();
                }
                Runnable runnable2 = w01Var.d;
                if (runnable2 != null) {
                    w01Var.d = null;
                    w01.b(runnable2);
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
            ll0 ll0Var = this.G;
            int childCount = ll0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = ll0Var.getChildAt(i10);
                if (childAt instanceof t1) {
                    t1 t1Var = (t1) childAt;
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (t1Var.getTransitionParams().f22798v0 && groupedMessages.messages.contains(messageObject)) {
                        groupedMessages.transitionParams.top = t1Var.getBackgroundDrawableTop() + t1Var.getPaddingTop() + t1Var.getTop();
                        groupedMessages.transitionParams.bottom = t1Var.getBackgroundDrawableBottom() + t1Var.getPaddingTop() + t1Var.getTop();
                        groupedMessages.transitionParams.left = t1Var.getBackgroundDrawableLeft() + t1Var.getLeft();
                        groupedMessages.transitionParams.right = t1Var.getBackgroundDrawableRight() + t1Var.getLeft();
                        groupedMessages.transitionParams.drawCaptionLayout = t1Var.P2();
                        groupedMessages.transitionParams.pinnedTop = t1Var.n3();
                        groupedMessages.transitionParams.pinnedBotton = t1Var.m3();
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
        ll0 ll0Var = this.G;
        if (z10) {
            int measuredHeight = (ll0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((h0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof bb) {
            int measuredHeight2 = (ll0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((bb) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof t1) {
            t1 t1Var = (t1) view;
            t1Var.getTransitionParams().j();
            t1Var.setAnimationOffsetX(0.0f);
        } else if (view instanceof w0) {
            v0 transitionParams = ((w0) view).getTransitionParams();
            transitionParams.f23353b = false;
            transitionParams.f23354c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(bh bhVar, bh bhVar2) {
        this.T = bhVar;
        this.U = bhVar2;
    }

    public final boolean Z(View view) {
        c1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f45805q.contains(T) || this.f45812y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(c1 c1Var, q0 q0Var, q0 q0Var2) {
        ArrayList arrayList;
        int i10;
        boolean a2 = super.a(c1Var, q0Var, q0Var2);
        if (a2 && this.N) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.f45805q;
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
                    i10 += ((c1) arrayList.get(i12)).f45738a.getHeight();
                }
            } else {
                i10 = 0;
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((c1) arrayList.get(i13)).f45738a.setTranslationY(i10);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        c1 T = this.G.T(view);
        if (T != null) {
            if (this.f45804p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(c1 c1Var) {
        w01 w01Var;
        Animator animator = (Animator) this.J.remove(c1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = c1Var.f45738a;
        if (this.K.contains(view) && (w01Var = (w01) this.U.run()) != null) {
            w01Var.a(view);
        }
        super.f(c1Var);
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
        io ioVar = this.P;
        if (ioVar != null) {
            ioVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f45806r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.i iVar = (s4.i) arrayList2.get(size2);
            X(iVar.f45796a.f45738a);
            v(iVar.f45796a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f45804p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            c1 c1Var = (c1) arrayList3.get(size3);
            X(c1Var.f45738a);
            d(c1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f45805q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            c1 c1Var2 = (c1) arrayList4.get(size4);
            X(c1Var2.f45738a);
            u(c1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f45807s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((s4.h) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f45809u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                s4.i iVar2 = (s4.i) arrayList7.get(size7);
                X(iVar2.f45796a.f45738a);
                v(iVar2.f45796a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f45808t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                c1 c1Var3 = (c1) arrayList9.get(size9);
                X(c1Var3.f45738a);
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
        E(this.f45813z);
        E(this.f45812y);
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
    public final q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        q0 l4 = super.l(z0Var, c1Var, i10, list);
        View view = c1Var.f45738a;
        if (view instanceof t1) {
            ?? obj = new Object();
            obj.f2260a = l4.f2260a;
            obj.f2261b = l4.f2261b;
            s1 transitionParams = ((t1) view).getTransitionParams();
            obj.f15016c = transitionParams.f22707a;
            obj.d = transitionParams.f22711b;
            obj.f15017e = transitionParams.f22716c;
            obj.f15018f = transitionParams.d;
            return obj;
        }
        return l4;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: ki.o.m():void");
    }

    @Override
    public final void p(c1 c1Var) {
        R(c1Var);
        View view = c1Var.f45738a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof t1) {
            ((t1) view).getTransitionParams().h = true;
        }
        this.f45805q.add(c1Var);
    }

    @Override
    public final boolean q(c1 c1Var, c1 c1Var2, q0 q0Var, int i10, int i11, int i12, int i13) {
        float translationX;
        if (c1Var == c1Var2) {
            return r(c1Var, q0Var, i10, i11, i12, i13);
        }
        View view = c1Var.f45738a;
        if (view instanceof t1) {
            translationX = ((t1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(c1Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof t1) {
            ((t1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = c1Var2.f45738a;
        R(c1Var2);
        if (view2 instanceof t1) {
            ((t1) view2).setAnimationOffsetX(-i14);
        } else {
            view2.setTranslationX(-i14);
        }
        view2.setTranslationY(-i15);
        view2.setAlpha(0.0f);
        this.f45807s.add(new s4.h(c1Var, c1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public final boolean r(c1 c1Var, q0 q0Var, int i10, int i11, int i12, int i13) {
        int translationX;
        int i14;
        t1 t1Var;
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
        View view2 = c1Var.f45738a;
        if (view2 instanceof t1) {
            t1 t1Var2 = (t1) view2;
            translationX = i10 + ((int) t1Var2.getAnimationOffsetX());
            if (t1Var2.getTransitionParams().f22789s2 != t1Var2.getTopMediaOffset()) {
                i14 = (t1Var2.getTransitionParams().f22789s2 - t1Var2.getTopMediaOffset()) + i11;
            } else {
                i14 = i11;
            }
            t1Var = t1Var2;
            w0Var = null;
        } else if (view2 instanceof w0) {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            w0Var = (w0) view2;
            t1Var = null;
        } else {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            t1Var = null;
            w0Var = null;
        }
        int i18 = translationX;
        int translationY = i14 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (t1Var != null) {
            float imageX = t1Var.getPhotoImage().getImageX();
            float imageY = t1Var.getPhotoImage().getImageY();
            f11 = t1Var.getPhotoImage().getImageWidth();
            float imageHeight = t1Var.getPhotoImage().getImageHeight();
            f7 = 0.0f;
            for (int i19 = 0; i19 < 4; i19++) {
                iArr[i19] = t1Var.getPhotoImage().getRoundRadius()[i19];
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
        R(c1Var);
        int i20 = i12 - i18;
        int i21 = i13 - translationY;
        if (i21 != 0) {
            view2.setTranslationY(-i21);
        }
        float f17 = f10;
        w0 w0Var2 = w0Var;
        float f18 = f11;
        ?? iVar = new s4.i(c1Var, i18, translationY, i12, i13);
        if (t1Var != null) {
            s1 transitionParams = t1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f22791t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (i20 != 0) {
                t1Var.setAnimationOffsetX(-i20);
            }
            boolean z14 = q0Var instanceof m;
            ll0 ll0Var = this.G;
            if (z14) {
                ImageReceiver photoImage = t1Var.getPhotoImage();
                view = view2;
                m mVar = (m) q0Var;
                i15 = i20;
                if (transitionParams.f22798v0 && mVar.f15018f != f7 && mVar.f15017e != f7) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                iVar.f15026n = z13;
                if (z13) {
                    ll0Var.setClipChildren(false);
                    ll0Var.invalidate();
                    transitionParams.f22731f0 = true;
                    if (t1Var.getMessageObject().isRoundVideo()) {
                        transitionParams.m0 = f12;
                        transitionParams.f22767n0 = f13;
                        transitionParams.f22771o0 = f18;
                        transitionParams.f22775p0 = f17;
                        transitionParams.A0 = iArr;
                    } else {
                        transitionParams.m0 = photoImage.getImageX();
                        transitionParams.f22767n0 = photoImage.getImageY();
                        transitionParams.f22771o0 = photoImage.getImageWidth();
                        transitionParams.f22775p0 = photoImage.getImageHeight();
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
                    float f20 = mVar.f15016c;
                    if (f19 == f20 && transitionParams.f22767n0 == mVar.d && transitionParams.f22775p0 == mVar.f15018f && transitionParams.f22771o0 == mVar.f15017e && !transitionParams.B0) {
                        transitionParams.f22731f0 = false;
                        iVar.f15026n = false;
                    } else {
                        iVar.f15027o = f20;
                        iVar.f15028p = mVar.d;
                        iVar.f15029q = mVar.f15017e;
                        iVar.f15030r = mVar.f15018f;
                        if (currentMessagesGroup != null) {
                            boolean z15 = currentMessagesGroup.hasCaption;
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            boolean z16 = transitionParams2.drawCaptionLayout;
                            if (z15 != z16) {
                                if (z16) {
                                    f16 = 1.0f;
                                } else {
                                    f16 = 0.0f;
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
                        t1Var.U3(iVar.f15027o, iVar.f15028p, iVar.f15029q, iVar.f15030r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f22798v0 && (((isOutOwner = t1Var.getMessageObject().isOutOwner()) && rect.left != t1Var.getBackgroundDrawableLeft()) || ((!isOutOwner && rect.right != t1Var.getBackgroundDrawableRight()) || rect.top != t1Var.getBackgroundDrawableTop() || rect.bottom != t1Var.getBackgroundDrawableBottom()))) {
                    iVar.v = t1Var.getBackgroundDrawableBottom() - rect.bottom;
                    iVar.f15033u = t1Var.getBackgroundDrawableTop() - rect.top;
                    if (t1Var.G8 != transitionParams.E0) {
                        iVar.f15031s = t1Var.getBackgroundDrawableLeft() - rect.left;
                        iVar.f15032t = t1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (isOutOwner) {
                        iVar.f15031s = t1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        iVar.f15032t = t1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    iVar.f15024l = true;
                    transitionParams.f22802w0 = true;
                    transitionParams.f22736g0 = -iVar.f15031s;
                    transitionParams.f22740h0 = -iVar.f15032t;
                    transitionParams.f22750j0 = -iVar.f15033u;
                    transitionParams.f22745i0 = -iVar.v;
                    ll0Var.setClipChildren(false);
                    ll0Var.invalidate();
                }
            } else {
                view = view2;
                i15 = i20;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    ll0 ll0Var2 = (ll0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z17 = true;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i24 < ll0Var2.getChildCount()) {
                        View childAt = ll0Var2.getChildAt(i24);
                        if (childAt instanceof t1) {
                            t1 t1Var3 = (t1) childAt;
                            if (t1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !t1Var3.getMessageObject().deleted) {
                                int backgroundDrawableLeft = t1Var3.getBackgroundDrawableLeft() + t1Var3.getLeft();
                                groupedMessages = currentMessagesGroup;
                                int backgroundDrawableRight = t1Var3.getBackgroundDrawableRight() + t1Var3.getLeft();
                                i17 = i24;
                                int backgroundDrawableTop = t1Var3.getBackgroundDrawableTop() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                int backgroundDrawableBottom = t1Var3.getBackgroundDrawableBottom() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                if (i27 == 0 || backgroundDrawableLeft < i27) {
                                    i27 = backgroundDrawableLeft;
                                }
                                if (i28 == 0 || backgroundDrawableRight > i28) {
                                    i28 = backgroundDrawableRight;
                                }
                                if (t1Var3.getTransitionParams().f22798v0 || transitionParams3.isNewGroup) {
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
                        iVar.f15022j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i29 = (-i25) + transitionParams3.top;
                        iVar.f15019f = i29;
                        int i30 = (-i26) + transitionParams3.bottom;
                        iVar.f15020g = i30;
                        int i31 = (-i27) + transitionParams3.left;
                        iVar.h = i31;
                        int i32 = (-i28) + transitionParams3.right;
                        iVar.f15021i = i32;
                        iVar.f15022j = true;
                        transitionParams3.backgroundChangeBounds = true;
                        transitionParams3.offsetTop = i29;
                        transitionParams3.offsetBottom = i30;
                        transitionParams3.offsetLeft = i31;
                        transitionParams3.offsetRight = i32;
                        if (transitionParams3.drawCaptionLayout) {
                            f15 = 1.0f;
                        } else {
                            f15 = 0.0f;
                        }
                        transitionParams3.captionEnterProgress = f15;
                        ll0Var2.setClipChildren(false);
                        ll0Var2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z17;
                }
            }
            Integer valueOf = Integer.valueOf(t1Var.getMessageObject().getId());
            HashMap hashMap = this.H;
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hashMap.get(valueOf);
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                hashMap.remove(Integer.valueOf(t1Var.getMessageObject().getId()));
                if (transitionParams.f22798v0) {
                    int backgroundDrawableLeft2 = t1Var.getBackgroundDrawableLeft() + t1Var.getLeft();
                    int backgroundDrawableRight2 = t1Var.getBackgroundDrawableRight() + t1Var.getLeft();
                    int backgroundDrawableTop2 = t1Var.getBackgroundDrawableTop() + t1Var.getPaddingTop() + t1Var.getTop();
                    int backgroundDrawableBottom2 = t1Var.getBackgroundDrawableBottom() + t1Var.getPaddingTop() + t1Var.getTop();
                    iVar.f15034w = true;
                    transitionParams.f22802w0 = true;
                    iVar.f15031s = backgroundDrawableLeft2 - transitionParams4.left;
                    iVar.f15032t = backgroundDrawableRight2 - transitionParams4.right;
                    iVar.f15033u = backgroundDrawableTop2 - transitionParams4.top;
                    iVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    iVar.f15024l = false;
                    transitionParams.f22736g0 = (int) ((-i16) - t1Var.getAnimationOffsetX());
                    transitionParams.f22740h0 = (int) ((-iVar.f15032t) - t1Var.getAnimationOffsetX());
                    transitionParams.f22750j0 = (int) ((-iVar.f15033u) - t1Var.getTranslationY());
                    transitionParams.f22745i0 = (int) ((-iVar.v) - t1Var.getTranslationY());
                    transitionParams.C0 = true;
                    ll0Var.setClipChildren(false);
                    ll0Var.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = t1Var.L;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && t1Var.K.isDocuments) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!t1Var.f23004k8 && !t1Var.J && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (transitionParams.f22810y0 != z11) {
                z12 = true;
                iVar.f15023k = true;
                f14 = 0.0f;
                transitionParams.f22814z0 = 0.0f;
            } else {
                f14 = 0.0f;
                z12 = true;
            }
            boolean f21 = transitionParams.f();
            iVar.f15025m = f21;
            if (f21) {
                transitionParams.f22735g = z12;
                transitionParams.K1 = f14;
            }
            if (i15 == 0 && i21 == 0 && !iVar.f15026n && !iVar.f15034w && !iVar.f15022j && !iVar.f15023k && !iVar.f15024l && !f21) {
                v(c1Var);
                return false;
            }
        } else if (w0Var2 != null) {
            v0 transitionParams5 = w0Var2.getTransitionParams();
            transitionParams5.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            if (!transitionParams5.f23352a) {
                a2 = false;
            } else {
                a2 = transitionParams5.d.C0.a();
            }
            iVar.f15025m = a2;
            if (a2) {
                transitionParams5.f23353b = true;
                transitionParams5.f23354c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a2) {
                v(c1Var);
                return false;
            }
        } else if (view2 instanceof h0) {
            ((h0) view2).setAnimating(true);
        } else if (view2 instanceof bb) {
            ((bb) view2).setAnimating(true);
        } else if (i20 == 0 && i21 == 0) {
            v(c1Var);
            return false;
        } else if (i20 != 0) {
            view2.setTranslationX(-i20);
        }
        this.f45806r.add(iVar);
        F();
        return true;
    }

    @Override
    public final void s(c1 c1Var, q0 q0Var) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(c1Var, q0Var);
        View view = c1Var.f45738a;
        if (q0Var != null) {
            int i10 = q0Var.f2261b;
            int top = view.getTop();
            int left = view.getLeft() - q0Var.f2260a;
            int i11 = top - i10;
            if (i11 != 0) {
                view.setTranslationY(-i11);
            }
            if (view instanceof t1) {
                t1 t1Var = (t1) view;
                if (left != 0) {
                    t1Var.setAnimationOffsetX(-left);
                }
                if (q0Var instanceof m) {
                    m mVar = (m) q0Var;
                    t1Var.U3(mVar.f15016c, mVar.d, mVar.f15017e, mVar.f15018f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
