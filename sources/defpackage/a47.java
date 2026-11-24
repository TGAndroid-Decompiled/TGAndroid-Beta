package defpackage;

import org.telegram.tgnet.TLRPC;
public final class a47 implements sm {
    public final byte a;
    public final Object b;

    public a47(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(TLRPC.Document document) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gm.c3(new lj6((k47) obj, document, (byte) 21));
                return;
            case 1:
                gm.c3(new jx8((tx8) obj, document));
                return;
            default:
                gm.c3(new uva((s1b) obj, document, (byte) 4));
                return;
        }
    }
}
