package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class nzb extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gl.q.y * 0.33f), View.MeasureSpec.getSize(i2)), 1073741824));
    }
}
