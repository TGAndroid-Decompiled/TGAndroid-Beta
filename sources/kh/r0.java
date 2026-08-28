package kh;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class r0 implements Utilities.Callback {
    public final int f15918a;
    public final v0 f15919b;

    public r0(v0 v0Var, int i9) {
        this.f15918a = i9;
        this.f15919b = v0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15918a) {
            case 0:
                Float f10 = (Float) obj;
                u0 u0Var = this.f15919b.f16187n;
                if (u0Var != null) {
                    u0Var.setProgress(f10.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                v0 v0Var = this.f15919b;
                if (v0Var.f16184c && v0Var.f16188r != null) {
                    v0Var.f16187n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    v0Var.f16184c = false;
                    v0Var.d();
                    v0Var.v = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                v0 v0Var2 = this.f15919b;
                v0Var2.f16184c = false;
                v0Var2.d();
                u0 u0Var2 = v0Var2.f16187n;
                if (u0Var2 != null) {
                    u0Var2.a();
                    v0Var2.f16187n = null;
                }
                u0 u0Var3 = new u0(v0Var2.getContext());
                v0Var2.f16187n = u0Var3;
                u0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                v0Var2.f16183b.addView(v0Var2.f16187n);
                v0Var2.v = uri2;
                return;
        }
    }
}
