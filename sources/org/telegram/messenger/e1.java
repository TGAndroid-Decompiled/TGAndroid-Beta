package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e1 implements Runnable {
    public final int f15344a;
    public final Object f15345b;
    public final int f15346c;
    public final long d;
    public final int e;
    public final Object f15347f;

    public e1(int i10, int i11, long j10, ArrayList arrayList, hs hsVar) {
        this.f15344a = 4;
        this.f15345b = hsVar;
        this.d = j10;
        this.f15347f = arrayList;
        this.f15346c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.e1.run():void");
    }

    public e1(c cVar, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f15344a = i12;
        this.f15345b = cVar;
        this.f15347f = tLObject;
        this.f15346c = i10;
        this.d = j10;
        this.e = i11;
    }

    public e1(ui uiVar, ArrayList arrayList, int i10, int i11, long j10) {
        this.f15344a = 2;
        this.f15345b = uiVar;
        this.f15347f = arrayList;
        this.f15346c = i10;
        this.e = i11;
        this.d = j10;
    }

    public e1(hs hsVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f15344a = 3;
        this.f15345b = hsVar;
        this.f15346c = i10;
        this.f15347f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
