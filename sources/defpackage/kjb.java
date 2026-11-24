package defpackage;
public final class kjb implements p8c {
    public final byte a;
    public final boolean b;
    public final String c;

    public kjb(boolean z, String str, byte b) {
        this.a = b;
        this.b = z;
        this.c = str;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        vjb vjbVar = null;
        zjb zjbVar = null;
        String str = this.c;
        boolean z = this.b;
        mqc mqcVar = (mqc) obj;
        switch (b) {
            case 0:
                if (mqcVar != null && z && bkb.Cm.add(str)) {
                    akb akbVar = bkb.I;
                    if (akbVar != null) {
                        vjbVar = akbVar.j0;
                    }
                    if (vjbVar != null && str.equals(vjbVar.c)) {
                        bkb.s1(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (mqcVar != null && z && bkb.Cm.add(str)) {
                    akb akbVar2 = bkb.I;
                    if (akbVar2 != null) {
                        zjbVar = akbVar2.i(false);
                    }
                    if (zjbVar != null && str.equals(zjbVar.o)) {
                        bkb.s1(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
