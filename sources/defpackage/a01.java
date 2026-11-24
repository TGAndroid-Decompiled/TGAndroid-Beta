package defpackage;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
public final class a01 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final int b;

    public a01(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.getInstance(y6c.t0).cancelRequest(i, true);
                return;
            default:
                k96 D0 = k96.D0();
                if (i != 0) {
                    Iterator it = D0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        h96 h96Var = (h96) ((Map.Entry) it.next()).getValue();
                        if (h96Var.c == i) {
                            ConnectionsManager.getInstance(h96Var.d).cancelRequest(i, true);
                            it.remove();
                            h96Var.a();
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
