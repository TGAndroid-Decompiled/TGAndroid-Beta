package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ob;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y implements RequestDelegate {
    public final int f27201a;
    public final is f27202b;
    public final long f27203c;
    public final Object d;
    public final Object f27204e;
    public final int f27205f;
    public final String f27206g;

    public y(np npVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.f27201a = 2;
        this.f27202b = npVar;
        this.d = hashMap;
        this.f27206g = str;
        this.f27204e = hVar;
        this.f27203c = j3;
        this.f27205f = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27201a) {
            case 0:
                int i7 = this.f27205f;
                String str = this.f27206g;
                ((VoIPService) this.f27202b).lambda$startConferenceGroupCall$51(this.f27203c, (HashSet) this.d, (AtomicInteger) this.f27204e, i7, str, tLObject, tL_error);
                return;
            case 1:
                int i10 = this.f27205f;
                String str2 = this.f27206g;
                ((VoIPService) this.f27202b).lambda$startConferenceGroupCall$43(this.f27203c, (HashSet) this.d, (AtomicInteger) this.f27204e, i10, str2, tLObject, tL_error);
                return;
            default:
                org.telegram.messenger.g0.h3(new ob((np) this.f27202b, (HashMap) this.d, this.f27206g, tLObject, (a0.h) this.f27204e, this.f27203c, this.f27205f));
                return;
        }
    }

    public y(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, String str, int i10) {
        this.f27201a = i10;
        this.f27202b = voIPService;
        this.f27203c = j3;
        this.d = hashSet;
        this.f27204e = atomicInteger;
        this.f27205f = i7;
        this.f27206g = str;
    }
}
