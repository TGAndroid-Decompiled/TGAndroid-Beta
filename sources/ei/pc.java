package ei;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class pc implements DialogInterface.OnCancelListener {
    public final int f9610a;
    public final Object f9611b;

    public pc(Object obj, int i10) {
        this.f9610a = i10;
        this.f9611b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f9610a) {
            case 0:
                ((p6) this.f9611b).run();
                return;
            case 1:
                ((ah.o) this.f9611b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f9611b).cancel(true);
                return;
            case 3:
                hi.s0 s0Var = (hi.s0) this.f9611b;
                ConnectionsManager.getInstance(s0Var.d).cancelRequest(s0Var.f12235r, true);
                s0Var.f12234q = null;
                s0Var.f12235r = 0;
                return;
            default:
                ((mg.p) this.f9611b).I = false;
                return;
        }
    }
}
