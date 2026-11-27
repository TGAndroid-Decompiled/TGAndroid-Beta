package defpackage;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class ulb extends FrameLayout {
    public TextView a;
    public TextView b;
    public RadioButton c;
    public boolean d;
    public int e;
    public float f;
    public boolean h;
    public byte n;

    static {
        new qm("animationProgress", (byte) 18);
    }

    public void setAnimationProgress(float f) {
        this.f = f;
        getMeasuredWidth();
        hl.L(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z) {
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        this.c.a(false, false);
        this.d = z;
        textView2.setVisibility(0);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = hl.L(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z);
    }

    public final void c() {
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        float f3;
        RadioButton radioButton = this.c;
        TextView textView = this.b;
        TextView textView2 = this.a;
        byte b = this.n;
        boolean z = this.h;
        boolean z2 = ob6.a0;
        if (z == z2) {
            return;
        }
        this.h = z2;
        int i5 = 3;
        if (z2) {
            i = 5;
        } else {
            i = 3;
        }
        textView2.setGravity(i | 16);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        boolean z3 = ob6.a0;
        if (z3) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        layoutParams.gravity = i2 | 48;
        float f4 = 64.0f;
        if (z3) {
            f = b;
        } else {
            f = 64.0f;
        }
        layoutParams.leftMargin = hl.L(f);
        if (ob6.a0) {
            f2 = 64.0f;
        } else {
            f2 = b;
        }
        layoutParams.rightMargin = hl.L(f2);
        textView2.setLayoutParams(layoutParams);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        boolean z4 = ob6.a0;
        if (z4) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        layoutParams2.gravity = i4 | 48;
        if (z4) {
            f3 = b;
        } else {
            f3 = 64.0f;
        }
        layoutParams2.leftMargin = hl.L(f3);
        if (!ob6.a0) {
            f4 = b;
        }
        layoutParams2.rightMargin = hl.L(f4);
        textView.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (ob6.a0) {
            i5 = 5;
        }
        layoutParams3.gravity = i5 | 16;
        radioButton.setLayoutParams(layoutParams3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.d) {
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(64.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(64.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        TextView textView = this.b;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        RadioButton radioButton = this.c;
        accessibilityNodeInfo.setChecked(radioButton.f);
        if (radioButton.f) {
            i = 2131747619;
        } else {
            i = 2131747621;
        }
        accessibilityNodeInfo.setContentDescription(ob6.M0(i, null));
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getText());
        if (!TextUtils.isEmpty(textView.getText())) {
            sb.append("\n");
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.b.getVisibility() == 0) {
            f = 64.0f;
        } else {
            f = this.e;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(f) + (this.d ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i) {
        clearAnimation();
        super.setBackgroundColor(i);
    }

    public void setChecked(boolean z) {
        this.c.a(z, true);
    }

    public void setHeight(int i) {
        this.e = i;
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setTypeface(Typeface typeface) {
        this.a.setTypeface(typeface);
    }
}
