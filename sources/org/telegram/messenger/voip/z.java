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
    public final int f19640a;
    public final NotificationCenter.NotificationCenterDelegate f19641b;
    public final long f19642c;
    public final Object d;
    public final Object f19643e;
    public final int f19644f;
    public final String f19645g;

    public z(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f19640a = 2;
        this.f19641b = messagesController;
        this.d = hashMap;
        this.f19645g = str;
        this.f19643e = iVar;
        this.f19642c = j3;
        this.f19644f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19640a) {
            case 0:
                int i10 = this.f19644f;
                String str = this.f19645g;
                ((VoIPService) this.f19641b).lambda$startConferenceGroupCall$51(this.f19642c, (HashSet) this.d, (AtomicInteger) this.f19643e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f19644f;
                String str2 = this.f19645g;
                ((VoIPService) this.f19641b).lambda$startConferenceGroupCall$43(this.f19642c, (HashSet) this.d, (AtomicInteger) this.f19643e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f19642c;
                int i12 = this.f19644f;
                ((MessagesController) this.f19641b).lambda$reloadWebPages$187((HashMap) this.d, this.f19645g, (a0.i) this.f19643e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public z(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f19640a = i11;
        this.f19641b = voIPService;
        this.f19642c = j3;
        this.d = hashSet;
        this.f19643e = atomicInteger;
        this.f19644f = i10;
        this.f19645g = str;
    }
}
