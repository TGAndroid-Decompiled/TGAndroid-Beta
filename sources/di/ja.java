package di;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class ja implements View.OnClickListener {
    public final int f9128a;
    public final eb f9129b;

    public ja(eb ebVar, int i7) {
        this.f9128a = i7;
        this.f9129b = ebVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.g2 Q;
        org.telegram.ui.ActionBar.g2 Q2;
        switch (this.f9128a) {
            case 0:
                if (this.f9129b.f8754e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f28905a = true;
                    Q.showAsSheet(new pb(), obj);
                    return;
                }
                return;
            default:
                if (this.f9129b.f8754e > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f28905a = true;
                    Q2.showAsSheet(new pb(), obj2);
                    return;
                }
                return;
        }
    }
}
