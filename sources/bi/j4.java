package bi;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
import org.telegram.ui.n60;
public final class j4 implements q10 {
    public final int f3767a = 2;
    public final Object f3768b;
    public final int f3769c;
    public final Object d;
    public final Object f3770e;
    public final Object f3771f;
    public final Object f3772g;
    public final Object h;

    public j4(int i7, org.telegram.ui.Wallet.u0 u0Var, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, org.telegram.ui.Wallet.y2 y2Var) {
        this.f3769c = i7;
        this.d = u0Var;
        this.f3768b = str;
        this.f3770e = bArr;
        this.f3771f = bArr2;
        this.f3772g = sendtransfer;
        this.h = y2Var;
    }

    @Override
    public final void a(java.lang.Object r25, java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: bi.j4.a(java.lang.Object, java.lang.Object):void");
    }

    public j4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, androidx.emoji2.text.n nVar, Context context, n60 n60Var, int i7) {
        this.d = cancellationToken;
        this.f3770e = taskCompletionSource;
        this.f3771f = runnableArr;
        this.f3772g = nVar;
        this.f3768b = context;
        this.h = n60Var;
        this.f3769c = i7;
    }

    public j4(x10 x10Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, lc lcVar, Boolean bool, q10 q10Var) {
        this.d = x10Var;
        this.f3768b = context;
        this.f3769c = i7;
        this.f3770e = i6Var;
        this.f3771f = lcVar;
        this.f3772g = bool;
        this.h = q10Var;
    }
}
