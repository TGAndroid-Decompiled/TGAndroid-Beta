package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.RadioButton;
public class vy8 extends FrameLayout {
    public final TextView a;
    public final RadioButton b;
    public boolean c;

    public vy8(Context context, wjb wjbVar) {
        super(context);
        int i;
        int i2;
        int i3;
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, bkb.F6, wjbVar);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(textView, nme.d(-1, -1.0f, i2 | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(gl.L(20.0f));
        zkb.O(radioButton, bkb.f7, bkb.g7, wjbVar);
        boolean z = k96.a0;
        int i4 = (z ? 3 : 5) | 48;
        if (z) {
            i3 = 22;
        } else {
            i3 = 0;
        }
        addView(radioButton, nme.d(22, 22.0f, i4, i3, 14.0f, z ? 0 : 22, 0.0f));
    }

    public final void a(boolean z, boolean z2) {
        this.b.a(z, z2);
    }

    public final void b(ArrayList arrayList, boolean z) {
        float f;
        float f2;
        super.setEnabled(z);
        RadioButton radioButton = this.b;
        float f3 = 0.5f;
        TextView textView = this.a;
        if (arrayList != null) {
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            float[] fArr = {f2};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z) {
                f3 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(radioButton, property, f3));
            return;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        textView.setAlpha(f);
        if (z) {
            f3 = 1.0f;
        }
        radioButton.setAlpha(f3);
    }

    public final void c(String str, boolean z, boolean z2) {
        this.a.setText(str);
        this.b.a(z, false);
        this.c = z2;
        setWillNotDraw(!z2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.c) {
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.b.f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(50.0f) + (this.c ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gl.L(34.0f);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(gl.L(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(22.0f), 1073741824));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setRadioIcon(Drawable drawable) {
        this.b.setIcon(drawable);
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }

    public vy8(Context context) {
        this(context, null);
    }
}
