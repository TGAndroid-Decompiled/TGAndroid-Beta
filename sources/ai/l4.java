package ai;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
public final class l4 extends ScrollView {
    public final int f785a;

    public l4(Context context, int i3) {
        super(context);
        this.f785a = i3;
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f785a) {
            case 0:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(260.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 1:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(260.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 2:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) Math.min(View.MeasureSpec.getSize(i10), Math.min(org.telegram.messenger.g0.f22608q.y * 0.35f, org.telegram.messenger.g0.L(400.0f))), View.MeasureSpec.getMode(i10)));
                return;
            case 3:
            default:
                super.onMeasure(i3, i10);
                return;
            case 4:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(320.0f)), Integer.MIN_VALUE));
                return;
            case 5:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(360.0f)), Integer.MIN_VALUE));
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i3, Rect rect) {
        switch (this.f785a) {
            case 3:
                return false;
            default:
                return super.onRequestFocusInDescendants(i3, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f785a) {
            case 3:
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.g0.L(20.0f) + rect.top;
                rect.bottom = org.telegram.messenger.g0.L(50.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }
}
