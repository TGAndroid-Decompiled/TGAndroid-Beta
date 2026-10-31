package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.qb;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements RequestDelegate {
    public final int f18612a;
    public final us f18613b;
    public final long f18614c;
    public final Object d;
    public final Object e;
    public final int f18615f;
    public final String f18616g;

    public a0(vp vpVar, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f18612a = 2;
        this.f18613b = vpVar;
        this.d = hashMap;
        this.f18616g = str;
        this.e = hVar;
        this.f18614c = j10;
        this.f18615f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18612a) {
            case 0:
                int i10 = this.f18615f;
                String str = this.f18616g;
                ((VoIPService) this.f18613b).lambda$startConferenceGroupCall$51(this.f18614c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f18615f;
                String str2 = this.f18616g;
                ((VoIPService) this.f18613b).lambda$startConferenceGroupCall$43(this.f18614c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                org.telegram.messenger.i0.g3(new qb((vp) this.f18613b, (HashMap) this.d, this.f18616g, tLObject, (a0.h) this.e, this.f18614c, this.f18615f));
                return;
        }
    }

    public a0(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f18612a = i11;
        this.f18613b = voIPService;
        this.f18614c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f18615f = i10;
        this.f18616g = str;
    }
}
