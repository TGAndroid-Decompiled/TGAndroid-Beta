package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class qx implements Runnable {
    public final ez f26138a;
    public final TLRPC.TL_messages_forwardMessages f26139b;
    public final long f26140c;
    public final int d;
    public final boolean f26141e;
    public final boolean f26142f;
    public final a0.h h;
    public final ArrayList f26143n;
    public final ArrayList f26144r;
    public final gj f26145s;
    public final TLRPC.Peer f26146w;

    public qx(int i7, long j3, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, gj gjVar, ez ezVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z10, boolean z11) {
        this.f26138a = ezVar;
        this.f26139b = tL_messages_forwardMessages;
        this.f26140c = j3;
        this.d = i7;
        this.f26141e = z10;
        this.f26142f = z11;
        this.h = hVar;
        this.f26143n = arrayList;
        this.f26144r = arrayList2;
        this.f26145s = gjVar;
        this.f26146w = peer;
    }

    @Override
    public final void run() {
        final ez ezVar = this.f26138a;
        ConnectionsManager connectionsManager = ezVar.getConnectionsManager();
        final int i7 = this.d;
        final long j3 = this.f26140c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f26143n;
        final ArrayList arrayList2 = this.f26144r;
        final gj gjVar = this.f26145s;
        final TLRPC.Peer peer = this.f26146w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f26139b;
        final boolean z10 = this.f26141e;
        final boolean z11 = this.f26142f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ly.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
