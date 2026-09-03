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
    public final int f20379a;
    public final NotificationCenter.NotificationCenterDelegate f20380b;
    public final long f20381c;
    public final Object d;
    public final Object f20382e;
    public final int f20383f;
    public final String f20384g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f20379a = 2;
        this.f20380b = messagesController;
        this.d = hashMap;
        this.f20384g = str;
        this.f20382e = hVar;
        this.f20381c = j10;
        this.f20383f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20379a) {
            case 0:
                int i10 = this.f20383f;
                String str = this.f20384g;
                ((VoIPService) this.f20380b).lambda$startConferenceGroupCall$51(this.f20381c, (HashSet) this.d, (AtomicInteger) this.f20382e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f20383f;
                String str2 = this.f20384g;
                ((VoIPService) this.f20380b).lambda$startConferenceGroupCall$43(this.f20381c, (HashSet) this.d, (AtomicInteger) this.f20382e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j10 = this.f20381c;
                int i12 = this.f20383f;
                ((MessagesController) this.f20380b).lambda$reloadWebPages$187((HashMap) this.d, this.f20384g, (a0.h) this.f20382e, j10, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f20379a = i11;
        this.f20380b = voIPService;
        this.f20381c = j10;
        this.d = hashSet;
        this.f20382e = atomicInteger;
        this.f20383f = i10;
        this.f20384g = str;
    }
}
