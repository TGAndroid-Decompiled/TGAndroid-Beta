package fd;
public enum g1 extends a2 {
    public g1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f10574m;
        if (aVar.o()) {
            fVar.f10556c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                v vVar = a2.f10519a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f10556c.append(d);
                            return;
                        }
                    } else {
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f10567c = vVar;
                        return;
                    }
                } else {
                    kVar.j();
                    kVar.f10567c = vVar;
                    return;
                }
            }
            kVar.f10567c = a2.f10539q0;
            return;
        }
        kVar.m(this);
        fVar.f10556c.append((char) 65533);
    }
}
