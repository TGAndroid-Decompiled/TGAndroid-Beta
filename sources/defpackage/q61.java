package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class q61 extends FrameLayout implements gk7 {
    public l61 a;
    public final wjb b;
    public final TextView c;
    public final hn d;
    public final be0 e;
    public boolean f;
    public boolean h;
    public wf2 n;

    public q61(Context context, wjb wjbVar) {
        super(context);
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        float f3;
        float f4;
        this.b = wjbVar;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        zkb.X(textView, bkb.F6, wjbVar);
        boolean z = k96.a0;
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
        addView(textView, nme.d(-1, -1.0f, i5, f, 0.0f, f2, 0.0f));
        hn hnVar = new hn(context, true, true, !k96.a0);
        this.d = hnVar;
        hnVar.b(0.55f, 320L, s33.h);
        hnVar.setTextSize(gl.L(16.0f));
        if (k96.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        hnVar.setGravity(i3 | 16);
        zkb.U(hnVar, bkb.H6, wjbVar);
        boolean z2 = k96.a0;
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
        addView(hnVar, nme.d(-2, -1.0f, i6, f3, 0.0f, f4, 0.0f));
        be0 be0Var = new be0(context);
        this.e = be0Var;
        be0Var.getAvatarDrawable().p = 0.8f;
        addView(be0Var, nme.d(38, 38.0f, (k96.a0 ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        if (i == kk7.k4 && (textView = this.c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        int i;
        super.dispatchDraw(canvas);
        if (this.f) {
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(72.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(72.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
        }
    }

    public be0 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.c;
    }

    public hn getValueTextView() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.k4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.c.getText());
        hn hnVar = this.d;
        if (hnVar != null && hnVar.getVisibility() == 0) {
            str = "\n" + ((Object) hnVar.getText());
        } else {
            str = "";
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(50.0f) + (this.f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gl.L(34.0f);
        int i3 = measuredWidth / 2;
        be0 be0Var = this.e;
        if (be0Var.getVisibility() == 0) {
            be0Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(38.0f), 1073741824));
        }
        hn hnVar = this.d;
        if (hnVar.getVisibility() == 0) {
            hnVar.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - hnVar.getMeasuredWidth()) - gl.L(8.0f);
        }
        int L = gl.L(12.0f) + hnVar.getMeasuredWidth();
        boolean z = k96.a0;
        TextView textView = this.c;
        if (z) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = L;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - L, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        wf2 wf2Var = this.n;
        if (wf2Var != null) {
            wf2Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), 1073741824));
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
        hn hnVar = this.d;
        if (hnVar.getVisibility() == 0) {
            if (!z && this.h) {
                f2 = 0.5f;
            }
            hnVar.setAlpha(f2);
        }
    }

    public void setTextColor(int i) {
        this.c.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        this.d.setTextColor(i);
    }
}
