package hh;

import ag.l;
import java.io.Serializable;
import org.telegram.messenger.i0;
public final class c {
    public long f7687a;
    public Object f7688b;
    public Serializable f7689c;
    public Object d;

    public void a(b bVar, boolean z10) {
        gg.c cVar = (gg.c) this.d;
        if (((b) this.f7689c) != bVar) {
            i0.r(cVar);
            this.f7689c = bVar;
            if (z10) {
                ((l) this.f7688b).a(bVar);
            }
            if (bVar == b.f7685b || bVar == b.f7686c) {
                i0.h3(cVar, this.f7687a);
            }
        }
    }
}
