package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class y61 extends FrameLayout implements fn7 {
    public t61 a;
    public final vnb b;
    public final TextView c;
    public final in d;
    public final de0 e;
    public boolean f;
    public boolean h;
    public og2 n;

    public y61(Context context, vnb vnbVar) {
        super(context);
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        float f3;
        float f4;
        this.b = vnbVar;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        yob.X(textView, aob.G6, vnbVar);
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
            f = 72.0f;
        }
        if (z) {
            f2 = 72.0f;
        } else {
            f2 = 21.0f;
        }
        addView(textView, tre.d(-1, -1.0f, i5, f, 0.0f, f2, 0.0f));
        in inVar = new in(context, true, true, !ob6.a0);
        this.d = inVar;
        inVar.b(0.55f, 320L, k43.h);
        inVar.setTextSize(hl.L(16.0f));
        if (ob6.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        inVar.setGravity(i3 | 16);
        yob.U(inVar, aob.I6, vnbVar);
        boolean z2 = ob6.a0;
        if (z2) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        int i6 = i4 | 48;
        if (z2) {
            f3 = 21.0f;
        } else {
            f3 = 72.0f;
        }
        if (z2) {
            f4 = 72.0f;
        } else {
            f4 = 21.0f;
        }
        addView(inVar, tre.d(-2, -1.0f, i6, f3, 0.0f, f4, 0.0f));
        de0 de0Var = new de0(context);
        this.e = de0Var;
        de0Var.getAvatarDrawable().p = 0.8f;
        addView(de0Var, tre.d(38, 38.0f, (ob6.a0 ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        if (i == jn7.l4 && (textView = this.c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        int i;
        super.dispatchDraw(canvas);
        if (this.f) {
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(72.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(72.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    public de0 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.c;
    }

    public in getValueTextView() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.c.getText());
        in inVar = this.d;
        if (inVar != null && inVar.getVisibility() == 0) {
            str = "\n" + ((Object) inVar.getText());
        } else {
            str = "";
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(50.0f) + (this.f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - hl.L(34.0f);
        int i3 = measuredWidth / 2;
        de0 de0Var = this.e;
        if (de0Var.getVisibility() == 0) {
            de0Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(38.0f), 1073741824));
        }
        in inVar = this.d;
        if (inVar.getVisibility() == 0) {
            inVar.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - inVar.getMeasuredWidth()) - hl.L(8.0f);
        }
        int L = hl.L(12.0f) + inVar.getMeasuredWidth();
        boolean z = ob6.a0;
        TextView textView = this.c;
        if (z) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = L;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - L, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        og2 og2Var = this.n;
        if (og2Var != null) {
            og2Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), 1073741824));
        }
    }

    public void setCanDisable(boolean z) {
        this.h = z;
    }

    @Override
    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        float f2 = 1.0f;
        if (!z && this.h) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        this.c.setAlpha(f);
        in inVar = this.d;
        if (inVar.getVisibility() == 0) {
            if (!z && this.h) {
                f2 = 0.5f;
            }
            inVar.setAlpha(f2);
        }
    }

    public void setTextColor(int i) {
        this.c.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        this.d.setTextColor(i);
    }
}
