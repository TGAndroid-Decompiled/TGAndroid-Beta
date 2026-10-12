package fd;
public enum m0 extends a2 {
    public m0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String h = aVar.h(a2.G0);
        j jVar = kVar.f9127i;
        String str = jVar.e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        v vVar = a2.f9076a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        kVar.f9124c = a2.Z;
                                        return;
                                    case '>':
                                        kVar.k();
                                        kVar.f9124c = vVar;
                                        return;
                                    default:
                                        kVar.f9127i.d(d);
                                        return;
                                }
                            }
                        } else {
                            kVar.l(this);
                            kVar.f9124c = vVar;
                            return;
                        }
                    } else {
                        kVar.f9124c = a2.f9083e0;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f9127i.d(d);
                return;
            }
            kVar.f9124c = a2.Y;
            return;
        }
        kVar.m(this);
        kVar.f9127i.d((char) 65533);
    }
}
