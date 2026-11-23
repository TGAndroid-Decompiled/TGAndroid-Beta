package hi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class lb implements DialogInterface.OnCancelListener {
    public final int f15014a;
    public final Object f15015b;

    public lb(Object obj, int i7) {
        this.f15014a = i7;
        this.f15015b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f15014a) {
            case 0:
                ((c) this.f15015b).run();
                return;
            case 1:
                ((ai.j1) this.f15015b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f15015b).cancel(true);
                return;
            case 3:
                li.k0 k0Var = (li.k0) this.f15015b;
                ConnectionsManager.getInstance(k0Var.d).cancelRequest(k0Var.f19994r, true);
                k0Var.f19993q = null;
                k0Var.f19994r = 0;
                return;
            default:
                ((og.o) this.f15015b).J = false;
                return;
        }
    }
}
