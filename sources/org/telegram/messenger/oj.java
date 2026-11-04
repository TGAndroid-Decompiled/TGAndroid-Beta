package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f24551a;
    public final hp f24552b;
    public final int f24553c;
    public final ArrayList d;
    public final boolean f24554e;
    public final TLRPC.TL_messages_peerDialogs f24555f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f24556n;

    public oj(hp hpVar, int i3, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.f24551a = i10;
        this.f24552b = hpVar;
        this.f24553c = i3;
        this.d = arrayList;
        this.f24554e = z10;
        this.f24555f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f24556n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.oj.run():void");
    }
}
