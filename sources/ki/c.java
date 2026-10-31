package ki;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.me;
import org.telegram.messenger.x0;
public final class c implements Runnable {
    public final int f11392a;
    public final k f11393b;
    public final j f11394c;

    public c(k kVar, j jVar, int i10) {
        this.f11392a = 4;
        this.f11393b = kVar;
        this.f11394c = jVar;
    }

    @Override
    public final void run() {
        File file;
        switch (this.f11392a) {
            case 0:
                k kVar = this.f11393b;
                j jVar = this.f11394c;
                kVar.f11416g.V(jVar.f11409a, jVar.f11410b);
                return;
            case 1:
                k kVar2 = this.f11393b;
                j jVar2 = this.f11394c;
                m4.c cVar = kVar2.f11416g;
                long j10 = jVar2.f11409a;
                cVar.getClass();
                return;
            case 2:
                k kVar3 = this.f11393b;
                j jVar3 = this.f11394c;
                kVar3.f11416g.V(jVar3.f11409a, jVar3.f11410b);
                return;
            case 3:
                k kVar4 = this.f11393b;
                j jVar4 = this.f11394c;
                m4.c cVar2 = kVar4.f11416g;
                long j11 = jVar4.f11409a;
                cVar2.getClass();
                return;
            default:
                k kVar5 = this.f11393b;
                j jVar5 = this.f11394c;
                m4.c cVar3 = kVar5.f11416g;
                long j12 = jVar5.f11409a;
                synchronized (((e0.h) cVar3.f12706c).f6022f) {
                    file = (File) ((HashMap) ((e0.h) cVar3.f12706c).f6023g).remove(Long.valueOf(j12));
                }
                if (file != null) {
                    ((Handler) ((e0.h) cVar3.f12706c).d).post(new x0(cVar3, j12, (me) cVar3.f12705b, file, 0));
                    return;
                }
                return;
        }
    }

    public c(k kVar, j jVar, long j10, long j11, int i10) {
        this.f11392a = i10;
        this.f11393b = kVar;
        this.f11394c = jVar;
    }

    public c(k kVar, j jVar, Exception exc) {
        this.f11392a = 3;
        this.f11393b = kVar;
        this.f11394c = jVar;
    }
}
