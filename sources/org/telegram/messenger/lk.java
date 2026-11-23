package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lk implements RequestDelegate {
    public final int f25512a;
    public final mp f25513b;
    public final long f25514c;
    public final long d;

    public lk(int i7, long j3, long j10, mp mpVar) {
        this.f25512a = i7;
        this.f25513b = mpVar;
        this.f25514c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25512a) {
            case 0:
                mp mpVar = this.f25513b;
                mpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    mpVar.S3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, this.f25514c);
                }
                long j3 = this.d;
                if (j3 != 0) {
                    mpVar.getMessagesStorage().q1(j3);
                    return;
                }
                return;
            default:
                mp mpVar2 = this.f25513b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        mpVar2.Q3(tL_messages_dialogs, null, null, ((TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, mpVar2.V7, false, false, false);
                    }
                }
                long j10 = this.f25514c;
                if (j10 != 0) {
                    mpVar2.getMessagesStorage().q1(j10);
                }
                mpVar2.f25719d1.e(this.d);
                return;
        }
    }
}
