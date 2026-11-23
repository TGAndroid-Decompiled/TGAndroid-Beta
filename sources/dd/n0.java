package dd;
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.H0);
        j jVar = lVar.f8323i;
        String str = jVar.f8307e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.f8307e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f8266a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f8319c = b2.f8267a0;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f8319c = wVar;
                                        return;
                                    default:
                                        lVar.f8323i.d(d);
                                        return;
                                }
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8319c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8319c = b2.f8276f0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8323i.d(d);
                return;
            }
            lVar.f8319c = b2.Z;
            return;
        }
        lVar.m(this);
        lVar.f8323i.d((char) 65533);
    }
}
