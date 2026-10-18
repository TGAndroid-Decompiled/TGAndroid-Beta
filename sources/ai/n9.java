package ai;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Utilities.Callback {
    public final ga f1906a;
    public final long f1907b;
    public final int f1908c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f1909f;
    public final org.telegram.ui.ActionBar.d6 f1910g;
    public final TLRPC.ChatInvite h;
    public final String f1911i;

    public n9(ga gaVar, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f1906a = gaVar;
        this.f1907b = j10;
        this.f1908c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f1909f = context;
        this.f1910g = d6Var;
        this.h = chatInvite;
        this.f1911i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        ga gaVar = this.f1906a;
        long j10 = gaVar.f1355f.amount;
        long j11 = this.f1907b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f1911i;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f1908c).starsPurchaseAvailable();
            Context context = this.f1909f;
            org.telegram.ui.ActionBar.d6 d6Var = this.f1910g;
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
