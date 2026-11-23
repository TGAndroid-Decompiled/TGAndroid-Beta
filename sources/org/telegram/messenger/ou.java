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
import org.telegram.ui.Components.xy0;
public final class ou extends au {
    public final ev X;
    public final ev[] Y;
    public final int Z;
    public final int f26131a0;
    public final int f26132b0;
    public int f26133c0;
    public float f26134d0;
    public int f26135e0;
    public boolean f26136f0;
    public boolean f26137g0;
    public int f26138h0;
    public final Paint f26139i0;
    public final Path f26140j0;
    public final xy0 f26141k0;
    public Drawable f26142l0;
    public int m0;
    public boolean f26143n0;
    public final String f26144o0;
    public final SpannableString f26145p0;
    public final String f26146q0;
    public final int f26147r0;
    public int f26148s0;
    public int f26149t0;
    public VelocityTracker f26150u0;
    public OverScroller f26151v0;
    public final j6.o f26152w0;

    public ou(fv fvVar, Rect rect, int i7, TL_iv.pageBlockPreformatted pageblockpreformatted, ou ouVar) {
        super(fvVar, rect, i7);
        int i10;
        xy0 xy0Var;
        int i11;
        StaticLayout staticLayout;
        this.f26139i0 = new Paint(1);
        this.f26140j0 = new Path();
        this.f26152w0 = new j6.o(this, 14);
        this.Z = this.f22934c;
        this.f26146q0 = pageblockpreformatted.language;
        String x10 = fv.x(pageblockpreformatted.text);
        this.f26144o0 = x10;
        if (x10 == null) {
            this.f26144o0 = "";
        }
        SpannableString spannableString = new SpannableString(this.f26144o0);
        this.f26145p0 = spannableString;
        int length = this.f26144o0.length();
        if (length > 500) {
            i10 = 3;
        } else if (length > 220) {
            i10 = 2;
        } else if (length > 80) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f26147r0 = i10;
        if (spannableString.length() > 0) {
            bv bvVar = new bv(this.f22932a, 8, false);
            bvVar.f23151e = i10;
            spannableString.setSpan(bvVar, 0, spannableString.length(), 33);
            spannableString.setSpan(new xt(pageblockpreformatted.text, 0), 0, spannableString.length(), 33);
            if (ouVar != null) {
                CharSequence charSequence = ouVar.f26145p0;
                if (charSequence instanceof qi.e) {
                    qi.e eVar = (qi.e) charSequence;
                    if (!eVar.f56185a) {
                        charSequence = eVar.f56186b;
                    }
                }
                if (charSequence != null && charSequence.length() > 0 && this.f26144o0.length() >= charSequence.length()) {
                    if (charSequence instanceof qi.e) {
                        ((qi.e) charSequence).f56186b = null;
                    }
                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) this.f26144o0.substring(charSequence.length()));
                    for (bv bvVar2 : (bv[]) append.getSpans(0, append.length(), bv.class)) {
                        append.removeSpan(bvVar2);
                    }
                    bv bvVar3 = new bv(this.f22932a, 8, false);
                    bvVar3.f23151e = this.f26147r0;
                    append.setSpan(bvVar3, 0, append.length(), 33);
                    qi.g[] gVarArr = (qi.g[]) append.getSpans(0, append.length(), qi.g.class);
                    for (int i12 = 0; i12 < gVarArr.length; i12++) {
                        int spanStart = append.getSpanStart(gVarArr[i12]);
                        int spanStart2 = append.getSpanStart(gVarArr[i12]);
                        append.removeSpan(gVarArr[i12]);
                        append.setSpan(gVarArr[i12], spanStart, spanStart2, 33);
                    }
                    ?? dVar = new qi.d(this.f26145p0);
                    dVar.f56186b = append;
                    this.f26145p0 = dVar;
                }
            }
            if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                SpannableString spannableString2 = this.f26145p0;
                qi.j.c(spannableString2, spannableString2.length(), pageblockpreformatted.language);
            }
        }
        ev evVar = new ev(fvVar, this.f26145p0, g0.L(5000.0f), Layout.Alignment.ALIGN_NORMAL, 1.22f);
        this.X = evVar;
        this.Y = new ev[]{evVar};
        if (!TextUtils.isEmpty(this.f26146q0)) {
            this.f26141k0 = new xy0(this.f26146q0, Math.max(8, cz.W0 - 4), null);
        }
        int L = g0.L(14.0f);
        if (this.f26141k0 != null) {
            i11 = g0.L(12.0f) + ((int) Math.ceil(xy0Var.f42224c));
        } else {
            i11 = 0;
        }
        int L2 = g0.L(28.0f) + L + i11;
        int D = f3.D(14.0f, 2, Math.max(0, evVar.h - evVar.f23737f));
        if (this.f26141k0 == null && (staticLayout = evVar.f23734b) != null && staticLayout.getLineCount() > 0) {
            D = f3.b(36.0f, g0.L(14.0f) + (((int) Math.ceil(evVar.f23734b.getLineRight(0))) - evVar.f23737f), D);
        }
        int max = Math.max(L2, D);
        this.f26131a0 = max;
        int max2 = Math.max(0, max - this.Z);
        this.f26132b0 = max2;
        if (ouVar != null) {
            this.f26133c0 = Utilities.j(ouVar.f26133c0, max2, 0);
        }
    }

    @Override
    public final int I() {
        Rect rect = this.f22933b;
        return l0() + f3.D(6.0f, 2, rect.top) + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22933b;
        return Math.min(this.Z, this.f26131a0) + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] L() {
        return this.Y;
    }

    @Override
    public final boolean Q() {
        if (!this.f26136f0) {
            OverScroller overScroller = this.f26151v0;
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
    public final void X(Canvas canvas, int i7, float f10) {
        StaticLayout staticLayout = this.X.f23734b;
        if (staticLayout != null && i7 >= 0 && i7 < staticLayout.getLineCount()) {
            canvas.save();
            canvas.translate(0.0f, g0.L(6.0f));
            i0(canvas);
            k0(canvas, true, i7, f10);
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
        float L = g0.L(14.0f) - this.f26133c0;
        float n02 = n0() + g0.L(6.0f);
        if (actionMasked == 0 && p0(motionEvent.getX(), motionEvent.getY() - g0.L(6.0f))) {
            this.f26143n0 = true;
            View view2 = this.W;
            if (view2 != null) {
                view2.invalidate();
                return true;
            }
        } else {
            int i7 = 0;
            if (this.f26143n0) {
                if (actionMasked == 2 && !p0(motionEvent.getX(), motionEvent.getY() - g0.L(6.0f))) {
                    this.f26143n0 = false;
                    View view3 = this.W;
                    if (view3 != null) {
                        view3.invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    this.f26143n0 = false;
                    View view4 = this.W;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                    org.telegram.ui.Cells.m1 m1Var = this.f22932a.F;
                    if (actionMasked == 1 && m1Var != null) {
                        m1Var.e2(this.f26144o0, this.f26146q0);
                        return true;
                    }
                }
            } else {
                ev evVar = this.X;
                if (actionMasked == 0) {
                    if (this.f26138h0 == 0 && (view = this.W) != null) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                        this.f26138h0 = viewConfiguration.getScaledTouchSlop();
                        this.f26148s0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f26149t0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    if (this.f26151v0 == null && this.W != null) {
                        this.f26151v0 = new OverScroller(this.W.getContext());
                    }
                    OverScroller overScroller = this.f26151v0;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f26151v0.forceFinished(true);
                    }
                    this.f26134d0 = motionEvent.getX();
                    this.f26135e0 = this.f26133c0;
                    this.f26136f0 = false;
                    VelocityTracker velocityTracker2 = this.f26150u0;
                    if (velocityTracker2 == null) {
                        this.f26150u0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f26150u0.addMovement(motionEvent);
                    motionEvent.offsetLocation(-L, -n02);
                    this.f26137g0 = evVar.t(motionEvent);
                    motionEvent.offsetLocation(L, n02);
                    return true;
                } else if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f26150u0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float x10 = motionEvent.getX() - this.f26134d0;
                    boolean z10 = this.f26136f0;
                    int i10 = this.f26132b0;
                    if (!z10 && i10 > 0 && Math.abs(x10) > this.f26138h0) {
                        this.f26136f0 = true;
                        a0(true);
                        if (this.f26137g0) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction(3);
                            obtain.offsetLocation(-L, -n02);
                            evVar.t(obtain);
                            obtain.recycle();
                            this.f26137g0 = false;
                        }
                    }
                    if (this.f26136f0) {
                        int i11 = (int) (this.f26135e0 - x10);
                        if (i11 >= 0) {
                            i7 = i11;
                        }
                        if (i7 <= i10) {
                            i10 = i7;
                        }
                        if (i10 != this.f26133c0) {
                            this.f26133c0 = i10;
                            Z(this.T, this.U, this.V);
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                                return true;
                            }
                        }
                    } else {
                        return this.f26137g0;
                    }
                } else {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z11 = this.f26136f0;
                        this.f26136f0 = false;
                        if (z11) {
                            a0(false);
                            if (actionMasked == 1 && (velocityTracker = this.f26150u0) != null && this.f26151v0 != null && this.W != null) {
                                velocityTracker.addMovement(motionEvent);
                                this.f26150u0.computeCurrentVelocity(1000, this.f26149t0);
                                float f10 = -this.f26150u0.getXVelocity();
                                if (Math.abs(f10) > this.f26148s0) {
                                    this.f26151v0.fling(this.f26133c0, 0, (int) f10, 0, 0, this.f26132b0, 0, 0);
                                    this.W.postOnAnimation(this.f26152w0);
                                }
                            }
                        }
                        if (!z11 && this.f26137g0) {
                            motionEvent.offsetLocation(-L, -n02);
                            evVar.t(motionEvent);
                            motionEvent.offsetLocation(L, n02);
                        }
                        this.f26137g0 = false;
                        VelocityTracker velocityTracker4 = this.f26150u0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.recycle();
                            this.f26150u0 = null;
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
    public final void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        int L = (g0.L(14.0f) + i7) - this.f26133c0;
        ev evVar = this.X;
        evVar.f23735c = L - evVar.f23737f;
        evVar.d = n0() + g0.L(6.0f) + i10;
        evVar.f23736e = i11;
    }

    @Override
    public final Layout a() {
        return this.X.f23734b;
    }

    public final void i0(Canvas canvas) {
        int i7;
        fv fvVar = this.f22932a;
        if (fvVar.E()) {
            i7 = org.telegram.ui.ActionBar.m6.pl;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.ol;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, fvVar.D);
        Paint paint = this.f26139i0;
        paint.setColor(w02);
        RectF rectF = g0.P;
        rectF.set(0.0f, 0.0f, m0(), l0());
        canvas.drawRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), paint);
    }

    public final void j0(Canvas canvas) {
        int i7;
        Canvas canvas2;
        int i10;
        fv fvVar = this.f22932a;
        if (fvVar.E()) {
            i7 = org.telegram.ui.ActionBar.m6.Wc;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.Vc;
        }
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(i7, fvVar.D));
        xy0 xy0Var = this.f26141k0;
        if (xy0Var != null) {
            xy0Var.f42235p = m0() - g0.L(54.0f);
            canvas2 = canvas;
            this.f26141k0.c(g0.L(14.0f), g0.L(17.0f), 1.0f, r12, canvas2);
        } else {
            canvas2 = canvas;
        }
        if (this.f26142l0 == null) {
            this.f26142l0 = i5.c.g(t0.f26895b, 2131232105);
        }
        if (this.m0 != r12) {
            Drawable drawable = this.f26142l0;
            this.m0 = r12;
            drawable.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
        }
        Drawable drawable2 = this.f26142l0;
        if (this.f26143n0) {
            i10 = 128;
        } else {
            i10 = 255;
        }
        drawable2.setAlpha(i10);
        int m0 = m0() - g0.L(10.0f);
        int o02 = o0();
        this.f26142l0.setBounds(m0 - g0.L(18.0f), o02, m0, g0.L(18.0f) + o02);
        this.f26142l0.draw(canvas2);
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        au.l(spannableStringBuilder, this.X, this.Y);
    }

    public final void k0(Canvas canvas, boolean z10, int i7, float f10) {
        boolean z11;
        float f11;
        int m0 = m0();
        int l02 = l0();
        int i10 = this.f26132b0;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        canvas.save();
        Path path = this.f26140j0;
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
        canvas.translate(g0.L(14.0f) - this.f26133c0, n0());
        ev evVar = this.X;
        if (z10) {
            evVar.m(canvas, i7, f10);
        } else {
            evVar.d(canvas, evVar.T);
        }
        canvas.restore();
        if (z11) {
            if (this.f26141k0 != null) {
                f11 = g0.L(30.0f);
            } else {
                f11 = 0.0f;
            }
            int i11 = this.f26133c0;
            fv fvVar = this.f22932a;
            if (i11 > 0) {
                rectF.set(0.0f, f11, g0.L(14.0f), f13);
                fvVar.f23962z.n(canvas, rectF, 0, Math.min(1.0f, this.f26133c0 / g0.L(14.0f)));
            }
            if (this.f26133c0 < i10) {
                rectF.set(m0 - g0.L(14.0f), f11, f12, f13);
                fvVar.f23962z.n(canvas, rectF, 2, Math.min(1.0f, (i10 - this.f26133c0) / g0.L(14.0f)));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public final int l0() {
        return g0.L(12.0f) + this.X.f23734b.getHeight() + n0();
    }

    public final int m0() {
        int i7 = this.f22932a.C;
        Rect rect = this.f22933b;
        return (i7 - rect.left) - rect.right;
    }

    public final int n0() {
        float f10;
        if (this.f26141k0 != null) {
            f10 = 32.0f;
        } else {
            f10 = 12.0f;
        }
        return g0.L(f10);
    }

    public final int o0() {
        ev evVar;
        StaticLayout staticLayout;
        if (this.f26141k0 == null && (staticLayout = (evVar = this.X).f23734b) != null && staticLayout.getLineCount() != 0) {
            return Math.round(((evVar.f23734b.getLineBaseline(0) + n0()) - (g0.L(Math.max(Math.min(10, cz.W0 - 2), (cz.W0 - 2) - this.f26147r0)) * 0.36f)) - (g0.L(18.0f) / 2.0f));
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
    public final boolean u(CharacterStyle characterStyle, int i7, rt rtVar) {
        ev evVar = this.X;
        if (evVar.o(characterStyle, rtVar)) {
            Rect rect = this.f22933b;
            rtVar.f26625e = ((g0.L(14.0f) + rect.left) - this.f26133c0) - evVar.f23737f;
            rtVar.f26626f = n0() + g0.L(6.0f) + i7 + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final CharSequence y() {
        CharSequence y10 = super.y();
        String str = this.f26146q0;
        if (!TextUtils.isEmpty(str)) {
            String b10 = dj.b(str);
            if (!TextUtils.isEmpty(b10)) {
                return TextUtils.concat(y10, " (", b10, ")");
            }
        }
        return y10;
    }
}
