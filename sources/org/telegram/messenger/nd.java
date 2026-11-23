package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nd implements Runnable {
    public final int f26005a;
    public final long f26006b;
    public final Object f26007c;

    public nd(Object obj, long j3, int i7) {
        this.f26005a = i7;
        this.f26007c = obj;
        this.f26006b = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26005a;
        long j3 = this.f26006b;
        Object obj = this.f26007c;
        switch (i7) {
            case 0:
                qd qdVar = (qd) obj;
                ArrayList arrayList = qdVar.f26492b;
                a0.h hVar = qdVar.f26491a;
                pd pdVar = (pd) hVar.f(j3);
                hVar.l(j3);
                if (pdVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = qdVar.getMessagesController().l1(pdVar.f26319a);
                    tL_messages_editMessage.f28576id = pdVar.f26320b;
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
                ((bi.d5) obj).a(Long.valueOf(j3));
                return;
            default:
                az azVar = (az) obj;
                azVar.f23099e = SystemClock.elapsedRealtime();
                azVar.f23098c = false;
                if (j3 == -1) {
                    azVar.d = false;
                    azVar.f23097b = 0L;
                } else {
                    azVar.f23097b = j3;
                    azVar.d = true;
                }
                ks.e().k(281, azVar);
                return;
        }
    }
}
