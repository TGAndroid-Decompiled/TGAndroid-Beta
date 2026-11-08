package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class sx implements Runnable {
    public final gz f25529a;
    public final TLRPC.TL_messages_forwardMessages f25530b;
    public final long f25531c;
    public final int d;
    public final boolean f25532e;
    public final boolean f25533f;
    public final a0.h h;
    public final ArrayList f25534n;
    public final ArrayList f25535r;
    public final ij f25536s;
    public final TLRPC.Peer f25537w;

    public sx(int i7, long j3, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, ij ijVar, gz gzVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z9, boolean z10) {
        this.f25529a = gzVar;
        this.f25530b = tL_messages_forwardMessages;
        this.f25531c = j3;
        this.d = i7;
        this.f25532e = z9;
        this.f25533f = z10;
        this.h = hVar;
        this.f25534n = arrayList;
        this.f25535r = arrayList2;
        this.f25536s = ijVar;
        this.f25537w = peer;
    }

    @Override
    public final void run() {
        final gz gzVar = this.f25529a;
        ConnectionsManager connectionsManager = gzVar.getConnectionsManager();
        final int i7 = this.d;
        final long j3 = this.f25531c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f25534n;
        final ArrayList arrayList2 = this.f25535r;
        final ij ijVar = this.f25536s;
        final TLRPC.Peer peer = this.f25537w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f25530b;
        final boolean z9 = this.f25532e;
        final boolean z10 = this.f25533f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ny.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
