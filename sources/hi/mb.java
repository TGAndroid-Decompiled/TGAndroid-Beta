package hi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class mb implements DialogInterface.OnCancelListener {
    public final int f15024a;
    public final Object f15025b;

    public mb(Object obj, int i7) {
        this.f15024a = i7;
        this.f15025b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f15024a) {
            case 0:
                ((q1) this.f15025b).run();
                return;
            case 1:
                ((ai.d1) this.f15025b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f15025b).cancel(true);
                return;
            case 3:
                li.k0 k0Var = (li.k0) this.f15025b;
                ConnectionsManager.getInstance(k0Var.d).cancelRequest(k0Var.f19960r, true);
                k0Var.f19959q = null;
                k0Var.f19960r = 0;
                return;
            default:
                ((og.o) this.f15025b).J = false;
                return;
        }
    }
}
