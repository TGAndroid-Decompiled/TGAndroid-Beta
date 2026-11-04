package ad;
public enum b1 extends c2 {
    public b1() {
        super("Comment", 46);
    }

    @Override
    public final void d(m mVar, a aVar) {
        f fVar = mVar.f379n;
        char i3 = aVar.i();
        if (i3 != 0) {
            if (i3 != '-') {
                if (i3 != 65535) {
                    fVar.f354c.append(aVar.g('-', 0));
                    return;
                }
                mVar.l(this);
                mVar.i();
                mVar.f370c = c2.f317a;
                return;
            }
            mVar.a(c2.f333l0);
            return;
        }
        mVar.m(this);
        aVar.a();
        fVar.f354c.append((char) 65533);
    }
}
