package cf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f2266a;
    public int f2267b;
    public int f2268c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f2266a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f2266a);
        if (!isInPictureInPictureMode) {
            this.f2267b = size;
            this.f2268c = size2;
        }
        if (isInPictureInPictureMode && size < this.f2267b && size2 < this.f2268c) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
