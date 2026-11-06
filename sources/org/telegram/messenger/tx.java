package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class tx implements Runnable {
    public final gz f25688a;
    public final TLRPC.TL_messages_forwardMessages f25689b;
    public final long f25690c;
    public final int d;
    public final boolean f25691e;
    public final boolean f25692f;
    public final a0.h h;
    public final ArrayList f25693n;
    public final ArrayList f25694r;
    public final ij f25695s;
    public final TLRPC.Peer f25696w;

    public tx(int i7, long j3, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, ij ijVar, gz gzVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z9, boolean z10) {
        this.f25688a = gzVar;
        this.f25689b = tL_messages_forwardMessages;
        this.f25690c = j3;
        this.d = i7;
        this.f25691e = z9;
        this.f25692f = z10;
        this.h = hVar;
        this.f25693n = arrayList;
        this.f25694r = arrayList2;
        this.f25695s = ijVar;
        this.f25696w = peer;
    }

    @Override
    public final void run() {
        final gz gzVar = this.f25688a;
        ConnectionsManager connectionsManager = gzVar.getConnectionsManager();
        final int i7 = this.d;
        final long j3 = this.f25690c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f25693n;
        final ArrayList arrayList2 = this.f25694r;
        final ij ijVar = this.f25695s;
        final TLRPC.Peer peer = this.f25696w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f25689b;
        final boolean z9 = this.f25691e;
        final boolean z10 = this.f25692f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ny.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
