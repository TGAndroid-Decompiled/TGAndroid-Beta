package defpackage;

import android.os.Bundle;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLifecycleLock;
public final class k64 implements b86, nu4, ot2, NativeLifecycleLock.NativePointerCallable, rs4 {
    public final byte a;
    public final boolean b;

    public k64(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        og8 og8Var = (og8) obj;
        switch (b) {
            case 3:
                og8Var.V(z);
                return;
            case 4:
                og8Var.o0(z);
                return;
            default:
                og8Var.v(z);
                return;
        }
    }

    @Override
    public final v21 b(d31 d31Var) {
        return d31Var.k(this.b);
    }

    @Override
    public final Object call(long j) {
        Boolean lambda$setEnabled$3;
        lambda$setEnabled$3 = MediaStreamTrack.lambda$setEnabled$3(this.b, j);
        return lambda$setEnabled$3;
    }

    @Override
    public final Object h(Object obj) {
        Void r1 = (Void) obj;
        Bundle l = bs2.l("afterSignup", this.b);
        fj6 fj6Var = new fj6();
        fj6Var.s0(l);
        return fj6Var;
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        bg8 bg8Var = (bg8) obj;
        switch (b) {
            case 0:
                bg8Var.v(z);
                return;
            default:
                bg8Var.h(z);
                return;
        }
    }
}
