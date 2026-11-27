package defpackage;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnectionFactory;
public final class ml0 implements nl0, b86, xx6, ot2, NativeLifecycleLock.NativePointerCallable {
    public final byte a;
    public final int b;
    public final int c;

    public ml0(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((og8) obj).J(this.b, this.c);
                return;
            default:
                ((og8) obj).s0(this.b, this.c);
                return;
        }
    }

    @Override
    public final void b(ww6 ww6Var, int i) {
        ww6Var.c(i, this.b, this.c);
    }

    @Override
    public final Object call(long j) {
        Boolean lambda$startAecDump$10;
        lambda$startAecDump$10 = PeerConnectionFactory.lambda$startAecDump$10(this.b, this.c, j);
        return lambda$startAecDump$10;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((bg8) obj).M(this.b, this.c);
                return;
            default:
                ((bg8) obj).M(this.b, this.c);
                return;
        }
    }

    @Override
    public final int l(vnb vnbVar, boolean z) {
        if (z) {
            return this.b;
        }
        return this.c;
    }
}
