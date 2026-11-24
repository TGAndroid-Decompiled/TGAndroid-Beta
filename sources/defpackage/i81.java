package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.p;
public final class i81 implements RequestDelegate {
    public final byte a;
    public final boolean b;
    public final Object c;

    public i81(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Poll poll;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                z81 z81Var = (z81) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    z81Var.getMessagesController().Q3(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z;
                        z81Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new i81((byte) 0, z81Var, z));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                gl.d3(new mn6((wt1) obj, tLObject, z, (byte) 11));
                return;
            case 2:
                p82 p82Var = (p82) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    p82Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    gl.d3(new x6c((byte) 11, p82Var, z));
                    return;
                }
                gl.d3(new k82(p82Var, (byte) 3));
                return;
            case 3:
                gl.d3(new qg((f92) obj, tL_error, tLObject, this.b, (byte) 9));
                return;
            case 4:
                gl.d3(new mn6((rr4) obj, tLObject, z, (byte) 23));
                return;
            case 5:
                gl.d3(new qg((bb5) obj, tL_error, tLObject, this.b, (byte) 21));
                return;
            case 6:
                na7 na7Var = (na7) obj;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (z) {
                        for (int i = 0; i < updates.updates.size(); i++) {
                            TLRPC.Update update = updates.updates.get(i);
                            if ((update instanceof TL_update.TL_updateMessagePoll) && (poll = ((TL_update.TL_updateMessagePoll) update).poll) != null && !poll.closed) {
                                na7Var.D0 = System.currentTimeMillis() - 4000;
                            }
                        }
                    }
                    na7Var.Q3(updates, false);
                    return;
                }
                return;
            case 7:
                gl.d3(new d97((lx7) obj, tL_error, tLObject, this.b, (byte) 5));
                return;
            case 8:
                p pVar = (p) obj;
                pVar.getClass();
                gl.d3(new d97(pVar, tL_error, tLObject, this.b, (byte) 8));
                return;
            case 9:
                gl.d3(new pc7((g38) obj, tL_error, tLObject, z));
                return;
            case 10:
                u58 u58Var = (u58) obj;
                if (tLObject != null) {
                    gl.d3(new vj6(u58Var, tLObject, z, (byte) 12));
                    return;
                }
                return;
            case 11:
                p3c p3cVar = (p3c) obj;
                p3cVar.getClass();
                gl.d3(new d97(p3cVar, tL_error, tLObject, this.b, (byte) 18));
                return;
            case 12:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z, tLObject, tL_error);
                return;
            default:
                gl.d3(new vj6((WallpapersListActivity) obj, tLObject, z, (byte) 29));
                return;
        }
    }
}
