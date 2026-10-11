package ed;
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.G0);
        j jVar = lVar.f8889i;
        String str = jVar.f8873e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.f8873e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f8832a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f8885c = b2.Z;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f8885c = wVar;
                                        return;
                                    default:
                                        lVar.f8889i.d(d);
                                        return;
                                }
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8885c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8885c = b2.f8840e0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8889i.d(d);
                return;
            }
            lVar.f8885c = b2.Y;
            return;
        }
        lVar.m(this);
        lVar.f8889i.d((char) 65533);
    }
}
