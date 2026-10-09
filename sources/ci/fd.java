package ci;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class fd implements DialogInterface.OnCancelListener {
    public final int f5110a;
    public final Object f5111b;

    public fd(Object obj, int i10) {
        this.f5110a = i10;
        this.f5111b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f5110a) {
            case 0:
                ((y8) this.f5111b).run();
                return;
            case 1:
                ((ai.s1) this.f5111b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f5111b).cancel(true);
                return;
            case 3:
                fi.t0 t0Var = (fi.t0) this.f5111b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.f10065r, true);
                t0Var.f10064q = null;
                t0Var.f10065r = 0;
                return;
            default:
                ((lg.p) this.f5111b).I = false;
                return;
        }
    }
}
