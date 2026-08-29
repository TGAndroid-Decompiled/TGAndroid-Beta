package nh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ll0;
import org.telegram.ui.web.HttpGetFileTask;
public final class zb implements DialogInterface.OnCancelListener {
    public final int f18971a;
    public final Object f18972b;

    public zb(Object obj, int i10) {
        this.f18971a = i10;
        this.f18972b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f18971a) {
            case 0:
                ((b6) this.f18972b).run();
                return;
            case 1:
                ((ll0) this.f18972b).run();
                return;
            case 2:
                ((HttpGetFileTask) this.f18972b).cancel(true);
                return;
            case 3:
                qh.o0 o0Var = (qh.o0) this.f18972b;
                ConnectionsManager.getInstance(o0Var.d).cancelRequest(o0Var.f46763r, true);
                o0Var.f46762q = null;
                o0Var.f46763r = 0;
                return;
            default:
                ((wf.n) this.f18972b).E = false;
                return;
        }
    }
}
