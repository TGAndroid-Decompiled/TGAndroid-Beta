package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class m02 extends FrameLayout {
    public final byte a;
    public final n12 b;

    public m02(n12 n12Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = n12Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.b.S3, getMeasuredWidth(), getMeasuredHeight());
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
            case 2:
                n12 n12Var = this.b;
                m02 m02Var = n12Var.A2;
                if (n12Var.z2.getAlpha() > 0.0f) {
                    float f = n12Var.T3;
                    if (f != 0.0f && f != m02Var.getTop() + n12Var.T3) {
                        ValueAnimator valueAnimator = n12Var.U3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = n12Var.T3 - (m02Var.getTop() + n12Var.S3);
                        n12Var.S3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        n12Var.U3 = ofFloat;
                        ofFloat.addUpdateListener(new az1(this, (byte) 2));
                        n12Var.U3.setInterpolator(k43.f);
                        n12Var.U3.setDuration(200L);
                        n12Var.U3.start();
                        n12Var.T3 = 0.0f;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                n12 n12Var = this.b;
                f12 f12Var = n12Var.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                if (f12Var == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(ob6.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    u32 u32Var = n12Var.j2;
                    if (f12Var == u32Var) {
                        accessibilityNodeInfo.setText(ob6.G(u32Var.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        x12 x12Var = n12Var.f2;
                        if (f12Var == x12Var) {
                            accessibilityNodeInfo.setText(ob6.G(x12Var.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
                        }
                    }
                }
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
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.f3.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                n12 n12Var = this.b;
                if (n12Var.B1 && n12Var.C1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), hl.L(36.0f) + (hl.L(80.0f) * Integer.bitCount(n12Var.C1))), 1073741824), i2);
                    return;
                }
                super.onMeasure(i, i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.f3.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.a) {
            case 0:
                super.setAlpha(f);
                n12 n12Var = this.b;
                n12Var.L1(0);
                n12Var.b.invalidate();
                return;
            case 1:
            default:
                super.setAlpha(f);
                return;
            case 2:
                super.setAlpha(f);
                invalidate();
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 1:
                super.setTranslationY(f);
                this.b.v2.l();
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }
}
