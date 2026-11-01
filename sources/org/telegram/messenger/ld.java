package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ld implements Runnable {
    public final int f16930a;
    public final long f16931b;
    public final Object f16932c;

    public ld(Object obj, long j10, int i10) {
        this.f16930a = i10;
        this.f16932c = obj;
        this.f16931b = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f16930a;
        long j10 = this.f16931b;
        Object obj = this.f16932c;
        switch (i10) {
            case 0:
                od odVar = (od) obj;
                ArrayList arrayList = odVar.f17420b;
                a0.h hVar = odVar.f17419a;
                nd ndVar = (nd) hVar.f(j10);
                hVar.l(j10);
                if (ndVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = odVar.getMessagesController().i1(ndVar.f17282a);
                    tL_messages_editMessage.f19878id = ndVar.f17283b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    odVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new gd(odVar, 0));
                    arrayList.remove(ndVar);
                    odVar.l(ndVar, 1);
                    i0.g3(new hd(odVar, ndVar, 0));
                    if (arrayList.isEmpty()) {
                        odVar.r(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                tz tzVar = (tz) obj;
                tzVar.e = SystemClock.elapsedRealtime();
                tzVar.f18327c = false;
                if (j10 == -1) {
                    tzVar.d = false;
                    tzVar.f18326b = 0L;
                } else {
                    tzVar.f18326b = j10;
                    tzVar.d = true;
                }
                at.e().k(278, tzVar);
                return;
        }
    }
}
