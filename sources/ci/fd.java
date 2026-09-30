package ci;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class fd implements DialogInterface.OnCancelListener {
    public final int f4712a;
    public final Object f4713b;

    public fd(Object obj, int i10) {
        this.f4712a = i10;
        this.f4713b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f4712a) {
            case 0:
                ((y8) this.f4713b).run();
                return;
            case 1:
                ((ai.s1) this.f4713b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f4713b).cancel(true);
                return;
            case 3:
                fi.t0 t0Var = (fi.t0) this.f4713b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.f9175r, true);
                t0Var.f9174q = null;
                t0Var.f9175r = 0;
                return;
            default:
                ((lg.p) this.f4713b).I = false;
                return;
        }
    }
}
