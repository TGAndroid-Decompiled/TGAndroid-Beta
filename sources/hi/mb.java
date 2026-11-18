package hi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;
public final class mb implements DialogInterface.OnCancelListener {
    public final int f15037a;
    public final Object f15038b;

    public mb(Object obj, int i7) {
        this.f15037a = i7;
        this.f15038b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f15037a) {
            case 0:
                ((r1) this.f15038b).run();
                return;
            case 1:
                ((ai.a1) this.f15038b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f15038b).cancel(true);
                return;
            case 3:
                li.k0 k0Var = (li.k0) this.f15038b;
                ConnectionsManager.getInstance(k0Var.d).cancelRequest(k0Var.f19963r, true);
                k0Var.f19962q = null;
                k0Var.f19963r = 0;
                return;
            default:
                ((og.o) this.f15038b).J = false;
                return;
        }
    }
}
