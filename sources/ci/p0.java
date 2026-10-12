package ci;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class p0 implements Utilities.Callback {
    public final int f5711a;
    public final t0 f5712b;

    public p0(t0 t0Var, int i10) {
        this.f5711a = i10;
        this.f5712b = t0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5711a) {
            case 0:
                Float f7 = (Float) obj;
                s0 s0Var = this.f5712b.f5981n;
                if (s0Var != null) {
                    s0Var.setProgress(f7.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                t0 t0Var = this.f5712b;
                if (t0Var.f5978c && t0Var.f5982r != null) {
                    t0Var.f5981n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    t0Var.f5978c = false;
                    t0Var.d();
                    t0Var.v = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                t0 t0Var2 = this.f5712b;
                t0Var2.f5978c = false;
                t0Var2.d();
                s0 s0Var2 = t0Var2.f5981n;
                if (s0Var2 != null) {
                    s0Var2.a();
                    t0Var2.f5981n = null;
                }
                s0 s0Var3 = new s0(t0Var2.getContext());
                t0Var2.f5981n = s0Var3;
                s0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                t0Var2.f5977b.addView(t0Var2.f5981n);
                t0Var2.v = uri2;
                return;
        }
    }
}
