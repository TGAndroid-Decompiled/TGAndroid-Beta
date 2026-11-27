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
public abstract class fg4 extends FrameLayout {
    public jo0 A0;
    public boolean B0;
    public float C0;
    public ValueAnimator D0;
    public boolean E;
    public ch3 E0;
    public boolean F;
    public ch3 F0;
    public final gu G;
    public jl0 G0;
    public final int H;
    public final Path H0;
    public final of2 I;
    public final t20 J;
    public ag4 K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public float R;
    public int S;
    public int T;
    public int U;
    public final GradientDrawable V;
    public int W;
    public final vnb a;
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
    public int i0;
    public boolean j0;
    public final k43 k0;
    public final SparseIntArray l0;
    public final SparseIntArray m0;
    public boolean n;
    public final SparseIntArray n0;
    public final SparseIntArray o0;
    public final SparseIntArray p0;
    public final SparseIntArray q0;
    public long r;
    public float r0;
    public boolean s;
    public int s0;
    public int t0;
    public final xf4 u0;
    public Drawable v0;
    public float w;
    public int w0;
    public float x;
    public final zz3 x0;
    public AnimatorSet y;
    public float y0;
    public final w10 z0;

    public fg4(Context context, vnb vnbVar) {
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
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.W = aob.K8;
        this.a0 = aob.I8;
        this.b0 = aob.J8;
        this.c0 = aob.L8;
        this.d0 = aob.s8;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.k0 = k43.h;
        this.l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.n0 = new SparseIntArray(5);
        this.o0 = new SparseIntArray(5);
        this.p0 = new SparseIntArray(5);
        this.q0 = new SparseIntArray(5);
        this.x0 = new zz3(this, (byte) 2);
        this.z0 = new w10(this, (byte) 3);
        this.H0 = new Path();
        this.a = vnbVar;
        textPaint2.setTextSize(hl.N(11.0f));
        textPaint2.setTypeface(hl.o());
        textPaint.setTextSize(hl.N(14.0f));
        textPaint.setTypeface(hl.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(hl.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.V = gradientDrawable;
        float N = hl.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        gradientDrawable.setColor(aob.v0(this.W, vnbVar));
        setHorizontalScrollBarEnabled(false);
        gu guVar = new gu((byte) 18, context, this);
        this.G = guVar;
        guVar.setClipChildren(false);
        xf4 xf4Var = new xf4(this);
        this.u0 = xf4Var;
        xf4Var.C = false;
        guVar.setItemAnimator(xf4Var);
        guVar.setSelectorType(9);
        guVar.setSelectorRadius(6);
        yob.l(guVar, 20, this.c0, vnbVar);
        of2 of2Var = new of2((ViewGroup) this, (byte) 1);
        this.I = of2Var;
        guVar.setLayoutManager(of2Var);
        new lu5(new eg4(this)).h(guVar);
        int max = Math.max(0, hl.L(11.5f));
        this.H = max;
        guVar.setPadding(max, 0, max, 0);
        guVar.setClipToPadding(false);
        guVar.setDrawSelectorBehind(true);
        t20 t20Var = new t20(this, context, (byte) 4);
        this.J = t20Var;
        t20Var.C(true);
        guVar.setAdapter(t20Var);
        guVar.setOnItemClickListener(new vf4(this));
        guVar.setOnItemLongClickListener(new vf4(this));
        guVar.setOnScrollListener(new to2(this, (byte) 11));
        guVar.z2 = true;
        guVar.setOverScrollMode(2);
        addView(guVar, tre.e(-1, 36, 48));
    }

    private void setUnreadOnlyBannerProgress(float f) {
        int i;
        if (this.C0 != f) {
            this.C0 = f;
            jo0 jo0Var = this.A0;
            if (jo0Var != null) {
                jo0Var.setAlpha(f);
                jo0 jo0Var2 = this.A0;
                if (f > 0.0f) {
                    i = 0;
                } else {
                    i = 8;
                }
                jo0Var2.setVisibility(i);
                this.A0.setClickable(this.B0);
            }
            requestLayout();
            invalidate();
            ch3 ch3Var = this.F0;
            if (ch3Var != null) {
                ch3Var.run();
            }
        }
    }

    public final void a(int i, int i2, String str) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.M == -1) {
            this.M = i;
        }
        this.l0.put(size, i);
        this.m0.put(size, i2);
        this.n0.put(i, size);
        int i3 = this.M;
        if (i3 != -1 && i3 == i) {
            this.L = size;
        }
        bg4 bg4Var = new bg4(this, i, str, false);
        bg4Var.e = false;
        bg4Var.f = false;
        this.N = uh9.w(24.0f, bg4Var.a(true), this.N);
        arrayList.add(bg4Var);
    }

