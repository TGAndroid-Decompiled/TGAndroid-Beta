package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class o4a implements Runnable {
    public final a6a a;
    public final TLRPC.TL_messages_forwardMessages b;
    public final long c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final vh6 h;
    public final ArrayList n;
    public final ArrayList r;
    public final k47 s;
    public final TLRPC.Peer w;

    public o4a(int i, long j, vh6 vh6Var, k47 k47Var, a6a a6aVar, ArrayList arrayList, ArrayList arrayList2, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z, boolean z2) {
        this.a = a6aVar;
        this.b = tL_messages_forwardMessages;
        this.c = j;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.h = vh6Var;
        this.n = arrayList;
        this.r = arrayList2;
        this.s = k47Var;
        this.w = peer;
    }

    @Override
    public final void run() {
        final a6a a6aVar = this.a;
        ConnectionsManager connectionsManager = a6aVar.getConnectionsManager();
        final int i = this.d;
        final long j = this.c;
        final vh6 vh6Var = this.h;
        final k47 k47Var = this.s;
        final ArrayList arrayList = this.n;
        final ArrayList arrayList2 = this.r;
        final TLRPC.Peer peer = this.w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.b;
        final boolean z = this.e;
        final boolean z2 = this.f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.i5a.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
