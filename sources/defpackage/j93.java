package defpackage;
public final class j93 implements x56 {
    public final byte a = 1;
    public final icc b;

    @Override
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                icc iccVar = this.b;
                ((uj) obj).s(iccVar);
                int i = iccVar.a;
                return;
            default:
                ((mc8) obj).a(this.b);
                return;
        }
    }

    public j93(icc iccVar) {
        this.b = iccVar;
    }
}
