package fh;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class v3 extends ScrollView {
    public final int f6816a;

    public v3(Context context, int i9) {
        super(context);
        this.f6816a = i9;
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f6816a) {
            case 0:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 1:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) Math.min(View.MeasureSpec.getSize(i10), Math.min(AndroidUtilities.displaySize.y * 0.35f, AndroidUtilities.dp(400.0f))), View.MeasureSpec.getMode(i10)));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        switch (this.f6816a) {
            case 2:
                return false;
            default:
                return super.onRequestFocusInDescendants(i9, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f6816a) {
            case 2:
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = AndroidUtilities.dp(20.0f) + rect.top;
                rect.bottom = AndroidUtilities.dp(50.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }
}
