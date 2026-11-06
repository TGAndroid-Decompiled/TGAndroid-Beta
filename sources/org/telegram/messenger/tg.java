package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tg implements Runnable {
    public final int f25608a = 0;
    public final int f25609b;
    public final long f25610c;
    public final long d;
    public final int f25611e;
    public final int f25612f;
    public final boolean h;
    public final c1 f25613n;
    public final Object f25614r;

    public tg(ui uiVar, int i7, ArrayList arrayList, boolean z9, long j3, int i10, int i11, long j10) {
        this.f25613n = uiVar;
        this.f25609b = i7;
        this.f25614r = arrayList;
        this.h = z9;
        this.f25610c = j3;
        this.f25611e = i10;
        this.f25612f = i11;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tg.run():void");
    }

    public tg(yr yrVar, int i7, TLRPC.messages_Messages messages_messages, long j3, long j10, int i10, int i11, boolean z9) {
        this.f25613n = yrVar;
        this.f25609b = i7;
        this.f25614r = messages_messages;
        this.f25610c = j3;
        this.d = j10;
        this.f25611e = i10;
        this.f25612f = i11;
        this.h = z9;
    }
}
