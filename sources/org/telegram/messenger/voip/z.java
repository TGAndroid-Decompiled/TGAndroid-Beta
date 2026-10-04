package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f19632a;
    public final NotificationCenter.NotificationCenterDelegate f19633b;
    public final long f19634c;
    public final Object d;
    public final Object f19635e;
    public final int f19636f;
    public final String f19637g;

    public z(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f19632a = 2;
        this.f19633b = messagesController;
        this.d = hashMap;
        this.f19637g = str;
        this.f19635e = iVar;
        this.f19634c = j3;
        this.f19636f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19632a) {
            case 0:
                int i10 = this.f19636f;
                String str = this.f19637g;
                ((VoIPService) this.f19633b).lambda$startConferenceGroupCall$51(this.f19634c, (HashSet) this.d, (AtomicInteger) this.f19635e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f19636f;
                String str2 = this.f19637g;
                ((VoIPService) this.f19633b).lambda$startConferenceGroupCall$43(this.f19634c, (HashSet) this.d, (AtomicInteger) this.f19635e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f19634c;
                int i12 = this.f19636f;
                ((MessagesController) this.f19633b).lambda$reloadWebPages$187((HashMap) this.d, this.f19637g, (a0.i) this.f19635e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public z(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f19632a = i11;
        this.f19633b = voIPService;
        this.f19634c = j3;
        this.d = hashSet;
        this.f19635e = atomicInteger;
        this.f19636f = i10;
        this.f19637g = str;
    }
}
