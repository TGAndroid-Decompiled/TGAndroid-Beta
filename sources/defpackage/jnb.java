package defpackage;
public final class jnb implements pcc {
    public final byte a;
    public final boolean b;
    public final String c;

    public jnb(boolean z, String str, byte b) {
        this.a = b;
        this.b = z;
        this.c = str;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        ynb ynbVar = null;
        unb unbVar = null;
        String str = this.c;
        boolean z = this.b;
        avc avcVar = (avc) obj;
        switch (b) {
            case 0:
                if (avcVar != null && z && aob.Dm.add(str)) {
                    znb znbVar = aob.I;
                    if (znbVar != null) {
                        ynbVar = znbVar.i(false);
                    }
                    if (ynbVar != null && str.equals(ynbVar.o)) {
                        aob.s1(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (avcVar != null && z && aob.Dm.add(str)) {
                    znb znbVar2 = aob.I;
                    if (znbVar2 != null) {
                        unbVar = znbVar2.j0;
                    }
                    if (unbVar != null && str.equals(unbVar.c)) {
                        aob.s1(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
