package g5;

import android.os.Handler;
import android.os.Message;
import f5.d0;
public final class i implements Handler.Callback {
    public final Handler f7046a;
    public final j f7047b;

    public i(j jVar, a4.n nVar) {
        this.f7047b = jVar;
        Handler k9 = d0.k(this);
        this.f7046a = k9;
        nVar.a(this, k9);
    }

    public final void a(long j10) {
        j jVar = this.f7047b;
        if (this == jVar.l1 && jVar.I != null) {
            if (j10 == Long.MAX_VALUE) {
                jVar.f145x0 = true;
                return;
            }
            try {
                jVar.P(j10);
                jVar.X();
                jVar.f148z0.f16820e++;
                jVar.W();
                jVar.z(j10);
            } catch (j3.n e10) {
                jVar.f147y0 = e10;
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
        int i12 = d0.f6579a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
