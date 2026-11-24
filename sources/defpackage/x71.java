package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class x71 extends FrameLayout implements jm7 {
    public s71 a;
    public final ylb b;
    public final TextView c;
    public final io d;
    public final bf0 e;
    public boolean f;
    public boolean h;
    public jh2 n;

    public x71(Context context, ylb ylbVar) {
        super(context);
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        float f3;
        float f4;
        this.b = ylbVar;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        anb.X(textView, cmb.F6, ylbVar);
        boolean z = jb6.a0;
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
        addView(textView, qoe.d(-1, -1.0f, i5, f, 0.0f, f2, 0.0f));
        io ioVar = new io(context, true, true, !jb6.a0);
        this.d = ioVar;
        ioVar.b(0.55f, 320L, d53.h);
        ioVar.setTextSize(gm.L(16.0f));
        if (jb6.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        ioVar.setGravity(i3 | 16);
        anb.U(ioVar, cmb.H6, ylbVar);
        boolean z2 = jb6.a0;
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
        addView(ioVar, qoe.d(-2, -1.0f, i6, f3, 0.0f, f4, 0.0f));
        bf0 bf0Var = new bf0(context);
        this.e = bf0Var;
        bf0Var.getAvatarDrawable().p = 0.8f;
        addView(bf0Var, qoe.d(38, 38.0f, (jb6.a0 ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        if (i == nm7.m4 && (textView = this.c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        int i;
        super.dispatchDraw(canvas);
        if (this.f) {
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(72.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(72.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    public bf0 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.c;
    }

    public io getValueTextView() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.m4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.c.getText());
        io ioVar = this.d;
        if (ioVar != null && ioVar.getVisibility() == 0) {
            str = "\n" + ((Object) ioVar.getText());
        } else {
            str = "";
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(50.0f) + (this.f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gm.L(34.0f);
        int i3 = measuredWidth / 2;
        bf0 bf0Var = this.e;
        if (bf0Var.getVisibility() == 0) {
            bf0Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(38.0f), 1073741824));
        }
        io ioVar = this.d;
        if (ioVar.getVisibility() == 0) {
            ioVar.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - ioVar.getMeasuredWidth()) - gm.L(8.0f);
        }
        int L = gm.L(12.0f) + ioVar.getMeasuredWidth();
        boolean z = jb6.a0;
        TextView textView = this.c;
        if (z) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = L;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - L, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        jh2 jh2Var = this.n;
        if (jh2Var != null) {
            jh2Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), 1073741824));
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
        io ioVar = this.d;
        if (ioVar.getVisibility() == 0) {
            if (!z && this.h) {
                f2 = 0.5f;
            }
            ioVar.setAlpha(f2);
        }
    }

    public void setTextColor(int i) {
        this.c.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        this.d.setTextColor(i);
    }
}
