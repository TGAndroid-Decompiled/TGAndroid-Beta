package defpackage;
public final class va3 implements x76 {
    public final byte a = 1;
    public final jec b;

    @Override
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                jec jecVar = this.b;
                ((uk) obj).n(jecVar);
                int i = jecVar.a;
                return;
            default:
                ((pe8) obj).a(this.b);
                return;
        }
    }

    public va3(jec jecVar) {
        this.b = jecVar;
    }
}
