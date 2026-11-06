package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fm implements Runnable {
    public final int f22418a = 3;
    public final long f22419b;
    public final long f22420c;
    public final int d;
    public final Object f22421e;
    public final Object f22422f;
    public final Object h;
    public final Object f22423n;

    public fm(qp qpVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f22421e = qpVar;
        this.f22422f = updates_channeldifference;
        this.f22419b = j3;
        this.h = chat;
        this.f22423n = hVar;
        this.d = i7;
        this.f22420c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fm.run():void");
    }

    public fm(gz gzVar, long j3, long j10, int i7, TLRPC.Message message, ArrayList arrayList, ij ijVar) {
        this.f22421e = gzVar;
        this.f22419b = j3;
        this.f22420c = j10;
        this.d = i7;
        this.f22422f = message;
        this.h = arrayList;
        this.f22423n = ijVar;
    }

    public fm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f22421e = cVar;
        this.h = chat;
        this.f22422f = charSequence;
        this.f22419b = j3;
        this.f22420c = j10;
        this.d = i7;
        this.f22423n = iArr;
    }

    public fm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f22421e = cVar;
        this.f22422f = user;
        this.h = charSequence;
        this.f22419b = j3;
        this.f22420c = j10;
        this.d = i7;
        this.f22423n = iArr;
    }
}
