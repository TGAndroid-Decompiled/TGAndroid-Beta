package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nd implements Runnable {
    public final int f25909a;
    public final long f25910b;
    public final Object f25911c;

    public nd(Object obj, long j3, int i7) {
        this.f25909a = i7;
        this.f25911c = obj;
        this.f25910b = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f25909a;
        long j3 = this.f25910b;
        Object obj = this.f25911c;
        switch (i7) {
            case 0:
                qd qdVar = (qd) obj;
                ArrayList arrayList = qdVar.f26380b;
                a0.h hVar = qdVar.f26379a;
                pd pdVar = (pd) hVar.f(j3);
                hVar.l(j3);
                if (pdVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = qdVar.getMessagesController().l1(pdVar.f26225a);
                    tL_messages_editMessage.f28487id = pdVar.f26226b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    qdVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new id(qdVar, 0));
                    arrayList.remove(pdVar);
                    qdVar.l(pdVar, 1);
                    g0.g3(new jd(qdVar, pdVar, 0));
                    if (arrayList.isEmpty()) {
                        qdVar.r(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((bi.x4) obj).a(Long.valueOf(j3));
                return;
            default:
                az azVar = (az) obj;
                azVar.f22988e = SystemClock.elapsedRealtime();
                azVar.f22987c = false;
                if (j3 == -1) {
                    azVar.d = false;
                    azVar.f22986b = 0L;
                } else {
                    azVar.f22986b = j3;
                    azVar.d = true;
                }
                ks.e().k(281, azVar);
                return;
        }
    }
}
