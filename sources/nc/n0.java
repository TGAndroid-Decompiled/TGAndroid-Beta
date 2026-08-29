package nc;
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.C0);
        j jVar = lVar.f17294i;
        String str = jVar.f17278e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.f17278e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f17237a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f17290c = b2.V;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f17290c = wVar;
                                        return;
                                    default:
                                        lVar.f17294i.e(d);
                                        return;
                                }
                            }
                        } else {
                            lVar.l(this);
                            lVar.f17290c = wVar;
                            return;
                        }
                    } else {
                        lVar.f17290c = b2.f17238a0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f17294i.e(d);
                return;
            }
            lVar.f17290c = b2.U;
            return;
        }
        lVar.m(this);
        lVar.f17294i.e((char) 65533);
    }
}
