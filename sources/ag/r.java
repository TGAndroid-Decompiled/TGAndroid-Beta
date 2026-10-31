package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.ToggleButton;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.wt;
public final class r extends ImageView {
    public final int f692a;

    public r(Context context, int i10) {
        super(context);
        this.f692a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f692a) {
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
        switch (this.f692a) {
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
        switch (this.f692a) {
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
        switch (this.f692a) {
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
    public void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        switch (this.f692a) {
            case 0:
                super.onMeasure(i10, i11);
                Matrix imageMatrix = getImageMatrix();
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                int intrinsicWidth = getDrawable().getIntrinsicWidth();
                int intrinsicHeight = getDrawable().getIntrinsicHeight();
                if (intrinsicWidth * measuredHeight > intrinsicHeight * measuredWidth) {
                    f7 = measuredHeight;
                    f10 = intrinsicHeight;
                } else {
                    f7 = measuredWidth;
                    f10 = intrinsicWidth;
                }
                float f11 = f7 / f10;
                imageMatrix.setScale(f11, f11);
                setImageMatrix(imageMatrix);
                return;
            case 1:
            case 2:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            case 4:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 1073741824));
                return;
        }
    }

    public r(wt wtVar, Context context) {
        super(context);
        this.f692a = 2;
    }
}
