package defpackage;

import org.telegram.tgnet.TLRPC;
public final class p32 implements u32 {
    public final byte a;
    public final TLRPC.User b;

    public p32(TLRPC.User user, byte b) {
        this.a = b;
        this.b = user;
    }

    @Override
    public final String run() {
        r58 f;
        StringBuilder sb;
        String str;
        byte b = this.a;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                f = r58.f();
                sb = new StringBuilder("+");
                str = user.phone;
                break;
            default:
                f = r58.f();
                sb = new StringBuilder("+");
                str = user.phone;
                break;
        }
        return mlb.l(sb, str, f);
    }
}
