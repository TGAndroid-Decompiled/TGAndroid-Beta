package lh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;

public final class lc implements DialogInterface.OnCancelListener {

    public final int f16327a;

    public final Object f16328b;

    public lc(Object obj, int i10) {
        this.f16327a = i10;
        this.f16328b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f16327a) {
            case 0:
                ((k7) this.f16328b).run();
                break;
            case 1:
                ((d5.i) this.f16328b).run();
                break;
            case 2:
                ((HttpGetFileTask) this.f16328b).cancel(true);
                break;
            case 3:
                oh.q0 q0Var = (oh.q0) this.f16328b;
                ConnectionsManager.getInstance(q0Var.d).cancelRequest(q0Var.f19562r, true);
                q0Var.f19561q = null;
                q0Var.f19562r = 0;
                break;
            default:
                ((uf.n) this.f16328b).E = false;
                break;
        }
    }
}
