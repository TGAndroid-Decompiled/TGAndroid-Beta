package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class h29 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final RadioButton c;
    public boolean d;

    public h29(Context context, boolean z) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        RadioButton radioButton = new RadioButton(context);
        this.c = radioButton;
        radioButton.setSize(hl.L(20.0f));
        if (z) {
            yob.O(radioButton, aob.D5, aob.E5, null);
        } else {
            yob.O(radioButton, aob.g7, aob.h7, null);
        }
        boolean z2 = ob6.a0;
        if (z2) {
            i = 5;
        } else {
            i = 3;
        }
        int i8 = i | 48;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 20;
        }
        addView(radioButton, tre.d(22, 22.0f, i8, i2, 10.0f, z2 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        if (z) {
            yob.X(textView, aob.j5, null);
        } else {
            yob.X(textView, aob.G6, null);
        }
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        boolean z3 = ob6.a0;
        if (z3) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i9 = i4 | 48;
        if (z3) {
            i5 = 23;
        } else {
            i5 = 61;
        }
        addView(textView, tre.d(-2, -2.0f, i9, i5, 10.0f, z3 ? 61 : 23, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        if (z) {
            yob.X(textView2, aob.q5, null);
        } else {
            yob.X(textView2, aob.z6, null);
        }
        textView2.setTextSize(1, 13.0f);
        if (ob6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        textView2.setGravity(i6);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setPadding(0, 0, 0, hl.L(12.0f));
        boolean z4 = ob6.a0;
        int i10 = (z4 ? 5 : 3) | 48;
        if (z4) {
            i7 = 17;
        } else {
            i7 = 61;
        }
        addView(textView2, tre.d(-2, -2.0f, i10, i7, 35.0f, z4 ? 61 : 17, 0.0f));
    }

    public final void a(boolean z) {
        this.c.a(z, true);
    }

    public final void b(String str, String str2, boolean z, boolean z2) {
        this.a.setText(str);
        this.b.setText(str2);
        this.c.a(z2, false);
        this.d = z;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        if (this.d) {
            float f2 = 60.0f;
            if (ob6.a0) {
                f = 0.0f;
            } else {
                f = 60.0f;
            }
            float L = hl.L(f);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!ob6.a0) {
                f2 = 0.0f;
            }
            canvas.drawLine(L, height, measuredWidth - hl.L(f2), getHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.c.f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 0);
    }
}
