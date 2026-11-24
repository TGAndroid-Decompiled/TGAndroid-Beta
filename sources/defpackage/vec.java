package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public class vec extends FrameLayout implements tjb {
    public static final int t0 = 0;
    public uec E;
    public final int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public float L;
    public int M;
    public int N;
    public int O;
    public final GradientDrawable P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public float a;
    public float a0;
    public j8c b;
    public final s33 b0;
    public final TextPaint c;
    public final SparseIntArray c0;
    public final TextPaint d;
    public final SparseIntArray d0;
    public final TextPaint e;
    public final SparseIntArray e0;
    public final Paint f;
    public final SparseIntArray f0;
    public float g0;
    public final ArrayList h;
    public int h0;
    public int i0;
    public final xia j0;
    public final wjb k0;
    public ValueAnimator l0;
    public j8c m0;
    public boolean n;
    public boolean n0;
    public is5 o0;
    public rec p0;
    public float q0;
    public int r;
    public final Paint r0;
    public boolean s;
    public il0 s0;
    public final ns9 w;
    public final xe2 x;
    public final s20 y;

    public vec(int i, wjb wjbVar, Context context, boolean z) {
        super(context);
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        this.a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f = new Paint(1);
        this.h = new ArrayList();
        this.r = 16;
        this.H = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.Q = bkb.wi;
        this.R = bkb.vi;
        this.S = bkb.ui;
        this.T = bkb.xi;
        this.U = bkb.r8;
        this.b0 = s33.h;
        this.c0 = new SparseIntArray(5);
        this.d0 = new SparseIntArray(5);
        this.e0 = new SparseIntArray(5);
        this.f0 = new SparseIntArray(5);
        this.j0 = new xia(this, (byte) 13);
        this.r0 = new Paint(1);
        this.k0 = wjbVar;
        this.F = i;
        de9.p(textPaint2, gl.L(13.0f));
        if (i != 9 && i != 10 && i != -2) {
            f = 15.0f;
        } else {
            f = 14.0f;
        }
        de9.p(textPaint, gl.L(f));
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(gl.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.P = gradientDrawable;
        gradientDrawable.setColor(bkb.v0(this.Q, wjbVar));
        if (i == -2) {
            float N = gl.N(13.0f);
            i2 = 3;
            gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        } else {
            i2 = 3;
            float N2 = gl.N(3.0f);
            gradientDrawable.setCornerRadii(new float[]{N2, N2, N2, N2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        ns9 ns9Var = new ns9((byte) 7, context, this);
        this.w = ns9Var;
        ns9Var.setOverScrollMode(2);
        if (z) {
            ns9Var.setItemAnimator(null);
        } else {
            ((gb3) ns9Var.getItemAnimator()).C = false;
        }
        if (i == -2) {
            ns9Var.setSelectorType(9);
            ns9Var.setSelectorRadius(6);
        } else {
            if (i == 10) {
                i3 = 9;
            } else {
                i3 = i;
            }
            ns9Var.setSelectorType(i3);
            if (i == i2) {
                ns9Var.setSelectorRadius(0);
            } else {
                ns9Var.setSelectorRadius(6);
            }
        }
        zkb.l(ns9Var, 20, this.T, wjbVar);
        xe2 xe2Var = new xe2((ViewGroup) this, (byte) 9);
        this.x = xe2Var;
        ns9Var.setLayoutManager(xe2Var);
        ns9Var.setPadding(gl.L(7.0f), 0, gl.L(7.0f), 0);
        ns9Var.setClipToPadding(false);
        ns9Var.setDrawSelectorBehind(true);
        s20 s20Var = new s20(this, context, (byte) 18);
        this.y = s20Var;
        s20Var.C(z);
        ns9Var.setAdapter(s20Var);
        ns9Var.setOnItemClickListener(new pec(this));
        ns9Var.setOnItemLongClickListener(new pec(this));
        ns9Var.setOnScrollListener(new vdb(this, (byte) 8));
        if (i != 9) {
            if (i == 10) {
                i5 = 1;
                i4 = -1;
            } else {
                addView(ns9Var, nme.c(-1.0f, -1));
                return;
            }
        } else {
            i4 = -1;
            i5 = 1;
        }
        addView(ns9Var, nme.e(-2, i4, i5));
    }

    public final void a(int i, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.H == -1) {
            this.H = i;
        }
        this.c0.put(size, i);
        this.d0.put(i, size);
        int i2 = this.H;
        if (i2 != -1 && i2 == i) {
            this.G = size;
        }
        ?? obj = new Object();
        obj.a = i;
        obj.b = charSequence;
        int i3 = this.I;
        this.I = de9.w(this.r << 1, obj.a(this.c), i3);
        arrayList.add(obj);
    }

    public final void b(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        this.W = z;
        int i = 0;
        ns9 ns9Var = this.w;
        float f7 = 1.0f;
        if (z2) {
            while (i < ns9Var.getChildCount()) {
                ViewPropertyAnimator animate = ns9Var.getChildAt(i).animate();
                if (z) {
                    f4 = 0.0f;
                } else {
                    f4 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f4);
                if (z) {
                    f5 = 0.0f;
                } else {
                    f5 = 1.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f5);
                if (z) {
                    f6 = 0.0f;
                } else {
                    f6 = 1.0f;
                }
                scaleX.scaleY(f6).setInterpolator(s33.f).setDuration(220L).start();
                i++;
            }
        } else {
            while (i < ns9Var.getChildCount()) {
                View childAt = ns9Var.getChildAt(i);
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                childAt.setScaleX(f);
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                childAt.setScaleY(f2);
                if (z) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                childAt.setAlpha(f3);
                i++;
            }
            if (!z) {
                f7 = 0.0f;
            }
            this.a0 = f7;
        }
        invalidate();
    }

    public final void c() {
        this.h.clear();
        this.c0.clear();
        this.d0.clear();
        this.e0.clear();
        this.f0.clear();
        this.I = 0;
    }

    public final void d(int i) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.O != i && i >= 0 && i < arrayList.size()) {
            this.O = i;
            ns9 ns9Var = this.w;
            if (ns9Var.getVisibility() != 8 && ns9Var.getMeasuredWidth() != 0) {
                ns9Var.z0(i);
            } else {
                gl.e3(new on7(this, i, (byte) 22), 100L);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        s49 K;
        int i;
        int i2;
        int L;
        int i3;
        int i4;
        boolean drawChild = super.drawChild(canvas, view, j);
        ns9 ns9Var = this.w;
        if (view == ns9Var) {
            int measuredHeight = getMeasuredHeight();
            boolean z = this.W;
            float f = this.a0;
            if (z) {
                if (f != 1.0f) {
                    float f2 = f + 0.1f;
                    this.a0 = f2;
                    if (f2 > 1.0f) {
                        this.a0 = 1.0f;
                    }
                    invalidate();
                }
            } else if (f != 0.0f) {
                float f3 = f - 0.12f;
                this.a0 = f3;
                if (f3 < 0.0f) {
                    this.a0 = 0.0f;
                }
                invalidate();
            }
            int alpha = (int) (ns9Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.P;
            gradientDrawable.setAlpha(alpha);
            int i5 = 0;
            if (!this.K && this.M == -1) {
                s49 K2 = ns9Var.K(this.G);
                if (K2 != null) {
                    tec tecVar = (tec) K2.a;
                    i3 = tecVar.b;
                    L = (int) (tecVar.getX() + ((tecVar.getMeasuredWidth() - i3) / 2));
                    int i6 = i3;
                    i5 = L;
                    i4 = i6;
                }
                i4 = 0;
            } else {
                int K0 = this.x.K0();
                if (K0 != -1 && (K = ns9Var.K(K0)) != null) {
                    if (this.K) {
                        i = this.h0;
                        i2 = this.G;
                    } else {
                        i = this.G;
                        i2 = this.M;
                    }
                    SparseIntArray sparseIntArray = this.f0;
                    int i7 = sparseIntArray.get(i);
                    int i8 = sparseIntArray.get(i2);
                    SparseIntArray sparseIntArray2 = this.e0;
                    int i9 = sparseIntArray2.get(i);
                    int i10 = sparseIntArray2.get(i2);
                    if (this.J != 0) {
                        L = gl.L(this.r) + ((int) (((i8 - i7) * this.L) + i7));
                    } else {
                        L = gl.L(this.r) + (((int) (((i8 - i7) * this.L) + i7)) - (sparseIntArray.get(K0) - K.a.getLeft()));
                    }
                    i3 = (int) (((i10 - i9) * this.L) + i9);
                    int i62 = i3;
                    i5 = L;
                    i4 = i62;
                }
                i4 = 0;
            }
            int x = (int) (ns9Var.getX() + i5);
            if (i4 != 0) {
                int i11 = this.F;
                if (i11 != 9 && i11 != 10) {
                    float f4 = x;
                    float f5 = i4;
                    this.q0 = f5;
                    float f6 = this.a;
                    if (f6 != 1.0f) {
                        x = (int) gl.R1(f4, f4, f6);
                        i4 = (int) gl.R1(this.q0, f5, this.a);
                    }
                    if (i11 == -2) {
                        float f7 = this.J / 2.0f;
                        int L2 = (measuredHeight / 2) - gl.L(14.0f);
                        gradientDrawable.setBounds((int) ((x - gl.L(12.5f)) - f7), L2, (int) (gl.L(12.5f) + x + i4 + f7), gl.L(28.0f) + L2);
                        gradientDrawable.setAlpha(31);
                        gradientDrawable.draw(canvas);
                        return drawChild;
                    }
                    gradientDrawable.setBounds(x, (int) ((this.a0 * Math.round(gl.p * 4.0f)) + (measuredHeight - Math.round(gl.p * 4.0f))), i4 + x, (int) ((this.a0 * Math.round(gl.p * 4.0f)) + measuredHeight));
                    gradientDrawable.draw(canvas);
                    return drawChild;
                }
                int p1 = bkb.p1(0.15f, this.c.getColor());
                Paint paint = this.r0;
                paint.setColor(p1);
                float f8 = measuredHeight / 2.0f;
                RectF rectF = gl.P;
                float L3 = gl.L(26.0f) / 2.0f;
                rectF.set(x - gl.L(12.0f), f8 - L3, gl.L(12.0f) + x + i4, f8 + L3);
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
            }
        }
        return drawChild;
    }

    public final void e(int i, int i2) {
        boolean z;
        int i3 = this.G;
        if (i3 < i2) {
            z = true;
        } else {
            z = false;
        }
        this.O = -1;
        this.h0 = i3;
        this.i0 = this.H;
        uec uecVar = this.E;
        if (uecVar != null) {
            uecVar.e0();
        }
        this.G = i2;
        this.H = i;
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.K) {
            this.K = false;
        }
        this.g0 = 0.0f;
        this.L = 0.0f;
        this.K = true;
        setEnabled(false);
        uec uecVar2 = this.E;
        if (uecVar2 != null) {
            uecVar2.a(i2, z);
        }
        d(this.G);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l0 = ofFloat;
        ofFloat.addUpdateListener(new uwb(this, (byte) 5));
        this.l0.setDuration(250L);
        this.l0.setInterpolator(s33.f);
        this.l0.addListener(new iab(this, (byte) 17));
        this.l0.start();
    }

    public void f(float f, int i, int i2) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        this.G = i;
        SparseIntArray sparseIntArray = this.c0;
        this.H = sparseIntArray.get(i);
        if (f > 0.0f) {
            uec uecVar = this.E;
            if (uecVar != null) {
                uecVar.e0();
            }
            this.M = i2;
            this.N = sparseIntArray.get(i2);
        } else {
            this.M = -1;
            this.N = -1;
        }
        this.L = f;
        this.w.h1();
        invalidate();
        d(i);
        if (f >= 1.0f) {
            this.M = -1;
            this.N = -1;
            this.G = i2;
            this.H = sparseIntArray.get(i2);
        }
        uec uecVar2 = this.E;
        if (uecVar2 != null) {
            uecVar2.c();
        }
    }

    public final void g(float f, int i) {
        int i2 = this.d0.get(i, -1);
        if (i2 >= 0) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f > 0.0f) {
                this.M = i2;
                this.N = i;
            } else {
                this.M = -1;
                this.N = -1;
            }
            this.L = f;
            this.w.h1();
            invalidate();
            d(i2);
            if (f >= 1.0f) {
                this.M = -1;
                this.N = -1;
                this.G = i2;
                this.H = i;
            }
        }
    }

    public float getAnimatingIndicatorProgress() {
        return this.L;
    }

    public int getCurrentPosition() {
        return this.G;
    }

    public int getCurrentTabId() {
        return this.H;
    }

    public int getFirstTabId() {
        return this.c0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.h0;
    }

    public Drawable getSelectorDrawable() {
        return this.P;
    }

    public o39 getTabsContainer() {
        return this.w;
    }

    public final void h(int i, int i2, int i3, int i4, int i5) {
        this.Q = i;
        this.R = i2;
        this.S = i3;
        this.T = i4;
        this.U = i5;
        this.P.setColor(bkb.v0(i, this.k0));
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        if (this.V != i5) {
            this.V = i5;
            this.O = -1;
            if (this.K) {
                gl.r(this.j0);
                this.K = false;
                setEnabled(true);
                uec uecVar = this.E;
                if (uecVar != null) {
                    uecVar.g(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = (View.MeasureSpec.getSize(i) - gl.L(7.0f)) - gl.L(7.0f);
            int i5 = this.J;
            if (arrayList.size() != 1 && (i4 = this.F) != 9 && i4 != 10) {
                int i6 = this.I;
                if (i6 < size) {
                    i3 = (size - i6) / arrayList.size();
                } else {
                    i3 = 0;
                }
                this.J = i3;
            } else {
                this.J = 0;
                i3 = 0;
            }
            if (i5 != i3) {
                this.s = true;
                this.y.f();
                this.s = false;
            }
            SparseIntArray sparseIntArray = this.f0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.e0;
            sparseIntArray2.clear();
            int L = gl.L(7.0f);
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                int a = ((sec) arrayList.get(i7)).a(this.c);
                sparseIntArray2.put(i7, a);
                sparseIntArray.put(i7, (this.J / 2) + L);
                L += gl.L(this.r << 1) + a + this.J;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f) {
        this.L = f;
        this.w.h1();
        invalidate();
        uec uecVar = this.E;
        if (uecVar != null) {
            uecVar.g(f);
        }
    }

    public void setBlurredBackground(il0 il0Var) {
        this.s0 = il0Var;
        setBackground(il0Var);
    }

    public void setDelegate(uec uecVar) {
        this.E = uecVar;
    }

    public void setIsEditing(boolean z) {
        this.n = z;
        this.w.h1();
        invalidate();
    }

    public void setOnTabLongClick(j8c j8cVar) {
        this.b = j8cVar;
    }

    public void setPreTabClick(j8c j8cVar) {
        this.m0 = j8cVar;
    }

    public void setReordering(boolean z) {
        ns9 ns9Var;
        if (this.n0 == z) {
            return;
        }
        this.n0 = z;
        if (z && this.o0 == null) {
            this.o0 = new is5(new r10(this, (byte) 9));
        }
        if (this.n0 && this.p0 == null) {
            rec recVar = new rec(this);
            this.p0 = recVar;
            recVar.m = false;
            recVar.C = false;
            recVar.o(s33.h);
            this.p0.n(350L);
        }
        is5 is5Var = this.o0;
        rec recVar2 = null;
        ns9 ns9Var2 = this.w;
        if (is5Var != null) {
            if (z) {
                ns9Var = ns9Var2;
            } else {
                ns9Var = null;
            }
            is5Var.h(ns9Var);
        }
        if (z) {
            recVar2 = this.p0;
        }
        ns9Var2.setItemAnimator(recVar2);
        gl.d0(ns9Var2, new ra((byte) 8, this, z));
    }

    @Override
    public final void updateColors() {
        il0 il0Var = this.s0;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        GradientDrawable gradientDrawable = this.P;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(bkb.v0(this.Q, this.k0));
        }
        ns9 ns9Var = this.w;
        if (ns9Var != null) {
            ns9Var.h1();
            ns9Var.invalidate();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
