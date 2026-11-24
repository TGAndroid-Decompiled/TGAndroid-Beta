package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class jwa implements View.OnClickListener {
    public final byte a;
    public final cxa b;

    public jwa(cxa cxaVar, byte b) {
        this.a = b;
        this.b = cxaVar;
    }

    @Override
    public final void onClick(View view) {
        d Q;
        d Q2;
        byte b = this.a;
        cxa cxaVar = this.b;
        switch (b) {
            case 0:
                if (cxaVar.e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.a = true;
                    Q.showAsSheet(new nxa(), obj);
                    return;
                }
                return;
            default:
                if (cxaVar.e > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.a = true;
                    Q2.showAsSheet(new nxa(), obj2);
                    return;
                }
                return;
        }
    }
}
