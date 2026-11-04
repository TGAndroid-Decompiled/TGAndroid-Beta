package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gk implements RequestDelegate {
    public final int f22733a;
    public final hp f22734b;
    public final long f22735c;
    public final long d;

    public gk(int i3, long j10, long j11, hp hpVar) {
        this.f22733a = i3;
        this.f22734b = hpVar;
        this.f22735c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22733a) {
            case 0:
                hp hpVar = this.f22734b;
                hpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    hpVar.L3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, this.f22735c);
                }
                long j10 = this.d;
                if (j10 != 0) {
                    hpVar.getMessagesStorage().q1(j10);
                    return;
                }
                return;
            default:
                hp hpVar2 = this.f22734b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        hpVar2.J3(tL_messages_dialogs, null, null, ((TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, hpVar2.P7, false, false, false);
                    }
                }
                long j11 = this.f22735c;
                if (j11 != 0) {
                    hpVar2.getMessagesStorage().q1(j11);
                }
                hpVar2.f22983d1.e(this.d);
                return;
        }
    }
}
