package bg;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.messenger.gj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;
public final class w {
    public final u f3369a = new u();
    public final u f3370b = new u();
    public final v f3371c = new u();
    public final v d = new u();
    public final v f3372e = new u();

    public final void a(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i7, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.f3372e.f3359a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = x.b(ephemeralMessage);
            gj gjVar = new gj(i7, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true);
            b10.edit_date = ConnectionsManager.getInstance(i7).getCurrentTime();
            b10.flags |= 32768;
            u.a(this.f3370b, ephemeralMessage, b10, gjVar);
        } else {
            this.d.f3359a.add(ephemeralMessage);
        }
    }

    public final void b(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i7, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.f3372e.f3359a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = x.b(ephemeralMessage);
            u.a(this.f3369a, ephemeralMessage, b10, new gj(i7, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true));
        } else {
            this.f3371c.f3359a.add(ephemeralMessage);
        }
    }
}
