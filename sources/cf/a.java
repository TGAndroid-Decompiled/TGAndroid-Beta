package cf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f2460a;
    public int f2461b;
    public int f2462c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f2460a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f2460a);
        if (!isInPictureInPictureMode) {
            this.f2461b = size;
            this.f2462c = size2;
        }
        if (isInPictureInPictureMode && size < this.f2461b && size2 < this.f2462c) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
