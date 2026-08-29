package ih;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u51;
public final class k5 extends u51 {
    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
    }
}
