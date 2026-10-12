package di;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class dd implements DialogInterface.OnCancelListener {
    public final int f6849a;
    public final Object f6850b;

    public dd(Object obj, int i10) {
        this.f6849a = i10;
        this.f6850b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f6849a) {
            case 0:
                ((x6) this.f6850b).run();
                return;
            case 1:
                ((ah.o) this.f6850b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f6850b).cancel(true);
                return;
            case 3:
                gi.t0 t0Var = (gi.t0) this.f6850b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.f10268r, true);
                t0Var.f10267q = null;
                t0Var.f10268r = 0;
                return;
            default:
                ((mg.p) this.f6850b).I = false;
                return;
        }
    }
}
