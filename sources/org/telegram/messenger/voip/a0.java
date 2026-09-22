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
    public final int f17614a;
    public final NotificationCenter.NotificationCenterDelegate f17615b;
    public final long f17616c;
    public final Object d;
    public final Object e;
    public final int f17617f;
    public final String f17618g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f17614a = 2;
        this.f17615b = messagesController;
        this.d = hashMap;
        this.f17618g = str;
        this.e = iVar;
        this.f17616c = j3;
        this.f17617f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17614a) {
            case 0:
                int i10 = this.f17617f;
                String str = this.f17618g;
                ((VoIPService) this.f17615b).lambda$startConferenceGroupCall$51(this.f17616c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f17617f;
                String str2 = this.f17618g;
                ((VoIPService) this.f17615b).lambda$startConferenceGroupCall$43(this.f17616c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f17616c;
                int i12 = this.f17617f;
                ((MessagesController) this.f17615b).lambda$reloadWebPages$187((HashMap) this.d, this.f17618g, (a0.i) this.e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f17614a = i11;
        this.f17615b = voIPService;
        this.f17616c = j3;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f17617f = i10;
        this.f17618g = str;
    }
}
