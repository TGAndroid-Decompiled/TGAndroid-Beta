package di;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class q0 implements Utilities.Callback {
    public final int f7963a;
    public final u0 f7964b;

    public q0(u0 u0Var, int i10) {
        this.f7963a = i10;
        this.f7964b = u0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f7963a) {
            case 0:
                Float f7 = (Float) obj;
                t0 t0Var = this.f7964b.f8245n;
                if (t0Var != null) {
                    t0Var.setProgress(f7.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                u0 u0Var = this.f7964b;
                if (u0Var.f8242c && u0Var.f8246r != null) {
                    u0Var.f8245n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    u0Var.f8242c = false;
                    u0Var.d();
                    u0Var.v = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                u0 u0Var2 = this.f7964b;
                u0Var2.f8242c = false;
                u0Var2.d();
                t0 t0Var2 = u0Var2.f8245n;
                if (t0Var2 != null) {
                    t0Var2.a();
                    u0Var2.f8245n = null;
                }
                t0 t0Var3 = new t0(u0Var2.getContext());
                u0Var2.f8245n = t0Var3;
                t0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                u0Var2.f8241b.addView(u0Var2.f8245n);
                u0Var2.v = uri2;
                return;
        }
    }
}
