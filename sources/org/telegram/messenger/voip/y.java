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

    public final int f21992a;

    public final NotificationCenter.NotificationCenterDelegate f21993b;

    public final long f21994c;
    public final Object d;

    public final Object f21995e;

    public final int f21996f;

    public final String f21997g;

    public y(MessagesController messagesController, HashMap map, String str, a0.h hVar, long j10, int i10) {
        this.f21992a = 2;
        this.f21993b = messagesController;
        this.d = map;
        this.f21997g = str;
        this.f21995e = hVar;
        this.f21994c = j10;
        this.f21996f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21992a) {
            case 0:
                ((VoIPService) this.f21993b).lambda$startConferenceGroupCall$51(this.f21994c, (HashSet) this.d, (AtomicInteger) this.f21995e, this.f21996f, this.f21997g, tLObject, tL_error);
                break;
            case 1:
                ((VoIPService) this.f21993b).lambda$startConferenceGroupCall$43(this.f21994c, (HashSet) this.d, (AtomicInteger) this.f21995e, this.f21996f, this.f21997g, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.f21993b).lambda$reloadWebPages$187((HashMap) this.d, this.f21997g, (a0.h) this.f21995e, this.f21994c, this.f21996f, tLObject, tL_error);
                break;
        }
    }

    public y(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f21992a = i11;
        this.f21993b = voIPService;
        this.f21994c = j10;
        this.d = hashSet;
        this.f21995e = atomicInteger;
        this.f21996f = i10;
        this.f21997g = str;
    }
}
