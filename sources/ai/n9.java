package ai;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Utilities.Callback {
    public final ga f1908a;
    public final long f1909b;
    public final int f1910c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f1911f;
    public final org.telegram.ui.ActionBar.d6 f1912g;
    public final TLRPC.ChatInvite h;
    public final String f1913i;

    public n9(ga gaVar, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f1908a = gaVar;
        this.f1909b = j10;
        this.f1910c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f1911f = context;
        this.f1912g = d6Var;
        this.h = chatInvite;
        this.f1913i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        ga gaVar = this.f1908a;
        long j10 = gaVar.f1357f.amount;
        long j11 = this.f1909b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f1913i;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f1910c).starsPurchaseAvailable();
            Context context = this.f1911f;
            org.telegram.ui.ActionBar.d6 d6Var = this.f1912g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                ga.e0(context, d6Var);
                return;
            }
            boolean[] zArr2 = {false};
            cd cdVar = new cd(context, d6Var, j11, 1, chatInvite.title, new u7(gaVar, zArr2, str, chatInvite, zArr, callback2, callback), 0L);
            cdVar.setOnDismissListener(new v7(gaVar, callback, zArr2, zArr, callback2, 0));
            cdVar.show();
            return;
        }
        gaVar.Z(str, chatInvite, new w7(callback, zArr, callback2));
    }
}
