package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class sx implements Runnable {
    public final gz f25533a;
    public final TLRPC.TL_messages_forwardMessages f25534b;
    public final long f25535c;
    public final int d;
    public final boolean f25536e;
    public final boolean f25537f;
    public final a0.h h;
    public final ArrayList f25538n;
    public final ArrayList f25539r;
    public final ij f25540s;
    public final TLRPC.Peer f25541w;

    public sx(int i7, long j3, a0.h hVar, ArrayList arrayList, ArrayList arrayList2, ij ijVar, gz gzVar, TLRPC.Peer peer, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, boolean z9, boolean z10) {
        this.f25533a = gzVar;
        this.f25534b = tL_messages_forwardMessages;
        this.f25535c = j3;
        this.d = i7;
        this.f25536e = z9;
        this.f25537f = z10;
        this.h = hVar;
        this.f25538n = arrayList;
        this.f25539r = arrayList2;
        this.f25540s = ijVar;
        this.f25541w = peer;
    }

    @Override
    public final void run() {
        final gz gzVar = this.f25533a;
        ConnectionsManager connectionsManager = gzVar.getConnectionsManager();
        final int i7 = this.d;
        final long j3 = this.f25535c;
        final a0.h hVar = this.h;
        final ArrayList arrayList = this.f25538n;
        final ArrayList arrayList2 = this.f25539r;
        final ij ijVar = this.f25540s;
        final TLRPC.Peer peer = this.f25541w;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = this.f25534b;
        final boolean z9 = this.f25536e;
        final boolean z10 = this.f25537f;
        connectionsManager.sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(org.telegram.tgnet.TLObject r33, org.telegram.tgnet.TLRPC.TL_error r34) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ny.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
            }
        }, 68);
    }
}
