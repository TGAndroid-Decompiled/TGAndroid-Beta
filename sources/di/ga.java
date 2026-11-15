package di;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class ga implements View.OnClickListener {
    public final int f8622a;
    public final bb f8623b;

    public ga(bb bbVar, int i7) {
        this.f8622a = i7;
        this.f8623b = bbVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.e2 Q;
        org.telegram.ui.ActionBar.e2 Q2;
        switch (this.f8622a) {
            case 0:
                if (this.f8623b.f8264e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f28476a = true;
                    Q.showAsSheet(new mb(), obj);
                    return;
                }
                return;
            default:
                if (this.f8623b.f8264e > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f28476a = true;
                    Q2.showAsSheet(new mb(), obj2);
                    return;
                }
                return;
        }
    }
}
