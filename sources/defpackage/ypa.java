package defpackage;
public final class ypa implements ee {
    public final byte a;
    public final wsa b;

    public ypa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                wsaVar.X1();
                return;
            case 1:
                goc.M0(wsaVar.a, wsaVar.J0, wsaVar.getContext());
                return;
            default:
                wsaVar.X1();
                return;
        }
    }
}
