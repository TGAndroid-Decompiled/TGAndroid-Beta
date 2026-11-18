package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jm implements Runnable {
    public final int f24892a = 3;
    public final long f24893b;
    public final long f24894c;
    public final int d;
    public final Object f24895e;
    public final Object f24896f;
    public final Object h;
    public final Object f24897n;

    public jm(mp mpVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f24895e = mpVar;
        this.f24896f = updates_channeldifference;
        this.f24893b = j3;
        this.h = chat;
        this.f24897n = hVar;
        this.d = i7;
        this.f24894c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jm.run():void");
    }

    public jm(zy zyVar, long j3, long j10, int i7, TLRPC.Message message, ArrayList arrayList, fj fjVar) {
        this.f24895e = zyVar;
        this.f24893b = j3;
        this.f24894c = j10;
        this.d = i7;
        this.f24896f = message;
        this.h = arrayList;
        this.f24897n = fjVar;
    }

    public jm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f24895e = cVar;
        this.h = chat;
        this.f24896f = charSequence;
        this.f24893b = j3;
        this.f24894c = j10;
        this.d = i7;
        this.f24897n = iArr;
    }

    public jm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f24895e = cVar;
        this.f24896f = user;
        this.h = charSequence;
        this.f24893b = j3;
        this.f24894c = j10;
        this.d = i7;
        this.f24897n = iArr;
    }
}
