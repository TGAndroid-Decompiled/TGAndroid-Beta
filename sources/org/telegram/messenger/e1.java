package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e1 implements Runnable {
    public final int f15493a;
    public final Object f15494b;
    public final int f15495c;
    public final long d;
    public final int e;
    public final Object f15496f;

    public e1(int i10, int i11, long j10, ArrayList arrayList, is isVar) {
        this.f15493a = 4;
        this.f15494b = isVar;
        this.d = j10;
        this.f15496f = arrayList;
        this.f15495c = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.e1.run():void");
    }

    public e1(c cVar, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.f15493a = i12;
        this.f15494b = cVar;
        this.f15496f = tLObject;
        this.f15495c = i10;
        this.d = j10;
        this.e = i11;
    }

    public e1(vi viVar, ArrayList arrayList, int i10, int i11, long j10) {
        this.f15493a = 2;
        this.f15494b = viVar;
        this.f15496f = arrayList;
        this.f15495c = i10;
        this.e = i11;
        this.d = j10;
    }

    public e1(is isVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.f15493a = 3;
        this.f15494b = isVar;
        this.f15495c = i10;
        this.f15496f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
