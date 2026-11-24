package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class uy8 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final RadioButton c;
    public boolean d;

    public uy8(Context context, boolean z) {
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
        radioButton.setSize(gl.L(20.0f));
        if (z) {
            zkb.O(radioButton, bkb.C5, bkb.D5, null);
        } else {
            zkb.O(radioButton, bkb.f7, bkb.g7, null);
        }
        boolean z2 = k96.a0;
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
        addView(radioButton, nme.d(22, 22.0f, i8, i2, 10.0f, z2 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        if (z) {
            zkb.X(textView, bkb.i5, null);
        } else {
            zkb.X(textView, bkb.F6, null);
        }
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        boolean z3 = k96.a0;
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
        addView(textView, nme.d(-2, -2.0f, i9, i5, 10.0f, z3 ? 61 : 23, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        if (z) {
            zkb.X(textView2, bkb.p5, null);
        } else {
            zkb.X(textView2, bkb.y6, null);
        }
        textView2.setTextSize(1, 13.0f);
        if (k96.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        textView2.setGravity(i6);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setPadding(0, 0, 0, gl.L(12.0f));
        boolean z4 = k96.a0;
        int i10 = (z4 ? 5 : 3) | 48;
        if (z4) {
            i7 = 17;
        } else {
            i7 = 61;
        }
        addView(textView2, nme.d(-2, -2.0f, i10, i7, 35.0f, z4 ? 61 : 17, 0.0f));
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
            if (k96.a0) {
                f = 0.0f;
            } else {
                f = 60.0f;
            }
            float L = gl.L(f);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!k96.a0) {
                f2 = 0.0f;
            }
            canvas.drawLine(L, height, measuredWidth - gl.L(f2), getHeight() - 1, bkb.j0);
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
