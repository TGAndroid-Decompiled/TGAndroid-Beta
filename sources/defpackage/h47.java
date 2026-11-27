package defpackage;

import org.telegram.tgnet.TLRPC;
public final class h47 implements tl {
    public final byte a;
    public final Object b;

    public h47(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(TLRPC.Document document) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                hl.c3(new mn6((r47) obj, document, (byte) 17));
                return;
            case 1:
                hl.c3(new ty8((dz8) obj, document));
                return;
            default:
                hl.c3(new n3b((q3b) obj, document, (byte) 0));
                return;
        }
    }
}
