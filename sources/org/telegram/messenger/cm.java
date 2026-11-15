package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cm implements Runnable {
    public final int f22906a = 3;
    public final long f22907b;
    public final long f22908c;
    public final int d;
    public final Object f22909e;
    public final Object f22910f;
    public final Object h;
    public final Object f22911n;

    public cm(np npVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f22909e = npVar;
        this.f22910f = updates_channeldifference;
        this.f22907b = j3;
        this.h = chat;
        this.f22911n = hVar;
        this.d = i7;
        this.f22908c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cm.run():void");
    }

    public cm(ez ezVar, long j3, long j10, int i7, TLRPC.Message message, ArrayList arrayList, gj gjVar) {
        this.f22909e = ezVar;
        this.f22907b = j3;
        this.f22908c = j10;
        this.d = i7;
        this.f22910f = message;
        this.h = arrayList;
        this.f22911n = gjVar;
    }

    public cm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f22909e = cVar;
        this.h = chat;
        this.f22910f = charSequence;
        this.f22907b = j3;
        this.f22908c = j10;
        this.d = i7;
        this.f22911n = iArr;
    }

    public cm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f22909e = cVar;
        this.f22910f = user;
        this.h = charSequence;
        this.f22907b = j3;
        this.f22908c = j10;
        this.d = i7;
        this.f22911n = iArr;
    }
}
