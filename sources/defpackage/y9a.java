package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class y9a extends FrameLayout {
    public final byte a;
    public final taa b;

    public y9a(taa taaVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = taaVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                taa taaVar = this.b;
                il0 il0Var = taaVar.R2;
                il0Var.setBounds(0, (int) taaVar.p2, getMeasuredWidth(), getMeasuredHeight());
                il0Var.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, taaVar.p2, getMeasuredWidth(), getMeasuredHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                taa taaVar = this.b;
                y9a y9aVar = taaVar.m1;
                float f = taaVar.q2;
                if (f != 0.0f && f != y9aVar.getTop() + taaVar.q2) {
                    ValueAnimator valueAnimator = taaVar.r2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = taaVar.q2 - (y9aVar.getTop() + taaVar.p2);
                    taaVar.p2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    taaVar.r2 = ofFloat;
                    ofFloat.addUpdateListener(new x89(this, (byte) 24));
                    taaVar.r2.setInterpolator(s33.f);
                    taaVar.r2.setDuration(200L);
                    taaVar.r2.start();
                    taaVar.q2 = 0.0f;
                }
                taaVar.N1[1].setTranslationY((-(y9aVar.getMeasuredHeight() - gl.L(48.0f))) + taaVar.p2 + taaVar.o2 + ((1.0f - getAlpha()) * (y9aVar.getMeasuredHeight() - gl.L(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(k96.G(this.b.P1.m(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.a) {
            case 0:
                super.setAlpha(f);
                invalidate();
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
                if (i != 0) {
                    this.b.N1[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }
}
