package defpackage;
public final class btc implements pcc {
    public final byte a;
    public final gtc b;

    public btc(gtc gtcVar, byte b) {
        this.a = b;
        this.b = gtcVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        gtc gtcVar = this.b;
        switch (b) {
            case 0:
                gtcVar.g0((pcc) obj);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    d31.b0(gtcVar).f0(str, false);
                    return;
                }
                v21 I = d31.b0(gtcVar).I(2131623990, ob6.M0(2131742839, null), ob6.M0(2131742837, null));
                I.j = 5000;
                I.j();
                gtcVar.a.g3.O(true);
                return;
            default:
                gtcVar.d0((Boolean) obj);
                return;
        }
    }
}
