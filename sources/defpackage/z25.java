package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
public final class z25 implements AutoCloseable {
    public TL_wallet.sendTransfer a;
    public c35 b;
    public byte[] c;

    @Override
    public final void close() {
        this.b.close();
    }
}
