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
public class cja extends FrameLayout implements tjb {
    public static boolean l0;
    public float E;
    public int F;
    public boolean G;
    public final ui5 H;
    public gb I;
    public int J;
    public boolean K;
    public cka L;
    public si9 M;
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
    public bja n;
    public final ArrayList r;
    public boolean s;
    public brc w;
    public float x;
    public float y;

    public cja(Context context, ui5 ui5Var) {
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
        new xia(this, (byte) 0);
        this.h0 = new boolean[2];
        this.i0 = new boolean[2];
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        setWillNotDraw(false);
        this.H = ui5Var;
        this.I = null;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 31 && gba.X) {
            return true;
        }
        return false;
    }

    public static float getBlurRadius() {
        int o = gba.o();
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
        int o = gba.o();
        if (o != 1) {
            if (o != 2) {
                L = gl.L(15.0f);
            } else {
                return gl.p;
            }
        } else {
            L = gl.L(12.0f);
        }
        return L;
    }

    public final void F() {
        if (!this.e && !this.c) {
            brc brcVar = this.w;
            if (brcVar != null) {
                brcVar.b(false);
                this.w = null;
                this.E = 1.0f;
                this.x = 0.0f;
                this.y = 0.0f;
                return;
            }
            return;
        }
        if (this.w == null) {
            brc brcVar2 = new brc(getContext());
            this.w = brcVar2;
            brcVar2.n = new wh9(this, (byte) 18);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                brc brcVar3 = this.w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                brcVar3.getClass();
                this.E = brc.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.G) {
            this.w.b(true);
        }
    }

    public final void G(Canvas canvas) {
        if (this.M != null && bkb.F1 && e66.e(32)) {
            if (this.L == null) {
                cka ckaVar = new cka(1);
                this.L = ckaVar;
                ckaVar.g = -1;
                ckaVar.c();
            }
            this.L.b(canvas, this.M);
        }
    }

    public void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        int i;
        if (E() && gba.o() == 2) {
            i = bkb.ng;
        } else {
            i = bkb.og;
        }
        I(canvas, f, rect, paint, z, Color.alpha(bkb.v0(i, getResourceProvider())));
    }

    public final void I(android.graphics.Canvas r22, float r23, android.graphics.Rect r24, android.graphics.Paint r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cja.I(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void K() {
        gba.f();
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
        return this instanceof at1;
    }

    public boolean O() {
        return !(this instanceof df1);
    }

    public boolean P() {
        return !(this instanceof df1);
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
            i = gl.m;
        } else {
            i = 0;
        }
        int max = Math.max(0, ((height - i) - gl.o1(rootView)) - (rect.bottom - rect.top));
        this.f = max;
        return max;
    }

    public void R() {
        boolean z;
        if (this.w != null) {
            this.E = brc.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.f = Q();
        Point point = gl.q;
        if (point.x > point.y) {
            z = true;
        } else {
            z = false;
        }
        post(new k08((byte) 15, this, z));
    }

    public final void U(Drawable drawable) {
        if (this.b == drawable) {
            return;
        }
        if (this.M == null) {
            si9 si9Var = new si9((byte) 7, getContext(), this);
            this.M = si9Var;
            addView(si9Var, 0, nme.c(-1.0f, -1));
        }
        if (drawable instanceof ye7) {
            ((ye7) drawable).p(this.M);
        }
        if (this.N) {
            Drawable drawable2 = this.b;
            if (drawable2 instanceof p72) {
                ((p72) drawable2).g(this.M);
            }
        }
        this.b = drawable;
        if (this.N && (drawable instanceof p72)) {
            ((p72) drawable).f(this.M);
        }
        if (this.N) {
            Drawable drawable3 = this.b;
            if (drawable3 instanceof ye7) {
                ((ye7) drawable3).l();
            }
        }
        if (this.N) {
            Drawable drawable4 = this.b;
            if (drawable4 instanceof ye7) {
                ((ye7) drawable4).k();
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
        return !(this instanceof b1a);
    }

    @Override
    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.og));
        hashSet.add(Integer.valueOf(bkb.ng));
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
        if (this.b instanceof p72) {
            i = this.F;
        } else {
            i = 0;
        }
        return getMeasuredHeight() - i;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.b;
        if (drawable instanceof ye7) {
            return this.F;
        }
        if (drawable instanceof p72) {
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
        return bkb.s0();
    }

    public boolean getNewDrawableMotion() {
        return bkb.h0;
    }

    public wjb getResourceProvider() {
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
        if (drawable instanceof p72) {
            ((p72) drawable).f(this.M);
        }
        Drawable drawable2 = this.b;
        if (drawable2 instanceof ye7) {
            ((ye7) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof p72) {
            ((p72) drawable3).f(this.M);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof ye7) {
            ((ye7) drawable4).k();
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
                    ((yia) arrayList.get(i)).getClass();
                    throw null;
                }
            } else {
                arrayList.clear();
                Drawable drawable = this.b;
                if (drawable instanceof p72) {
                    ((p72) drawable).g(this.M);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof p72) {
                    ((p72) drawable2).g(this.M);
                }
                Drawable drawable3 = this.b;
                if (drawable3 instanceof ye7) {
                    ((ye7) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof ye7) {
                    ((ye7) drawable4).l();
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
            si9 si9Var = this.M;
            if (si9Var != null) {
                si9Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i) {
        if (i != this.h) {
            this.h = i;
            si9 si9Var = this.M;
            if (si9Var != null) {
                si9Var.invalidate();
            }
        }
    }

    public void setDelegate(bja bjaVar) {
        this.n = bjaVar;
    }

    public void setEmojiKeyboardHeight(int i) {
        if (this.J != i) {
            this.J = i;
            si9 si9Var = this.M;
            if (si9Var != null) {
                si9Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z) {
        this.s = z;
    }

    public void setSkipBackgroundDrawing(boolean z) {
        if (this.K != z) {
            this.K = z;
            si9 si9Var = this.M;
            if (si9Var != null) {
                si9Var.invalidate();
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

    @Override
    public void updateColors() {
    }

    public void T(Drawable drawable) {
    }

    public void J(Canvas canvas, ArrayList arrayList) {
    }
}
