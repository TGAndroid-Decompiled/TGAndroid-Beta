package ci;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class qa implements View.OnClickListener {
    public final int f5853a;
    public final lb f5854b;

    public qa(lb lbVar, int i3) {
        this.f5853a = i3;
        this.f5854b = lbVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.d2 Q;
        org.telegram.ui.ActionBar.d2 Q2;
        switch (this.f5853a) {
            case 0:
                if (this.f5854b.f5510f > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f27395a = true;
                    Q.showAsSheet(new wb(), obj);
                    return;
                }
                return;
            default:
                if (this.f5854b.f5510f > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f27395a = true;
                    Q2.showAsSheet(new wb(), obj2);
                    return;
                }
                return;
        }
    }
}
