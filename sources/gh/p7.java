package gh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class p7 {
    public final long f8727a;
    public final int f8728b;

    public p7(long j10, int i9) {
        this.f8727a = j10;
        this.f8728b = i9;
    }

    public static p7 a(int i9, long j10) {
        return new p7(j10, i9);
    }

    public static p7 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
            return new p7(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return new p7(messageObject.getDialogId(), messageObject.getId());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p7) {
            p7 p7Var = (p7) obj;
            if (p7Var.f8727a == this.f8727a && p7Var.f8728b == this.f8728b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f8727a), Integer.valueOf(this.f8728b));
    }
}
