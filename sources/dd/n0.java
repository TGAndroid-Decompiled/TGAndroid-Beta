package dd;
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.G0);
        j jVar = lVar.f8657i;
        String str = jVar.f8641e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.f8641e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f8600a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f8653c = b2.Z;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f8653c = wVar;
                                        return;
                                    default:
                                        lVar.f8657i.d(d);
                                        return;
                                }
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8653c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8653c = b2.f8608e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8657i.d(d);
                return;
            }
            lVar.f8653c = b2.Y;
            return;
        }
        lVar.m(this);
        lVar.f8657i.d((char) 65533);
    }
}
