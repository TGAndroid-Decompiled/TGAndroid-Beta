package defpackage;

import org.telegram.tgnet.TLRPC;
public final class oxc implements pcc {
    public final byte a;
    public final pxc b;

    public oxc(pxc pxcVar, byte b) {
        this.a = b;
        this.b = pxcVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        pxc pxcVar = this.b;
        rxc rxcVar = (rxc) obj;
        switch (b) {
            case 0:
                pxcVar.l = null;
                pxcVar.i = true;
                TLRPC.TL_webPage tL_webPage = pxcVar.j;
                if (tL_webPage != null) {
                    rxc.o(tL_webPage);
                }
                pxcVar.j = rxcVar.c;
                pxcVar.c();
                return;
            default:
                pxcVar.l = null;
                pxcVar.i = true;
                TLRPC.TL_webPage tL_webPage2 = pxcVar.j;
                if (tL_webPage2 != null) {
                    rxc.o(tL_webPage2);
                }
                pxcVar.j = rxcVar.c;
                pxcVar.c();
                return;
        }
    }
}
