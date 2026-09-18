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
    public final int f17805a;
    public final NotificationCenter.NotificationCenterDelegate f17806b;
    public final long f17807c;
    public final Object d;
    public final Object e;
    public final int f17808f;
    public final String f17809g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f17805a = 2;
        this.f17806b = messagesController;
        this.d = hashMap;
        this.f17809g = str;
        this.e = iVar;
        this.f17807c = j3;
        this.f17808f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17805a) {
            case 0:
                int i10 = this.f17808f;
                String str = this.f17809g;
                ((VoIPService) this.f17806b).lambda$startConferenceGroupCall$51(this.f17807c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f17808f;
                String str2 = this.f17809g;
                ((VoIPService) this.f17806b).lambda$startConferenceGroupCall$43(this.f17807c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f17807c;
                int i12 = this.f17808f;
                ((MessagesController) this.f17806b).lambda$reloadWebPages$187((HashMap) this.d, this.f17809g, (a0.i) this.e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f17805a = i11;
        this.f17806b = voIPService;
        this.f17807c = j3;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f17808f = i10;
        this.f17809g = str;
    }
}
