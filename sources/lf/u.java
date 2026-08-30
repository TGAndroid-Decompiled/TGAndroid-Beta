package lf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;
public final class u {
    public final s f12065a = new s();
    public final s f12066b = new s();
    public final t f12067c = new s();
    public final t d = new s();
    public final t e = new s();

    public static void a(TL_update.TL_updateDeleteEphemeralMessages tL_updateDeleteEphemeralMessages) {
        DialogObject.getPeerDialogId(tL_updateDeleteEphemeralMessages.peer);
    }

    public final void b(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.f12056a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = w.b(ephemeralMessage);
            MessageObject messageObject = new MessageObject(i10, (TLRPC.Message) b10, (AbstractMap<Long, TLRPC.User>) concurrentHashMap, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap2, true, true);
            b10.edit_date = ConnectionsManager.getInstance(i10).getCurrentTime();
            b10.flags |= 32768;
            s.a(this.f12066b, ephemeralMessage, b10, messageObject);
        } else {
            this.d.f12056a.add(ephemeralMessage);
        }
    }

    public final void c(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.f12056a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = w.b(ephemeralMessage);
            s.a(this.f12065a, ephemeralMessage, b10, new MessageObject(i10, (TLRPC.Message) b10, (AbstractMap<Long, TLRPC.User>) concurrentHashMap, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap2, true, true));
        } else {
            this.f12067c.f12056a.add(ephemeralMessage);
        }
    }
}
