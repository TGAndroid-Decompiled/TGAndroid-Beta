package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final int f21592a;
    public final Object f21593b;
    public final int f21594c;
    public final long d;
    public final int f21595e;
    public final Object f21596f;

    public b1(int i7, int i10, long j3, ArrayList arrayList, yr yrVar) {
        this.f21592a = 4;
        this.f21593b = yrVar;
        this.d = j3;
        this.f21596f = arrayList;
        this.f21594c = i7;
        this.f21595e = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b1.run():void");
    }

    public b1(c cVar, TLObject tLObject, int i7, long j3, int i10, int i11) {
        this.f21592a = i11;
        this.f21593b = cVar;
        this.f21596f = tLObject;
        this.f21594c = i7;
        this.d = j3;
        this.f21595e = i10;
    }

    public b1(ui uiVar, ArrayList arrayList, int i7, int i10, long j3) {
        this.f21592a = 2;
        this.f21593b = uiVar;
        this.f21596f = arrayList;
        this.f21594c = i7;
        this.f21595e = i10;
        this.d = j3;
    }

    public b1(yr yrVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i10) {
        this.f21592a = 3;
        this.f21593b = yrVar;
        this.f21594c = i7;
        this.f21596f = tL_forumTopic;
        this.d = j3;
        this.f21595e = i10;
    }
}
