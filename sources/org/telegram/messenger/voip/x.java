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
    public final int f19923a;
    public final NotificationCenter.NotificationCenterDelegate f19924b;
    public final long f19925c;
    public final Object d;
    public final Object e;
    public final int f19926f;
    public final String f19927g;

    public x(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f19923a = 2;
        this.f19924b = messagesController;
        this.d = hashMap;
        this.f19927g = str;
        this.e = hVar;
        this.f19925c = j10;
        this.f19926f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19923a) {
            case 0:
                int i10 = this.f19926f;
                String str = this.f19927g;
                ((VoIPService) this.f19924b).lambda$startConferenceGroupCall$51(this.f19925c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f19926f;
                String str2 = this.f19927g;
                ((VoIPService) this.f19924b).lambda$startConferenceGroupCall$43(this.f19925c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j10 = this.f19925c;
                int i12 = this.f19926f;
                ((MessagesController) this.f19924b).lambda$reloadWebPages$186((HashMap) this.d, this.f19927g, (a0.h) this.e, j10, i12, tLObject, tL_error);
                return;
        }
    }

    public x(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f19923a = i11;
        this.f19924b = voIPService;
        this.f19925c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f19926f = i10;
        this.f19927g = str;
    }
}
