package bg;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.messenger.gj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;
public final class v {
    public final t f3342a = new t();
    public final t f3343b = new t();
    public final u f3344c = new t();
    public final u d = new t();
    public final u f3345e = new t();

    public final void a(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i7, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.f3345e.f3332a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = w.b(ephemeralMessage);
            gj gjVar = new gj(i7, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true);
            b10.edit_date = ConnectionsManager.getInstance(i7).getCurrentTime();
            b10.flags |= 32768;
            t.a(this.f3343b, ephemeralMessage, b10, gjVar);
        } else {
            this.d.f3332a.add(ephemeralMessage);
        }
    }

    public final void b(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i7, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.f3345e.f3332a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = w.b(ephemeralMessage);
            t.a(this.f3342a, ephemeralMessage, b10, new gj(i7, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true));
        } else {
            this.f3344c.f3332a.add(ephemeralMessage);
        }
    }
}
