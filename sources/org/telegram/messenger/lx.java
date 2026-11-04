package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class lx implements Runnable {
    public final yy f24132a;
    public final TLRPC.TL_messages_forwardMessages f24133b;
    public final long f24134c;
    public final int d;
    public final boolean f24135e;
    public final boolean f24136f;
    public final a0.h h;
    public final ArrayList f24137n;
    public final ArrayList f24138r;
    public final zi f24139s;
    public final TLRPC.Peer f24140w;

    public lx(int i3, long j10, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, zi ziVar, yy yyVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z10, boolean z11) {
        this.f24132a = yyVar;
        this.f24133b = tL_messages_forwardMessages;
        this.f24134c = j10;
        this.d = i3;
        this.f24135e = z10;
        this.f24136f = z11;
        this.h = hVar;
        this.f24137n = arrayList;
        this.f24138r = arrayList2;
        this.f24139s = ziVar;
        this.f24140w = peer;
    }

    @Override
    public final void run() {
        final yy yyVar = this.f24132a;
        ConnectionsManager connectionsManager = yyVar.getConnectionsManager();
        final int i3 = this.d;
        final long j10 = this.f24134c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f24137n;
        final ArrayList arrayList2 = this.f24138r;
        final zi ziVar = this.f24139s;
        final TLRPC.Peer peer = this.f24140w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f24133b;
        final boolean z10 = this.f24135e;
        final boolean z11 = this.f24136f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fy.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
