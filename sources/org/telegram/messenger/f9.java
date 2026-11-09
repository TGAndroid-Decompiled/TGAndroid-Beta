package org.telegram.messenger;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.bd0;
public final class f9 implements v10 {
    public final int f22384a = 1;
    public final int f22385b;
    public final Object f22386c;
    public final Object d;
    public final Object f22387e;
    public final Object f22388f;
    public final Object f22389g;
    public final Object h;

    public f9(int i7, org.telegram.ui.Wallet.l0 l0Var, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, org.telegram.ui.Wallet.s2 s2Var) {
        this.f22385b = i7;
        this.f22386c = l0Var;
        this.d = str;
        this.f22387e = bArr;
        this.f22388f = bArr2;
        this.f22389g = sendtransfer;
        this.h = s2Var;
    }

    @Override
    public final void a(java.lang.Object r24, java.lang.Object r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.f9.a(java.lang.Object, java.lang.Object):void");
    }

    public f9(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, k0.b bVar, Context context, bd0 bd0Var, int i7) {
        this.f22386c = cancellationToken;
        this.d = taskCompletionSource;
        this.f22387e = runnableArr;
        this.f22388f = bVar;
        this.f22389g = context;
        this.h = bd0Var;
        this.f22385b = i7;
    }
}
