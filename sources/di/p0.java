package di;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class p0 implements Utilities.Callback {
    public final int f7572a;
    public final t0 f7573b;

    public p0(t0 t0Var, int i10) {
        this.f7572a = i10;
        this.f7573b = t0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f7572a) {
            case 0:
                Float f7 = (Float) obj;
                s0 s0Var = this.f7573b.f7816n;
                if (s0Var != null) {
                    s0Var.setProgress(f7.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                t0 t0Var = this.f7573b;
                if (t0Var.f7814c && t0Var.f7817r != null) {
                    t0Var.f7816n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    t0Var.f7814c = false;
                    t0Var.d();
                    t0Var.v = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                t0 t0Var2 = this.f7573b;
                t0Var2.f7814c = false;
                t0Var2.d();
                s0 s0Var2 = t0Var2.f7816n;
                if (s0Var2 != null) {
                    s0Var2.a();
                    t0Var2.f7816n = null;
                }
                s0 s0Var3 = new s0(t0Var2.getContext());
                t0Var2.f7816n = s0Var3;
                s0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                t0Var2.f7813b.addView(t0Var2.f7816n);
                t0Var2.v = uri2;
                return;
        }
    }
}
