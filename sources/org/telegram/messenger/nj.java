package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f25931a;
    public final mp f25932b;
    public final int f25933c;
    public final ArrayList d;
    public final boolean f25934e;
    public final TLRPC.TL_messages_peerDialogs f25935f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f25936n;

    public nj(mp mpVar, int i7, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.f25931a = i10;
        this.f25932b = mpVar;
        this.f25933c = i7;
        this.d = arrayList;
        this.f25934e = z10;
        this.f25935f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f25936n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nj.run():void");
    }
}
