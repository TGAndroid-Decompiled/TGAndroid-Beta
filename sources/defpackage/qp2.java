package defpackage;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class qp2 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final int b;
    public final int c;
    public final Object d;

    public qp2(int i, int i2, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.d;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                ((he[]) obj)[0] = null;
                return;
            default:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                ((jac) obj).a(null, "CANCELLED");
                return;
        }
    }
}
