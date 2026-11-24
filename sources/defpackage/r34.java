package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;
public final class r34 {
    public final p34 a = new p34();
    public final p34 b = new p34();
    public final q34 c = new p34();
    public final q34 d = new p34();
    public final q34 e = new p34();

    public final void a(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b = t34.b(ephemeralMessage);
            k27 k27Var = new k27(i, (TLRPC.Message) b, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true);
            b.edit_date = ConnectionsManager.getInstance(i).getCurrentTime();
            b.flags |= 32768;
            this.b.a(ephemeralMessage, b, k27Var);
        } else {
            this.d.a.add(ephemeralMessage);
        }
    }

    public final void b(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b = t34.b(ephemeralMessage);
            this.a.a(ephemeralMessage, b, new k27(i, (TLRPC.Message) b, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true));
        } else {
            this.c.a.add(ephemeralMessage);
        }
    }
}
