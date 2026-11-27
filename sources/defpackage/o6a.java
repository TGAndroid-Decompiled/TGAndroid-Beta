package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class o6a implements Runnable {
    public final r7a a;
    public final TLRPC.TL_messages_forwardMessages b;
    public final long c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final zh6 h;
    public final ArrayList n;
    public final ArrayList r;
    public final r47 s;
    public final TLRPC.Peer w;

    public o6a(int i, long j, zh6 zh6Var, r47 r47Var, r7a r7aVar, ArrayList arrayList, ArrayList arrayList2, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z, boolean z2) {
        this.a = r7aVar;
        this.b = tL_messages_forwardMessages;
        this.c = j;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.h = zh6Var;
        this.n = arrayList;
        this.r = arrayList2;
        this.s = r47Var;
        this.w = peer;
    }

    @Override
    public final void run() {
        final r7a r7aVar = this.a;
        ConnectionsManager connectionsManager = r7aVar.getConnectionsManager();
        final int i = this.d;
        final long j = this.c;
        final zh6 zh6Var = this.h;
        final r47 r47Var = this.s;
        final ArrayList arrayList = this.n;
        final ArrayList arrayList2 = this.r;
        final TLRPC.Peer peer = this.w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.b;
        final boolean z = this.e;
        final boolean z2 = this.f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.b7a.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
