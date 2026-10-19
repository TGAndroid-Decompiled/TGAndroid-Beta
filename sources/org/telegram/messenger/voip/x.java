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
    public final int f19929a;
    public final NotificationCenter.NotificationCenterDelegate f19930b;
    public final long f19931c;
    public final Object d;
    public final Object e;
    public final int f19932f;
    public final String f19933g;

    public x(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f19929a = 2;
        this.f19930b = messagesController;
        this.d = hashMap;
        this.f19933g = str;
        this.e = hVar;
        this.f19931c = j10;
        this.f19932f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19929a) {
            case 0:
                int i10 = this.f19932f;
                String str = this.f19933g;
                ((VoIPService) this.f19930b).lambda$startConferenceGroupCall$51(this.f19931c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f19932f;
                String str2 = this.f19933g;
                ((VoIPService) this.f19930b).lambda$startConferenceGroupCall$43(this.f19931c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j10 = this.f19931c;
                int i12 = this.f19932f;
                ((MessagesController) this.f19930b).lambda$reloadWebPages$186((HashMap) this.d, this.f19933g, (a0.h) this.e, j10, i12, tLObject, tL_error);
                return;
        }
    }

    public x(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f19929a = i11;
        this.f19930b = voIPService;
        this.f19931c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f19932f = i10;
        this.f19933g = str;
    }
}
