package bi;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.kc;
import org.telegram.ui.bd0;
public final class p4 implements p10 {
    public final int f3957a = 2;
    public final Object f3958b;
    public final int f3959c;
    public final Object d;
    public final Object f3960e;
    public final Object f3961f;
    public final Object f3962g;
    public final Object h;

    public p4(int i7, org.telegram.ui.Wallet.v0 v0Var, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, org.telegram.ui.Wallet.z2 z2Var) {
        this.f3959c = i7;
        this.d = v0Var;
        this.f3958b = str;
        this.f3960e = bArr;
        this.f3961f = bArr2;
        this.f3962g = sendtransfer;
        this.h = z2Var;
    }

    @Override
    public final void a(java.lang.Object r25, java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: bi.p4.a(java.lang.Object, java.lang.Object):void");
    }

    public p4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, androidx.emoji2.text.n nVar, Context context, bd0 bd0Var, int i7) {
        this.d = cancellationToken;
        this.f3960e = taskCompletionSource;
        this.f3961f = runnableArr;
        this.f3962g = nVar;
        this.f3958b = context;
        this.h = bd0Var;
        this.f3959c = i7;
    }

    public p4(w10 w10Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, kc kcVar, Boolean bool, p10 p10Var) {
        this.d = w10Var;
        this.f3958b = context;
        this.f3959c = i7;
        this.f3960e = i6Var;
        this.f3961f = kcVar;
        this.f3962g = bool;
        this.h = p10Var;
    }
}
