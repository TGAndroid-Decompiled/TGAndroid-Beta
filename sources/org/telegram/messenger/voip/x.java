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
    public final int f26174a;
    public final ls f26175b;
    public final long f26176c;
    public final Object d;
    public final Object f26177e;
    public final int f26178f;
    public final String f26179g;

    public x(qp qpVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.f26174a = 2;
        this.f26175b = qpVar;
        this.d = hashMap;
        this.f26179g = str;
        this.f26177e = hVar;
        this.f26176c = j3;
        this.f26178f = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26174a) {
            case 0:
                int i7 = this.f26178f;
                String str = this.f26179g;
                ((VoIPService) this.f26175b).lambda$startConferenceGroupCall$51(this.f26176c, (HashSet) this.d, (AtomicInteger) this.f26177e, i7, str, tLObject, tL_error);
                return;
            case 1:
                int i10 = this.f26178f;
                String str2 = this.f26179g;
                ((VoIPService) this.f26175b).lambda$startConferenceGroupCall$43(this.f26176c, (HashSet) this.d, (AtomicInteger) this.f26177e, i10, str2, tLObject, tL_error);
                return;
            default:
                org.telegram.messenger.g0.h3(new pb((qp) this.f26175b, (HashMap) this.d, this.f26179g, tLObject, (a0.h) this.f26177e, this.f26176c, this.f26178f));
                return;
        }
    }

    public x(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, String str, int i10) {
        this.f26174a = i10;
        this.f26175b = voIPService;
        this.f26176c = j3;
        this.d = hashSet;
        this.f26177e = atomicInteger;
        this.f26178f = i7;
        this.f26179g = str;
    }
}
