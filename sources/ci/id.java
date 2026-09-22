package ci;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class id implements DialogInterface.OnCancelListener {
    public final int f4820a;
    public final Object f4821b;

    public id(Object obj, int i10) {
        this.f4820a = i10;
        this.f4821b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f4820a) {
            case 0:
                ((b9) this.f4821b).run();
                return;
            case 1:
                ((ai.s1) this.f4821b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f4821b).cancel(true);
                return;
            case 3:
                fi.t0 t0Var = (fi.t0) this.f4821b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.f9193r, true);
                t0Var.f9192q = null;
                t0Var.f9193r = 0;
                return;
            default:
                ((lg.p) this.f4821b).I = false;
                return;
        }
    }
}
