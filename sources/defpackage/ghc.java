package defpackage;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ghc implements RequestDelegate {
    public final byte a;
    public final VoIPService b;
    public final long c;
    public final HashSet d;
    public final AtomicInteger e;
    public final int f;
    public final String g;

    public ghc(VoIPService voIPService, long j, HashSet hashSet, AtomicInteger atomicInteger, int i, String str, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = j;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f = i;
        this.g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$startConferenceGroupCall$54(this.c, this.d, this.e, this.f, this.g, tLObject, tL_error);
                return;
            default:
                this.b.lambda$startConferenceGroupCall$46(this.c, this.d, this.e, this.f, this.g, tLObject, tL_error);
                return;
        }
    }
}
