package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final int f21697a;
    public final Object f21698b;
    public final int f21699c;
    public final long d;
    public final int f21700e;
    public final Object f21701f;

    public b1(int i3, int i10, long j10, ArrayList arrayList, qr qrVar) {
        this.f21697a = 4;
        this.f21698b = qrVar;
        this.d = j10;
        this.f21701f = arrayList;
        this.f21699c = i3;
        this.f21700e = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b1.run():void");
    }

    public b1(c cVar, TLObject tLObject, int i3, long j10, int i10, int i11) {
        this.f21697a = i11;
        this.f21698b = cVar;
        this.f21701f = tLObject;
        this.f21699c = i3;
        this.d = j10;
        this.f21700e = i10;
    }

    public b1(li liVar, ArrayList arrayList, int i3, int i10, long j10) {
        this.f21697a = 2;
        this.f21698b = liVar;
        this.f21701f = arrayList;
        this.f21699c = i3;
        this.f21700e = i10;
        this.d = j10;
    }

    public b1(qr qrVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i10) {
        this.f21697a = 3;
        this.f21698b = qrVar;
        this.f21699c = i3;
        this.f21701f = tL_forumTopic;
        this.d = j10;
        this.f21700e = i10;
    }
}
