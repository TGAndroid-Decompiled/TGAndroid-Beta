package fi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class lc implements DialogInterface.OnCancelListener {
    public final int f11189a;
    public final Object f11190b;

    public lc(Object obj, int i10) {
        this.f11189a = i10;
        this.f11190b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f11189a) {
            case 0:
                ((e2.q0) this.f11190b).run();
                return;
            case 1:
                ((ai.h0) this.f11190b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f11190b).cancel(true);
                return;
            case 3:
                ii.r0 r0Var = (ii.r0) this.f11190b;
                ConnectionsManager.getInstance(r0Var.d).cancelRequest(r0Var.f14427r, true);
                r0Var.f14426q = null;
                r0Var.f14427r = 0;
                return;
            default:
                ((ng.p) this.f11190b).I = false;
                return;
        }
    }
}
