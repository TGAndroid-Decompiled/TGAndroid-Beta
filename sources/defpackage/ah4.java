package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class ah4 implements i8c {
    public final byte a = 1;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public ah4(int i, c cVar, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, j35 j35Var) {
        this.b = i;
        this.c = cVar;
        this.d = str;
        this.e = bArr;
        this.f = bArr2;
        this.g = sendtransfer;
        this.h = j35Var;
    }

    @Override
    public final void a(java.lang.Object r28, java.lang.Object r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah4.a(java.lang.Object, java.lang.Object):void");
    }

    public ah4(p8c p8cVar, Context context, int i, wjb wjbVar, u21 u21Var, Boolean bool, i8c i8cVar) {
        this.c = p8cVar;
        this.g = context;
        this.b = i;
        this.d = wjbVar;
        this.e = u21Var;
        this.f = bool;
        this.h = i8cVar;
    }

    public ah4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, p13 p13Var, Context context, kz5 kz5Var, int i) {
        this.c = cancellationToken;
        this.d = taskCompletionSource;
        this.e = runnableArr;
        this.f = p13Var;
        this.g = context;
        this.h = kz5Var;
        this.b = i;
    }
}
