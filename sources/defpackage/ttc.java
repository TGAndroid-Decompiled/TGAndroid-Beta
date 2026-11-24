package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public final class ttc implements Runnable {
    public final byte a;
    public final wtc b;
    public final vtc c;

    public ttc(wtc wtcVar, vtc vtcVar, byte b) {
        this.a = b;
        this.b = wtcVar;
        this.c = vtcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vtc vtcVar = this.c;
        wtc wtcVar = this.b;
        switch (b) {
            case 0:
                if (((vtc) wtcVar.b) == vtcVar) {
                    wtcVar.c = null;
                    wtcVar.i(vtcVar);
                    return;
                }
                return;
            case 1:
                if (((vtc) wtcVar.b) == vtcVar) {
                    ttc ttcVar = (ttc) wtcVar.c;
                    if (ttcVar != null) {
                        gl.r(ttcVar);
                        wtcVar.c = null;
                    }
                    int i = vtcVar.d;
                    if (i == 0) {
                        wtcVar.i(vtcVar);
                        return;
                    }
                    ttc ttcVar2 = new ttc(wtcVar, vtcVar, (byte) 2);
                    wtcVar.d = ttcVar2;
                    gl.e3(ttcVar2, 20000L);
                    rh1 rh1Var = vtcVar.a;
                    ((ConnectionsManager) rh1Var.b).checkWebProxyInternal(vtcVar.b, i, new utc(wtcVar, vtcVar));
                    return;
                }
                return;
            default:
                if (((vtc) wtcVar.b) == vtcVar) {
                    wtcVar.d = null;
                    wtcVar.i(vtcVar);
                    return;
                }
                return;
        }
    }
}
