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
    public final int f19676a;
    public final NotificationCenter.NotificationCenterDelegate f19677b;
    public final long f19678c;
    public final Object d;
    public final Object f19679e;
    public final int f19680f;
    public final String f19681g;

    public z(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f19676a = 2;
        this.f19677b = messagesController;
        this.d = hashMap;
        this.f19681g = str;
        this.f19679e = iVar;
        this.f19678c = j3;
        this.f19680f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19676a) {
            case 0:
                int i10 = this.f19680f;
                String str = this.f19681g;
                ((VoIPService) this.f19677b).lambda$startConferenceGroupCall$51(this.f19678c, (HashSet) this.d, (AtomicInteger) this.f19679e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f19680f;
                String str2 = this.f19681g;
                ((VoIPService) this.f19677b).lambda$startConferenceGroupCall$43(this.f19678c, (HashSet) this.d, (AtomicInteger) this.f19679e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f19678c;
                int i12 = this.f19680f;
                ((MessagesController) this.f19677b).lambda$reloadWebPages$186((HashMap) this.d, this.f19681g, (a0.i) this.f19679e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public z(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f19676a = i11;
        this.f19677b = voIPService;
        this.f19678c = j3;
        this.d = hashSet;
        this.f19679e = atomicInteger;
        this.f19680f = i10;
        this.f19681g = str;
    }
}
