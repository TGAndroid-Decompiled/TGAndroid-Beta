package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class fua implements View.OnClickListener {
    public final byte a;
    public final yua b;

    public fua(yua yuaVar, byte b) {
        this.a = b;
        this.b = yuaVar;
    }

    @Override
    public final void onClick(View view) {
        d Q;
        d Q2;
        byte b = this.a;
        yua yuaVar = this.b;
        switch (b) {
            case 0:
                if (yuaVar.e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.a = true;
                    Q.showAsSheet(new jva(), obj);
                    return;
                }
                return;
            default:
                if (yuaVar.e > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.a = true;
                    Q2.showAsSheet(new jva(), obj2);
                    return;
                }
                return;
        }
    }
}
