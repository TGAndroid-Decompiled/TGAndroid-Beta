package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import org.telegram.ui.PopupNotificationActivity;
public final class nh8 extends RelativeLayout {
    public final PopupNotificationActivity a;

    public nh8(PopupNotificationActivity popupNotificationActivity, PopupNotificationActivity popupNotificationActivity2) {
        super(popupNotificationActivity2);
        this.a = popupNotificationActivity;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getTag() instanceof String) {
                int left = childAt.getLeft();
                PopupNotificationActivity popupNotificationActivity = this.a;
                childAt.layout(left, gm.L(3.0f) + popupNotificationActivity.b.getTop(), childAt.getRight(), popupNotificationActivity.b.getBottom());
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        PopupNotificationActivity popupNotificationActivity = this.a;
        int measuredWidth = popupNotificationActivity.b.getMeasuredWidth();
        int measuredHeight = popupNotificationActivity.b.getMeasuredHeight();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getTag() instanceof String) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight - gm.L(3.0f), 1073741824));
            }
        }
    }
}
