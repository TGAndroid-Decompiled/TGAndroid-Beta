package ei;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class pc implements DialogInterface.OnCancelListener {
    public final int f9623a;
    public final Object f9624b;

    public pc(Object obj, int i10) {
        this.f9623a = i10;
        this.f9624b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f9623a) {
            case 0:
                ((p6) this.f9624b).run();
                return;
            case 1:
                ((ah.o) this.f9624b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f9624b).cancel(true);
                return;
            case 3:
                hi.s0 s0Var = (hi.s0) this.f9624b;
                ConnectionsManager.getInstance(s0Var.d).cancelRequest(s0Var.f12264r, true);
                s0Var.f12263q = null;
                s0Var.f12264r = 0;
                return;
            default:
                ((mg.p) this.f9624b).I = false;
                return;
        }
    }
}
