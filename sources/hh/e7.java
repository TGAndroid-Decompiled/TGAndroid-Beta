package hh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class e7 implements Utilities.Callback {

    public final u7 f9214a;

    public final long f9215b;

    public final int f9216c;
    public final boolean[] d;

    public final Utilities.Callback2 f9217e;

    public final Context f9218f;

    public final org.telegram.ui.ActionBar.c6 f9219g;
    public final TLRPC.ChatInvite h;

    public final String f9220i;

    public e7(u7 u7Var, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f9214a = u7Var;
        this.f9215b = j10;
        this.f9216c = i10;
        this.d = zArr;
        this.f9217e = callback2;
        this.f9218f = context;
        this.f9219g = c6Var;
        this.h = chatInvite;
        this.f9220i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        u7 u7Var = this.f9214a;
        long j10 = u7Var.f10155f.amount;
        long j11 = this.f9215b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.f9217e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f9220i;
        if (j10 >= j11) {
            u7Var.Z(str, chatInvite, new s5(callback, zArr, callback2));
            return;
        }
        boolean zStarsPurchaseAvailable = MessagesController.getInstance(this.f9216c).starsPurchaseAvailable();
        Context context = this.f9218f;
        org.telegram.ui.ActionBar.c6 c6Var = this.f9219g;
        if (zStarsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            ea eaVar = new ea(context, c6Var, j11, 1, chatInvite.title, new cg.h0(u7Var, zArr2, str, chatInvite, zArr, callback2, callback, 2), 0L);
            eaVar.setOnDismissListener(new r5(u7Var, callback, zArr2, zArr, callback2, 0));
            eaVar.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0]) {
            callback2.run("cancelled", 0L);
            zArr[0] = true;
        }
        u7.e0(context, c6Var);
    }
}
