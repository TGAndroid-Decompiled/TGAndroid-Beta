package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class j29 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final RadioButton c;
    public byte d;

    public j29(Context context, vnb vnbVar) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        this.d = (byte) 50;
        RadioButton radioButton = new RadioButton(context);
        this.c = radioButton;
        radioButton.setSize(hl.L(20.0f));
        yob.O(radioButton, aob.D5, aob.E5, vnbVar);
        boolean z = ob6.a0;
        if (z) {
            i = 5;
        } else {
            i = 3;
        }
        int i9 = i | 48;
        if (z) {
            i2 = 0;
        } else {
            i2 = 18;
        }
        addView(radioButton, tre.d(22, 22.0f, i9, i2, 14.0f, z ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        yob.X(textView, aob.j5, vnbVar);
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        boolean z2 = ob6.a0;
        if (z2) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i10 = i4 | 48;
        if (z2) {
            i5 = 21;
        } else {
            i5 = 51;
        }
        float f = i5;
        if (z2) {
            i6 = 51;
        } else {
            i6 = 21;
        }
        addView(textView, tre.d(-2, -2.0f, i10, f, 13.0f, i6, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        yob.X(textView2, aob.y6, vnbVar);
        textView2.setTextSize(1, 14.0f);
        if (ob6.a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView2.setGravity(i7 | 16);
        textView2.setVisibility(8);
        boolean z3 = ob6.a0;
        int i11 = (z3 ? 5 : 3) | 48;
        if (z3) {
            i8 = 21;
        } else {
            i8 = 51;
        }
        addView(textView2, tre.d(-2, -2.0f, i11, i8, 37.0f, z3 ? 51 : 21, 0.0f));
    }

    public final void a(int i, int i2) {
        this.c.b(i, i2);
    }

    public final void b(CharSequence charSequence, boolean z) {
        this.a.setText(charSequence);
        this.b.setVisibility(8);
        this.c.a(z, false);
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
        int i3;
        TextView textView = this.b;
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - hl.L(72.0f), 1073741824), i2);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        int L = hl.L(this.d);
        if (textView.getVisibility() == 0) {
            i3 = textView.getMeasuredHeight() + hl.L(4.0f);
        } else {
            i3 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(L + i3, 1073741824));
    }
}
