package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class km implements Runnable {
    public final int f25104a = 3;
    public final long f25105b;
    public final long f25106c;
    public final int d;
    public final Object f25107e;
    public final Object f25108f;
    public final Object h;
    public final Object f25109n;

    public km(np npVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f25107e = npVar;
        this.f25108f = updates_channeldifference;
        this.f25105b = j3;
        this.h = chat;
        this.f25109n = hVar;
        this.d = i7;
        this.f25106c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.km.run():void");
    }

    public km(az azVar, long j3, long j10, int i7, TLRPC.Message message, ArrayList arrayList, gj gjVar) {
        this.f25107e = azVar;
        this.f25105b = j3;
        this.f25106c = j10;
        this.d = i7;
        this.f25108f = message;
        this.h = arrayList;
        this.f25109n = gjVar;
    }

    public km(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f25107e = cVar;
        this.h = chat;
        this.f25108f = charSequence;
        this.f25105b = j3;
        this.f25106c = j10;
        this.d = i7;
        this.f25109n = iArr;
    }

    public km(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f25107e = cVar;
        this.f25108f = user;
        this.h = charSequence;
        this.f25105b = j3;
        this.f25106c = j10;
        this.d = i7;
        this.f25109n = iArr;
    }
}
