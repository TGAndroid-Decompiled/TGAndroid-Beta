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
    public final int f18751a;
    public final NotificationCenter.NotificationCenterDelegate f18752b;
    public final long f18753c;
    public final Object d;
    public final Object e;
    public final int f18754f;
    public final String f18755g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f18751a = 2;
        this.f18752b = messagesController;
        this.d = hashMap;
        this.f18755g = str;
        this.e = hVar;
        this.f18753c = j10;
        this.f18754f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18751a) {
            case 0:
                int i10 = this.f18754f;
                String str = this.f18755g;
                ((VoIPService) this.f18752b).lambda$startConferenceGroupCall$51(this.f18753c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f18754f;
                String str2 = this.f18755g;
                ((VoIPService) this.f18752b).lambda$startConferenceGroupCall$43(this.f18753c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j10 = this.f18753c;
                int i12 = this.f18754f;
                ((MessagesController) this.f18752b).lambda$reloadWebPages$187((HashMap) this.d, this.f18755g, (a0.h) this.e, j10, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f18751a = i11;
        this.f18752b = voIPService;
        this.f18753c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f18754f = i10;
        this.f18755g = str;
    }
}
