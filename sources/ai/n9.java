package ai;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Utilities.Callback {
    public final fa f1907a;
    public final long f1908b;
    public final int f1909c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f1910f;
    public final org.telegram.ui.ActionBar.d6 f1911g;
    public final TLRPC.ChatInvite h;
    public final String f1912i;

    public n9(fa faVar, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f1907a = faVar;
        this.f1908b = j10;
        this.f1909c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f1910f = context;
        this.f1911g = d6Var;
        this.h = chatInvite;
        this.f1912i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        fa faVar = this.f1907a;
        long j10 = faVar.f1314f.amount;
        long j11 = this.f1908b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f1912i;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f1909c).starsPurchaseAvailable();
            Context context = this.f1910f;
            org.telegram.ui.ActionBar.d6 d6Var = this.f1911g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                fa.e0(context, d6Var);
                return;
            }
            boolean[] zArr2 = {false};
            bd bdVar = new bd(context, d6Var, j11, 1, chatInvite.title, new u7(faVar, zArr2, str, chatInvite, zArr, callback2, callback), 0L);
            bdVar.setOnDismissListener(new v7(faVar, callback, zArr2, zArr, callback2, 0));
            bdVar.show();
            return;
        }
        faVar.Z(str, chatInvite, new w7(callback, zArr, callback2));
    }
}
