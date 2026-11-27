package defpackage;

import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpSender;
import org.webrtc.TimestampAligner;
public final class h40 implements b86, ot2, NativeLifecycleLock.NativePointerCallable {
    public final byte a;
    public final long b;

    public h40(byte b, long j) {
        this.a = b;
        this.b = j;
    }

    @Override
    public final void accept(Object obj) {
        ((og8) obj).g(this.b);
    }

    @Override
    public final Object call(long j) {
        Boolean lambda$setTrack$0;
        Long lambda$translateTimestamp$0;
        switch (this.a) {
            case 2:
                return MediaStream.m(this.b, j);
            case 3:
                return MediaStream.f(this.b, j);
            case 4:
                return MediaStream.k(this.b, j);
            case 5:
                lambda$setTrack$0 = RtpSender.lambda$setTrack$0(this.b, j);
                return lambda$setTrack$0;
            default:
                lambda$translateTimestamp$0 = TimestampAligner.lambda$translateTimestamp$0(this.b, j);
                return lambda$translateTimestamp$0;
        }
    }

    @Override
    public final void invoke(Object obj) {
        v30 v30Var;
        ha3 ha3Var = (ha3) obj;
        ja3 ja3Var = ha3Var.a;
        if (ha3Var == ja3Var.j && (v30Var = ja3Var.n) != null) {
            v30Var.n(this.b);
        }
    }
}
