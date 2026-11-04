package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f25958a = 3;
    public final long f25959b;
    public final long f25960c;
    public final int d;
    public final Object f25961e;
    public final Object f25962f;
    public final Object h;
    public final Object f25963n;

    public vl(hp hpVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i3, long j11) {
        this.f25961e = hpVar;
        this.f25962f = updates_channeldifference;
        this.f25959b = j10;
        this.h = chat;
        this.f25963n = hVar;
        this.d = i3;
        this.f25960c = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vl.run():void");
    }

    public vl(yy yyVar, long j10, long j11, int i3, TLRPC.Message message, ArrayList arrayList, zi ziVar) {
        this.f25961e = yyVar;
        this.f25959b = j10;
        this.f25960c = j11;
        this.d = i3;
        this.f25962f = message;
        this.h = arrayList;
        this.f25963n = ziVar;
    }

    public vl(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j10, long j11, int i3, int[] iArr) {
        this.f25961e = cVar;
        this.h = chat;
        this.f25962f = charSequence;
        this.f25959b = j10;
        this.f25960c = j11;
        this.d = i3;
        this.f25963n = iArr;
    }

    public vl(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j10, long j11, int i3, int[] iArr) {
        this.f25961e = cVar;
        this.f25962f = user;
        this.h = charSequence;
        this.f25959b = j10;
        this.f25960c = j11;
        this.d = i3;
        this.f25963n = iArr;
    }
}
