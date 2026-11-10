package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.ToggleButton;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.kt;
public final class k extends ImageView {
    public final int f17420a;

    public k(Context context, int i7) {
        super(context);
        this.f17420a = i7;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f17420a) {
            case 2:
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f17420a) {
            case 1:
                if (getAlpha() < 0.5f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f17420a) {
            case 5:
                super.onDraw(canvas);
                invalidate();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f17420a) {
            case 6:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
                accessibilityNodeInfo.setCheckable(true);
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    accessibilityNodeInfo.setChecked(sharedInstance.isSpeakerphoneOn());
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        switch (this.f17420a) {
            case 0:
                super.onMeasure(i7, i10);
                Matrix imageMatrix = getImageMatrix();
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                int intrinsicWidth = getDrawable().getIntrinsicWidth();
                int intrinsicHeight = getDrawable().getIntrinsicHeight();
                if (intrinsicWidth * measuredHeight > intrinsicHeight * measuredWidth) {
                    f10 = measuredHeight;
                    f11 = intrinsicHeight;
                } else {
                    f10 = measuredWidth;
                    f11 = intrinsicWidth;
                }
                float f12 = f10 / f11;
                imageMatrix.setScale(f12, f12);
                setImageMatrix(imageMatrix);
                return;
            case 1:
            case 2:
            default:
                super.onMeasure(i7, i10);
                return;
            case 3:
                int size = View.MeasureSpec.getSize(i7);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 1073741824));
                return;
        }
    }

    public k(kt ktVar, Context context) {
        super(context);
        this.f17420a = 2;
    }
}
