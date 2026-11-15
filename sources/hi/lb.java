package hi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class lb implements DialogInterface.OnCancelListener {
    public final int f14612a;
    public final Object f14613b;

    public lb(Object obj, int i7) {
        this.f14612a = i7;
        this.f14613b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f14612a) {
            case 0:
                ((h4) this.f14613b).run();
                return;
            case 1:
                ((ai.a1) this.f14613b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f14613b).cancel(true);
                return;
            case 3:
                li.k0 k0Var = (li.k0) this.f14613b;
                ConnectionsManager.getInstance(k0Var.d).cancelRequest(k0Var.f19606r, true);
                k0Var.f19605q = null;
                k0Var.f19606r = 0;
                return;
            default:
                ((og.o) this.f14613b).J = false;
                return;
        }
    }
}
