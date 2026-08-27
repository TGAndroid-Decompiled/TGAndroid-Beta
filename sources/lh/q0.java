package lh;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public final class q0 implements Utilities.Callback {

    public final int f16551a;

    public final u0 f16552b;

    public q0(u0 u0Var, int i10) {
        this.f16551a = i10;
        this.f16552b = u0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16551a) {
            case 0:
                Float f10 = (Float) obj;
                t0 t0Var = this.f16552b.f16891n;
                if (t0Var != null) {
                    t0Var.setProgress(f10.floatValue());
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                u0 u0Var = this.f16552b;
                if (u0Var.f16888c && u0Var.f16892r != null) {
                    u0Var.f16891n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    u0Var.f16888c = false;
                    u0Var.d();
                    u0Var.v = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                u0 u0Var2 = this.f16552b;
                u0Var2.f16888c = false;
                u0Var2.d();
                t0 t0Var2 = u0Var2.f16891n;
                if (t0Var2 != null) {
                    t0Var2.a();
                    u0Var2.f16891n = null;
                }
                t0 t0Var3 = new t0(u0Var2.getContext());
                u0Var2.f16891n = t0Var3;
                t0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                u0Var2.f16887b.addView(u0Var2.f16891n);
                u0Var2.v = uri2;
                break;
        }
    }
}
