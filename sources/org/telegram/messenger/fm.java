package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fm implements Runnable {
    public final int f22411a = 3;
    public final long f22412b;
    public final long f22413c;
    public final int d;
    public final Object f22414e;
    public final Object f22415f;
    public final Object h;
    public final Object f22416n;

    public fm(qp qpVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f22414e = qpVar;
        this.f22415f = updates_channeldifference;
        this.f22412b = j3;
        this.h = chat;
        this.f22416n = hVar;
        this.d = i7;
        this.f22413c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fm.run():void");
    }

    public fm(gz gzVar, long j3, long j10, int i7, TLRPC.Message message, ArrayList arrayList, ij ijVar) {
        this.f22414e = gzVar;
        this.f22412b = j3;
        this.f22413c = j10;
        this.d = i7;
        this.f22415f = message;
        this.h = arrayList;
        this.f22416n = ijVar;
    }

    public fm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f22414e = cVar;
        this.h = chat;
        this.f22415f = charSequence;
        this.f22412b = j3;
        this.f22413c = j10;
        this.d = i7;
        this.f22416n = iArr;
    }

    public fm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f22414e = cVar;
        this.f22415f = user;
        this.h = charSequence;
        this.f22412b = j3;
        this.f22413c = j10;
        this.d = i7;
        this.f22416n = iArr;
    }
}
