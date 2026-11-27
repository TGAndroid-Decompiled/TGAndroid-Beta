package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class cz5 extends FrameLayout {
    public final RadioButton a;
    public final TextView b;
    public final TextView c;
    public boolean d;
    public mb6 e;
    public final byte f;

    public cz5(Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        float f3;
        float f4;
        this.f = (byte) 62;
        if (aob.j0 == null) {
            aob.Q(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(hl.L(20.0f));
        yob.O(radioButton, aob.D5, aob.E5, null);
        boolean z = ob6.a0;
        if (z) {
            i = 5;
        } else {
            i = 3;
        }
        int i6 = i | 16;
        if (z) {
            i2 = 0;
        } else {
            i2 = 20;
        }
        addView(radioButton, tre.d(22, 22.0f, i6, i2, 0.0f, z ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        yob.X(textView, aob.j5, null);
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
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
        int i7 = i4 | 48;
        if (z2) {
            f = 23.0f;
        } else {
            f = 62.0f;
        }
        if (z2) {
            f2 = 62.0f;
        } else {
            f2 = 23.0f;
        }
        addView(textView, tre.d(-1, -1.0f, i7, f, 0.0f, f2, 17.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        yob.X(textView2, aob.r5, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (ob6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        textView2.setGravity(i5 | 16);
        boolean z3 = ob6.a0;
        int i8 = (z3 ? 5 : 3) | 48;
        if (z3) {
            f3 = 23.0f;
        } else {
            f3 = 62.0f;
        }
        if (z3) {
            f4 = 62.0f;
        } else {
            f4 = 23.0f;
        }
        addView(textView2, tre.d(-1, -1.0f, i8, f3, 20.0f, f4, 0.0f));
    }

    public mb6 getCurrentLocale() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.d) {
            boolean z = ob6.a0;
            byte b = this.f;
            if (z) {
                L = 0.0f;
            } else {
                L = hl.L(b - 3);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(b - 3);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(60.0f) + (this.d ? 1 : 0), 1073741824));
    }
}
