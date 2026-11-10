package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fm implements Runnable {
    public final int f22441a = 3;
    public final long f22442b;
    public final long f22443c;
    public final int d;
    public final Object f22444e;
    public final Object f22445f;
    public final Object h;
    public final Object f22446n;

    public fm(qp qpVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f22444e = qpVar;
        this.f22445f = updates_channeldifference;
        this.f22442b = j3;
        this.h = chat;
        this.f22446n = hVar;
        this.d = i7;
        this.f22443c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fm.run():void");
    }

    public fm(gz gzVar, long j3, long j10, int i7, TLRPC.Message message, ArrayList arrayList, ij ijVar) {
        this.f22444e = gzVar;
        this.f22442b = j3;
        this.f22443c = j10;
        this.d = i7;
        this.f22445f = message;
        this.h = arrayList;
        this.f22446n = ijVar;
    }

    public fm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f22444e = cVar;
        this.h = chat;
        this.f22445f = charSequence;
        this.f22442b = j3;
        this.f22443c = j10;
        this.d = i7;
        this.f22446n = iArr;
    }

    public fm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f22444e = cVar;
        this.f22445f = user;
        this.h = charSequence;
        this.f22442b = j3;
        this.f22443c = j10;
        this.d = i7;
        this.f22446n = iArr;
    }
}
