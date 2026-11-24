package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public final class uvc implements Runnable {
    public final byte a;
    public final xvc b;
    public final wvc c;

    public uvc(xvc xvcVar, wvc wvcVar, byte b) {
        this.a = b;
        this.b = xvcVar;
        this.c = wvcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wvc wvcVar = this.c;
        xvc xvcVar = this.b;
        switch (b) {
            case 0:
                if (((wvc) xvcVar.c) == wvcVar) {
                    xvcVar.d = null;
                    xvcVar.r(wvcVar);
                    return;
                }
                return;
            case 1:
                if (((wvc) xvcVar.c) == wvcVar) {
                    uvc uvcVar = (uvc) xvcVar.d;
                    if (uvcVar != null) {
                        gm.r(uvcVar);
                        xvcVar.d = null;
                    }
                    int i = wvcVar.d;
                    if (i == 0) {
                        xvcVar.r(wvcVar);
                        return;
                    }
                    uvc uvcVar2 = new uvc(xvcVar, wvcVar, (byte) 2);
                    xvcVar.e = uvcVar2;
                    gm.d3(uvcVar2, 20000L);
                    wm2 wm2Var = wvcVar.a;
                    ((ConnectionsManager) wm2Var.b).checkWebProxyInternal(wvcVar.b, i, new vvc(xvcVar, wvcVar));
                    return;
                }
                return;
            default:
                if (((wvc) xvcVar.c) == wvcVar) {
                    xvcVar.e = null;
                    xvcVar.r(wvcVar);
                    return;
                }
                return;
        }
    }
}
