package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w87 implements Runnable {
    public final byte a = 0;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    public final boolean f;
    public final Object h;
    public final Object n;
    public final Object r;

    public w87(na7 na7Var, long j, int i, int i2, long j2, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z, vm1 vm1Var) {
        this.h = na7Var;
        this.c = j;
        this.b = i;
        this.e = i2;
        this.d = j2;
        this.n = tL_messages_affectedHistory;
        this.f = z;
        this.r = vm1Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w87.run():void");
    }

    public w87(TLObject tLObject, int i, long j, long j2, int i2, boolean z, Context context, String str) {
        this.h = tLObject;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = i2;
        this.f = z;
        this.n = context;
        this.r = str;
    }
}
