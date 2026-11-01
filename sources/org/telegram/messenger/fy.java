package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class fy implements Runnable {
    public final rz f15820a;
    public final TLRPC.TL_messages_forwardMessages f15821b;
    public final long f15822c;
    public final int d;
    public final boolean e;
    public final boolean f15823f;
    public final a0.h h;
    public final ArrayList f15824n;
    public final ArrayList f15825r;
    public final kj f15826s;
    public final TLRPC.Peer f15827w;

    public fy(int i10, long j10, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, kj kjVar, rz rzVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z10, boolean z11) {
        this.f15820a = rzVar;
        this.f15821b = tL_messages_forwardMessages;
        this.f15822c = j10;
        this.d = i10;
        this.e = z10;
        this.f15823f = z11;
        this.h = hVar;
        this.f15824n = arrayList;
        this.f15825r = arrayList2;
        this.f15826s = kjVar;
        this.f15827w = peer;
    }

    @Override
    public final void run() {
        final rz rzVar = this.f15820a;
        ConnectionsManager connectionsManager = rzVar.getConnectionsManager();
        final int i10 = this.d;
        final long j10 = this.f15822c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f15824n;
        final ArrayList arrayList2 = this.f15825r;
        final kj kjVar = this.f15826s;
        final TLRPC.Peer peer = this.f15827w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f15821b;
        final boolean z10 = this.e;
        final boolean z11 = this.f15823f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yy.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
