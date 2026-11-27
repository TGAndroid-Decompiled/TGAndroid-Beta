package defpackage;
public enum kvb extends rwb {
    public kvb() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        cvb cvbVar = rwb.X;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                mub mubVar = rwb.a;
                if (d != '>') {
                    if (d != 65535) {
                        bubVar.m(this);
                        ik1Var.q();
                        bubVar.c = cvbVar;
                        return;
                    }
                    bubVar.l(this);
                    bubVar.c = mubVar;
                    return;
                }
                bubVar.k();
                bubVar.c = mubVar;
                return;
            }
            bubVar.c = rwb.f0;
            return;
        }
        bubVar.c = cvbVar;
    }
}
