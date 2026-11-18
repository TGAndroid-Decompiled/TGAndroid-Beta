package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class lx implements Runnable {
    public final zy f25448a;
    public final TLRPC.TL_messages_forwardMessages f25449b;
    public final long f25450c;
    public final int d;
    public final boolean f25451e;
    public final boolean f25452f;
    public final a0.h h;
    public final ArrayList f25453n;
    public final ArrayList f25454r;
    public final fj f25455s;
    public final TLRPC.Peer f25456w;

    public lx(int i7, long j3, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, fj fjVar, zy zyVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z10, boolean z11) {
        this.f25448a = zyVar;
        this.f25449b = tL_messages_forwardMessages;
        this.f25450c = j3;
        this.d = i7;
        this.f25451e = z10;
        this.f25452f = z11;
        this.h = hVar;
        this.f25453n = arrayList;
        this.f25454r = arrayList2;
        this.f25455s = fjVar;
        this.f25456w = peer;
    }

    @Override
    public final void run() {
        final zy zyVar = this.f25448a;
        ConnectionsManager connectionsManager = zyVar.getConnectionsManager();
        final int i7 = this.d;
        final long j3 = this.f25450c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f25453n;
        final ArrayList arrayList2 = this.f25454r;
        final fj fjVar = this.f25455s;
        final TLRPC.Peer peer = this.f25456w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f25449b;
        final boolean z10 = this.f25451e;
        final boolean z11 = this.f25452f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gy.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
