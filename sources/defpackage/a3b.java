package defpackage;

import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a3b extends EditTextBoldCursor {
    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
    }
}
