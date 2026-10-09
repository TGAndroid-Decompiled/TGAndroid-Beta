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
    public final int f19522a;
    public final NotificationCenter.NotificationCenterDelegate f19523b;
    public final long f19524c;
    public final Object d;
    public final Object f19525e;
    public final int f19526f;
    public final String f19527g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f19522a = 2;
        this.f19523b = messagesController;
        this.d = hashMap;
        this.f19527g = str;
        this.f19525e = iVar;
        this.f19524c = j3;
        this.f19526f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19522a) {
            case 0:
                int i10 = this.f19526f;
                String str = this.f19527g;
                ((VoIPService) this.f19523b).lambda$startConferenceGroupCall$51(this.f19524c, (HashSet) this.d, (AtomicInteger) this.f19525e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f19526f;
                String str2 = this.f19527g;
                ((VoIPService) this.f19523b).lambda$startConferenceGroupCall$43(this.f19524c, (HashSet) this.d, (AtomicInteger) this.f19525e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f19524c;
                int i12 = this.f19526f;
                ((MessagesController) this.f19523b).lambda$reloadWebPages$186((HashMap) this.d, this.f19527g, (a0.i) this.f19525e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f19522a = i11;
        this.f19523b = voIPService;
        this.f19524c = j3;
        this.d = hashSet;
        this.f19525e = atomicInteger;
        this.f19526f = i10;
        this.f19527g = str;
    }
}
