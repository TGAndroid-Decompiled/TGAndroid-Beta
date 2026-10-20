package ai;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class ab implements View.OnClickListener {
    public final int f981a;
    public final ad f982b;

    public ab(ad adVar, int i10) {
        this.f981a = i10;
        this.f982b = adVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f981a) {
            case 0:
                if (this.f982b.f989f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21556a = true;
                    R.showAsSheet(new md(), obj);
                    return;
                }
                return;
            default:
                if (this.f982b.f989f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21556a = true;
                    R2.showAsSheet(new md(), obj2);
                    return;
                }
                return;
        }
    }
}
