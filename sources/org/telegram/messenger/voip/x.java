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
    public final int f26188a;
    public final ls f26189b;
    public final long f26190c;
    public final Object d;
    public final Object f26191e;
    public final int f26192f;
    public final String f26193g;

    public x(qp qpVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.f26188a = 2;
        this.f26189b = qpVar;
        this.d = hashMap;
        this.f26193g = str;
        this.f26191e = hVar;
        this.f26190c = j3;
        this.f26192f = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26188a) {
            case 0:
                int i7 = this.f26192f;
                String str = this.f26193g;
                ((VoIPService) this.f26189b).lambda$startConferenceGroupCall$51(this.f26190c, (HashSet) this.d, (AtomicInteger) this.f26191e, i7, str, tLObject, tL_error);
                return;
            case 1:
                int i10 = this.f26192f;
                String str2 = this.f26193g;
                ((VoIPService) this.f26189b).lambda$startConferenceGroupCall$43(this.f26190c, (HashSet) this.d, (AtomicInteger) this.f26191e, i10, str2, tLObject, tL_error);
                return;
            default:
                org.telegram.messenger.g0.h3(new pb((qp) this.f26189b, (HashMap) this.d, this.f26193g, tLObject, (a0.h) this.f26191e, this.f26190c, this.f26192f));
                return;
        }
    }

    public x(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, String str, int i10) {
        this.f26188a = i10;
        this.f26189b = voIPService;
        this.f26190c = j3;
        this.d = hashSet;
        this.f26191e = atomicInteger;
        this.f26192f = i7;
        this.f26193g = str;
    }
}
