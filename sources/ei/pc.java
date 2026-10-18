package ei;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class pc implements DialogInterface.OnCancelListener {
    public final int f9608a;
    public final Object f9609b;

    public pc(Object obj, int i10) {
        this.f9608a = i10;
        this.f9609b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f9608a) {
            case 0:
                ((p6) this.f9609b).run();
                return;
            case 1:
                ((ah.o) this.f9609b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f9609b).cancel(true);
                return;
            case 3:
                hi.s0 s0Var = (hi.s0) this.f9609b;
                ConnectionsManager.getInstance(s0Var.d).cancelRequest(s0Var.f12233r, true);
                s0Var.f12232q = null;
                s0Var.f12233r = 0;
                return;
            default:
                ((mg.p) this.f9609b).I = false;
                return;
        }
    }
}
