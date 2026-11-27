package defpackage;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
public final class j01 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final int b;

    public j01(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.getInstance(yac.t0).cancelRequest(i, true);
                return;
            default:
                ob6 D0 = ob6.D0();
                if (i != 0) {
                    Iterator it = D0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        lb6 lb6Var = (lb6) ((Map.Entry) it.next()).getValue();
                        if (lb6Var.c == i) {
                            ConnectionsManager.getInstance(lb6Var.d).cancelRequest(i, true);
                            it.remove();
                            lb6Var.a();
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
