package fi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class ob implements DialogInterface.OnCancelListener {
    public final int f12568a;
    public final Object f12569b;

    public ob(Object obj, int i7) {
        this.f12568a = i7;
        this.f12569b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f12568a) {
            case 0:
                ((f2.h) this.f12569b).run();
                return;
            case 1:
                ((ai.e0) this.f12569b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f12569b).cancel(true);
                return;
            case 3:
                ii.l0 l0Var = (ii.l0) this.f12569b;
                ConnectionsManager.getInstance(l0Var.d).cancelRequest(l0Var.f15576r, true);
                l0Var.f15575q = null;
                l0Var.f15576r = 0;
                return;
            default:
                ((og.o) this.f12569b).I = false;
                return;
        }
    }
}
