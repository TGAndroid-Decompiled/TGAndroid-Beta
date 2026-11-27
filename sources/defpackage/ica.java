package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ica implements pcc {
    public final byte a;
    public final yt0 b;
    public final TLRPC.Document c;

    public ica(yt0 yt0Var, TLRPC.Document document, byte b) {
        this.a = b;
        this.b = yt0Var;
        this.c = document;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        TLRPC.Document document = this.c;
        yt0 yt0Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                yt0Var.a(str, document);
                return;
            default:
                yt0Var.a(str, document);
                return;
        }
    }
}
