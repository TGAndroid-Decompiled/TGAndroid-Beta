package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tg implements Runnable {
    public final int f18257a = 1;
    public final int f18258b;
    public final long f18259c;
    public final long d;
    public final int e;
    public final int f18260f;
    public final boolean h;
    public final f1 f18261n;
    public final Object f18262r;

    public tg(vi viVar, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f18261n = viVar;
        this.f18258b = i10;
        this.f18262r = arrayList;
        this.h = z10;
        this.f18259c = j10;
        this.e = i11;
        this.f18260f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tg.run():void");
    }

    public tg(is isVar, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f18261n = isVar;
        this.f18258b = i10;
        this.f18262r = messages_messages;
        this.f18259c = j10;
        this.d = j11;
        this.e = i11;
        this.f18260f = i12;
        this.h = z10;
    }
}
