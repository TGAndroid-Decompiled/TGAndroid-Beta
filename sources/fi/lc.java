package fi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class lc implements DialogInterface.OnCancelListener {
    public final int f11188a;
    public final Object f11189b;

    public lc(Object obj, int i10) {
        this.f11188a = i10;
        this.f11189b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f11188a) {
            case 0:
                ((e2.q0) this.f11189b).run();
                return;
            case 1:
                ((ai.h0) this.f11189b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f11189b).cancel(true);
                return;
            case 3:
                ii.r0 r0Var = (ii.r0) this.f11189b;
                ConnectionsManager.getInstance(r0Var.d).cancelRequest(r0Var.f14426r, true);
                r0Var.f14425q = null;
                r0Var.f14426r = 0;
                return;
            default:
                ((ng.p) this.f11189b).I = false;
                return;
        }
    }
}
