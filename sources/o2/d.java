package o2;

import java.io.IOException;
public final class d implements b3.p {
    public final h f20728a;

    @Override
    public void a() {
        h hVar = this.f20728a;
        hVar.A.a();
        IOException iOException = hVar.C;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    public void b() {
        long j3;
        h hVar = this.f20728a;
        synchronized (c3.b.f5263b) {
            try {
                if (c3.b.f5264c) {
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
