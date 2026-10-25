package bi;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class v9 {
    public final long f5571a;
    public final int f5572b;

    public v9(long j10, int i10) {
        this.f5571a = j10;
        this.f5572b = i10;
    }

    public static v9 a(int i10, long j10) {
        return new v9(j10, i10);
    }

    public static v9 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
            return new v9(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return new v9(messageObject.getDialogId(), messageObject.getId());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v9) {
            v9 v9Var = (v9) obj;
            if (v9Var.f5571a == this.f5571a && v9Var.f5572b == this.f5572b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f5571a), Integer.valueOf(this.f5572b));
    }
}
