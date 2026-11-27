package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ti1 implements Runnable {
    public final byte a;
    public final TLRPC.TL_error b;

    public ti1(TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = tL_error;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.b;
        switch (b) {
            case 0:
                d31.e0(tL_error);
                return;
            default:
                if (tL_error != null) {
                    d31.e0(tL_error);
                    return;
                }
                return;
        }
    }
}
