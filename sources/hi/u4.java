package hi;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u4 implements DialogInterface.OnDismissListener {
    public final int f13323a = 1;
    public final boolean[] f13324b;
    public final boolean[] f13325c;
    public final int d;
    public final Object e;
    public final Object f13326f;
    public final Object h;

    public u4(boolean[] zArr, ai.h1 h1Var, boolean[] zArr2, Utilities.Callback callback, int[] iArr, int i10) {
        this.f13324b = zArr;
        this.e = h1Var;
        this.f13325c = zArr2;
        this.f13326f = callback;
        this.h = iArr;
        this.d = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f13323a) {
            case 0:
                Context context = (Context) this.e;
                TLRPC.User user = (TLRPC.User) this.f13326f;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.h;
                if (!this.f13324b[0]) {
                    boolean[] zArr = this.f13325c;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        a5.e(context, this.d, user.f22177id);
                        rVar.run(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f13326f;
                int[] iArr = (int[]) this.h;
                this.f13324b[0] = true;
                ((ai.h1) this.e).run();
                boolean[] zArr2 = this.f13325c;
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

    public u4(boolean[] zArr, boolean[] zArr2, Context context, int i10, TLRPC.User user, org.telegram.ui.web.r rVar) {
        this.f13324b = zArr;
        this.f13325c = zArr2;
        this.e = context;
        this.d = i10;
        this.f13326f = user;
        this.h = rVar;
    }
}
