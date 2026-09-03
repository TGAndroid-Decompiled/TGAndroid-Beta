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
    public final int f18733a;
    public final NotificationCenter.NotificationCenterDelegate f18734b;
    public final long f18735c;
    public final Object d;
    public final Object e;
    public final int f18736f;
    public final String f18737g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f18733a = 2;
        this.f18734b = messagesController;
        this.d = hashMap;
        this.f18737g = str;
        this.e = hVar;
        this.f18735c = j10;
        this.f18736f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18733a) {
            case 0:
                int i10 = this.f18736f;
                String str = this.f18737g;
                ((VoIPService) this.f18734b).lambda$startConferenceGroupCall$51(this.f18735c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f18736f;
                String str2 = this.f18737g;
                ((VoIPService) this.f18734b).lambda$startConferenceGroupCall$43(this.f18735c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j10 = this.f18735c;
                int i12 = this.f18736f;
                ((MessagesController) this.f18734b).lambda$reloadWebPages$187((HashMap) this.d, this.f18737g, (a0.h) this.e, j10, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f18733a = i11;
        this.f18734b = voIPService;
        this.f18735c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f18736f = i10;
        this.f18737g = str;
    }
}
