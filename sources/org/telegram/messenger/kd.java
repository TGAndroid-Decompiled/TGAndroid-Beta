package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kd implements Runnable {
    public final int f16565a;
    public final long f16566b;
    public final Object f16567c;

    public kd(Object obj, long j10, int i10) {
        this.f16565a = i10;
        this.f16567c = obj;
        this.f16566b = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f16565a;
        long j10 = this.f16566b;
        Object obj = this.f16567c;
        switch (i10) {
            case 0:
                nd ndVar = (nd) obj;
                ArrayList arrayList = ndVar.f17083b;
                a0.h hVar = ndVar.f17082a;
                md mdVar = (md) hVar.f(j10);
                hVar.l(j10);
                if (mdVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = ndVar.getMessagesController().i1(mdVar.f16940a);
                    tL_messages_editMessage.f19877id = mdVar.f16941b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    ndVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new fd(ndVar, 0));
                    arrayList.remove(mdVar);
                    ndVar.l(mdVar, 1);
                    i0.g3(new gd(ndVar, mdVar, 0));
                    if (arrayList.isEmpty()) {
                        ndVar.r(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                sz szVar = (sz) obj;
                szVar.e = SystemClock.elapsedRealtime();
                szVar.f17976c = false;
                if (j10 == -1) {
                    szVar.d = false;
                    szVar.f17975b = 0L;
                } else {
                    szVar.f17975b = j10;
                    szVar.d = true;
                }
                zs.e().k(278, szVar);
                return;
        }
    }
}
