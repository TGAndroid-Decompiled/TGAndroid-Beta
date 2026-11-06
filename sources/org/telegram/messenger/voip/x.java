package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ls;
import org.telegram.messenger.pb;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements RequestDelegate {
    public final int f26182a;
    public final ls f26183b;
    public final long f26184c;
    public final Object d;
    public final Object f26185e;
    public final int f26186f;
    public final String f26187g;

    public x(qp qpVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.f26182a = 2;
        this.f26183b = qpVar;
        this.d = hashMap;
        this.f26187g = str;
        this.f26185e = hVar;
        this.f26184c = j3;
        this.f26186f = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26182a) {
            case 0:
                int i7 = this.f26186f;
                String str = this.f26187g;
                ((VoIPService) this.f26183b).lambda$startConferenceGroupCall$51(this.f26184c, (HashSet) this.d, (AtomicInteger) this.f26185e, i7, str, tLObject, tL_error);
                return;
            case 1:
                int i10 = this.f26186f;
                String str2 = this.f26187g;
                ((VoIPService) this.f26183b).lambda$startConferenceGroupCall$43(this.f26184c, (HashSet) this.d, (AtomicInteger) this.f26185e, i10, str2, tLObject, tL_error);
                return;
            default:
                org.telegram.messenger.g0.h3(new pb((qp) this.f26183b, (HashMap) this.d, this.f26187g, tLObject, (a0.h) this.f26185e, this.f26184c, this.f26186f));
                return;
        }
    }

    public x(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, String str, int i10) {
        this.f26182a = i10;
        this.f26183b = voIPService;
        this.f26184c = j3;
        this.d = hashSet;
        this.f26185e = atomicInteger;
        this.f26186f = i7;
        this.f26187g = str;
    }
}
