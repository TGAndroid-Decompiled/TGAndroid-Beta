package mh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d7 implements Utilities.Callback {
    public final t7 f13906a;
    public final long f13907b;
    public final int f13908c;
    public final boolean[] d;
    public final Utilities.Callback2 f13909e;
    public final Context f13910f;
    public final org.telegram.ui.ActionBar.g6 f13911g;
    public final TLRPC.ChatInvite h;
    public final String f13912i;

    public d7(t7 t7Var, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f13906a = t7Var;
        this.f13907b = j10;
        this.f13908c = i10;
        this.d = zArr;
        this.f13909e = callback2;
        this.f13910f = context;
        this.f13911g = g6Var;
        this.h = chatInvite;
        this.f13912i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        t7 t7Var = this.f13906a;
        long j10 = t7Var.f14832f.amount;
        long j11 = this.f13907b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.f13909e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f13912i;
        if (j10 < j11) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f13908c).starsPurchaseAvailable();
            Context context = this.f13910f;
            org.telegram.ui.ActionBar.g6 g6Var = this.f13911g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                t7.e0(context, g6Var);
                return;
            }
            boolean[] zArr2 = {false};
            z9 z9Var = new z9(context, g6Var, j11, 1, chatInvite.title, new hg.g0(t7Var, zArr2, str, chatInvite, zArr, callback2, callback, 2), 0L);
            z9Var.setOnDismissListener(new p5(t7Var, callback, zArr2, zArr, callback2, 0));
            z9Var.show();
            return;
        }
        t7Var.Z(str, chatInvite, new q5(callback, zArr, callback2));
    }
}
