package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class id implements Runnable {
    public final int f23530a;
    public final long f23531b;
    public final Object f23532c;

    public id(Object obj, long j10, int i3) {
        this.f23530a = i3;
        this.f23532c = obj;
        this.f23531b = j10;
    }

    @Override
    public final void run() {
        int i3 = this.f23530a;
        long j10 = this.f23531b;
        Object obj = this.f23532c;
        switch (i3) {
            case 0:
                ld ldVar = (ld) obj;
                ArrayList arrayList = ldVar.f23975b;
                a0.h hVar = ldVar.f23974a;
                kd kdVar = (kd) hVar.f(j10);
                hVar.l(j10);
                if (kdVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = ldVar.getMessagesController().j1(kdVar.f23810a);
                    tL_messages_editMessage.f27085id = kdVar.f23811b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    ldVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new dd(ldVar, 0));
                    arrayList.remove(kdVar);
                    ldVar.l(kdVar, 1);
                    g0.h3(new ed(ldVar, kdVar, 0));
                    if (arrayList.isEmpty()) {
                        ldVar.r(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                zy zyVar = (zy) obj;
                zyVar.f26996e = SystemClock.elapsedRealtime();
                zyVar.f26995c = false;
                if (j10 == -1) {
                    zyVar.d = false;
                    zyVar.f26994b = 0L;
                } else {
                    zyVar.f26994b = j10;
                    zyVar.d = true;
                }
                hs.e().k(278, zyVar);
                return;
        }
    }
}
