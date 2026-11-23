package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mk implements RequestDelegate {
    public final int f25563a;
    public final np f25564b;
    public final long f25565c;
    public final long d;

    public mk(int i7, long j3, long j10, np npVar) {
        this.f25563a = i7;
        this.f25564b = npVar;
        this.f25565c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25563a) {
            case 0:
                np npVar = this.f25564b;
                npVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    npVar.S3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, this.f25565c);
                }
                long j3 = this.d;
                if (j3 != 0) {
                    npVar.getMessagesStorage().q1(j3);
                    return;
                }
                return;
            default:
                np npVar2 = this.f25564b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        npVar2.Q3(tL_messages_dialogs, null, null, ((TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, npVar2.V7, false, false, false);
                    }
                }
                long j10 = this.f25565c;
                if (j10 != 0) {
                    npVar2.getMessagesStorage().q1(j10);
                }
                npVar2.f25787d1.e(this.d);
                return;
        }
    }
}
