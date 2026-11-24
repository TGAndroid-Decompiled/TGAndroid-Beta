package defpackage;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class aw1 extends FrameLayout implements g94, vlb {
    public final fn0 a;
    public final fn0 b;
    public ImageView c;
    public ImageView d;
    public wi2 e;
    public ylb f;
    public float h;
    public int n;
    public im0 r;

    public aw1(Context context) {
        super(context);
        d53 d53Var = d53.h;
        this.a = new fn0(0, this, d53Var, 320L, false);
        this.b = new fn0(1, this, d53Var, 320L, true);
        this.h = 1.0f;
    }

    public static aw1 c(km0 km0Var, jr1 jr1Var, ylb ylbVar, Context context) {
        int i = cmb.Ml;
        int v0 = cmb.v0(i, ylbVar);
        aw1 aw1Var = new aw1(context);
        aw1Var.f = ylbVar;
        aw1Var.setBlurredBackgroundDrawable(km0Var.c(aw1Var, jr1Var, false));
        aw1Var.setIconColor(v0);
        int L = gm.L(22.0f);
        int p1 = cmb.p1(0.15f, v0);
        int L2 = gm.L(6.0f);
        fg0 W = cmb.W(L, p1, L2, L2, L2, L2);
        wmb K = anb.K(0.15f, i);
        aw1Var.setBackground(W);
        anb.j(aw1Var, W, null, K, ylbVar);
        return aw1Var;
    }

    public static aw1 d(Context context, km0 km0Var, am0 am0Var, ylb ylbVar, int i, int i2) {
        int i3 = cmb.Ml;
        int v0 = cmb.v0(i3, ylbVar);
        aw1 aw1Var = new aw1(context);
        aw1Var.f = ylbVar;
        aw1Var.setBlurredBackgroundDrawable(km0Var.c(aw1Var, am0Var, false));
        aw1Var.f(i, i2);
        aw1Var.setIconColor(v0);
        int L = gm.L(22.0f);
        int p1 = cmb.p1(0.15f, v0);
        int L2 = gm.L(6.0f);
        fg0 W = cmb.W(L, p1, L2, L2, L2, L2);
        wmb K = anb.K(0.15f, i3);
        aw1Var.setBackground(W);
        anb.j(aw1Var, W, null, K, ylbVar);
        return aw1Var;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            a();
            b();
        }
        if (i == 1) {
            a();
            b();
        }
    }

    public final void a() {
        int i;
        float f = 1.0f - this.a.e;
        float R1 = gm.R1(f / 2.0f, f, this.b.e);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setAlpha(R1);
            this.c.setScaleX(gm.R1(0.4f, 1.0f, f));
            this.c.setScaleY(gm.R1(0.4f, 1.0f, f) * this.h);
            ImageView imageView2 = this.c;
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            imageView2.setVisibility(i);
        }
    }

    public final void b() {
        int i;
        float f = this.a.e;
        float R1 = gm.R1(f / 2.0f, f, this.b.e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(R1);
            this.d.setScaleX(gm.R1(0.4f, 1.0f, f));
            this.d.setScaleY(gm.R1(0.4f, 1.0f, f));
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            if (this.d.getVisibility() != i) {
                this.d.setVisibility(i);
                this.e.c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.r.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z, boolean z2) {
        super.setEnabled(z);
        this.b.a(z, z2);
    }

    public final void f(int i, int i2) {
        if (this.c == null) {
            if (i == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.c, qoe.e(i2, i2, 17));
            a();
        }
        this.c.setImageResource(i);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.r.setBounds(0, 0, i, i2);
    }

    public void setBlurredBackgroundDrawable(im0 im0Var) {
        this.r = im0Var;
        im0Var.q(gm.L(6.0f));
        this.r.r(gm.L(22.0f));
    }

    @Override
    public void setEnabled(boolean z) {
        e(z, false);
    }

    public void setIcon(int i) {
        f(i, 48);
    }

    public void setIconColor(int i) {
        BlendMode blendMode;
        ImageView imageView = this.c;
        if (imageView == null) {
            return;
        }
        this.n = i;
        if (Build.VERSION.SDK_INT >= 29) {
            ul1.l();
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i, blendMode));
            return;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    public void setIconPadding(int i) {
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setPadding(0, i, 0, 0);
        }
    }

    @Override
    public final void updateColors() {
        im0 im0Var = this.r;
        if (im0Var != null) {
            im0Var.updateColors();
            invalidate();
        }
        int v0 = cmb.v0(cmb.Ml, this.f);
        if (this.c != null && v0 != this.n) {
            setIconColor(v0);
        }
        int L = gm.L(22.0f);
        int p1 = cmb.p1(0.15f, v0);
        if (getBackground() instanceof RippleDrawable) {
            cmb.F1(getBackground(), p1, true);
            return;
        }
        int L2 = gm.L(6.0f);
        setBackground(cmb.W(L, p1, L2, L2, L2, L2));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void V(float f, int i) {
    }
}
