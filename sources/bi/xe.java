package bi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class xe implements DialogInterface.OnCancelListener {
    public final int f3946a;
    public final Object f3947b;

    public xe(Object obj, int i10) {
        this.f3946a = i10;
        this.f3947b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f3946a) {
            case 0:
                ((af) this.f3947b).run();
                return;
            case 1:
                ((g3) this.f3947b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f3947b).cancel(true);
                return;
            case 3:
                ei.t0 t0Var = (ei.t0) this.f3947b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.f7637r, true);
                t0Var.f7636q = null;
                t0Var.f7637r = 0;
                return;
            default:
                ((kg.p) this.f3947b).I = false;
                return;
        }
    }
}
