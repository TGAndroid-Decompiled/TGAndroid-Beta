package mh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class n7 {
    public final long f14492a;
    public final int f14493b;

    public n7(long j10, int i10) {
        this.f14492a = j10;
        this.f14493b = i10;
    }

    public static n7 a(int i10, long j10) {
        return new n7(j10, i10);
    }

    public static n7 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
            return new n7(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return new n7(messageObject.getDialogId(), messageObject.getId());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n7) {
            n7 n7Var = (n7) obj;
            if (n7Var.f14492a == this.f14492a && n7Var.f14493b == this.f14493b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f14492a), Integer.valueOf(this.f14493b));
    }
}
