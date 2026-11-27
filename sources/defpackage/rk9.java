package defpackage;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_iv;
public final class rk9 extends dk9 {
    public final gl9 X;
    public final gl9[] Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public int c0;
    public float d0;
    public int e0;
    public boolean f0;
    public boolean g0;
    public int h0;
    public final Paint i0;
    public final Path j0;
    public final pkb k0;
    public Drawable l0;
    public int m0;
    public boolean n0;
    public final String o0;
    public final SpannableString p0;
    public final String q0;
    public final int r0;
    public int s0;
    public int t0;
    public VelocityTracker u0;
    public OverScroller v0;
    public final ki7 w0;

    public rk9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockPreformatted pageblockpreformatted, rk9 rk9Var) {
        super(hl9Var, rect, i);
        int i2;
        pkb pkbVar;
        int i3;
        StaticLayout staticLayout;
        this.i0 = new Paint(1);
        this.j0 = new Path();
        this.w0 = new ki7(this, (byte) 19);
        this.Z = this.c;
        this.q0 = pageblockpreformatted.language;
        String w = hl9.w(pageblockpreformatted.text);
        this.o0 = w;
        SpannableString spannableString = new SpannableString(w);
        this.p0 = spannableString;
        int length = w.length();
        if (length > 500) {
            i2 = 3;
        } else if (length > 220) {
            i2 = 2;
        } else if (length > 80) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.r0 = i2;
        if (spannableString.length() > 0) {
            el9 el9Var = new el9(this.a, 8, false);
            el9Var.e = i2;
            spannableString.setSpan(el9Var, 0, spannableString.length(), 33);
            spannableString.setSpan(new bk9(pageblockpreformatted.text, 0), 0, spannableString.length(), 33);
            if (rk9Var != null) {
                CharSequence charSequence = rk9Var.p0;
                if (charSequence instanceof hk2) {
                    hk2 hk2Var = (hk2) charSequence;
                    if (!hk2Var.a) {
                        charSequence = hk2Var.c;
                    }
                }
                if (charSequence != null && charSequence.length() > 0 && w.length() >= charSequence.length()) {
                    if (charSequence instanceof hk2) {
                        ((hk2) charSequence).c = null;
                    }
                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) w.substring(charSequence.length()));
                    for (el9 el9Var2 : (el9[]) append.getSpans(0, append.length(), el9.class)) {
                        append.removeSpan(el9Var2);
                    }
                    el9 el9Var3 = new el9(this.a, 8, false);
                    el9Var3.e = this.r0;
                    append.setSpan(el9Var3, 0, append.length(), 33);
                    jk2[] jk2VarArr = (jk2[]) append.getSpans(0, append.length(), jk2.class);
                    for (int i4 = 0; i4 < jk2VarArr.length; i4++) {
                        int spanStart = append.getSpanStart(jk2VarArr[i4]);
                        int spanStart2 = append.getSpanStart(jk2VarArr[i4]);
                        append.removeSpan(jk2VarArr[i4]);
                        append.setSpan(jk2VarArr[i4], spanStart, spanStart2, 33);
                    }
                    ?? gk2Var = new gk2(this.p0);
                    gk2Var.c = append;
                    this.p0 = gk2Var;
                }
            }
            if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                SpannableString spannableString2 = this.p0;
                mk2.c(spannableString2, spannableString2.length(), pageblockpreformatted.language);
            }
        }
        gl9 gl9Var = new gl9(hl9Var, this.p0, hl.L(5000.0f), Layout.Alignment.ALIGN_NORMAL, 1.22f);
        this.X = gl9Var;
        this.Y = new gl9[]{gl9Var};
        if (!TextUtils.isEmpty(this.q0)) {
            this.k0 = new pkb(this.q0, Math.max(8, xea.S0 - 4), null);
        }
        int L = hl.L(14.0f);
        if (this.k0 != null) {
            i3 = hl.L(12.0f) + ((int) Math.ceil(pkbVar.c));
        } else {
            i3 = 0;
        }
        int L2 = hl.L(28.0f) + L + i3;
        int max = Math.max(0, gl9Var.h - gl9Var.f) + (hl.L(14.0f) << 1);
        if (this.k0 == null && (staticLayout = gl9Var.b) != null && staticLayout.getLineCount() > 0) {
            max = qu6.e(36.0f, hl.L(14.0f) + (((int) Math.ceil(gl9Var.b.getLineRight(0))) - gl9Var.f), max);
        }
        int max2 = Math.max(L2, max);
        this.a0 = max2;
        int max3 = Math.max(0, max2 - this.Z);
        this.b0 = max3;
        if (rk9Var != null) {
            this.c0 = Utilities.j(rk9Var.c0, max3, 0);
        }
    }

    @Override
    public final int H() {
        Rect rect = this.b;
        return k0() + rect.top + (hl.L(6.0f) << 1) + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.b;
        return Math.min(this.Z, this.a0) + rect.left + rect.right;
    }

    @Override
    public final kmb[] K() {
        return this.Y;
    }

    @Override
    public final boolean P() {
        if (!this.f0) {
            OverScroller overScroller = this.v0;
            if (overScroller == null || overScroller.isFinished()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void S() {
        this.X.i(this.W);
    }

    @Override
    public final void U() {
        this.X.f(this.W);
    }

    @Override
    public final void V(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, hl.L(6.0f));
        h0(canvas);
        j0(canvas, false, 0, 0.0f);
        i0(canvas);
        canvas.restore();
    }

    @Override
    public final void W(Canvas canvas, int i, float f) {
        StaticLayout staticLayout = this.X.b;
        if (staticLayout != null && i >= 0 && i < staticLayout.getLineCount()) {
            canvas.save();
            canvas.translate(0.0f, hl.L(6.0f));
            h0(canvas);
            j0(canvas, true, i, f);
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
        float L = hl.L(14.0f) - this.c0;
        float m0 = m0() + hl.L(6.0f);
        if (actionMasked == 0 && o0(motionEvent.getX(), motionEvent.getY() - hl.L(6.0f))) {
            this.n0 = true;
            View view2 = this.W;
            if (view2 != null) {
                view2.invalidate();
                return true;
            }
        } else {
            int i = 0;
            if (this.n0) {
                if (actionMasked == 2 && !o0(motionEvent.getX(), motionEvent.getY() - hl.L(6.0f))) {
                    this.n0 = false;
                    View view3 = this.W;
                    if (view3 != null) {
                        view3.invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    this.n0 = false;
                    View view4 = this.W;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                    rb2 rb2Var = this.a.F;
                    if (actionMasked == 1 && rb2Var != null) {
                        rb2Var.K1(this.o0, this.q0);
                        return true;
                    }
                }
            } else {
                gl9 gl9Var = this.X;
                if (actionMasked == 0) {
                    if (this.h0 == 0 && (view = this.W) != null) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                        this.h0 = viewConfiguration.getScaledTouchSlop();
                        this.s0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.t0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    OverScroller overScroller = this.v0;
                    if (overScroller == null && this.W != null) {
                        overScroller = new OverScroller(this.W.getContext());
                        this.v0 = overScroller;
                    }
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.v0.forceFinished(true);
                    }
                    this.d0 = motionEvent.getX();
                    this.e0 = this.c0;
                    this.f0 = false;
                    VelocityTracker velocityTracker2 = this.u0;
                    if (velocityTracker2 == null) {
                        this.u0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.u0.addMovement(motionEvent);
                    motionEvent.offsetLocation(-L, -m0);
                    this.g0 = gl9Var.t(motionEvent);
                    motionEvent.offsetLocation(L, m0);
                    return true;
                } else if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.u0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float x = motionEvent.getX() - this.d0;
                    boolean z = this.f0;
                    int i2 = this.b0;
                    if (!z && i2 > 0 && Math.abs(x) > this.h0) {
                        this.f0 = true;
                        Z(true);
                        if (this.g0) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction(3);
                            obtain.offsetLocation(-L, -m0);
                            gl9Var.t(obtain);
                            obtain.recycle();
                            this.g0 = false;
                        }
                    }
                    if (this.f0) {
                        int i3 = (int) (this.e0 - x);
                        if (i3 >= 0) {
                            i = i3;
                        }
                        if (i <= i2) {
                            i2 = i;
                        }
                        if (i2 != this.c0) {
                            this.c0 = i2;
                            Y(this.T, this.U, this.V);
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                                return true;
                            }
                        }
                    } else {
                        return this.g0;
                    }
                } else {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z2 = this.f0;
                        this.f0 = false;
                        if (z2) {
                            Z(false);
                            if (actionMasked == 1 && (velocityTracker = this.u0) != null && this.v0 != null && this.W != null) {
                                velocityTracker.addMovement(motionEvent);
                                this.u0.computeCurrentVelocity(1000, this.t0);
                                float f = -this.u0.getXVelocity();
                                if (Math.abs(f) > this.s0) {
                                    this.v0.fling(this.c0, 0, (int) f, 0, 0, this.b0, 0, 0);
                                    this.W.postOnAnimation(this.w0);
                                }
                            }
                        }
                        if (!z2 && this.g0) {
                            motionEvent.offsetLocation(-L, -m0);
                            gl9Var.t(motionEvent);
                            motionEvent.offsetLocation(L, m0);
                        }
                        this.g0 = false;
                        VelocityTracker velocityTracker4 = this.u0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.recycle();
                            this.u0 = null;
                        }
                        if (z2 || actionMasked == 1) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public final void Y(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        int L = (hl.L(14.0f) + i) - this.c0;
        gl9 gl9Var = this.X;
        gl9Var.c = L - gl9Var.f;
        gl9Var.d = m0() + hl.L(6.0f) + i2;
        gl9Var.e = i3;
    }

    @Override
    public final Layout a() {
        return this.X.b;
    }

    public final void h0(Canvas canvas) {
        int i;
        hl9 hl9Var = this.a;
        if (hl9Var.D()) {
            i = aob.pl;
        } else {
            i = aob.ol;
        }
        int v0 = aob.v0(i, hl9Var.D);
        Paint paint = this.i0;
        paint.setColor(v0);
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, l0(), k0());
        canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), paint);
    }

    public final void i0(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        hl9 hl9Var = this.a;
        if (hl9Var.D()) {
            i = aob.Wc;
        } else {
            i = aob.Vc;
        }
        int p1 = aob.p1(0.5f, aob.v0(i, hl9Var.D));
        pkb pkbVar = this.k0;
        if (pkbVar != null) {
            pkbVar.p = l0() - hl.L(54.0f);
            canvas2 = canvas;
            this.k0.c(hl.L(14.0f), hl.L(17.0f), 1.0f, p1, canvas2);
        } else {
            canvas2 = canvas;
        }
        Drawable drawable = this.l0;
        if (drawable == null) {
            drawable = c00.e(a.b, 2131232108);
            this.l0 = drawable;
        }
        if (this.m0 != p1) {
            this.m0 = p1;
            drawable.setColorFilter(new PorterDuffColorFilter(p1, PorterDuff.Mode.SRC_IN));
        }
        Drawable drawable2 = this.l0;
        if (this.n0) {
            i2 = 128;
        } else {
            i2 = 255;
        }
        drawable2.setAlpha(i2);
        int l0 = l0() - hl.L(10.0f);
        int n0 = n0();
        this.l0.setBounds(l0 - hl.L(18.0f), n0, l0, hl.L(18.0f) + n0);
        this.l0.draw(canvas2);
    }

    @Override
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        dk9.k(spannableStringBuilder, this.X, this.Y);
    }

    public final void j0(Canvas canvas, boolean z, int i, float f) {
        boolean z2;
        float f2;
        int l0 = l0();
        int k0 = k0();
        int i2 = this.b0;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        canvas.save();
        Path path = this.j0;
        path.rewind();
        RectF rectF = hl.P;
        float f3 = l0;
        float f4 = k0;
        rectF.set(0.0f, 0.0f, f3, f4);
        path.addRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), Path.Direction.CW);
        canvas.clipPath(path);
        if (z2) {
            canvas.saveLayerAlpha(0.0f, 0.0f, f3, f4, 255, 31);
        }
        canvas.save();
        canvas.translate(hl.L(14.0f) - this.c0, m0());
        gl9 gl9Var = this.X;
        if (z) {
            gl9Var.m(canvas, i, f);
        } else {
            gl9Var.d(canvas, gl9Var.T);
        }
        canvas.restore();
        if (z2) {
            if (this.k0 != null) {
                f2 = hl.L(30.0f);
            } else {
                f2 = 0.0f;
            }
            int i3 = this.c0;
            hl9 hl9Var = this.a;
            if (i3 > 0) {
                rectF.set(0.0f, f2, hl.L(14.0f), f4);
                hl9Var.z.r(canvas, rectF, 0, Math.min(1.0f, this.c0 / hl.L(14.0f)));
            }
            if (this.c0 < i2) {
                rectF.set(l0 - hl.L(14.0f), f2, f3, f4);
                hl9Var.z.r(canvas, rectF, 2, Math.min(1.0f, (i2 - this.c0) / hl.L(14.0f)));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public final int k0() {
        return hl.L(12.0f) + this.X.b.getHeight() + m0();
    }

    public final int l0() {
        int i = this.a.C;
        Rect rect = this.b;
        return (i - rect.left) - rect.right;
    }

    public final int m0() {
        float f;
        if (this.k0 != null) {
            f = 32.0f;
        } else {
            f = 12.0f;
        }
        return hl.L(f);
    }

    public final int n0() {
        gl9 gl9Var;
        StaticLayout staticLayout;
        if (this.k0 == null && (staticLayout = (gl9Var = this.X).b) != null && staticLayout.getLineCount() != 0) {
            return Math.round(((gl9Var.b.getLineBaseline(0) + m0()) - (hl.L(Math.max(Math.min(10, xea.S0 - 2), (xea.S0 - 2) - this.r0)) * 0.36f)) - (hl.L(18.0f) / 2.0f));
        }
        return hl.L(8.0f);
    }

    public final boolean o0(float f, float f2) {
        int l0 = l0();
        if (f >= l0 - hl.L(38.0f) && f <= l0 && f2 >= 0.0f) {
            if (f2 <= hl.L(26.0f) + n0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean t(CharacterStyle characterStyle, int i, vj9 vj9Var) {
        gl9 gl9Var = this.X;
        if (gl9Var.o(characterStyle, vj9Var)) {
            Rect rect = this.b;
            vj9Var.e = ((hl.L(14.0f) + rect.left) - this.c0) - gl9Var.f;
            int i2 = i + rect.top;
            vj9Var.f = m0() + hl.L(6.0f) + i2;
            return true;
        }
        return false;
    }

    @Override
    public final CharSequence x() {
        CharSequence x = super.x();
        String str = this.q0;
        if (!TextUtils.isEmpty(str)) {
            String b = o47.b(str);
            if (!TextUtils.isEmpty(b)) {
                return TextUtils.concat(x, " (", b, ")");
            }
        }
        return x;
    }
}
