package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f17736a;
    public final vp f17737b;
    public final int f17738c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f17739f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f17740n;

    public rj(vp vpVar, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f17736a = i11;
        this.f17737b = vpVar;
        this.f17738c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f17739f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f17740n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rj.run():void");
    }
}
