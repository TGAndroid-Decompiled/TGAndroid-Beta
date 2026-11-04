package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ly0;
public final class lu extends xt {
    public final bv X;
    public final bv[] Y;
    public final int Z;
    public final int f24105a0;
    public final int f24106b0;
    public int f24107c0;
    public float f24108d0;
    public int f24109e0;
    public boolean f24110f0;
    public boolean f24111g0;
    public int f24112h0;
    public final Paint f24113i0;
    public final Path f24114j0;
    public final ly0 f24115k0;
    public Drawable f24116l0;
    public int m0;
    public boolean f24117n0;
    public final String f24118o0;
    public final SpannableString f24119p0;
    public final String f24120q0;
    public final int f24121r0;
    public int f24122s0;
    public int f24123t0;
    public VelocityTracker f24124u0;
    public OverScroller f24125v0;
    public final mi.b0 f24126w0;

    public lu(cv cvVar, Rect rect, int i3, TL_iv.pageBlockPreformatted pageblockpreformatted, lu luVar) {
        super(cvVar, rect, i3);
        int i10;
        ly0 ly0Var;
        int i11;
        StaticLayout staticLayout;
        this.f24113i0 = new Paint(1);
        this.f24114j0 = new Path();
        this.f24126w0 = new mi.b0(this, 10);
        this.Z = this.f26436c;
        this.f24120q0 = pageblockpreformatted.language;
        String x10 = cv.x(pageblockpreformatted.text);
        this.f24118o0 = x10;
        if (x10 == null) {
            this.f24118o0 = "";
        }
        SpannableString spannableString = new SpannableString(this.f24118o0);
        this.f24119p0 = spannableString;
        int length = this.f24118o0.length();
        if (length > 500) {
            i10 = 3;
        } else if (length > 220) {
            i10 = 2;
        } else if (length > 80) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f24121r0 = i10;
        if (spannableString.length() > 0) {
            yu yuVar = new yu(this.f26434a, 8, false);
            yuVar.f26659e = i10;
            spannableString.setSpan(yuVar, 0, spannableString.length(), 33);
            spannableString.setSpan(new ut(pageblockpreformatted.text, 0), 0, spannableString.length(), 33);
            if (luVar != null) {
                CharSequence charSequence = luVar.f24119p0;
                if (charSequence instanceof oi.f) {
                    oi.f fVar = (oi.f) charSequence;
                    if (!fVar.f21137a) {
                        charSequence = fVar.f21138b;
                    }
                }
                if (charSequence != null && charSequence.length() > 0 && this.f24118o0.length() >= charSequence.length()) {
                    if (charSequence instanceof oi.f) {
                        ((oi.f) charSequence).f21138b = null;
                    }
                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) this.f24118o0.substring(charSequence.length()));
                    for (yu yuVar2 : (yu[]) append.getSpans(0, append.length(), yu.class)) {
                        append.removeSpan(yuVar2);
                    }
                    yu yuVar3 = new yu(this.f26434a, 8, false);
                    yuVar3.f26659e = this.f24121r0;
                    append.setSpan(yuVar3, 0, append.length(), 33);
                    oi.h[] hVarArr = (oi.h[]) append.getSpans(0, append.length(), oi.h.class);
                    for (int i12 = 0; i12 < hVarArr.length; i12++) {
                        int spanStart = append.getSpanStart(hVarArr[i12]);
                        int spanStart2 = append.getSpanStart(hVarArr[i12]);
                        append.removeSpan(hVarArr[i12]);
                        append.setSpan(hVarArr[i12], spanStart, spanStart2, 33);
                    }
                    ?? eVar = new oi.e(this.f24119p0);
                    eVar.f21138b = append;
                    this.f24119p0 = eVar;
                }
            }
            if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                SpannableString spannableString2 = this.f24119p0;
                oi.k.c(spannableString2, spannableString2.length(), pageblockpreformatted.language);
            }
        }
        bv bvVar = new bv(cvVar, this.f24119p0, g0.L(5000.0f), Layout.Alignment.ALIGN_NORMAL, 1.22f);
        this.X = bvVar;
        this.Y = new bv[]{bvVar};
        if (!TextUtils.isEmpty(this.f24120q0)) {
            this.f24115k0 = new ly0(this.f24120q0, Math.max(8, az.W0 - 4), null);
        }
        int L = g0.L(14.0f);
        if (this.f24115k0 != null) {
            i11 = g0.L(12.0f) + ((int) Math.ceil(ly0Var.f35918c));
        } else {
            i11 = 0;
        }
        int L2 = g0.L(28.0f) + L + i11;
        int D = k5.D(14.0f, 2, Math.max(0, bvVar.h - bvVar.f21891f));
        if (this.f24115k0 == null && (staticLayout = bvVar.f21888b) != null && staticLayout.getLineCount() > 0) {
            D = k5.b(36.0f, g0.L(14.0f) + (((int) Math.ceil(bvVar.f21888b.getLineRight(0))) - bvVar.f21891f), D);
        }
        int max = Math.max(L2, D);
        this.f24105a0 = max;
        int max2 = Math.max(0, max - this.Z);
        this.f24106b0 = max2;
        if (luVar != null) {
            this.f24107c0 = Utilities.j(luVar.f24107c0, max2, 0);
        }
    }

    @Override
    public final int I() {
        Rect rect = this.f26435b;
        return l0() + k5.D(6.0f, 2, rect.top) + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f26435b;
        return Math.min(this.Z, this.f24105a0) + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Y;
    }

    @Override
    public final boolean Q() {
        if (!this.f24110f0) {
            OverScroller overScroller = this.f24125v0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void T() {
        this.X.i(this.W);
    }

    @Override
    public final void V() {
        this.X.f(this.W);
    }

    @Override
    public final void W(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, g0.L(6.0f));
        i0(canvas);
        k0(canvas, false, 0, 0.0f);
        j0(canvas);
        canvas.restore();
    }

    @Override
    public final void X(Canvas canvas, int i3, float f10) {
        StaticLayout staticLayout = this.X.f21888b;
        if (staticLayout != null && i3 >= 0 && i3 < staticLayout.getLineCount()) {
            canvas.save();
            canvas.translate(0.0f, g0.L(6.0f));
            i0(canvas);
            k0(canvas, true, i3, f10);
            j0(canvas);
            canvas.restore();
            return;
        }
        W(canvas);
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float L = g0.L(14.0f) - this.f24107c0;
        float n02 = n0() + g0.L(6.0f);
        if (actionMasked == 0 && p0(motionEvent.getX(), motionEvent.getY() - g0.L(6.0f))) {
            this.f24117n0 = true;
            View view2 = this.W;
            if (view2 != null) {
                view2.invalidate();
                return true;
            }
        } else {
            int i3 = 0;
            if (this.f24117n0) {
                if (actionMasked == 2 && !p0(motionEvent.getX(), motionEvent.getY() - g0.L(6.0f))) {
                    this.f24117n0 = false;
                    View view3 = this.W;
                    if (view3 != null) {
                        view3.invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    this.f24117n0 = false;
                    View view4 = this.W;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                    org.telegram.ui.Cells.l1 l1Var = this.f26434a.F;
                    if (actionMasked == 1 && l1Var != null) {
                        l1Var.U1(this.f24118o0, this.f24120q0);
                        return true;
                    }
                }
            } else {
                bv bvVar = this.X;
                if (actionMasked == 0) {
                    if (this.f24112h0 == 0 && (view = this.W) != null) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                        this.f24112h0 = viewConfiguration.getScaledTouchSlop();
                        this.f24122s0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f24123t0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    if (this.f24125v0 == null && this.W != null) {
                        this.f24125v0 = new OverScroller(this.W.getContext());
                    }
                    OverScroller overScroller = this.f24125v0;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f24125v0.forceFinished(true);
                    }
                    this.f24108d0 = motionEvent.getX();
                    this.f24109e0 = this.f24107c0;
                    this.f24110f0 = false;
                    VelocityTracker velocityTracker2 = this.f24124u0;
                    if (velocityTracker2 == null) {
                        this.f24124u0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f24124u0.addMovement(motionEvent);
                    motionEvent.offsetLocation(-L, -n02);
                    this.f24111g0 = bvVar.t(motionEvent);
                    motionEvent.offsetLocation(L, n02);
                    return true;
                } else if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f24124u0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float x10 = motionEvent.getX() - this.f24108d0;
                    boolean z10 = this.f24110f0;
                    int i10 = this.f24106b0;
                    if (!z10 && i10 > 0 && Math.abs(x10) > this.f24112h0) {
                        this.f24110f0 = true;
                        a0(true);
                        if (this.f24111g0) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction(3);
                            obtain.offsetLocation(-L, -n02);
                            bvVar.t(obtain);
                            obtain.recycle();
                            this.f24111g0 = false;
                        }
                    }
                    if (this.f24110f0) {
                        int i11 = (int) (this.f24109e0 - x10);
                        if (i11 >= 0) {
                            i3 = i11;
                        }
                        if (i3 <= i10) {
                            i10 = i3;
                        }
                        if (i10 != this.f24107c0) {
                            this.f24107c0 = i10;
                            Z(this.T, this.U, this.V);
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                                return true;
                            }
                        }
                    } else {
                        return this.f24111g0;
                    }
                } else {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z11 = this.f24110f0;
                        this.f24110f0 = false;
                        if (z11) {
                            a0(false);
                            if (actionMasked == 1 && (velocityTracker = this.f24124u0) != null && this.f24125v0 != null && this.W != null) {
                                velocityTracker.addMovement(motionEvent);
                                this.f24124u0.computeCurrentVelocity(1000, this.f24123t0);
                                float f10 = -this.f24124u0.getXVelocity();
                                if (Math.abs(f10) > this.f24122s0) {
                                    this.f24125v0.fling(this.f24107c0, 0, (int) f10, 0, 0, this.f24106b0, 0, 0);
                                    this.W.postOnAnimation(this.f24126w0);
                                }
                            }
                        }
                        if (!z11 && this.f24111g0) {
                            motionEvent.offsetLocation(-L, -n02);
                            bvVar.t(motionEvent);
                            motionEvent.offsetLocation(L, n02);
                        }
                        this.f24111g0 = false;
                        VelocityTracker velocityTracker4 = this.f24124u0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.recycle();
                            this.f24124u0 = null;
                        }
                        if (z11 || actionMasked == 1) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public final void Z(int i3, int i10, int i11) {
        this.T = i3;
        this.U = i10;
        this.V = i11;
        int L = (g0.L(14.0f) + i3) - this.f24107c0;
        bv bvVar = this.X;
        bvVar.f21889c = L - bvVar.f21891f;
        bvVar.d = n0() + g0.L(6.0f) + i10;
        bvVar.f21890e = i11;
    }

    @Override
    public final Layout a() {
        return this.X.f21888b;
    }

    public final void i0(Canvas canvas) {
        int i3;
        cv cvVar = this.f26434a;
        if (cvVar.E()) {
            i3 = org.telegram.ui.ActionBar.k6.ml;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.ll;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, cvVar.D);
        Paint paint = this.f24113i0;
        paint.setColor(w02);
        RectF rectF = g0.P;
        rectF.set(0.0f, 0.0f, m0(), l0());
        canvas.drawRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), paint);
    }

    public final void j0(Canvas canvas) {
        int i3;
        Canvas canvas2;
        int i10;
        cv cvVar = this.f26434a;
        if (cvVar.E()) {
            i3 = org.telegram.ui.ActionBar.k6.Tc;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.Sc;
        }
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i3, cvVar.D));
        ly0 ly0Var = this.f24115k0;
        if (ly0Var != null) {
            ly0Var.f35929p = m0() - g0.L(54.0f);
            canvas2 = canvas;
            this.f24115k0.c(g0.L(14.0f), g0.L(17.0f), 1.0f, r12, canvas2);
        } else {
            canvas2 = canvas;
        }
        if (this.f24116l0 == null) {
            this.f24116l0 = k2.p1.g(t0.f25457b, 2131232103);
        }
        if (this.m0 != r12) {
            Drawable drawable = this.f24116l0;
            this.m0 = r12;
            drawable.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
        }
        Drawable drawable2 = this.f24116l0;
        if (this.f24117n0) {
            i10 = 128;
        } else {
            i10 = 255;
        }
        drawable2.setAlpha(i10);
        int m0 = m0() - g0.L(10.0f);
        int o02 = o0();
        this.f24116l0.setBounds(m0 - g0.L(18.0f), o02, m0, g0.L(18.0f) + o02);
        this.f24116l0.draw(canvas2);
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        xt.l(spannableStringBuilder, this.X, this.Y);
    }

    public final void k0(Canvas canvas, boolean z10, int i3, float f10) {
        boolean z11;
        float f11;
        int m0 = m0();
        int l02 = l0();
        int i10 = this.f24106b0;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        canvas.save();
        Path path = this.f24114j0;
        path.rewind();
        RectF rectF = g0.P;
        float f12 = m0;
        float f13 = l02;
        rectF.set(0.0f, 0.0f, f12, f13);
        path.addRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), Path.Direction.CW);
        canvas.clipPath(path);
        if (z11) {
            canvas.saveLayerAlpha(0.0f, 0.0f, f12, f13, 255, 31);
        }
        canvas.save();
        canvas.translate(g0.L(14.0f) - this.f24107c0, n0());
        bv bvVar = this.X;
        if (z10) {
            bvVar.m(canvas, i3, f10);
        } else {
            bvVar.d(canvas, bvVar.T);
        }
        canvas.restore();
        if (z11) {
            if (this.f24115k0 != null) {
                f11 = g0.L(30.0f);
            } else {
                f11 = 0.0f;
            }
            int i11 = this.f24107c0;
            cv cvVar = this.f26434a;
            if (i11 > 0) {
                rectF.set(0.0f, f11, g0.L(14.0f), f13);
                cvVar.f22087z.w(canvas, rectF, 0, Math.min(1.0f, this.f24107c0 / g0.L(14.0f)));
            }
            if (this.f24107c0 < i10) {
                rectF.set(m0 - g0.L(14.0f), f11, f12, f13);
                cvVar.f22087z.w(canvas, rectF, 2, Math.min(1.0f, (i10 - this.f24107c0) / g0.L(14.0f)));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public final int l0() {
        return g0.L(12.0f) + this.X.f21888b.getHeight() + n0();
    }

    public final int m0() {
        int i3 = this.f26434a.C;
        Rect rect = this.f26435b;
        return (i3 - rect.left) - rect.right;
    }

    public final int n0() {
        float f10;
        if (this.f24115k0 != null) {
            f10 = 32.0f;
        } else {
            f10 = 12.0f;
        }
        return g0.L(f10);
    }

    public final int o0() {
        bv bvVar;
        StaticLayout staticLayout;
        if (this.f24115k0 == null && (staticLayout = (bvVar = this.X).f21888b) != null && staticLayout.getLineCount() != 0) {
            return Math.round(((bvVar.f21888b.getLineBaseline(0) + n0()) - (g0.L(Math.max(Math.min(10, az.W0 - 2), (az.W0 - 2) - this.f24121r0)) * 0.36f)) - (g0.L(18.0f) / 2.0f));
        }
        return g0.L(8.0f);
    }

    public final boolean p0(float f10, float f11) {
        int m0 = m0();
        if (f10 >= m0 - g0.L(38.0f) && f10 <= m0 && f11 >= 0.0f) {
            if (f11 <= g0.L(26.0f) + o0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i3, ot otVar) {
        bv bvVar = this.X;
        if (bvVar.o(characterStyle, otVar)) {
            Rect rect = this.f26435b;
            otVar.f24597e = ((g0.L(14.0f) + rect.left) - this.f24107c0) - bvVar.f21891f;
            otVar.f24598f = n0() + g0.L(6.0f) + i3 + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final CharSequence y() {
        CharSequence y9 = super.y();
        String str = this.f24120q0;
        if (!TextUtils.isEmpty(str)) {
            String b10 = wi.b(str);
            if (!TextUtils.isEmpty(b10)) {
                return TextUtils.concat(y9, " (", b10, ")");
            }
        }
        return y9;
    }
}
