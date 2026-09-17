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
    public final int f19362a;
    public final NotificationCenter.NotificationCenterDelegate f19363b;
    public final long f19364c;
    public final Object d;
    public final Object f19365e;
    public final int f19366f;
    public final String f19367g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f19362a = 2;
        this.f19363b = messagesController;
        this.d = hashMap;
        this.f19367g = str;
        this.f19365e = iVar;
        this.f19364c = j3;
        this.f19366f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19362a) {
            case 0:
                int i10 = this.f19366f;
                String str = this.f19367g;
                ((VoIPService) this.f19363b).lambda$startConferenceGroupCall$51(this.f19364c, (HashSet) this.d, (AtomicInteger) this.f19365e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f19366f;
                String str2 = this.f19367g;
                ((VoIPService) this.f19363b).lambda$startConferenceGroupCall$43(this.f19364c, (HashSet) this.d, (AtomicInteger) this.f19365e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f19364c;
                int i12 = this.f19366f;
                ((MessagesController) this.f19363b).lambda$reloadWebPages$187((HashMap) this.d, this.f19367g, (a0.i) this.f19365e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f19362a = i11;
        this.f19363b = voIPService;
        this.f19364c = j3;
        this.d = hashSet;
        this.f19365e = atomicInteger;
        this.f19366f = i10;
        this.f19367g = str;
    }
}
