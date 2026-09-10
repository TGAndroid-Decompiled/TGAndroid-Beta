package bi;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends FrameLayout {
    public org.telegram.ui.Components.w9 f3074a;
    public int f3075b;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(170.0f), (AndroidUtilities.displaySize.y * 0.34999996f) - AndroidUtilities.dp(142.0f)), 1073741824));
    }
}
