package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vj implements Runnable {
    public final int f27045a;
    public final np f27046b;
    public final int f27047c;
    public final ArrayList d;
    public final boolean f27048e;
    public final TLRPC.TL_messages_peerDialogs f27049f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f27050n;

    public vj(np npVar, int i7, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.f27045a = i10;
        this.f27046b = npVar;
        this.f27047c = i7;
        this.d = arrayList;
        this.f27048e = z10;
        this.f27049f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f27050n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vj.run():void");
    }
}
