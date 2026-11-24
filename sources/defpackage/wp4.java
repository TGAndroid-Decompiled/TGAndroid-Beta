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
public final class wp4 extends FrameLayout implements g94, vlb {
    public int E;
    public int F;
    public float G;
    public float H;
    public boolean I;
    public final fn0 a;
    public final fn0 b;
    public final s09 c;
    public final RadialProgressView d;
    public final ylb e;
    public ArrayList f;
    public final boolean h;
    public final kz4 n;
    public final im0 r;
    public final ic1 s;
    public fg0 w;
    public int x;
    public boolean y;

    public wp4(ylb ylbVar, Context context, boolean z) {
        super(context);
        d53 d53Var = d53.h;
        this.a = new fn0(0, this, d53Var, 380L, true);
        this.b = new fn0(1, this, d53Var, 380L, false);
        this.e = ylbVar;
        this.h = z;
        ?? imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, qoe.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(gm.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, qoe.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        rve.a(this);
        if (!z) {
            setOutlineProvider(agc.a);
            setTranslationZ(gm.N(0.5f));
        } else {
            ic1 ic1Var = new ic1(cmb.g5, null);
            this.s = ic1Var;
            kz4 kz4Var = new kz4();
            this.n = kz4Var;
            im0 im0Var = new im0(kz4Var, kz4Var, kz4Var);
            this.r = im0Var;
            im0Var.p(ic1Var);
            float N = gm.N(0.4f);
            float N2 = gm.N(0.4f);
            hm0 hm0Var = im0Var.S;
            hm0Var.i = N;
            hm0Var.j = N2;
            im0Var.Q = null;
            wi8.r(im0Var, gm.L(18.0f), 5.66f);
        }
        updateColors();
    }

    public static FrameLayout.LayoutParams b() {
        int i;
        if (jb6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        return qoe.d(48, 48.0f, i | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i;
        if (jb6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        return qoe.d(48, 48.0f, i | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f) {
        int i;
        if (view == null) {
            return;
        }
        view.setAlpha(f);
        view.setScaleX(gm.R1(0.4f, 1.0f, f));
        view.setScaleY(gm.R1(0.4f, 1.0f, f));
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

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
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
            setAdditionalTranslationY((1.0f - f) * gm.L(f3));
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
        im0 im0Var = this.r;
        if (im0Var != null) {
            im0Var.draw(canvas);
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
        im0 im0Var = this.r;
        if (im0Var != null) {
            im0Var.setBounds(0, 0, i, i2);
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
        s09 s09Var = this.c;
        if (s09Var != null && (radialProgressView = this.d) != null) {
            if (this.w != null && getBackground() == this.w) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = this.h;
            ylb ylbVar = this.e;
            if (z2) {
                int i = cmb.u8;
                int v0 = cmb.v0(i, ylbVar);
                if (v0 != this.x || !this.y) {
                    this.x = v0;
                    this.y = true;
                    s09Var.setColorFilter(v0, PorterDuff.Mode.SRC_IN);
                }
                radialProgressView.setProgressColor(cmb.v0(i, ylbVar));
                kz4 kz4Var = this.n;
                if (kz4Var != null) {
                    kz4Var.a(cmb.w0(null, cmb.c6, false));
                }
                ic1 ic1Var = this.s;
                if (ic1Var != null) {
                    ic1Var.d();
                }
                im0 im0Var = this.r;
                if (im0Var != null) {
                    im0Var.updateColors();
                }
                invalidate();
                int L = gm.L(18.0f);
                int v02 = cmb.v0(cmb.h6, ylbVar);
                if (z) {
                    if (v02 != this.F) {
                        this.F = v02;
                        cmb.F1(this.w, v02, true);
                        return;
                    }
                    return;
                }
                this.F = v02;
                int L2 = gm.L(6.0f);
                fg0 W = cmb.W(L, v02, L2, L2, L2, L2);
                this.w = W;
                setBackground(W);
                return;
            }
            int i2 = cmb.N9;
            int v03 = cmb.v0(i2, ylbVar);
            if (v03 != this.x || !this.y) {
                this.x = v03;
                this.y = true;
                s09Var.setColorFilter(v03, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(cmb.v0(i2, ylbVar));
            int v04 = cmb.v0(cmb.Ei, ylbVar);
            int v05 = cmb.v0(cmb.Gi, ylbVar);
            if (z) {
                if (v04 != this.E || v05 != this.F) {
                    this.E = v04;
                    this.F = v05;
                    cmb.F1(this.w, v04, false);
                    cmb.F1(this.w, v05, true);
                    this.w.invalidateSelf();
                    return;
                }
                return;
            }
            this.E = v04;
            this.F = v05;
            fg0 h0 = cmb.h0(gm.L(48.0f), v04, v05);
            this.w = h0;
            setBackground(h0);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void V(float f, int i) {
    }

    public wp4(Context context, ylb ylbVar) {
        this(ylbVar, context, false);
    }
}
