package ki;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.ne;
import org.telegram.messenger.x0;
public final class c implements Runnable {
    public final int f11393a;
    public final k f11394b;
    public final j f11395c;

    public c(k kVar, j jVar, int i10) {
        this.f11393a = 4;
        this.f11394b = kVar;
        this.f11395c = jVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f11393a) {
            case 0:
                k kVar = this.f11394b;
                j jVar = this.f11395c;
                kVar.f11417g.V(jVar.f11410a, jVar.f11411b);
                return;
            case 1:
                k kVar2 = this.f11394b;
                j jVar2 = this.f11395c;
                m4.c cVar = kVar2.f11417g;
                long j10 = jVar2.f11410a;
                cVar.getClass();
                return;
            case 2:
                k kVar3 = this.f11394b;
                j jVar3 = this.f11395c;
                kVar3.f11417g.V(jVar3.f11410a, jVar3.f11411b);
                return;
            case 3:
                k kVar4 = this.f11394b;
                j jVar4 = this.f11395c;
                m4.c cVar2 = kVar4.f11417g;
                long j11 = jVar4.f11410a;
                cVar2.getClass();
                return;
            default:
                k kVar5 = this.f11394b;
                j jVar5 = this.f11395c;
                m4.c cVar3 = kVar5.f11417g;
                long j12 = jVar5.f11410a;
                synchronized (((e0.h) cVar3.f12707c).f6022f) {
                    file = (File) ((HashMap) ((e0.h) cVar3.f12707c).f6023g).remove(Long.valueOf(j12));
                }
                if (file != null) {
                    ((Handler) ((e0.h) cVar3.f12707c).d).post(new x0(cVar3, j12, (ne) cVar3.f12706b, file, 0));
                    return;
                }
                return;
        }
    }

    public c(k kVar, j jVar, long j10, long j11, int i10) {
        this.f11393a = i10;
        this.f11394b = kVar;
        this.f11395c = jVar;
    }

    public c(k kVar, j jVar, Exception exc) {
        this.f11393a = 3;
        this.f11394b = kVar;
        this.f11395c = jVar;
    }
}
