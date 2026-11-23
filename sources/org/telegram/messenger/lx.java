package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class lx implements Runnable {
    public final zy f25565a;
    public final TLRPC.TL_messages_forwardMessages f25566b;
    public final long f25567c;
    public final int d;
    public final boolean f25568e;
    public final boolean f25569f;
    public final a0.h h;
    public final ArrayList f25570n;
    public final ArrayList f25571r;
    public final fj f25572s;
    public final TLRPC.Peer f25573w;

    public lx(int i7, long j3, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, fj fjVar, zy zyVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z10, boolean z11) {
        this.f25565a = zyVar;
        this.f25566b = tL_messages_forwardMessages;
        this.f25567c = j3;
        this.d = i7;
        this.f25568e = z10;
        this.f25569f = z11;
        this.h = hVar;
        this.f25570n = arrayList;
        this.f25571r = arrayList2;
        this.f25572s = fjVar;
        this.f25573w = peer;
    }

    @Override
    public final void run() {
        final zy zyVar = this.f25565a;
        ConnectionsManager connectionsManager = zyVar.getConnectionsManager();
        final int i7 = this.d;
        final long j3 = this.f25567c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f25570n;
        final ArrayList arrayList2 = this.f25571r;
        final fj fjVar = this.f25572s;
        final TLRPC.Peer peer = this.f25573w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f25566b;
        final boolean z10 = this.f25568e;
        final boolean z11 = this.f25569f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gy.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
