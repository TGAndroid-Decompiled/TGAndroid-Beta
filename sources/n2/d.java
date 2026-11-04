package n2;

import a3.r;
import java.io.IOException;
public final class d implements r {
    public final h f20147a;

    @Override
    public void a() {
        h hVar = this.f20147a;
        hVar.A.a();
        IOException iOException = hVar.C;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    public void b() {
        long j10;
        h hVar = this.f20147a;
        synchronized (b3.b.f2346b) {
            try {
                if (b3.b.f2347c) {
                    j10 = b3.b.d;
                } else {
                    j10 = -9223372036854775807L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        hVar.K = j10;
        hVar.z(true);
    }
}
