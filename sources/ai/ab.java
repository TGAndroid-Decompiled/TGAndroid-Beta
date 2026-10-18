package ai;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class ab implements View.OnClickListener {
    public final int f973a;
    public final ad f974b;

    public ab(ad adVar, int i10) {
        this.f973a = i10;
        this.f974b = adVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f973a) {
            case 0:
                if (this.f974b.f981f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21559a = true;
                    R.showAsSheet(new md(), obj);
                    return;
                }
                return;
            default:
                if (this.f974b.f981f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21559a = true;
                    R2.showAsSheet(new md(), obj2);
                    return;
                }
                return;
        }
    }
}
