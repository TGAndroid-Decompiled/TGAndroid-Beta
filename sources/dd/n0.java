package dd;
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.H0);
        j jVar = lVar.f8049i;
        String str = jVar.f8033e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.f8033e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f7992a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f8045c = b2.f7993a0;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f8045c = wVar;
                                        return;
                                    default:
                                        lVar.f8049i.d(d);
                                        return;
                                }
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8045c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8045c = b2.f8002f0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8049i.d(d);
                return;
            }
            lVar.f8045c = b2.Z;
            return;
        }
        lVar.m(this);
        lVar.f8049i.d((char) 65533);
    }
}
