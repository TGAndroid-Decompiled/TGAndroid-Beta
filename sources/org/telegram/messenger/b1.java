package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final int f23011a;
    public final Object f23012b;
    public final int f23013c;
    public final long d;
    public final int f23014e;
    public final Object f23015f;

    public b1(int i7, int i10, long j3, ArrayList arrayList, tr trVar) {
        this.f23011a = 4;
        this.f23012b = trVar;
        this.d = j3;
        this.f23015f = arrayList;
        this.f23013c = i7;
        this.f23014e = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b1.run():void");
    }

    public b1(c cVar, TLObject tLObject, int i7, long j3, int i10, int i11) {
        this.f23011a = i11;
        this.f23012b = cVar;
        this.f23015f = tLObject;
        this.f23013c = i7;
        this.d = j3;
        this.f23014e = i10;
    }

    public b1(ri riVar, ArrayList arrayList, int i7, int i10, long j3) {
        this.f23011a = 2;
        this.f23012b = riVar;
        this.f23015f = arrayList;
        this.f23013c = i7;
        this.f23014e = i10;
        this.d = j3;
    }

    public b1(tr trVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i10) {
        this.f23011a = 3;
        this.f23012b = trVar;
        this.f23013c = i7;
        this.f23015f = tL_forumTopic;
        this.d = j3;
        this.f23014e = i10;
    }
}
