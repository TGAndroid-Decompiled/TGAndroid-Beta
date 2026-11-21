package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jm implements Runnable {
    public final int f24917a = 3;
    public final long f24918b;
    public final long f24919c;
    public final int d;
    public final Object f24920e;
    public final Object f24921f;
    public final Object h;
    public final Object f24922n;

    public jm(mp mpVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f24920e = mpVar;
        this.f24921f = updates_channeldifference;
        this.f24918b = j3;
        this.h = chat;
        this.f24922n = hVar;
        this.d = i7;
        this.f24919c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jm.run():void");
    }

    public jm(zy zyVar, long j3, long j10, int i7, TLRPC.Message message, ArrayList arrayList, fj fjVar) {
        this.f24920e = zyVar;
        this.f24918b = j3;
        this.f24919c = j10;
        this.d = i7;
        this.f24921f = message;
        this.h = arrayList;
        this.f24922n = fjVar;
    }

    public jm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f24920e = cVar;
        this.h = chat;
        this.f24921f = charSequence;
        this.f24918b = j3;
        this.f24919c = j10;
        this.d = i7;
        this.f24922n = iArr;
    }

    public jm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f24920e = cVar;
        this.f24921f = user;
        this.h = charSequence;
        this.f24918b = j3;
        this.f24919c = j10;
        this.d = i7;
        this.f24922n = iArr;
    }
}
