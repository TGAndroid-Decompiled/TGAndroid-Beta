package kh;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class j3 extends ScrollView {
    public final int f10791a;

    public j3(Context context, int i10) {
        super(context);
        this.f10791a = i10;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f10791a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) Math.min(View.MeasureSpec.getSize(i11), Math.min(AndroidUtilities.displaySize.y * 0.35f, AndroidUtilities.dp(400.0f))), View.MeasureSpec.getMode(i11)));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.f10791a) {
            case 2:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        switch (this.f10791a) {
            case 2:
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = AndroidUtilities.dp(20.0f) + rect.top;
                rect.bottom = AndroidUtilities.dp(50.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z4);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z4);
        }
    }
}
