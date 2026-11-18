package bi;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
import org.telegram.ui.o60;
public final class i4 implements q10 {
    public final int f3689a = 2;
    public final Object f3690b;
    public final int f3691c;
    public final Object d;
    public final Object f3692e;
    public final Object f3693f;
    public final Object f3694g;
    public final Object h;

    public i4(int i7, org.telegram.ui.Wallet.u0 u0Var, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, org.telegram.ui.Wallet.y2 y2Var) {
        this.f3691c = i7;
        this.d = u0Var;
        this.f3690b = str;
        this.f3692e = bArr;
        this.f3693f = bArr2;
        this.f3694g = sendtransfer;
        this.h = y2Var;
    }

    @Override
    public final void a(java.lang.Object r25, java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: bi.i4.a(java.lang.Object, java.lang.Object):void");
    }

    public i4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, androidx.emoji2.text.n nVar, Context context, o60 o60Var, int i7) {
        this.d = cancellationToken;
        this.f3692e = taskCompletionSource;
        this.f3693f = runnableArr;
        this.f3694g = nVar;
        this.f3690b = context;
        this.h = o60Var;
        this.f3691c = i7;
    }

    public i4(x10 x10Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, lc lcVar, Boolean bool, q10 q10Var) {
        this.d = x10Var;
        this.f3690b = context;
        this.f3691c = i7;
        this.f3692e = i6Var;
        this.f3693f = lcVar;
        this.f3694g = bool;
        this.h = q10Var;
    }
}
