package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xj implements Runnable {
    public final int f26486a;
    public final qp f26487b;
    public final int f26488c;
    public final ArrayList d;
    public final boolean f26489e;
    public final TLRPC.TL_messages_peerDialogs f26490f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f26491n;

    public xj(qp qpVar, int i7, ArrayList arrayList, boolean z9, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.f26486a = i10;
        this.f26487b = qpVar;
        this.f26488c = i7;
        this.d = arrayList;
        this.f26489e = z9;
        this.f26490f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f26491n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xj.run():void");
    }
}
