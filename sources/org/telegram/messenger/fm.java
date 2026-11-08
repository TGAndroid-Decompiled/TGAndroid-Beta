package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fm implements Runnable {
    public final int f22437a = 3;
    public final long f22438b;
    public final long f22439c;
    public final int d;
    public final Object f22440e;
    public final Object f22441f;
    public final Object h;
    public final Object f22442n;

    public fm(qp qpVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f22440e = qpVar;
        this.f22441f = updates_channeldifference;
        this.f22438b = j3;
        this.h = chat;
        this.f22442n = hVar;
        this.d = i7;
        this.f22439c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fm.run():void");
    }

    public fm(gz gzVar, long j3, long j10, int i7, TLRPC.Message message, ArrayList arrayList, ij ijVar) {
        this.f22440e = gzVar;
        this.f22438b = j3;
        this.f22439c = j10;
        this.d = i7;
        this.f22441f = message;
        this.h = arrayList;
        this.f22442n = ijVar;
    }

    public fm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f22440e = cVar;
        this.h = chat;
        this.f22441f = charSequence;
        this.f22438b = j3;
        this.f22439c = j10;
        this.d = i7;
        this.f22442n = iArr;
    }

    public fm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f22440e = cVar;
        this.f22441f = user;
        this.h = charSequence;
        this.f22438b = j3;
        this.f22439c = j10;
        this.d = i7;
        this.f22442n = iArr;
    }
}
