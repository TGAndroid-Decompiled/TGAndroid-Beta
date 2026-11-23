package org.telegram.messenger.voip;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y implements RequestDelegate {
    public final int f27664a;
    public final VoIPService f27665b;
    public final long f27666c;
    public final HashSet d;
    public final AtomicInteger f27667e;
    public final int f27668f;
    public final String f27669g;

    public y(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, String str, int i10) {
        this.f27664a = i10;
        this.f27665b = voIPService;
        this.f27666c = j3;
        this.d = hashSet;
        this.f27667e = atomicInteger;
        this.f27668f = i7;
        this.f27669g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27664a) {
            case 0:
                this.f27665b.lambda$startConferenceGroupCall$51(this.f27666c, this.d, this.f27667e, this.f27668f, this.f27669g, tLObject, tL_error);
                return;
            default:
                this.f27665b.lambda$startConferenceGroupCall$43(this.f27666c, this.d, this.f27667e, this.f27668f, this.f27669g, tLObject, tL_error);
                return;
        }
    }
}
