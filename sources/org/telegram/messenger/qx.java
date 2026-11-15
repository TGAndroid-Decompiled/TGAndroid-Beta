package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class qx implements Runnable {
    public final ez f26146a;
    public final TLRPC.TL_messages_forwardMessages f26147b;
    public final long f26148c;
    public final int d;
    public final boolean f26149e;
    public final boolean f26150f;
    public final a0.h h;
    public final ArrayList f26151n;
    public final ArrayList f26152r;
    public final gj f26153s;
    public final TLRPC.Peer f26154w;

    public qx(int i7, long j3, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, gj gjVar, ez ezVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z10, boolean z11) {
        this.f26146a = ezVar;
        this.f26147b = tL_messages_forwardMessages;
        this.f26148c = j3;
        this.d = i7;
        this.f26149e = z10;
        this.f26150f = z11;
        this.h = hVar;
        this.f26151n = arrayList;
        this.f26152r = arrayList2;
        this.f26153s = gjVar;
        this.f26154w = peer;
    }

    @Override
    public final void run() {
        final ez ezVar = this.f26146a;
        ConnectionsManager connectionsManager = ezVar.getConnectionsManager();
        final int i7 = this.d;
        final long j3 = this.f26148c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f26151n;
        final ArrayList arrayList2 = this.f26152r;
        final gj gjVar = this.f26153s;
        final TLRPC.Peer peer = this.f26154w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f26147b;
        final boolean z10 = this.f26149e;
        final boolean z11 = this.f26150f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ly.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
