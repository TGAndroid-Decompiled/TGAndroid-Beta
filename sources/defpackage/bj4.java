package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class bj4 implements icc {
    public final byte a = 1;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public bj4(int i, c cVar, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, n55 n55Var) {
        this.b = i;
        this.c = cVar;
        this.d = str;
        this.e = bArr;
        this.f = bArr2;
        this.g = sendtransfer;
        this.h = n55Var;
    }

    @Override
    public final void a(java.lang.Object r28, java.lang.Object r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj4.a(java.lang.Object, java.lang.Object):void");
    }

    public bj4(pcc pccVar, Context context, int i, vnb vnbVar, d31 d31Var, Boolean bool, icc iccVar) {
        this.c = pccVar;
        this.g = context;
        this.b = i;
        this.d = vnbVar;
        this.e = d31Var;
        this.f = bool;
        this.h = iccVar;
    }

    public bj4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, vj0 vj0Var, Context context, z56 z56Var, int i) {
        this.c = cancellationToken;
        this.d = taskCompletionSource;
        this.e = runnableArr;
        this.f = vj0Var;
        this.g = context;
        this.h = z56Var;
        this.b = i;
    }
}
