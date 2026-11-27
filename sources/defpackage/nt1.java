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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.l;
import org.telegram.ui.Components.q;
public final class nt1 extends wma {
    public int g0;
    public int h0;
    public int i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final ArrayList l0;
    public final ArrayList m0;
    public Paint n0;
    public int o0;
    public final lt1 p0;
    public final lt1 q0;
    public final RectF r0;
    public float s0;
    public float t0;
    public long u0;
    public boolean v0;
    public ColorDrawable w0;
    public final zu1 x0;

    public nt1(zu1 zu1Var, Context context, wk5 wk5Var) {
        super(context, wk5Var);
        this.x0 = zu1Var;
        this.g0 = 0;
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new ArrayList();
        this.m0 = new ArrayList();
        this.p0 = new yi5(this) {
            public final nt1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(qeb qebVar, RectF rectF) {
                byte b = r2;
                qebVar.b = true;
            }

            @Override
            public final void g(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        zu1 zu1Var2 = this.b.x0;
                        if (zu1Var2.A0.a1() && zu1Var2.A0.getOverScrollMode() != 2) {
                            zu1Var2.A0.g(canvas, rectF);
                            return;
                        }
                        zu1Var2.A0.A1(canvas, rectF);
                        int i = 0;
                        while (true) {
                            int childCount = zu1Var2.A0.getChildCount();
                            wq1 wq1Var = zu1Var2.A0;
                            if (i < childCount) {
                                View childAt = wq1Var.getChildAt(i);
                                if (!zu1Var2.Ya(childAt, rectF)) {
                                    if (childAt instanceof wb2) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        wb2 wb2Var = (wb2) childAt;
                                        if (wb2Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, wb2Var.W);
                                            wb2Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        zu1Var2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        if (wb2Var.l2()) {
                                            canvas.save();
                                            canvas.translate(wb2Var.getX(), wb2Var.getY());
                                            wb2Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else {
                                        boolean z = childAt instanceof dl1;
                                        wq1 wq1Var2 = zu1Var2.A0;
                                        if (z) {
                                            wq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                            canvas.save();
                                            canvas.translate(childAt.getX(), childAt.getY());
                                            ((dl1) childAt).K(canvas);
                                            canvas.restore();
                                        } else {
                                            wq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                        }
                                    }
                                }
                                i++;
                            } else {
                                wq1Var.B1(canvas, rectF);
                                return;
                            }
                        }
                        break;
                    default:
                        nt1 nt1Var = this.b;
                        zu1 zu1Var3 = nt1Var.x0;
                        RectF rectF2 = nt1Var.r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, nt1Var.getWidth(), nt1Var.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f = zu1Var3.ud.e;
                            int i2 = (int) ((1.0f - f) * 255.0f);
                            int i3 = (int) (255.0f * f);
                            if (f > 0.0f) {
                                canvas.drawRect(rectF2, aob.l0(aob.p1(f * 0.85f, zu1Var3.getThemedColor(aob.d6))));
                            }
                            uk0.b(nt1Var.p0, canvas, rectF, zu1Var3.A0, nt1Var, i2);
                            gu guVar = zu1Var3.a4;
                            if (guVar != null) {
                                uk0.b(guVar, canvas, rectF, guVar, nt1Var, i3);
                            }
                            ir1 ir1Var = zu1Var3.F1;
                            if (ir1Var != null && ir1Var.getVisibility() == 0) {
                                int childCount2 = zu1Var3.F1.getChildCount();
                                for (int i4 = 0; i4 < childCount2; i4++) {
                                    View childAt2 = zu1Var3.F1.getChildAt(i4);
                                    if ((childAt2 instanceof hv1) && childAt2.getVisibility() == 0) {
                                        nt1 nt1Var2 = ((hv1) childAt2).a.m1;
                                        uk0.a(nt1Var2.q0, canvas, rectF, nt1Var2, nt1Var);
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
        this.q0 = new yi5(this) {
            public final nt1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(qeb qebVar, RectF rectF) {
                byte b = r2;
                qebVar.b = true;
            }

            @Override
            public final void g(Canvas canvas, RectF rectF) {
                switch (r2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        zu1 zu1Var2 = this.b.x0;
                        if (zu1Var2.A0.a1() && zu1Var2.A0.getOverScrollMode() != 2) {
                            zu1Var2.A0.g(canvas, rectF);
                            return;
                        }
                        zu1Var2.A0.A1(canvas, rectF);
                        int i = 0;
                        while (true) {
                            int childCount = zu1Var2.A0.getChildCount();
                            wq1 wq1Var = zu1Var2.A0;
                            if (i < childCount) {
                                View childAt = wq1Var.getChildAt(i);
                                if (!zu1Var2.Ya(childAt, rectF)) {
                                    if (childAt instanceof wb2) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        wb2 wb2Var = (wb2) childAt;
                                        if (wb2Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, wb2Var.W);
                                            wb2Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        zu1Var2.A0.drawChild(canvas, childAt, uptimeMillis);
                                        if (wb2Var.l2()) {
                                            canvas.save();
                                            canvas.translate(wb2Var.getX(), wb2Var.getY());
                                            wb2Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else {
                                        boolean z = childAt instanceof dl1;
                                        wq1 wq1Var2 = zu1Var2.A0;
                                        if (z) {
                                            wq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                            canvas.save();
                                            canvas.translate(childAt.getX(), childAt.getY());
                                            ((dl1) childAt).K(canvas);
                                            canvas.restore();
                                        } else {
                                            wq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                        }
                                    }
                                }
                                i++;
                            } else {
                                wq1Var.B1(canvas, rectF);
                                return;
                            }
                        }
                        break;
                    default:
                        nt1 nt1Var = this.b;
                        zu1 zu1Var3 = nt1Var.x0;
                        RectF rectF2 = nt1Var.r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, nt1Var.getWidth(), nt1Var.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f = zu1Var3.ud.e;
                            int i2 = (int) ((1.0f - f) * 255.0f);
                            int i3 = (int) (255.0f * f);
                            if (f > 0.0f) {
                                canvas.drawRect(rectF2, aob.l0(aob.p1(f * 0.85f, zu1Var3.getThemedColor(aob.d6))));
                            }
                            uk0.b(nt1Var.p0, canvas, rectF, zu1Var3.A0, nt1Var, i2);
                            gu guVar = zu1Var3.a4;
                            if (guVar != null) {
                                uk0.b(guVar, canvas, rectF, guVar, nt1Var, i3);
                            }
                            ir1 ir1Var = zu1Var3.F1;
                            if (ir1Var != null && ir1Var.getVisibility() == 0) {
                                int childCount2 = zu1Var3.F1.getChildCount();
                                for (int i4 = 0; i4 < childCount2; i4++) {
                                    View childAt2 = zu1Var3.F1.getChildAt(i4);
                                    if ((childAt2 instanceof hv1) && childAt2.getVisibility() == 0) {
                                        nt1 nt1Var2 = ((hv1) childAt2).a.m1;
                                        uk0.a(nt1Var2.q0, canvas, rectF, nt1Var2, nt1Var);
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
        this.r0 = new RectF();
        this.I = new mt1(this, this);
    }

    public void setNonNoveTranslation(float f) {
        a aVar;
        int i;
        zu1 zu1Var = this.x0;
        zu1Var.m1.setTranslationY(f);
        aVar = ((e) zu1Var).actionBar;
        aVar.setTranslationY(0.0f);
        gs1 gs1Var = zu1Var.Mb;
        if (gs1Var != null) {
            zr1 zr1Var = zu1Var.D1;
            if (zr1Var != null) {
                i = zr1Var.getCurrentHeight();
            } else {
                i = 0;
            }
            gs1Var.setTranslationY(i);
        }
        kg5 kg5Var = zu1Var.L1;
        if (kg5Var != null) {
            kg5Var.setTranslationY(0.0f);
        }
        kg5 kg5Var2 = zu1Var.K1;
        if (kg5Var2 != null) {
            kg5Var2.setTranslationY(0.0f);
        }
        zu1Var.f1.setTranslationY(0.0f);
        zu1Var.R.setTranslationY(0.0f);
        zu1Var.T9 = 0.0f;
        zu1Var.U9 = 0.0f;
        zu1Var.m1.setBackgroundTranslation(0);
        q qVar = zu1Var.q3;
        if (qVar != null) {
            qVar.y0 = 0.0f;
            qVar.w.setTranslationY(qVar.z0 + 0.0f);
        }
        a81 a81Var = zu1Var.N2;
        if (a81Var != null) {
            wk0 wk0Var = (wk0) a81Var.b;
            wk0Var.u = 0.0f;
            wk0Var.d.invalidate();
        }
        zu1Var.setFragmentPanTranslationOffset(0);
        zu1Var.O7();
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
        f41 f41Var = this.x0.Y1;
        if (f41Var != null && f41Var.isShowing()) {
            this.f = 0;
            return 0;
        }
        return super.Q();
    }

    @Override
    public final void T(Drawable drawable) {
        boolean z;
        boolean z2;
        zu1 zu1Var = this.x0;
        bvc bvcVar = zu1Var.Y;
        if (drawable instanceof hh7) {
            ((hh7) drawable).o();
        }
        mz4 c = bvcVar.c(drawable);
        float B = hl.B(bvcVar.b(c));
        float B2 = hl.B(bvcVar.a(c));
        int i = 0;
        if (B <= 0.721f) {
            z = true;
        } else {
            z = false;
        }
        zu1Var.sc = z;
        if (B2 <= 0.9f) {
            z2 = true;
        } else {
            z2 = false;
        }
        zu1Var.tc = z2;
        zu1Var.N.a = c;
        rz4 rz4Var = zu1Var.J;
        if (rz4Var != null) {
            Iterator it = rz4Var.w.iterator();
            while (it.hasNext()) {
                hl0 hl0Var = ((jl0) it.next()).h0;
                if (hl0Var != null) {
                    hl0Var.h = true;
                }
            }
        }
        rz4 rz4Var2 = zu1Var.K;
        if (rz4Var2 != null) {
            Iterator it2 = rz4Var2.w.iterator();
            while (it2.hasNext()) {
                hl0 hl0Var2 = ((jl0) it2.next()).h0;
                if (hl0Var2 != null) {
                    hl0Var2.h = true;
                }
            }
        }
        jz1 jz1Var = zu1Var.Z;
        if (jz1Var != null) {
            if (zu1Var.U7()) {
                i = zu1Var.getThemedColor(aob.va);
            }
            jz1Var.setOverlayColor(i);
            zu1Var.Z.invalidate();
        }
        z92 z92Var = zu1Var.U;
        if (z92Var != null) {
            z92Var.invalidate();
        }
        zu1Var.m1.invalidate();
        Iterator it3 = zu1Var.F.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        zu1Var.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f, wb2 wb2Var, int i) {
        float f2;
        int save = canvas.save();
        zu1 zu1Var = this.x0;
        float x = wb2Var.getX() + zu1Var.A0.getLeft();
        float y = wb2Var.getY() + zu1Var.A0.getY() + wb2Var.getPaddingTop();
        if (wb2Var.a()) {
            f2 = wb2Var.getAlpha();
        } else {
            f2 = 1.0f;
        }
        canvas.clipRect(zu1Var.A0.getLeft(), f, zu1Var.A0.getRight(), ((((zu1Var.A0.getY() + zu1Var.A0.getMeasuredHeight()) - zu1Var.Ya) - zu1Var.w.e()) - zu1Var.od) - hl.L(9.0f));
        canvas.translate(x, y);
        boolean z = true;
        wb2Var.setInvalidatesParent(true);
        if (i == 0) {
            wb2Var.A1(f2, canvas, true);
        } else if (i == 1) {
            wb2Var.h1(canvas, f2);
        } else if (i == 2) {
            if (wb2Var.getCurrentPosition() == null || (wb2Var.getCurrentPosition().l & 1) != 0) {
                z = false;
            }
            wb2Var.Q0(f2, canvas, z);
        } else if (i == 3) {
            if (wb2Var.getCurrentPosition() == null || (wb2Var.getCurrentPosition().l & 1) != 0) {
                z = false;
            }
            wb2Var.V0(canvas, f2);
            if (!z) {
                wb2Var.q1(canvas, f2, null);
            }
        } else if (i == 4 && ((wb2Var.getCurrentPosition() == null || (wb2Var.getCurrentPosition().l & 1) != 0) && zu1Var.c9 != null)) {
            float f3 = (zu1Var.X8 * zu1Var.a9) / 0.2f;
            canvas.save();
            wb2Var.u1(canvas, zu1Var.c9, f3, zu1Var.Y8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x, y);
            wb2Var.v1(this, canvas, zu1Var.d9, zu1Var.c9, f3);
            canvas.restore();
        }
        wb2Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean Z(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt1.Z(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final boolean a0(View view) {
        if (view != this.M) {
            zu1 zu1Var = this.x0;
            if (view != zu1Var.N2 && view != zu1Var.F1 && view != zu1Var.J9 && view != zu1Var.Z && view != zu1Var.Z3 && view != zu1Var.n0 && !(view instanceof ula)) {
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
        zu1 zu1Var = this.x0;
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var != null && view == nr1Var.n0) {
            jz1 jz1Var = zu1Var.Z;
            if (jz1Var != null) {
                i2 = indexOfChild(jz1Var);
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
        nr1 nr1Var2 = zu1Var.a0;
        if (nr1Var2 != null && view == nr1Var2.n0) {
            ap0 ap0Var = (ap0) view;
            ap0Var.setBackgroundDrawable(zu1Var.L.c(ap0Var.c, zu1Var.E, false));
        }
        nr1 nr1Var3 = zu1Var.a0;
        if (nr1Var3 != null && view == (lVar = nr1Var3.D2)) {
            lVar.setBlurredBackgroundFactory(zu1Var.L);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        zu1 zu1Var = this.x0;
        if (zu1Var.c4 != null && motionEvent.getActionMasked() == 8) {
            zu1Var.c4.f();
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ks1 ks1Var;
        zu1 zu1Var = this.x0;
        sz1 sz1Var = zu1Var.c4;
        if (sz1Var != null) {
            sz1Var.f();
        }
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (ks1Var = zu1Var.cb) != null && ks1Var.s) {
            ks1Var.a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        zu1 zu1Var = this.x0;
        n0c n0cVar = zu1Var.n0;
        if (view != n0cVar && view != this.M && view != zu1Var.Z && !(view instanceof ula) && n0cVar != null) {
            f = n0cVar.getProgress() * zu1Var.n0.getContentWidth();
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
        return this.x0.A0.getBottom();
    }

    public zu1 getChatActivity() {
        return this.x0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.x0.getThemedColor(aob.ua);
        ColorDrawable colorDrawable = this.w0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.w0 = new ColorDrawable(themedColor);
        }
        return this.w0;
    }

    @Override
    public int getKeyboardHeight() {
        if (this.x0.mb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override
    public float getListTranslationY() {
        return this.x0.A0.getTranslationY();
    }

    @Override
    public Drawable getNewDrawable() {
        zu1 zu1Var = this.x0;
        if (zu1Var.U7()) {
            return getCompactBackground();
        }
        Drawable l = zu1Var.Ba.l();
        if (l != null) {
            return l;
        }
        return super.getNewDrawable();
    }

    @Override
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.x0.Ba.g;
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
        return this.x0.A0.computeVerticalScrollOffset();
    }

    @Override
    public final void onAttachedToWindow() {
        wk5 wk5Var;
        wk5 wk5Var2;
        wk5 wk5Var3;
        wq1 wq1Var;
        super.onAttachedToWindow();
        zu1 zu1Var = this.x0;
        if (!zu1Var.mb) {
            wk5Var = ((e) zu1Var).parentLayout;
            if (wk5Var != null) {
                wk5Var2 = ((e) zu1Var).parentLayout;
                if (((ActionBarLayout) wk5Var2).b) {
                    hb hbVar = this.I;
                    wk5Var3 = ((e) zu1Var).parentLayout;
                    hbVar.b = (FrameLayout) wk5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        } else {
            this.I.b = zu1Var.m1;
        }
        this.I.c();
        zu1Var.a0.setAdjustPanLayoutHelper(this.I);
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null && ((r47Var.g4() || r47.K4(r47Var.k)) && r47Var.T == 0 && r47.B0(r47Var.k) == zu1Var.l6)) {
            MediaController.z().s0(zu1Var.e6(false), zu1Var.L8, zu1Var.J8, true);
        }
        ad2 ad2Var = zu1Var.ma;
        if (ad2Var != null) {
            ad2Var.G.I();
            wl wlVar = ad2Var.l0;
            if (wlVar != null && (wq1Var = ad2Var.b0) != null) {
                wlVar.b(wq1Var);
            }
            jn7.f(ad2Var.f0).b(ad2Var, 2);
        }
        zu1Var.Ua.i();
    }

    @Override
    public final void onDetachedFromWindow() {
        wq1 wq1Var;
        super.onDetachedFromWindow();
        this.I.d();
        zu1 zu1Var = this.x0;
        ad2 ad2Var = zu1Var.ma;
        if (ad2Var != null) {
            jn7.f(ad2Var.f0).n(ad2Var, 2);
            ad2Var.G.K();
            wl wlVar = ad2Var.l0;
            if (wlVar != null && (wq1Var = ad2Var.b0) != null) {
                wlVar.o(wq1Var);
            }
            ad2Var.R = 0.0f;
            ad2Var.Q = 0L;
            zu1Var.ma = null;
        }
        zu1Var.Ua.j();
        hl.c3(new kc((byte) 17));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        zu1 zu1Var;
        a81 a81Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) == null && (a81Var = (zu1Var = this.x0).N2) != null && a81Var.a() && zu1Var.N2.getTag() != null) {
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt1.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        zu1 zu1Var = this.x0;
        uk0.c(zu1Var.P8, zu1Var.fragmentView);
        zu1Var.Q8.d();
    }

    @Override
    public final void requestLayout() {
        if (this.x0.T4) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i, int i2, int i3, int i4) {
        zu1 zu1Var = this.x0;
        zu1Var.S9 = i2;
        zu1Var.O7();
        zu1Var.Q7();
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
