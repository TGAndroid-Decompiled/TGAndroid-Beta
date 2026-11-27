package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class u3b extends FrameLayout {
    public static int H;
    public float E;
    public boolean F;
    public float G;
    public final byte a;
    public float b;
    public boolean c;
    public boolean d;
    public final de0 e;
    public final ImageView f;
    public final c19 h;
    public final View n;
    public boolean r;
    public final int s;
    public ggb w;
    public boolean x;
    public ValueAnimator y;

    public u3b(Context context, int i) {
        super(context);
        this.a = i;
        int i2 = H;
        H = i2 + 1;
        this.s = i2;
        if (i == 2) {
            de0 de0Var = new de0(getContext());
            this.e = de0Var;
            de0Var.setLayerNum(1);
            de0Var.setAspectFit(false);
            de0Var.setRoundRadius(hl.L(6.0f));
            addView(de0Var, tre.e(26, 26, 17));
            this.n = de0Var;
        } else if (i == 1) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, tre.e(24, 24, 17));
            this.n = imageView;
        } else {
            de0 de0Var2 = new de0(getContext());
            this.e = de0Var2;
            de0Var2.setLayerNum(1);
            de0Var2.setAspectFit(true);
            de0Var2.setRoundRadius(hl.L(6.0f));
            addView(de0Var2, tre.e(26, 26, 17));
            this.n = de0Var2;
        }
        c19 c19Var = new c19(context, (byte) 5);
        this.h = c19Var;
        c19Var.addOnLayoutChangeListener(new pk1(this, (byte) 7));
        c19Var.setLines(1);
        c19Var.setEllipsize(TextUtils.TruncateAt.END);
        c19Var.setTextSize(1, 11.0f);
        c19Var.setGravity(1);
        yob.X(c19Var, aob.G6, null);
        addView(c19Var, tre.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        c19Var.setVisibility(8);
    }

    public final void a(float f) {
        float f2;
        float f3;
        byte b = this.a;
        if (b == 2) {
            return;
        }
        boolean z = this.r;
        View view = this.n;
        if (z) {
            if (b == 1) {
                f2 = 24.0f;
                f3 = 38.0f;
            } else {
                f2 = 26.0f;
                f3 = 44.0f;
            }
            int i = xu9.u0;
            float f4 = 1.0f - f;
            view.setTranslationY((((hl.L(36.0f - f2) / 2.0f) - (hl.L(86.0f - f3) / 2.0f)) * f4) - (hl.L(8.0f) * f));
            view.setTranslationX(((hl.L(33.0f - f2) / 2.0f) - (hl.L(64.0f - f3) / 2.0f)) * f4);
            float max = Math.max(0.0f, (f - 0.5f) / 0.5f);
            c19 c19Var = this.h;
            c19Var.setAlpha(max);
            c19Var.setTranslationY((-hl.L(40.0f)) * f4);
            c19Var.setTranslationX((-hl.L(12.0f)) * f4);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            float f5 = ((f2 / f3) * f4) + f;
            view.setScaleX(f5);
            view.setScaleY(f5);
            return;
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public float getTextWidth() {
        return this.G;
    }

    public void setExpanded(boolean z) {
        float f;
        float f2;
        float f3;
        int i;
        byte b = this.a;
        if (b != 2) {
            this.r = z;
            if (b == 1) {
                f = 24.0f;
                f2 = 38.0f;
            } else {
                f = 26.0f;
                f2 = 44.0f;
            }
            View view = this.n;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z) {
                f3 = f2;
            } else {
                f3 = f;
            }
            layoutParams.width = hl.L(f3);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (z) {
                f = f2;
            }
            layoutParams2.height = hl.L(f);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            this.h.setVisibility(i);
            if (b != 1 && this.x) {
                this.e.setRoundRadius(hl.L(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
