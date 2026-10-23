package ai;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o9 implements Utilities.Callback {
    public final ha f1949a;
    public final long f1950b;
    public final int f1951c;
    public final boolean[] d;
    public final Utilities.Callback2 e;
    public final Context f1952f;
    public final org.telegram.ui.ActionBar.g6 f1953g;
    public final TLRPC.ChatInvite h;
    public final String f1954i;

    public o9(ha haVar, long j10, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.f1949a = haVar;
        this.f1950b = j10;
        this.f1951c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f1952f = context;
        this.f1953g = g6Var;
        this.h = chatInvite;
        this.f1954i = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        ha haVar = this.f1949a;
        long j10 = haVar.f1416f.amount;
        long j11 = this.f1950b;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.f1954i;
        if (i10 < 0) {
            boolean starsPurchaseAvailable = MessagesController.getInstance(this.f1951c).starsPurchaseAvailable();
            Context context = this.f1952f;
            org.telegram.ui.ActionBar.g6 g6Var = this.f1953g;
            if (!starsPurchaseAvailable) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                ha.e0(context, g6Var);
                return;
            }
            boolean[] zArr2 = {false};
            dd ddVar = new dd(context, g6Var, j11, 1, chatInvite.title, new v7(haVar, zArr2, str, chatInvite, zArr, callback2, callback), 0L);
            ddVar.setOnDismissListener(new w7(haVar, callback, zArr2, zArr, callback2, 0));
            ddVar.show();
            return;
        }
        haVar.Z(str, chatInvite, new x7(callback, zArr, callback2));
    }
}
