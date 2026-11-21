package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f25957a;
    public final mp f25958b;
    public final int f25959c;
    public final ArrayList d;
    public final boolean f25960e;
    public final TLRPC.TL_messages_peerDialogs f25961f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f25962n;

    public nj(mp mpVar, int i7, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.f25957a = i10;
        this.f25958b = mpVar;
        this.f25959c = i7;
        this.d = arrayList;
        this.f25960e = z10;
        this.f25961f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f25962n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nj.run():void");
    }
}
