package bi;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
import org.telegram.ui.h60;
public final class m4 implements q10 {
    public final int f3874a = 2;
    public final Object f3875b;
    public final int f3876c;
    public final Object d;
    public final Object f3877e;
    public final Object f3878f;
    public final Object f3879g;
    public final Object h;

    public m4(int i7, org.telegram.ui.Wallet.u0 u0Var, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, org.telegram.ui.Wallet.y2 y2Var) {
        this.f3876c = i7;
        this.d = u0Var;
        this.f3875b = str;
        this.f3877e = bArr;
        this.f3878f = bArr2;
        this.f3879g = sendtransfer;
        this.h = y2Var;
    }

    @Override
    public final void a(java.lang.Object r25, java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m4.a(java.lang.Object, java.lang.Object):void");
    }

    public m4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, androidx.emoji2.text.n nVar, Context context, h60 h60Var, int i7) {
        this.d = cancellationToken;
        this.f3877e = taskCompletionSource;
        this.f3878f = runnableArr;
        this.f3879g = nVar;
        this.f3875b = context;
        this.h = h60Var;
        this.f3876c = i7;
    }

    public m4(x10 x10Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar, Boolean bool, q10 q10Var) {
        this.d = x10Var;
        this.f3875b = context;
        this.f3876c = i7;
        this.f3877e = h6Var;
        this.f3878f = lcVar;
        this.f3879g = bool;
        this.h = q10Var;
    }
}
