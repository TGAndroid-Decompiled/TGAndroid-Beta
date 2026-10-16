package di;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class dd implements DialogInterface.OnCancelListener {
    public final int f6852a;
    public final Object f6853b;

    public dd(Object obj, int i10) {
        this.f6852a = i10;
        this.f6853b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f6852a) {
            case 0:
                ((y6) this.f6853b).run();
                return;
            case 1:
                ((ah.o) this.f6853b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f6853b).cancel(true);
                return;
            case 3:
                gi.t0 t0Var = (gi.t0) this.f6853b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.f10272r, true);
                t0Var.f10271q = null;
                t0Var.f10272r = 0;
                return;
            default:
                ((mg.p) this.f6853b).I = false;
                return;
        }
    }
}
