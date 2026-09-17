package di;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class id implements DialogInterface.OnCancelListener {
    public final int f7406a;
    public final Object f7407b;

    public id(Object obj, int i10) {
        this.f7406a = i10;
        this.f7407b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f7406a) {
            case 0:
                ((b7) this.f7407b).run();
                return;
            case 1:
                ((ah.p) this.f7407b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f7407b).cancel(true);
                return;
            case 3:
                gi.t0 t0Var = (gi.t0) this.f7407b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.f10784r, true);
                t0Var.f10783q = null;
                t0Var.f10784r = 0;
                return;
            default:
                ((mg.q) this.f7407b).I = false;
                return;
        }
    }
}
