package lh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d7 implements Utilities.Callback {
    public final t7 f12311a;
    public final long f12312b;
    public final int f12313c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f12314f;
    public final org.telegram.ui.ActionBar.f6 f12315g;
    public final TLRPC.ChatInvite h;
    public final String f12316i;

    public d7(t7 t7Var, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f12311a = t7Var;
        this.f12312b = j10;
        this.f12313c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f12314f = context;
        this.f12315g = f6Var;
        this.h = chatInvite;
        this.f12316i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t7 t7Var = this.f12311a;
        long j10 = t7Var.f13152f.amount;
        long j11 = this.f12312b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f12316i;
        if (j10 < j11) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f12313c).starsPurchaseAvailable();
            Context context = this.f12314f;
            org.telegram.ui.ActionBar.f6 f6Var = this.f12315g;
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
