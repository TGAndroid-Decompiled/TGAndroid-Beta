package org.telegram.messenger.voip;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y implements RequestDelegate {
    public final int f27596a;
    public final VoIPService f27597b;
    public final long f27598c;
    public final HashSet d;
    public final AtomicInteger f27599e;
    public final int f27600f;
    public final String f27601g;

    public y(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, String str, int i10) {
        this.f27596a = i10;
        this.f27597b = voIPService;
        this.f27598c = j3;
        this.d = hashSet;
        this.f27599e = atomicInteger;
        this.f27600f = i7;
        this.f27601g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27596a) {
            case 0:
                this.f27597b.lambda$startConferenceGroupCall$51(this.f27598c, this.d, this.f27599e, this.f27600f, this.f27601g, tLObject, tL_error);
                return;
            default:
                this.f27597b.lambda$startConferenceGroupCall$43(this.f27598c, this.d, this.f27599e, this.f27600f, this.f27601g, tLObject, tL_error);
                return;
        }
    }
}
