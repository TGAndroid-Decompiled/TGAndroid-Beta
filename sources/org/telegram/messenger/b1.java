package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final int f23025a;
    public final Object f23026b;
    public final int f23027c;
    public final long d;
    public final int f23028e;
    public final Object f23029f;

    public b1(int i7, int i10, long j3, ArrayList arrayList, ur urVar) {
        this.f23025a = 4;
        this.f23026b = urVar;
        this.d = j3;
        this.f23029f = arrayList;
        this.f23027c = i7;
        this.f23028e = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b1.run():void");
    }

    public b1(c cVar, TLObject tLObject, int i7, long j3, int i10, int i11) {
        this.f23025a = i11;
        this.f23026b = cVar;
        this.f23029f = tLObject;
        this.f23027c = i7;
        this.d = j3;
        this.f23028e = i10;
    }

    public b1(si siVar, ArrayList arrayList, int i7, int i10, long j3) {
        this.f23025a = 2;
        this.f23026b = siVar;
        this.f23029f = arrayList;
        this.f23027c = i7;
        this.f23028e = i10;
        this.d = j3;
    }

    public b1(ur urVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i10) {
        this.f23025a = 3;
        this.f23026b = urVar;
        this.f23027c = i7;
        this.f23029f = tL_forumTopic;
        this.d = j3;
        this.f23028e = i10;
    }
}
