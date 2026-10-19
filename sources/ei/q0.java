package ei;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class q0 implements Utilities.Callback {
    public final int f9618a;
    public final u0 f9619b;

    public q0(u0 u0Var, int i10) {
        this.f9618a = i10;
        this.f9619b = u0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9618a) {
            case 0:
                Float f7 = (Float) obj;
                t0 t0Var = this.f9619b.f9880n;
                if (t0Var != null) {
                    t0Var.setProgress(f7.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                u0 u0Var = this.f9619b;
                if (u0Var.f9878c && u0Var.f9881r != null) {
                    u0Var.f9880n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    u0Var.f9878c = false;
                    u0Var.d();
                    u0Var.v = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                u0 u0Var2 = this.f9619b;
                u0Var2.f9878c = false;
                u0Var2.d();
                t0 t0Var2 = u0Var2.f9880n;
                if (t0Var2 != null) {
                    t0Var2.a();
                    u0Var2.f9880n = null;
                }
                t0 t0Var3 = new t0(u0Var2.getContext());
                u0Var2.f9880n = t0Var3;
                t0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                u0Var2.f9877b.addView(u0Var2.f9880n);
                u0Var2.v = uri2;
                return;
        }
    }
}
