package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements RequestDelegate {
    public final int f16704a;
    public final NotificationCenter.NotificationCenterDelegate f16705b;
    public final long f16706c;
    public final Object d;
    public final Object e;
    public final int f16707f;
    public final String f16708g;

    public d0(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f16704a = 2;
        this.f16705b = messagesController;
        this.d = hashMap;
        this.f16708g = str;
        this.e = iVar;
        this.f16706c = j3;
        this.f16707f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16704a) {
            case 0:
                int i10 = this.f16707f;
                String str = this.f16708g;
                ((VoIPService) this.f16705b).lambda$startConferenceGroupCall$51(this.f16706c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f16707f;
                String str2 = this.f16708g;
                ((VoIPService) this.f16705b).lambda$startConferenceGroupCall$43(this.f16706c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f16706c;
                int i12 = this.f16707f;
                ((MessagesController) this.f16705b).lambda$reloadWebPages$187((HashMap) this.d, this.f16708g, (a0.i) this.e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public d0(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f16704a = i11;
        this.f16705b = voIPService;
        this.f16706c = j3;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f16707f = i10;
        this.f16708g = str;
    }
}
