package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
public final class lj3 extends ScrollView {
    public final byte a;

    public lj3(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) Math.min(View.MeasureSpec.getSize(i2), Math.min(gm.q.y * 0.35f, gm.L(400.0f))), View.MeasureSpec.getMode(i2)));
                return;
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), gm.L(320.0f)), Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), gm.L(360.0f)), Integer.MIN_VALUE));
                return;
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(260.0f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 4:
            default:
                super.onMeasure(i, i2);
                return;
            case 5:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(260.0f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
        }
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        switch (this.a) {
            case 4:
                return false;
            default:
                return super.onRequestFocusInDescendants(i, rect);
        }
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        switch (this.a) {
            case 4:
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = gm.L(20.0f) + rect.top;
                rect.bottom = gm.L(50.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z);
        }
    }
}
