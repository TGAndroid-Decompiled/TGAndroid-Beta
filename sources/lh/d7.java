package lh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d7 implements Utilities.Callback {
    public final t7 f12295a;
    public final long f12296b;
    public final int f12297c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f12298f;
    public final org.telegram.ui.ActionBar.f6 f12299g;
    public final TLRPC.ChatInvite h;
    public final String f12300i;

    public d7(t7 t7Var, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f12295a = t7Var;
        this.f12296b = j10;
        this.f12297c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f12298f = context;
        this.f12299g = f6Var;
        this.h = chatInvite;
        this.f12300i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t7 t7Var = this.f12295a;
        long j10 = t7Var.f13136f.amount;
        long j11 = this.f12296b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f12300i;
        if (j10 < j11) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f12297c).starsPurchaseAvailable();
            Context context = this.f12298f;
            org.telegram.ui.ActionBar.f6 f6Var = this.f12299g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                t7.e0(context, f6Var);
                return;
            }
            boolean[] zArr2 = {false};
            z9 z9Var = new z9(context, f6Var, j11, 1, chatInvite.title, new gg.g0(t7Var, zArr2, str, chatInvite, zArr, callback2, callback, 2), 0L);
            z9Var.setOnDismissListener(new p5(t7Var, callback, zArr2, zArr, callback2, 0));
            z9Var.show();
            return;
        }
        t7Var.Z(str, chatInvite, new q5(callback, zArr, callback2));
    }
}
