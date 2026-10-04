package ci;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class ed implements DialogInterface.OnCancelListener {
    public final int f5063a;
    public final Object f5064b;

    public ed(Object obj, int i10) {
        this.f5063a = i10;
        this.f5064b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f5063a) {
            case 0:
                ((x8) this.f5064b).run();
                return;
            case 1:
                ((ai.s1) this.f5064b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f5064b).cancel(true);
                return;
            case 3:
                fi.t0 t0Var = (fi.t0) this.f5064b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.f9989r, true);
                t0Var.f9988q = null;
                t0Var.f9989r = 0;
                return;
            default:
                ((lg.p) this.f5064b).I = false;
                return;
        }
    }
}
