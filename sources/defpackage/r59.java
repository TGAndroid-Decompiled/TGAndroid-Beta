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
public class r59 extends RecyclerView implements vi5 {
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
    public fg0 C1;
    public boolean C2;
    public int D1;
    public final ei7 D2;
    public View E1;
    public final au3 E2;
    public final Rect F1;
    public Matrix F2;
    public boolean G1;
    public boolean G2;
    public int H1;
    public d59 H2;
    public boolean I1;
    public rac I2;
    public boolean J1;
    public rac J2;
    public boolean K1;
    public h68 K2;
    public ai4 L1;
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
    public j59 R1;
    public int R2;
    public boolean S1;
    public yk0 S2;
    public boolean T0;
    public c59 T1;
    public boolean T2;
    public f59 U0;
    public pp8 U1;
    public boolean U2;
    public g59 V0;
    public boolean V1;
    public p59 V2;
    public h59 W0;
    public boolean W1;
    public int W2;
    public i59 X0;
    public boolean X1;
    public ArrayList X2;
    public boolean Y0;
    public boolean Y1;
    public final Path Y2;
    public k69 Z0;
    public int Z1;
    public e59 a1;
    public int a2;
    public View b1;
    public int b2;
    public ne6 c1;
    public boolean c2;
    public zs4 d1;
    public boolean d2;
    public y49 e1;
    public int e2;
    public m59 f1;
    public int f2;
    public boolean g1;
    public s34 g2;
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
    public w49 m2;
    public long n1;
    public gu2 n2;
    public ArrayList o1;
    public final ylb o2;
    public ArrayList p1;
    public boolean p2;
    public View q1;
    public final ux1 q2;
    public int r1;
    public boolean r2;
    public int s1;
    public final ot7 s2;
    public int t1;
    public Paint t2;
    public int u1;
    public boolean u2;
    public int v1;
    public int v2;
    public boolean w1;
    public ku4 w2;
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

