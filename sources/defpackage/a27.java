package defpackage;

import org.telegram.tgnet.TLRPC;
public final class a27 implements sl {
    public final byte a;
    public final Object b;

    public a27(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(TLRPC.Document document) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gl.d3(new oh6((k27) obj, document, (byte) 20));
                return;
            case 1:
                gl.d3(new iv8((sv8) obj, document));
                return;
            default:
                gl.d3(new iya((rza) obj, document, (byte) 2));
                return;
        }
    }
}
