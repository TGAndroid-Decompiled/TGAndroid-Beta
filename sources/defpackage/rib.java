package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Magnifier;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
public abstract class rib {
    public final zs3 A;
    public final Rect B;
    public qib C;
    public ive D;
    public o39 E;
    public ViewGroup F;
    public Magnifier G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final RectF S;
    public final RectF T;
    public float U;
    public float V;
    public mib W;
    public mib X;
    public yi4 Y;
    public boolean Z;
    public int a;
    public final hi2 a0;
    public int b;
    public int b0;
    public int c;
    public final OvershootInterpolator c0;
    public int d;
    public int d0;
    public boolean e;
    public final bib e0;
    public float f;
    public final bib f0;
    public float g;
    public wjb g0;
    public final int[] h = new int[2];
    public boolean h0;
    public boolean i;
    public boolean i0;
    public boolean j;
    public boolean j0;
    public boolean k;
    public ys k0;
    public final int l;
    public ValueAnimator l0;
    public final int m;
    public final kya m0;
    public final float n;
    public final bib n0;
    public final Paint o;
    public final lib o0;
    public final Paint p;
    public final pw2 q;
    public final Path r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    public rib() {
        Paint paint = new Paint(1);
        this.o = paint;
        this.p = new Paint(1);
        pw2 pw2Var = new pw2();
        this.q = pw2Var;
        this.r = new Path();
        this.u = -1;
        this.v = -1;
        this.A = new zs3(this, new dt3(this), (byte) 2);
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.a0 = new Object();
        this.c0 = new OvershootInterpolator();
        this.e0 = new bib(this, (byte) 0);
        this.f0 = new bib(this, (byte) 1);
        this.h0 = true;
        this.k0 = null;
        this.m0 = new kya(this, (byte) 29);
        this.n0 = new bib(this, (byte) 2);
        ?? path = new Path();
        path.a = 0.0f;
        path.b = new ArrayList(1);
        path.c = 0;
        this.o0 = path;
        this.l = ViewConfiguration.getLongPressTimeout();
        this.m = ViewConfiguration.get(a.b).getScaledTouchSlop();
        float L = gl.L(6.0f);
        this.n = L;
        paint.setPathEffect(new CornerPathEffect(L));
        pw2Var.d = 1.0f;
    }

    public static boolean x(char c) {
        if (!Character.isLetter(c) && !Character.isDigit(c) && c != '_') {
            return false;
        }
        return true;
    }

