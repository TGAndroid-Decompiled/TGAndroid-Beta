package ei;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class q0 implements Utilities.Callback {
    public final int f9616a;
    public final u0 f9617b;

    public q0(u0 u0Var, int i10) {
        this.f9616a = i10;
        this.f9617b = u0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9616a) {
            case 0:
                Float f7 = (Float) obj;
                t0 t0Var = this.f9617b.f9878n;
                if (t0Var != null) {
                    t0Var.setProgress(f7.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                u0 u0Var = this.f9617b;
                if (u0Var.f9876c && u0Var.f9879r != null) {
                    u0Var.f9878n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    u0Var.f9876c = false;
                    u0Var.d();
                    u0Var.v = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                u0 u0Var2 = this.f9617b;
                u0Var2.f9876c = false;
                u0Var2.d();
                t0 t0Var2 = u0Var2.f9878n;
                if (t0Var2 != null) {
                    t0Var2.a();
                    u0Var2.f9878n = null;
                }
                t0 t0Var3 = new t0(u0Var2.getContext());
                u0Var2.f9878n = t0Var3;
                t0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                u0Var2.f9875b.addView(u0Var2.f9878n);
                u0Var2.v = uri2;
                return;
        }
    }
}
