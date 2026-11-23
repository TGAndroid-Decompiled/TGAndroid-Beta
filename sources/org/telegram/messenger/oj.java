package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f26092a;
    public final np f26093b;
    public final int f26094c;
    public final ArrayList d;
    public final boolean f26095e;
    public final TLRPC.TL_messages_peerDialogs f26096f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f26097n;

    public oj(np npVar, int i7, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.f26092a = i10;
        this.f26093b = npVar;
        this.f26094c = i7;
        this.d = arrayList;
        this.f26095e = z10;
        this.f26096f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f26097n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.oj.run():void");
    }
}
