package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cm implements Runnable {
    public final int f22902a = 3;
    public final long f22903b;
    public final long f22904c;
    public final int d;
    public final Object f22905e;
    public final Object f22906f;
    public final Object h;
    public final Object f22907n;

    public cm(np npVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.h hVar, int i7, long j10) {
        this.f22905e = npVar;
        this.f22906f = updates_channeldifference;
        this.f22903b = j3;
        this.h = chat;
        this.f22907n = hVar;
        this.d = i7;
        this.f22904c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cm.run():void");
    }

    public cm(ez ezVar, long j3, long j10, int i7, TLRPC.Message message, ArrayList arrayList, gj gjVar) {
        this.f22905e = ezVar;
        this.f22903b = j3;
        this.f22904c = j10;
        this.d = i7;
        this.f22906f = message;
        this.h = arrayList;
        this.f22907n = gjVar;
    }

    public cm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f22905e = cVar;
        this.h = chat;
        this.f22906f = charSequence;
        this.f22903b = j3;
        this.f22904c = j10;
        this.d = i7;
        this.f22907n = iArr;
    }

    public cm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        this.f22905e = cVar;
        this.f22906f = user;
        this.h = charSequence;
        this.f22903b = j3;
        this.f22904c = j10;
        this.d = i7;
        this.f22907n = iArr;
    }
}
