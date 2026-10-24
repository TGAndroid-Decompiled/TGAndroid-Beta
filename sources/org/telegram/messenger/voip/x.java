package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements RequestDelegate {
    public final int f20004a;
    public final NotificationCenter.NotificationCenterDelegate f20005b;
    public final long f20006c;
    public final Object d;
    public final Object e;
    public final int f20007f;
    public final String f20008g;

    public x(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f20004a = 2;
        this.f20005b = messagesController;
        this.d = hashMap;
        this.f20008g = str;
        this.e = hVar;
        this.f20006c = j10;
        this.f20007f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20004a) {
            case 0:
                int i10 = this.f20007f;
                String str = this.f20008g;
                ((VoIPService) this.f20005b).lambda$startConferenceGroupCall$51(this.f20006c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f20007f;
                String str2 = this.f20008g;
                ((VoIPService) this.f20005b).lambda$startConferenceGroupCall$43(this.f20006c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j10 = this.f20006c;
                int i12 = this.f20007f;
                ((MessagesController) this.f20005b).lambda$reloadWebPages$186((HashMap) this.d, this.f20008g, (a0.h) this.e, j10, i12, tLObject, tL_error);
                return;
        }
    }

    public x(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f20004a = i11;
        this.f20005b = voIPService;
        this.f20006c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f20007f = i10;
        this.f20008g = str;
    }
}
