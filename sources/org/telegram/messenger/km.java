package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class km implements Runnable {
    public final int f25068a = 3;
    public final long f25069b;
    public final long f25070c;
    public final int d;
    public final Object f25071e;
    public final Object f25072f;
    public final Object h;
    public final Object f25073n;

    public km(np npVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f25071e = npVar;
        this.f25072f = updates_channeldifference;
        this.f25069b = j3;
        this.h = chat;
        this.f25073n = hVar;
        this.d = i7;
        this.f25070c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.km.run():void");
    }

    public km(az azVar, long j3, long j10, int i7, TLRPC.Message message, ArrayList arrayList, gj gjVar) {
        this.f25071e = azVar;
        this.f25069b = j3;
        this.f25070c = j10;
        this.d = i7;
        this.f25072f = message;
        this.h = arrayList;
        this.f25073n = gjVar;
    }

    public km(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f25071e = cVar;
        this.h = chat;
        this.f25072f = charSequence;
        this.f25069b = j3;
        this.f25070c = j10;
        this.d = i7;
        this.f25073n = iArr;
    }

    public km(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f25071e = cVar;
        this.f25072f = user;
        this.h = charSequence;
        this.f25069b = j3;
        this.f25070c = j10;
        this.d = i7;
        this.f25073n = iArr;
    }
}
