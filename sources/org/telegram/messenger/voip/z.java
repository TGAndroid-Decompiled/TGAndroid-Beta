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
    public final int f19639a;
    public final NotificationCenter.NotificationCenterDelegate f19640b;
    public final long f19641c;
    public final Object d;
    public final Object f19642e;
    public final int f19643f;
    public final String f19644g;

    public z(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f19639a = 2;
        this.f19640b = messagesController;
        this.d = hashMap;
        this.f19644g = str;
        this.f19642e = iVar;
        this.f19641c = j3;
        this.f19643f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19639a) {
            case 0:
                int i10 = this.f19643f;
                String str = this.f19644g;
                ((VoIPService) this.f19640b).lambda$startConferenceGroupCall$51(this.f19641c, (HashSet) this.d, (AtomicInteger) this.f19642e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f19643f;
                String str2 = this.f19644g;
                ((VoIPService) this.f19640b).lambda$startConferenceGroupCall$43(this.f19641c, (HashSet) this.d, (AtomicInteger) this.f19642e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f19641c;
                int i12 = this.f19643f;
                ((MessagesController) this.f19640b).lambda$reloadWebPages$187((HashMap) this.d, this.f19644g, (a0.i) this.f19642e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public z(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f19639a = i11;
        this.f19640b = voIPService;
        this.f19641c = j3;
        this.d = hashSet;
        this.f19642e = atomicInteger;
        this.f19643f = i10;
        this.f19644g = str;
    }
}
