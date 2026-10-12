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
    public final int f18768a;
    public final NotificationCenter.NotificationCenterDelegate f18769b;
    public final long f18770c;
    public final Object d;
    public final Object e;
    public final int f18771f;
    public final String f18772g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f18768a = 2;
        this.f18769b = messagesController;
        this.d = hashMap;
        this.f18772g = str;
        this.e = hVar;
        this.f18770c = j10;
        this.f18771f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18768a) {
            case 0:
                int i10 = this.f18771f;
                String str = this.f18772g;
                ((VoIPService) this.f18769b).lambda$startConferenceGroupCall$51(this.f18770c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f18771f;
                String str2 = this.f18772g;
                ((VoIPService) this.f18769b).lambda$startConferenceGroupCall$43(this.f18770c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j10 = this.f18770c;
                int i12 = this.f18771f;
                ((MessagesController) this.f18769b).lambda$reloadWebPages$186((HashMap) this.d, this.f18772g, (a0.h) this.e, j10, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f18768a = i11;
        this.f18769b = voIPService;
        this.f18770c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f18771f = i10;
        this.f18772g = str;
    }
}
