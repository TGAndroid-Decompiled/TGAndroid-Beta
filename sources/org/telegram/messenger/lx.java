package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class lx implements Runnable {
    public final zy f25446a;
    public final TLRPC.TL_messages_forwardMessages f25447b;
    public final long f25448c;
    public final int d;
    public final boolean f25449e;
    public final boolean f25450f;
    public final a0.h h;
    public final ArrayList f25451n;
    public final ArrayList f25452r;
    public final fj f25453s;
    public final TLRPC.Peer f25454w;

    public lx(int i7, long j3, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, fj fjVar, zy zyVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z10, boolean z11) {
        this.f25446a = zyVar;
        this.f25447b = tL_messages_forwardMessages;
        this.f25448c = j3;
        this.d = i7;
        this.f25449e = z10;
        this.f25450f = z11;
        this.h = hVar;
        this.f25451n = arrayList;
        this.f25452r = arrayList2;
        this.f25453s = fjVar;
        this.f25454w = peer;
    }

    @Override
    public final void run() {
        final zy zyVar = this.f25446a;
        ConnectionsManager connectionsManager = zyVar.getConnectionsManager();
        final int i7 = this.d;
        final long j3 = this.f25448c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f25451n;
        final ArrayList arrayList2 = this.f25452r;
        final fj fjVar = this.f25453s;
        final TLRPC.Peer peer = this.f25454w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f25447b;
        final boolean z10 = this.f25449e;
        final boolean z11 = this.f25450f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gy.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