    public final void b(int i, int i2, String str, ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.M == -1) {
            this.M = i;
        }
        this.l0.put(size, i);
        this.m0.put(size, i2);
        this.n0.put(i, size);
        int i3 = this.M;
        if (i3 != -1 && i3 == i) {
            this.L = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.b;
        bg4 bg4Var = new bg4(this, i, r47.A5(pv3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), arrayList, textPaint.getFontMetricsInt(), false), z);
        bg4Var.e = z2;
        bg4Var.f = z3;
        this.N = uh9.w(24.0f, bg4Var.a(true), this.N);
        arrayList2.add(bg4Var);
    }

    public final void c(int i, int i2, int i3, int i4, int i5) {
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.e0 = i;
        this.f0 = i2;
        this.g0 = i3;
        this.h0 = i5;
        this.c0 = i4;
        yob.J(this.G, i4, this.a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.z0, 0.0f, 1.0f));
        this.y.setDuration(320L);
        this.y.addListener(new zf4(this, (byte) 1));
        this.y.start();
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg4.d():void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.clipPath(this.H0);
        super.dispatchDraw(canvas);
        if (this.C0 > 0.0f && this.A0 != null) {
            int alpha = aob.j0.getAlpha();
            aob.j0.setAlpha((int) (alpha * this.C0));
            float top = this.A0.getTop();
            canvas2 = canvas;
            canvas2.drawLine(hl.L(9.0f), top, getMeasuredWidth() - hl.L(9.0f), top, aob.j0);
            aob.j0.setAlpha(alpha);
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
        f89 L;
        int i;
        int i2;
        float L2;
        float f4;
        float measuredWidth;
        boolean drawChild = super.drawChild(canvas, view, j);
        gu guVar = this.G;
        if (view == guVar) {
            getMeasuredHeight();
            int alpha = (int) (guVar.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.V;
            gradientDrawable.setAlpha(alpha);
            if (!this.Q && this.S == -1) {
                f89 L3 = guVar.L(this.L);
                if (L3 != null) {
                    dg4 dg4Var = (dg4) L3.a;
                    if (dg4Var.a0) {
                        f4 = hl.R1(dg4Var.j0, dg4Var.d, dg4Var.y);
                    } else {
                        f4 = dg4Var.d;
                    }
                    f3 = Math.max(hl.L(16.0f), f4);
                    if (dg4Var.a0) {
                        measuredWidth = hl.R1(dg4Var.j0 + hl.L(20.0f), dg4Var.getMeasuredWidth(), dg4Var.y);
                    } else {
                        measuredWidth = dg4Var.getMeasuredWidth();
                    }
                    f2 = (int) bp1.z(measuredWidth, f3, 2.0f, dg4Var.getX());
                } else {
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
                f = 2.0f;
            } else {
                int K0 = this.I.K0();
                if (K0 != -1 && (L = guVar.L(K0)) != null) {
                    if (this.Q) {
                        i = this.s0;
                        i2 = this.L;
                    } else {
                        i = this.L;
                        i2 = this.S;
                    }
                    SparseIntArray sparseIntArray = this.q0;
                    int i3 = sparseIntArray.get(i);
                    int i4 = sparseIntArray.get(i2);
                    SparseIntArray sparseIntArray2 = this.o0;
                    f = 2.0f;
                    int i5 = sparseIntArray2.get(i);
                    int i6 = sparseIntArray2.get(i2);
                    SparseIntArray sparseIntArray3 = this.p0;
                    sparseIntArray3.get(i);
                    sparseIntArray3.get(i2);
                    if (this.O != 0) {
                        L2 = hl.L(12.0f) + hl.U1(this.R, i3, i4);
                    } else {
                        L2 = hl.L(12.0f) + (hl.U1(this.R, i3, i4) - (sparseIntArray.get(K0) - L.a.getLeft()));
                    }
                    f3 = hl.U1(this.R, i5, i6);
                    f2 = L2;
                } else {
                    f = 2.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
            }
            if (f3 != 0.0f) {
                canvas.save();
                canvas.translate(guVar.getTranslationX(), 0.0f);
                canvas.scale(guVar.getScaleX(), 1.0f, guVar.getX() + guVar.getPivotX(), guVar.getPivotY());
                float f5 = this.O / f;
                int measuredHeight = ((guVar.getMeasuredHeight() / 2) + guVar.getTop()) - hl.L(14.0f);
                gradientDrawable.setBounds((int) ((f2 - hl.L(12.5f)) - f5), measuredHeight, (int) (f2 + f3 + hl.L(12.5f) + f5), hl.L(28.0f) + measuredHeight);
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
            guVar.i1();
            guVar.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public final bg4 e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                if (((bg4) arrayList.get(i)).e) {
                    return (bg4) arrayList.get(i);
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final void f(ValueAnimator valueAnimator) {
        setUnreadOnlyBannerProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public int getCurrentTabId() {
        return this.M;
    }

    public int getCurrentTabStableId() {
        return this.m0.get(this.L, -1);
    }

    public int getDefaultTabId() {
        bg4 e = e();
        if (e == null) {
            return -1;
        }
        return e.a;
    }

    public int getFirstTabId() {
        return this.l0.get(0, 0);
    }

    public int getLastTabId() {
        return this.l0.get(getTabsCount() - 1, 0);
    }

    public d79 getListView() {
        return this.G;
    }

    public int getSelectorColorKey() {
        return this.c0;
    }

    public Drawable getSelectorDrawable() {
        return this.V;
    }

    public d79 getTabsContainer() {
        return this.G;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public float getUnreadOnlyBannerHeight() {
        return hl.L(48.0f) * this.C0;
    }

    public final void h(int i) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.U != i && i >= 0 && i < arrayList.size()) {
            this.U = i;
            this.G.A0(i);
        }
    }

    public final void i(bg4 bg4Var, int i) {
        boolean z;
        if (bg4Var.f) {
            ag4 ag4Var = this.K;
            if (ag4Var != null) {
                ag4Var.s(bg4Var, false);
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
        this.U = -1;
        this.s0 = i2;
        this.t0 = this.M;
        this.L = i;
        this.M = bg4Var.a;
        boolean z2 = this.Q;
        zz3 zz3Var = this.x0;
        if (z2) {
            hl.r(zz3Var);
            this.Q = false;
        }
        this.r0 = 0.0f;
        this.R = 0.0f;
        this.Q = true;
        setEnabled(false);
        hl.d3(zz3Var, 16L);
        ag4 ag4Var2 = this.K;
        if (ag4Var2 != null) {
            ag4Var2.s(bg4Var, z);
        }
        h(i);
    }

    public final void j(float f, int i) {
        int i2 = this.n0.get(i, -1);
        if (i2 >= 0) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f > 0.0f) {
                this.S = i2;
                this.T = i;
            } else {
                this.S = -1;
                this.T = -1;
            }
            this.R = f;
            gu guVar = this.G;
            guVar.i1();
            guVar.invalidate();
            invalidate();
            h(i2);
            if (f >= 1.0f) {
                this.S = -1;
                this.T = -1;
                this.L = i2;
                this.M = i;
            }
        }
    }

    public final boolean k(int i) {
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (this.m0.get(i2, -1) == i) {
                this.L = i2;
                this.M = this.l0.get(i2);
                return true;
            }
        }
        return false;
    }

    public final void l(ch3 ch3Var, ch3 ch3Var2) {
        this.E0 = ch3Var;
        this.F0 = ch3Var2;
    }

    public final void m(boolean z, boolean z2) {
        float f;
        if (this.B0 == z && (z2 || this.D0 == null)) {
            return;
        }
        this.B0 = z;
        if (z && this.A0 == null) {
            jo0 jo0Var = new jo0(this, getContext());
            this.A0 = jo0Var;
            addView(jo0Var, tre.d(-1, 48.0f, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        ValueAnimator valueAnimator = this.D0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.D0 = null;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (z2) {
            float f2 = this.C0;
            if (f2 != f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                this.D0 = ofFloat;
                ofFloat.addUpdateListener(new az1(this, (byte) 28));
                this.D0.addListener(new zf4(this, (byte) 0));
                this.D0.setDuration(320L);
                this.D0.setInterpolator(k43.h);
                this.D0.start();
                return;
            }
        }
        setUnreadOnlyBannerProgress(f);
    }

    public final void n(int i) {
        int i2 = 0;
        while (true) {
            gu guVar = this.G;
            if (i2 < guVar.getChildCount()) {
                if (guVar.getChildAt(i2) instanceof dg4) {
                    dg4 dg4Var = (dg4) guVar.getChildAt(i2);
                    if (dg4Var.b.a == i) {
                        dg4Var.b(1.0f, 0);
                        try {
                            dg4Var.performHapticFeedback(3);
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

    public final void o() {
        SparseIntArray sparseIntArray = this.q0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.o0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.p0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = this.H;
        for (int i2 = 0; i2 < size; i2++) {
            int a = ((bg4) arrayList.get(i2)).a(false);
            sparseIntArray2.put(i2, a);
            sparseIntArray3.put(i2, ((bg4) arrayList.get(i2)).d);
            sparseIntArray.put(i2, (this.O / 2) + i);
            i += hl.L(24.0f) + a + this.O;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        if (this.i0 != i5) {
            this.i0 = i5;
            this.U = -1;
            if (this.Q) {
                hl.r(this.x0);
                this.Q = false;
                setEnabled(true);
                ag4 ag4Var = this.K;
                if (ag4Var != null) {
                    ag4Var.a(1.0f);
                }
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i) - (this.H << 1);
            bg4 e = e();
            t20 t20Var = this.J;
            gu guVar = this.G;
            if (e != null) {
                int i4 = 2131750772;
                e.b(ob6.M0(2131750772, null));
                int a = e.a(false);
                if (this.N > size) {
                    i4 = 2131750771;
                }
                e.b(ob6.M0(i4, null));
                int a2 = e.a(false) + (this.N - a);
                int i5 = this.O;
                if (a2 < size) {
                    i3 = (size - a2) / arrayList.size();
                } else {
                    i3 = 0;
                }
                this.O = i3;
                if (i5 != i3) {
                    this.F = true;
                    o79 itemAnimator = guVar.getItemAnimator();
                    guVar.setItemAnimator(null);
                    t20Var.f();
                    guVar.setItemAnimator(itemAnimator);
                    this.F = false;
                }
                o();
                this.j0 = false;
            } else {
                int i6 = this.O;
                int i7 = this.P;
                if (i6 != i7) {
                    this.O = i7;
                    this.F = true;
                    o79 itemAnimator2 = guVar.getItemAnimator();
                    guVar.setItemAnimator(null);
                    t20Var.f();
                    guVar.setItemAnimator(itemAnimator2);
                    this.F = false;
                }
                o();
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + hl.L(36.0f) + getPaddingTop() + ((int) getUnreadOnlyBannerHeight()), 1073741824));
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.H0;
        path.rewind();
        path.addRoundRect(hl.L(9.0f), hl.L(9.0f), i - hl.L(9.0f), i2 - hl.L(9.0f), hl.L(16.0f), hl.L(16.0f), Path.Direction.CW);
    }

    @Override
    public final void requestLayout() {
        if (this.F) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f) {
        this.R = f;
        gu guVar = this.G;
        guVar.i1();
        guVar.invalidate();
        invalidate();
        ag4 ag4Var = this.K;
        if (ag4Var != null) {
            ag4Var.a(f);
        }
    }

    public void setBlurredBackground(jl0 jl0Var) {
        this.G0 = jl0Var;
        setBackground(jl0Var);
    }

    public void setDelegate(ag4 ag4Var) {
        this.K = ag4Var;
    }

    public void setExtraTabWidth(int i) {
        if (this.P != i) {
            this.P = i;
            requestLayout();
        }
    }

    public void setIsEditing(boolean z) {
        this.n = z;
        this.s = true;
        gu guVar = this.G;
        guVar.i1();
        guVar.invalidate();
        this.J.f();
        invalidate();
        if (!this.n && this.E) {
            kf7.a0(yac.t0).z1();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList T0 = uc7.s1(yac.t0).T0();
            int size = T0.size();
            for (int i = 0; i < size; i++) {
                ac7 ac7Var = (ac7) T0.get(i);
                boolean d = ac7Var.d();
                ArrayList<Integer> arrayList = tL_messages_updateDialogFiltersOrder.order;
                if (d) {
                    arrayList.add(0);
                } else {
                    arrayList.add(Integer.valueOf(ac7Var.a));
                }
            }
            uc7.s1(yac.t0).q3();
            ConnectionsManager.getInstance(yac.t0).sendRequest(tL_messages_updateDialogFiltersOrder, new xe2((byte) 0));
            this.E = false;
        }
    }

    public void g() {
    }
}
