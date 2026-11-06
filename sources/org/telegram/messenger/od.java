package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class od implements Runnable {
    public final int f24309a;
    public final long f24310b;
    public final Object f24311c;

    public od(Object obj, long j3, int i7) {
        this.f24309a = i7;
        this.f24311c = obj;
        this.f24310b = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f24309a;
        long j3 = this.f24310b;
        Object obj = this.f24311c;
        switch (i7) {
            case 0:
                sd sdVar = (sd) obj;
                ArrayList arrayList = sdVar.f25442b;
                a0.h hVar = sdVar.f25441a;
                rd rdVar = (rd) hVar.f(j3);
                hVar.l(j3);
                if (rdVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = sdVar.getMessagesController().j1(rdVar.f25265a);
                    tL_messages_editMessage.f27036id = rdVar.f25266b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    sdVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new jd(sdVar, 0));
                    arrayList.remove(rdVar);
                    sdVar.l(rdVar, 1);
                    g0.h3(new kd(sdVar, rdVar, 0));
                    if (arrayList.isEmpty()) {
                        sdVar.r(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                hz hzVar = (hz) obj;
                hzVar.f22999e = SystemClock.elapsedRealtime();
                hzVar.f22998c = false;
                if (j3 == -1) {
                    hzVar.d = false;
                    hzVar.f22997b = 0L;
                } else {
                    hzVar.f22997b = j3;
                    hzVar.d = true;
                }
                qs.e().k(278, hzVar);
                return;
        }
    }
}
