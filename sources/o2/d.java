package o2;

import b3.q;
import java.io.IOException;
public final class d implements q {
    public final h f21641a;

    @Override
    public void a() {
        h hVar = this.f21641a;
        hVar.A.a();
        IOException iOException = hVar.C;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    public void b() {
        long j3;
        h hVar = this.f21641a;
        synchronized (c3.b.f4398b) {
            try {
                if (c3.b.f4399c) {
                    j3 = c3.b.d;
                } else {
                    j3 = -9223372036854775807L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        hVar.K = j3;
        hVar.z(true);
    }
}
