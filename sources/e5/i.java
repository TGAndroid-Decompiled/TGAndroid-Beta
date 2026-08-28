package e5;

import android.os.Handler;
import android.os.Message;
import d5.f0;
public final class i implements Handler.Callback {
    public final Handler f4891a;
    public final j f4892b;

    public i(j jVar, y3.k kVar) {
        this.f4892b = jVar;
        Handler k10 = f0.k(this);
        this.f4891a = k10;
        kVar.h(this, k10);
    }

    public final void a(long j10) {
        j jVar = this.f4892b;
        if (this == jVar.l1 && jVar.I != null) {
            if (j10 == Long.MAX_VALUE) {
                jVar.f49546x0 = true;
                return;
            }
            try {
                jVar.P(j10);
                jVar.X();
                jVar.f49549z0.f14600e++;
                jVar.W();
                jVar.z(j10);
            } catch (h3.n e10) {
                jVar.f49548y0 = e10;
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i9 = message.arg1;
        int i10 = message.arg2;
        int i11 = f0.f4349a;
        a(((i9 & 4294967295L) << 32) | (4294967295L & i10));
        return true;
    }
}
