package org.telegram.messenger;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.tc0;
public final class f9 implements v10 {
    public final int f22388a = 1;
    public final int f22389b;
    public final Object f22390c;
    public final Object d;
    public final Object f22391e;
    public final Object f22392f;
    public final Object f22393g;
    public final Object h;

    public f9(int i7, org.telegram.ui.Wallet.l0 l0Var, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, org.telegram.ui.Wallet.s2 s2Var) {
        this.f22389b = i7;
        this.f22390c = l0Var;
        this.d = str;
        this.f22391e = bArr;
        this.f22392f = bArr2;
        this.f22393g = sendtransfer;
        this.h = s2Var;
    }

    @Override
    public final void a(java.lang.Object r24, java.lang.Object r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.f9.a(java.lang.Object, java.lang.Object):void");
    }

    public f9(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, k0.b bVar, Context context, tc0 tc0Var, int i7) {
        this.f22390c = cancellationToken;
        this.d = taskCompletionSource;
        this.f22391e = runnableArr;
        this.f22392f = bVar;
        this.f22393g = context;
        this.h = tc0Var;
        this.f22389b = i7;
    }
}
