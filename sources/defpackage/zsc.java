package defpackage;

import org.telegram.tgnet.TLRPC;
public final class zsc implements p8c {
    public final byte a;
    public final atc b;

    public zsc(atc atcVar, byte b) {
        this.a = b;
        this.b = atcVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        atc atcVar = this.b;
        ctc ctcVar = (ctc) obj;
        switch (b) {
            case 0:
                atcVar.l = null;
                atcVar.i = true;
                TLRPC.TL_webPage tL_webPage = atcVar.j;
                if (tL_webPage != null) {
                    ctc.o(tL_webPage);
                }
                atcVar.j = ctcVar.c;
                atcVar.c();
                return;
            default:
                atcVar.l = null;
                atcVar.i = true;
                TLRPC.TL_webPage tL_webPage2 = atcVar.j;
                if (tL_webPage2 != null) {
                    ctc.o(tL_webPage2);
                }
                atcVar.j = ctcVar.c;
                atcVar.c();
                return;
        }
    }
}
