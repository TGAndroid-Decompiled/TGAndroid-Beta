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
    public final int f18577a;
    public final NotificationCenter.NotificationCenterDelegate f18578b;
    public final long f18579c;
    public final Object d;
    public final Object e;
    public final int f18580f;
    public final String f18581g;

    public z(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f18577a = 2;
        this.f18578b = messagesController;
        this.d = hashMap;
        this.f18581g = str;
        this.e = hVar;
        this.f18579c = j10;
        this.f18580f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18577a) {
            case 0:
                int i10 = this.f18580f;
                String str = this.f18581g;
                ((VoIPService) this.f18578b).lambda$startConferenceGroupCall$51(this.f18579c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f18580f;
                String str2 = this.f18581g;
                ((VoIPService) this.f18578b).lambda$startConferenceGroupCall$43(this.f18579c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j10 = this.f18579c;
                int i12 = this.f18580f;
                ((MessagesController) this.f18578b).lambda$reloadWebPages$186((HashMap) this.d, this.f18581g, (a0.h) this.e, j10, i12, tLObject, tL_error);
                return;
        }
    }

    public z(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f18577a = i11;
        this.f18578b = voIPService;
        this.f18579c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f18580f = i10;
        this.f18581g = str;
    }
}
