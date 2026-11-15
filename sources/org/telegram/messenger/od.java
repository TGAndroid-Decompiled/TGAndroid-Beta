package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class od implements Runnable {
    public final int f25742a;
    public final long f25743b;
    public final Object f25744c;

    public od(Object obj, long j3, int i7) {
        this.f25742a = i7;
        this.f25744c = obj;
        this.f25743b = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f25742a;
        long j3 = this.f25743b;
        Object obj = this.f25744c;
        switch (i7) {
            case 0:
                rd rdVar = (rd) obj;
                ArrayList arrayList = rdVar.f26270b;
                a0.h hVar = rdVar.f26269a;
                qd qdVar = (qd) hVar.f(j3);
                hVar.l(j3);
                if (qdVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = rdVar.getMessagesController().j1(qdVar.f26078a);
                    tL_messages_editMessage.f28135id = qdVar.f26079b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    rdVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new jd(rdVar, 0));
                    arrayList.remove(qdVar);
                    rdVar.l(qdVar, 1);
                    g0.h3(new kd(rdVar, qdVar, 0));
                    if (arrayList.isEmpty()) {
                        rdVar.r(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                fz fzVar = (fz) obj;
                fzVar.f23578e = SystemClock.elapsedRealtime();
                fzVar.f23577c = false;
                if (j3 == -1) {
                    fzVar.d = false;
                    fzVar.f23576b = 0L;
                } else {
                    fzVar.f23576b = j3;
                    fzVar.d = true;
                }
                ns.e().k(278, fzVar);
                return;
        }
    }
}
