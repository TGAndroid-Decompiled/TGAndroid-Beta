package fi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class ob implements DialogInterface.OnCancelListener {
    public final int f12572a;
    public final Object f12573b;

    public ob(Object obj, int i7) {
        this.f12572a = i7;
        this.f12573b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f12572a) {
            case 0:
                ((f2.h) this.f12573b).run();
                return;
            case 1:
                ((ai.e0) this.f12573b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f12573b).cancel(true);
                return;
            case 3:
                ii.l0 l0Var = (ii.l0) this.f12573b;
                ConnectionsManager.getInstance(l0Var.d).cancelRequest(l0Var.f15575r, true);
                l0Var.f15574q = null;
                l0Var.f15575r = 0;
                return;
            default:
                ((og.o) this.f12573b).I = false;
                return;
        }
    }
}
