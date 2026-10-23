package gi;

import ai.cb;
import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l4 implements DialogInterface.OnDismissListener {
    public final int f11327a = 1;
    public final boolean[] f11328b;
    public final boolean[] f11329c;
    public final int d;
    public final Object e;
    public final Object f11330f;
    public final Object h;

    public l4(boolean[] zArr, cb cbVar, boolean[] zArr2, Utilities.Callback callback, int[] iArr, int i10) {
        this.f11328b = zArr;
        this.e = cbVar;
        this.f11329c = zArr2;
        this.f11330f = callback;
        this.h = iArr;
        this.d = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f11327a) {
            case 0:
                Context context = (Context) this.e;
                TLRPC.User user = (TLRPC.User) this.f11330f;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.h;
                if (!this.f11328b[0]) {
                    boolean[] zArr = this.f11329c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        r4.e(context, this.d, user.f20427id);
                        rVar.run(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f11330f;
                int[] iArr = (int[]) this.h;
                this.f11328b[0] = true;
                ((cb) this.e).run();
                boolean[] zArr2 = this.f11329c;
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

    public l4(boolean[] zArr, boolean[] zArr2, Context context, int i10, TLRPC.User user, org.telegram.ui.web.r rVar) {
        this.f11328b = zArr;
        this.f11329c = zArr2;
        this.e = context;
        this.d = i10;
        this.f11330f = user;
        this.h = rVar;
    }
}
