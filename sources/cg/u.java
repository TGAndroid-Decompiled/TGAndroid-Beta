package cg;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;
public final class u {
    public final s f4749a = new s();
    public final s f4750b = new s();
    public final t f4751c = new s();
    public final t d = new s();
    public final t f4752e = new s();

    public final void a(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i3, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.f4752e.f4738a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = v.b(ephemeralMessage);
            zi ziVar = new zi(i3, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true);
            b10.edit_date = ConnectionsManager.getInstance(i3).getCurrentTime();
            b10.flags |= 32768;
            s.a(this.f4750b, ephemeralMessage, b10, ziVar);
        } else {
            this.d.f4738a.add(ephemeralMessage);
        }
    }

    public final void b(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i3, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.f4752e.f4738a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = v.b(ephemeralMessage);
            s.a(this.f4749a, ephemeralMessage, b10, new zi(i3, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true));
        } else {
            this.f4751c.f4738a.add(ephemeralMessage);
        }
    }
}
