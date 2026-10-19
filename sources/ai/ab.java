package ai;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class ab implements View.OnClickListener {
    public final int f972a;
    public final ad f973b;

    public ab(ad adVar, int i10) {
        this.f972a = i10;
        this.f973b = adVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f972a) {
            case 0:
                if (this.f973b.f980f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21555a = true;
                    R.showAsSheet(new md(), obj);
                    return;
                }
                return;
            default:
                if (this.f973b.f980f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21555a = true;
                    R2.showAsSheet(new md(), obj2);
                    return;
                }
                return;
        }
    }
}
