package defpackage;
public final class qqc implements qac {
    public final byte a;
    public final vqc b;

    public qqc(vqc vqcVar, byte b) {
        this.a = b;
        this.b = vqcVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        vqc vqcVar = this.b;
        switch (b) {
            case 0:
                vqcVar.h0((qac) obj);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    c41.b0(vqcVar).f0(str, false);
                    return;
                }
                u31 I = c41.b0(vqcVar).I(2131623990, jb6.M0(2131742871, null), jb6.M0(2131742869, null));
                I.j = 5000;
                I.j();
                vqcVar.a.g3.O(true);
                return;
            default:
                vqcVar.e0((Boolean) obj);
                return;
        }
    }
}
