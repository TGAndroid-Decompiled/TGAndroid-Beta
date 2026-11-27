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
public final class zp4 extends FrameLayout implements s84, snb {
    public int E;
    public int F;
    public float G;
    public float H;
    public boolean I;
    public final fm0 a;
    public final fm0 b;
    public final e29 c;
    public final RadialProgressView d;
    public final vnb e;
    public ArrayList f;
    public final boolean h;
    public final oz4 n;
    public final jl0 r;
    public final ib1 s;
    public hf0 w;
    public int x;
    public boolean y;

    public zp4(vnb vnbVar, Context context, boolean z) {
        super(context);
        k43 k43Var = k43.h;
        this.a = new fm0(0, this, k43Var, 380L, true);
        this.b = new fm0(1, this, k43Var, 380L, false);
        this.e = vnbVar;
        this.h = z;
        ?? imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, tre.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(hl.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, tre.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        iye.a(this);
        if (!z) {
            setOutlineProvider(yhc.a);
            setTranslationZ(hl.N(0.5f));
        } else {
            ib1 ib1Var = new ib1(aob.h5, null);
            this.s = ib1Var;
            oz4 oz4Var = new oz4();
            this.n = oz4Var;
            jl0 jl0Var = new jl0(oz4Var, oz4Var, oz4Var);
            this.r = jl0Var;
            jl0Var.p(ib1Var);
            float N = hl.N(0.4f);
            float N2 = hl.N(0.4f);
            il0 il0Var = jl0Var.S;
            il0Var.i = N;
            il0Var.j = N2;
            jl0Var.Q = null;
            ik8.r(jl0Var, hl.L(18.0f), 5.66f);
        }
        updateColors();
    }

    public static FrameLayout.LayoutParams b() {
        int i;
        if (ob6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        return tre.d(48, 48.0f, i | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i;
        if (ob6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        return tre.d(48, 48.0f, i | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f) {
        int i;
        if (view == null) {
            return;
        }
        view.setAlpha(f);
        view.setScaleX(hl.R1(0.4f, 1.0f, f));
        view.setScaleY(hl.R1(0.4f, 1.0f, f));
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
        jl0 jl0Var = this.r;
        if (jl0Var != null) {
            jl0Var.draw(canvas);
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
        jl0 jl0Var = this.r;
        if (jl0Var != null) {
            jl0Var.setBounds(0, 0, i, i2);
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
    public final void t(int i, float f, float f2, t84 t84Var) {
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
            setAdditionalTranslationY((1.0f - f) * hl.L(f3));
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

    @Override
    public final void updateColors() {
        RadialProgressView radialProgressView;
        boolean z;
        e29 e29Var = this.c;
        if (e29Var != null && (radialProgressView = this.d) != null) {
            if (this.w != null && getBackground() == this.w) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = this.h;
            vnb vnbVar = this.e;
            if (z2) {
                int i = aob.v8;
                int v0 = aob.v0(i, vnbVar);
                if (v0 != this.x || !this.y) {
                    this.x = v0;
                    this.y = true;
                    e29Var.setColorFilter(v0, PorterDuff.Mode.SRC_IN);
                }
                radialProgressView.setProgressColor(aob.v0(i, vnbVar));
                oz4 oz4Var = this.n;
                if (oz4Var != null) {
                    oz4Var.a(aob.w0(null, aob.d6, false));
                }
                ib1 ib1Var = this.s;
                if (ib1Var != null) {
                    ib1Var.d();
                }
                jl0 jl0Var = this.r;
                if (jl0Var != null) {
                    jl0Var.updateColors();
                }
                invalidate();
                int L = hl.L(18.0f);
                int v02 = aob.v0(aob.i6, vnbVar);
                if (z) {
                    if (v02 != this.F) {
                        this.F = v02;
                        aob.F1(this.w, v02, true);
                        return;
                    }
                    return;
                }
                this.F = v02;
                int L2 = hl.L(6.0f);
                hf0 W = aob.W(L, v02, L2, L2, L2, L2);
                this.w = W;
                setBackground(W);
                return;
            }
            int i2 = aob.O9;
            int v03 = aob.v0(i2, vnbVar);
            if (v03 != this.x || !this.y) {
                this.x = v03;
                this.y = true;
                e29Var.setColorFilter(v03, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(aob.v0(i2, vnbVar));
            int v04 = aob.v0(aob.Fi, vnbVar);
            int v05 = aob.v0(aob.Hi, vnbVar);
            if (z) {
                if (v04 != this.E || v05 != this.F) {
                    this.E = v04;
                    this.F = v05;
                    aob.F1(this.w, v04, false);
                    aob.F1(this.w, v05, true);
                    this.w.invalidateSelf();
                    return;
                }
                return;
            }
            this.E = v04;
            this.F = v05;
            hf0 h0 = aob.h0(hl.L(48.0f), v04, v05);
            this.w = h0;
            setBackground(h0);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void v0(float f, int i) {
    }

    public zp4(Context context, vnb vnbVar) {
        this(vnbVar, context, false);
    }
}
