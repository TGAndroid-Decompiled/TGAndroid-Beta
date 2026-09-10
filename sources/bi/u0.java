package bi;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class u0 implements Utilities.Callback {
    public final int f3708a;
    public final y0 f3709b;

    public u0(y0 y0Var, int i10) {
        this.f3708a = i10;
        this.f3709b = y0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f3708a) {
            case 0:
                Float f7 = (Float) obj;
                x0 x0Var = this.f3709b.f3957n;
                if (x0Var != null) {
                    x0Var.setProgress(f7.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                y0 y0Var = this.f3709b;
                if (y0Var.f3955c && y0Var.f3958r != null) {
                    y0Var.f3957n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    y0Var.f3955c = false;
                    y0Var.d();
                    y0Var.v = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                y0 y0Var2 = this.f3709b;
                y0Var2.f3955c = false;
                y0Var2.d();
                x0 x0Var2 = y0Var2.f3957n;
                if (x0Var2 != null) {
                    x0Var2.a();
                    y0Var2.f3957n = null;
                }
                x0 x0Var3 = new x0(y0Var2.getContext());
                y0Var2.f3957n = x0Var3;
                x0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                y0Var2.f3954b.addView(y0Var2.f3957n);
                y0Var2.v = uri2;
                return;
        }
    }
}
