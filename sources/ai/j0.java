package ai;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.wc;
public final class j0 implements Runnable {
    public final int f1553a = 1;
    public final String f1554b;
    public final Utilities.Callback f1555c;
    public final r2 d;

    public j0(String str, Utilities.Callback callback, r2 r2Var) {
        this.f1554b = str;
        this.f1555c = callback;
        this.d = r2Var;
    }

    @Override
    public final void run() {
        switch (this.f1553a) {
            case 0:
                String str = this.f1554b;
                Utilities.Callback callback = this.f1555c;
                r2 r2Var = this.d;
                o0.p(r2Var, 0, new j0(str, callback, r2Var));
                return;
            default:
                String str2 = this.f1554b;
                if (str2 != null) {
                    this.f1555c.run(str2);
                    return;
                } else {
                    wc.b0(this.d).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                    return;
                }
        }
    }

    public j0(r2 r2Var, String str, Utilities.Callback callback) {
        this.d = r2Var;
        this.f1554b = str;
        this.f1555c = callback;
    }
}
