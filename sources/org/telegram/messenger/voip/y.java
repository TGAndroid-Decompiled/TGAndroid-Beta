package org.telegram.messenger.voip;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y implements RequestDelegate {
    public final int f27523a;
    public final VoIPService f27524b;
    public final long f27525c;
    public final HashSet d;
    public final AtomicInteger f27526e;
    public final int f27527f;
    public final String f27528g;

    public y(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, String str, int i10) {
        this.f27523a = i10;
        this.f27524b = voIPService;
        this.f27525c = j3;
        this.d = hashSet;
        this.f27526e = atomicInteger;
        this.f27527f = i7;
        this.f27528g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27523a) {
            case 0:
                this.f27524b.lambda$startConferenceGroupCall$51(this.f27525c, this.d, this.f27526e, this.f27527f, this.f27528g, tLObject, tL_error);
                return;
            default:
                this.f27524b.lambda$startConferenceGroupCall$43(this.f27525c, this.d, this.f27526e, this.f27527f, this.f27528g, tLObject, tL_error);
                return;
        }
    }
}
