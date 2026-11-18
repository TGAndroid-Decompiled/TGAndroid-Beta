package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f25929a;
    public final mp f25930b;
    public final int f25931c;
    public final ArrayList d;
    public final boolean f25932e;
    public final TLRPC.TL_messages_peerDialogs f25933f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f25934n;

    public nj(mp mpVar, int i7, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.f25929a = i10;
        this.f25930b = mpVar;
        this.f25931c = i7;
        this.d = arrayList;
        this.f25932e = z10;
        this.f25933f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f25934n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nj.run():void");
    }
}
