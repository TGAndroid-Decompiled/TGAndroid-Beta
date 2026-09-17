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
    public final int f19335a;
    public final NotificationCenter.NotificationCenterDelegate f19336b;
    public final long f19337c;
    public final Object d;
    public final Object f19338e;
    public final int f19339f;
    public final String f19340g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f19335a = 2;
        this.f19336b = messagesController;
        this.d = hashMap;
        this.f19340g = str;
        this.f19338e = iVar;
        this.f19337c = j3;
        this.f19339f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19335a) {
            case 0:
                int i10 = this.f19339f;
                String str = this.f19340g;
                ((VoIPService) this.f19336b).lambda$startConferenceGroupCall$51(this.f19337c, (HashSet) this.d, (AtomicInteger) this.f19338e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f19339f;
                String str2 = this.f19340g;
                ((VoIPService) this.f19336b).lambda$startConferenceGroupCall$43(this.f19337c, (HashSet) this.d, (AtomicInteger) this.f19338e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f19337c;
                int i12 = this.f19339f;
                ((MessagesController) this.f19336b).lambda$reloadWebPages$187((HashMap) this.d, this.f19340g, (a0.i) this.f19338e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f19335a = i11;
        this.f19336b = voIPService;
        this.f19337c = j3;
        this.d = hashSet;
        this.f19338e = atomicInteger;
        this.f19339f = i10;
        this.f19340g = str;
    }
}
