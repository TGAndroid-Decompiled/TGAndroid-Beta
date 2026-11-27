package defpackage;
public final class ca3 implements b86 {
    public final byte a = 1;
    public final ggc b;

    @Override
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ggc ggcVar = this.b;
                ((vj) obj).s(ggcVar);
                int i = ggcVar.a;
                return;
            default:
                ((bg8) obj).a(this.b);
                return;
        }
    }

    public ca3(ggc ggcVar) {
        this.b = ggcVar;
    }
}
