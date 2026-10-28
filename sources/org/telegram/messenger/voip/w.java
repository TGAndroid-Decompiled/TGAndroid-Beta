package org.telegram.messenger.voip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w implements RequestDelegate {
    public final int f21692a;
    public final NotificationCenter.NotificationCenterDelegate f21693b;
    public final long f21694c;
    public final Object d;
    public final Object e;
    public final int f21695f;
    public final String f21696g;

    public w(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f21692a = 2;
        this.f21693b = messagesController;
        this.d = hashMap;
        this.f21696g = str;
        this.e = hVar;
        this.f21694c = j10;
        this.f21695f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21692a) {
            case 0:
                int i10 = this.f21695f;
                String str = this.f21696g;
                ((VoIPService) this.f21693b).lambda$startConferenceGroupCall$51(this.f21694c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f21695f;
                String str2 = this.f21696g;
                ((VoIPService) this.f21693b).lambda$startConferenceGroupCall$43(this.f21694c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j10 = this.f21694c;
                int i12 = this.f21695f;
                ((MessagesController) this.f21693b).lambda$reloadWebPages$186((HashMap) this.d, this.f21696g, (a0.h) this.e, j10, i12, tLObject, tL_error);
                return;
        }
    }

    public w(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f21692a = i11;
        this.f21693b = voIPService;
        this.f21694c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f21695f = i10;
        this.f21696g = str;
    }
}
