package di;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class ja implements View.OnClickListener {
    public final int f9105a;
    public final eb f9106b;

    public ja(eb ebVar, int i7) {
        this.f9105a = i7;
        this.f9106b = ebVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.h2 Q;
        org.telegram.ui.ActionBar.h2 Q2;
        switch (this.f9105a) {
            case 0:
                if (this.f9106b.f8731e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f28923a = true;
                    Q.showAsSheet(new pb(), obj);
                    return;
                }
                return;
            default:
                if (this.f9106b.f8731e > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f28923a = true;
                    Q2.showAsSheet(new pb(), obj2);
                    return;
                }
                return;
        }
    }
}
