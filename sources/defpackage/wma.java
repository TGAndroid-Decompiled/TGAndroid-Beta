package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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
public class wma extends FrameLayout implements snb {
    public static boolean f0;
    public float E;
    public int F;
    public boolean G;
    public final wk5 H;
    public hb I;
    public int J;
    public boolean K;
    public wna L;
    public nf9 M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public final Paint Q;
    public final Paint R;
    public final Paint S;
    public final Paint T;
    public float U;
    public float V;
    public float W;
    public final Rect a;
    public RenderNode[] a0;
    public Drawable b;
    public final boolean[] b0;
    public boolean c;
    public final boolean[] c0;
    public Drawable d;
    public final ArrayList d0;
    public boolean e;
    public final ArrayList e0;
    public int f;
    public int h;
    public vma n;
    public final ArrayList r;
    public boolean s;
    public pvc w;
    public float x;
    public float y;

    public wma(Context context, wk5 wk5Var) {
        super(context);
        this.a = new Rect();
        this.r = new ArrayList();
        this.s = true;
        this.E = 1.0f;
        this.G = true;
        this.O = new ArrayList(10);
        this.P = new ArrayList();
        this.Q = new Paint();
        this.R = new Paint();
        this.S = new Paint();
        this.T = new Paint();
        this.U = 1.0f;
        this.b0 = new boolean[2];
        this.c0 = new boolean[2];
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        setWillNotDraw(false);
        this.H = wk5Var;
        this.I = null;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 31 && xea.X) {
            return true;
        }
        return false;
    }

    public static float getBlurRadius() {
        int o = xea.o();
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
        int o = xea.o();
        if (o != 1) {
            if (o != 2) {
                L = hl.L(15.0f);
            } else {
                return hl.p;
            }
        } else {
            L = hl.L(12.0f);
        }
        return L;
    }

    public final void F() {
        if (!this.e && !this.c) {
            pvc pvcVar = this.w;
            if (pvcVar != null) {
                pvcVar.b(false);
                this.w = null;
                this.E = 1.0f;
                this.x = 0.0f;
                this.y = 0.0f;
                return;
            }
            return;
        }
        if (this.w == null) {
            pvc pvcVar2 = new pvc(getContext());
            this.w = pvcVar2;
            pvcVar2.n = new hja(this, (byte) 1);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                pvc pvcVar3 = this.w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                pvcVar3.getClass();
                this.E = pvc.a(measuredWidth, measuredHeight);
            }
        }
        if (!this.G) {
            this.w.b(true);
        }
    }

    public final void G(Canvas canvas) {
        if (this.M != null && aob.G1 && i86.e(32)) {
            if (this.L == null) {
                wna wnaVar = new wna(1);
                this.L = wnaVar;
                wnaVar.g = -1;
                wnaVar.c();
            }
            this.L.b(canvas, this.M);
        }
    }

    public void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        int i;
        if (E() && xea.o() == 2) {
            i = aob.og;
        } else {
            i = aob.pg;
        }
        I(canvas, f, rect, paint, z, Color.alpha(aob.v0(i, getResourceProvider())));
    }

    public final void I(android.graphics.Canvas r22, float r23, android.graphics.Rect r24, android.graphics.Paint r25, boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wma.I(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean, int):void");
    }

    public void K() {
        xea.f();
    }

    public final void M() {
        boolean[] zArr = this.c0;
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
        return this instanceof nt1;
    }

    public boolean O() {
        return !(this instanceof mf1);
    }

    public boolean P() {
        return !(this instanceof mf1);
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
            i = hl.m;
        } else {
            i = 0;
        }
        int max = Math.max(0, ((height - i) - hl.o1(rootView)) - (rect.bottom - rect.top));
        this.f = max;
        return max;
    }

    public void R() {
        boolean z;
        if (this.w != null) {
            this.E = pvc.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.f = Q();
        Point point = hl.q;
        if (point.x > point.y) {
            z = true;
        } else {
            z = false;
        }
        post(new q38((byte) 15, this, z));
    }

    public final void U(Drawable drawable) {
        if (this.b == drawable) {
            return;
        }
        if (this.M == null) {
            nf9 nf9Var = new nf9((byte) 8, getContext(), this);
            this.M = nf9Var;
            addView(nf9Var, 0, tre.c(-1.0f, -1));
        }
        if (drawable instanceof ih7) {
            ((ih7) drawable).p(this.M);
        }
        if (this.N) {
            Drawable drawable2 = this.b;
            if (drawable2 instanceof g82) {
                ((g82) drawable2).g(this.M);
            }
        }
        this.b = drawable;
        if (this.N && (drawable instanceof g82)) {
            ((g82) drawable).f(this.M);
        }
        if (this.N) {
            Drawable drawable3 = this.b;
            if (drawable3 instanceof ih7) {
                ((ih7) drawable3).l();
            }
        }
        if (this.N) {
            Drawable drawable4 = this.b;
            if (drawable4 instanceof ih7) {
                ((ih7) drawable4).k();
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
        return !(this instanceof u4a);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.pg));
        hashSet.add(Integer.valueOf(aob.og));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.b0;
        zArr[0] = false;
        zArr[1] = false;
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.b;
    }

    public int getBackgroundSizeY() {
        int i;
        if (this.b instanceof g82) {
            i = this.F;
        } else {
            i = 0;
        }
        return getMeasuredHeight() - i;
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.b;
        if (drawable instanceof ih7) {
            return this.F;
        }
        if (drawable instanceof g82) {
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
        return aob.s0();
    }

    public boolean getNewDrawableMotion() {
        return aob.h0;
    }

    public vnb getResourceProvider() {
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
        if (drawable instanceof g82) {
            ((g82) drawable).f(this.M);
        }
        Drawable drawable2 = this.b;
        if (drawable2 instanceof ih7) {
            ((ih7) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof g82) {
            ((g82) drawable3).f(this.M);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof ih7) {
            ((ih7) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.N = false;
        this.Q.setShader(null);
        this.R.setShader(null);
        this.S.setShader(null);
        this.T.setShader(null);
        while (true) {
            ArrayList arrayList = this.O;
            if (i < arrayList.size()) {
                if (arrayList.get(i) == null) {
                    i++;
                } else {
                    ((sma) arrayList.get(i)).getClass();
                    throw null;
                }
            } else {
                arrayList.clear();
                Drawable drawable = this.b;
                if (drawable instanceof g82) {
                    ((g82) drawable).g(this.M);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof g82) {
                    ((g82) drawable2).g(this.M);
                }
                Drawable drawable3 = this.b;
                if (drawable3 instanceof ih7) {
                    ((ih7) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof ih7) {
                    ((ih7) drawable4).l();
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
            nf9 nf9Var = this.M;
            if (nf9Var != null) {
                nf9Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i) {
        if (i != this.h) {
            this.h = i;
            nf9 nf9Var = this.M;
            if (nf9Var != null) {
                nf9Var.invalidate();
            }
        }
    }

    public void setDelegate(vma vmaVar) {
        this.n = vmaVar;
    }

    public void setEmojiKeyboardHeight(int i) {
        if (this.J != i) {
            this.J = i;
            nf9 nf9Var = this.M;
            if (nf9Var != null) {
                nf9Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z) {
        this.s = z;
    }

    public void setSkipBackgroundDrawing(boolean z) {
        if (this.K != z) {
            this.K = z;
            nf9 nf9Var = this.M;
            if (nf9Var != null) {
                nf9Var.invalidate();
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

    public void updateColors() {
    }

    public void T(Drawable drawable) {
    }

    public void J(Canvas canvas, ArrayList arrayList) {
    }
}
