package bi;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class tb implements View.OnClickListener {
    public final int f4767a;
    public final sc f4768b;

    public tb(sc scVar, int i7) {
        this.f4767a = i7;
        this.f4768b = scVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.f2 Q;
        org.telegram.ui.ActionBar.f2 Q2;
        switch (this.f4767a) {
            case 0:
                if (this.f4768b.f4723e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f27408a = true;
                    Q.showAsSheet(new dd(), obj);
                    return;
                }
                return;
            default:
                if (this.f4768b.f4723e > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f27408a = true;
                    Q2.showAsSheet(new dd(), obj2);
                    return;
                }
                return;
        }
    }
}
