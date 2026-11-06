package org.telegram.messenger;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.zc0;
public final class f9 implements v10 {
    public final int f22358a = 1;
    public final int f22359b;
    public final Object f22360c;
    public final Object d;
    public final Object f22361e;
    public final Object f22362f;
    public final Object f22363g;
    public final Object h;

    public f9(int i7, org.telegram.ui.Wallet.n0 n0Var, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, org.telegram.ui.Wallet.u2 u2Var) {
        this.f22359b = i7;
        this.f22360c = n0Var;
        this.d = str;
        this.f22361e = bArr;
        this.f22362f = bArr2;
        this.f22363g = sendtransfer;
        this.h = u2Var;
    }

    @Override
    public final void a(java.lang.Object r24, java.lang.Object r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.f9.a(java.lang.Object, java.lang.Object):void");
    }

    public f9(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, k0.b bVar, Context context, zc0 zc0Var, int i7) {
        this.f22360c = cancellationToken;
        this.d = taskCompletionSource;
        this.f22361e = runnableArr;
        this.f22362f = bVar;
        this.f22363g = context;
        this.h = zc0Var;
        this.f22359b = i7;
    }
}
