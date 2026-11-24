package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class m2a implements Runnable {
    public final z3a a;
    public final TLRPC.TL_messages_forwardMessages b;
    public final long c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final vf6 h;
    public final ArrayList n;
    public final ArrayList r;
    public final k27 s;
    public final TLRPC.Peer w;

    public m2a(int i, long j, vf6 vf6Var, k27 k27Var, z3a z3aVar, ArrayList arrayList, ArrayList arrayList2, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z, boolean z2) {
        this.a = z3aVar;
        this.b = tL_messages_forwardMessages;
        this.c = j;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.h = vf6Var;
        this.n = arrayList;
        this.r = arrayList2;
        this.s = k27Var;
        this.w = peer;
    }

    @Override
    public final void run() {
        final z3a z3aVar = this.a;
        ConnectionsManager connectionsManager = z3aVar.getConnectionsManager();
        final int i = this.d;
        final long j = this.c;
        final vf6 vf6Var = this.h;
        final k27 k27Var = this.s;
        final ArrayList arrayList = this.n;
        final ArrayList arrayList2 = this.r;
        final TLRPC.Peer peer = this.w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.b;
        final boolean z = this.e;
        final boolean z2 = this.f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.g3a.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
