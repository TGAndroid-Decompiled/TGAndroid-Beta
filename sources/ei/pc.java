package ei;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class pc implements DialogInterface.OnCancelListener {
    public final int f9607a;
    public final Object f9608b;

    public pc(Object obj, int i10) {
        this.f9607a = i10;
        this.f9608b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f9607a) {
            case 0:
                ((p6) this.f9608b).run();
                return;
            case 1:
                ((ah.o) this.f9608b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f9608b).cancel(true);
                return;
            case 3:
                hi.s0 s0Var = (hi.s0) this.f9608b;
                ConnectionsManager.getInstance(s0Var.d).cancelRequest(s0Var.f12232r, true);
                s0Var.f12231q = null;
                s0Var.f12232r = 0;
                return;
            default:
                ((mg.p) this.f9608b).I = false;
                return;
        }
    }
}
