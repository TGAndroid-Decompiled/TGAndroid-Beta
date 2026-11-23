package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class od implements Runnable {
    public final int f26072a;
    public final long f26073b;
    public final Object f26074c;

    public od(Object obj, long j3, int i7) {
        this.f26072a = i7;
        this.f26074c = obj;
        this.f26073b = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26072a;
        long j3 = this.f26073b;
        Object obj = this.f26074c;
        switch (i7) {
            case 0:
                rd rdVar = (rd) obj;
                ArrayList arrayList = rdVar.f26555b;
                a0.h hVar = rdVar.f26554a;
                qd qdVar = (qd) hVar.f(j3);
                hVar.l(j3);
                if (qdVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = rdVar.getMessagesController().l1(qdVar.f26398a);
                    tL_messages_editMessage.f28482id = qdVar.f26399b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    rdVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new jd(rdVar, 0));
                    arrayList.remove(qdVar);
                    rdVar.l(qdVar, 1);
                    g0.g3(new kd(rdVar, qdVar, 0));
                    if (arrayList.isEmpty()) {
                        rdVar.r(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((bi.d5) obj).a(Long.valueOf(j3));
                return;
            default:
                bz bzVar = (bz) obj;
                bzVar.f23164e = SystemClock.elapsedRealtime();
                bzVar.f23163c = false;
                if (j3 == -1) {
                    bzVar.d = false;
                    bzVar.f23162b = 0L;
                } else {
                    bzVar.f23162b = j3;
                    bzVar.d = true;
                }
                ls.e().k(281, bzVar);
                return;
        }
    }
}
