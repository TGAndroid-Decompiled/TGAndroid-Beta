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
    public final int f19416a;
    public final NotificationCenter.NotificationCenterDelegate f19417b;
    public final long f19418c;
    public final Object d;
    public final Object f19419e;
    public final int f19420f;
    public final String f19421g;

    public z(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f19416a = 2;
        this.f19417b = messagesController;
        this.d = hashMap;
        this.f19421g = str;
        this.f19419e = iVar;
        this.f19418c = j3;
        this.f19420f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19416a) {
            case 0:
                int i10 = this.f19420f;
                String str = this.f19421g;
                ((VoIPService) this.f19417b).lambda$startConferenceGroupCall$51(this.f19418c, (HashSet) this.d, (AtomicInteger) this.f19419e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f19420f;
                String str2 = this.f19421g;
                ((VoIPService) this.f19417b).lambda$startConferenceGroupCall$43(this.f19418c, (HashSet) this.d, (AtomicInteger) this.f19419e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f19418c;
                int i12 = this.f19420f;
                ((MessagesController) this.f19417b).lambda$reloadWebPages$186((HashMap) this.d, this.f19421g, (a0.i) this.f19419e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public z(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f19416a = i11;
        this.f19417b = voIPService;
        this.f19418c = j3;
        this.d = hashSet;
        this.f19419e = atomicInteger;
        this.f19420f = i10;
        this.f19421g = str;
    }
}
