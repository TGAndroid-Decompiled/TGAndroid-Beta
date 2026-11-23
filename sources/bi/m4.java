package bi;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
import org.telegram.ui.h60;
public final class m4 implements r10 {
    public final int f3888a = 2;
    public final Object f3889b;
    public final int f3890c;
    public final Object d;
    public final Object f3891e;
    public final Object f3892f;
    public final Object f3893g;
    public final Object h;

    public m4(int i7, org.telegram.ui.Wallet.u0 u0Var, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, org.telegram.ui.Wallet.y2 y2Var) {
        this.f3890c = i7;
        this.d = u0Var;
        this.f3889b = str;
        this.f3891e = bArr;
        this.f3892f = bArr2;
        this.f3893g = sendtransfer;
        this.h = y2Var;
    }

    @Override
    public final void a(java.lang.Object r25, java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m4.a(java.lang.Object, java.lang.Object):void");
    }

    public m4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, androidx.emoji2.text.n nVar, Context context, h60 h60Var, int i7) {
        this.d = cancellationToken;
        this.f3891e = taskCompletionSource;
        this.f3892f = runnableArr;
        this.f3893g = nVar;
        this.f3889b = context;
        this.h = h60Var;
        this.f3890c = i7;
    }

    public m4(y10 y10Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar, Boolean bool, r10 r10Var) {
        this.d = y10Var;
        this.f3889b = context;
        this.f3890c = i7;
        this.f3891e = h6Var;
        this.f3892f = lcVar;
        this.f3893g = bool;
        this.h = r10Var;
    }
}
