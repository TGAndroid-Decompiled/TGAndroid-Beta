package defpackage;

import org.telegram.tgnet.TLRPC;
public final class u22 implements z22 {
    public final byte a;
    public final TLRPC.User b;

    public u22(TLRPC.User user, byte b) {
        this.a = b;
        this.b = user;
    }

    @Override
    public final String run() {
        f78 f;
        StringBuilder sb;
        String str;
        byte b = this.a;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                f = f78.f();
                sb = new StringBuilder("+");
                str = user.phone;
                break;
            default:
                f = f78.f();
                sb = new StringBuilder("+");
                str = user.phone;
                break;
        }
        return xnb.k(sb, str, f);
    }
}
