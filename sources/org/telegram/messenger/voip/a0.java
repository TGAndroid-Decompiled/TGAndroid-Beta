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
    public final int f17619a;
    public final NotificationCenter.NotificationCenterDelegate f17620b;
    public final long f17621c;
    public final Object d;
    public final Object e;
    public final int f17622f;
    public final String f17623g;

    public a0(MessagesController messagesController, HashMap hashMap, String str, a0.i iVar, long j3, int i10) {
        this.f17619a = 2;
        this.f17620b = messagesController;
        this.d = hashMap;
        this.f17623g = str;
        this.e = iVar;
        this.f17621c = j3;
        this.f17622f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17619a) {
            case 0:
                int i10 = this.f17622f;
                String str = this.f17623g;
                ((VoIPService) this.f17620b).lambda$startConferenceGroupCall$51(this.f17621c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f17622f;
                String str2 = this.f17623g;
                ((VoIPService) this.f17620b).lambda$startConferenceGroupCall$43(this.f17621c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j3 = this.f17621c;
                int i12 = this.f17622f;
                ((MessagesController) this.f17620b).lambda$reloadWebPages$187((HashMap) this.d, this.f17623g, (a0.i) this.e, j3, i12, tLObject, tL_error);
                return;
        }
    }

    public a0(VoIPService voIPService, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f17619a = i11;
        this.f17620b = voIPService;
        this.f17621c = j3;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f17622f = i10;
        this.f17623g = str;
    }
}
