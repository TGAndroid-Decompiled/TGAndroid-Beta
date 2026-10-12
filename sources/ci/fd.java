package ci;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class fd implements DialogInterface.OnCancelListener {
    public final int f5108a;
    public final Object f5109b;

    public fd(Object obj, int i10) {
        this.f5108a = i10;
        this.f5109b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f5108a) {
            case 0:
                ((y8) this.f5109b).run();
                return;
            case 1:
                ((ai.s1) this.f5109b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f5109b).cancel(true);
                return;
            case 3:
                fi.t0 t0Var = (fi.t0) this.f5109b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.f10063r, true);
                t0Var.f10062q = null;
                t0Var.f10063r = 0;
                return;
            default:
                ((lg.p) this.f5109b).I = false;
                return;
        }
    }
}