    public final int[] A(int i) {
        hi2 hi2Var = this.a0;
        h(i, hi2Var, false);
        Layout layout = (Layout) hi2Var.d;
        int i2 = i - hi2Var.a;
        int[] iArr = this.h;
        if (layout != null && i2 >= 0 && i2 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i2);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i2) + hi2Var.c);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + hi2Var.b);
        }
        return iArr;
    }

    public boolean B() {
        return false;
    }

    public final void F() {
        qib qibVar;
        if (w() && (qibVar = this.C) != null) {
            this.Q = true;
            qibVar.invalidate();
            t();
        }
    }

    public boolean I() {
        return false;
    }

    public void K(mib mibVar, mib mibVar2) {
        nib nibVar = (nib) mibVar;
        nib nibVar2 = (nib) mibVar2;
    }

    public final boolean L(MotionEvent motionEvent) {
        rib ribVar;
        int action = motionEvent.getAction();
        bib bibVar = this.f0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int y = this.t - ((int) motionEvent.getY());
                    int x = this.s - ((int) motionEvent.getX());
                    int i = (x * x) + (y * y);
                    int i2 = this.m;
                    if (i > i2 * i2) {
                        gl.r(bibVar);
                        this.z = false;
                    }
                    return this.z;
                }
            }
            gl.r(bibVar);
            this.z = false;
            return false;
        }
        this.s = (int) motionEvent.getX();
        this.t = (int) motionEvent.getY();
        this.z = false;
        Rect rect = this.B;
        rect.inset(-gl.L(8.0f), -gl.L(8.0f));
        if (rect.contains(this.s, this.t) && this.X != null) {
            rect.inset(gl.L(8.0f), gl.L(8.0f));
            int i3 = this.s;
            int i4 = this.t;
            int i5 = rect.right;
            if (i3 > i5) {
                i3 = i5 - 1;
            }
            int i6 = rect.left;
            if (i3 < i6) {
                i3 = i6 + 1;
            }
            int i7 = i3;
            int i8 = rect.top;
            if (i4 < i8) {
                i4 = i8 + 1;
            }
            int i9 = rect.bottom;
            if (i4 > i9) {
                i4 = i9 - 1;
            }
            ribVar = this;
            int j = ribVar.j(i7, i4, this.c, this.d, this.X, true);
            CharSequence r = ribVar.r(ribVar.X, true);
            if (j >= r.length()) {
                hi2 hi2Var = ribVar.a0;
                ribVar.h(j, hi2Var, true);
                Layout layout = (Layout) hi2Var.d;
                if (layout == null) {
                    ribVar.z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f = i7 - ribVar.c;
                if (f < ((Layout) hi2Var.d).getLineRight(lineCount) + gl.L(4.0f) && f > ((Layout) hi2Var.d).getLineLeft(lineCount)) {
                    j = r.length() - 1;
                }
            }
            if (j >= 0 && j < r.length() && r.charAt(j) != '\n') {
                gl.r(bibVar);
                gl.d3(bibVar, ribVar.l);
                ribVar.z = true;
            }
        } else {
            ribVar = this;
        }
        return ribVar.z;
    }

    public boolean O(int i, int i2) {
        return false;
    }

    public final void P() {
        this.i0 = true;
    }

    public final void Q(ViewGroup viewGroup) {
        if (viewGroup instanceof o39) {
            this.E = (o39) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void R() {
        if (this.C != null && !this.i && w() && c()) {
            if (!this.P) {
                yi4 yi4Var = this.Y;
                zs3 zs3Var = this.A;
                if (yi4Var == null) {
                    yi4 yi4Var2 = new yi4(this.C.getContext(), zs3Var, this.C, new gk4(this.C.getContext(), this.C, 1, p(), null));
                    this.Y = yi4Var2;
                    zs3Var.onCreateActionMode(yi4Var2, yi4Var2.c);
                }
                yi4 yi4Var3 = this.Y;
                zs3Var.onPrepareActionMode(yi4Var3, yi4Var3.c);
                this.Y.hide(1L);
            }
            gl.r(this.n0);
            this.P = true;
        }
    }

    public final void S() {
        if (this.V != 1.0f && this.C != null) {
            ValueAnimator valueAnimator = this.l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
            this.l0 = ofFloat;
            ofFloat.addUpdateListener(new gja(this, (byte) 20));
            this.l0.setDuration(Math.abs(1.0f - this.V) * 250.0f);
            this.l0.start();
        }
    }

    public final void T(int i) {
        int i2;
        int lineRight;
        int lineLeft;
        if (Build.VERSION.SDK_INT >= 28 && this.W != null && !this.k && this.i && this.C != null) {
            if (this.j) {
                i2 = this.u;
            } else {
                i2 = this.v;
            }
            hi2 hi2Var = this.a0;
            h(i2, hi2Var, false);
            Layout layout = (Layout) hi2Var.d;
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(Utilities.j(i2 - hi2Var.a, layout.getText().length(), 0));
                int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                int[] k = k();
                int lineTop = (int) (((((layout.getLineTop(lineForOffset) + this.b) + k[1]) - lineBottom) - gl.L(8.0f)) + hi2Var.b);
                mib mibVar = this.W;
                if (mibVar instanceof uv) {
                    lineLeft = k[0];
                    lineRight = ((View) mibVar).getMeasuredWidth() + lineLeft;
                } else {
                    float f = k[0] + this.a + hi2Var.c;
                    lineRight = (int) (layout.getLineRight(lineForOffset) + k[0] + this.a + hi2Var.c);
                    lineLeft = (int) (layout.getLineLeft(lineForOffset) + f);
                }
                if (i < lineLeft) {
                    i = lineLeft;
                } else if (i > lineRight) {
                    i = lineRight;
                }
                float f2 = this.I;
                float f3 = lineTop;
                if (f2 != f3) {
                    this.I = f3;
                    this.J = (f3 - this.H) / 200.0f;
                    f2 = f3;
                }
                float f4 = this.L;
                float f5 = i;
                if (f4 != f5) {
                    this.L = f5;
                    this.M = (f5 - this.K) / 100.0f;
                    f4 = f5;
                }
                Magnifier magnifier = this.G;
                if (magnifier == null) {
                    Magnifier magnifier2 = new Magnifier(this.C);
                    this.G = magnifier2;
                    float f6 = this.I;
                    this.H = f6;
                    f4 = this.L;
                    this.K = f4;
                    f2 = f6;
                    magnifier = magnifier2;
                }
                float f7 = this.H;
                if (f7 != f2) {
                    f7 += this.J * 16.0f;
                    this.H = f7;
                }
                float f8 = this.J;
                if (f8 > 0.0f && f7 > f2) {
                    this.H = f2;
                } else if (f8 < 0.0f && f7 < f2) {
                    this.H = f2;
                } else {
                    f2 = f7;
                }
                float f9 = this.K;
                if (f9 != f4) {
                    f9 += this.M * 16.0f;
                    this.K = f9;
                }
                float f10 = this.M;
                if (f10 > 0.0f && f9 > f4) {
                    this.K = f4;
                } else if (f10 < 0.0f && f9 < f4) {
                    this.K = f4;
                } else {
                    f4 = f9;
                }
                magnifier.show(f4, (lineBottom * 1.5f) + f2 + gl.L(8.0f));
                this.G.update();
            }
        }
    }

    public final void U() {
        this.Q = false;
        this.C.invalidate();
        kya kyaVar = this.m0;
        gl.r(kyaVar);
        gl.c3(kyaVar);
    }

    public boolean a() {
        return true;
    }

    public boolean b(int i) {
        if (i != this.u && i != this.v) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (this.W != null) {
            return true;
        }
        return false;
    }

    public boolean d() {
        return false;
    }

    public void e(boolean z) {
        D(z);
        this.u = -1;
        this.v = -1;
        u();
        t();
        v();
        this.W = null;
        this.w = 0;
        gl.r(this.f0);
        this.z = false;
        qib qibVar = this.C;
        if (qibVar != null) {
            qibVar.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        ive iveVar = this.D;
        if (iveVar != null) {
            iveVar.a(false);
        }
        this.s = -1;
        this.t = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = 0.0f;
        this.i = false;
    }

    public final void f(Layout layout, int i, int i2, int i3, boolean z, boolean z2, float f) {
        float f2;
        float f3;
        int i4;
        pw2 pw2Var;
        float f4;
        float f5;
        float f6;
        int lineTop;
        lib libVar = this.o0;
        libVar.reset();
        layout.getSelectionPath(i2, i3, libVar);
        if (libVar.a < layout.getLineBottom(i)) {
            f3 = layout.getLineTop(i);
            f2 = (layout.getLineBottom(i) - lineTop) / (libVar.a - f3);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        int i5 = 0;
        while (true) {
            i4 = libVar.c;
            pw2Var = this.q;
            f4 = this.n;
            if (i5 >= i4) {
                break;
            }
            RectF rectF = (RectF) libVar.b.get(i5);
            float max = Math.max(f, rectF.left);
            if (z) {
                f5 = f4 / 2.0f;
            } else {
                f5 = 0.0f;
            }
            float f7 = (int) (max - f5);
            float A = (int) tb4.A(rectF.top, f3, f2, f3);
            float max2 = Math.max(f, rectF.right);
            if (z2) {
                f6 = f4 / 2.0f;
            } else {
                f6 = 0.0f;
            }
            rectF.set(f7, A, (int) (max2 + f6), (int) tb4.A(rectF.bottom, f3, f2, f3));
            pw2Var.addRect(rectF, Path.Direction.CW);
            i5++;
        }
        if (i4 == 0 && !z2) {
            try {
                pw2Var.addRect(((int) layout.getPrimaryHorizontal(i2)) - (f4 / 2.0f), layout.getLineTop(i), (f4 / 4.0f) + ((int) layout.getPrimaryHorizontal(i3)), layout.getLineBottom(i), Path.Direction.CW);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final void g(android.graphics.Canvas r21, android.text.Layout r22, int r23, int r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rib.g(android.graphics.Canvas, android.text.Layout, int, int, boolean, boolean, float):void");
    }

    public abstract void h(int i, hi2 hi2Var, boolean z);

    public boolean i() {
        return false;
    }

    public abstract int j(int i, int i2, int i3, int i4, mib mibVar, boolean z);

    public final int[] k() {
        int i;
        View view = (View) this.W;
        int i2 = 0;
        if (view != null && this.F != null) {
            i = 0;
            int i3 = 0;
            while (view != this.F) {
                if (view != null) {
                    i = (int) (view.getY() + i);
                    i3 = (int) (view.getX() + i3);
                    if (view instanceof NestedScrollView) {
                        i -= view.getScrollY();
                        i3 -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            i2 = i3;
            return new int[]{i2, i};
        }
        i = 0;
        return new int[]{i2, i};
    }

    public abstract int l();

    public final qib m(Context context) {
        qib qibVar = this.C;
        if (qibVar == null) {
            qib qibVar2 = new qib(this, context);
            this.C = qibVar2;
            return qibVar2;
        }
        return qibVar;
    }

    public int n() {
        return 0;
    }

    public int o() {
        return 0;
    }

    public wjb p() {
        return this.g0;
    }

    public CharSequence q() {
        CharSequence r = r(this.W, false);
        if (r != null) {
            return r.subSequence(this.u, this.v);
        }
        return null;
    }

    public CharSequence r(mib mibVar, boolean z) {
        return ((nib) mibVar).getText();
    }

    public int s(int i) {
        return bkb.v0(i, this.g0);
    }

    public final void t() {
        yi4 yi4Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.n0.run();
        }
        this.P = false;
        if (!w() && (yi4Var = this.Y) != null) {
            yi4Var.finish();
            this.Y = null;
        }
    }

    public final void u() {
        Magnifier magnifier;
        if (Build.VERSION.SDK_INT >= 28 && (magnifier = this.G) != null) {
            magnifier.dismiss();
            this.G = null;
        }
    }

    public void v() {
        mib mibVar = this.W;
        if (mibVar != null) {
            mibVar.invalidate();
        }
        qib qibVar = this.C;
        if (qibVar != null) {
            qibVar.invalidate();
        }
    }

    public final boolean w() {
        if (this.u >= 0 && this.v >= 0) {
            return true;
        }
        return false;
    }

    public boolean y(k27 k27Var) {
        if (k27Var == null || this.w != k27Var.e1()) {
            return false;
        }
        return true;
    }

    public void z(int i, int i2, boolean z, float f, float f2, mib mibVar) {
        int i3;
        int i4;
        if (this.j) {
            this.u = i2;
            if (!z && i2 > (i4 = this.v)) {
                this.v = i2;
                this.u = i4;
                this.j = false;
            }
            this.y = true;
            return;
        }
        this.v = i2;
        if (!z && (i3 = this.u) > i2) {
            this.v = i3;
            this.u = i2;
            this.j = true;
        }
        this.y = true;
    }

    public void C() {
    }

    public void E() {
    }

    public void G() {
    }

    public void M() {
    }

    public void N() {
    }

    public void D(boolean z) {
    }

    public void J(float f, float f2) {
    }

    public void H(int i, int i2, k27 k27Var) {
    }
}
