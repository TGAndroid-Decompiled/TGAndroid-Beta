package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class cj4 implements jac {
    public final byte a = 1;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public cj4(int i, c cVar, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, j55 j55Var) {
        this.b = i;
        this.c = cVar;
        this.d = str;
        this.e = bArr;
        this.f = bArr2;
        this.g = sendtransfer;
        this.h = j55Var;
    }

    @Override
    public final void a(java.lang.Object r28, java.lang.Object r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj4.a(java.lang.Object, java.lang.Object):void");
    }

    public cj4(qac qacVar, Context context, int i, ylb ylbVar, c41 c41Var, Boolean bool, jac jacVar) {
        this.c = qacVar;
        this.g = context;
        this.b = i;
        this.d = ylbVar;
        this.e = c41Var;
        this.f = bool;
        this.h = jacVar;
    }

    public cj4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, uk0 uk0Var, Context context, k16 k16Var, int i) {
        this.c = cancellationToken;
        this.d = taskCompletionSource;
        this.e = runnableArr;
        this.f = uk0Var;
        this.g = context;
        this.h = k16Var;
        this.b = i;
    }
}
