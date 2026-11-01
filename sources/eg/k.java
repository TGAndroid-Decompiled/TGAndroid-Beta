package eg;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.web.HttpGetFileTask;
import vh.r0;
import yh.d0;
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
                ((r0) this.f6564b).run();
                return;
            case 2:
                ((x0) this.f6564b).run();
                return;
            case 3:
                ((HttpGetFileTask) this.f6564b).cancel(true);
                return;
            default:
                d0 d0Var = (d0) this.f6564b;
                ConnectionsManager.getInstance(d0Var.d).cancelRequest(d0Var.f54485r, true);
                d0Var.f54484q = null;
                d0Var.f54485r = 0;
                return;
        }
    }
}
