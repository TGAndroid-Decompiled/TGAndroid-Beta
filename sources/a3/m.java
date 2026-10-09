package a3;

import android.os.Handler;
import android.os.Message;
public final class m implements Handler.Callback {
    public final Handler f158a;
    public final n f159b;

    public m(n nVar, r2.m mVar) {
        this.f159b = nVar;
        Handler o9 = e2.d0.o(this);
        this.f158a = o9;
        mVar.d(this, o9);
    }

    public final void a(long j3) {
        n nVar = this.f159b;
        if (this == nVar.G1 && nVar.f46912b0 != null) {
            if (j3 == Long.MAX_VALUE) {
                nVar.L0 = true;
                return;
            }
            try {
                nVar.H0(j3);
            } catch (i2.n e7) {
                nVar.M0 = e7;
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        String str = e2.d0.f8532a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
