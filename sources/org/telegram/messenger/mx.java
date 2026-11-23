package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class mx implements Runnable {
    public final az f25652a;
    public final TLRPC.TL_messages_forwardMessages f25653b;
    public final long f25654c;
    public final int d;
    public final boolean f25655e;
    public final boolean f25656f;
    public final a0.h h;
    public final ArrayList f25657n;
    public final ArrayList f25658r;
    public final gj f25659s;
    public final TLRPC.Peer f25660w;

    public mx(int i7, long j3, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, gj gjVar, az azVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z10, boolean z11) {
        this.f25652a = azVar;
        this.f25653b = tL_messages_forwardMessages;
        this.f25654c = j3;
        this.d = i7;
        this.f25655e = z10;
        this.f25656f = z11;
        this.h = hVar;
        this.f25657n = arrayList;
        this.f25658r = arrayList2;
        this.f25659s = gjVar;
        this.f25660w = peer;
    }

    @Override
    public final void run() {
        final az azVar = this.f25652a;
        ConnectionsManager connectionsManager = azVar.getConnectionsManager();
        final int i7 = this.d;
        final long j3 = this.f25654c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f25657n;
        final ArrayList arrayList2 = this.f25658r;
        final gj gjVar = this.f25659s;
        final TLRPC.Peer peer = this.f25660w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f25653b;
        final boolean z10 = this.f25655e;
        final boolean z11 = this.f25656f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hy.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
