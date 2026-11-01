package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class an implements Runnable {
    public final int f14649a = 3;
    public final long f14650b;
    public final long f14651c;
    public final int d;
    public final Object e;
    public final Object f14652f;
    public final Object h;
    public final Object f14653n;

    public an(wp wpVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = wpVar;
        this.f14652f = updates_channeldifference;
        this.f14650b = j10;
        this.h = chat;
        this.f14653n = hVar;
        this.d = i10;
        this.f14651c = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.an.run():void");
    }

    public an(rz rzVar, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, kj kjVar) {
        this.e = rzVar;
        this.f14650b = j10;
        this.f14651c = j11;
        this.d = i10;
        this.f14652f = message;
        this.h = arrayList;
        this.f14653n = kjVar;
    }

    public an(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j10, long j11, int i10, int[] iArr) {
        this.e = cVar;
        this.h = chat;
        this.f14652f = charSequence;
        this.f14650b = j10;
        this.f14651c = j11;
        this.d = i10;
        this.f14653n = iArr;
    }

    public an(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j10, long j11, int i10, int[] iArr) {
        this.e = cVar;
        this.f14652f = user;
        this.h = charSequence;
        this.f14650b = j10;
        this.f14651c = j11;
        this.d = i10;
        this.f14653n = iArr;
    }
}
