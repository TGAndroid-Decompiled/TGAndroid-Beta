package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xj implements Runnable {
    public final int f26490a;
    public final qp f26491b;
    public final int f26492c;
    public final ArrayList d;
    public final boolean f26493e;
    public final TLRPC.TL_messages_peerDialogs f26494f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f26495n;

    public xj(qp qpVar, int i7, ArrayList arrayList, boolean z9, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.f26490a = i10;
        this.f26491b = qpVar;
        this.f26492c = i7;
        this.d = arrayList;
        this.f26493e = z9;
        this.f26494f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f26495n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xj.run():void");
    }
}
