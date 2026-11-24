package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class un4 extends FrameLayout implements x74, tjb {
    public int E;
    public int F;
    public float G;
    public float H;
    public boolean I;
    public final fm0 a;
    public final fm0 b;
    public final ry8 c;
    public final RadialProgressView d;
    public final wjb e;
    public ArrayList f;
    public final boolean h;
    public final ix4 n;
    public final il0 r;
    public final ab1 s;
    public ff0 w;
    public int x;
    public boolean y;

    public un4(wjb wjbVar, Context context, boolean z) {
        super(context);
        s33 s33Var = s33.h;
        this.a = new fm0(0, this, s33Var, 380L, true);
        this.b = new fm0(1, this, s33Var, 380L, false);
        this.e = wjbVar;
        this.h = z;
        ?? imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, nme.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(gl.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, nme.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        ote.a(this);
        if (!z) {
            setOutlineProvider(zdc.a);
            setTranslationZ(gl.N(0.5f));
        } else {
            ab1 ab1Var = new ab1(bkb.g5, null);
            this.s = ab1Var;
            ix4 ix4Var = new ix4();
            this.n = ix4Var;
            il0 il0Var = new il0(ix4Var, ix4Var, ix4Var);
            this.r = il0Var;
            il0Var.p(ab1Var);
            float N = gl.N(0.4f);
            float N2 = gl.N(0.4f);
            hl0 hl0Var = il0Var.S;
            hl0Var.i = N;
            hl0Var.j = N2;
            il0Var.Q = null;
            ug8.r(il0Var, gl.L(18.0f), 5.66f);
        }
        updateColors();
    }

    public static FrameLayout.LayoutParams b() {
        int i;
        if (k96.a0) {
            i = 3;
        } else {
            i = 5;
        }
        return nme.d(48, 48.0f, i | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i;
        if (k96.a0) {
            i = 3;
        } else {
            i = 5;
        }
        return nme.d(48, 48.0f, i | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f) {
        int i;
        if (view == null) {
            return;
        }
        view.setAlpha(f);
        view.setScaleX(gl.R1(0.4f, 1.0f, f));
        view.setScaleY(gl.R1(0.4f, 1.0f, f));
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void setAdditionalTranslationY(float f) {
        if (this.G != f) {
            this.I = true;
            super.setTranslationY(this.H + f);
            this.I = false;
            this.G = f;
        }
    }

    public final void a(View view) {
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f = arrayList;
        }
        arrayList.add(view);
        d(view, 1.0f - this.b.e);
    }

    @Override
    public final void draw(Canvas canvas) {
        il0 il0Var = this.r;
        if (il0Var != null) {
            il0Var.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z, boolean z2) {
        this.a.a(z, z2);
    }

    public final void f(boolean z, boolean z2) {
        this.b.a(z, z2);
    }

    public boolean getButtonVisible() {
        return this.a.f;
    }

    public boolean getProgressVisible() {
        return this.b.f;
    }

    @Override
    public float getTranslationY() {
        if (this.I) {
            return super.getTranslationY();
        }
        return this.H;
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        il0 il0Var = this.r;
        if (il0Var != null) {
            il0Var.setBounds(0, 0, i, i2);
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        float f3;
        int i2 = 0;
        boolean z = false;
        if (i == 0) {
            d(this, f);
            if (f >= 0.99f) {
                z = true;
            }
            setClickable(z);
            if (this.h) {
                f3 = 64.0f;
            } else {
                f3 = 40.0f;
            }
            setAdditionalTranslationY((1.0f - f) * gl.L(f3));
        } else if (i == 1) {
            d(this.d, f);
            float f4 = 1.0f - f;
            d(this.c, f4);
            ArrayList arrayList = this.f;
            if (arrayList != null) {
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    d((View) obj, f4);
                }
            }
        }
    }

    public void setImageResource(int i) {
        this.c.setImageResource(i);
    }

    @Override
    public void setTranslationY(float f) {
        if (this.H != f) {
            this.I = true;
            super.setTranslationY(this.G + f);
            this.I = false;
            this.H = f;
        }
    }

    @Override
    public final void updateColors() {
        RadialProgressView radialProgressView;
        boolean z;
        ry8 ry8Var = this.c;
        if (ry8Var != null && (radialProgressView = this.d) != null) {
            if (this.w != null && getBackground() == this.w) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = this.h;
            wjb wjbVar = this.e;
            if (z2) {
                int i = bkb.u8;
                int v0 = bkb.v0(i, wjbVar);
                if (v0 != this.x || !this.y) {
                    this.x = v0;
                    this.y = true;
                    ry8Var.setColorFilter(v0, PorterDuff.Mode.SRC_IN);
                }
                radialProgressView.setProgressColor(bkb.v0(i, wjbVar));
                ix4 ix4Var = this.n;
                if (ix4Var != null) {
                    ix4Var.a(bkb.w0(null, bkb.c6, false));
                }
                ab1 ab1Var = this.s;
                if (ab1Var != null) {
                    ab1Var.d();
                }
                il0 il0Var = this.r;
                if (il0Var != null) {
                    il0Var.updateColors();
                }
                invalidate();
                int L = gl.L(18.0f);
                int v02 = bkb.v0(bkb.h6, wjbVar);
                if (z) {
                    if (v02 != this.F) {
                        this.F = v02;
                        bkb.F1(this.w, v02, true);
                        return;
                    }
                    return;
                }
                this.F = v02;
                int L2 = gl.L(6.0f);
                ff0 W = bkb.W(L, v02, L2, L2, L2, L2);
                this.w = W;
                setBackground(W);
                return;
            }
            int i2 = bkb.N9;
            int v03 = bkb.v0(i2, wjbVar);
            if (v03 != this.x || !this.y) {
                this.x = v03;
                this.y = true;
                ry8Var.setColorFilter(v03, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(bkb.v0(i2, wjbVar));
            int v04 = bkb.v0(bkb.Ei, wjbVar);
            int v05 = bkb.v0(bkb.Gi, wjbVar);
            if (z) {
                if (v04 != this.E || v05 != this.F) {
                    this.E = v04;
                    this.F = v05;
                    bkb.F1(this.w, v04, false);
                    bkb.F1(this.w, v05, true);
                    this.w.invalidateSelf();
                    return;
                }
                return;
            }
            this.E = v04;
            this.F = v05;
            ff0 h0 = bkb.h0(gl.L(48.0f), v04, v05);
            this.w = h0;
            setBackground(h0);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void D(float f, int i) {
    }

    public un4(Context context, wjb wjbVar) {
        this(wjbVar, context, false);
    }
}
