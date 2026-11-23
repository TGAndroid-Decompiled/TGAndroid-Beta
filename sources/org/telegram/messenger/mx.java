package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class mx implements Runnable {
    public final az f25616a;
    public final TLRPC.TL_messages_forwardMessages f25617b;
    public final long f25618c;
    public final int d;
    public final boolean f25619e;
    public final boolean f25620f;
    public final a0.h h;
    public final ArrayList f25621n;
    public final ArrayList f25622r;
    public final gj f25623s;
    public final TLRPC.Peer f25624w;

    public mx(int i7, long j3, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, gj gjVar, az azVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z10, boolean z11) {
        this.f25616a = azVar;
        this.f25617b = tL_messages_forwardMessages;
        this.f25618c = j3;
        this.d = i7;
        this.f25619e = z10;
        this.f25620f = z11;
        this.h = hVar;
        this.f25621n = arrayList;
        this.f25622r = arrayList2;
        this.f25623s = gjVar;
        this.f25624w = peer;
    }

    @Override
    public final void run() {
        final az azVar = this.f25616a;
        ConnectionsManager connectionsManager = azVar.getConnectionsManager();
        final int i7 = this.d;
        final long j3 = this.f25618c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f25621n;
        final ArrayList arrayList2 = this.f25622r;
        final gj gjVar = this.f25623s;
        final TLRPC.Peer peer = this.f25624w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f25617b;
        final boolean z10 = this.f25619e;
        final boolean z11 = this.f25620f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hy.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
