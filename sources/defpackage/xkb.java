package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class xkb extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final og2 c;
    public boolean d;
    public boolean e;
    public int f;
    public float h;

    static {
        new qm("animationProgress", (byte) 17);
    }

    public xkb(Context context) {
        super(context);
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        float f3;
        float f4;
        this.f = 50;
        TextView textView = new TextView(context);
        this.a = textView;
        yob.X(textView, aob.G6, null);
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z = ob6.a0;
        if (z) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i5 = i2 | 48;
        if (z) {
            f = 21.0f;
        } else {
            f = 64.0f;
        }
        if (z) {
            f2 = 64.0f;
        } else {
            f2 = 21.0f;
        }
        addView(textView, tre.d(-1, -1.0f, i5, f, 0.0f, f2, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        yob.X(textView2, aob.z6, null);
        textView2.setTextSize(1, 13.0f);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView2.setGravity(i3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z2 = ob6.a0;
        if (z2) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i6 = i4 | 48;
        if (z2) {
            f3 = 21.0f;
        } else {
            f3 = 64.0f;
        }
        if (z2) {
            f4 = 64.0f;
        } else {
            f4 = 21.0f;
        }
        addView(textView2, tre.d(-2, -2.0f, i6, f3, 36.0f, f4, 0.0f));
        og2 og2Var = new og2(21, null, context);
        this.c = og2Var;
        og2Var.setDrawUnchecked(true);
        og2Var.setDrawBackgroundAsArc(10);
        og2Var.setDuration(100L);
        og2Var.b(aob.h7, aob.j7, aob.k7);
        addView(og2Var, tre.d(20, 20.0f, (ob6.a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
    }

    public void setAnimationProgress(float f) {
        this.h = f;
        getMeasuredWidth();
        hl.L(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z, boolean z2) {
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        this.d = z2;
        textView2.setVisibility(0);
        this.e = z;
        if (z) {
            textView2.setLines(0);
            textView2.setMaxLines(0);
            textView2.setSingleLine(false);
            textView2.setEllipsize(null);
            textView2.setPadding(0, 0, 0, hl.L(11.0f));
        } else {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = hl.L(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z2);
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
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.checkbox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.c.a.q);
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getText());
        TextView textView = this.b;
        if (textView != null) {
            sb.append("\n");
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 0);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.b.getVisibility() == 0) {
            f = 64.0f;
        } else {
            f = this.f;
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
        this.f = i;
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setTypeface(Typeface typeface) {
        this.a.setTypeface(typeface);
    }
}
