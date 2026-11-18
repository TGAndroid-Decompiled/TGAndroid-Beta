package bg;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.messenger.fj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;
public final class w {
    public final u f3350a = new u();
    public final u f3351b = new u();
    public final v f3352c = new u();
    public final v d = new u();
    public final v f3353e = new u();

    public final void a(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i7, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.f3353e.f3340a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = x.b(ephemeralMessage);
            fj fjVar = new fj(i7, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true);
            b10.edit_date = ConnectionsManager.getInstance(i7).getCurrentTime();
            b10.flags |= 32768;
            u.a(this.f3351b, ephemeralMessage, b10, fjVar);
        } else {
            this.d.f3340a.add(ephemeralMessage);
        }
    }

    public final void b(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i7, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.f3353e.f3340a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = x.b(ephemeralMessage);
            u.a(this.f3350a, ephemeralMessage, b10, new fj(i7, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true));
        } else {
            this.f3352c.f3340a.add(ephemeralMessage);
        }
    }
}
