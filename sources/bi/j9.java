package bi;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final ca f4904a;
    public final long f4905b;
    public final int f4906c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f4907f;
    public final org.telegram.ui.ActionBar.u6 f4908g;
    public final TLRPC.ChatInvite h;
    public final String f4909i;

    public j9(ca caVar, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.u6 u6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f4904a = caVar;
        this.f4905b = j10;
        this.f4906c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f4907f = context;
        this.f4908g = u6Var;
        this.h = chatInvite;
        this.f4909i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        ca caVar = this.f4904a;
        long j10 = caVar.f4444f.amount;
        long j11 = this.f4905b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f4909i;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f4906c).starsPurchaseAvailable();
            Context context = this.f4907f;
            org.telegram.ui.ActionBar.u6 u6Var = this.f4908g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                ca.e0(context, u6Var);
                return;
            }
            boolean[] zArr2 = {false};
            tc tcVar = new tc(context, u6Var, j11, 1, chatInvite.title, new r7(caVar, zArr2, str, chatInvite, zArr, callback2, callback), 0L);
            tcVar.setOnDismissListener(new s7(caVar, callback, zArr2, zArr, callback2, 0));
            tcVar.show();
            return;
        }
        caVar.Z(str, chatInvite, new t7(callback, zArr, callback2));
    }
}
