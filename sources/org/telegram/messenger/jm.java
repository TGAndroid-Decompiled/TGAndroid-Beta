package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jm implements Runnable {
    public final int f24999a = 3;
    public final long f25000b;
    public final long f25001c;
    public final int d;
    public final Object f25002e;
    public final Object f25003f;
    public final Object h;
    public final Object f25004n;

    public jm(mp mpVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f25002e = mpVar;
        this.f25003f = updates_channeldifference;
        this.f25000b = j3;
        this.h = chat;
        this.f25004n = hVar;
        this.d = i7;
        this.f25001c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jm.run():void");
    }

    public jm(zy zyVar, long j3, long j10, int i7, TLRPC.Message message, ArrayList arrayList, fj fjVar) {
        this.f25002e = zyVar;
        this.f25000b = j3;
        this.f25001c = j10;
        this.d = i7;
        this.f25003f = message;
        this.h = arrayList;
        this.f25004n = fjVar;
    }

    public jm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f25002e = cVar;
        this.h = chat;
        this.f25003f = charSequence;
        this.f25000b = j3;
        this.f25001c = j10;
        this.d = i7;
        this.f25004n = iArr;
    }

    public jm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f25002e = cVar;
        this.f25003f = user;
        this.h = charSequence;
        this.f25000b = j3;
        this.f25001c = j10;
        this.d = i7;
        this.f25004n = iArr;
    }
}
