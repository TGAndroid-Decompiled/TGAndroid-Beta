package e5;

import android.os.Handler;
import android.os.Message;
import d5.g0;

public final class h implements Handler.Callback {

    public final Handler f5248a;

    public final i f5249b;

    public h(i iVar, y3.k kVar) {
        this.f5249b = iVar;
        Handler handlerK = g0.k(this);
        this.f5248a = handlerK;
        kVar.h(this, handlerK);
    }

    public final void a(long j10) {
        i iVar = this.f5249b;
        if (this != iVar.l1 || iVar.I == null) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            iVar.f49536x0 = true;
            return;
        }
        try {
            iVar.P(j10);
            iVar.X();
            iVar.f49539z0.f14421e++;
            iVar.W();
            iVar.z(j10);
        } catch (h3.n e9) {
            iVar.f49538y0 = e9;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        int i12 = g0.f4795a;
        a(((((long) i10) & 4294967295L) << 32) | (4294967295L & ((long) i11)));
        return true;
    }
}
