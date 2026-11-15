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
    public final int f27202a;
    public final is f27203b;
    public final long f27204c;
    public final Object d;
    public final Object f27205e;
    public final int f27206f;
    public final String f27207g;

    public y(np npVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.f27202a = 2;
        this.f27203b = npVar;
        this.d = hashMap;
        this.f27207g = str;
        this.f27205e = hVar;
        this.f27204c = j3;
        this.f27206f = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27202a) {
            case 0:
                int i7 = this.f27206f;
                String str = this.f27207g;
                ((VoIPService) this.f27203b).lambda$startConferenceGroupCall$51(this.f27204c, (HashSet) this.d, (AtomicInteger) this.f27205e, i7, str, tLObject, tL_error);
                return;
            case 1:
                int i10 = this.f27206f;
                String str2 = this.f27207g;
                ((VoIPService) this.f27203b).lambda$startConferenceGroupCall$43(this.f27204c, (HashSet) this.d, (AtomicInteger) this.f27205e, i10, str2, tLObject, tL_error);
                return;
            default:
                org.telegram.messenger.g0.h3(new ob((np) this.f27203b, (HashMap) this.d, this.f27207g, tLObject, (a0.h) this.f27205e, this.f27204c, this.f27206f));
                return;
        }
    }

    public y(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, String str, int i10) {
        this.f27202a = i10;
        this.f27203b = voIPService;
        this.f27204c = j3;
        this.d = hashSet;
        this.f27205e = atomicInteger;
        this.f27206f = i7;
        this.f27207g = str;
    }
}
