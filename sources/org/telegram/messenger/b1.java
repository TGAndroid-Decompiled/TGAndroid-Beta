package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final int f22639a;
    public final Object f22640b;
    public final int f22641c;
    public final long d;
    public final int f22642e;
    public final Object f22643f;

    public b1(int i7, int i10, long j3, ArrayList arrayList, vr vrVar) {
        this.f22639a = 4;
        this.f22640b = vrVar;
        this.d = j3;
        this.f22643f = arrayList;
        this.f22641c = i7;
        this.f22642e = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b1.run():void");
    }

    public b1(c cVar, TLObject tLObject, int i7, long j3, int i10, int i11) {
        this.f22639a = i11;
        this.f22640b = cVar;
        this.f22643f = tLObject;
        this.f22641c = i7;
        this.d = j3;
        this.f22642e = i10;
    }

    public b1(si siVar, ArrayList arrayList, int i7, int i10, long j3) {
        this.f22639a = 2;
        this.f22640b = siVar;
        this.f22643f = arrayList;
        this.f22641c = i7;
        this.f22642e = i10;
        this.d = j3;
    }

    public b1(vr vrVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i10) {
        this.f22639a = 3;
        this.f22640b = vrVar;
        this.f22641c = i7;
        this.f22643f = tL_forumTopic;
        this.d = j3;
        this.f22642e = i10;
    }
}
