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
    public final int f19321a;
    public final NotificationCenter.NotificationCenterDelegate f19322b;
    public final long f19323c;
    public final Object d;
    public final Object f19324e;
    public final int f19325f;
    public final String f19326g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f19321a = 2;
        this.f19322b = messagesController;
        this.d = hashMap;
        this.f19326g = str;
        this.f19324e = iVar;
        this.f19323c = j3;
        this.f19325f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19321a) {
            case 0:
                int i10 = this.f19325f;
                String str = this.f19326g;
                ((VoIPService) this.f19322b).lambda$startConferenceGroupCall$51(this.f19323c, (HashSet) this.d, (AtomicInteger) this.f19324e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f19325f;
                String str2 = this.f19326g;
                ((VoIPService) this.f19322b).lambda$startConferenceGroupCall$43(this.f19323c, (HashSet) this.d, (AtomicInteger) this.f19324e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f19323c;
                int i12 = this.f19325f;
                ((MessagesController) this.f19322b).lambda$reloadWebPages$187((HashMap) this.d, this.f19326g, (a0.i) this.f19324e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f19321a = i11;
        this.f19322b = voIPService;
        this.f19323c = j3;
        this.d = hashSet;
        this.f19324e = atomicInteger;
        this.f19325f = i10;
        this.f19326g = str;
    }
}
