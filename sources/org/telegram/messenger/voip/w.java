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
    public final int f21704a;
    public final NotificationCenter.NotificationCenterDelegate f21705b;
    public final long f21706c;
    public final Object d;
    public final Object e;
    public final int f21707f;
    public final String f21708g;

    public w(MessagesController messagesController, HashMap hashMap, String str, a0.h hVar, long j10, int i10) {
        this.f21704a = 2;
        this.f21705b = messagesController;
        this.d = hashMap;
        this.f21708g = str;
        this.e = hVar;
        this.f21706c = j10;
        this.f21707f = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21704a) {
            case 0:
                int i10 = this.f21707f;
                String str = this.f21708g;
                ((VoIPService) this.f21705b).lambda$startConferenceGroupCall$51(this.f21706c, (HashSet) this.d, (AtomicInteger) this.e, i10, str, tLObject, tL_error);
                return;
            case 1:
                int i11 = this.f21707f;
                String str2 = this.f21708g;
                ((VoIPService) this.f21705b).lambda$startConferenceGroupCall$43(this.f21706c, (HashSet) this.d, (AtomicInteger) this.e, i11, str2, tLObject, tL_error);
                return;
            default:
                long j10 = this.f21706c;
                int i12 = this.f21707f;
                ((MessagesController) this.f21705b).lambda$reloadWebPages$186((HashMap) this.d, this.f21708g, (a0.h) this.e, j10, i12, tLObject, tL_error);
                return;
        }
    }

    public w(VoIPService voIPService, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, String str, int i11) {
        this.f21704a = i11;
        this.f21705b = voIPService;
        this.f21706c = j10;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f21707f = i10;
        this.f21708g = str;
    }
}
