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
import org.telegram.ui.Components.my0;
public final class tu extends fu {
    public final jv W;
    public final jv[] X;
    public final int Y;
    public final int Z;
    public final int f25663a0;
    public int f25664b0;
    public float f25665c0;
    public int f25666d0;
    public boolean f25667e0;
    public boolean f25668f0;
    public int f25669g0;
    public final Paint f25670h0;
    public final Path f25671i0;
    public final my0 f25672j0;
    public Drawable f25673k0;
    public int f25674l0;
    public boolean m0;
    public final String f25675n0;
    public final SpannableString f25676o0;
    public final String f25677p0;
    public final int f25678q0;
    public int f25679r0;
    public int f25680s0;
    public VelocityTracker f25681t0;
    public OverScroller f25682u0;
    public final m.f3 f25683v0;

    public tu(kv kvVar, Rect rect, int i7, TL_iv.pageBlockPreformatted pageblockpreformatted, tu tuVar) {
        super(kvVar, rect, i7);
        int i10;
        my0 my0Var;
        int i11;
        StaticLayout staticLayout;
        this.f25670h0 = new Paint(1);
        this.f25671i0 = new Path();
        this.f25683v0 = new m.f3(this, 11);
        this.Y = this.f22471c;
        this.f25677p0 = pageblockpreformatted.language;
        String x10 = kv.x(pageblockpreformatted.text);
        this.f25675n0 = x10;
        if (x10 == null) {
            this.f25675n0 = "";
        }
        SpannableString spannableString = new SpannableString(this.f25675n0);
        this.f25676o0 = spannableString;
        int length = this.f25675n0.length();
        if (length > 500) {
            i10 = 3;
        } else if (length > 220) {
            i10 = 2;
        } else if (length > 80) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f25678q0 = i10;
        if (spannableString.length() > 0) {
            gv gvVar = new gv(this.f22469a, 8, false);
            gvVar.f22748e = i10;
            spannableString.setSpan(gvVar, 0, spannableString.length(), 33);
            spannableString.setSpan(new cu(pageblockpreformatted.text, 0), 0, spannableString.length(), 33);
            if (tuVar != null) {
                CharSequence charSequence = tuVar.f25676o0;
                if (charSequence instanceof ni.h) {
                    ni.h hVar = (ni.h) charSequence;
                    if (!hVar.f20623a) {
                        charSequence = hVar.f20624b;
                    }
                }
                if (charSequence != null && charSequence.length() > 0 && this.f25675n0.length() >= charSequence.length()) {
                    if (charSequence instanceof ni.h) {
                        ((ni.h) charSequence).f20624b = null;
                    }
                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) this.f25675n0.substring(charSequence.length()));
                    for (gv gvVar2 : (gv[]) append.getSpans(0, append.length(), gv.class)) {
                        append.removeSpan(gvVar2);
                    }
                    gv gvVar3 = new gv(this.f22469a, 8, false);
                    gvVar3.f22748e = this.f25678q0;
                    append.setSpan(gvVar3, 0, append.length(), 33);
                    ni.j[] jVarArr = (ni.j[]) append.getSpans(0, append.length(), ni.j.class);
                    for (int i12 = 0; i12 < jVarArr.length; i12++) {
                        int spanStart = append.getSpanStart(jVarArr[i12]);
                        int spanStart2 = append.getSpanStart(jVarArr[i12]);
                        append.removeSpan(jVarArr[i12]);
                        append.setSpan(jVarArr[i12], spanStart, spanStart2, 33);
                    }
                    ?? gVar = new ni.g(this.f25676o0);
                    gVar.f20624b = append;
                    this.f25676o0 = gVar;
                }
            }
            if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                SpannableString spannableString2 = this.f25676o0;
                ni.m.c(spannableString2, spannableString2.length(), pageblockpreformatted.language);
            }
        }
        jv jvVar = new jv(kvVar, this.f25676o0, g0.L(5000.0f), Layout.Alignment.ALIGN_NORMAL, 1.22f);
        this.W = jvVar;
        this.X = new jv[]{jvVar};
        if (!TextUtils.isEmpty(this.f25677p0)) {
            this.f25672j0 = new my0(this.f25677p0, Math.max(8, iz.W0 - 4), null);
        }
        int L = g0.L(14.0f);
        if (this.f25672j0 != null) {
            i11 = g0.L(12.0f) + ((int) Math.ceil(my0Var.f36147c));
        } else {
            i11 = 0;
        }
        int L2 = g0.L(28.0f) + L + i11;
        int D = k5.D(14.0f, 2, Math.max(0, jvVar.h - jvVar.f23608f));
        if (this.f25672j0 == null && (staticLayout = jvVar.f23605b) != null && staticLayout.getLineCount() > 0) {
            D = k5.b(36.0f, g0.L(14.0f) + (((int) Math.ceil(jvVar.f23605b.getLineRight(0))) - jvVar.f23608f), D);
        }
        int max = Math.max(L2, D);
        this.Z = max;
        int max2 = Math.max(0, max - this.Y);
        this.f25663a0 = max2;
        if (tuVar != null) {
            this.f25664b0 = Utilities.j(tuVar.f25664b0, max2, 0);
        }
    }

    @Override
    public final int I() {
        Rect rect = this.f22470b;
        return l0() + k5.D(6.0f, 2, rect.top) + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22470b;
        return Math.min(this.Y, this.Z) + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.t9[] L() {
        return this.X;
    }

    @Override
    public final boolean Q() {
        if (!this.f25667e0) {
            OverScroller overScroller = this.f25682u0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void T() {
        this.W.i(this.V);
    }

    @Override
    public final void V() {
        this.W.f(this.V);
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
        StaticLayout staticLayout = this.W.f23605b;
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
        float L = g0.L(14.0f) - this.f25664b0;
        float n02 = n0() + g0.L(6.0f);
        if (actionMasked == 0 && p0(motionEvent.getX(), motionEvent.getY() - g0.L(6.0f))) {
            this.m0 = true;
            View view2 = this.V;
            if (view2 != null) {
                view2.invalidate();
                return true;
            }
        } else {
            int i7 = 0;
            if (this.m0) {
                if (actionMasked == 2 && !p0(motionEvent.getX(), motionEvent.getY() - g0.L(6.0f))) {
                    this.m0 = false;
                    View view3 = this.V;
                    if (view3 != null) {
                        view3.invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    this.m0 = false;
                    View view4 = this.V;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                    org.telegram.ui.Cells.l1 l1Var = this.f22469a.F;
                    if (actionMasked == 1 && l1Var != null) {
                        l1Var.P1(this.f25675n0, this.f25677p0);
                        return true;
                    }
                }
            } else {
                jv jvVar = this.W;
                if (actionMasked == 0) {
                    if (this.f25669g0 == 0 && (view = this.V) != null) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                        this.f25669g0 = viewConfiguration.getScaledTouchSlop();
                        this.f25679r0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f25680s0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    if (this.f25682u0 == null && this.V != null) {
                        this.f25682u0 = new OverScroller(this.V.getContext());
                    }
                    OverScroller overScroller = this.f25682u0;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f25682u0.forceFinished(true);
                    }
                    this.f25665c0 = motionEvent.getX();
                    this.f25666d0 = this.f25664b0;
                    this.f25667e0 = false;
                    VelocityTracker velocityTracker2 = this.f25681t0;
                    if (velocityTracker2 == null) {
                        this.f25681t0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f25681t0.addMovement(motionEvent);
                    motionEvent.offsetLocation(-L, -n02);
                    this.f25668f0 = jvVar.t(motionEvent);
                    motionEvent.offsetLocation(L, n02);
                    return true;
                } else if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f25681t0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float x10 = motionEvent.getX() - this.f25665c0;
                    boolean z9 = this.f25667e0;
                    int i10 = this.f25663a0;
                    if (!z9 && i10 > 0 && Math.abs(x10) > this.f25669g0) {
                        this.f25667e0 = true;
                        a0(true);
                        if (this.f25668f0) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction(3);
                            obtain.offsetLocation(-L, -n02);
                            jvVar.t(obtain);
                            obtain.recycle();
                            this.f25668f0 = false;
                        }
                    }
                    if (this.f25667e0) {
                        int i11 = (int) (this.f25666d0 - x10);
                        if (i11 >= 0) {
                            i7 = i11;
                        }
                        if (i7 <= i10) {
                            i10 = i7;
                        }
                        if (i10 != this.f25664b0) {
                            this.f25664b0 = i10;
                            Z(this.S, this.T, this.U);
                            View view5 = this.V;
                            if (view5 != null) {
                                view5.invalidate();
                                return true;
                            }
                        }
                    } else {
                        return this.f25668f0;
                    }
                } else {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z10 = this.f25667e0;
                        this.f25667e0 = false;
                        if (z10) {
                            a0(false);
                            if (actionMasked == 1 && (velocityTracker = this.f25681t0) != null && this.f25682u0 != null && this.V != null) {
                                velocityTracker.addMovement(motionEvent);
                                this.f25681t0.computeCurrentVelocity(1000, this.f25680s0);
                                float f10 = -this.f25681t0.getXVelocity();
                                if (Math.abs(f10) > this.f25679r0) {
                                    this.f25682u0.fling(this.f25664b0, 0, (int) f10, 0, 0, this.f25663a0, 0, 0);
                                    this.V.postOnAnimation(this.f25683v0);
                                }
                            }
                        }
                        if (!z10 && this.f25668f0) {
                            motionEvent.offsetLocation(-L, -n02);
                            jvVar.t(motionEvent);
                            motionEvent.offsetLocation(L, n02);
                        }
                        this.f25668f0 = false;
                        VelocityTracker velocityTracker4 = this.f25681t0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.recycle();
                            this.f25681t0 = null;
                        }
                        if (z10 || actionMasked == 1) {
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
        this.S = i7;
        this.T = i10;
        this.U = i11;
        int L = (g0.L(14.0f) + i7) - this.f25664b0;
        jv jvVar = this.W;
        jvVar.f23606c = L - jvVar.f23608f;
        jvVar.d = n0() + g0.L(6.0f) + i10;
        jvVar.f23607e = i11;
    }

    @Override
    public final Layout a() {
        return this.W.f23605b;
    }

    public final void i0(Canvas canvas) {
        int i7;
        kv kvVar = this.f22469a;
        if (kvVar.E()) {
            i7 = org.telegram.ui.ActionBar.k6.ml;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.ll;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, kvVar.D);
        Paint paint = this.f25670h0;
        paint.setColor(w02);
        RectF rectF = g0.P;
        rectF.set(0.0f, 0.0f, m0(), l0());
        canvas.drawRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), paint);
    }

    public final void j0(Canvas canvas) {
        int i7;
        Canvas canvas2;
        int i10;
        kv kvVar = this.f22469a;
        if (kvVar.E()) {
            i7 = org.telegram.ui.ActionBar.k6.Tc;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.Sc;
        }
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i7, kvVar.D));
        my0 my0Var = this.f25672j0;
        if (my0Var != null) {
            my0Var.f36158p = m0() - g0.L(54.0f);
            canvas2 = canvas;
            this.f25672j0.c(g0.L(14.0f), g0.L(17.0f), 1.0f, r12, canvas2);
        } else {
            canvas2 = canvas;
        }
        if (this.f25673k0 == null) {
            this.f25673k0 = jg.g.h(t0.f25566b, 2131232103);
        }
        if (this.f25674l0 != r12) {
            Drawable drawable = this.f25673k0;
            this.f25674l0 = r12;
            drawable.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
        }
        Drawable drawable2 = this.f25673k0;
        if (this.m0) {
            i10 = 128;
        } else {
            i10 = 255;
        }
        drawable2.setAlpha(i10);
        int m0 = m0() - g0.L(10.0f);
        int o02 = o0();
        this.f25673k0.setBounds(m0 - g0.L(18.0f), o02, m0, g0.L(18.0f) + o02);
        this.f25673k0.draw(canvas2);
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        fu.l(spannableStringBuilder, this.W, this.X);
    }

    public final void k0(Canvas canvas, boolean z9, int i7, float f10) {
        boolean z10;
        float f11;
        int m0 = m0();
        int l02 = l0();
        int i10 = this.f25663a0;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.save();
        Path path = this.f25671i0;
        path.rewind();
        RectF rectF = g0.P;
        float f12 = m0;
        float f13 = l02;
        rectF.set(0.0f, 0.0f, f12, f13);
        path.addRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), Path.Direction.CW);
        canvas.clipPath(path);
        if (z10) {
            canvas.saveLayerAlpha(0.0f, 0.0f, f12, f13, 255, 31);
        }
        canvas.save();
        canvas.translate(g0.L(14.0f) - this.f25664b0, n0());
        jv jvVar = this.W;
        if (z9) {
            jvVar.m(canvas, i7, f10);
        } else {
            jvVar.d(canvas, jvVar.S);
        }
        canvas.restore();
        if (z10) {
            if (this.f25672j0 != null) {
                f11 = g0.L(30.0f);
            } else {
                f11 = 0.0f;
            }
            int i11 = this.f25664b0;
            kv kvVar = this.f22469a;
            if (i11 > 0) {
                rectF.set(0.0f, f11, g0.L(14.0f), f13);
                kvVar.f23785z.m(canvas, rectF, 0, Math.min(1.0f, this.f25664b0 / g0.L(14.0f)));
            }
            if (this.f25664b0 < i10) {
                rectF.set(m0 - g0.L(14.0f), f11, f12, f13);
                kvVar.f23785z.m(canvas, rectF, 2, Math.min(1.0f, (i10 - this.f25664b0) / g0.L(14.0f)));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public final int l0() {
        return g0.L(12.0f) + this.W.f23605b.getHeight() + n0();
    }

    public final int m0() {
        int i7 = this.f22469a.C;
        Rect rect = this.f22470b;
        return (i7 - rect.left) - rect.right;
    }

    public final int n0() {
        float f10;
        if (this.f25672j0 != null) {
            f10 = 32.0f;
        } else {
            f10 = 12.0f;
        }
        return g0.L(f10);
    }

    public final int o0() {
        jv jvVar;
        StaticLayout staticLayout;
        if (this.f25672j0 == null && (staticLayout = (jvVar = this.W).f23605b) != null && staticLayout.getLineCount() != 0) {
            return Math.round(((jvVar.f23605b.getLineBaseline(0) + n0()) - (g0.L(Math.max(Math.min(10, iz.W0 - 2), (iz.W0 - 2) - this.f25678q0)) * 0.36f)) - (g0.L(18.0f) / 2.0f));
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
    public final boolean u(CharacterStyle characterStyle, int i7, wt wtVar) {
        jv jvVar = this.W;
        if (jvVar.o(characterStyle, wtVar)) {
            Rect rect = this.f22470b;
            wtVar.f26374e = ((g0.L(14.0f) + rect.left) - this.f25664b0) - jvVar.f23608f;
            wtVar.f26375f = n0() + g0.L(6.0f) + i7 + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final CharSequence y() {
        CharSequence y10 = super.y();
        String str = this.f25677p0;
        if (!TextUtils.isEmpty(str)) {
            String b10 = fj.b(str);
            if (!TextUtils.isEmpty(b10)) {
                return TextUtils.concat(y10, " (", b10, ")");
            }
        }
        return y10;
    }
}
