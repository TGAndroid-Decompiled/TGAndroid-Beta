package i5;

import android.os.Handler;
import android.os.Message;
import h5.d0;
public final class i implements Handler.Callback {
    public final Handler f7278a;
    public final j f7279b;

    public i(j jVar, d4.k kVar) {
        this.f7279b = jVar;
        Handler l10 = d0.l(this);
        this.f7278a = l10;
        kVar.e(this, l10);
    }

    public final void a(long j10) {
        j jVar = this.f7279b;
        if (this == jVar.f7303x1 && jVar.V != null) {
            if (j10 == Long.MAX_VALUE) {
                jVar.K0 = true;
                return;
            }
            try {
                jVar.p0(j10);
                jVar.x0(jVar.f7299t1);
                jVar.M0.e++;
                jVar.w0();
                jVar.X(j10);
            } catch (j3.n e) {
                jVar.L0 = e;
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
        int i12 = d0.f6937a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
