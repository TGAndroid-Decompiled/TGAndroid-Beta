package defpackage;

import org.telegram.tgnet.TLRPC;
public final class avc implements qac {
    public final byte a;
    public final bvc b;

    public avc(bvc bvcVar, byte b) {
        this.a = b;
        this.b = bvcVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        bvc bvcVar = this.b;
        dvc dvcVar = (dvc) obj;
        switch (b) {
            case 0:
                bvcVar.l = null;
                bvcVar.i = true;
                TLRPC.TL_webPage tL_webPage = bvcVar.j;
                if (tL_webPage != null) {
                    dvc.o(tL_webPage);
                }
                bvcVar.j = dvcVar.c;
                bvcVar.c();
                return;
            default:
                bvcVar.l = null;
                bvcVar.i = true;
                TLRPC.TL_webPage tL_webPage2 = bvcVar.j;
                if (tL_webPage2 != null) {
                    dvc.o(tL_webPage2);
                }
                bvcVar.j = dvcVar.c;
                bvcVar.c();
                return;
        }
    }
}
