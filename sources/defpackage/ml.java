package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ml implements tl {
    public final byte a;
    public final wl b;

    public ml(wl wlVar, byte b) {
        this.a = b;
        this.b = wlVar;
    }

    @Override
    public final void a(TLRPC.Document document) {
        byte b = this.a;
        wl wlVar = this.b;
        switch (b) {
            case 0:
                wlVar.e = document;
                wlVar.i(false);
                return;
            default:
                wlVar.e = document;
                wlVar.i(false);
                return;
        }
    }
}
