package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class tx implements Runnable {
    public final gz f25680a;
    public final TLRPC.TL_messages_forwardMessages f25681b;
    public final long f25682c;
    public final int d;
    public final boolean f25683e;
    public final boolean f25684f;
    public final a0.h h;
    public final ArrayList f25685n;
    public final ArrayList f25686r;
    public final ij f25687s;
    public final TLRPC.Peer f25688w;

    public tx(int i7, long j3, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, ij ijVar, gz gzVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z9, boolean z10) {
        this.f25680a = gzVar;
        this.f25681b = tL_messages_forwardMessages;
        this.f25682c = j3;
        this.d = i7;
        this.f25683e = z9;
        this.f25684f = z10;
        this.h = hVar;
        this.f25685n = arrayList;
        this.f25686r = arrayList2;
        this.f25687s = ijVar;
        this.f25688w = peer;
    }

    @Override
    public final void run() {
        final gz gzVar = this.f25680a;
        ConnectionsManager connectionsManager = gzVar.getConnectionsManager();
        final int i7 = this.d;
        final long j3 = this.f25682c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f25685n;
        final ArrayList arrayList2 = this.f25686r;
        final ij ijVar = this.f25687s;
        final TLRPC.Peer peer = this.f25688w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f25681b;
        final boolean z9 = this.f25683e;
        final boolean z10 = this.f25684f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ny.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
