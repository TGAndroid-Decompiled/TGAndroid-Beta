package di;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class fa implements View.OnClickListener {
    public final int f8566a;
    public final ab f8567b;

    public fa(ab abVar, int i7) {
        this.f8566a = i7;
        this.f8567b = abVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.e2 Q;
        org.telegram.ui.ActionBar.e2 Q2;
        switch (this.f8566a) {
            case 0:
                if (this.f8567b.f8215e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f28476a = true;
                    Q.showAsSheet(new lb(), obj);
                    return;
                }
                return;
            default:
                if (this.f8567b.f8215e > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f28476a = true;
                    Q2.showAsSheet(new lb(), obj2);
                    return;
                }
                return;
        }
    }
}
