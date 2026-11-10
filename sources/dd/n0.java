package dd;
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.G0);
        j jVar = lVar.f8662i;
        String str = jVar.f8646e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.f8646e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f8605a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f8658c = b2.Z;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f8658c = wVar;
                                        return;
                                    default:
                                        lVar.f8662i.d(d);
                                        return;
                                }
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8658c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8658c = b2.f8613e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8662i.d(d);
                return;
            }
            lVar.f8658c = b2.Y;
            return;
        }
        lVar.m(this);
        lVar.f8662i.d((char) 65533);
    }
}
