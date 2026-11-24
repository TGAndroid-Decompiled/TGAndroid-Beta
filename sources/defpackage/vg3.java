package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class vg3 extends FrameLayout {
    public int a;
    public TextView b;
    public TextView c;
    public RadioButton d;
    public boolean e;
    public int f;

    public final void a(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        RadioButton radioButton = this.d;
        TextView textView = this.c;
        setEnabled(z);
        TextView textView2 = this.b;
        float f5 = 0.5f;
        if (z2) {
            ViewPropertyAnimator animate = textView2.animate();
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.5f;
            }
            animate.alpha(f3).start();
            ViewPropertyAnimator animate2 = textView.animate();
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.5f;
            }
            animate2.alpha(f4).start();
            ViewPropertyAnimator animate3 = radioButton.animate();
            if (z) {
                f5 = 1.0f;
            }
            animate3.alpha(f5).start();
            return;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        textView2.setAlpha(f);
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        textView.setAlpha(f2);
        if (z) {
            f5 = 1.0f;
        }
        radioButton.setAlpha(f5);
    }

    public final void b() {
        int i;
        float f;
        FrameLayout.LayoutParams d;
        FrameLayout.LayoutParams d2;
        int i2;
        float f2;
        TextView textView = this.b;
        TextView textView2 = this.c;
        int visibility = textView2.getVisibility();
        boolean z = jb6.a0;
        float f3 = 61.0f;
        int i3 = 3;
        if (visibility == 0) {
            if (z) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            int i4 = i2 | 48;
            if (z) {
                f2 = this.f;
            } else {
                f2 = 61.0f;
            }
            if (!z) {
                f3 = this.f;
            }
            d = qoe.d(-1, -1.0f, i4, f2, 0.0f, f3, 0.0f);
        } else {
            if (z) {
                i = 5;
            } else {
                i = 3;
            }
            int i5 = i | 48;
            if (z) {
                f = 61.0f;
            } else {
                f = this.f;
            }
            if (z) {
                f3 = this.f;
            }
            d = qoe.d(-1, -1.0f, i5, f, 0.0f, f3, 0.0f);
        }
        textView.setLayoutParams(d);
        RadioButton radioButton = this.d;
        int visibility2 = textView2.getVisibility();
        boolean z2 = jb6.a0;
        if (visibility2 == 0) {
            if (z2) {
                i3 = 5;
            }
            d2 = qoe.d(22, 22.0f, i3 | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            if (!z2) {
                i3 = 5;
            }
            d2 = qoe.d(22, 22.0f, i3 | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(d2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        if (this.e) {
            float f2 = 0.0f;
            if (jb6.a0) {
                f = 0.0f;
            } else {
                f = this.f;
            }
            float L = gm.L(f);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                f2 = this.f;
            }
            canvas.drawLine(L, height, measuredWidth - gm.L(f2), getHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(50.0f) + (this.e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int i4 = this.f + 61;
        TextView textView = this.c;
        if (textView.getVisibility() == 0) {
            i3 = 12;
        } else {
            i3 = 0;
        }
        int L = measuredWidth - gm.L(i4 + i3);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(gm.L(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(22.0f), 1073741824));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            L = wi8.B(12.0f, textView.getMeasuredWidth(), L);
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setHorizontalPadding(int i) {
        TextView textView = this.c;
        if (this.f != i) {
            this.f = i;
            float f = i;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = gm.L(f);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = gm.L(f);
            b();
        }
    }

    public void setTextColor(int i) {
        this.b.setTextColor(i);
    }
}
