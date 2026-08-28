package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y implements RequestDelegate {
    public final int f21968a;
    public final NotificationCenter.NotificationCenterDelegate f21969b;
    public final long f21970c;
    public final Object d;
    public final Object f21971e;
    public final int f21972f;
    public final String f21973g;

    public y(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i9) {
        this.f21968a = 2;
        this.f21969b = messagesController;
        this.d = hashMap;
        this.f21973g = str;
        this.f21971e = hVar;
        this.f21970c = j10;
        this.f21972f = i9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21968a) {
            case 0:
                int i9 = this.f21972f;
                String str = this.f21973g;
                ((VoIPService) this.f21969b).lambda$startConferenceGroupCall$51(this.f21970c, (HashSet) this.d, (AtomicInteger) this.f21971e, i9, str, tLObject, tL_error);
                return;
            case 1:
                int i10 = this.f21972f;
                String str2 = this.f21973g;
                ((VoIPService) this.f21969b).lambda$startConferenceGroupCall$43(this.f21970c, (HashSet) this.d, (AtomicInteger) this.f21971e, i10, str2, tLObject, tL_error);
                return;
            default:
                long j10 = this.f21970c;
                int i11 = this.f21972f;
                ((MessagesController) this.f21969b).lambda$reloadWebPages$187((HashMap) this.d, this.f21973g, (a0.h) this.f21971e, j10, i11, tLObject, tL_error);
                return;
        }
    }

    public y(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i9, String str, int i10) {
        this.f21968a = i10;
        this.f21969b = voIPService;
        this.f21970c = j10;
        this.d = hashSet;
        this.f21971e = atomicInteger;
        this.f21972f = i9;
        this.f21973g = str;
    }
}
