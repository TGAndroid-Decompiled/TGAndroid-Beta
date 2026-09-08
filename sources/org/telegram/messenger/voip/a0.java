package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements RequestDelegate {
    public final int f19348a;
    public final NotificationCenter.NotificationCenterDelegate f19349b;
    public final long f19350c;
    public final Object d;
    public final Object f19351e;
    public final int f19352f;
    public final String f19353g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f19348a = 2;
        this.f19349b = messagesController;
        this.d = hashMap;
        this.f19353g = str;
        this.f19351e = iVar;
        this.f19350c = j3;
        this.f19352f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19348a) {
            case 0:
                int i10 = this.f19352f;
                String str = this.f19353g;
                ((VoIPService) this.f19349b).lambda$startConferenceGroupCall$51(this.f19350c, (HashSet) this.d, (AtomicInteger) this.f19351e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f19352f;
                String str2 = this.f19353g;
                ((VoIPService) this.f19349b).lambda$startConferenceGroupCall$43(this.f19350c, (HashSet) this.d, (AtomicInteger) this.f19351e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f19350c;
                int i12 = this.f19352f;
                ((MessagesController) this.f19349b).lambda$reloadWebPages$187((HashMap) this.d, this.f19353g, (a0.i) this.f19351e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f19348a = i11;
        this.f19349b = voIPService;
        this.f19350c = j3;
        this.d = hashSet;
        this.f19351e = atomicInteger;
        this.f19352f = i10;
        this.f19353g = str;
    }
}
