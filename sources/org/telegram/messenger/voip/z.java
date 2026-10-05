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
    public final int f19637a;
    public final NotificationCenter.NotificationCenterDelegate f19638b;
    public final long f19639c;
    public final Object d;
    public final Object f19640e;
    public final int f19641f;
    public final String f19642g;

    public z(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f19637a = 2;
        this.f19638b = messagesController;
        this.d = hashMap;
        this.f19642g = str;
        this.f19640e = iVar;
        this.f19639c = j3;
        this.f19641f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19637a) {
            case 0:
                int i10 = this.f19641f;
                String str = this.f19642g;
                ((VoIPService) this.f19638b).lambda$startConferenceGroupCall$51(this.f19639c, (HashSet) this.d, (AtomicInteger) this.f19640e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f19641f;
                String str2 = this.f19642g;
                ((VoIPService) this.f19638b).lambda$startConferenceGroupCall$43(this.f19639c, (HashSet) this.d, (AtomicInteger) this.f19640e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f19639c;
                int i12 = this.f19641f;
                ((MessagesController) this.f19638b).lambda$reloadWebPages$187((HashMap) this.d, this.f19642g, (a0.i) this.f19640e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public z(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f19637a = i11;
        this.f19638b = voIPService;
        this.f19639c = j3;
        this.d = hashSet;
        this.f19640e = atomicInteger;
        this.f19641f = i10;
        this.f19642g = str;
    }
}
