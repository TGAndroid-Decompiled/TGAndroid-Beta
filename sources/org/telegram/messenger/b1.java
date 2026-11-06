package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final int f21568a;
    public final Object f21569b;
    public final int f21570c;
    public final long d;
    public final int f21571e;
    public final Object f21572f;

    public b1(int i7, int i10, long j3, ArrayList arrayList, yr yrVar) {
        this.f21568a = 4;
        this.f21569b = yrVar;
        this.d = j3;
        this.f21572f = arrayList;
        this.f21570c = i7;
        this.f21571e = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b1.run():void");
    }

    public b1(c cVar, TLObject tLObject, int i7, long j3, int i10, int i11) {
        this.f21568a = i11;
        this.f21569b = cVar;
        this.f21572f = tLObject;
        this.f21570c = i7;
        this.d = j3;
        this.f21571e = i10;
    }

    public b1(ui uiVar, ArrayList arrayList, int i7, int i10, long j3) {
        this.f21568a = 2;
        this.f21569b = uiVar;
        this.f21572f = arrayList;
        this.f21570c = i7;
        this.f21571e = i10;
        this.d = j3;
    }

    public b1(yr yrVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i10) {
        this.f21568a = 3;
        this.f21569b = yrVar;
        this.f21570c = i7;
        this.f21572f = tL_forumTopic;
        this.d = j3;
        this.f21571e = i10;
    }
}
