package defpackage;
public final class llb implements qac {
    public final byte a;
    public final boolean b;
    public final String c;

    public llb(boolean z, String str, byte b) {
        this.a = b;
        this.b = z;
        this.c = str;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        xlb xlbVar = null;
        amb ambVar = null;
        String str = this.c;
        boolean z = this.b;
        osc oscVar = (osc) obj;
        switch (b) {
            case 0:
                if (oscVar != null && z && cmb.Cm.add(str)) {
                    bmb bmbVar = cmb.I;
                    if (bmbVar != null) {
                        xlbVar = bmbVar.j0;
                    }
                    if (xlbVar != null && str.equals(xlbVar.c)) {
                        cmb.s1(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (oscVar != null && z && cmb.Cm.add(str)) {
                    bmb bmbVar2 = cmb.I;
                    if (bmbVar2 != null) {
                        ambVar = bmbVar2.i(false);
                    }
                    if (ambVar != null && str.equals(ambVar.o)) {
                        cmb.s1(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
