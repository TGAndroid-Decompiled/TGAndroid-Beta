package jh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c7 implements Utilities.Callback {
    public final s7 f11875a;
    public final long f11876b;
    public final int f11877c;
    public final boolean[] d;
    public final Utilities.Callback2 f11878e;
    public final Context f11879f;
    public final org.telegram.ui.ActionBar.c6 f11880g;
    public final TLRPC.ChatInvite h;
    public final String f11881i;

    public c7(s7 s7Var, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f11875a = s7Var;
        this.f11876b = j10;
        this.f11877c = i10;
        this.d = zArr;
        this.f11878e = callback2;
        this.f11879f = context;
        this.f11880g = c6Var;
        this.h = chatInvite;
        this.f11881i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        s7 s7Var = this.f11875a;
        long j10 = s7Var.f12791f.amount;
        long j11 = this.f11876b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.f11878e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f11881i;
        if (j10 < j11) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f11877c).starsPurchaseAvailable();
            Context context = this.f11879f;
            org.telegram.ui.ActionBar.c6 c6Var = this.f11880g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                s7.e0(context, c6Var);
                return;
            }
            boolean[] zArr2 = {false};
            y9 y9Var = new y9(context, c6Var, j11, 1, chatInvite.title, new eg.h0(s7Var, zArr2, str, chatInvite, zArr, callback2, callback, 2), 0L);
            y9Var.setOnDismissListener(new p5(s7Var, callback, zArr2, zArr, callback2, 0));
            y9Var.show();
            return;
        }
        s7Var.Z(str, chatInvite, new q5(callback, zArr, callback2));
    }
}
