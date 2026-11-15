package dd;
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.H0);
        j jVar = lVar.f8046i;
        String str = jVar.f8030e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.f8030e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f7989a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f8042c = b2.f7990a0;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f8042c = wVar;
                                        return;
                                    default:
                                        lVar.f8046i.d(d);
                                        return;
                                }
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8042c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8042c = b2.f7999f0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8046i.d(d);
                return;
            }
            lVar.f8042c = b2.Z;
            return;
        }
        lVar.m(this);
        lVar.f8046i.d((char) 65533);
    }
}
