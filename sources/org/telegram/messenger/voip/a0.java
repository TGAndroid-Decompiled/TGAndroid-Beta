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
    public final int f17872a;
    public final NotificationCenter.NotificationCenterDelegate f17873b;
    public final long f17874c;
    public final Object d;
    public final Object e;
    public final int f17875f;
    public final String f17876g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f17872a = 2;
        this.f17873b = messagesController;
        this.d = hashMap;
        this.f17876g = str;
        this.e = iVar;
        this.f17874c = j3;
        this.f17875f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17872a) {
            case 0:
                int i10 = this.f17875f;
                String str = this.f17876g;
                ((VoIPService) this.f17873b).lambda$startConferenceGroupCall$51(this.f17874c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f17875f;
                String str2 = this.f17876g;
                ((VoIPService) this.f17873b).lambda$startConferenceGroupCall$43(this.f17874c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f17874c;
                int i12 = this.f17875f;
                ((MessagesController) this.f17873b).lambda$reloadWebPages$187((HashMap) this.d, this.f17876g, (a0.i) this.e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f17872a = i11;
        this.f17873b = voIPService;
        this.f17874c = j3;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f17875f = i10;
        this.f17876g = str;
    }
}
