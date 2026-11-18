package org.telegram.messenger.voip;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y implements RequestDelegate {
    public final int f27568a;
    public final VoIPService f27569b;
    public final long f27570c;
    public final HashSet d;
    public final AtomicInteger f27571e;
    public final int f27572f;
    public final String f27573g;

    public y(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, String str, int i10) {
        this.f27568a = i10;
        this.f27569b = voIPService;
        this.f27570c = j3;
        this.d = hashSet;
        this.f27571e = atomicInteger;
        this.f27572f = i7;
        this.f27573g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27568a) {
            case 0:
                this.f27569b.lambda$startConferenceGroupCall$51(this.f27570c, this.d, this.f27571e, this.f27572f, this.f27573g, tLObject, tL_error);
                return;
            default:
                this.f27569b.lambda$startConferenceGroupCall$43(this.f27570c, this.d, this.f27571e, this.f27572f, this.f27573g, tLObject, tL_error);
                return;
        }
    }
}
