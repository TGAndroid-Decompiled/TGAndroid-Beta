package di;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class id implements DialogInterface.OnCancelListener {
    public final int f7434a;
    public final Object f7435b;

    public id(Object obj, int i10) {
        this.f7434a = i10;
        this.f7435b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f7434a) {
            case 0:
                ((b7) this.f7435b).run();
                return;
            case 1:
                ((ah.p) this.f7435b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f7435b).cancel(true);
                return;
            case 3:
                gi.t0 t0Var = (gi.t0) this.f7435b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.f10812r, true);
                t0Var.f10811q = null;
                t0Var.f10812r = 0;
                return;
            default:
                ((mg.q) this.f7435b).I = false;
                return;
        }
    }
}
