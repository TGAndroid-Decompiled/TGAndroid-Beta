package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements RequestDelegate {
    public final int f20009a;
    public final NotificationCenter.NotificationCenterDelegate f20010b;
    public final long f20011c;
    public final Object d;
    public final Object e;
    public final int f20012f;
    public final String f20013g;

    public x(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f20009a = 2;
        this.f20010b = messagesController;
        this.d = hashMap;
        this.f20013g = str;
        this.e = hVar;
        this.f20011c = j10;
        this.f20012f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20009a) {
            case 0:
                int i10 = this.f20012f;
                String str = this.f20013g;
                ((VoIPService) this.f20010b).lambda$startConferenceGroupCall$51(this.f20011c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f20012f;
                String str2 = this.f20013g;
                ((VoIPService) this.f20010b).lambda$startConferenceGroupCall$43(this.f20011c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j10 = this.f20011c;
                int i12 = this.f20012f;
                ((MessagesController) this.f20010b).lambda$reloadWebPages$186((HashMap) this.d, this.f20013g, (a0.h) this.e, j10, i12, tLObject, tL_error);
                return;
        }
    }

    public x(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f20009a = i11;
        this.f20010b = voIPService;
        this.f20011c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f20012f = i10;
        this.f20013g = str;
    }
}
