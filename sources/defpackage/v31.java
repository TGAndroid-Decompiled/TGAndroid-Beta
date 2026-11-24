package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.ToggleButton;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.a;
public final class v31 extends ImageView {
    public final byte a;

    public v31(rt3 rt3Var, Context context) {
        super(context);
        this.a = (byte) 1;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                super.onDraw(canvas);
                invalidate();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 5:
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
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        switch (this.a) {
            case 0:
                super.onMeasure(i, i2);
                Matrix imageMatrix = getImageMatrix();
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                int intrinsicWidth = getDrawable().getIntrinsicWidth();
                int intrinsicHeight = getDrawable().getIntrinsicHeight();
                if (intrinsicWidth * measuredHeight > intrinsicHeight * measuredWidth) {
                    f = measuredHeight;
                    f2 = intrinsicHeight;
                } else {
                    f = measuredWidth;
                    f2 = intrinsicWidth;
                }
                float f3 = f / f2;
                imageMatrix.setScale(f3, f3);
                setImageMatrix(imageMatrix);
                return;
            case 1:
            case 3:
            default:
                super.onMeasure(i, i2);
                return;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(a.getCurrentActionBarHeight(), 1073741824));
                return;
            case 4:
                int size = View.MeasureSpec.getSize(i);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
        }
    }

    public v31(Context context, byte b) {
        super(context);
        this.a = b;
    }
}
