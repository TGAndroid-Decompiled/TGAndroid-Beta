package defpackage;

import org.telegram.tgnet.TLRPC;
public final class d22 implements i22 {
    public final byte a;
    public final TLRPC.User b;

    public d22(TLRPC.User user, byte b) {
        this.a = b;
        this.b = user;
    }

    @Override
    public final String run() {
        p38 f;
        StringBuilder sb;
        String str;
        byte b = this.a;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                f = p38.f();
                sb = new StringBuilder("+");
                str = user.phone;
                break;
            default:
                f = p38.f();
                sb = new StringBuilder("+");
                str = user.phone;
                break;
        }
        return yjb.k(sb, str, f);
    }
}
