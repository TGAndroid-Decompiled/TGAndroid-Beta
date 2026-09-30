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
    public final int f17981a;
    public final NotificationCenter.NotificationCenterDelegate f17982b;
    public final long f17983c;
    public final Object d;
    public final Object e;
    public final int f17984f;
    public final String f17985g;

    public z(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f17981a = 2;
        this.f17982b = messagesController;
        this.d = hashMap;
        this.f17985g = str;
        this.e = iVar;
        this.f17983c = j3;
        this.f17984f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17981a) {
            case 0:
                int i10 = this.f17984f;
                String str = this.f17985g;
                ((VoIPService) this.f17982b).lambda$startConferenceGroupCall$51(this.f17983c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f17984f;
                String str2 = this.f17985g;
                ((VoIPService) this.f17982b).lambda$startConferenceGroupCall$43(this.f17983c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f17983c;
                int i12 = this.f17984f;
                ((MessagesController) this.f17982b).lambda$reloadWebPages$187((HashMap) this.d, this.f17985g, (a0.i) this.e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public z(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f17981a = i11;
        this.f17982b = voIPService;
        this.f17983c = j3;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f17984f = i10;
        this.f17985g = str;
    }
}
