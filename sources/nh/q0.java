package nh;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class q0 implements Utilities.Callback {
    public final int f18389a;
    public final u0 f18390b;

    public q0(u0 u0Var, int i10) {
        this.f18389a = i10;
        this.f18390b = u0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18389a) {
            case 0:
                Float f9 = (Float) obj;
                t0 t0Var = this.f18390b.f18707n;
                if (t0Var != null) {
                    t0Var.setProgress(f9.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                u0 u0Var = this.f18390b;
                if (u0Var.f18704c && u0Var.f18708r != null) {
                    u0Var.f18707n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    u0Var.f18704c = false;
                    u0Var.d();
                    u0Var.v = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                u0 u0Var2 = this.f18390b;
                u0Var2.f18704c = false;
                u0Var2.d();
                t0 t0Var2 = u0Var2.f18707n;
                if (t0Var2 != null) {
                    t0Var2.a();
                    u0Var2.f18707n = null;
                }
                t0 t0Var3 = new t0(u0Var2.getContext());
                u0Var2.f18707n = t0Var3;
                t0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                u0Var2.f18703b.addView(u0Var2.f18707n);
                u0Var2.v = uri2;
                return;
        }
    }
}
