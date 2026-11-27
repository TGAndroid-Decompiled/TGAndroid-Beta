package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseIntArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
public class d79 extends RecyclerView implements yi5 {
    public static int[] Z2;
    public static boolean a3;
    public static final Method b3;
    public static final Paint c3;
    public static final Path d3;
    public static final float[] e3;
    public boolean A1;
    public int A2;
    public int B1;
    public boolean B2;
    public hf0 C1;
    public boolean C2;
    public int D1;
    public final ki7 D2;
    public View E1;
    public final it3 E2;
    public final Rect F1;
    public Matrix F2;
    public boolean G1;
    public boolean G2;
    public int H1;
    public p69 H2;
    public boolean I1;
    public qcc I2;
    public boolean J1;
    public qcc J2;
    public boolean K1;
    public jz7 K2;
    public xh4 L1;
    public ArrayList L2;
    public View M1;
    public float M2;
    public int N1;
    public float[] N2;
    public boolean O1;
    public float[] O2;
    public boolean P1;
    public int P2;
    public boolean Q1;
    public boolean Q2;
    public v69 R1;
    public int R2;
    public boolean S1;
    public zj0 S2;
    public boolean T0;
    public o69 T1;
    public boolean T2;
    public r69 U0;
    public v59 U1;
    public boolean U2;
    public s69 V0;
    public boolean V1;
    public b79 V2;
    public t69 W0;
    public boolean W1;
    public int W2;
    public u69 X0;
    public boolean X1;
    public ArrayList X2;
    public boolean Y0;
    public boolean Y1;
    public final Path Y2;
    public v79 Z0;
    public int Z1;
    public q69 a1;
    public int a2;
    public View b1;
    public int b2;
    public d26 c1;
    public boolean c2;
    public ct4 d1;
    public boolean d2;
    public k69 e1;
    public int e2;
    public y69 f1;
    public int f2;
    public boolean g1;
    public c34 g2;
    public boolean h1;
    public boolean h2;
    public boolean i1;
    public boolean i2;
    public boolean j1;
    public float j2;
    public Drawable k1;
    public float k2;
    public float l1;
    public int[] l2;
    public float m1;
    public i69 m2;
    public long n1;
    public pt2 n2;
    public ArrayList o1;
    public final vnb o2;
    public ArrayList p1;
    public boolean p2;
    public View q1;
    public final ww1 q2;
    public int r1;
    public boolean r2;
    public int s1;
    public final tu7 s2;
    public int t1;
    public Paint t2;
    public int u1;
    public boolean u2;
    public int v1;
    public int v2;
    public boolean w1;
    public nu4 w2;
    public int x1;
    public int x2;
    public boolean y1;
    public int y2;
    public boolean z1;
    public boolean z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        b3 = method;
        c3 = new Paint(1);
        new Paint(1);
        d3 = new Path();
        e3 = new float[8];
    }

    public d79(Context context, vnb vnbVar) {
        super(context);
        this.T0 = true;
        this.j1 = true;
        this.r1 = -1;
        this.s1 = -1;
        this.y1 = false;
        this.z1 = true;
        this.B1 = 2;
        this.F1 = new Rect();
        this.H1 = -1;
        this.S1 = true;
        this.j2 = Float.MAX_VALUE;
        this.k2 = Float.MAX_VALUE;
        this.p2 = true;
        this.q2 = new ww1();
        this.r2 = true;
        this.s2 = new tu7(this, (byte) 1);
        this.D2 = new ki7(this, (byte) 12);
        this.T2 = true;
        this.V2 = b79.a;
        this.W2 = aob.a7;
        this.Y2 = new Path();
        this.o2 = vnbVar;
        it3 it3Var = new it3();
        this.E2 = it3Var;
        setEdgeEffectFactory(it3Var);
        yob.l(this, 21, aob.s8, vnbVar);
        yob.l(this, 20, aob.i6, vnbVar);
        try {
            if (!a3) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                Z2 = iArr;
                if (iArr == null) {
                    Z2 = new int[0];
                }
                a3 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(Z2);
            Method method = b3;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        super.setOnScrollListener(new e98(this, (byte) 9));
        this.F.add(new gu5(this, context));
    }

    public static float I0(View view) {
        if (view.getTag(2131296421) != null) {
            return view.getBottom();
        }
        return view.getY() + view.getHeight();
    }

    public static boolean c1(View view) {
        if (view instanceof x69) {
            eja ejaVar = (eja) ((x69) view);
            if (ejaVar.c2 && ejaVar.g2 > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    private int[] getDrawableStateForSelector() {
        int[] onCreateDrawableState = onCreateDrawableState(1);
        onCreateDrawableState[onCreateDrawableState.length - 1] = 16842919;
        return onCreateDrawableState;
    }

    public static float w1(View view) {
        if (view.getTag(2131296421) != null) {
            return view.getTop();
        }
        return view.getY();
    }

    @Override
    public final void E0() {
        try {
            super.E0();
        } catch (NullPointerException unused) {
        }
    }

    @Override
    public final View F(float f, float f2) {
        float f3;
        float f4;
        int childCount = getChildCount();
        for (int i = 0; i < 2; i++) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                if ((!(childAt instanceof wb2) && !(childAt instanceof dl1)) || childAt.getVisibility() != 4) {
                    if (i == 0) {
                        f3 = childAt.getTranslationX();
                        f4 = childAt.getTranslationY();
                    } else {
                        f3 = 0.0f;
                        f4 = 0.0f;
                    }
                    if (f >= childAt.getLeft() + f3 && f <= childAt.getRight() + f3 && f2 >= childAt.getTop() + f4 && f2 <= childAt.getBottom() + f4) {
                        return childAt;
                    }
                }
            }
        }
        return null;
    }

    public final void F0(Runnable runnable) {
        this.E2.b.add(new gt3(runnable, (byte) 2));
    }

    public boolean G0(float f) {
        return true;
    }

    public boolean H0(View view) {
        return true;
    }

    public boolean J0(View view, float f, float f2) {
        return true;
    }

    public final void K0(boolean z) {
        ct4 ct4Var = this.d1;
        if (ct4Var != null) {
            hl.r(ct4Var);
            this.d1 = null;
        }
        View view = this.M1;
        if (view != null) {
            if (z) {
                l1(view, 0.0f, 0.0f, false);
            }
            this.M1 = null;
            o1(view, null);
        }
        this.F1.setEmpty();
        v69 v69Var = this.R1;
        if (v69Var != null) {
            hl.r(v69Var);
            this.R1 = null;
        }
        this.O1 = false;
    }

    public void L0(Canvas canvas, RectF rectF, long j) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i = 0; i < itemDecorationCount; i++) {
            p79 Z = Z(i);
            if ((Z instanceof yi5) && ((Z != this.H2 && Z != this.S2) || this.G2)) {
                ((yi5) Z).g(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            float x = childAt.getX();
            float y = childAt.getY();
            if (rectF.intersects(x, y, childAt.getWidth() + x, childAt.getHeight() + y)) {
                this.B2 = true;
                m(canvas, childAt, j);
                this.B2 = false;
            }
        }
    }

    public final void M0(boolean z) {
        int i;
        if (!this.h1) {
            int i2 = 0;
            if (getAdapter() != null && this.b1 != null) {
                boolean T0 = T0();
                if (T0) {
                    i = 0;
                } else {
                    i = 8;
                }
                if (!this.X1 || !xea.c()) {
                    z = false;
                }
                if (z) {
                    if (this.A2 != i) {
                        this.A2 = i;
                        View view = this.b1;
                        if (i == 0) {
                            view.animate().setListener(null).cancel();
                            if (this.b1.getVisibility() == 8) {
                                this.b1.setVisibility(0);
                                this.b1.setAlpha(0.0f);
                                if (this.Y1) {
                                    this.b1.setScaleX(0.7f);
                                    this.b1.setScaleY(0.7f);
                                }
                            }
                            this.b1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else if (view.getVisibility() != 8) {
                            ViewPropertyAnimator alpha = this.b1.animate().alpha(0.0f);
                            if (this.Y1) {
                                alpha.scaleY(0.7f).scaleX(0.7f);
                            }
                            alpha.setDuration(150L).setListener(new n88(this, (byte) 28)).start();
                        }
                    }
                } else {
                    this.A2 = i;
                    this.b1.setVisibility(i);
                    this.b1.setAlpha(1.0f);
                }
                if (this.z1) {
                    if (!d1() || !this.U2) {
                        if (T0) {
                            i2 = 4;
                        }
                        if (getVisibility() != i2) {
                            setVisibility(i2);
                        }
                        this.V1 = true;
                    }
                }
            } else if (this.V1 && getVisibility() != 0) {
                setVisibility(0);
                this.V1 = false;
            }
        }
    }

    public final void N0(boolean z) {
        k69 k69Var;
        int paddingTop;
        f89 U;
        k69 k69Var2;
        View view;
        boolean z2;
        int i;
        f89 U2;
        int b;
        int S;
        boolean z3;
        int i2;
        int i3;
        if (((this.J1 || z) && this.e1 != null) || (this.x1 != 0 && this.f1 != null)) {
            q79 layoutManager = getLayoutManager();
            if (layoutManager instanceof x46) {
                x46 x46Var = (x46) layoutManager;
                if (x46Var.o) {
                    if (this.f1 != null) {
                        if (this.x1 == 1) {
                            paddingTop = 0;
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        int i4 = this.x1;
                        float f = 32.0f;
                        int i5 = Integer.MAX_VALUE;
                        if (i4 != 1 && i4 != 3) {
                            if (i4 == 2) {
                                this.m1 = 0.0f;
                                if (this.f1.b() != 0) {
                                    int childCount = getChildCount();
                                    int i6 = 0;
                                    int i7 = Integer.MAX_VALUE;
                                    View view2 = null;
                                    View view3 = null;
                                    for (int i8 = 0; i8 < childCount; i8++) {
                                        View childAt = getChildAt(i8);
                                        int bottom = childAt.getBottom();
                                        if (bottom > this.v1 + paddingTop) {
                                            if (bottom < i5) {
                                                view3 = childAt;
                                                i5 = bottom;
                                            }
                                            i6 = Math.max(i6, bottom);
                                            if (bottom >= hl.L(32.0f) + this.v1 + paddingTop && bottom < i7) {
                                                view2 = childAt;
                                                i7 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (U2 = U(view3)) != null && (S = this.f1.S((b = U2.b()))) >= 0) {
                                        if (this.r1 != S || this.q1 == null) {
                                            View view4 = this.q1;
                                            if (view4 == null) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            View T = this.f1.T(S, view4);
                                            if (z3) {
                                                U0(T, false);
                                            }
                                            this.q1 = T;
                                            T.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                            View view5 = this.q1;
                                            view5.layout(0, 0, view5.getMeasuredWidth(), this.q1.getMeasuredHeight());
                                            this.r1 = S;
                                        }
                                        if (this.q1 != null && view2 != null && view2.getClass() != this.q1.getClass()) {
                                            this.m1 = 1.0f;
                                        }
                                        int M = this.f1.M(S);
                                        int Q = this.f1.Q(b);
                                        if (i6 != 0 && i6 < getMeasuredHeight() - getPaddingBottom()) {
                                            i2 = -paddingTop;
                                        } else {
                                            i2 = this.v1;
                                        }
                                        int i9 = M - 1;
                                        View view6 = this.q1;
                                        if (Q == i9) {
                                            int height = view6.getHeight();
                                            int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.v1);
                                            if (height2 < height) {
                                                i3 = height2 - height;
                                            } else {
                                                i3 = paddingTop;
                                            }
                                            View view7 = this.q1;
                                            int i10 = paddingTop + i2;
                                            if (i3 < 0) {
                                                view7.setTag(Integer.valueOf(i10 + i3));
                                            } else {
                                                view7.setTag(Integer.valueOf(i10));
                                            }
                                        } else {
                                            view6.setTag(Integer.valueOf(paddingTop + i2));
                                        }
                                        invalidate();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        int childCount2 = getChildCount();
                        int i11 = 0;
                        int i12 = Integer.MAX_VALUE;
                        View view8 = null;
                        while (i11 < childCount2) {
                            View childAt2 = getChildAt(i11);
                            int bottom2 = childAt2.getBottom();
                            float f2 = f;
                            int i13 = this.v1;
                            if (bottom2 > i13 + paddingTop) {
                                if (bottom2 < i5) {
                                    view8 = childAt2;
                                    i5 = bottom2;
                                }
                                if (bottom2 >= hl.L(f2) + i13 + paddingTop && bottom2 < i12) {
                                    i12 = bottom2;
                                }
                            }
                            i11++;
                            f = f2;
                        }
                        if (view8 != null && (U = U(view8)) != null) {
                            int b2 = U.b();
                            int abs = Math.abs(x46Var.M0() - b2) + 1;
                            if ((this.J1 || z) && (k69Var2 = this.e1) != null && !k69Var2.n && (getAdapter() instanceof l69)) {
                                this.e1.setProgress(Math.min(1.0f, b2 / ((this.f1.b() - abs) + 1)));
                            }
                            this.p1.addAll(this.o1);
                            this.o1.clear();
                            if (this.f1.b() != 0) {
                                if (this.r1 != b2 || this.s1 != abs) {
                                    this.r1 = b2;
                                    this.s1 = abs;
                                    this.u1 = 1;
                                    int S2 = this.f1.S(b2);
                                    this.t1 = S2;
                                    int M2 = (this.f1.M(S2) + b2) - this.f1.Q(b2);
                                    while (M2 < b2 + abs) {
                                        M2 += this.f1.M(this.t1 + this.u1);
                                        this.u1++;
                                    }
                                }
                                if (this.x1 != 3) {
                                    int i14 = b2;
                                    for (int i15 = this.t1; i15 < this.t1 + this.u1; i15++) {
                                        if (!this.p1.isEmpty()) {
                                            view = (View) this.p1.get(0);
                                            this.p1.remove(0);
                                        } else {
                                            view = null;
                                        }
                                        if (view == null) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        View T2 = this.f1.T(i15, view);
                                        if (z2) {
                                            U0(T2, false);
                                        }
                                        this.o1.add(T2);
                                        int M3 = this.f1.M(i15);
                                        if (i15 == this.t1) {
                                            int Q2 = this.f1.Q(i14);
                                            if (Q2 == M3 - 1) {
                                                T2.setTag(Integer.valueOf((-T2.getHeight()) + paddingTop));
                                            } else if (Q2 == M3 - 2) {
                                                View childAt3 = getChildAt(i14 - b2);
                                                if (childAt3 != null) {
                                                    i = childAt3.getTop() + paddingTop;
                                                } else {
                                                    i = -hl.L(100.0f);
                                                }
                                                T2.setTag(Integer.valueOf(Math.min(i, 0)));
                                            } else {
                                                T2.setTag(0);
                                            }
                                            i14 = (M3 - this.f1.Q(b2)) + i14;
                                        } else {
                                            View childAt4 = getChildAt(i14 - b2);
                                            if (childAt4 != null) {
                                                T2.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                            } else {
                                                T2.setTag(Integer.valueOf(-hl.L(100.0f)));
                                            }
                                            i14 += M3;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int K0 = x46Var.K0();
                    x46Var.M0();
                    if (K0 != -1) {
                        if ((this.J1 || z) && (k69Var = this.e1) != null && !k69Var.n) {
                            j79 adapter = getAdapter();
                            if (adapter instanceof l69) {
                                l69 l69Var = (l69) adapter;
                                float H = l69Var.H(this);
                                this.e1.setIsVisible(l69Var.E(this));
                                this.e1.setProgress(Math.min(1.0f, H));
                                this.e1.b(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void O0(float f, float f2) {
        boolean z;
        m47 m47Var;
        int size;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.l2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f2, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f, 0.0f));
        for (int i = 0; i < getChildCount(); i++) {
            c34 c34Var = this.g2;
            int[] iArr2 = this.l2;
            zu1 zu1Var = (zu1) c34Var.d;
            iArr2[0] = (int) zu1Var.P9;
            iArr2[1] = zu1Var.Ya;
            View childAt = getChildAt(i);
            RectF rectF = hl.P;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int T = RecyclerView.T(childAt);
                int i2 = this.f2;
                if (i2 != T) {
                    int i3 = this.e2;
                    if (i2 <= i3 && T <= i3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zu1 zu1Var2 = (zu1) this.g2.d;
                    it1 it1Var = zu1Var2.D0;
                    ArrayList arrayList = zu1Var2.M6;
                    int i4 = T - it1Var.K;
                    if (i4 >= 0 && i4 < arrayList.size()) {
                        r47 r47Var = (r47) arrayList.get(i4);
                        if (r47Var.U == 0 && r47Var.z2() && (m47Var = (m47) zu1Var2.P6.f(r47Var.c1())) != null) {
                            ArrayList arrayList2 = m47Var.d;
                            if (z) {
                                size = 0;
                            } else {
                                size = arrayList2.size() - 1;
                            }
                            T = arrayList.indexOf((r47) arrayList2.get(size)) + zu1Var2.D0.K;
                        }
                    }
                    int i5 = this.f2;
                    if (z) {
                        if (T > i5) {
                            if (!this.g2.a) {
                                for (int i6 = i5 + 1; i6 <= T; i6++) {
                                    if (i6 != this.e2 && this.g2.b(i6)) {
                                        this.g2.l(min2, min, i6, true);
                                    }
                                }
                            }
                        } else {
                            while (i5 > T) {
                                if (i5 != this.e2 && this.g2.b(i5)) {
                                    this.g2.l(min2, min, i5, false);
                                }
                                i5--;
                            }
                        }
                    } else if (T > i5) {
                        while (i5 < T) {
                            if (i5 != this.e2 && this.g2.b(i5)) {
                                this.g2.l(min2, min, i5, false);
                            }
                            i5++;
                        }
                    } else if (!this.g2.a) {
                        for (int i7 = i5 - 1; i7 >= T; i7--) {
                            if (i7 != this.e2 && this.g2.b(i7)) {
                                this.g2.l(min2, min, i7, true);
                            }
                        }
                    }
                }
                if (!this.g2.a) {
                    this.f2 = T;
                    return;
                }
                return;
            }
        }
    }

    public final void P0(Canvas canvas, View view) {
        boolean z;
        boolean z2;
        if (this.S2 == null && view != null && v1(view) && ((Boolean) this.H2.a.a(view)).booleanValue() && k1(view)) {
            int S = RecyclerView.S(view);
            boolean z3 = false;
            if (S == -1) {
                z2 = false;
                z = false;
            } else {
                View V0 = V0(S - 1);
                View V02 = V0(S + 1);
                if (V0 != null && k1(V0)) {
                    z = true;
                } else {
                    z = false;
                }
                if (V02 != null && k1(V02)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            RectF rectF = hl.P;
            rectF.set(view.getX(), Math.max((-this.M2) - this.R2, w1(view)), view.getX() + view.getWidth(), Math.min(getHeight() + this.M2, I0(view)));
            if (z && z2) {
                if (w1(view) >= rectF.top) {
                    z = true;
                } else {
                    z = false;
                }
                if (I0(view) <= rectF.bottom) {
                    z3 = true;
                }
                if (!z || !z3) {
                    z2 = z3;
                } else {
                    return;
                }
            }
            Path path = this.Y2;
            if (!z) {
                if (!z2) {
                    path.rewind();
                    float f = this.M2;
                    path.addRoundRect(rectF, f, f, Path.Direction.CW);
                    canvas.clipPath(path);
                    return;
                }
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
                canvas.clipPath(path);
            } else if (!z2) {
                path.rewind();
                path.addRoundRect(rectF, this.O2, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void Q0(Canvas canvas, View view, View view2, boolean z, boolean z2) {
        float f;
        float f2;
        if (view != null && view2 != null) {
            float f3 = 0.0f;
            if (view2 instanceof nw5) {
                f = ((nw5) view2).getBottomInfoMargin();
            } else {
                f = 0.0f;
            }
            RectF rectF = hl.P;
            float left = view.getLeft();
            float f4 = (-this.M2) - this.R2;
            float w1 = w1(view);
            if (z) {
                f2 = this.M2;
            } else {
                f2 = 0.0f;
            }
            float max = Math.max(f4, w1 - f2);
            float right = view.getRight();
            float height = getHeight() + this.M2;
            float I0 = I0(view2);
            if (z2) {
                f3 = this.M2;
            }
            rectF.set(left, max, right, Math.min(height, (I0 + f3) - f));
            if (rectF.bottom >= rectF.top) {
                float f5 = this.M2;
                this.K2.k(canvas, rectF, Float.valueOf(f5), Float.valueOf(f5), Float.valueOf(view.getAlpha()));
            }
        }
    }

    public final void R0(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d79.R0(android.graphics.Canvas):void");
    }

    public final void S0(Canvas canvas) {
        hf0 hf0Var;
        pt2 pt2Var;
        View view;
        Rect rect = this.F1;
        if (!rect.isEmpty() && (hf0Var = this.C1) != null) {
            int i = this.H1;
            if ((i == -2 || i == this.D1) && this.E1 != null) {
                if (getAdapter() instanceof c79) {
                    ((c79) getAdapter()).getClass();
                }
                this.C1.setBounds(this.E1.getLeft(), this.E1.getTop(), this.E1.getRight(), this.E1.getBottom());
            } else {
                hf0Var.setBounds(rect);
            }
            canvas.save();
            int i2 = this.H1;
            if ((i2 == -2 || i2 == this.D1) && (pt2Var = this.n2) != null) {
                pt2Var.accept(canvas);
            }
            int i3 = this.H1;
            if ((i3 == -2 || i3 == this.D1) && (view = this.E1) != null) {
                canvas.translate(view.getX() - rect.left, this.E1.getY() - rect.top);
                this.C1.setAlpha((int) (this.E1.getAlpha() * 255.0f));
            }
            if (this.H2 != null) {
                canvas.save();
                P0(canvas, this.E1);
                this.C1.draw(canvas);
                canvas.restore();
            } else {
                this.C1.draw(canvas);
            }
            canvas.restore();
        }
    }

    public boolean T0() {
        if (getAdapter() != null && !this.W1 && getAdapter().b() == 0) {
            return true;
        }
        return false;
    }

    public final void U0(View view, boolean z) {
        if (view != null) {
            if (!view.isLayoutRequested() && !z) {
                return;
            }
            int i = this.x1;
            if (i == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            } else if (i == 2) {
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), 0);
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final View V0(int i) {
        if (i != -1) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                int S = RecyclerView.S(childAt);
                if (S != -1 && S == i) {
                    return childAt;
                }
            }
            return null;
        }
        return null;
    }

    public final Drawable W0(View view, boolean z) {
        boolean z2;
        boolean z3;
        if (view.getParent() == this && d1() && k1(view)) {
            int S = RecyclerView.S(view);
            boolean z4 = true;
            if (S == -1) {
                z3 = false;
                z2 = false;
            } else {
                View V0 = V0(S - 1);
                View V02 = V0(S + 1);
                if (V0 != null && k1(V0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (V02 != null && k1(V02)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            RectF rectF = new RectF();
            rectF.set(view.getX(), Math.max(0.0f, w1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), I0(view)));
            if (z2 && z3 && !z) {
                if (w1(view) >= rectF.top) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (I0(view) > rectF.bottom) {
                    z4 = false;
                }
                if (z2 && z4) {
                    return aob.b0(0, aob.v0(aob.d6, this.o2));
                }
                z3 = z4;
            }
            Path path = new Path();
            if ((!z2 && !z3) || z) {
                path.rewind();
                float f = this.M2;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
            } else if (!z2) {
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
            } else if (!z3) {
                path.rewind();
                path.addRoundRect(rectF, this.O2, Path.Direction.CW);
            }
            return new j69(this, view, path, rectF);
        }
        return null;
    }

    public Integer X0(int i) {
        nu4 nu4Var = this.w2;
        if (nu4Var != null) {
            return (Integer) nu4Var.h(Integer.valueOf(i));
        }
        return null;
    }

    public final Paint Y0(String str) {
        Paint paint;
        vnb vnbVar = this.o2;
        if (vnbVar != null) {
            paint = vnbVar.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return aob.T0(str);
    }

    public final boolean Z0(int i, View view) {
        int S;
        if (view != null && i <= 0 && getAdapter() != null && this.J2 != null && (S = RecyclerView.S(view)) != -1 && S != 0) {
            return ((Boolean) this.J2.a(Integer.valueOf(getAdapter().d(S - 1)))).booleanValue();
        }
        return false;
    }

    @Override
    public final void a(qeb qebVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            qebVar.b = true;
        } else if (a1() && getOverScrollMode() != 2) {
            qebVar.b = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i = 0; i < itemDecorationCount; i++) {
                p79 Z = Z(i);
                if ((Z instanceof yi5) && ((Z != this.H2 && Z != this.S2) || this.G2)) {
                    ((yi5) Z).a(qebVar, rectF);
                }
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                float x = childAt.getX();
                float y = childAt.getY();
                if (rectF.intersects(x, y, childAt.getWidth() + x, childAt.getHeight() + y)) {
                    qebVar.getClass();
                    vk1.a(qebVar, childAt);
                }
            }
        }
    }

    public final boolean a1() {
        ht3[] ht3VarArr;
        for (ht3 ht3Var : this.E2.a) {
            if (ht3Var != null && ht3Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b1(int i, View view) {
        int S;
        if (view != null && i >= getChildCount() - 1 && getAdapter() != null && this.J2 != null && (S = RecyclerView.S(view)) != -1 && S != getAdapter().b() - 1) {
            return ((Boolean) this.J2.a(Integer.valueOf(getAdapter().d(S + 1)))).booleanValue();
        }
        return false;
    }

    @Override
    public final boolean canScrollVertically(int i) {
        if (this.S1 && super.canScrollVertically(i)) {
            return true;
        }
        return false;
    }

    public final boolean d1() {
        if (this.H2 == null && this.S2 == null) {
            return false;
        }
        return true;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        float f;
        i69 i69Var = this.m2;
        if (i69Var != null) {
            d79 d79Var = i69Var.a;
            if (i69Var.d || i69Var.e) {
                for (int i = 0; i < d79Var.getChildCount(); i++) {
                    View childAt = d79Var.getChildAt(i);
                    int S = RecyclerView.S(childAt);
                    if (S >= 0 && !i69Var.c.contains(childAt)) {
                        Float f2 = (Float) i69Var.b.get(S, null);
                        if (f2 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f2.floatValue());
                        }
                    }
                }
                i69Var.d = false;
            }
        }
        if (this.T0 && this.A1) {
            S0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.T0 && !this.A1) {
            S0(canvas);
        }
        d26 d26Var = this.c1;
        if (d26Var != null) {
            d26Var.draw(canvas);
        }
        if (!this.y1) {
            int i2 = this.x1;
            float f3 = 0.0f;
            if (i2 == 1) {
                if (this.f1 != null && !this.o1.isEmpty()) {
                    for (int i3 = 0; i3 < this.o1.size(); i3++) {
                        View view2 = (View) this.o1.get(i3);
                        int save = canvas.save();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        if (ob6.a0) {
                            f = getWidth() - view2.getWidth();
                        } else {
                            f = 0.0f;
                        }
                        canvas.translate(f, intValue);
                        canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                        view2.draw(canvas);
                        canvas.restoreToCount(save);
                    }
                }
            } else if (i2 == 2 && this.f1 != null && (view = this.q1) != null && view.getAlpha() != 0.0f) {
                int save2 = canvas.save();
                int intValue2 = ((Integer) this.q1.getTag()).intValue();
                if (ob6.a0) {
                    f3 = getWidth() - this.q1.getWidth();
                }
                canvas.translate(f3, intValue2);
                Drawable drawable = this.k1;
                if (drawable != null) {
                    drawable.setBounds(0, this.q1.getMeasuredHeight(), getWidth(), this.k1.getIntrinsicHeight() + this.q1.getMeasuredHeight());
                    this.k1.setAlpha((int) (this.l1 * 255.0f));
                    this.k1.draw(canvas);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long min = Math.min(20L, elapsedRealtime - this.n1);
                    this.n1 = elapsedRealtime;
                    float f4 = this.l1;
                    float f5 = this.m1;
                    if (f4 < f5) {
                        float f6 = (((float) min) / 180.0f) + f4;
                        this.l1 = f6;
                        if (f6 > f5) {
                            this.l1 = f5;
                        }
                        invalidate();
                    } else if (f4 > f5) {
                        float f7 = f4 - (((float) min) / 180.0f);
                        this.l1 = f7;
                        if (f7 < f5) {
                            this.l1 = f5;
                        }
                        invalidate();
                    }
                }
                canvas.clipRect(0, 0, getWidth(), this.q1.getMeasuredHeight());
                this.q1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.y2 == 0 && this.z2) {
                setOverScrollMode(0);
            }
            this.y2++;
        } else if (action == 1 || action == 3) {
            int i = this.y2 - 1;
            this.y2 = i;
            if (i == 0 && this.z2) {
                setOverScrollMode(2);
            }
        }
        k69 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.b0 && fastScroll.m0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f1 != null && (view = this.q1) != null && view.getAlpha() != 0.0f && this.q1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (this.H2 != null && !this.B2) {
            canvas.save();
            P0(canvas, view);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        z1();
    }

    public final void e1() {
        if (!this.h1) {
            this.h1 = true;
            if (getVisibility() != 8) {
                setVisibility(8);
            }
            View view = this.b1;
            if (view != null && view.getVisibility() != 8) {
                this.b1.setVisibility(8);
            }
        }
    }

    public final void f1(boolean z) {
        View view = this.M1;
        if (view != null) {
            l1(view, 0.0f, 0.0f, false);
            this.M1 = null;
            if (z) {
                o1(view, null);
            }
        }
        if (!z) {
            this.C1.setState(StateSet.NOTHING);
            this.F1.setEmpty();
        }
    }

    @Override
    public void g(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (a1() && getOverScrollMode() != 2) {
            if (this.F2 == null) {
                this.F2 = new Matrix();
            }
            int save = canvas.save();
            Matrix matrix = getMatrix();
            if (!matrix.isIdentity() && matrix.invert(this.F2)) {
                canvas.concat(this.F2);
            }
            canvas.translate(-getLeft(), -getTop());
            try {
                super.drawChild(canvas, this, uptimeMillis);
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        L0(canvas, rectF, uptimeMillis);
    }

    public final void g1(o69 o69Var, int i, boolean z) {
        v59 v59Var = this.U1;
        if (v59Var != null) {
            hl.r(v59Var);
            this.U1 = null;
        }
        f89 L = L(o69Var.run());
        if (L != null) {
            View view = L.a;
            int c = L.c();
            this.x2 = c;
            m1(c, view);
            hf0 hf0Var = this.C1;
            if (hf0Var != null) {
                Drawable current = hf0Var.getCurrent();
                if (current instanceof TransitionDrawable) {
                    if (this.W0 == null && this.V0 == null) {
                        ((TransitionDrawable) current).resetTransition();
                    } else {
                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                    }
                }
                this.C1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
            }
            hf0 hf0Var2 = this.C1;
            if (hf0Var2 != null && hf0Var2.isStateful() && this.C1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.C1);
            }
            if (i > 0) {
                this.T1 = null;
                v59 v59Var2 = new v59(this, (byte) 1);
                this.U1 = v59Var2;
                hl.d3(v59Var2, i);
            }
        } else if (z) {
            this.T1 = o69Var;
        }
    }

    public View getEmptyView() {
        return this.b1;
    }

    public k69 getFastScroll() {
        return this.e1;
    }

    public ArrayList<View> getHeaders() {
        return this.o1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.p1;
    }

    public r69 getOnItemClickListener() {
        return this.U0;
    }

    public v79 getOnScrollListener() {
        return this.Z0;
    }

    public View getPinnedHeader() {
        return this.q1;
    }

    public View getPressedChildView() {
        return this.M1;
    }

    public int getSectionColorForDecoration() {
        return aob.v0(aob.d6, this.o2);
    }

    public int getSectionsBackgroundColorForDecoration() {
        return vm2.o(aob.v0(this.W2, this.o2), 255);
    }

    public boolean getSectionsDrawBackground() {
        return this.U2;
    }

    public int getSectionsOverscanTop() {
        return this.R2;
    }

    public Drawable getSelectorDrawable() {
        return this.C1;
    }

    public int getSelectorDrawableColor() {
        return this.v2;
    }

    public Rect getSelectorRect() {
        return this.F1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public final void h1() {
        qcc qccVar;
        jz7 jz7Var;
        p79 p79Var = this.H2;
        if (p79Var != null) {
            s0(p79Var);
            this.H2 = null;
        }
        p79 p79Var2 = this.S2;
        if (p79Var2 != null) {
            s0(p79Var2);
            this.S2 = null;
        }
        qcc qccVar2 = this.I2;
        if (qccVar2 != null && (qccVar = this.J2) != null && (jz7Var = this.K2) != null) {
            boolean z = this.T2;
            int i = this.P2;
            if (!z) {
                zj0 zj0Var = new zj0(this, qccVar2, qccVar, i, this.M2, jz7Var, this.Q2, this.U2, this.V2);
                this.S2 = zj0Var;
                i(zj0Var);
                return;
            }
            p69 p69Var = new p69(this, qccVar2, i, this.Q2);
            this.H2 = p69Var;
            i(p69Var);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public void i0(View view) {
        if (getAdapter() instanceof c79) {
            f89 H = H(view);
            if (H != null) {
                view.setEnabled(((c79) getAdapter()).D(H));
                if (this.p2) {
                    view.setAccessibilityDelegate(this.q2);
                    return;
                }
                return;
            }
            return;
        }
        view.setEnabled(false);
        view.setAccessibilityDelegate(null);
    }

    public void i1() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof snb) {
                ((snb) childAt).updateColors();
            }
            childAt.invalidate();
        }
    }

    public final boolean j1(int i) {
        if (this.L2 != null && i >= 0) {
            for (int i2 = 0; i2 < this.L2.size(); i2++) {
                long longValue = ((Long) this.L2.get(i2)).longValue();
                Typeface typeface = hl.a;
                int i3 = (int) (longValue >> 32);
                int i4 = (int) longValue;
                if (i >= i3 && i <= i4) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        hf0 hf0Var = this.C1;
        if (hf0Var != null) {
            hf0Var.jumpToCurrentState();
        }
    }

    public final boolean k1(View view) {
        zj0 zj0Var = this.S2;
        if (zj0Var != null) {
            return zj0Var.u(view);
        }
        p69 p69Var = this.H2;
        if (p69Var != null && ((Boolean) p69Var.a.a(view)).booleanValue()) {
            return true;
        }
        return false;
    }

    public void l1(View view, float f, float f2, boolean z) {
        if (!this.i1 && view != null) {
            view.setPressed(z);
        }
    }

    public final void m1(int i, View view) {
        boolean z;
        int i2;
        int i3;
        v59 v59Var = this.U1;
        if (v59Var != null) {
            hl.r(v59Var);
            this.U1 = null;
            this.T1 = null;
        }
        if (this.C1 != null) {
            if (i != this.D1) {
                z = true;
            } else {
                z = false;
            }
            if (getAdapter() instanceof c79) {
                ((c79) getAdapter()).getClass();
            }
            if (i != -1) {
                this.D1 = i;
            }
            this.E1 = view;
            if (this.B1 == 8) {
                aob.E1(this.C1, this.Z1, 0);
            } else if (this.a2 > 0 && getAdapter() != null) {
                hf0 hf0Var = this.C1;
                if (i == 0) {
                    i2 = this.a2;
                } else {
                    i2 = 0;
                }
                if (i == getAdapter().b() - 2) {
                    i3 = this.a2;
                } else {
                    i3 = 0;
                }
                aob.E1(hf0Var, i2, i3);
            }
            int left = view.getLeft();
            int top = view.getTop();
            int right = view.getRight();
            int bottom = view.getBottom();
            Rect rect = this.F1;
            rect.set(left, top, right, bottom);
            boolean isEnabled = view.isEnabled();
            if (this.G1 != isEnabled) {
                this.G1 = isEnabled;
            }
            if (z) {
                this.C1.setVisible(false, false);
                this.C1.setState(StateSet.NOTHING);
            }
            setListSelectorColor(X0(i));
            this.C1.setBounds(rect);
            if (z && getVisibility() == 0) {
                this.C1.setVisible(true, false);
            }
        }
    }

    public final void n1() {
        int i;
        v59 v59Var = this.U1;
        if (v59Var != null) {
            hl.r(v59Var);
            this.U1.run();
            this.U1 = null;
            this.E1 = null;
            return;
        }
        this.U1 = null;
        this.T1 = null;
        View view = this.E1;
        if (view != null && (i = this.x2) != -1) {
            m1(i, view);
            hf0 hf0Var = this.C1;
            if (hf0Var != null) {
                hf0Var.setState(new int[0]);
                invalidateDrawable(this.C1);
            }
            this.E1 = null;
            this.x2 = -1;
            return;
        }
        hf0 hf0Var2 = this.C1;
        if (hf0Var2 != null) {
            Drawable current = hf0Var2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        hf0 hf0Var3 = this.C1;
        if (hf0Var3 != null && hf0Var3.isStateful() && this.C1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.C1);
        }
    }

    public final void o1(View view, MotionEvent motionEvent) {
        if (view != null) {
            Rect rect = this.F1;
            if (!rect.isEmpty()) {
                if (view.isEnabled()) {
                    m1(this.N1, view);
                    hf0 hf0Var = this.C1;
                    if (hf0Var != null) {
                        Drawable current = hf0Var.getCurrent();
                        if (current instanceof TransitionDrawable) {
                            ((TransitionDrawable) current).resetTransition();
                        }
                        if (motionEvent != null) {
                            this.C1.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                    }
                } else {
                    rect.setEmpty();
                }
                z1();
            }
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k69 k69Var = this.e1;
        if (k69Var != null && k69Var.getParent() != getParent()) {
            ViewGroup viewGroup = (ViewGroup) this.e1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.e1);
            }
            ((ViewGroup) getParent()).addView(this.e1);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D1 = -1;
        this.E1 = null;
        this.F1.setEmpty();
        i69 i69Var = this.m2;
        if (i69Var != null) {
            i69Var.a();
        }
        if (this.u2) {
            this.u2 = false;
            jn7.e().k(jn7.k1, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.P1) {
                p1(this, true);
            }
            if (this.a1 != null || super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        k69 k69Var = this.e1;
        if (k69Var != null) {
            this.I1 = true;
            if (k69Var.a) {
                i5 = getPaddingTop();
            } else {
                i5 = k69Var.i0;
            }
            int i6 = i2 + i5;
            k69 k69Var2 = this.e1;
            if (k69Var2.h0) {
                k69Var2.layout(0, i6, k69Var2.getMeasuredWidth(), this.e1.getMeasuredHeight() + i6);
            } else {
                int measuredWidth = getMeasuredWidth() - this.e1.getMeasuredWidth();
                k69 k69Var3 = this.e1;
                k69Var3.layout(measuredWidth, i6, k69Var3.getMeasuredWidth() + measuredWidth, this.e1.getMeasuredHeight() + i6);
            }
            this.I1 = false;
        }
        N0(false);
        o69 o69Var = this.T1;
        if (o69Var != null) {
            g1(o69Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        k69 k69Var = this.e1;
        if (k69Var != null && k69Var.getLayoutParams() != null) {
            k69 k69Var2 = this.e1;
            if (k69Var2.a) {
                i3 = getPaddingTop();
            } else {
                i3 = k69Var2.i0;
            }
            int measuredHeight = (getMeasuredHeight() - i3) - getPaddingBottom();
            this.e1.getLayoutParams().height = measuredHeight;
            this.e1.measure(View.MeasureSpec.makeMeasureSpec(hl.L(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.b2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        View view;
        super.onSizeChanged(i, i2, i3, i4);
        d26 d26Var = this.c1;
        if (d26Var != null) {
            d26Var.requestLayout();
        }
        int i5 = this.x1;
        if (i5 == 1) {
            if (this.f1 != null && !this.o1.isEmpty()) {
                for (int i6 = 0; i6 < this.o1.size(); i6++) {
                    U0((View) this.o1.get(i6), true);
                }
            }
        } else if (i5 == 2 && this.f1 != null && (view = this.q1) != null) {
            U0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k69 k69Var = this.e1;
        if (k69Var != null && k69Var.n) {
            return false;
        }
        boolean z = this.c2;
        ki7 ki7Var = this.D2;
        if (z && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.j2 == Float.MAX_VALUE && this.k2 == Float.MAX_VALUE) {
                this.j2 = motionEvent.getX();
                this.k2 = motionEvent.getY();
            }
            if (!this.d2 && Math.abs(motionEvent.getY() - this.k2) > this.b2) {
                this.d2 = true;
                p1(this, true);
            }
            if (this.d2) {
                O0(motionEvent.getX(), motionEvent.getY());
                c34 c34Var = this.g2;
                int[] iArr = this.l2;
                zu1 zu1Var = (zu1) c34Var.d;
                iArr[0] = (int) zu1Var.P9;
                iArr[1] = zu1Var.Ya;
                if (motionEvent.getY() > (getMeasuredHeight() - hl.L(56.0f)) - this.l2[1] && (this.f2 >= this.e2 || !this.g2.a)) {
                    this.i2 = false;
                    if (!this.h2) {
                        this.h2 = true;
                        hl.r(ki7Var);
                        hl.c3(ki7Var);
                        return true;
                    }
                } else if (motionEvent.getY() < hl.L(56.0f) + this.l2[0] && (this.f2 <= this.e2 || !this.g2.a)) {
                    this.i2 = true;
                    if (!this.h2) {
                        this.h2 = true;
                        hl.r(ki7Var);
                        hl.c3(ki7Var);
                        return true;
                    }
                } else {
                    this.h2 = false;
                    hl.r(ki7Var);
                }
            }
            return true;
        }
        this.j2 = Float.MAX_VALUE;
        this.k2 = Float.MAX_VALUE;
        this.c2 = false;
        this.d2 = false;
        p1(this, false);
        this.h2 = false;
        hl.r(ki7Var);
        return super.onTouchEvent(motionEvent);
    }

    public final void p1(d79 d79Var, boolean z) {
        ViewParent parent;
        if (d79Var != null && (parent = d79Var.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z);
            ViewParent touchParent = getTouchParent();
            if (touchParent == null) {
                return;
            }
            touchParent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void q1(int i, boolean z) {
        this.X1 = z;
        this.Y1 = i;
    }

    public final void r1(int i, int i2, int i3, int i4) {
        if (getPaddingLeft() == i && getPaddingTop() == i2 && getPaddingRight() == i3 && getPaddingBottom() == i4) {
            return;
        }
        this.C2 = true;
        setPadding(i, i2, i3, i4);
        this.C2 = false;
    }

    @Override
    public void requestLayout() {
        if (!this.W1 && !this.C2) {
            super.requestLayout();
        }
    }

    public final void s1() {
        t1(hl.L(12.0f), hl.L(16.0f), false);
    }

    public void setAccessibilityEnabled(boolean z) {
        this.p2 = z;
    }

    @Override
    public void setAdapter(j79 j79Var) {
        j79 adapter = getAdapter();
        tu7 tu7Var = this.s2;
        if (adapter != null) {
            adapter.a.unregisterObserver(tu7Var);
        }
        ArrayList arrayList = this.o1;
        if (arrayList != null) {
            arrayList.clear();
            this.p1.clear();
        }
        this.r1 = -1;
        this.D1 = -1;
        this.E1 = null;
        this.F1.setEmpty();
        this.q1 = null;
        if (j79Var instanceof y69) {
            this.f1 = (y69) j79Var;
        } else {
            this.f1 = null;
        }
        super.setAdapter(j79Var);
        if (j79Var != null) {
            j79Var.B(tu7Var);
        }
        M0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z) {
        this.j1 = z;
    }

    public void setAllowStopHeaveOperations(boolean z) {
        this.w1 = z;
    }

    public void setBitmapSectionsBackgroundColorKey(int i) {
        if (this.W2 == i) {
            return;
        }
        this.W2 = i;
        invalidate();
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z) {
        this.G2 = z;
        if (z) {
            setLegacySections(false);
        }
    }

    public void setDisableHighlightState(boolean z) {
        this.i1 = z;
    }

    public void setDisallowInterceptTouchEvents(boolean z) {
        this.P1 = z;
    }

    public void setDrawSelection(boolean z) {
        this.T0 = z;
    }

    public void setDrawSelectorBehind(boolean z) {
        this.A1 = z;
    }

    public void setEmptyView(View view) {
        View view2 = this.b1;
        if (view2 != view) {
            if (view2 != null) {
                view2.animate().setListener(null).cancel();
            }
            this.b1 = view;
            if (this.X1 && view != null) {
                view.setVisibility(8);
            }
            if (this.h1) {
                View view3 = this.b1;
                if (view3 != null) {
                    this.A2 = 8;
                    view3.setVisibility(8);
                    return;
                }
                return;
            }
            this.A2 = -1;
            M0(false);
        }
    }

    public void setFastScrollEnabled(int i) {
        this.e1 = new k69(this, getContext(), i);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.e1);
        }
    }

    public void setFastScrollVisible(boolean z) {
        int i;
        k69 k69Var = this.e1;
        if (k69Var == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        k69Var.setVisibility(i);
        this.e1.b0 = z;
    }

    public void setHideIfEmpty(boolean z) {
        this.z1 = z;
    }

    public void setInstantClick(boolean z) {
        this.Q1 = z;
    }

    @Override
    public void setItemAnimator(o79 o79Var) {
        super.setItemAnimator(o79Var);
    }

    public void setItemSelectorColorProvider(nu4 nu4Var) {
        this.w2 = nu4Var;
    }

    public void setItemsEnterAnimator(i69 i69Var) {
        this.m2 = i69Var;
    }

    public void setLegacySections(boolean z) {
        if (this.T2 == z) {
            return;
        }
        this.T2 = z;
        h1();
        c0();
        invalidate();
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        int i;
        if (num == null) {
            if (d1()) {
                i = aob.j6;
            } else {
                i = aob.i6;
            }
            intValue = aob.v0(i, this.o2);
        } else {
            intValue = num.intValue();
        }
        this.v2 = intValue;
        aob.F1(this.C1, intValue, true);
    }

    public void setOnInterceptTouchListener(q69 q69Var) {
        this.a1 = q69Var;
    }

    public void setOnItemClickListener(r69 r69Var) {
        this.U0 = r69Var;
    }

    public void setOnItemLongClickListener(t69 t69Var) {
        boolean z;
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.W0 = t69Var;
        xh4 xh4Var = this.L1;
        if (t69Var != null) {
            z = true;
        } else {
            z = false;
        }
        su4 su4Var = (su4) xh4Var.b;
        su4Var.t = z;
        su4Var.u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(v79 v79Var) {
        this.Z0 = v79Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.k1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i) {
        this.v1 = i;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z) {
        this.r2 = z;
    }

    public void setScrollEnabled(boolean z) {
        this.S1 = z;
    }

    public void setSections(boolean z) {
        t1(hl.L(12.0f), hl.L(16.0f), z);
    }

    public void setSectionsDrawBackground(boolean z) {
        if (this.U2 != z) {
            this.U2 = z;
            if (z) {
                setLegacySections(false);
            }
            zj0 zj0Var = this.S2;
            if (zj0Var != null) {
                d79 d79Var = zj0Var.a;
                if (zj0Var.L != z) {
                    zj0Var.L = z;
                    d79Var.c0();
                    d79Var.invalidate();
                }
                this.z1 = false;
                if (this.b1 != null) {
                    setVisibility(0);
                }
            }
        }
    }

    public void setSectionsDrawingMode(b79 b79Var) {
        if (this.V2 != b79Var) {
            this.V2 = b79Var;
            zj0 zj0Var = this.S2;
            if (zj0Var != null) {
                d79 d79Var = zj0Var.a;
                if (zj0Var.M != b79Var) {
                    zj0Var.M = b79Var;
                    d79Var.c0();
                    d79Var.invalidate();
                }
            }
        }
    }

    public void setSectionsOverscanTop(int i) {
        this.R2 = i;
    }

    public void setSectionsType(int i) {
        this.x1 = i;
        if (i != 1 && i != 3) {
            return;
        }
        this.o1 = new ArrayList();
        this.p1 = new ArrayList();
    }

    public void setSelectorDrawableColor(int i) {
        this.v2 = i;
        hf0 hf0Var = this.C1;
        hf0 hf0Var2 = null;
        if (hf0Var != null) {
            hf0Var.setCallback(null);
        }
        int i2 = this.B1;
        if (i2 == 8) {
            hf0Var2 = aob.Y(i, this.Z1, 0);
            this.C1 = hf0Var2;
        } else if (i2 == 9) {
            this.C1 = null;
        } else {
            int i3 = this.a2;
            if (i3 > 0) {
                hf0Var2 = aob.Y(i, i3, i3);
                this.C1 = hf0Var2;
            } else {
                int i4 = this.Z1;
                if (i4 > 0 && i2 != 1) {
                    hf0Var2 = aob.i0(i4, i4, i4, i4, 0, i, -16777216);
                    this.C1 = hf0Var2;
                } else if (i2 == 2) {
                    hf0Var2 = aob.f0(i, 2, -1);
                    this.C1 = hf0Var2;
                } else {
                    hf0Var2 = aob.f0(i, i2, i4);
                    this.C1 = hf0Var2;
                }
            }
        }
        if (hf0Var2 != null) {
            hf0Var2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i) {
        this.Z1 = i;
    }

    public void setSelectorTransformer(pt2 pt2Var) {
        this.n2 = pt2Var;
    }

    public void setSelectorType(int i) {
        this.B1 = i;
    }

    public void setSkipDrawSection(boolean z) {
        this.y1 = z;
    }

    public void setTopBottomSelectorRadius(int i) {
        this.a2 = i;
    }

    public void setTranslateSelector(boolean z) {
        int i;
        if (z) {
            i = -2;
        } else {
            i = -1;
        }
        this.H1 = i;
    }

    public void setTranslateSelectorPosition(int i) {
        if (i <= 0) {
            i = -1;
        }
        this.H1 = i;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        k69 k69Var = this.e1;
        if (k69Var != null) {
            k69Var.setTranslationY(f);
        }
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean z) {
        if (Z2 != null) {
            super.setVerticalScrollBarEnabled(z);
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            this.V1 = false;
        }
    }

    public void t1(int i, float f, boolean z) {
        sb sbVar = new sb((byte) 10);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new r(this, sbVar, sparseIntArray, (byte) 3), new p12(sparseIntArray, (byte) 7));
        u1((qcc) pair.first, (qcc) pair.second, i, f, z);
    }

    public final void u1(qcc qccVar, qcc qccVar2, int i, float f, boolean z) {
        jz7 jz7Var = new jz7(this, (byte) 27);
        yob.l(this, 20, aob.j6, this.o2);
        this.I2 = qccVar;
        this.J2 = qccVar2;
        this.P2 = i;
        this.Q2 = z;
        this.M2 = f;
        this.N2 = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.O2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f};
        this.K2 = jz7Var;
        h1();
    }

    public boolean v1(View view) {
        return true;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.C1 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean w(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if (this.Y0) {
            u69 u69Var = this.X0;
            if (u69Var != null) {
                u69Var.h(i2);
            }
            iArr[0] = i;
            iArr[1] = i2;
            return true;
        }
        return super.w(i, i2, i3, iArr, iArr2);
    }

    public boolean x1() {
        return this.H;
    }

    public final void y1() {
        k69 k69Var = this.e1;
        if (k69Var != null) {
            k69Var.updateColors();
        }
    }

    public final void z1() {
        hf0 hf0Var = this.C1;
        if (hf0Var != null && hf0Var.isStateful()) {
            if (this.M1 != null) {
                if (this.C1.setState(getDrawableStateForSelector())) {
                    invalidateDrawable(this.C1);
                }
            } else if (this.U1 == null) {
                this.C1.setState(StateSet.NOTHING);
            }
        }
    }

    public void setOnItemClickListener(s69 s69Var) {
        this.V0 = s69Var;
    }

    public void setOnItemLongClickListener(u69 u69Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.X0 = u69Var;
        xh4 xh4Var = this.L1;
        boolean z = u69Var != null;
        su4 su4Var = (su4) xh4Var.b;
        su4Var.t = z;
        su4Var.u = longPressTimeout;
    }

    public d79(Context context) {
        this(context, null);
    }
}
