package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f17906a = 1;
    public final int f17907b;
    public final long f17908c;
    public final long d;
    public final int e;
    public final int f17909f;
    public final boolean h;
    public final f1 f17910n;
    public final Object f17911r;

    public sg(ui uiVar, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f17910n = uiVar;
        this.f17907b = i10;
        this.f17911r = arrayList;
        this.h = z10;
        this.f17908c = j10;
        this.e = i11;
        this.f17909f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sg.run():void");
    }

    public sg(hs hsVar, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f17910n = hsVar;
        this.f17907b = i10;
        this.f17911r = messages_messages;
        this.f17908c = j10;
        this.d = j11;
        this.e = i11;
        this.f17909f = i12;
        this.h = z10;
    }
}
