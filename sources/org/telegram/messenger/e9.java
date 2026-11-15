package org.telegram.messenger;

import android.content.Context;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.jd0;
public final class e9 implements s10 {
    public final int f23282a = 1;
    public final int f23283b;
    public final Object f23284c;
    public final Object d;
    public final Object f23285e;
    public final Object f23286f;
    public final Object f23287g;
    public final Object h;

    public e9(int i7, org.telegram.ui.Wallet.l0 l0Var, String str, byte[] bArr, byte[] bArr2, TL_wallet.sendTransfer sendtransfer, org.telegram.ui.Wallet.r2 r2Var) {
        this.f23283b = i7;
        this.f23284c = l0Var;
        this.d = str;
        this.f23285e = bArr;
        this.f23286f = bArr2;
        this.f23287g = sendtransfer;
        this.h = r2Var;
    }

    @Override
    public final void a(java.lang.Object r24, java.lang.Object r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.e9.a(java.lang.Object, java.lang.Object):void");
    }

    public e9(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Runnable[] runnableArr, androidx.emoji2.text.n nVar, Context context, jd0 jd0Var, int i7) {
        this.f23284c = cancellationToken;
        this.d = taskCompletionSource;
        this.f23285e = runnableArr;
        this.f23286f = nVar;
        this.f23287g = context;
        this.h = jd0Var;
        this.f23283b = i7;
    }
}
