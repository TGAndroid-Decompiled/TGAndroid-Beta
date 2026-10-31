package eg;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.web.HttpGetFileTask;
import vh.d1;
import yh.e0;
public final class k implements DialogInterface.OnCancelListener {
    public final int f6563a;
    public final Object f6564b;

    public k(Object obj, int i10) {
        this.f6563a = i10;
        this.f6564b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f6563a) {
            case 0:
                ((q) this.f6564b).I = false;
                return;
            case 1:
                ((d1) this.f6564b).run();
                return;
            case 2:
                ((x0) this.f6564b).run();
                return;
            case 3:
                ((HttpGetFileTask) this.f6564b).cancel(true);
                return;
            default:
                e0 e0Var = (e0) this.f6564b;
                ConnectionsManager.getInstance(e0Var.d).cancelRequest(e0Var.f54487r, true);
                e0Var.f54486q = null;
                e0Var.f54487r = 0;
                return;
        }
    }
}
