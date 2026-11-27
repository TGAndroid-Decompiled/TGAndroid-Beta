package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
public class kmc extends FrameLayout {
    public int E;
    public String F;
    public int G;
    public boolean H;
    public int I;
    public final Paint J;
    public final Paint K;
    public float L;
    public boolean M;
    public float N;
    public hf0 O;
    public boolean P;
    public boolean Q;
    public float R;
    public int S;
    public int T;
    public final float U;
    public ValueAnimator V;
    public ValueAnimator W;
    public final Paint a;
    public float a0;
    public boolean b;
    public boolean c;
    public boolean d;
    public final Drawable[] e;
    public final FrameLayout f;
    public final TextView[] h;
    public int n;
    public int r;
    public float s;
    public ValueAnimator w;
    public int x;
    public int y;

    public kmc(Context context, float f) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = true;
        this.e = new Drawable[2];
        this.h = new TextView[2];
        this.J = new Paint(1);
        this.K = new Paint(1);
        this.a0 = 1.0f;
        this.U = f;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout);
        for (int i = 0; i < 2; i++) {
            TextView textView = new TextView(context);
            textView.setGravity(1);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(-1);
            textView.setImportantForAccessibility(2);
            this.f.addView(textView, tre.d(-1, -2.0f, 0, 0.0f, f + 6.0f, 0.0f, 0.0f));
            this.h[i] = textView;
        }
        this.h[1].setVisibility(8);
        this.K.setColor(-16777216);
        this.K.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.K.setStrokeWidth(hl.L(3.0f));
        this.J.setStrokeWidth(hl.L(2.0f));
        this.J.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i, int i2) {
        this.S = i;
        this.T = i2;
        this.n = vm2.f(this.R, i, i2);
        invalidate();
    }

    public final void b(boolean z, boolean z2) {
        if (this.Q != z) {
            this.Q = z;
            if (this.P) {
                float f = 0.0f;
                if (z2) {
                    ValueAnimator valueAnimator = this.V;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.V.cancel();
                    }
                    float f2 = this.R;
                    if (this.Q) {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    this.V = ofFloat;
                    ofFloat.addUpdateListener(new jmc(this, (byte) 0));
                    this.V.addListener(new omb(this, (byte) 20));
                    this.V.setDuration(150L);
                    this.V.start();
                    return;
                }
                if (z) {
                    f = 1.0f;
                }
                this.R = f;
                a(this.S, this.T);
            }
        }
    }

    public final void c(int i, int i2, int i3, float f, boolean z, String str, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        float f2;
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z3 = false;
        }
        if (this.x == i && this.y == i2 && ((this.P || this.E == i3) && (str2 = this.F) != null && str2.equals(str) && z2 == this.M)) {
            return;
        }
        if (this.O == null || z) {
            int alpha = Color.alpha(i3);
            float f3 = this.U;
            if (alpha == 255 && hl.B(i3) > 0.5d) {
                hf0 h0 = aob.h0(hl.L(f3), 0, vm2.o(-16777216, (int) (f * 25.5f)));
                this.O = h0;
                h0.setCallback(this);
            } else {
                hf0 h02 = aob.h0(hl.L(f3), 0, vm2.o(-1, (int) (f * 76.5f)));
                this.O = h02;
                h02.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.E != i3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
        if (this.x == i) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.H = z5;
        if (z5) {
            this.I = this.y;
        }
        this.x = i;
        this.y = i2;
        this.E = i3;
        this.F = str;
        this.M = z2;
        Drawable[] drawableArr = this.e;
        TextView[] textViewArr = this.h;
        if (!z3) {
            if (i != 0) {
                Drawable mutate = getContext().getDrawable(i).mutate();
                drawableArr[0] = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
            }
            this.J.setColor(i2);
            if (!this.P) {
                this.n = i3;
            }
            textViewArr[0].setText(str);
            if (this.M) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            this.L = f2;
            this.H = false;
            this.s = 0.0f;
            invalidate();
            return;
        }
        if (!z5 && i != 0) {
            Drawable mutate2 = getContext().getDrawable(i).mutate();
            drawableArr[1] = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.P) {
            this.r = i3;
        }
        boolean equals = textViewArr[0].getText().toString().equals(str);
        boolean z6 = !equals;
        if (equals) {
            textViewArr[0].setText(str);
        } else {
            textViewArr[1].setText(str);
            textViewArr[1].setVisibility(0);
            textViewArr[1].setAlpha(0.0f);
            textViewArr[1].setScaleX(0.0f);
            textViewArr[1].setScaleY(0.0f);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.w = ofFloat;
        ofFloat.addUpdateListener(new e20((byte) 11, this, z6));
        this.w.addListener(new i1a((byte) 15, this, z6));
        this.w.setDuration(150L).start();
        invalidate();
    }

    public final void d(boolean z, boolean z2) {
        float f = 0.0f;
        FrameLayout frameLayout = this.f;
        if (z2) {
            if (z) {
                f = 1.0f;
            }
            if (frameLayout.getAlpha() != f) {
                frameLayout.animate().alpha(f).start();
                return;
            }
            return;
        }
        frameLayout.animate().cancel();
        if (z) {
            f = 1.0f;
        }
        frameLayout.setAlpha(f);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        hf0 hf0Var = this.O;
        if (hf0Var != null) {
            hf0Var.setState(getDrawableState());
        }
    }

    public View getTextView() {
        return this.h[0];
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        hf0 hf0Var = this.O;
        if (hf0Var != null) {
            hf0Var.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmc.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.F);
        if (this.P) {
            accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.Q);
            return;
        }
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setCheckable(boolean z) {
        this.P = z;
    }

    public void setCrossOffset(float f) {
        this.N = f;
    }

    public void setDrawBackground(boolean z) {
        this.b = z;
    }

    public void setDrawRipple(boolean z) {
        this.c = z;
    }

    public void setPressedBtn(boolean z) {
        float f;
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.a0;
        if (z) {
            f = 0.8f;
        } else {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new jmc(this, (byte) 1));
        this.W.setDuration(150L);
        this.W.start();
    }

    public void setTextSize(int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            this.h[i2].setTextSize(1, i);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.O != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
