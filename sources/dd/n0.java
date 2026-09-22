package dd;
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.G0);
        j jVar = lVar.f7699i;
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
                        w wVar = b2.f7646a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f7696c = b2.Z;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f7696c = wVar;
                                        return;
                                    default:
                                        lVar.f7699i.d(d);
                                        return;
                                }
                            }
                        } else {
                            lVar.l(this);
                            lVar.f7696c = wVar;
                            return;
                        }
                    } else {
                        lVar.f7696c = b2.f7653e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f7699i.d(d);
                return;
            }
            lVar.f7696c = b2.Y;
            return;
        }
        lVar.m(this);
        lVar.f7699i.d((char) 65533);
    }
}
