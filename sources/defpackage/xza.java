package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class xza extends FrameLayout {
    public static int H;
    public float E;
    public boolean F;
    public float G;
    public final byte a;
    public float b;
    public boolean c;
    public boolean d;
    public final be0 e;
    public final ImageView f;
    public final px8 h;
    public final View n;
    public boolean r;
    public final int s;
    public kcb w;
    public boolean x;
    public ValueAnimator y;

    public xza(Context context, int i) {
        super(context);
        this.a = i;
        int i2 = H;
        H = i2 + 1;
        this.s = i2;
        if (i == 2) {
            be0 be0Var = new be0(getContext());
            this.e = be0Var;
            be0Var.setLayerNum(1);
            be0Var.setAspectFit(false);
            be0Var.setRoundRadius(gl.L(6.0f));
            addView(be0Var, nme.e(26, 26, 17));
            this.n = be0Var;
        } else if (i == 1) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, nme.e(24, 24, 17));
            this.n = imageView;
        } else {
            be0 be0Var2 = new be0(getContext());
            this.e = be0Var2;
            be0Var2.setLayerNum(1);
            be0Var2.setAspectFit(true);
            be0Var2.setRoundRadius(gl.L(6.0f));
            addView(be0Var2, nme.e(26, 26, 17));
            this.n = be0Var2;
        }
        px8 px8Var = new px8(context, (byte) 5);
        this.h = px8Var;
        px8Var.addOnLayoutChangeListener(new gk1(this, (byte) 7));
        px8Var.setLines(1);
        px8Var.setEllipsize(TextUtils.TruncateAt.END);
        px8Var.setTextSize(1, 11.0f);
        px8Var.setGravity(1);
        zkb.X(px8Var, bkb.F6, null);
        addView(px8Var, nme.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        px8Var.setVisibility(8);
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
            int i = er9.u0;
            float f4 = 1.0f - f;
            view.setTranslationY((((gl.L(36.0f - f2) / 2.0f) - (gl.L(86.0f - f3) / 2.0f)) * f4) - (gl.L(8.0f) * f));
            view.setTranslationX(((gl.L(33.0f - f2) / 2.0f) - (gl.L(64.0f - f3) / 2.0f)) * f4);
            float max = Math.max(0.0f, (f - 0.5f) / 0.5f);
            px8 px8Var = this.h;
            px8Var.setAlpha(max);
            px8Var.setTranslationY((-gl.L(40.0f)) * f4);
            px8Var.setTranslationX((-gl.L(12.0f)) * f4);
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
            layoutParams.width = gl.L(f3);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (z) {
                f = f2;
            }
            layoutParams2.height = gl.L(f);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            this.h.setVisibility(i);
            if (b != 1 && this.x) {
                this.e.setRoundRadius(gl.L(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
