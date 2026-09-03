package bf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f1788a;
    public int f1789b;
    public int f1790c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f1788a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f1788a);
        if (!isInPictureInPictureMode) {
            this.f1789b = size;
            this.f1790c = size2;
        }
        if (isInPictureInPictureMode && size < this.f1789b && size2 < this.f1790c) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
