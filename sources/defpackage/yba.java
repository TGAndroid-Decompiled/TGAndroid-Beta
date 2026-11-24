package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class yba extends FrameLayout {
    public final byte a;
    public final tca b;

    public yba(tca tcaVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = tcaVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                tca tcaVar = this.b;
                im0 im0Var = tcaVar.R2;
                im0Var.setBounds(0, (int) tcaVar.p2, getMeasuredWidth(), getMeasuredHeight());
                im0Var.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, tcaVar.p2, getMeasuredWidth(), getMeasuredHeight());
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
                tca tcaVar = this.b;
                yba ybaVar = tcaVar.m1;
                float f = tcaVar.q2;
                if (f != 0.0f && f != ybaVar.getTop() + tcaVar.q2) {
                    ValueAnimator valueAnimator = tcaVar.r2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = tcaVar.q2 - (ybaVar.getTop() + tcaVar.p2);
                    tcaVar.p2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    tcaVar.r2 = ofFloat;
                    ofFloat.addUpdateListener(new p29(this, (byte) 26));
                    tcaVar.r2.setInterpolator(d53.f);
                    tcaVar.r2.setDuration(200L);
                    tcaVar.r2.start();
                    tcaVar.q2 = 0.0f;
                }
                tcaVar.N1[1].setTranslationY((-(ybaVar.getMeasuredHeight() - gm.L(48.0f))) + tcaVar.p2 + tcaVar.o2 + ((1.0f - getAlpha()) * (ybaVar.getMeasuredHeight() - gm.L(48.0f))));
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
                accessibilityNodeInfo.setText(jb6.G(this.b.P1.m(), "AccDescrShareInChats", new Object[0]));
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
