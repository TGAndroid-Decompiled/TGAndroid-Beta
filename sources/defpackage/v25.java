package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
public final class v25 implements AutoCloseable {
    public TL_wallet.sendTransfer a;
    public y25 b;
    public byte[] c;

    @Override
    public final void close() {
        this.b.close();
    }
}
