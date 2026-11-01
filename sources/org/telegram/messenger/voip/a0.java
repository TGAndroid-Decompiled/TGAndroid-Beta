package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.rb;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements RequestDelegate {
    public final int f18772a;
    public final vs f18773b;
    public final long f18774c;
    public final Object d;
    public final Object e;
    public final int f18775f;
    public final String f18776g;

    public a0(wp wpVar, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f18772a = 2;
        this.f18773b = wpVar;
        this.d = hashMap;
        this.f18776g = str;
        this.e = hVar;
        this.f18774c = j10;
        this.f18775f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18772a) {
            case 0:
                int i10 = this.f18775f;
                String str = this.f18776g;
                ((VoIPService) this.f18773b).lambda$startConferenceGroupCall$51(this.f18774c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f18775f;
                String str2 = this.f18776g;
                ((VoIPService) this.f18773b).lambda$startConferenceGroupCall$43(this.f18774c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                org.telegram.messenger.i0.g3(new rb((wp) this.f18773b, (HashMap) this.d, this.f18776g, tLObject, (a0.h) this.e, this.f18774c, this.f18775f));
                return;
        }
    }

    public a0(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f18772a = i11;
        this.f18773b = voIPService;
        this.f18774c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f18775f = i10;
        this.f18776g = str;
    }
}
