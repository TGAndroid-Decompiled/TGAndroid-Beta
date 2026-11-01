package hh;

import ag.l;
import java.io.Serializable;
import org.telegram.messenger.i0;
public final class c {
    public long f7688a;
    public Object f7689b;
    public Serializable f7690c;
    public Object d;

    public void a(b bVar, boolean z10) {
        gg.c cVar = (gg.c) this.d;
        if (((b) this.f7690c) != bVar) {
            i0.r(cVar);
            this.f7690c = bVar;
            if (z10) {
                ((l) this.f7689b).a(bVar);
            }
            if (bVar == b.f7686b || bVar == b.f7687c) {
                i0.h3(cVar, this.f7688a);
            }
        }
    }
}
