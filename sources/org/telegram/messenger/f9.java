package org.telegram.messenger;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.zc0;
public final class f9 implements v10 {
    public final int f22365a = 1;
    public final int f22366b;
    public final Object f22367c;
    public final Object d;
    public final Object f22368e;
    public final Object f22369f;
    public final Object f22370g;
    public final Object h;

    public f9(int i7, org.telegram.ui.Wallet.n0 n0Var, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, org.telegram.ui.Wallet.u2 u2Var) {
        this.f22366b = i7;
        this.f22367c = n0Var;
        this.d = str;
        this.f22368e = bArr;
        this.f22369f = bArr2;
        this.f22370g = sendtransfer;
        this.h = u2Var;
    }

    @Override
    public final void a(java.lang.Object r24, java.lang.Object r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.f9.a(java.lang.Object, java.lang.Object):void");
    }

    public f9(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, k0.b bVar, Context context, zc0 zc0Var, int i7) {
        this.f22367c = cancellationToken;
        this.d = taskCompletionSource;
        this.f22368e = runnableArr;
        this.f22369f = bVar;
        this.f22370g = context;
        this.h = zc0Var;
        this.f22366b = i7;
    }
}
