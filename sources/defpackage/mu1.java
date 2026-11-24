package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.l;
import org.telegram.ui.Components.q;
public final class mu1 extends ela {
    public long A0;
    public boolean B0;
    public ColorDrawable C0;
    public final yv1 D0;
    public int m0;
    public int n0;
    public int o0;
    public final ArrayList p0;
    public final ArrayList q0;
    public final ArrayList r0;
    public final ArrayList s0;
    public Paint t0;
    public int u0;
    public final ku1 v0;
    public final ku1 w0;
    public final RectF x0;
    public float y0;
    public float z0;

    public mu1(yv1 yv1Var, Context context, tk5 tk5Var) {
        super(context, tk5Var);
        this.D0 = yv1Var;
        this.m0 = 0;
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
        this.r0 = new ArrayList();
        this.s0 = new ArrayList();
        this.v0 = new vi5(this) {
            public final mu1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(ucb ucbVar, RectF rectF) {
                byte b = r2;
                ucbVar.b = true;
            }

            @Override
            public final void g(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        yv1 yv1Var2 = this.b.D0;
                        if (yv1Var2.A0.Z0() && yv1Var2.A0.getOverScrollMode() != 2) {
                            yv1Var2.A0.g(canvas, rectF);
                            return;
                        }
                        yv1Var2.A0.z1(canvas, rectF);
                        int i = 0;
                        while (true) {
                            int childCount = yv1Var2.A0.getChildCount();
                            vr1 vr1Var = yv1Var2.A0;
                            if (i < childCount) {
                                View childAt = vr1Var.getChildAt(i);
                                if (!yv1Var2.Xa(childAt, rectF)) {
                                    if (childAt instanceof rc2) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        rc2 rc2Var = (rc2) childAt;
                                        if (rc2Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, rc2Var.W);
                                            rc2Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        yv1Var2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        if (rc2Var.l2()) {
                                            canvas.save();
                                            canvas.translate(rc2Var.getX(), rc2Var.getY());
                                            rc2Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else {
                                        boolean z = childAt instanceof cm1;
                                        vr1 vr1Var2 = yv1Var2.A0;
                                        if (z) {
                                            vr1Var2.drawChild(canvas, childAt, uptimeMillis);
                                            canvas.save();
                                            canvas.translate(childAt.getX(), childAt.getY());
                                            ((cm1) childAt).H(canvas);
                                            canvas.restore();
                                        } else {
                                            vr1Var2.drawChild(canvas, childAt, uptimeMillis);
                                        }
                                    }
                                }
                                i++;
                            } else {
                                vr1Var.A1(canvas, rectF);
                                return;
                            }
                        }
                        break;
                    default:
                        mu1 mu1Var = this.b;
                        yv1 yv1Var3 = mu1Var.D0;
                        RectF rectF2 = mu1Var.x0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, mu1Var.getWidth(), mu1Var.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f = yv1Var3.rd.e;
                            int i2 = (int) ((1.0f - f) * 255.0f);
                            int i3 = (int) (255.0f * f);
                            if (f > 0.0f) {
                                canvas.drawRect(rectF2, cmb.l0(cmb.p1(f * 0.85f, yv1Var3.getThemedColor(cmb.c6))));
                            }
                            tl0.b(mu1Var.v0, canvas, rectF, yv1Var3.A0, mu1Var, i2);
                            fv fvVar = yv1Var3.a4;
                            if (fvVar != null) {
                                tl0.b(fvVar, canvas, rectF, fvVar, mu1Var, i3);
                            }
                            hs1 hs1Var = yv1Var3.F1;
                            if (hs1Var != null && hs1Var.getVisibility() == 0) {
                                int childCount2 = yv1Var3.F1.getChildCount();
                                for (int i4 = 0; i4 < childCount2; i4++) {
                                    View childAt2 = yv1Var3.F1.getChildAt(i4);
                                    if ((childAt2 instanceof gw1) && childAt2.getVisibility() == 0) {
                                        mu1 mu1Var2 = ((gw1) childAt2).a.m1;
                                        tl0.a(mu1Var2.w0, canvas, rectF, mu1Var2, mu1Var);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.w0 = new vi5(this) {
            public final mu1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(ucb ucbVar, RectF rectF) {
                byte b = r2;
                ucbVar.b = true;
            }

            @Override
            public final void g(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        yv1 yv1Var2 = this.b.D0;
                        if (yv1Var2.A0.Z0() && yv1Var2.A0.getOverScrollMode() != 2) {
                            yv1Var2.A0.g(canvas, rectF);
                            return;
                        }
                        yv1Var2.A0.z1(canvas, rectF);
                        int i = 0;
                        while (true) {
                            int childCount = yv1Var2.A0.getChildCount();
                            vr1 vr1Var = yv1Var2.A0;
                            if (i < childCount) {
                                View childAt = vr1Var.getChildAt(i);
                                if (!yv1Var2.Xa(childAt, rectF)) {
                                    if (childAt instanceof rc2) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        rc2 rc2Var = (rc2) childAt;
                                        if (rc2Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, rc2Var.W);
                                            rc2Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        yv1Var2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        if (rc2Var.l2()) {
                                            canvas.save();
                                            canvas.translate(rc2Var.getX(), rc2Var.getY());
                                            rc2Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else {
                                        boolean z = childAt instanceof cm1;
                                        vr1 vr1Var2 = yv1Var2.A0;
                                        if (z) {
                                            vr1Var2.drawChild(canvas, childAt, uptimeMillis);
                                            canvas.save();
                                            canvas.translate(childAt.getX(), childAt.getY());
                                            ((cm1) childAt).H(canvas);
                                            canvas.restore();
                                        } else {
                                            vr1Var2.drawChild(canvas, childAt, uptimeMillis);
                                        }
                                    }
                                }
                                i++;
                            } else {
                                vr1Var.A1(canvas, rectF);
                                return;
                            }
                        }
                        break;
                    default:
                        mu1 mu1Var = this.b;
                        yv1 yv1Var3 = mu1Var.D0;
                        RectF rectF2 = mu1Var.x0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, mu1Var.getWidth(), mu1Var.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f = yv1Var3.rd.e;
                            int i2 = (int) ((1.0f - f) * 255.0f);
                            int i3 = (int) (255.0f * f);
                            if (f > 0.0f) {
                                canvas.drawRect(rectF2, cmb.l0(cmb.p1(f * 0.85f, yv1Var3.getThemedColor(cmb.c6))));
                            }
                            tl0.b(mu1Var.v0, canvas, rectF, yv1Var3.A0, mu1Var, i2);
                            fv fvVar = yv1Var3.a4;
                            if (fvVar != null) {
                                tl0.b(fvVar, canvas, rectF, fvVar, mu1Var, i3);
                            }
                            hs1 hs1Var = yv1Var3.F1;
                            if (hs1Var != null && hs1Var.getVisibility() == 0) {
                                int childCount2 = yv1Var3.F1.getChildCount();
                                for (int i4 = 0; i4 < childCount2; i4++) {
                                    View childAt2 = yv1Var3.F1.getChildAt(i4);
                                    if ((childAt2 instanceof gw1) && childAt2.getVisibility() == 0) {
                                        mu1 mu1Var2 = ((gw1) childAt2).a.m1;
                                        tl0.a(mu1Var2.w0, canvas, rectF, mu1Var2, mu1Var);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.x0 = new RectF();
        this.I = new lu1(this, this);
    }

    public void setNonNoveTranslation(float f) {
        a aVar;
        int i;
        yv1 yv1Var = this.D0;
        yv1Var.m1.setTranslationY(f);
        aVar = ((d) yv1Var).actionBar;
        aVar.setTranslationY(0.0f);
        ft1 ft1Var = yv1Var.Jb;
        if (ft1Var != null) {
            ys1 ys1Var = yv1Var.D1;
            if (ys1Var != null) {
                i = ys1Var.getCurrentHeight();
            } else {
                i = 0;
            }
            ft1Var.setTranslationY(i);
        }
        hg5 hg5Var = yv1Var.L1;
        if (hg5Var != null) {
            hg5Var.setTranslationY(0.0f);
        }
        hg5 hg5Var2 = yv1Var.K1;
        if (hg5Var2 != null) {
            hg5Var2.setTranslationY(0.0f);
        }
        yv1Var.f1.setTranslationY(0.0f);
        yv1Var.R.setTranslationY(0.0f);
        yv1Var.T9 = 0.0f;
        yv1Var.U9 = 0.0f;
        yv1Var.m1.setBackgroundTranslation(0);
        q qVar = yv1Var.q3;
        if (qVar != null) {
            qVar.y0 = 0.0f;
            qVar.w.setTranslationY(qVar.z0 + 0.0f);
        }
        a91 a91Var = yv1Var.N2;
        if (a91Var != null) {
            vl0 vl0Var = (vl0) a91Var.b;
            vl0Var.u = 0.0f;
            vl0Var.d.invalidate();
        }
        yv1Var.setFragmentPanTranslationOffset(0);
        yv1Var.O7();
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final int Q() {
        e51 e51Var = this.D0.Y1;
        if (e51Var != null && e51Var.isShowing()) {
            this.f = 0;
            return 0;
        }
        return super.Q();
    }

    @Override
    public final void T(Drawable drawable) {
        boolean z;
        boolean z2;
        yv1 yv1Var = this.D0;
        psc pscVar = yv1Var.Y;
        if (drawable instanceof ah7) {
            ((ah7) drawable).o();
        }
        iz4 c = pscVar.c(drawable);
        float B = gm.B(pscVar.b(c));
        float B2 = gm.B(pscVar.a(c));
        int i = 0;
        if (B <= 0.721f) {
            z = true;
        } else {
            z = false;
        }
        yv1Var.rc = z;
        if (B2 <= 0.9f) {
            z2 = true;
        } else {
            z2 = false;
        }
        yv1Var.sc = z2;
        yv1Var.N.a = c;
        nz4 nz4Var = yv1Var.J;
        if (nz4Var != null) {
            Iterator it = nz4Var.w.iterator();
            while (it.hasNext()) {
                gm0 gm0Var = ((im0) it.next()).h0;
                if (gm0Var != null) {
                    gm0Var.h = true;
                }
            }
        }
        nz4 nz4Var2 = yv1Var.K;
        if (nz4Var2 != null) {
            Iterator it2 = nz4Var2.w.iterator();
            while (it2.hasNext()) {
                gm0 gm0Var2 = ((im0) it2.next()).h0;
                if (gm0Var2 != null) {
                    gm0Var2.h = true;
                }
            }
        }
        e02 e02Var = yv1Var.Z;
        if (e02Var != null) {
            if (yv1Var.U7()) {
                i = yv1Var.getThemedColor(cmb.ua);
            }
            e02Var.setOverlayColor(i);
            yv1Var.Z.invalidate();
        }
        va2 va2Var = yv1Var.U;
        if (va2Var != null) {
            va2Var.invalidate();
        }
        yv1Var.m1.invalidate();
        Iterator it3 = yv1Var.F.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        yv1Var.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f, rc2 rc2Var, int i) {
        float f2;
        int save = canvas.save();
        yv1 yv1Var = this.D0;
        float x = rc2Var.getX() + yv1Var.A0.getLeft();
        float y = rc2Var.getY() + yv1Var.A0.getY() + rc2Var.getPaddingTop();
        if (rc2Var.a()) {
            f2 = rc2Var.getAlpha();
        } else {
            f2 = 1.0f;
        }
        canvas.clipRect(yv1Var.A0.getLeft(), f, yv1Var.A0.getRight(), ((((yv1Var.A0.getY() + yv1Var.A0.getMeasuredHeight()) - yv1Var.Ya) - yv1Var.w.e()) - yv1Var.ld) - gm.L(9.0f));
        canvas.translate(x, y);
        boolean z = true;
        rc2Var.setInvalidatesParent(true);
        if (i == 0) {
            rc2Var.A1(f2, canvas, true);
        } else if (i == 1) {
            rc2Var.h1(canvas, f2);
        } else if (i == 2) {
            if (rc2Var.getCurrentPosition() == null || (rc2Var.getCurrentPosition().l & 1) != 0) {
                z = false;
            }
            rc2Var.Q0(f2, canvas, z);
        } else if (i == 3) {
            if (rc2Var.getCurrentPosition() == null || (rc2Var.getCurrentPosition().l & 1) != 0) {
                z = false;
            }
            rc2Var.V0(canvas, f2);
            if (!z) {
                rc2Var.q1(canvas, f2, null);
            }
        } else if (i == 4 && ((rc2Var.getCurrentPosition() == null || (rc2Var.getCurrentPosition().l & 1) != 0) && yv1Var.c9 != null)) {
            float f3 = (yv1Var.X8 * yv1Var.a9) / 0.2f;
            canvas.save();
            rc2Var.u1(canvas, yv1Var.c9, f3, yv1Var.Y8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x, y);
            rc2Var.v1(this, canvas, yv1Var.d9, yv1Var.c9, f3);
            canvas.restore();
        }
        rc2Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean Z(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.Z(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final boolean a0(View view) {
        if (view != this.M) {
            yv1 yv1Var = this.D0;
            if (view != yv1Var.N2 && view != yv1Var.F1 && view != yv1Var.J9 && view != yv1Var.Z && view != yv1Var.Z3 && view != yv1Var.n0 && !(view instanceof bka)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        l lVar;
        int i2;
        yv1 yv1Var = this.D0;
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var != null && view == ms1Var.n0) {
            e02 e02Var = yv1Var.Z;
            if (e02Var != null) {
                i2 = indexOfChild(e02Var);
            } else {
                i2 = -1;
            }
            if (i2 >= 0) {
                i = i2;
            }
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
        ms1 ms1Var2 = yv1Var.a0;
        if (ms1Var2 != null && view == ms1Var2.n0) {
            aq0 aq0Var = (aq0) view;
            aq0Var.setBackgroundDrawable(yv1Var.L.c(aq0Var.c, yv1Var.E, false));
        }
        ms1 ms1Var3 = yv1Var.a0;
        if (ms1Var3 != null && view == (lVar = ms1Var3.E2)) {
            lVar.setBlurredBackgroundFactory(yv1Var.L);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        yv1 yv1Var = this.D0;
        if (yv1Var.c4 != null && motionEvent.getActionMasked() == 8) {
            yv1Var.c4.f();
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        jt1 jt1Var;
        yv1 yv1Var = this.D0;
        n02 n02Var = yv1Var.c4;
        if (n02Var != null) {
            n02Var.f();
        }
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (jt1Var = yv1Var.cb) != null && jt1Var.s) {
            jt1Var.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        yv1 yv1Var = this.D0;
        oyb oybVar = yv1Var.n0;
        if (view != oybVar && view != this.M && view != yv1Var.Z && !(view instanceof bka) && oybVar != null) {
            f = oybVar.getProgress() * yv1Var.n0.getContentWidth();
        } else {
            f = 0.0f;
        }
        if (f <= 0.0f) {
            return Z(canvas, view, j);
        }
        canvas.save();
        canvas.translate(-f, 0.0f);
        boolean Z = Z(canvas, view, j);
        canvas.restore();
        return Z;
    }

    @Override
    public float getBottomOffset() {
        return this.D0.A0.getBottom();
    }

    public yv1 getChatActivity() {
        return this.D0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.D0.getThemedColor(cmb.ta);
        ColorDrawable colorDrawable = this.C0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.C0 = new ColorDrawable(themedColor);
        }
        return this.C0;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.D0.mb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.D0.A0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        yv1 yv1Var = this.D0;
        if (yv1Var.U7()) {
            return getCompactBackground();
        }
        Drawable l = yv1Var.Ba.l();
        if (l != null) {
            return l;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.D0.Ba.g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        if (wallPaperSettings != null && wallPaperSettings.motion) {
            return true;
        }
        return false;
    }

    @Override
    public int getScrollOffset() {
        return this.D0.A0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        tk5 tk5Var;
        tk5 tk5Var2;
        tk5 tk5Var3;
        vr1 vr1Var;
        super.onAttachedToWindow();
        yv1 yv1Var = this.D0;
        if (!yv1Var.mb) {
            tk5Var = ((d) yv1Var).parentLayout;
            if (tk5Var != null) {
                tk5Var2 = ((d) yv1Var).parentLayout;
                if (((ActionBarLayout) tk5Var2).b) {
                    gb gbVar = this.I;
                    tk5Var3 = ((d) yv1Var).parentLayout;
                    gbVar.b = (FrameLayout) tk5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.I.b = yv1Var.m1;
        }
        this.I.c();
        yv1Var.a0.setAdjustPanLayoutHelper(this.I);
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null && ((k47Var.g4() || k47.K4(k47Var.k)) && k47Var.T == 0 && k47.B0(k47Var.k) == yv1Var.l6)) {
            MediaController.w().o0(yv1Var.e6(false), yv1Var.L8, yv1Var.J8, true);
        }
        vd2 vd2Var = yv1Var.ma;
        if (vd2Var != null) {
            vd2Var.G.I();
            vm vmVar = vd2Var.l0;
            if (vmVar != null && (vr1Var = vd2Var.b0) != null) {
                vmVar.b(vr1Var);
            }
            nm7.f(vd2Var.f0).b(vd2Var, 2);
        }
        yv1Var.Ua.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        vr1 vr1Var;
        super.onDetachedFromWindow();
        this.I.d();
        yv1 yv1Var = this.D0;
        vd2 vd2Var = yv1Var.ma;
        if (vd2Var != null) {
            nm7.f(vd2Var.f0).n(vd2Var, 2);
            vd2Var.G.K();
            vm vmVar = vd2Var.l0;
            if (vmVar != null && (vr1Var = vd2Var.b0) != null) {
                vmVar.o(vr1Var);
            }
            vd2Var.R = 0.0f;
            vd2Var.Q = 0L;
            yv1Var.ma = null;
        }
        yv1Var.Ua.j();
        gm.c3(new jd((byte) 17));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        yv1 yv1Var;
        a91 a91Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (a91Var = (yv1Var = this.D0).N2) != null && a91Var.a() && yv1Var.N2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        yv1 yv1Var = this.D0;
        tl0.c(yv1Var.P8, yv1Var.fragmentView);
        yv1Var.Q8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.D0.T4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i, int i2, int i3, int i4) {
        yv1 yv1Var = this.D0;
        yv1Var.S9 = i2;
        yv1Var.O7();
        yv1Var.Q7();
    }

    @Override
    public final void K() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
    }
}
