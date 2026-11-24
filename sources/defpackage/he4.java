package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public abstract class he4 extends FrameLayout {
    public boolean A0;
    public float B0;
    public ValueAnimator C0;
    public wf3 D0;
    public boolean E;
    public wf3 E0;
    public boolean F;
    public il0 F0;
    public final fu G;
    public final Path G0;
    public final int H;
    public final xe2 I;
    public final s20 J;
    public ce4 K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public float Q;
    public int R;
    public int S;
    public int T;
    public final GradientDrawable U;
    public int V;
    public int W;
    public final wjb a;
    public int a0;
    public final TextPaint b;
    public int b0;
    public final TextPaint c;
    public int c0;
    public final TextPaint d;
    public int d0;
    public final Paint e;
    public int e0;
    public PorterDuffColorFilter f;
    public int f0;
    public int g0;
    public final ArrayList h;
    public int h0;
    public boolean i0;
    public final s33 j0;
    public final SparseIntArray k0;
    public final SparseIntArray l0;
    public final SparseIntArray m0;
    public boolean n;
    public final SparseIntArray n0;
    public final SparseIntArray o0;
    public final SparseIntArray p0;
    public float q0;
    public long r;
    public int r0;
    public boolean s;
    public int s0;
    public final zd4 t0;
    public Drawable u0;
    public int v0;
    public float w;
    public final ez3 w0;
    public float x;
    public float x0;
    public AnimatorSet y;
    public final v10 y0;
    public jo0 z0;

    public he4(Context context, wjb wjbVar) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.e = new Paint(1);
        this.f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.M = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.V = bkb.J8;
        this.W = bkb.H8;
        this.a0 = bkb.I8;
        this.b0 = bkb.K8;
        this.c0 = bkb.r8;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.j0 = s33.h;
        this.k0 = new SparseIntArray(5);
        this.l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.n0 = new SparseIntArray(5);
        this.o0 = new SparseIntArray(5);
        this.p0 = new SparseIntArray(5);
        this.w0 = new ez3(this, (byte) 2);
        this.y0 = new v10(this, (byte) 3);
        this.G0 = new Path();
        this.a = wjbVar;
        textPaint2.setTextSize(gl.N(11.0f));
        textPaint2.setTypeface(gl.o());
        textPaint.setTextSize(gl.N(14.0f));
        textPaint.setTypeface(gl.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(gl.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.U = gradientDrawable;
        float N = gl.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        gradientDrawable.setColor(bkb.v0(this.V, wjbVar));
        setHorizontalScrollBarEnabled(false);
        fu fuVar = new fu((byte) 18, context, this);
        this.G = fuVar;
        fuVar.setClipChildren(false);
        zd4 zd4Var = new zd4(this);
        this.t0 = zd4Var;
        zd4Var.C = false;
        fuVar.setItemAnimator(zd4Var);
        fuVar.setSelectorType(9);
        fuVar.setSelectorRadius(6);
        zkb.l(fuVar, 20, this.b0, wjbVar);
        xe2 xe2Var = new xe2((ViewGroup) this, (byte) 1);
        this.I = xe2Var;
        fuVar.setLayoutManager(xe2Var);
        new is5(new ge4(this)).h(fuVar);
        int max = Math.max(0, gl.L(11.5f));
        this.H = max;
        fuVar.setPadding(max, 0, max, 0);
        fuVar.setClipToPadding(false);
        fuVar.setDrawSelectorBehind(true);
        s20 s20Var = new s20(this, context, (byte) 4);
        this.J = s20Var;
        s20Var.C(true);
        fuVar.setAdapter(s20Var);
        fuVar.setOnItemClickListener(new xd4(this));
        fuVar.setOnItemLongClickListener(new xd4(this));
        fuVar.setOnScrollListener(new ao2(this, (byte) 11));
        fuVar.z2 = true;
        fuVar.setOverScrollMode(2);
        addView(fuVar, nme.e(-1, 36, 48));
    }

    private void setUnreadOnlyBannerProgress(float f) {
        int i;
        if (this.B0 != f) {
            this.B0 = f;
            jo0 jo0Var = this.z0;
            if (jo0Var != null) {
                jo0Var.setAlpha(f);
                jo0 jo0Var2 = this.z0;
                if (f > 0.0f) {
                    i = 0;
                } else {
                    i = 8;
                }
                jo0Var2.setVisibility(i);
                this.z0.setClickable(this.A0);
            }
            requestLayout();
            invalidate();
            wf3 wf3Var = this.E0;
            if (wf3Var != null) {
                wf3Var.run();
            }
        }
    }

    public final void a(int i, int i2, String str, ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.M == -1) {
            this.M = i;
        }
        this.k0.put(size, i);
        this.l0.put(size, i2);
        this.m0.put(i, size);
        int i3 = this.M;
        if (i3 != -1 && i3 == i) {
            this.L = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.b;
        de4 de4Var = new de4(this, i, k27.A5(vu3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), arrayList, textPaint.getFontMetricsInt(), false), z);
        de4Var.e = z2;
        de4Var.f = z3;
        this.N = de9.w(24.0f, de4Var.a(true), this.N);
        arrayList2.add(de4Var);
    }

    public final void b(int i, int i2, int i3, int i4, int i5) {
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d0 = i;
        this.e0 = i2;
        this.f0 = i3;
        this.g0 = i5;
        this.b0 = i4;
        zkb.J(this.G, i4, this.a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.y0, 0.0f, 1.0f));
        this.y.setDuration(320L);
        this.y.addListener(new be4(this, (byte) 1));
        this.y.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he4.c():void");
    }

    public final de4 d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                if (((de4) arrayList.get(i)).e) {
                    return (de4) arrayList.get(i);
                }
                i++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.clipPath(this.G0);
        super.dispatchDraw(canvas);
        if (this.B0 > 0.0f && this.z0 != null) {
            int alpha = bkb.j0.getAlpha();
            bkb.j0.setAlpha((int) (alpha * this.B0));
            float top = this.z0.getTop();
            canvas2 = canvas;
            canvas2.drawLine(gl.L(9.0f), top, getMeasuredWidth() - gl.L(9.0f), top, bkb.j0);
            bkb.j0.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        float f;
        float f2;
        float f3;
        s49 K;
        int i;
        int i2;
        float L;
        float f4;
        float measuredWidth;
        boolean drawChild = super.drawChild(canvas, view, j);
        fu fuVar = this.G;
        if (view == fuVar) {
            getMeasuredHeight();
            int alpha = (int) (fuVar.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.U;
            gradientDrawable.setAlpha(alpha);
            if (!this.P && this.R == -1) {
                s49 K2 = fuVar.K(this.L);
                if (K2 != null) {
                    fe4 fe4Var = (fe4) K2.a;
                    if (fe4Var.a0) {
                        f4 = gl.R1(fe4Var.j0, fe4Var.d, fe4Var.y);
                    } else {
                        f4 = fe4Var.d;
                    }
                    f3 = Math.max(gl.L(16.0f), f4);
                    if (fe4Var.a0) {
                        measuredWidth = gl.R1(fe4Var.j0 + gl.L(20.0f), fe4Var.getMeasuredWidth(), fe4Var.y);
                    } else {
                        measuredWidth = fe4Var.getMeasuredWidth();
                    }
                    f2 = (int) oo1.z(measuredWidth, f3, 2.0f, fe4Var.getX());
                } else {
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
                f = 2.0f;
            } else {
                int K0 = this.I.K0();
                if (K0 != -1 && (K = fuVar.K(K0)) != null) {
                    if (this.P) {
                        i = this.r0;
                        i2 = this.L;
                    } else {
                        i = this.L;
                        i2 = this.R;
                    }
                    SparseIntArray sparseIntArray = this.p0;
                    int i3 = sparseIntArray.get(i);
                    int i4 = sparseIntArray.get(i2);
                    SparseIntArray sparseIntArray2 = this.n0;
                    f = 2.0f;
                    int i5 = sparseIntArray2.get(i);
                    int i6 = sparseIntArray2.get(i2);
                    SparseIntArray sparseIntArray3 = this.o0;
                    sparseIntArray3.get(i);
                    sparseIntArray3.get(i2);
                    if (this.O != 0) {
                        L = gl.L(12.0f) + gl.U1(this.Q, i3, i4);
                    } else {
                        L = gl.L(12.0f) + (gl.U1(this.Q, i3, i4) - (sparseIntArray.get(K0) - K.a.getLeft()));
                    }
                    f3 = gl.U1(this.Q, i5, i6);
                    f2 = L;
                } else {
                    f = 2.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
            }
            if (f3 != 0.0f) {
                canvas.save();
                canvas.translate(fuVar.getTranslationX(), 0.0f);
                canvas.scale(fuVar.getScaleX(), 1.0f, fuVar.getX() + fuVar.getPivotX(), fuVar.getPivotY());
                float f5 = this.O / f;
                int measuredHeight = ((fuVar.getMeasuredHeight() / 2) + fuVar.getTop()) - gl.L(14.0f);
                gradientDrawable.setBounds((int) ((f2 - gl.L(12.5f)) - f5), measuredHeight, (int) (f2 + f3 + gl.L(12.5f) + f5), gl.L(28.0f) + measuredHeight);
                gradientDrawable.setAlpha(31);
                gradientDrawable.draw(canvas);
                canvas.restore();
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(17L, elapsedRealtime - this.r);
        this.r = elapsedRealtime;
        boolean z2 = this.n;
        boolean z3 = false;
        boolean z4 = true;
        if (z2 || this.w != 0.0f) {
            boolean z5 = this.s;
            float f6 = this.w;
            if (z5) {
                if (f6 <= 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                float f7 = (((float) min) / 420.0f) + f6;
                this.w = f7;
                if (!z2 && z && f7 >= 0.0f) {
                    this.w = 0.0f;
                    f7 = 0.0f;
                }
                if (f7 >= 1.0f) {
                    this.w = 1.0f;
                    this.s = false;
                }
            } else {
                if (f6 >= 0.0f) {
                    z3 = true;
                }
                float f8 = f6 - (((float) min) / 420.0f);
                this.w = f8;
                if (!z2 && z3 && f8 <= 0.0f) {
                    this.w = 0.0f;
                    f8 = 0.0f;
                }
                if (f8 <= -1.0f) {
                    this.w = -1.0f;
                    this.s = true;
                }
            }
            z3 = true;
        }
        if (z2) {
            float f9 = this.x;
            if (f9 < 1.0f) {
                float f10 = (((float) min) / 180.0f) + f9;
                this.x = f10;
                if (f10 > 1.0f) {
                    this.x = 1.0f;
                }
            }
            z4 = z3;
        } else {
            if (!z2) {
                float f11 = this.x;
                if (f11 > 0.0f) {
                    float f12 = f11 - (((float) min) / 180.0f);
                    this.x = f12;
                    if (f12 < 0.0f) {
                        this.x = 0.0f;
                    }
                }
            }
            z4 = z3;
        }
        if (z4) {
            fuVar.h1();
            fuVar.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public final void e(ValueAnimator valueAnimator) {
        setUnreadOnlyBannerProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void f(int i) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.T != i && i >= 0 && i < arrayList.size()) {
            this.T = i;
            this.G.z0(i);
        }
    }

    public final void g(de4 de4Var, int i) {
        boolean z;
        if (de4Var.f) {
            ce4 ce4Var = this.K;
            if (ce4Var != null) {
                ((ti3) ce4Var).c(de4Var, false);
                return;
            }
            return;
        }
        int i2 = this.L;
        if (i2 < i) {
            z = true;
        } else {
            z = false;
        }
        this.T = -1;
        this.r0 = i2;
        this.s0 = this.M;
        this.L = i;
        this.M = de4Var.a;
        boolean z2 = this.P;
        ez3 ez3Var = this.w0;
        if (z2) {
            gl.r(ez3Var);
            this.P = false;
        }
        this.q0 = 0.0f;
        this.Q = 0.0f;
        this.P = true;
        setEnabled(false);
        gl.e3(ez3Var, 16L);
        ce4 ce4Var2 = this.K;
        if (ce4Var2 != null) {
            ((ti3) ce4Var2).c(de4Var, z);
        }
        f(i);
    }

    public int getCurrentTabId() {
        return this.M;
    }

    public int getCurrentTabStableId() {
        return this.l0.get(this.L, -1);
    }

    public int getDefaultTabId() {
        de4 d = d();
        if (d == null) {
            return -1;
        }
        return d.a;
    }

    public int getFirstTabId() {
        return this.k0.get(0, 0);
    }

    public int getLastTabId() {
        return this.k0.get(getTabsCount() - 1, 0);
    }

    public o39 getListView() {
        return this.G;
    }

    public int getSelectorColorKey() {
        return this.b0;
    }

    public Drawable getSelectorDrawable() {
        return this.U;
    }

    public o39 getTabsContainer() {
        return this.G;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public float getUnreadOnlyBannerHeight() {
        return gl.L(48.0f) * this.B0;
    }

    public final void h(float f, int i) {
        int i2 = this.m0.get(i, -1);
        if (i2 >= 0) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f > 0.0f) {
                this.R = i2;
                this.S = i;
            } else {
                this.R = -1;
                this.S = -1;
            }
            this.Q = f;
            fu fuVar = this.G;
            fuVar.h1();
            fuVar.invalidate();
            invalidate();
            f(i2);
            if (f >= 1.0f) {
                this.R = -1;
                this.S = -1;
                this.L = i2;
                this.M = i;
            }
        }
    }

    public final boolean i(int i) {
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (this.l0.get(i2, -1) == i) {
                this.L = i2;
                this.M = this.k0.get(i2);
                return true;
            }
        }
        return false;
    }

    public final void j(wf3 wf3Var, wf3 wf3Var2) {
        this.D0 = wf3Var;
        this.E0 = wf3Var2;
    }

    public final void k(boolean z, boolean z2) {
        float f;
        if (this.A0 == z && (z2 || this.C0 == null)) {
            return;
        }
        this.A0 = z;
        if (z && this.z0 == null) {
            jo0 jo0Var = new jo0(this, getContext());
            this.z0 = jo0Var;
            addView(jo0Var, nme.d(-1, 48.0f, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C0 = null;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (z2) {
            float f2 = this.B0;
            if (f2 != f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                this.C0 = ofFloat;
                ofFloat.addUpdateListener(new uz1(this, (byte) 26));
                this.C0.addListener(new be4(this, (byte) 0));
                this.C0.setDuration(320L);
                this.C0.setInterpolator(s33.h);
                this.C0.start();
                return;
            }
        }
        setUnreadOnlyBannerProgress(f);
    }

    public final void l(int i) {
        int i2 = 0;
        while (true) {
            fu fuVar = this.G;
            if (i2 < fuVar.getChildCount()) {
                if (fuVar.getChildAt(i2) instanceof fe4) {
                    fe4 fe4Var = (fe4) fuVar.getChildAt(i2);
                    if (fe4Var.b.a == i) {
                        fe4Var.b(1.0f, 0);
                        try {
                            fe4Var.performHapticFeedback(3);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void m() {
        SparseIntArray sparseIntArray = this.p0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.n0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.o0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = this.H;
        for (int i2 = 0; i2 < size; i2++) {
            int a = ((de4) arrayList.get(i2)).a(false);
            sparseIntArray2.put(i2, a);
            sparseIntArray3.put(i2, ((de4) arrayList.get(i2)).d);
            sparseIntArray.put(i2, (this.O / 2) + i);
            i += gl.L(24.0f) + a + this.O;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        if (this.h0 != i5) {
            this.h0 = i5;
            this.T = -1;
            if (this.P) {
                gl.r(this.w0);
                this.P = false;
                setEnabled(true);
                ce4 ce4Var = this.K;
                if (ce4Var != null) {
                    ((ti3) ce4Var).b(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i) - (this.H << 1);
            de4 d = d();
            if (d != null) {
                int i4 = 2131750795;
                d.b(k96.M0(2131750795, null));
                int a = d.a(false);
                if (this.N > size) {
                    i4 = 2131750794;
                }
                d.b(k96.M0(i4, null));
                int a2 = d.a(false) + (this.N - a);
                int i5 = this.O;
                if (a2 < size) {
                    i3 = (size - a2) / arrayList.size();
                } else {
                    i3 = 0;
                }
                this.O = i3;
                if (i5 != i3) {
                    this.F = true;
                    fu fuVar = this.G;
                    b49 itemAnimator = fuVar.getItemAnimator();
                    fuVar.setItemAnimator(null);
                    this.J.f();
                    fuVar.setItemAnimator(itemAnimator);
                    this.F = false;
                }
                m();
                this.i0 = false;
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + gl.L(36.0f) + getPaddingTop() + ((int) getUnreadOnlyBannerHeight()), 1073741824));
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.G0;
        path.rewind();
        path.addRoundRect(gl.L(9.0f), gl.L(9.0f), i - gl.L(9.0f), i2 - gl.L(9.0f), gl.L(16.0f), gl.L(16.0f), Path.Direction.CW);
    }

    @Override
    public final void requestLayout() {
        if (this.F) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f) {
        this.Q = f;
        fu fuVar = this.G;
        fuVar.h1();
        fuVar.invalidate();
        invalidate();
        ce4 ce4Var = this.K;
        if (ce4Var != null) {
            ((ti3) ce4Var).b(f);
        }
    }

    public void setBlurredBackground(il0 il0Var) {
        this.F0 = il0Var;
        setBackground(il0Var);
    }

    public void setDelegate(ce4 ce4Var) {
        this.K = ce4Var;
    }

    public void setIsEditing(boolean z) {
        this.n = z;
        this.s = true;
        fu fuVar = this.G;
        fuVar.h1();
        fuVar.invalidate();
        this.J.f();
        invalidate();
        if (!this.n && this.E) {
            ad7.Y(y6c.t0).v1();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList R0 = na7.q1(y6c.t0).R0();
            int size = R0.size();
            for (int i = 0; i < size; i++) {
                t97 t97Var = (t97) R0.get(i);
                boolean d = t97Var.d();
                ArrayList<Integer> arrayList = tL_messages_updateDialogFiltersOrder.order;
                if (d) {
                    arrayList.add(0);
                } else {
                    arrayList.add(Integer.valueOf(t97Var.a));
                }
            }
            na7.q1(y6c.t0).j3();
            ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_messages_updateDialogFiltersOrder, new ce2((byte) 0));
            this.E = false;
        }
    }
}
