package bi;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
import org.telegram.ui.o60;
public final class p4 implements r10 {
    public final int f3957a = 2;
    public final Object f3958b;
    public final int f3959c;
    public final Object d;
    public final Object f3960e;
    public final Object f3961f;
    public final Object f3962g;
    public final Object h;

    public p4(int i7, org.telegram.ui.Wallet.u0 u0Var, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, org.telegram.ui.Wallet.y2 y2Var) {
        this.f3959c = i7;
        this.d = u0Var;
        this.f3958b = str;
        this.f3960e = bArr;
        this.f3961f = bArr2;
        this.f3962g = sendtransfer;
        this.h = y2Var;
    }

    @Override
    public final void a(java.lang.Object r25, java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: bi.p4.a(java.lang.Object, java.lang.Object):void");
    }

    public p4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, androidx.emoji2.text.n nVar, Context context, o60 o60Var, int i7) {
        this.d = cancellationToken;
        this.f3960e = taskCompletionSource;
        this.f3961f = runnableArr;
        this.f3962g = nVar;
        this.f3958b = context;
        this.h = o60Var;
        this.f3959c = i7;
    }

    public p4(y10 y10Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar, Boolean bool, r10 r10Var) {
        this.d = y10Var;
        this.f3958b = context;
        this.f3959c = i7;
        this.f3960e = h6Var;
        this.f3961f = lcVar;
        this.f3962g = bool;
        this.h = r10Var;
    }
}
