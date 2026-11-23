package hi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class gc implements DialogInterface.OnCancelListener {
    public final int f14561a;
    public final Object f14562b;

    public gc(Object obj, int i7) {
        this.f14561a = i7;
        this.f14562b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f14561a) {
            case 0:
                ((c) this.f14562b).run();
                return;
            case 1:
                ((ai.e1) this.f14562b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f14562b).cancel(true);
                return;
            case 3:
                li.j0 j0Var = (li.j0) this.f14562b;
                ConnectionsManager.getInstance(j0Var.d).cancelRequest(j0Var.f20057r, true);
                j0Var.f20056q = null;
                j0Var.f20057r = 0;
                return;
            default:
                ((og.o) this.f14562b).J = false;
                return;
        }
    }
}
