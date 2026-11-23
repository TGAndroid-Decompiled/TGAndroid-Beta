package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f26025a;
    public final mp f26026b;
    public final int f26027c;
    public final ArrayList d;
    public final boolean f26028e;
    public final TLRPC.TL_messages_peerDialogs f26029f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f26030n;

    public nj(mp mpVar, int i7, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.f26025a = i10;
        this.f26026b = mpVar;
        this.f26027c = i7;
        this.d = arrayList;
        this.f26028e = z10;
        this.f26029f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f26030n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nj.run():void");
    }
}
