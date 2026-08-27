package gf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;

public final class v {

    public final t f7066a = new t();

    public final t f7067b = new t();

    public final u f7068c = new u();
    public final u d = new u();

    public final u f7069e = new u();

    public static void a(TL_update.TL_updateDeleteEphemeralMessages tL_updateDeleteEphemeralMessages) {
        DialogObject.getPeerDialogId(tL_updateDeleteEphemeralMessages.peer);
    }

    public final void b(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.f7069e.f7057a.add(ephemeralMessage);
            return;
        }
        if (!ephemeralMessage.welcome) {
            this.d.f7057a.add(ephemeralMessage);
            return;
        }
        TLRPC.TL_message tL_messageB = x.b(ephemeralMessage);
        MessageObject messageObject = new MessageObject(i10, (TLRPC.Message) tL_messageB, (AbstractMap<Long, TLRPC.User>) concurrentHashMap, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap2, true, true);
        tL_messageB.edit_date = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_messageB.flags |= 32768;
        t.a(this.f7067b, ephemeralMessage, tL_messageB, messageObject);
    }

    public final void c(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.f7069e.f7057a.add(ephemeralMessage);
        } else {
            if (!ephemeralMessage.welcome) {
                this.f7068c.f7057a.add(ephemeralMessage);
                return;
            }
            TLRPC.TL_message tL_messageB = x.b(ephemeralMessage);
            t.a(this.f7066a, ephemeralMessage, tL_messageB, new MessageObject(i10, (TLRPC.Message) tL_messageB, (AbstractMap<Long, TLRPC.User>) concurrentHashMap, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap2, true, true));
        }
    }
}
