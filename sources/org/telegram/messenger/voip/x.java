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
    public final int f26192a;
    public final ls f26193b;
    public final long f26194c;
    public final Object d;
    public final Object f26195e;
    public final int f26196f;
    public final String f26197g;

    public x(qp qpVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.f26192a = 2;
        this.f26193b = qpVar;
        this.d = hashMap;
        this.f26197g = str;
        this.f26195e = hVar;
        this.f26194c = j3;
        this.f26196f = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26192a) {
            case 0:
                int i7 = this.f26196f;
                String str = this.f26197g;
                ((VoIPService) this.f26193b).lambda$startConferenceGroupCall$51(this.f26194c, (HashSet) this.d, (AtomicInteger) this.f26195e, i7, str, tLObject, tL_error);
                return;
            case 1:
                int i10 = this.f26196f;
                String str2 = this.f26197g;
                ((VoIPService) this.f26193b).lambda$startConferenceGroupCall$43(this.f26194c, (HashSet) this.d, (AtomicInteger) this.f26195e, i10, str2, tLObject, tL_error);
                return;
            default:
                org.telegram.messenger.g0.h3(new pb((qp) this.f26193b, (HashMap) this.d, this.f26197g, tLObject, (a0.h) this.f26195e, this.f26194c, this.f26196f));
                return;
        }
    }

    public x(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, String str, int i10) {
        this.f26192a = i10;
        this.f26193b = voIPService;
        this.f26194c = j3;
        this.d = hashSet;
        this.f26195e = atomicInteger;
        this.f26196f = i7;
        this.f26197g = str;
    }
}
