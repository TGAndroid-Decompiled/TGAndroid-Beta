package org.telegram.messenger.voip;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y implements RequestDelegate {
    public final int f27570a;
    public final VoIPService f27571b;
    public final long f27572c;
    public final HashSet d;
    public final AtomicInteger f27573e;
    public final int f27574f;
    public final String f27575g;

    public y(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, String str, int i10) {
        this.f27570a = i10;
        this.f27571b = voIPService;
        this.f27572c = j3;
        this.d = hashSet;
        this.f27573e = atomicInteger;
        this.f27574f = i7;
        this.f27575g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27570a) {
            case 0:
                this.f27571b.lambda$startConferenceGroupCall$51(this.f27572c, this.d, this.f27573e, this.f27574f, this.f27575g, tLObject, tL_error);
                return;
            default:
                this.f27571b.lambda$startConferenceGroupCall$43(this.f27572c, this.d, this.f27573e, this.f27574f, this.f27575g, tLObject, tL_error);
                return;
        }
    }
}
