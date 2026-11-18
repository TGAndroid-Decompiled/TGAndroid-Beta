package dd;
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.H0);
        j jVar = lVar.f8328i;
        String str = jVar.f8312e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.f8312e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f8271a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f8324c = b2.f8272a0;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f8324c = wVar;
                                        return;
                                    default:
                                        lVar.f8328i.d(d);
                                        return;
                                }
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8324c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8324c = b2.f8281f0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8328i.d(d);
                return;
            }
            lVar.f8324c = b2.Z;
            return;
        }
        lVar.m(this);
        lVar.f8328i.d((char) 65533);
    }
}
