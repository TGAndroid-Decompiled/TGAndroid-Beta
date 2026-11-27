package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;
public final class n44 {
    public final l44 a = new l44();
    public final l44 b = new l44();
    public final m44 c = new l44();
    public final m44 d = new l44();
    public final m44 e = new l44();

    public final void a(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b = o44.b(ephemeralMessage);
            r47 r47Var = new r47(i, (TLRPC.Message) b, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true);
            b.edit_date = ConnectionsManager.getInstance(i).getCurrentTime();
            b.flags |= 32768;
            this.b.a(ephemeralMessage, b, r47Var);
        } else {
            this.d.a.add(ephemeralMessage);
        }
    }

    public final void b(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b = o44.b(ephemeralMessage);
            this.a.a(ephemeralMessage, b, new r47(i, (TLRPC.Message) b, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true));
        } else {
            this.c.a.add(ephemeralMessage);
        }
    }
}
