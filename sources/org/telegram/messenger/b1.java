package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final int f22989a;
    public final Object f22990b;
    public final int f22991c;
    public final long d;
    public final int f22992e;
    public final Object f22993f;

    public b1(int i7, int i10, long j3, ArrayList arrayList, ur urVar) {
        this.f22989a = 4;
        this.f22990b = urVar;
        this.d = j3;
        this.f22993f = arrayList;
        this.f22991c = i7;
        this.f22992e = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b1.run():void");
    }

    public b1(c cVar, TLObject tLObject, int i7, long j3, int i10, int i11) {
        this.f22989a = i11;
        this.f22990b = cVar;
        this.f22993f = tLObject;
        this.f22991c = i7;
        this.d = j3;
        this.f22992e = i10;
    }

    public b1(si siVar, ArrayList arrayList, int i7, int i10, long j3) {
        this.f22989a = 2;
        this.f22990b = siVar;
        this.f22993f = arrayList;
        this.f22991c = i7;
        this.f22992e = i10;
        this.d = j3;
    }

    public b1(ur urVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i10) {
        this.f22989a = 3;
        this.f22990b = urVar;
        this.f22991c = i7;
        this.f22993f = tL_forumTopic;
        this.d = j3;
        this.f22992e = i10;
    }
}
