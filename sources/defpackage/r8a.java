package defpackage;

import org.telegram.tgnet.TLRPC;
public final class r8a implements p8c {
    public final byte a;
    public final pt0 b;
    public final TLRPC.Document c;

    public r8a(pt0 pt0Var, TLRPC.Document document, byte b) {
        this.a = b;
        this.b = pt0Var;
        this.c = document;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        TLRPC.Document document = this.c;
        pt0 pt0Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                pt0Var.a(str, document);
                return;
            default:
                pt0Var.a(str, document);
                return;
        }
    }
}