    public r59(Context context, ylb ylbVar) {
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
        this.q2 = new ux1();
        this.r2 = true;
        this.s2 = new ot7(this, (byte) 1);
        this.D2 = new ei7(this, (byte) 12);
        this.T2 = true;
        this.V2 = p59.a;
        this.W2 = cmb.Z6;
        this.Y2 = new Path();
        this.o2 = ylbVar;
        au3 au3Var = new au3();
        this.E2 = au3Var;
        setEdgeEffectFactory(au3Var);
        anb.l(this, 21, cmb.r8, ylbVar);
        anb.l(this, 20, cmb.h6, ylbVar);
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
            fc4.g(th, true);
        }
        super.setOnScrollListener(new so7(this, (byte) 10));
        this.F.add(new cu5(this, context));
    }

    public static float H0(View view) {
        if (view.getTag(2131296421) != null) {
            return view.getBottom();
        }
        return view.getY() + view.getHeight();
    }

    public static boolean b1(View view) {
        if (view instanceof l59) {
            nha nhaVar = (nha) ((l59) view);
            if (nhaVar.c2 && nhaVar.g2 > 0) {
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

    public static float v1(View view) {
        if (view.getTag(2131296421) != null) {
            return view.getTop();
        }
        return view.getY();
    }

    @Override
    public final void D0() {
        try {
            super.D0();
        } catch (NullPointerException unused) {
        }
    }

    @Override
    public final View E(float f, float f2) {
        float f3;
        float f4;
        int childCount = getChildCount();
        for (int i = 0; i < 2; i++) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                if ((!(childAt instanceof rc2) && !(childAt instanceof cm1)) || childAt.getVisibility() != 4) {
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

    public final void E0(Runnable runnable) {
        this.E2.b.add(new yt3(runnable, (byte) 2));
    }

    public boolean F0(float f) {
        return true;
    }

    public boolean G0(View view) {
        return true;
    }

    public boolean I0(View view, float f, float f2) {
        return true;
    }

    public final void J0(boolean z) {
        zs4 zs4Var = this.d1;
        if (zs4Var != null) {
            gm.r(zs4Var);
            this.d1 = null;
        }
        View view = this.M1;
        if (view != null) {
            if (z) {
                k1(view, 0.0f, 0.0f, false);
            }
            this.M1 = null;
            n1(view, null);
        }
        this.F1.setEmpty();
        j59 j59Var = this.R1;
        if (j59Var != null) {
            gm.r(j59Var);
            this.R1 = null;
        }
        this.O1 = false;
    }

    public void K0(Canvas canvas, RectF rectF, long j) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i = 0; i < itemDecorationCount; i++) {
            e69 Y = Y(i);
            if ((Y instanceof vi5) && ((Y != this.H2 && Y != this.S2) || this.G2)) {
                ((vi5) Y).g(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            float x = childAt.getX();
            float y = childAt.getY();
            if (rectF.intersects(x, y, childAt.getWidth() + x, childAt.getHeight() + y)) {
                this.B2 = true;
                drawChild(canvas, childAt, j);
                this.B2 = false;
            }
        }
    }

    public final void L0(boolean z) {
        int i;
        if (!this.h1) {
            int i2 = 0;
            if (getAdapter() != null && this.b1 != null) {
                boolean S0 = S0();
                if (S0) {
                    i = 0;
                } else {
                    i = 8;
                }
                if (!this.X1 || !gda.c()) {
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
                            alpha.setDuration(150L).setListener(new c39(this, (byte) 1)).start();
                        }
                    }
                } else {
                    this.A2 = i;
                    this.b1.setVisibility(i);
                    this.b1.setAlpha(1.0f);
                }
                if (this.z1) {
                    if (!c1() || !this.U2) {
                        if (S0) {
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

    public final void M0(boolean z) {
        y49 y49Var;
        int paddingTop;
        u69 T;
        y49 y49Var2;
        View view;
        boolean z2;
        int i;
        u69 T2;
        int b;
        int S;
        boolean z3;
        int i2;
        int i3;
        if (((this.J1 || z) && this.e1 != null) || (this.x1 != 0 && this.f1 != null)) {
            f69 layoutManager = getLayoutManager();
            if (layoutManager instanceof u46) {
                u46 u46Var = (u46) layoutManager;
                if (u46Var.o) {
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
                                            if (bottom >= gm.L(32.0f) + this.v1 + paddingTop && bottom < i7) {
                                                view2 = childAt;
                                                i7 = bottom;
                                            }
                                        }
                                    }
                                    if (view3 != null && (T2 = T(view3)) != null && (S = this.f1.S((b = T2.b()))) >= 0) {
                                        if (this.r1 != S || this.q1 == null) {
                                            View view4 = this.q1;
                                            if (view4 == null) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            View T3 = this.f1.T(S, view4);
                                            if (z3) {
                                                T0(T3, false);
                                            }
                                            this.q1 = T3;
                                            T3.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
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
                                if (bottom2 >= gm.L(f2) + i13 + paddingTop && bottom2 < i12) {
                                    i12 = bottom2;
                                }
                            }
                            i11++;
                            f = f2;
                        }
                        if (view8 != null && (T = T(view8)) != null) {
                            int b2 = T.b();
                            int abs = Math.abs(u46Var.M0() - b2) + 1;
                            if ((this.J1 || z) && (y49Var2 = this.e1) != null && !y49Var2.n && (getAdapter() instanceof z49)) {
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
                                        View T4 = this.f1.T(i15, view);
                                        if (z2) {
                                            T0(T4, false);
                                        }
                                        this.o1.add(T4);
                                        int M3 = this.f1.M(i15);
                                        if (i15 == this.t1) {
                                            int Q2 = this.f1.Q(i14);
                                            if (Q2 == M3 - 1) {
                                                T4.setTag(Integer.valueOf((-T4.getHeight()) + paddingTop));
                                            } else if (Q2 == M3 - 2) {
                                                View childAt3 = getChildAt(i14 - b2);
                                                if (childAt3 != null) {
                                                    i = childAt3.getTop() + paddingTop;
                                                } else {
                                                    i = -gm.L(100.0f);
                                                }
                                                T4.setTag(Integer.valueOf(Math.min(i, 0)));
                                            } else {
                                                T4.setTag(0);
                                            }
                                            i14 = (M3 - this.f1.Q(b2)) + i14;
                                        } else {
                                            View childAt4 = getChildAt(i14 - b2);
                                            if (childAt4 != null) {
                                                T4.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                            } else {
                                                T4.setTag(Integer.valueOf(-gm.L(100.0f)));
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
                    int K0 = u46Var.K0();
                    u46Var.M0();
                    if (K0 != -1) {
                        if ((this.J1 || z) && (y49Var = this.e1) != null && !y49Var.n) {
                            y59 adapter = getAdapter();
                            if (adapter instanceof z49) {
                                z49 z49Var = (z49) adapter;
                                float H = z49Var.H(this);
                                this.e1.setIsVisible(z49Var.E(this));
                                this.e1.setProgress(Math.min(1.0f, H));
                                this.e1.b(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void N0(float f, float f2) {
        boolean z;
        f47 f47Var;
        int size;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.l2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f2, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f, 0.0f));
        for (int i = 0; i < getChildCount(); i++) {
            s34 s34Var = this.g2;
            int[] iArr2 = this.l2;
            yv1 yv1Var = (yv1) s34Var.d;
            iArr2[0] = (int) yv1Var.P9;
            iArr2[1] = yv1Var.Ya;
            View childAt = getChildAt(i);
            RectF rectF = gm.P;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i2 = this.f2;
                if (i2 != S) {
                    int i3 = this.e2;
                    if (i2 <= i3 && S <= i3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    yv1 yv1Var2 = (yv1) this.g2.d;
                    hu1 hu1Var = yv1Var2.D0;
                    ArrayList arrayList = yv1Var2.M6;
                    int i4 = S - hu1Var.K;
                    if (i4 >= 0 && i4 < arrayList.size()) {
                        k47 k47Var = (k47) arrayList.get(i4);
                        if (k47Var.U == 0 && k47Var.z2() && (f47Var = (f47) yv1Var2.P6.f(k47Var.c1())) != null) {
                            ArrayList arrayList2 = f47Var.d;
                            if (z) {
                                size = 0;
                            } else {
                                size = arrayList2.size() - 1;
                            }
                            S = arrayList.indexOf((k47) arrayList2.get(size)) + yv1Var2.D0.K;
                        }
                    }
                    int i5 = this.f2;
                    if (z) {
                        if (S > i5) {
                            if (!this.g2.a) {
                                for (int i6 = i5 + 1; i6 <= S; i6++) {
                                    if (i6 != this.e2 && this.g2.b(i6)) {
                                        this.g2.l(min2, min, i6, true);
                                    }
                                }
                            }
                        } else {
                            while (i5 > S) {
                                if (i5 != this.e2 && this.g2.b(i5)) {
                                    this.g2.l(min2, min, i5, false);
                                }
                                i5--;
                            }
                        }
                    } else if (S > i5) {
                        while (i5 < S) {
                            if (i5 != this.e2 && this.g2.b(i5)) {
                                this.g2.l(min2, min, i5, false);
                            }
                            i5++;
                        }
                    } else if (!this.g2.a) {
                        for (int i7 = i5 - 1; i7 >= S; i7--) {
                            if (i7 != this.e2 && this.g2.b(i7)) {
                                this.g2.l(min2, min, i7, true);
                            }
                        }
                    }
                }
                if (!this.g2.a) {
                    this.f2 = S;
                    return;
                }
                return;
            }
        }
    }

    public final void O0(Canvas canvas, View view) {
        boolean z;
        boolean z2;
        if (this.S2 == null && view != null && u1(view) && ((Boolean) this.H2.a.a(view)).booleanValue() && j1(view)) {
            int R = RecyclerView.R(view);
            boolean z3 = false;
            if (R == -1) {
                z2 = false;
                z = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                if (U0 != null && j1(U0)) {
                    z = true;
                } else {
                    z = false;
                }
                if (U02 != null && j1(U02)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            RectF rectF = gm.P;
            rectF.set(view.getX(), Math.max((-this.M2) - this.R2, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight() + this.M2, H0(view)));
            if (z && z2) {
                if (v1(view) >= rectF.top) {
                    z = true;
                } else {
                    z = false;
                }
                if (H0(view) <= rectF.bottom) {
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

    public final void P0(Canvas canvas, View view, View view2, boolean z, boolean z2) {
        float f;
        float f2;
        if (view != null && view2 != null) {
            float f3 = 0.0f;
            if (view2 instanceof iw5) {
                f = ((iw5) view2).getBottomInfoMargin();
            } else {
                f = 0.0f;
            }
            RectF rectF = gm.P;
            float left = view.getLeft();
            float f4 = (-this.M2) - this.R2;
            float v1 = v1(view);
            if (z) {
                f2 = this.M2;
            } else {
                f2 = 0.0f;
            }
            float max = Math.max(f4, v1 - f2);
            float right = view.getRight();
            float height = getHeight() + this.M2;
            float H0 = H0(view2);
            if (z2) {
                f3 = this.M2;
            }
            rectF.set(left, max, right, Math.min(height, (H0 + f3) - f));
            if (rectF.bottom >= rectF.top) {
                float f5 = this.M2;
                this.K2.k(canvas, rectF, Float.valueOf(f5), Float.valueOf(f5), Float.valueOf(view.getAlpha()));
            }
        }
    }

    public final void Q0(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r59.Q0(android.graphics.Canvas):void");
    }

    public final void R0(Canvas canvas) {
        fg0 fg0Var;
        gu2 gu2Var;
        View view;
        Rect rect = this.F1;
        if (!rect.isEmpty() && (fg0Var = this.C1) != null) {
            int i = this.H1;
            if ((i == -2 || i == this.D1) && this.E1 != null) {
                if (getAdapter() instanceof q59) {
                    ((q59) getAdapter()).getClass();
                }
                this.C1.setBounds(this.E1.getLeft(), this.E1.getTop(), this.E1.getRight(), this.E1.getBottom());
            } else {
                fg0Var.setBounds(rect);
            }
            canvas.save();
            int i2 = this.H1;
            if ((i2 == -2 || i2 == this.D1) && (gu2Var = this.n2) != null) {
                gu2Var.accept(canvas);
            }
            int i3 = this.H1;
            if ((i3 == -2 || i3 == this.D1) && (view = this.E1) != null) {
                canvas.translate(view.getX() - rect.left, this.E1.getY() - rect.top);
                this.C1.setAlpha((int) (this.E1.getAlpha() * 255.0f));
            }
            if (this.H2 != null) {
                canvas.save();
                O0(canvas, this.E1);
                this.C1.draw(canvas);
                canvas.restore();
            } else {
                this.C1.draw(canvas);
            }
            canvas.restore();
        }
    }

    public boolean S0() {
        if (getAdapter() != null && !this.W1 && getAdapter().b() == 0) {
            return true;
        }
        return false;
    }

    public final void T0(View view, boolean z) {
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
                    fc4.g(e, true);
                }
            } else if (i == 2) {
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), 0);
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            }
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final View U0(int i) {
        if (i != -1) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R == i) {
                    return childAt;
                }
            }
            return null;
        }
        return null;
    }

    public final Drawable V0(View view, boolean z) {
        boolean z2;
        boolean z3;
        if (view.getParent() == this && c1() && j1(view)) {
            int R = RecyclerView.R(view);
            boolean z4 = true;
            if (R == -1) {
                z3 = false;
                z2 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                if (U0 != null && j1(U0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (U02 != null && j1(U02)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            RectF rectF = new RectF();
            rectF.set(view.getX(), Math.max(0.0f, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), H0(view)));
            if (z2 && z3 && !z) {
                if (v1(view) >= rectF.top) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (H0(view) > rectF.bottom) {
                    z4 = false;
                }
                if (z2 && z4) {
                    return cmb.b0(0, cmb.v0(cmb.c6, this.o2));
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
            return new x49(this, view, path, rectF);
        }
        return null;
    }

    public Integer W0(int i) {
        ku4 ku4Var = this.w2;
        if (ku4Var != null) {
            return (Integer) ku4Var.l(Integer.valueOf(i));
        }
        return null;
    }

    public final Paint X0(String str) {
        Paint paint;
        ylb ylbVar = this.o2;
        if (ylbVar != null) {
            paint = ylbVar.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return cmb.T0(str);
    }

    public final boolean Y0(int i, View view) {
        int R;
        if (view != null && i <= 0 && getAdapter() != null && this.J2 != null && (R = RecyclerView.R(view)) != -1 && R != 0) {
            return ((Boolean) this.J2.a(Integer.valueOf(getAdapter().d(R - 1)))).booleanValue();
        }
        return false;
    }

    public final boolean Z0() {
        zt3[] zt3VarArr;
        for (zt3 zt3Var : this.E2.a) {
            if (zt3Var != null && zt3Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void a(ucb ucbVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            ucbVar.b = true;
        } else if (Z0() && getOverScrollMode() != 2) {
            ucbVar.b = true;
        } else {
            int itemDecorationCount = getItemDecorationCount();
            for (int i = 0; i < itemDecorationCount; i++) {
                e69 Y = Y(i);
                if ((Y instanceof vi5) && ((Y != this.H2 && Y != this.S2) || this.G2)) {
                    ((vi5) Y).a(ucbVar, rectF);
                }
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                float x = childAt.getX();
                float y = childAt.getY();
                if (rectF.intersects(x, y, childAt.getWidth() + x, childAt.getHeight() + y)) {
                    ucbVar.getClass();
                    ul1.a(ucbVar, childAt);
                }
            }
        }
    }

    public final boolean a1(int i, View view) {
        int R;
        if (view != null && i >= getChildCount() - 1 && getAdapter() != null && this.J2 != null && (R = RecyclerView.R(view)) != -1 && R != getAdapter().b() - 1) {
            return ((Boolean) this.J2.a(Integer.valueOf(getAdapter().d(R + 1)))).booleanValue();
        }
        return false;
    }

    public final boolean c1() {
        if (this.H2 == null && this.S2 == null) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean canScrollVertically(int i) {
        if (this.S1 && super.canScrollVertically(i)) {
            return true;
        }
        return false;
    }

    public final void d1() {
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

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        float f;
        w49 w49Var = this.m2;
        if (w49Var != null) {
            r59 r59Var = w49Var.a;
            if (w49Var.d || w49Var.e) {
                for (int i = 0; i < r59Var.getChildCount(); i++) {
                    View childAt = r59Var.getChildAt(i);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !w49Var.c.contains(childAt)) {
                        Float f2 = (Float) w49Var.b.get(R, null);
                        if (f2 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f2.floatValue());
                        }
                    }
                }
                w49Var.d = false;
            }
        }
        if (this.T0 && this.A1) {
            R0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.T0 && !this.A1) {
            R0(canvas);
        }
        ne6 ne6Var = this.c1;
        if (ne6Var != null) {
            ne6Var.draw(canvas);
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
                        if (jb6.a0) {
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
                if (jb6.a0) {
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
        y49 fastScroll = getFastScroll();
        if ((fastScroll != null && fastScroll.b0 && fastScroll.m0 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) || (this.f1 != null && (view = this.q1) != null && view.getAlpha() != 0.0f && this.q1.dispatchTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (this.H2 != null && !this.B2) {
            canvas.save();
            O0(canvas, view);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1();
    }

    public final void e1(boolean z) {
        View view = this.M1;
        if (view != null) {
            k1(view, 0.0f, 0.0f, false);
            this.M1 = null;
            if (z) {
                n1(view, null);
            }
        }
        if (!z) {
            this.C1.setState(StateSet.NOTHING);
            this.F1.setEmpty();
        }
    }

    public final void f1(c59 c59Var, int i, boolean z) {
        pp8 pp8Var = this.U1;
        if (pp8Var != null) {
            gm.r(pp8Var);
            this.U1 = null;
        }
        u69 K = K(c59Var.run());
        if (K != null) {
            View view = K.a;
            int c = K.c();
            this.x2 = c;
            l1(c, view);
            fg0 fg0Var = this.C1;
            if (fg0Var != null) {
                Drawable current = fg0Var.getCurrent();
                if (current instanceof TransitionDrawable) {
                    if (this.W0 == null && this.V0 == null) {
                        ((TransitionDrawable) current).resetTransition();
                    } else {
                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                    }
                }
                this.C1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
            }
            fg0 fg0Var2 = this.C1;
            if (fg0Var2 != null && fg0Var2.isStateful() && this.C1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.C1);
            }
            if (i > 0) {
                this.T1 = null;
                pp8 pp8Var2 = new pp8(this, (byte) 23);
                this.U1 = pp8Var2;
                gm.d3(pp8Var2, i);
            }
        } else if (z) {
            this.T1 = c59Var;
        }
    }

    @Override
    public void g(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Z0() && getOverScrollMode() != 2) {
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
        K0(canvas, rectF, uptimeMillis);
    }

    public final void g1() {
        rac racVar;
        h68 h68Var;
        e69 e69Var = this.H2;
        if (e69Var != null) {
            r0(e69Var);
            this.H2 = null;
        }
        e69 e69Var2 = this.S2;
        if (e69Var2 != null) {
            r0(e69Var2);
            this.S2 = null;
        }
        rac racVar2 = this.I2;
        if (racVar2 != null && (racVar = this.J2) != null && (h68Var = this.K2) != null) {
            boolean z = this.T2;
            int i = this.P2;
            if (!z) {
                yk0 yk0Var = new yk0(this, racVar2, racVar, i, this.M2, h68Var, this.Q2, this.U2, this.V2);
                this.S2 = yk0Var;
                i(yk0Var);
                return;
            }
            d59 d59Var = new d59(this, racVar2, i, this.Q2);
            this.H2 = d59Var;
            i(d59Var);
        }
    }

    public View getEmptyView() {
        return this.b1;
    }

    public y49 getFastScroll() {
        return this.e1;
    }

    public ArrayList<View> getHeaders() {
        return this.o1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.p1;
    }

    public f59 getOnItemClickListener() {
        return this.U0;
    }

    public k69 getOnScrollListener() {
        return this.Z0;
    }

    public View getPinnedHeader() {
        return this.q1;
    }

    public View getPressedChildView() {
        return this.M1;
    }

    public int getSectionColorForDecoration() {
        return cmb.v0(cmb.c6, this.o2);
    }

    public int getSectionsBackgroundColorForDecoration() {
        return on2.p(cmb.v0(this.W2, this.o2), 255);
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

    @Override
    public final void h0(View view) {
        if (getAdapter() instanceof q59) {
            u69 G = G(view);
            if (G != null) {
                view.setEnabled(((q59) getAdapter()).D(G));
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

    public void h1() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof vlb) {
                ((vlb) childAt).updateColors();
            }
            childAt.invalidate();
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i1(int i) {
        if (this.L2 != null && i >= 0) {
            for (int i2 = 0; i2 < this.L2.size(); i2++) {
                long longValue = ((Long) this.L2.get(i2)).longValue();
                Typeface typeface = gm.a;
                int i3 = (int) (longValue >> 32);
                int i4 = (int) longValue;
                if (i >= i3 && i <= i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j1(View view) {
        yk0 yk0Var = this.S2;
        if (yk0Var != null) {
            return yk0Var.u(view);
        }
        d59 d59Var = this.H2;
        if (d59Var != null && ((Boolean) d59Var.a.a(view)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        fg0 fg0Var = this.C1;
        if (fg0Var != null) {
            fg0Var.jumpToCurrentState();
        }
    }

    public void k1(View view, float f, float f2, boolean z) {
        if (!this.i1 && view != null) {
            view.setPressed(z);
        }
    }

    public final void l1(int i, View view) {
        boolean z;
        int i2;
        int i3;
        pp8 pp8Var = this.U1;
        if (pp8Var != null) {
            gm.r(pp8Var);
            this.U1 = null;
            this.T1 = null;
        }
        if (this.C1 != null) {
            if (i != this.D1) {
                z = true;
            } else {
                z = false;
            }
            if (getAdapter() instanceof q59) {
                ((q59) getAdapter()).getClass();
            }
            if (i != -1) {
                this.D1 = i;
            }
            this.E1 = view;
            if (this.B1 == 8) {
                cmb.E1(this.C1, this.Z1, 0);
            } else if (this.a2 > 0 && getAdapter() != null) {
                fg0 fg0Var = this.C1;
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
                cmb.E1(fg0Var, i2, i3);
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
            setListSelectorColor(W0(i));
            this.C1.setBounds(rect);
            if (z && getVisibility() == 0) {
                this.C1.setVisible(true, false);
            }
        }
    }

    public final void m1() {
        int i;
        pp8 pp8Var = this.U1;
        if (pp8Var != null) {
            gm.r(pp8Var);
            this.U1.run();
            this.U1 = null;
            this.E1 = null;
            return;
        }
        this.U1 = null;
        this.T1 = null;
        View view = this.E1;
        if (view != null && (i = this.x2) != -1) {
            l1(i, view);
            fg0 fg0Var = this.C1;
            if (fg0Var != null) {
                fg0Var.setState(new int[0]);
                invalidateDrawable(this.C1);
            }
            this.E1 = null;
            this.x2 = -1;
            return;
        }
        fg0 fg0Var2 = this.C1;
        if (fg0Var2 != null) {
            Drawable current = fg0Var2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        fg0 fg0Var3 = this.C1;
        if (fg0Var3 != null && fg0Var3.isStateful() && this.C1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.C1);
        }
    }

    public final void n1(View view, MotionEvent motionEvent) {
        if (view != null) {
            Rect rect = this.F1;
            if (!rect.isEmpty()) {
                if (view.isEnabled()) {
                    l1(this.N1, view);
                    fg0 fg0Var = this.C1;
                    if (fg0Var != null) {
                        Drawable current = fg0Var.getCurrent();
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
                y1();
            }
        }
    }

    public final void o1(r59 r59Var, boolean z) {
        ViewParent parent;
        if (r59Var != null && (parent = r59Var.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z);
            ViewParent touchParent = getTouchParent();
            if (touchParent == null) {
                return;
            }
            touchParent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y49 y49Var = this.e1;
        if (y49Var != null && y49Var.getParent() != getParent()) {
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
        w49 w49Var = this.m2;
        if (w49Var != null) {
            w49Var.a();
        }
        if (this.u2) {
            this.u2 = false;
            nm7.e().k(nm7.k1, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.P1) {
                o1(this, true);
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
        y49 y49Var = this.e1;
        if (y49Var != null) {
            this.I1 = true;
            if (y49Var.a) {
                i5 = getPaddingTop();
            } else {
                i5 = y49Var.i0;
            }
            int i6 = i2 + i5;
            y49 y49Var2 = this.e1;
            if (y49Var2.h0) {
                y49Var2.layout(0, i6, y49Var2.getMeasuredWidth(), this.e1.getMeasuredHeight() + i6);
            } else {
                int measuredWidth = getMeasuredWidth() - this.e1.getMeasuredWidth();
                y49 y49Var3 = this.e1;
                y49Var3.layout(measuredWidth, i6, y49Var3.getMeasuredWidth() + measuredWidth, this.e1.getMeasuredHeight() + i6);
            }
            this.I1 = false;
        }
        M0(false);
        c59 c59Var = this.T1;
        if (c59Var != null) {
            f1(c59Var, 700, false);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        y49 y49Var = this.e1;
        if (y49Var != null && y49Var.getLayoutParams() != null) {
            y49 y49Var2 = this.e1;
            if (y49Var2.a) {
                i3 = getPaddingTop();
            } else {
                i3 = y49Var2.i0;
            }
            int measuredHeight = (getMeasuredHeight() - i3) - getPaddingBottom();
            this.e1.getLayoutParams().height = measuredHeight;
            this.e1.measure(View.MeasureSpec.makeMeasureSpec(gm.L(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.b2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        View view;
        super.onSizeChanged(i, i2, i3, i4);
        ne6 ne6Var = this.c1;
        if (ne6Var != null) {
            ne6Var.requestLayout();
        }
        int i5 = this.x1;
        if (i5 == 1) {
            if (this.f1 != null && !this.o1.isEmpty()) {
                for (int i6 = 0; i6 < this.o1.size(); i6++) {
                    T0((View) this.o1.get(i6), true);
                }
            }
        } else if (i5 == 2 && this.f1 != null && (view = this.q1) != null) {
            T0(view, true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        y49 y49Var = this.e1;
        if (y49Var != null && y49Var.n) {
            return false;
        }
        boolean z = this.c2;
        ei7 ei7Var = this.D2;
        if (z && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.j2 == Float.MAX_VALUE && this.k2 == Float.MAX_VALUE) {
                this.j2 = motionEvent.getX();
                this.k2 = motionEvent.getY();
            }
            if (!this.d2 && Math.abs(motionEvent.getY() - this.k2) > this.b2) {
                this.d2 = true;
                o1(this, true);
            }
            if (this.d2) {
                N0(motionEvent.getX(), motionEvent.getY());
                s34 s34Var = this.g2;
                int[] iArr = this.l2;
                yv1 yv1Var = (yv1) s34Var.d;
                iArr[0] = (int) yv1Var.P9;
                iArr[1] = yv1Var.Ya;
                if (motionEvent.getY() > (getMeasuredHeight() - gm.L(56.0f)) - this.l2[1] && (this.f2 >= this.e2 || !this.g2.a)) {
                    this.i2 = false;
                    if (!this.h2) {
                        this.h2 = true;
                        gm.r(ei7Var);
                        gm.c3(ei7Var);
                        return true;
                    }
                } else if (motionEvent.getY() < gm.L(56.0f) + this.l2[0] && (this.f2 <= this.e2 || !this.g2.a)) {
                    this.i2 = true;
                    if (!this.h2) {
                        this.h2 = true;
                        gm.r(ei7Var);
                        gm.c3(ei7Var);
                        return true;
                    }
                } else {
                    this.h2 = false;
                    gm.r(ei7Var);
                }
            }
            return true;
        }
        this.j2 = Float.MAX_VALUE;
        this.k2 = Float.MAX_VALUE;
        this.c2 = false;
        this.d2 = false;
        o1(this, false);
        this.h2 = false;
        gm.r(ei7Var);
        return super.onTouchEvent(motionEvent);
    }

    public final void p1(int i, boolean z) {
        this.X1 = z;
        this.Y1 = i;
    }

    public final void q1(int i, int i2, int i3, int i4) {
        if (getPaddingLeft() == i && getPaddingTop() == i2 && getPaddingRight() == i3 && getPaddingBottom() == i4) {
            return;
        }
        this.C2 = true;
        setPadding(i, i2, i3, i4);
        this.C2 = false;
    }

    public final void r1() {
        s1(gm.L(12.0f), gm.L(16.0f), false);
    }

    @Override
    public void requestLayout() {
        if (!this.W1 && !this.C2) {
            super.requestLayout();
        }
    }

    public void s1(int i, float f, boolean z) {
        pb pbVar = new pb((byte) 10);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new r(this, pbVar, sparseIntArray, (byte) 3), new k22(sparseIntArray, (byte) 7));
        t1((rac) pair.first, (rac) pair.second, i, f, z);
    }

    public void setAccessibilityEnabled(boolean z) {
        this.p2 = z;
    }

    @Override
    public void setAdapter(y59 y59Var) {
        y59 adapter = getAdapter();
        ot7 ot7Var = this.s2;
        if (adapter != null) {
            adapter.a.unregisterObserver(ot7Var);
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
        if (y59Var instanceof m59) {
            this.f1 = (m59) y59Var;
        } else {
            this.f1 = null;
        }
        super.setAdapter(y59Var);
        if (y59Var != null) {
            y59Var.B(ot7Var);
        }
        L0(false);
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
            L0(false);
        }
    }

    public void setFastScrollEnabled(int i) {
        this.e1 = new y49(this, getContext(), i);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.e1);
        }
    }

    public void setFastScrollVisible(boolean z) {
        int i;
        y49 y49Var = this.e1;
        if (y49Var == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        y49Var.setVisibility(i);
        this.e1.b0 = z;
    }

    public void setHideIfEmpty(boolean z) {
        this.z1 = z;
    }

    public void setInstantClick(boolean z) {
        this.Q1 = z;
    }

    @Override
    public void setItemAnimator(d69 d69Var) {
        super.setItemAnimator(d69Var);
    }

    public void setItemSelectorColorProvider(ku4 ku4Var) {
        this.w2 = ku4Var;
    }

    public void setItemsEnterAnimator(w49 w49Var) {
        this.m2 = w49Var;
    }

    public void setLegacySections(boolean z) {
        if (this.T2 == z) {
            return;
        }
        this.T2 = z;
        g1();
        b0();
        invalidate();
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        int i;
        if (num == null) {
            if (c1()) {
                i = cmb.i6;
            } else {
                i = cmb.h6;
            }
            intValue = cmb.v0(i, this.o2);
        } else {
            intValue = num.intValue();
        }
        this.v2 = intValue;
        cmb.F1(this.C1, intValue, true);
    }

    public void setOnInterceptTouchListener(e59 e59Var) {
        this.a1 = e59Var;
    }

    public void setOnItemClickListener(f59 f59Var) {
        this.U0 = f59Var;
    }

    public void setOnItemLongClickListener(h59 h59Var) {
        boolean z;
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.W0 = h59Var;
        ai4 ai4Var = this.L1;
        if (h59Var != null) {
            z = true;
        } else {
            z = false;
        }
        pu4 pu4Var = (pu4) ai4Var.b;
        pu4Var.t = z;
        pu4Var.u = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(k69 k69Var) {
        this.Z0 = k69Var;
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
        s1(gm.L(12.0f), gm.L(16.0f), z);
    }

    public void setSectionsDrawBackground(boolean z) {
        if (this.U2 != z) {
            this.U2 = z;
            if (z) {
                setLegacySections(false);
            }
            yk0 yk0Var = this.S2;
            if (yk0Var != null) {
                r59 r59Var = yk0Var.a;
                if (yk0Var.L != z) {
                    yk0Var.L = z;
                    r59Var.b0();
                    r59Var.invalidate();
                }
                this.z1 = false;
                if (this.b1 != null) {
                    setVisibility(0);
                }
            }
        }
    }

    public void setSectionsDrawingMode(p59 p59Var) {
        if (this.V2 != p59Var) {
            this.V2 = p59Var;
            yk0 yk0Var = this.S2;
            if (yk0Var != null) {
                r59 r59Var = yk0Var.a;
                if (yk0Var.M != p59Var) {
                    yk0Var.M = p59Var;
                    r59Var.b0();
                    r59Var.invalidate();
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
        fg0 fg0Var = this.C1;
        fg0 fg0Var2 = null;
        if (fg0Var != null) {
            fg0Var.setCallback(null);
        }
        int i2 = this.B1;
        if (i2 == 8) {
            fg0Var2 = cmb.Y(i, this.Z1, 0);
            this.C1 = fg0Var2;
        } else if (i2 == 9) {
            this.C1 = null;
        } else {
            int i3 = this.a2;
            if (i3 > 0) {
                fg0Var2 = cmb.Y(i, i3, i3);
                this.C1 = fg0Var2;
            } else {
                int i4 = this.Z1;
                if (i4 > 0 && i2 != 1) {
                    fg0Var2 = cmb.i0(i4, i4, i4, i4, 0, i, -16777216);
                    this.C1 = fg0Var2;
                } else if (i2 == 2) {
                    fg0Var2 = cmb.f0(i, 2, -1);
                    this.C1 = fg0Var2;
                } else {
                    fg0Var2 = cmb.f0(i, i2, i4);
                    this.C1 = fg0Var2;
                }
            }
        }
        if (fg0Var2 != null) {
            fg0Var2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i) {
        this.Z1 = i;
    }

    public void setSelectorTransformer(gu2 gu2Var) {
        this.n2 = gu2Var;
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
        y49 y49Var = this.e1;
        if (y49Var != null) {
            y49Var.setTranslationY(f);
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

    public final void t1(rac racVar, rac racVar2, int i, float f, boolean z) {
        h68 h68Var = new h68(this, (byte) 24);
        anb.l(this, 20, cmb.i6, this.o2);
        this.I2 = racVar;
        this.J2 = racVar2;
        this.P2 = i;
        this.Q2 = z;
        this.M2 = f;
        this.N2 = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.O2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f};
        this.K2 = h68Var;
        g1();
    }

    public boolean u1(View view) {
        return true;
    }

    @Override
    public final boolean v(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if (this.Y0) {
            i59 i59Var = this.X0;
            if (i59Var != null) {
                i59Var.k(i2);
            }
            iArr[0] = i;
            iArr[1] = i2;
            return true;
        }
        return super.v(i, i2, i3, iArr, iArr2);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.C1 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public boolean w1() {
        return this.H;
    }

    public final void x1() {
        y49 y49Var = this.e1;
        if (y49Var != null) {
            y49Var.updateColors();
        }
    }

    public final void y1() {
        fg0 fg0Var = this.C1;
        if (fg0Var != null && fg0Var.isStateful()) {
            if (this.M1 != null) {
                if (this.C1.setState(getDrawableStateForSelector())) {
                    invalidateDrawable(this.C1);
                }
            } else if (this.U1 == null) {
                this.C1.setState(StateSet.NOTHING);
            }
        }
    }

    public void setOnItemClickListener(g59 g59Var) {
        this.V0 = g59Var;
    }

    public void setOnItemLongClickListener(i59 i59Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.X0 = i59Var;
        ai4 ai4Var = this.L1;
        boolean z = i59Var != null;
        pu4 pu4Var = (pu4) ai4Var.b;
        pu4Var.t = z;
        pu4Var.u = longPressTimeout;
    }

    public r59(Context context) {
        this(context, null);
    }
}
