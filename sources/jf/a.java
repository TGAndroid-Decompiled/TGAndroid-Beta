package jf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.i0;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f9834a;
    public int f9835b;
    public int f9836c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f9834a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean H1 = i0.H1(this.f9834a);
        if (!H1) {
            this.f9835b = size;
            this.f9836c = size2;
        }
        if (H1 && size < this.f9835b && size2 < this.f9836c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
