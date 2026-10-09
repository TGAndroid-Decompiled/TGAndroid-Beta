package ci;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class p0 implements Utilities.Callback {
    public final int f5713a;
    public final t0 f5714b;

    public p0(t0 t0Var, int i10) {
        this.f5713a = i10;
        this.f5714b = t0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5713a) {
            case 0:
                Float f7 = (Float) obj;
                s0 s0Var = this.f5714b.f5983n;
                if (s0Var != null) {
                    s0Var.setProgress(f7.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                t0 t0Var = this.f5714b;
                if (t0Var.f5980c && t0Var.f5984r != null) {
                    t0Var.f5983n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    t0Var.f5980c = false;
                    t0Var.d();
                    t0Var.v = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                t0 t0Var2 = this.f5714b;
                t0Var2.f5980c = false;
                t0Var2.d();
                s0 s0Var2 = t0Var2.f5983n;
                if (s0Var2 != null) {
                    s0Var2.a();
                    t0Var2.f5983n = null;
                }
                s0 s0Var3 = new s0(t0Var2.getContext());
                t0Var2.f5983n = s0Var3;
                s0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                t0Var2.f5979b.addView(t0Var2.f5983n);
                t0Var2.v = uri2;
                return;
        }
    }
}
