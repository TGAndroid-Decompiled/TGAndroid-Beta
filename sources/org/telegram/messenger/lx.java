package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class lx implements Runnable {
    public final zy f25474a;
    public final TLRPC.TL_messages_forwardMessages f25475b;
    public final long f25476c;
    public final int d;
    public final boolean f25477e;
    public final boolean f25478f;
    public final a0.h h;
    public final ArrayList f25479n;
    public final ArrayList f25480r;
    public final fj f25481s;
    public final TLRPC.Peer f25482w;

    public lx(int i7, long j3, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, fj fjVar, zy zyVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z10, boolean z11) {
        this.f25474a = zyVar;
        this.f25475b = tL_messages_forwardMessages;
        this.f25476c = j3;
        this.d = i7;
        this.f25477e = z10;
        this.f25478f = z11;
        this.h = hVar;
        this.f25479n = arrayList;
        this.f25480r = arrayList2;
        this.f25481s = fjVar;
        this.f25482w = peer;
    }

    @Override
    public final void run() {
        final zy zyVar = this.f25474a;
        ConnectionsManager connectionsManager = zyVar.getConnectionsManager();
        final int i7 = this.d;
        final long j3 = this.f25476c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f25479n;
        final ArrayList arrayList2 = this.f25480r;
        final fj fjVar = this.f25481s;
        final TLRPC.Peer peer = this.f25482w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f25475b;
        final boolean z10 = this.f25477e;
        final boolean z11 = this.f25478f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gy.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
