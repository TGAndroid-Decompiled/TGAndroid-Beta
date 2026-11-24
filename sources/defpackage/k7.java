package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class k7 extends FrameLayout {
    public final byte a;
    public boolean b;
    public final Object c;

    public k7(Context context, CharSequence charSequence, String str, int i, boolean z) {
        super(context);
        this.a = (byte) 2;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = z;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setGravity(16);
        if (str != null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(16);
            linearLayout.addView(textView, nme.o(-2, -2));
            TextView textView2 = new TextView(context);
            SpannableStringBuilder append = new SpannableStringBuilder(str).append((CharSequence) " >");
            append.setSpan(new hm3(), append.length() - 1, append.length(), 33);
            textView2.setText(append);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(bkb.p1(0.55f, i));
            textView2.setSingleLine(true);
            linearLayout.addView(textView2, nme.k(0.0f, 1.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, nme.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        } else {
            addView(textView, nme.d(-2, -1.0f, 3, 18.0f, 0.0f, 44.0f, 0.0f));
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.N(1.75f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                Paint paint = (Paint) this.c;
                super.dispatchDraw(canvas);
                float height = getHeight() / 2.0f;
                if (this.b) {
                    float width = getWidth() - gl.L(26.0f);
                    canvas.drawLine(width - gl.L(5.0f), height, width - gl.L(1.5f), height + gl.L(3.5f), paint);
                    canvas.drawLine(width - gl.L(1.5f), gl.L(3.5f) + height, width + gl.L(5.5f), height - gl.L(4.0f), paint);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        switch (this.a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j);
                qmb qmbVar = (qmb) this.c;
                if (view == qmbVar.u0 && qmb.r0(qmbVar) != null) {
                    ui5 s0 = qmb.s0(qmbVar);
                    if (qmbVar.u0.getVisibility() == 0) {
                        i = (int) (qmbVar.u0.getTranslationY() + qmbVar.u0.getMeasuredHeight());
                    } else {
                        i = 0;
                    }
                    ((ActionBarLayout) s0).o(canvas, i);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(this.b);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.c;
                super.onLayout(z, i, i2, i3, i4);
                int i5 = 0;
                if (!k96.a0 && r7Var.h.getVisibility() == 0) {
                    i5 = gl.L(4.0f) + r7Var.h.getMeasuredWidth();
                }
                if (r7Var.f.getVisibility() == 0) {
                    i5 += r7Var.f.getMeasuredWidth();
                }
                l7 l7Var = r7Var.e;
                l7Var.layout(i5, l7Var.getTop(), r7Var.e.getMeasuredWidth() + i5, r7Var.e.getBottom());
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7.onMeasure(int, int):void");
    }

    @Override
    public final void requestLayout() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
            default:
                super.requestLayout();
                return;
            case 3:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.a) {
            case 0:
                super.setAlpha(f);
                r7 r7Var = (r7) this.c;
                c7 c7Var = r7Var.s;
                if (c7Var != null && c7Var.getTag() != null) {
                    r7Var.s.setAlpha(f);
                    r7Var.s.setScaleX(f);
                    r7Var.s.setScaleY(f);
                    return;
                }
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        switch (this.a) {
            case 0:
                super.setVisibility(i);
                r7 r7Var = (r7) this.c;
                c7 c7Var = r7Var.s;
                if (c7Var != null) {
                    c7Var.setVisibility(i);
                }
                View view = r7Var.x;
                if (view != null) {
                    view.setVisibility(i);
                }
                FrameLayout frameLayout = r7Var.a;
                if (frameLayout != null) {
                    frameLayout.setVisibility(i);
                    return;
                }
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }

    public k7(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.c = obj;
    }
}
