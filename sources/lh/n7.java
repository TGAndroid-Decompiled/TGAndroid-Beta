package lh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class n7 {
    public final long f12852a;
    public final int f12853b;

    public n7(long j10, int i10) {
        this.f12852a = j10;
        this.f12853b = i10;
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
            if (n7Var.f12852a == this.f12852a && n7Var.f12853b == this.f12853b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12852a), Integer.valueOf(this.f12853b));
    }
}
