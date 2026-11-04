package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.ib;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w implements RequestDelegate {
    public final int f26070a;
    public final cs f26071b;
    public final long f26072c;
    public final Object d;
    public final Object f26073e;
    public final int f26074f;
    public final String f26075g;

    public w(hp hpVar, HashMap hashMap, String str, a0.h hVar, long j10, int i3) {
        this.f26070a = 2;
        this.f26071b = hpVar;
        this.d = hashMap;
        this.f26075g = str;
        this.f26073e = hVar;
        this.f26072c = j10;
        this.f26074f = i3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26070a) {
            case 0:
                int i3 = this.f26074f;
                String str = this.f26075g;
                ((VoIPService) this.f26071b).lambda$startConferenceGroupCall$51(this.f26072c, (HashSet) this.d, (AtomicInteger) this.f26073e, i3, str, tLObject, tL_error);
                return;
            case 1:
                int i10 = this.f26074f;
                String str2 = this.f26075g;
                ((VoIPService) this.f26071b).lambda$startConferenceGroupCall$43(this.f26072c, (HashSet) this.d, (AtomicInteger) this.f26073e, i10, str2, tLObject, tL_error);
                return;
            default:
                org.telegram.messenger.g0.h3(new ib((hp) this.f26071b, (HashMap) this.d, this.f26075g, tLObject, (a0.h) this.f26073e, this.f26072c, this.f26074f));
                return;
        }
    }

    public w(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i3, String str, int i10) {
        this.f26070a = i10;
        this.f26071b = voIPService;
        this.f26072c = j10;
        this.d = hashSet;
        this.f26073e = atomicInteger;
        this.f26074f = i3;
        this.f26075g = str;
    }
}
