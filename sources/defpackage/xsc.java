package defpackage;
public final class xsc implements Runnable {
    public final byte a = 0;
    public final zsc b;
    public final ysc c;
    public final osc d;

    public xsc(zsc zscVar, osc oscVar, ysc yscVar) {
        this.b = zscVar;
        this.d = oscVar;
        this.c = yscVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        osc oscVar = this.d;
        ysc yscVar = this.c;
        zsc zscVar = this.b;
        switch (b) {
            case 0:
                if (oscVar != null) {
                    zscVar.a(yscVar, oscVar);
                    return;
                } else if (yscVar.e != null) {
                    zscVar.c(yscVar);
                    return;
                } else {
                    zscVar.e(yscVar);
                    return;
                }
            default:
                zscVar.a(yscVar, oscVar);
                return;
        }
    }

    public xsc(zsc zscVar, ysc yscVar, osc oscVar) {
        this.b = zscVar;
        this.c = yscVar;
        this.d = oscVar;
    }
}
