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
    public final int f22034a;
    public final NotificationCenter.NotificationCenterDelegate f22035b;
    public final long f22036c;
    public final Object d;
    public final Object f22037e;
    public final int f22038f;
    public final String f22039g;

    public z(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f22034a = 2;
        this.f22035b = messagesController;
        this.d = hashMap;
        this.f22039g = str;
        this.f22037e = hVar;
        this.f22036c = j10;
        this.f22038f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22034a) {
            case 0:
                int i10 = this.f22038f;
                String str = this.f22039g;
                ((VoIPService) this.f22035b).lambda$startConferenceGroupCall$51(this.f22036c, (HashSet) this.d, (AtomicInteger) this.f22037e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f22038f;
                String str2 = this.f22039g;
                ((VoIPService) this.f22035b).lambda$startConferenceGroupCall$43(this.f22036c, (HashSet) this.d, (AtomicInteger) this.f22037e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j10 = this.f22036c;
                int i12 = this.f22038f;
                ((MessagesController) this.f22035b).lambda$reloadWebPages$187((HashMap) this.d, this.f22039g, (a0.h) this.f22037e, j10, i12, tLObject, tL_error);
                return;
        }
    }

    public z(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f22034a = i11;
        this.f22035b = voIPService;
        this.f22036c = j10;
        this.d = hashSet;
        this.f22037e = atomicInteger;
        this.f22038f = i10;
        this.f22039g = str;
    }
}
