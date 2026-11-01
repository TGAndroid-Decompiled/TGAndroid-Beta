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
import org.telegram.ui.Components.rz0;
public final class fv extends ru {
    public final vv W;
    public final vv[] X;
    public final int Y;
    public final int Z;
    public final int f15794a0;
    public int f15795b0;
    public float f15796c0;
    public int f15797d0;
    public boolean f15798e0;
    public boolean f15799f0;
    public int f15800g0;
    public final Paint f15801h0;
    public final Path f15802i0;
    public final rz0 f15803j0;
    public Drawable f15804k0;
    public int f15805l0;
    public boolean m0;
    public final String f15806n0;
    public final SpannableString f15807o0;
    public final String f15808p0;
    public final int f15809q0;
    public int f15810r0;
    public int f15811s0;
    public VelocityTracker f15812t0;
    public OverScroller f15813u0;
    public final mg.c2 f15814v0;

    public fv(wv wvVar, Rect rect, int i10, TL_iv.pageBlockPreformatted pageblockpreformatted, fv fvVar) {
        super(wvVar, rect, i10);
        int i11;
        rz0 rz0Var;
        int i12;
        this.f15801h0 = new Paint(1);
        this.f15802i0 = new Path();
        this.f15814v0 = new mg.c2(this, 9);
        this.Y = this.f17969c;
        this.f15808p0 = pageblockpreformatted.language;
        String x10 = wv.x(pageblockpreformatted.text);
        this.f15806n0 = x10;
        if (x10 == null) {
            this.f15806n0 = "";
        }
        SpannableString spannableString = new SpannableString(this.f15806n0);
        this.f15807o0 = spannableString;
        int length = this.f15806n0.length();
        if (length > 500) {
            i11 = 3;
        } else if (length > 220) {
            i11 = 2;
        } else if (length > 80) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        this.f15809q0 = i11;
        if (spannableString.length() > 0) {
            sv svVar = new sv(this.f17967a, 8, false);
            svVar.e = i11;
            spannableString.setSpan(svVar, 0, spannableString.length(), 33);
            spannableString.setSpan(new ou(pageblockpreformatted.text, 0), 0, spannableString.length(), 33);
            if (fvVar != null) {
                CharSequence charSequence = fvVar.f15807o0;
                if (charSequence instanceof di.g) {
                    di.g gVar = (di.g) charSequence;
                    if (!gVar.f5961a) {
                        charSequence = gVar.f5962b;
                    }
                }
                if (charSequence != null && charSequence.length() > 0 && this.f15806n0.length() >= charSequence.length()) {
                    if (charSequence instanceof di.g) {
                        ((di.g) charSequence).f5962b = null;
                    }
                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) this.f15806n0.substring(charSequence.length()));
                    for (sv svVar2 : (sv[]) append.getSpans(0, append.length(), sv.class)) {
                        append.removeSpan(svVar2);
                    }
                    sv svVar3 = new sv(this.f17967a, 8, false);
                    svVar3.e = this.f15809q0;
                    append.setSpan(svVar3, 0, append.length(), 33);
                    di.i[] iVarArr = (di.i[]) append.getSpans(0, append.length(), di.i.class);
                    for (int i13 = 0; i13 < iVarArr.length; i13++) {
                        int spanStart = append.getSpanStart(iVarArr[i13]);
                        int spanStart2 = append.getSpanStart(iVarArr[i13]);
                        append.removeSpan(iVarArr[i13]);
                        append.setSpan(iVarArr[i13], spanStart, spanStart2, 33);
                    }
                    ?? fVar = new di.f(this.f15807o0);
                    fVar.f5962b = append;
                    this.f15807o0 = fVar;
                }
            }
            if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                SpannableString spannableString2 = this.f15807o0;
                di.l.c(spannableString2, spannableString2.length(), pageblockpreformatted.language);
            }
        }
        vv vvVar = new vv(wvVar, this.f15807o0, i0.L(5000.0f), Layout.Alignment.ALIGN_NORMAL, 1.22f);
        this.W = vvVar;
        this.X = new vv[]{vvVar};
        if (!TextUtils.isEmpty(this.f15808p0)) {
            this.f15803j0 = new rz0(this.f15808p0, Math.max(8, uz.W0 - 4), null);
        }
        int L = i0.L(14.0f);
        if (this.f15803j0 != null) {
            i12 = i0.L(12.0f) + ((int) Math.ceil(rz0Var.f30126c));
        } else {
            i12 = 0;
        }
        int max = Math.max(i0.L(28.0f) + L + i12, (i0.L(14.0f) * 2) + Math.max(0, vvVar.h - vvVar.f18906f));
        this.Z = max;
        int max2 = Math.max(0, max - this.Y);
        this.f15794a0 = max2;
        if (fvVar != null) {
            this.f15795b0 = Utilities.j(fvVar.f15795b0, max2, 0);
        }
    }

    @Override
    public final int H() {
        Rect rect = this.f17968b;
        return k0() + m5.D(6.0f, 2, rect.top) + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.f17968b;
        return Math.min(this.Y, this.Z) + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] K() {
        return this.X;
    }

    @Override
    public final boolean P() {
        if (!this.f15798e0) {
            OverScroller overScroller = this.f15813u0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void S() {
        this.W.i(this.V);
    }

    @Override
    public final void U() {
        this.W.f(this.V);
    }

    @Override
    public final void V(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, i0.L(6.0f));
        h0(canvas);
        j0(canvas, false, 0, 0.0f);
        i0(canvas);
        canvas.restore();
    }

    @Override
    public final void W(Canvas canvas, int i10, float f7) {
        StaticLayout staticLayout = this.W.f18904b;
        if (staticLayout != null && i10 >= 0 && i10 < staticLayout.getLineCount()) {
            canvas.save();
            canvas.translate(0.0f, i0.L(6.0f));
            h0(canvas);
            j0(canvas, true, i10, f7);
            i0(canvas);
            canvas.restore();
            return;
        }
        V(canvas);
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float L = i0.L(14.0f) - this.f15795b0;
        float m0 = m0() + i0.L(6.0f);
        if (actionMasked == 0 && o0(motionEvent.getX(), motionEvent.getY() - i0.L(6.0f))) {
            this.m0 = true;
            View view2 = this.V;
            if (view2 != null) {
                view2.invalidate();
                return true;
            }
        } else {
            int i10 = 0;
            if (this.m0) {
                if (actionMasked == 2 && !o0(motionEvent.getX(), motionEvent.getY() - i0.L(6.0f))) {
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
                    org.telegram.ui.Cells.l1 l1Var = this.f17967a.F;
                    if (actionMasked == 1 && l1Var != null) {
                        l1Var.J1(this.f15806n0, this.f15808p0);
                        return true;
                    }
                }
            } else {
                vv vvVar = this.W;
                if (actionMasked == 0) {
                    if (this.f15800g0 == 0 && (view = this.V) != null) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                        this.f15800g0 = viewConfiguration.getScaledTouchSlop();
                        this.f15810r0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f15811s0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    if (this.f15813u0 == null && this.V != null) {
                        this.f15813u0 = new OverScroller(this.V.getContext());
                    }
                    OverScroller overScroller = this.f15813u0;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f15813u0.forceFinished(true);
                    }
                    this.f15796c0 = motionEvent.getX();
                    this.f15797d0 = this.f15795b0;
                    this.f15798e0 = false;
                    VelocityTracker velocityTracker2 = this.f15812t0;
                    if (velocityTracker2 == null) {
                        this.f15812t0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f15812t0.addMovement(motionEvent);
                    motionEvent.offsetLocation(-L, -m0);
                    this.f15799f0 = vvVar.t(motionEvent);
                    motionEvent.offsetLocation(L, m0);
                    return true;
                } else if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f15812t0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float x10 = motionEvent.getX() - this.f15796c0;
                    boolean z10 = this.f15798e0;
                    int i11 = this.f15794a0;
                    if (!z10 && i11 > 0 && Math.abs(x10) > this.f15800g0) {
                        this.f15798e0 = true;
                        Z(true);
                        if (this.f15799f0) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction(3);
                            obtain.offsetLocation(-L, -m0);
                            vvVar.t(obtain);
                            obtain.recycle();
                            this.f15799f0 = false;
                        }
                    }
                    if (this.f15798e0) {
                        int i12 = (int) (this.f15797d0 - x10);
                        if (i12 >= 0) {
                            i10 = i12;
                        }
                        if (i10 <= i11) {
                            i11 = i10;
                        }
                        if (i11 != this.f15795b0) {
                            this.f15795b0 = i11;
                            Y(this.S, this.T, this.U);
                            View view5 = this.V;
                            if (view5 != null) {
                                view5.invalidate();
                                return true;
                            }
                        }
                    } else {
                        return this.f15799f0;
                    }
                } else {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z11 = this.f15798e0;
                        this.f15798e0 = false;
                        if (z11) {
                            Z(false);
                            if (actionMasked == 1 && (velocityTracker = this.f15812t0) != null && this.f15813u0 != null && this.V != null) {
                                velocityTracker.addMovement(motionEvent);
                                this.f15812t0.computeCurrentVelocity(1000, this.f15811s0);
                                float f7 = -this.f15812t0.getXVelocity();
                                if (Math.abs(f7) > this.f15810r0) {
                                    this.f15813u0.fling(this.f15795b0, 0, (int) f7, 0, 0, this.f15794a0, 0, 0);
                                    this.V.postOnAnimation(this.f15814v0);
                                }
                            }
                        }
                        if (!z11 && this.f15799f0) {
                            motionEvent.offsetLocation(-L, -m0);
                            vvVar.t(motionEvent);
                            motionEvent.offsetLocation(L, m0);
                        }
                        this.f15799f0 = false;
                        VelocityTracker velocityTracker4 = this.f15812t0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.recycle();
                            this.f15812t0 = null;
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
    public final void Y(int i10, int i11, int i12) {
        this.S = i10;
        this.T = i11;
        this.U = i12;
        int L = (i0.L(14.0f) + i10) - this.f15795b0;
        vv vvVar = this.W;
        vvVar.f18905c = L - vvVar.f18906f;
        vvVar.d = m0() + i0.L(6.0f) + i11;
        vvVar.e = i12;
    }

    @Override
    public final Layout a() {
        return this.W.f18904b;
    }

    public final void h0(Canvas canvas) {
        int i10;
        wv wvVar = this.f17967a;
        if (wvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.ml;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.ll;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, wvVar.D);
        Paint paint = this.f15801h0;
        paint.setColor(w02);
        RectF rectF = i0.P;
        rectF.set(0.0f, 0.0f, l0(), k0());
        canvas.drawRoundRect(rectF, i0.L(12.0f), i0.L(12.0f), paint);
    }

    public final void i0(Canvas canvas) {
        int i10;
        Canvas canvas2;
        int i11;
        wv wvVar = this.f17967a;
        if (wvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.Tc;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.Sc;
        }
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i10, wvVar.D));
        rz0 rz0Var = this.f15803j0;
        if (rz0Var != null) {
            rz0Var.f30136p = l0() - i0.L(54.0f);
            canvas2 = canvas;
            this.f15803j0.c(i0.L(14.0f), i0.L(17.0f), 1.0f, r12, canvas2);
        } else {
            canvas2 = canvas;
        }
        if (this.f15804k0 == null) {
            this.f15804k0 = i0.a.f(w0.f18945b, 2131232102);
        }
        if (this.f15805l0 != r12) {
            Drawable drawable = this.f15804k0;
            this.f15805l0 = r12;
            drawable.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
        }
        Drawable drawable2 = this.f15804k0;
        if (this.m0) {
            i11 = 128;
        } else {
            i11 = 255;
        }
        drawable2.setAlpha(i11);
        int l02 = l0() - i0.L(10.0f);
        int n02 = n0();
        this.f15804k0.setBounds(l02 - i0.L(18.0f), n02, l02, i0.L(18.0f) + n02);
        this.f15804k0.draw(canvas2);
    }

    public final void j0(Canvas canvas, boolean z10, int i10, float f7) {
        boolean z11;
        float f10;
        int l02 = l0();
        int k02 = k0();
        int i11 = this.f15794a0;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        canvas.save();
        Path path = this.f15802i0;
        path.rewind();
        RectF rectF = i0.P;
        float f11 = l02;
        float f12 = k02;
        rectF.set(0.0f, 0.0f, f11, f12);
        path.addRoundRect(rectF, i0.L(12.0f), i0.L(12.0f), Path.Direction.CW);
        canvas.clipPath(path);
        if (z11) {
            canvas.saveLayerAlpha(0.0f, 0.0f, f11, f12, 255, 31);
        }
        canvas.save();
        canvas.translate(i0.L(14.0f) - this.f15795b0, m0());
        vv vvVar = this.W;
        if (z10) {
            vvVar.m(canvas, i10, f7);
        } else {
            vvVar.d(canvas, vvVar.S);
        }
        canvas.restore();
        if (z11) {
            if (this.f15803j0 != null) {
                f10 = i0.L(30.0f);
            } else {
                f10 = 0.0f;
            }
            int i12 = this.f15795b0;
            wv wvVar = this.f17967a;
            if (i12 > 0) {
                rectF.set(0.0f, f10, i0.L(14.0f), f12);
                wvVar.f19350z.o(canvas, rectF, 0, Math.min(1.0f, this.f15795b0 / i0.L(14.0f)));
            }
            if (this.f15795b0 < i11) {
                rectF.set(l02 - i0.L(14.0f), f10, f11, f12);
                wvVar.f19350z.o(canvas, rectF, 2, Math.min(1.0f, (i11 - this.f15795b0) / i0.L(14.0f)));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        ru.l(spannableStringBuilder, this.W, this.X);
    }

    public final int k0() {
        return i0.L(12.0f) + this.W.f18904b.getHeight() + m0();
    }

    public final int l0() {
        int i10 = this.f17967a.C;
        Rect rect = this.f17968b;
        return (i10 - rect.left) - rect.right;
    }

    public final int m0() {
        float f7;
        if (this.f15803j0 != null) {
            f7 = 32.0f;
        } else {
            f7 = 12.0f;
        }
        return i0.L(f7);
    }

    public final int n0() {
        vv vvVar;
        StaticLayout staticLayout;
        if (this.f15803j0 == null && (staticLayout = (vvVar = this.W).f18904b) != null && staticLayout.getLineCount() != 0) {
            return Math.round(((vvVar.f18904b.getLineBaseline(0) + m0()) - (i0.L(Math.max(Math.min(10, uz.W0 - 2), (uz.W0 - 2) - this.f15809q0)) * 0.36f)) - (i0.L(18.0f) / 2.0f));
        }
        return i0.L(8.0f);
    }

    public final boolean o0(float f7, float f10) {
        int l02 = l0();
        if (f7 >= l02 - i0.L(38.0f) && f7 <= l02 && f10 >= 0.0f) {
            if (f10 <= i0.L(26.0f) + n0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i10, iu iuVar) {
        vv vvVar = this.W;
        if (vvVar.o(characterStyle, iuVar)) {
            Rect rect = this.f17968b;
            iuVar.e = ((i0.L(14.0f) + rect.left) - this.f15795b0) - vvVar.f18906f;
            iuVar.f16348f = m0() + i0.L(6.0f) + i10 + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final CharSequence y() {
        CharSequence y3 = super.y();
        String str = this.f15808p0;
        if (!TextUtils.isEmpty(str)) {
            String b10 = hj.b(str);
            if (!TextUtils.isEmpty(b10)) {
                return TextUtils.concat(y3, " (", b10, ")");
            }
        }
        return y3;
    }
}
