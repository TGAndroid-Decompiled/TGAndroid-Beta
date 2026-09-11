package dd;
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.G0);
        j jVar = lVar.f6782i;
        String str = jVar.f6767e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.f6767e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f6726a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f6778c = b2.Z;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f6778c = wVar;
                                        return;
                                    default:
                                        lVar.f6782i.i(d);
                                        return;
                                }
                            }
                        } else {
                            lVar.l(this);
                            lVar.f6778c = wVar;
                            return;
                        }
                    } else {
                        lVar.f6778c = b2.f6734e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f6782i.i(d);
                return;
            }
            lVar.f6778c = b2.Y;
            return;
        }
        lVar.m(this);
        lVar.f6782i.i((char) 65533);
    }
}
