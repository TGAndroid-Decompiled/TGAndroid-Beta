package gh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f7 implements Utilities.Callback {
    public final v7 f8073a;
    public final long f8074b;
    public final int f8075c;
    public final boolean[] d;
    public final Utilities.Callback2 f8076e;
    public final Context f8077f;
    public final org.telegram.ui.ActionBar.b6 f8078g;
    public final TLRPC.ChatInvite h;
    public final String f8079i;

    public f7(v7 v7Var, long j10, int i9, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.b6 b6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f8073a = v7Var;
        this.f8074b = j10;
        this.f8075c = i9;
        this.d = zArr;
        this.f8076e = callback2;
        this.f8077f = context;
        this.f8078g = b6Var;
        this.h = chatInvite;
        this.f8079i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        v7 v7Var = this.f8073a;
        long j10 = v7Var.f9049f.amount;
        long j11 = this.f8074b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.f8076e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f8079i;
        if (j10 < j11) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f8075c).starsPurchaseAvailable();
            Context context = this.f8077f;
            org.telegram.ui.ActionBar.b6 b6Var = this.f8078g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                v7.e0(context, b6Var);
                return;
            }
            boolean[] zArr2 = {false};
            ea eaVar = new ea(context, b6Var, j11, 1, chatInvite.title, new bg.k0(v7Var, zArr2, str, chatInvite, zArr, callback2, callback, 2), 0L);
            eaVar.setOnDismissListener(new s5(v7Var, callback, zArr2, zArr, callback2, 0));
            eaVar.show();
            return;
        }
        v7Var.Z(str, chatInvite, new t5(callback, zArr, callback2));
    }
}
