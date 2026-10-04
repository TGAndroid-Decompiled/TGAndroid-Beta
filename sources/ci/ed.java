package ci;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class ed implements DialogInterface.OnCancelListener {
    public final int f5064a;
    public final Object f5065b;

    public ed(Object obj, int i10) {
        this.f5064a = i10;
        this.f5065b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f5064a) {
            case 0:
                ((x8) this.f5065b).run();
                return;
            case 1:
                ((ai.s1) this.f5065b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f5065b).cancel(true);
                return;
            case 3:
                fi.t0 t0Var = (fi.t0) this.f5065b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.f9990r, true);
                t0Var.f9989q = null;
                t0Var.f9990r = 0;
                return;
            default:
                ((lg.p) this.f5065b).I = false;
                return;
        }
    }
}
