package hi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class lb implements DialogInterface.OnCancelListener {
    public final int f15011a;
    public final Object f15012b;

    public lb(Object obj, int i7) {
        this.f15011a = i7;
        this.f15012b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f15011a) {
            case 0:
                ((c) this.f15012b).run();
                return;
            case 1:
                ((ai.c1) this.f15012b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f15012b).cancel(true);
                return;
            case 3:
                li.k0 k0Var = (li.k0) this.f15012b;
                ConnectionsManager.getInstance(k0Var.d).cancelRequest(k0Var.f19991r, true);
                k0Var.f19990q = null;
                k0Var.f19991r = 0;
                return;
            default:
                ((og.o) this.f15012b).J = false;
                return;
        }
    }
}
