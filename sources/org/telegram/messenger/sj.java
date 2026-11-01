package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sj implements Runnable {
    public final int f18100a;
    public final wp f18101b;
    public final int f18102c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f18103f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f18104n;

    public sj(wp wpVar, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f18100a = i11;
        this.f18101b = wpVar;
        this.f18102c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f18103f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f18104n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sj.run():void");
    }
}
