package fi;

import android.content.Context;
import android.content.DialogInterface;
import bi.n8;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w4 implements DialogInterface.OnDismissListener {
    public final int f9646a = 1;
    public final boolean[] f9647b;
    public final boolean[] f9648c;
    public final int d;
    public final Object e;
    public final Object f9649f;
    public final Object h;

    public w4(boolean[] zArr, n8 n8Var, boolean[] zArr2, Utilities.Callback callback, int[] iArr, int i10) {
        this.f9647b = zArr;
        this.e = n8Var;
        this.f9648c = zArr2;
        this.f9649f = callback;
        this.h = iArr;
        this.d = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9646a) {
            case 0:
                Context context = (Context) this.e;
                TLRPC.User user = (TLRPC.User) this.f9649f;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.h;
                if (!this.f9647b[0]) {
                    boolean[] zArr = this.f9648c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        c5.e(context, this.d, user.f19363id);
                        qVar.run(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f9649f;
                int[] iArr = (int[]) this.h;
                this.f9647b[0] = true;
                ((n8) this.e).run();
                boolean[] zArr2 = this.f9648c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    callback.run(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    return;
                }
                return;
        }
    }

    public w4(boolean[] zArr, boolean[] zArr2, Context context, int i10, TLRPC.User user, org.telegram.ui.web.q qVar) {
        this.f9647b = zArr;
        this.f9648c = zArr2;
        this.e = context;
        this.d = i10;
        this.f9649f = user;
        this.h = qVar;
    }
}
