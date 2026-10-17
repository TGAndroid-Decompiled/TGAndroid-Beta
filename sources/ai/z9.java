package ai;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class z9 {
    public final long f2544a;
    public final int f2545b;

    public z9(long j10, int i10) {
        this.f2544a = j10;
        this.f2545b = i10;
    }

    public static z9 a(int i10, long j10) {
        return new z9(j10, i10);
    }

    public static z9 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
            return new z9(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return new z9(messageObject.getDialogId(), messageObject.getId());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z9) {
            z9 z9Var = (z9) obj;
            if (z9Var.f2544a == this.f2544a && z9Var.f2545b == this.f2545b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f2544a), Integer.valueOf(this.f2545b));
    }
}
