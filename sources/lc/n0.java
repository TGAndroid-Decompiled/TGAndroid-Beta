package lc;
public enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String h = aVar.h(b2.C0);
        j jVar = lVar.f16827i;
        String str = jVar.f16811e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.f16811e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        w wVar = b2.f16770a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar.f16823c = b2.V;
                                        return;
                                    case '>':
                                        lVar.k();
                                        lVar.f16823c = wVar;
                                        return;
                                    default:
                                        lVar.f16827i.e(d);
                                        return;
                                }
                            }
                        } else {
                            lVar.l(this);
                            lVar.f16823c = wVar;
                            return;
                        }
                    } else {
                        lVar.f16823c = b2.f16771a0;
                        return;
                    }
                }
                lVar.m(this);
                lVar.f16827i.e(d);
                return;
            }
            lVar.f16823c = b2.U;
            return;
        }
        lVar.m(this);
        lVar.f16827i.e((char) 65533);
    }
}
