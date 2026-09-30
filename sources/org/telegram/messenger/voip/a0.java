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
    public final int f17889a;
    public final NotificationCenter.NotificationCenterDelegate f17890b;
    public final long f17891c;
    public final Object d;
    public final Object e;
    public final int f17892f;
    public final String f17893g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f17889a = 2;
        this.f17890b = messagesController;
        this.d = hashMap;
        this.f17893g = str;
        this.e = iVar;
        this.f17891c = j3;
        this.f17892f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17889a) {
            case 0:
                int i10 = this.f17892f;
                String str = this.f17893g;
                ((VoIPService) this.f17890b).lambda$startConferenceGroupCall$51(this.f17891c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f17892f;
                String str2 = this.f17893g;
                ((VoIPService) this.f17890b).lambda$startConferenceGroupCall$43(this.f17891c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f17891c;
                int i12 = this.f17892f;
                ((MessagesController) this.f17890b).lambda$reloadWebPages$187((HashMap) this.d, this.f17893g, (a0.i) this.e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f17889a = i11;
        this.f17890b = voIPService;
        this.f17891c = j3;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f17892f = i10;
        this.f17893g = str;
    }
}
