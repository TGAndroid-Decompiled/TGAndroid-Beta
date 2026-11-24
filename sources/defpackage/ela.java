package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public class ela extends FrameLayout implements vlb {
    public static boolean l0;
    public float E;
    public int F;
    public boolean G;
    public final tk5 H;
    public gb I;
    public int J;
    public boolean K;
    public dma L;
    public xd9 M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public final Matrix Q;
    public final Matrix R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final Paint V;
    public Paint W;
    public final Rect a;
    public Paint a0;
    public Drawable b;
    public int b0;
    public boolean c;
    public int c0;
    public Drawable d;
    public float d0;
    public boolean e;
    public float e0;
    public int f;
    public float f0;
    public RenderNode[] g0;
    public int h;
    public final boolean[] h0;
    public final boolean[] i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public dla n;
    public final ArrayList r;
    public boolean s;
    public dtc w;
    public float x;
    public float y;

    public ela(Context context, tk5 tk5Var) {
        super(context);
        this.a = new Rect();
        this.r = new ArrayList();
        this.s = true;
        this.E = 1.0f;
        this.G = true;
        this.O = new ArrayList(10);
        this.P = new ArrayList();
        this.Q = new Matrix();
        this.R = new Matrix();
        this.S = new Paint();
        this.T = new Paint();
        this.U = new Paint();
        this.V = new Paint();
        this.d0 = 1.0f;
        new zka(this, (byte) 0);
        this.h0 = new boolean[2];
        this.i0 = new boolean[2];
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        setWillNotDraw(false);
        this.H = tk5Var;
        this.I = null;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 31 && gda.X) {
            return true;
        }
        return false;
    }

    public static float getBlurRadius() {
        int o = gda.o();
        if (o != 1) {
            if (o != 2) {
                return 3.0f;
            }
            return 60.0f;
        }
        return 4.0f;
    }

    public static float getRenderNodeScale() {
        int L;
        int o = gda.o();
        if (o != 1) {
            if (o != 2) {
                L = gm.L(15.0f);
            } else {
                return gm.p;
            }
        } else {
            L = gm.L(12.0f);
        }
        return L;
    }

    public final void F() {
        if (!this.e && !this.c) {
            dtc dtcVar = this.w;
            if (dtcVar != null) {
                dtcVar.b(false);
                this.w = null;
                this.E = 1.0f;
                this.x = 0.0f;
                this.y = 0.0f;
                return;
            }
            return;
        }
        if (this.w == null) {
            dtc dtcVar2 = new dtc(getContext());
            this.w = dtcVar2;
            dtcVar2.n = new yf9(this, (byte) 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                dtc dtcVar3 = this.w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                dtcVar3.getClass();
                this.E = dtc.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.G) {
            this.w.b(true);
        }
    }

    public final void G(Canvas canvas) {
        if (this.M != null && cmb.F1 && e86.e(32)) {
            if (this.L == null) {
                dma dmaVar = new dma(1);
                this.L = dmaVar;
                dmaVar.g = -1;
                dmaVar.c();
            }
            this.L.b(canvas, this.M);
        }
    }

    public void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        int i;
        if (E() && gda.o() == 2) {
            i = cmb.ng;
        } else {
            i = cmb.og;
        }
        I(canvas, f, rect, paint, z, Color.alpha(cmb.v0(i, getResourceProvider())));
    }

    public final void I(android.graphics.Canvas r22, float r23, android.graphics.Rect r24, android.graphics.Paint r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ela.I(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void K() {
        gda.f();
    }

    public final void M() {
        boolean[] zArr = this.i0;
        int i = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.P;
            if (i < arrayList.size()) {
                ((View) arrayList.get(i)).invalidate();
                i++;
            } else {
                return;
            }
        }
    }

    public boolean N() {
        return this instanceof mu1;
    }

    public boolean O() {
        return !(this instanceof lg1);
    }

    public boolean P() {
        return !(this instanceof lg1);
    }

    public int Q() {
        int i;
        View rootView = getRootView();
        Rect rect = this.a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i = gm.m;
        } else {
            i = 0;
        }
        int max = Math.max(0, ((height - i) - gm.o1(rootView)) - (rect.bottom - rect.top));
        this.f = max;
        return max;
    }

    public void R() {
        boolean z;
        if (this.w != null) {
            this.E = dtc.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.f = Q();
        Point point = gm.q;
        if (point.x > point.y) {
            z = true;
        } else {
            z = false;
        }
        post(new n28((byte) 15, this, z));
    }

    public final void U(Drawable drawable) {
        if (this.b == drawable) {
            return;
        }
        if (this.M == null) {
            xd9 xd9Var = new xd9((byte) 8, getContext(), this);
            this.M = xd9Var;
            addView(xd9Var, 0, qoe.c(-1.0f, -1));
        }
        if (drawable instanceof ah7) {
            ((ah7) drawable).p(this.M);
        }
        if (this.N) {
            Drawable drawable2 = this.b;
            if (drawable2 instanceof a92) {
                ((a92) drawable2).g(this.M);
            }
        }
        this.b = drawable;
        if (this.N && (drawable instanceof a92)) {
            ((a92) drawable).f(this.M);
        }
        if (this.N) {
            Drawable drawable3 = this.b;
            if (drawable3 instanceof ah7) {
                ((ah7) drawable3).l();
            }
        }
        if (this.N) {
            Drawable drawable4 = this.b;
            if (drawable4 instanceof ah7) {
                ((ah7) drawable4).k();
            }
        }
        T(this.b);
        F();
        this.M.invalidate();
    }

    public void V() {
        if (E()) {
            M();
        }
    }

    public boolean W() {
        return !(this instanceof d3a);
    }

    @Override
    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.og));
        hashSet.add(Integer.valueOf(cmb.ng));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.h0;
        zArr[0] = false;
        zArr[1] = false;
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.b;
    }

    public int getBackgroundSizeY() {
        int i;
        if (this.b instanceof a92) {
            i = this.F;
        } else {
            i = 0;
        }
        return getMeasuredHeight() - i;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.b;
        if (drawable instanceof ah7) {
            return this.F;
        }
        if (drawable instanceof a92) {
            return this.F;
        }
        return 0;
    }

    public float getBlurRadiusInternal() {
        return getBlurRadius();
    }

    public float getBottomOffset() {
        return getMeasuredHeight();
    }

    public int getBottomPadding() {
        return 0;
    }

    public float getBottomTranslation() {
        return 0.0f;
    }

    public int getHeightWithKeyboard() {
        return getMeasuredHeight() + this.f;
    }

    public int getKeyboardHeight() {
        return this.f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return cmb.s0();
    }

    public boolean getNewDrawableMotion() {
        return cmb.h0;
    }

    public ylb getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        Drawable drawable = this.b;
        if (drawable instanceof a92) {
            ((a92) drawable).f(this.M);
        }
        Drawable drawable2 = this.b;
        if (drawable2 instanceof ah7) {
            ((ah7) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof a92) {
            ((a92) drawable3).f(this.M);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof ah7) {
            ((ah7) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.N = false;
        this.S.setShader(null);
        this.T.setShader(null);
        this.U.setShader(null);
        this.V.setShader(null);
        while (true) {
            ArrayList arrayList = this.O;
            if (i < arrayList.size()) {
                if (arrayList.get(i) == null) {
                    i++;
                } else {
                    ((ala) arrayList.get(i)).getClass();
                    throw null;
                }
            } else {
                arrayList.clear();
                Drawable drawable = this.b;
                if (drawable instanceof a92) {
                    ((a92) drawable).g(this.M);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof a92) {
                    ((a92) drawable2).g(this.M);
                }
                Drawable drawable3 = this.b;
                if (drawable3 instanceof ah7) {
                    ((ah7) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof ah7) {
                    ((ah7) drawable4).l();
                    return;
                }
                return;
            }
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        R();
    }

    public void setBackgroundTranslation(int i) {
        if (i != this.F) {
            this.F = i;
            xd9 xd9Var = this.M;
            if (xd9Var != null) {
                xd9Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i) {
        if (i != this.h) {
            this.h = i;
            xd9 xd9Var = this.M;
            if (xd9Var != null) {
                xd9Var.invalidate();
            }
        }
    }

    public void setDelegate(dla dlaVar) {
        this.n = dlaVar;
    }

    public void setEmojiKeyboardHeight(int i) {
        if (this.J != i) {
            this.J = i;
            xd9 xd9Var = this.M;
            if (xd9Var != null) {
                xd9Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z) {
        this.s = z;
    }

    public void setSkipBackgroundDrawing(boolean z) {
        if (this.K != z) {
            this.K = z;
            xd9 xd9Var = this.M;
            if (xd9Var != null) {
                xd9Var.invalidate();
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != getBackgroundImage() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void S() {
    }

    public void T(Drawable drawable) {
    }

    @Override
    public void updateColors() {
    }

    public void J(Canvas canvas, ArrayList arrayList) {
    }
}
