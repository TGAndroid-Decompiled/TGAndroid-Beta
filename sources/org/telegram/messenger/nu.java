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
import org.telegram.ui.Components.wy0;
public final class nu extends zt {
    public final dv X;
    public final dv[] Y;
    public final int Z;
    public final int f26064a0;
    public final int f26065b0;
    public int f26066c0;
    public float f26067d0;
    public int f26068e0;
    public boolean f26069f0;
    public boolean f26070g0;
    public int f26071h0;
    public final Paint f26072i0;
    public final Path f26073j0;
    public final wy0 f26074k0;
    public Drawable f26075l0;
    public int m0;
    public boolean f26076n0;
    public final String f26077o0;
    public final SpannableString f26078p0;
    public final String f26079q0;
    public final int f26080r0;
    public int f26081s0;
    public int f26082t0;
    public VelocityTracker f26083u0;
    public OverScroller f26084v0;
    public final i6.g f26085w0;

    public nu(ev evVar, Rect rect, int i7, TL_iv.pageBlockPreformatted pageblockpreformatted, nu nuVar) {
        super(evVar, rect, i7);
        int i10;
        wy0 wy0Var;
        int i11;
        StaticLayout staticLayout;
        this.f26072i0 = new Paint(1);
        this.f26073j0 = new Path();
        this.f26085w0 = new i6.g(this, 15);
        this.Z = this.f28443c;
        this.f26079q0 = pageblockpreformatted.language;
        String x10 = ev.x(pageblockpreformatted.text);
        this.f26077o0 = x10;
        if (x10 == null) {
            this.f26077o0 = "";
        }
        SpannableString spannableString = new SpannableString(this.f26077o0);
        this.f26078p0 = spannableString;
        int length = this.f26077o0.length();
        if (length > 500) {
            i10 = 3;
        } else if (length > 220) {
            i10 = 2;
        } else if (length > 80) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f26080r0 = i10;
        if (spannableString.length() > 0) {
            av avVar = new av(this.f28441a, 8, false);
            avVar.f23083e = i10;
            spannableString.setSpan(avVar, 0, spannableString.length(), 33);
            spannableString.setSpan(new wt(pageblockpreformatted.text, 0), 0, spannableString.length(), 33);
            if (nuVar != null) {
                CharSequence charSequence = nuVar.f26078p0;
                if (charSequence instanceof qi.e) {
                    qi.e eVar = (qi.e) charSequence;
                    if (!eVar.f56298a) {
                        charSequence = eVar.f56299b;
                    }
                }
                if (charSequence != null && charSequence.length() > 0 && this.f26077o0.length() >= charSequence.length()) {
                    if (charSequence instanceof qi.e) {
                        ((qi.e) charSequence).f56299b = null;
                    }
                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) this.f26077o0.substring(charSequence.length()));
                    for (av avVar2 : (av[]) append.getSpans(0, append.length(), av.class)) {
                        append.removeSpan(avVar2);
                    }
                    av avVar3 = new av(this.f28441a, 8, false);
                    avVar3.f23083e = this.f26080r0;
                    append.setSpan(avVar3, 0, append.length(), 33);
                    qi.g[] gVarArr = (qi.g[]) append.getSpans(0, append.length(), qi.g.class);
                    for (int i12 = 0; i12 < gVarArr.length; i12++) {
                        int spanStart = append.getSpanStart(gVarArr[i12]);
                        int spanStart2 = append.getSpanStart(gVarArr[i12]);
                        append.removeSpan(gVarArr[i12]);
                        append.setSpan(gVarArr[i12], spanStart, spanStart2, 33);
                    }
                    ?? dVar = new qi.d(this.f26078p0);
                    dVar.f56299b = append;
                    this.f26078p0 = dVar;
                }
            }
            if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                SpannableString spannableString2 = this.f26078p0;
                qi.j.c(spannableString2, spannableString2.length(), pageblockpreformatted.language);
            }
        }
        dv dvVar = new dv(evVar, this.f26078p0, g0.L(5000.0f), Layout.Alignment.ALIGN_NORMAL, 1.22f);
        this.X = dvVar;
        this.Y = new dv[]{dvVar};
        if (!TextUtils.isEmpty(this.f26079q0)) {
            this.f26074k0 = new wy0(this.f26079q0, Math.max(8, bz.W0 - 4), null);
        }
        int L = g0.L(14.0f);
        if (this.f26074k0 != null) {
            i11 = g0.L(12.0f) + ((int) Math.ceil(wy0Var.f41763c));
        } else {
            i11 = 0;
        }
        int L2 = g0.L(28.0f) + L + i11;
        int D = f3.D(14.0f, 2, Math.max(0, dvVar.h - dvVar.f23709f));
        if (this.f26074k0 == null && (staticLayout = dvVar.f23706b) != null && staticLayout.getLineCount() > 0) {
            D = f3.b(36.0f, g0.L(14.0f) + (((int) Math.ceil(dvVar.f23706b.getLineRight(0))) - dvVar.f23709f), D);
        }
        int max = Math.max(L2, D);
        this.f26064a0 = max;
        int max2 = Math.max(0, max - this.Z);
        this.f26065b0 = max2;
        if (nuVar != null) {
            this.f26066c0 = Utilities.j(nuVar.f26066c0, max2, 0);
        }
    }

    @Override
    public final int I() {
        Rect rect = this.f28442b;
        return l0() + f3.D(6.0f, 2, rect.top) + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f28442b;
        return Math.min(this.Z, this.f26064a0) + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.t9[] L() {
        return this.Y;
    }

    @Override
    public final boolean Q() {
        if (!this.f26069f0) {
            OverScroller overScroller = this.f26084v0;
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
        StaticLayout staticLayout = this.X.f23706b;
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
        float L = g0.L(14.0f) - this.f26066c0;
        float n02 = n0() + g0.L(6.0f);
        if (actionMasked == 0 && p0(motionEvent.getX(), motionEvent.getY() - g0.L(6.0f))) {
            this.f26076n0 = true;
            View view2 = this.W;
            if (view2 != null) {
                view2.invalidate();
                return true;
            }
        } else {
            int i7 = 0;
            if (this.f26076n0) {
                if (actionMasked == 2 && !p0(motionEvent.getX(), motionEvent.getY() - g0.L(6.0f))) {
                    this.f26076n0 = false;
                    View view3 = this.W;
                    if (view3 != null) {
                        view3.invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    this.f26076n0 = false;
                    View view4 = this.W;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                    org.telegram.ui.Cells.m1 m1Var = this.f28441a.F;
                    if (actionMasked == 1 && m1Var != null) {
                        m1Var.e2(this.f26077o0, this.f26079q0);
                        return true;
                    }
                }
            } else {
                dv dvVar = this.X;
                if (actionMasked == 0) {
                    if (this.f26071h0 == 0 && (view = this.W) != null) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                        this.f26071h0 = viewConfiguration.getScaledTouchSlop();
                        this.f26081s0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f26082t0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    if (this.f26084v0 == null && this.W != null) {
                        this.f26084v0 = new OverScroller(this.W.getContext());
                    }
                    OverScroller overScroller = this.f26084v0;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f26084v0.forceFinished(true);
                    }
                    this.f26067d0 = motionEvent.getX();
                    this.f26068e0 = this.f26066c0;
                    this.f26069f0 = false;
                    VelocityTracker velocityTracker2 = this.f26083u0;
                    if (velocityTracker2 == null) {
                        this.f26083u0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f26083u0.addMovement(motionEvent);
                    motionEvent.offsetLocation(-L, -n02);
                    this.f26070g0 = dvVar.t(motionEvent);
                    motionEvent.offsetLocation(L, n02);
                    return true;
                } else if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f26083u0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float x10 = motionEvent.getX() - this.f26067d0;
                    boolean z10 = this.f26069f0;
                    int i10 = this.f26065b0;
                    if (!z10 && i10 > 0 && Math.abs(x10) > this.f26071h0) {
                        this.f26069f0 = true;
                        a0(true);
                        if (this.f26070g0) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction(3);
                            obtain.offsetLocation(-L, -n02);
                            dvVar.t(obtain);
                            obtain.recycle();
                            this.f26070g0 = false;
                        }
                    }
                    if (this.f26069f0) {
                        int i11 = (int) (this.f26068e0 - x10);
                        if (i11 >= 0) {
                            i7 = i11;
                        }
                        if (i7 <= i10) {
                            i10 = i7;
                        }
                        if (i10 != this.f26066c0) {
                            this.f26066c0 = i10;
                            Z(this.T, this.U, this.V);
                            View view5 = this.W;
                            if (view5 != null) {
                                view5.invalidate();
                                return true;
                            }
                        }
                    } else {
                        return this.f26070g0;
                    }
                } else {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z11 = this.f26069f0;
                        this.f26069f0 = false;
                        if (z11) {
                            a0(false);
                            if (actionMasked == 1 && (velocityTracker = this.f26083u0) != null && this.f26084v0 != null && this.W != null) {
                                velocityTracker.addMovement(motionEvent);
                                this.f26083u0.computeCurrentVelocity(1000, this.f26082t0);
                                float f10 = -this.f26083u0.getXVelocity();
                                if (Math.abs(f10) > this.f26081s0) {
                                    this.f26084v0.fling(this.f26066c0, 0, (int) f10, 0, 0, this.f26065b0, 0, 0);
                                    this.W.postOnAnimation(this.f26085w0);
                                }
                            }
                        }
                        if (!z11 && this.f26070g0) {
                            motionEvent.offsetLocation(-L, -n02);
                            dvVar.t(motionEvent);
                            motionEvent.offsetLocation(L, n02);
                        }
                        this.f26070g0 = false;
                        VelocityTracker velocityTracker4 = this.f26083u0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.recycle();
                            this.f26083u0 = null;
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
        int L = (g0.L(14.0f) + i7) - this.f26066c0;
        dv dvVar = this.X;
        dvVar.f23707c = L - dvVar.f23709f;
        dvVar.d = n0() + g0.L(6.0f) + i10;
        dvVar.f23708e = i11;
    }

    @Override
    public final Layout a() {
        return this.X.f23706b;
    }

    public final void i0(Canvas canvas) {
        int i7;
        ev evVar = this.f28441a;
        if (evVar.E()) {
            i7 = org.telegram.ui.ActionBar.n6.pl;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.ol;
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, evVar.D);
        Paint paint = this.f26072i0;
        paint.setColor(w02);
        RectF rectF = g0.P;
        rectF.set(0.0f, 0.0f, m0(), l0());
        canvas.drawRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), paint);
    }

    public final void j0(Canvas canvas) {
        int i7;
        Canvas canvas2;
        int i10;
        ev evVar = this.f28441a;
        if (evVar.E()) {
            i7 = org.telegram.ui.ActionBar.n6.Wc;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.Vc;
        }
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(i7, evVar.D));
        wy0 wy0Var = this.f26074k0;
        if (wy0Var != null) {
            wy0Var.f41774p = m0() - g0.L(54.0f);
            canvas2 = canvas;
            this.f26074k0.c(g0.L(14.0f), g0.L(17.0f), 1.0f, r12, canvas2);
        } else {
            canvas2 = canvas;
        }
        if (this.f26075l0 == null) {
            this.f26075l0 = i5.c.g(t0.f27013b, 2131232108);
        }
        if (this.m0 != r12) {
            Drawable drawable = this.f26075l0;
            this.m0 = r12;
            drawable.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
        }
        Drawable drawable2 = this.f26075l0;
        if (this.f26076n0) {
            i10 = 128;
        } else {
            i10 = 255;
        }
        drawable2.setAlpha(i10);
        int m0 = m0() - g0.L(10.0f);
        int o02 = o0();
        this.f26075l0.setBounds(m0 - g0.L(18.0f), o02, m0, g0.L(18.0f) + o02);
        this.f26075l0.draw(canvas2);
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        zt.l(spannableStringBuilder, this.X, this.Y);
    }

    public final void k0(Canvas canvas, boolean z10, int i7, float f10) {
        boolean z11;
        float f11;
        int m0 = m0();
        int l02 = l0();
        int i10 = this.f26065b0;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        canvas.save();
        Path path = this.f26073j0;
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
        canvas.translate(g0.L(14.0f) - this.f26066c0, n0());
        dv dvVar = this.X;
        if (z10) {
            dvVar.m(canvas, i7, f10);
        } else {
            dvVar.d(canvas, dvVar.T);
        }
        canvas.restore();
        if (z11) {
            if (this.f26074k0 != null) {
                f11 = g0.L(30.0f);
            } else {
                f11 = 0.0f;
            }
            int i11 = this.f26066c0;
            ev evVar = this.f28441a;
            if (i11 > 0) {
                rectF.set(0.0f, f11, g0.L(14.0f), f13);
                evVar.f23894z.u(canvas, rectF, 0, Math.min(1.0f, this.f26066c0 / g0.L(14.0f)));
            }
            if (this.f26066c0 < i10) {
                rectF.set(m0 - g0.L(14.0f), f11, f12, f13);
                evVar.f23894z.u(canvas, rectF, 2, Math.min(1.0f, (i10 - this.f26066c0) / g0.L(14.0f)));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public final int l0() {
        return g0.L(12.0f) + this.X.f23706b.getHeight() + n0();
    }

    public final int m0() {
        int i7 = this.f28441a.C;
        Rect rect = this.f28442b;
        return (i7 - rect.left) - rect.right;
    }

    public final int n0() {
        float f10;
        if (this.f26074k0 != null) {
            f10 = 32.0f;
        } else {
            f10 = 12.0f;
        }
        return g0.L(f10);
    }

    public final int o0() {
        dv dvVar;
        StaticLayout staticLayout;
        if (this.f26074k0 == null && (staticLayout = (dvVar = this.X).f23706b) != null && staticLayout.getLineCount() != 0) {
            return Math.round(((dvVar.f23706b.getLineBaseline(0) + n0()) - (g0.L(Math.max(Math.min(10, bz.W0 - 2), (bz.W0 - 2) - this.f26080r0)) * 0.36f)) - (g0.L(18.0f) / 2.0f));
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
    public final boolean u(CharacterStyle characterStyle, int i7, qt qtVar) {
        dv dvVar = this.X;
        if (dvVar.o(characterStyle, qtVar)) {
            Rect rect = this.f28442b;
            qtVar.f26562e = ((g0.L(14.0f) + rect.left) - this.f26066c0) - dvVar.f23709f;
            qtVar.f26563f = n0() + g0.L(6.0f) + i7 + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final CharSequence y() {
        CharSequence y10 = super.y();
        String str = this.f26079q0;
        if (!TextUtils.isEmpty(str)) {
            String b10 = cj.b(str);
            if (!TextUtils.isEmpty(b10)) {
                return TextUtils.concat(y10, " (", b10, ")");
            }
        }
        return y10;
    }
}
