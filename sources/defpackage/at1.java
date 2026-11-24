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
public final class at1 extends cja {
    public long A0;
    public boolean B0;
    public ColorDrawable C0;
    public final mu1 D0;
    public int m0;
    public int n0;
    public int o0;
    public final ArrayList p0;
    public final ArrayList q0;
    public final ArrayList r0;
    public final ArrayList s0;
    public Paint t0;
    public int u0;
    public final ys1 v0;
    public final ys1 w0;
    public final RectF x0;
    public float y0;
    public float z0;

    public at1(mu1 mu1Var, Context context, ui5 ui5Var) {
        super(context, ui5Var);
        this.D0 = mu1Var;
        this.m0 = 0;
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
        this.r0 = new ArrayList();
        this.s0 = new ArrayList();
        this.v0 = new wg5(this) {
            public final at1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(tab tabVar, RectF rectF) {
                byte b = r2;
                tabVar.b = true;
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        mu1 mu1Var2 = this.b.D0;
                        if (mu1Var2.A0.Z0() && mu1Var2.A0.getOverScrollMode() != 2) {
                            mu1Var2.A0.d(canvas, rectF);
                            return;
                        }
                        mu1Var2.A0.z1(canvas, rectF);
                        int i = 0;
                        while (true) {
                            int childCount = mu1Var2.A0.getChildCount();
                            jq1 jq1Var = mu1Var2.A0;
                            if (i < childCount) {
                                View childAt = jq1Var.getChildAt(i);
                                if (!mu1Var2.Na(childAt, rectF)) {
                                    if (childAt instanceof gb2) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        gb2 gb2Var = (gb2) childAt;
                                        if (gb2Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, gb2Var.W);
                                            gb2Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        mu1Var2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        if (gb2Var.l2()) {
                                            canvas.save();
                                            canvas.translate(gb2Var.getX(), gb2Var.getY());
                                            gb2Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else {
                                        boolean z = childAt instanceof uk1;
                                        jq1 jq1Var2 = mu1Var2.A0;
                                        if (z) {
                                            jq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                            canvas.save();
                                            canvas.translate(childAt.getX(), childAt.getY());
                                            ((uk1) childAt).L(canvas);
                                            canvas.restore();
                                        } else {
                                            jq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                        }
                                    }
                                }
                                i++;
                            } else {
                                jq1Var.A1(canvas, rectF);
                                return;
                            }
                        }
                        break;
                    default:
                        at1 at1Var = this.b;
                        mu1 mu1Var3 = at1Var.D0;
                        RectF rectF2 = at1Var.x0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, at1Var.getWidth(), at1Var.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f = mu1Var3.hd.e;
                            int i2 = (int) ((1.0f - f) * 255.0f);
                            int i3 = (int) (255.0f * f);
                            if (f > 0.0f) {
                                canvas.drawRect(rectF2, bkb.l0(bkb.p1(f * 0.85f, mu1Var3.getThemedColor(bkb.c6))));
                            }
                            tk0.b(at1Var.v0, canvas, rectF, mu1Var3.A0, at1Var, i2);
                            fu fuVar = mu1Var3.a4;
                            if (fuVar != null) {
                                tk0.b(fuVar, canvas, rectF, fuVar, at1Var, i3);
                            }
                            vq1 vq1Var = mu1Var3.F1;
                            if (vq1Var != null && vq1Var.getVisibility() == 0) {
                                int childCount2 = mu1Var3.F1.getChildCount();
                                for (int i4 = 0; i4 < childCount2; i4++) {
                                    View childAt2 = mu1Var3.F1.getChildAt(i4);
                                    if ((childAt2 instanceof uu1) && childAt2.getVisibility() == 0) {
                                        at1 at1Var2 = ((uu1) childAt2).a.m1;
                                        tk0.a(at1Var2.w0, canvas, rectF, at1Var2, at1Var);
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
        this.w0 = new wg5(this) {
            public final at1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(tab tabVar, RectF rectF) {
                byte b = r2;
                tabVar.b = true;
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        mu1 mu1Var2 = this.b.D0;
                        if (mu1Var2.A0.Z0() && mu1Var2.A0.getOverScrollMode() != 2) {
                            mu1Var2.A0.d(canvas, rectF);
                            return;
                        }
                        mu1Var2.A0.z1(canvas, rectF);
                        int i = 0;
                        while (true) {
                            int childCount = mu1Var2.A0.getChildCount();
                            jq1 jq1Var = mu1Var2.A0;
                            if (i < childCount) {
                                View childAt = jq1Var.getChildAt(i);
                                if (!mu1Var2.Na(childAt, rectF)) {
                                    if (childAt instanceof gb2) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        gb2 gb2Var = (gb2) childAt;
                                        if (gb2Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, gb2Var.W);
                                            gb2Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        mu1Var2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        if (gb2Var.l2()) {
                                            canvas.save();
                                            canvas.translate(gb2Var.getX(), gb2Var.getY());
                                            gb2Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else {
                                        boolean z = childAt instanceof uk1;
                                        jq1 jq1Var2 = mu1Var2.A0;
                                        if (z) {
                                            jq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                            canvas.save();
                                            canvas.translate(childAt.getX(), childAt.getY());
                                            ((uk1) childAt).L(canvas);
                                            canvas.restore();
                                        } else {
                                            jq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                        }
                                    }
                                }
                                i++;
                            } else {
                                jq1Var.A1(canvas, rectF);
                                return;
                            }
                        }
                        break;
                    default:
                        at1 at1Var = this.b;
                        mu1 mu1Var3 = at1Var.D0;
                        RectF rectF2 = at1Var.x0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, at1Var.getWidth(), at1Var.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f = mu1Var3.hd.e;
                            int i2 = (int) ((1.0f - f) * 255.0f);
                            int i3 = (int) (255.0f * f);
                            if (f > 0.0f) {
                                canvas.drawRect(rectF2, bkb.l0(bkb.p1(f * 0.85f, mu1Var3.getThemedColor(bkb.c6))));
                            }
                            tk0.b(at1Var.v0, canvas, rectF, mu1Var3.A0, at1Var, i2);
                            fu fuVar = mu1Var3.a4;
                            if (fuVar != null) {
                                tk0.b(fuVar, canvas, rectF, fuVar, at1Var, i3);
                            }
                            vq1 vq1Var = mu1Var3.F1;
                            if (vq1Var != null && vq1Var.getVisibility() == 0) {
                                int childCount2 = mu1Var3.F1.getChildCount();
                                for (int i4 = 0; i4 < childCount2; i4++) {
                                    View childAt2 = mu1Var3.F1.getChildAt(i4);
                                    if ((childAt2 instanceof uu1) && childAt2.getVisibility() == 0) {
                                        at1 at1Var2 = ((uu1) childAt2).a.m1;
                                        tk0.a(at1Var2.w0, canvas, rectF, at1Var2, at1Var);
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
        this.I = new zs1(this, this);
    }

    public void setNonNoveTranslation(float f) {
        a aVar;
        int i;
        mu1 mu1Var = this.D0;
        mu1Var.m1.setTranslationY(f);
        aVar = ((d) mu1Var).actionBar;
        aVar.setTranslationY(0.0f);
        sr1 sr1Var = mu1Var.Bb;
        if (sr1Var != null) {
            lr1 lr1Var = mu1Var.D1;
            if (lr1Var != null) {
                i = lr1Var.getCurrentHeight();
            } else {
                i = 0;
            }
            sr1Var.setTranslationY(i);
        }
        je5 je5Var = mu1Var.L1;
        if (je5Var != null) {
            je5Var.setTranslationY(0.0f);
        }
        je5 je5Var2 = mu1Var.K1;
        if (je5Var2 != null) {
            je5Var2.setTranslationY(0.0f);
        }
        mu1Var.f1.setTranslationY(0.0f);
        mu1Var.R.setTranslationY(0.0f);
        mu1Var.T9 = 0.0f;
        mu1Var.U9 = 0.0f;
        mu1Var.m1.setBackgroundTranslation(0);
        q qVar = mu1Var.q3;
        if (qVar != null) {
            qVar.y0 = 0.0f;
            qVar.w.setTranslationY(qVar.z0 + 0.0f);
        }
        s71 s71Var = mu1Var.N2;
        if (s71Var != null) {
            vk0 vk0Var = (vk0) s71Var.b;
            vk0Var.u = 0.0f;
            vk0Var.d.invalidate();
        }
        mu1Var.setFragmentPanTranslationOffset(0);
        mu1Var.G7();
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
        x31 x31Var = this.D0.Y1;
        if (x31Var != null && x31Var.isShowing()) {
            this.f = 0;
            return 0;
        }
        return super.Q();
    }

    @Override
    public final void T(Drawable drawable) {
        boolean z;
        boolean z2;
        mu1 mu1Var = this.D0;
        nqc nqcVar = mu1Var.Y;
        if (drawable instanceof ye7) {
            ((ye7) drawable).o();
        }
        gx4 c = nqcVar.c(drawable);
        float B = gl.B(nqcVar.b(c));
        float B2 = gl.B(nqcVar.a(c));
        int i = 0;
        if (B <= 0.721f) {
            z = true;
        } else {
            z = false;
        }
        mu1Var.hc = z;
        if (B2 <= 0.9f) {
            z2 = true;
        } else {
            z2 = false;
        }
        mu1Var.ic = z2;
        mu1Var.N.a = c;
        lx4 lx4Var = mu1Var.J;
        if (lx4Var != null) {
            Iterator it = lx4Var.w.iterator();
            while (it.hasNext()) {
                gl0 gl0Var = ((il0) it.next()).h0;
                if (gl0Var != null) {
                    gl0Var.h = true;
                }
            }
        }
        lx4 lx4Var2 = mu1Var.K;
        if (lx4Var2 != null) {
            Iterator it2 = lx4Var2.w.iterator();
            while (it2.hasNext()) {
                gl0 gl0Var2 = ((il0) it2.next()).h0;
                if (gl0Var2 != null) {
                    gl0Var2.h = true;
                }
            }
        }
        ry1 ry1Var = mu1Var.Z;
        if (ry1Var != null) {
            if (mu1Var.M7()) {
                i = mu1Var.getThemedColor(bkb.ua);
            }
            ry1Var.setOverlayColor(i);
            mu1Var.Z.invalidate();
        }
        j92 j92Var = mu1Var.U;
        if (j92Var != null) {
            j92Var.invalidate();
        }
        mu1Var.m1.invalidate();
        Iterator it3 = mu1Var.F.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        mu1Var.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f, gb2 gb2Var, int i) {
        float f2;
        int save = canvas.save();
        mu1 mu1Var = this.D0;
        float x = gb2Var.getX() + mu1Var.A0.getLeft();
        float y = gb2Var.getY() + mu1Var.A0.getY() + gb2Var.getPaddingTop();
        if (gb2Var.a()) {
            f2 = gb2Var.getAlpha();
        } else {
            f2 = 1.0f;
        }
        canvas.clipRect(mu1Var.A0.getLeft(), f, mu1Var.A0.getRight(), ((((mu1Var.A0.getY() + mu1Var.A0.getMeasuredHeight()) - mu1Var.Ya) - mu1Var.w.e()) - mu1Var.bd) - gl.L(9.0f));
        canvas.translate(x, y);
        boolean z = true;
        gb2Var.setInvalidatesParent(true);
        if (i == 0) {
            gb2Var.A1(f2, canvas, true);
        } else if (i == 1) {
            gb2Var.h1(canvas, f2);
        } else if (i == 2) {
            if (gb2Var.getCurrentPosition() == null || (gb2Var.getCurrentPosition().l & 1) != 0) {
                z = false;
            }
            gb2Var.Q0(f2, canvas, z);
        } else if (i == 3) {
            if (gb2Var.getCurrentPosition() == null || (gb2Var.getCurrentPosition().l & 1) != 0) {
                z = false;
            }
            gb2Var.V0(canvas, f2);
            if (!z) {
                gb2Var.q1(canvas, f2, null);
            }
        } else if (i == 4 && ((gb2Var.getCurrentPosition() == null || (gb2Var.getCurrentPosition().l & 1) != 0) && mu1Var.c9 != null)) {
            float f3 = (mu1Var.X8 * mu1Var.a9) / 0.2f;
            canvas.save();
            gb2Var.u1(canvas, mu1Var.c9, f3, mu1Var.Y8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x, y);
            gb2Var.v1(this, canvas, mu1Var.d9, mu1Var.c9, f3);
            canvas.restore();
        }
        gb2Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean Z(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at1.Z(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final boolean a0(View view) {
        if (view != this.M) {
            mu1 mu1Var = this.D0;
            if (view != mu1Var.N2 && view != mu1Var.F1 && view != mu1Var.J9 && view != mu1Var.Z && view != mu1Var.Z3 && view != mu1Var.n0 && !(view instanceof zha)) {
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
        mu1 mu1Var = this.D0;
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var != null && view == ar1Var.n0) {
            ry1 ry1Var = mu1Var.Z;
            if (ry1Var != null) {
                i2 = indexOfChild(ry1Var);
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
        ar1 ar1Var2 = mu1Var.a0;
        if (ar1Var2 != null && view == ar1Var2.n0) {
            ap0 ap0Var = (ap0) view;
            ap0Var.setBackgroundDrawable(mu1Var.L.c(ap0Var.c, mu1Var.E, false));
        }
        ar1 ar1Var3 = mu1Var.a0;
        if (ar1Var3 != null && view == (lVar = ar1Var3.E2)) {
            lVar.setBlurredBackgroundFactory(mu1Var.L);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        wr1 wr1Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (wr1Var = this.D0.cb) != null && wr1Var.s) {
            wr1Var.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        mu1 mu1Var = this.D0;
        lwb lwbVar = mu1Var.n0;
        if (view != lwbVar && view != this.M && view != mu1Var.Z && !(view instanceof zha) && lwbVar != null) {
            f = lwbVar.getProgress() * mu1Var.n0.getContentWidth();
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

    public mu1 getChatActivity() {
        return this.D0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.D0.getThemedColor(bkb.ta);
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
        mu1 mu1Var = this.D0;
        if (mu1Var.M7()) {
            return getCompactBackground();
        }
        Drawable l = mu1Var.Ba.l();
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
        ui5 ui5Var;
        ui5 ui5Var2;
        ui5 ui5Var3;
        jq1 jq1Var;
        super.onAttachedToWindow();
        mu1 mu1Var = this.D0;
        if (!mu1Var.mb) {
            ui5Var = ((d) mu1Var).parentLayout;
            if (ui5Var != null) {
                ui5Var2 = ((d) mu1Var).parentLayout;
                if (((ActionBarLayout) ui5Var2).b) {
                    gb gbVar = this.I;
                    ui5Var3 = ((d) mu1Var).parentLayout;
                    gbVar.b = (FrameLayout) ui5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.I.b = mu1Var.m1;
        }
        this.I.c();
        mu1Var.a0.setAdjustPanLayoutHelper(this.I);
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null && ((k27Var.g4() || k27.K4(k27Var.k)) && k27Var.T == 0 && k27.B0(k27Var.k) == mu1Var.l6)) {
            MediaController.w().o0(mu1Var.X5(false), mu1Var.L8, mu1Var.J8, true);
        }
        kc2 kc2Var = mu1Var.ma;
        if (kc2Var != null) {
            kc2Var.G.I();
            vl vlVar = kc2Var.l0;
            if (vlVar != null && (jq1Var = kc2Var.b0) != null) {
                vlVar.b(jq1Var);
            }
            kk7.f(kc2Var.f0).b(kc2Var, 2);
        }
        mu1Var.Ua.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        jq1 jq1Var;
        super.onDetachedFromWindow();
        this.I.d();
        mu1 mu1Var = this.D0;
        kc2 kc2Var = mu1Var.ma;
        if (kc2Var != null) {
            kk7.f(kc2Var.f0).n(kc2Var, 2);
            kc2Var.G.K();
            vl vlVar = kc2Var.l0;
            if (vlVar != null && (jq1Var = kc2Var.b0) != null) {
                vlVar.o(jq1Var);
            }
            kc2Var.R = 0.0f;
            kc2Var.Q = 0L;
            mu1Var.ma = null;
        }
        mu1Var.Ua.j();
        gl.c3(new jc((byte) 17));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        mu1 mu1Var;
        s71 s71Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (s71Var = (mu1Var = this.D0).N2) != null && s71Var.a() && mu1Var.N2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at1.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mu1 mu1Var = this.D0;
        tk0.c(mu1Var.P8, mu1Var.fragmentView);
        mu1Var.Q8.d();
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
        mu1 mu1Var = this.D0;
        mu1Var.S9 = i2;
        mu1Var.G7();
        mu1Var.I7();
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
