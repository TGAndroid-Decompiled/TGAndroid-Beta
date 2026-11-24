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
public abstract class ig4 extends FrameLayout {
    public boolean A0;
    public float B0;
    public ValueAnimator C0;
    public kh3 D0;
    public boolean E;
    public kh3 E0;
    public boolean F;
    public im0 F0;
    public final fv G;
    public final Path G0;
    public final int H;
    public final jg2 I;
    public final s30 J;
    public dg4 K;
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
    public final ylb a;
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
    public final d53 j0;
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
    public final ag4 t0;
    public Drawable u0;
    public int v0;
    public float w;
    public final o04 w0;
    public float x;
    public float x0;
    public AnimatorSet y;
    public final v20 y0;
    public jp0 z0;

    public ig4(Context context, ylb ylbVar) {
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
        this.V = cmb.J8;
        this.W = cmb.H8;
        this.a0 = cmb.I8;
        this.b0 = cmb.K8;
        this.c0 = cmb.r8;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.j0 = d53.h;
        this.k0 = new SparseIntArray(5);
        this.l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.n0 = new SparseIntArray(5);
        this.o0 = new SparseIntArray(5);
        this.p0 = new SparseIntArray(5);
        this.w0 = new o04(this, (byte) 2);
        this.y0 = new v20(this, (byte) 3);
        this.G0 = new Path();
        this.a = ylbVar;
        textPaint2.setTextSize(gm.N(11.0f));
        textPaint2.setTypeface(gm.o());
        textPaint.setTextSize(gm.N(14.0f));
        textPaint.setTypeface(gm.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(gm.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.U = gradientDrawable;
        float N = gm.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        gradientDrawable.setColor(cmb.v0(this.V, ylbVar));
        setHorizontalScrollBarEnabled(false);
        fv fvVar = new fv((byte) 18, context, this);
        this.G = fvVar;
        fvVar.setClipChildren(false);
        ag4 ag4Var = new ag4(this);
        this.t0 = ag4Var;
        ag4Var.C = false;
        fvVar.setItemAnimator(ag4Var);
        fvVar.setSelectorType(9);
        fvVar.setSelectorRadius(6);
        anb.l(fvVar, 20, this.b0, ylbVar);
        jg2 jg2Var = new jg2((ViewGroup) this, (byte) 1);
        this.I = jg2Var;
        fvVar.setLayoutManager(jg2Var);
        new hu5(new hg4(this)).h(fvVar);
        int max = Math.max(0, gm.L(11.5f));
        this.H = max;
        fvVar.setPadding(max, 0, max, 0);
        fvVar.setClipToPadding(false);
        fvVar.setDrawSelectorBehind(true);
        s30 s30Var = new s30(this, context, (byte) 4);
        this.J = s30Var;
        s30Var.C(true);
        fvVar.setAdapter(s30Var);
        fvVar.setOnItemClickListener(new yf4(this));
        fvVar.setOnItemLongClickListener(new yf4(this));
        fvVar.setOnScrollListener(new ip2(this, (byte) 12));
        fvVar.z2 = true;
        fvVar.setOverScrollMode(2);
        addView(fvVar, qoe.e(-1, 36, 48));
    }

    private void setUnreadOnlyBannerProgress(float f) {
        int i;
        if (this.B0 != f) {
            this.B0 = f;
            jp0 jp0Var = this.z0;
            if (jp0Var != null) {
                jp0Var.setAlpha(f);
                jp0 jp0Var2 = this.z0;
                if (f > 0.0f) {
                    i = 0;
                } else {
                    i = 8;
                }
                jp0Var2.setVisibility(i);
                this.z0.setClickable(this.A0);
            }
            requestLayout();
            invalidate();
            kh3 kh3Var = this.E0;
            if (kh3Var != null) {
                kh3Var.run();
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
        eg4 eg4Var = new eg4(this, i, k47.A5(gw3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), arrayList, textPaint.getFontMetricsInt(), false), z);
        eg4Var.e = z2;
        eg4Var.f = z3;
        this.N = hg9.v(24.0f, eg4Var.a(true), this.N);
        arrayList2.add(eg4Var);
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
        anb.J(this.G, i4, this.a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.y0, 0.0f, 1.0f));
        this.y.setDuration(320L);
        this.y.addListener(new cg4(this, (byte) 1));
        this.y.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig4.c():void");
    }

    public final eg4 d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                if (((eg4) arrayList.get(i)).e) {
                    return (eg4) arrayList.get(i);
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
            int alpha = cmb.j0.getAlpha();
            cmb.j0.setAlpha((int) (alpha * this.B0));
            float top = this.z0.getTop();
            canvas2 = canvas;
            canvas2.drawLine(gm.L(9.0f), top, getMeasuredWidth() - gm.L(9.0f), top, cmb.j0);
            cmb.j0.setAlpha(alpha);
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
        u69 K;
        int i;
        int i2;
        float L;
        float f4;
        float measuredWidth;
        boolean drawChild = super.drawChild(canvas, view, j);
        fv fvVar = this.G;
        if (view == fvVar) {
            getMeasuredHeight();
            int alpha = (int) (fvVar.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.U;
            gradientDrawable.setAlpha(alpha);
            if (!this.P && this.R == -1) {
                u69 K2 = fvVar.K(this.L);
                if (K2 != null) {
                    gg4 gg4Var = (gg4) K2.a;
                    if (gg4Var.a0) {
                        f4 = gm.R1(gg4Var.j0, gg4Var.d, gg4Var.y);
                    } else {
                        f4 = gg4Var.d;
                    }
                    f3 = Math.max(gm.L(16.0f), f4);
                    if (gg4Var.a0) {
                        measuredWidth = gm.R1(gg4Var.j0 + gm.L(20.0f), gg4Var.getMeasuredWidth(), gg4Var.y);
                    } else {
                        measuredWidth = gg4Var.getMeasuredWidth();
                    }
                    f2 = (int) aq1.z(measuredWidth, f3, 2.0f, gg4Var.getX());
                } else {
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
                f = 2.0f;
            } else {
                int K0 = this.I.K0();
                if (K0 != -1 && (K = fvVar.K(K0)) != null) {
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
                        L = gm.L(12.0f) + gm.U1(this.Q, i3, i4);
                    } else {
                        L = gm.L(12.0f) + (gm.U1(this.Q, i3, i4) - (sparseIntArray.get(K0) - K.a.getLeft()));
                    }
                    f3 = gm.U1(this.Q, i5, i6);
                    f2 = L;
                } else {
                    f = 2.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
            }
            if (f3 != 0.0f) {
                canvas.save();
                canvas.translate(fvVar.getTranslationX(), 0.0f);
                canvas.scale(fvVar.getScaleX(), 1.0f, fvVar.getX() + fvVar.getPivotX(), fvVar.getPivotY());
                float f5 = this.O / f;
                int measuredHeight = ((fvVar.getMeasuredHeight() / 2) + fvVar.getTop()) - gm.L(14.0f);
                gradientDrawable.setBounds((int) ((f2 - gm.L(12.5f)) - f5), measuredHeight, (int) (f2 + f3 + gm.L(12.5f) + f5), gm.L(28.0f) + measuredHeight);
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
            fvVar.h1();
            fvVar.invalidate();
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

    public final void g(eg4 eg4Var, int i) {
        boolean z;
        if (eg4Var.f) {
            dg4 dg4Var = this.K;
            if (dg4Var != null) {
                ((dk3) dg4Var).c(eg4Var, false);
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
        this.M = eg4Var.a;
        boolean z2 = this.P;
        o04 o04Var = this.w0;
        if (z2) {
            gm.r(o04Var);
            this.P = false;
        }
        this.q0 = 0.0f;
        this.Q = 0.0f;
        this.P = true;
        setEnabled(false);
        gm.d3(o04Var, 16L);
        dg4 dg4Var2 = this.K;
        if (dg4Var2 != null) {
            ((dk3) dg4Var2).c(eg4Var, z);
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
        eg4 d = d();
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

    public r59 getListView() {
        return this.G;
    }

    public int getSelectorColorKey() {
        return this.b0;
    }

    public Drawable getSelectorDrawable() {
        return this.U;
    }

    public r59 getTabsContainer() {
        return this.G;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public float getUnreadOnlyBannerHeight() {
        return gm.L(48.0f) * this.B0;
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
            fv fvVar = this.G;
            fvVar.h1();
            fvVar.invalidate();
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

    public final void j(kh3 kh3Var, kh3 kh3Var2) {
        this.D0 = kh3Var;
        this.E0 = kh3Var2;
    }

    public final void k(boolean z, boolean z2) {
        float f;
        if (this.A0 == z && (z2 || this.C0 == null)) {
            return;
        }
        this.A0 = z;
        if (z && this.z0 == null) {
            jp0 jp0Var = new jp0(this, getContext());
            this.z0 = jp0Var;
            addView(jp0Var, qoe.d(-1, 48.0f, 48, 0.0f, 36.0f, 0.0f, 0.0f));
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
                ofFloat.addUpdateListener(new et1(this, (byte) 28));
                this.C0.addListener(new cg4(this, (byte) 0));
                this.C0.setDuration(320L);
                this.C0.setInterpolator(d53.h);
                this.C0.start();
                return;
            }
        }
        setUnreadOnlyBannerProgress(f);
    }

    public final void l(int i) {
        int i2 = 0;
        while (true) {
            fv fvVar = this.G;
            if (i2 < fvVar.getChildCount()) {
                if (fvVar.getChildAt(i2) instanceof gg4) {
                    gg4 gg4Var = (gg4) fvVar.getChildAt(i2);
                    if (gg4Var.b.a == i) {
                        gg4Var.b(1.0f, 0);
                        try {
                            gg4Var.performHapticFeedback(3);
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
            int a = ((eg4) arrayList.get(i2)).a(false);
            sparseIntArray2.put(i2, a);
            sparseIntArray3.put(i2, ((eg4) arrayList.get(i2)).d);
            sparseIntArray.put(i2, (this.O / 2) + i);
            i += gm.L(24.0f) + a + this.O;
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
                gm.r(this.w0);
                this.P = false;
                setEnabled(true);
                dg4 dg4Var = this.K;
                if (dg4Var != null) {
                    ((dk3) dg4Var).b(1.0f);
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
            eg4 d = d();
            if (d != null) {
                int i4 = 2131750744;
                d.b(jb6.M0(2131750744, null));
                int a = d.a(false);
                if (this.N > size) {
                    i4 = 2131750743;
                }
                d.b(jb6.M0(i4, null));
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
                    fv fvVar = this.G;
                    d69 itemAnimator = fvVar.getItemAnimator();
                    fvVar.setItemAnimator(null);
                    this.J.f();
                    fvVar.setItemAnimator(itemAnimator);
                    this.F = false;
                }
                m();
                this.i0 = false;
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + gm.L(36.0f) + getPaddingTop() + ((int) getUnreadOnlyBannerHeight()), 1073741824));
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.G0;
        path.rewind();
        path.addRoundRect(gm.L(9.0f), gm.L(9.0f), i - gm.L(9.0f), i2 - gm.L(9.0f), gm.L(16.0f), gm.L(16.0f), Path.Direction.CW);
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
        fv fvVar = this.G;
        fvVar.h1();
        fvVar.invalidate();
        invalidate();
        dg4 dg4Var = this.K;
        if (dg4Var != null) {
            ((dk3) dg4Var).b(f);
        }
    }

    public void setBlurredBackground(im0 im0Var) {
        this.F0 = im0Var;
        setBackground(im0Var);
    }

    public void setDelegate(dg4 dg4Var) {
        this.K = dg4Var;
    }

    public void setIsEditing(boolean z) {
        this.n = z;
        this.s = true;
        fv fvVar = this.G;
        fvVar.h1();
        fvVar.invalidate();
        this.J.f();
        invalidate();
        if (!this.n && this.E) {
            cf7.Y(z8c.t0).v1();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList S0 = oc7.r1(z8c.t0).S0();
            int size = S0.size();
            for (int i = 0; i < size; i++) {
                ub7 ub7Var = (ub7) S0.get(i);
                boolean d = ub7Var.d();
                ArrayList<Integer> arrayList = tL_messages_updateDialogFiltersOrder.order;
                if (d) {
                    arrayList.add(0);
                } else {
                    arrayList.add(Integer.valueOf(ub7Var.a));
                }
            }
            oc7.r1(z8c.t0).m3();
            ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_messages_updateDialogFiltersOrder, new nf2((byte) 0));
            this.E = false;
        }
    }
}
