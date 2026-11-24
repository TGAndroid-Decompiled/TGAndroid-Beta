package defpackage;

import org.telegram.tgnet.TLRPC;
public final class raa implements qac {
    public final byte a;
    public final yu0 b;
    public final TLRPC.Document c;

    public raa(yu0 yu0Var, TLRPC.Document document, byte b) {
        this.a = b;
        this.b = yu0Var;
        this.c = document;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        TLRPC.Document document = this.c;
        yu0 yu0Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                yu0Var.a(str, document);
                return;
            default:
                yu0Var.a(str, document);
                return;
        }
    }
}
