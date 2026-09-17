package dd;
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.G0);
        j jVar = lVar.f7702i;
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
                        w wVar = b2.f7649a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f7699c = b2.Z;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f7699c = wVar;
                                        return;
                                    default:
                                        lVar.f7702i.d(d);
                                        return;
                                }
                            }
                        } else {
                            lVar.l(this);
                            lVar.f7699c = wVar;
                            return;
                        }
                    } else {
                        lVar.f7699c = b2.f7656e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f7702i.d(d);
                return;
            }
            lVar.f7699c = b2.Y;
            return;
        }
        lVar.m(this);
        lVar.f7702i.d((char) 65533);
    }
}
