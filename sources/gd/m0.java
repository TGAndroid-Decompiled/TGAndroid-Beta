package gd;
public enum m0 extends a2 {
    public m0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String h = aVar.h(a2.G0);
        j jVar = kVar.f12461i;
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
                        v vVar = a2.f12410a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        kVar.f12458c = a2.Z;
                                        return;
                                    case '>':
                                        kVar.k();
                                        kVar.f12458c = vVar;
                                        return;
                                    default:
                                        kVar.f12461i.d(d);
                                        return;
                                }
                            }
                        } else {
                            kVar.l(this);
                            kVar.f12458c = vVar;
                            return;
                        }
                    } else {
                        kVar.f12458c = a2.f12417e0;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f12461i.d(d);
                return;
            }
            kVar.f12458c = a2.Y;
            return;
        }
        kVar.m(this);
        kVar.f12461i.d((char) 65533);
    }
}
