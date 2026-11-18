package dd;
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.H0);
        j jVar = lVar.f8331i;
        String str = jVar.f8315e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.f8315e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f8274a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f8327c = b2.f8275a0;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f8327c = wVar;
                                        return;
                                    default:
                                        lVar.f8331i.d(d);
                                        return;
                                }
                            }
                        } else {
                            lVar.l(this);
                            lVar.f8327c = wVar;
                            return;
                        }
                    } else {
                        lVar.f8327c = b2.f8284f0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f8331i.d(d);
                return;
            }
            lVar.f8327c = b2.Z;
            return;
        }
        lVar.m(this);
        lVar.f8331i.d((char) 65533);
    }
}
