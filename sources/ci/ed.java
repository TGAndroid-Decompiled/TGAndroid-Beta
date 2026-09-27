package ci;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class ed implements DialogInterface.OnCancelListener {
    public final int f4687a;
    public final Object f4688b;

    public ed(Object obj, int i10) {
        this.f4687a = i10;
        this.f4688b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f4687a) {
            case 0:
                ((x8) this.f4688b).run();
                return;
            case 1:
                ((ai.s1) this.f4688b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f4688b).cancel(true);
                return;
            case 3:
                fi.t0 t0Var = (fi.t0) this.f4688b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.f9180r, true);
                t0Var.f9179q = null;
                t0Var.f9180r = 0;
                return;
            default:
                ((lg.p) this.f4688b).I = false;
                return;
        }
    }
}
