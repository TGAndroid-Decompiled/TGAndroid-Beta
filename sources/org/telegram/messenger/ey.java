package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class ey implements Runnable {
    public final qz f15479a;
    public final TLRPC.TL_messages_forwardMessages f15480b;
    public final long f15481c;
    public final int d;
    public final boolean e;
    public final boolean f15482f;
    public final a0.h h;
    public final ArrayList f15483n;
    public final ArrayList f15484r;
    public final jj f15485s;
    public final TLRPC.Peer f15486w;

    public ey(int i10, long j10, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, jj jjVar, qz qzVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z10, boolean z11) {
        this.f15479a = qzVar;
        this.f15480b = tL_messages_forwardMessages;
        this.f15481c = j10;
        this.d = i10;
        this.e = z10;
        this.f15482f = z11;
        this.h = hVar;
        this.f15483n = arrayList;
        this.f15484r = arrayList2;
        this.f15485s = jjVar;
        this.f15486w = peer;
    }

    @Override
    public final void run() {
        final qz qzVar = this.f15479a;
        ConnectionsManager connectionsManager = qzVar.getConnectionsManager();
        final int i10 = this.d;
        final long j10 = this.f15481c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f15483n;
        final ArrayList arrayList2 = this.f15484r;
        final jj jjVar = this.f15485s;
        final TLRPC.Peer peer = this.f15486w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f15480b;
        final boolean z10 = this.e;
        final boolean z11 = this.f15482f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xy.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
