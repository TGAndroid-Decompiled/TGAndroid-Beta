package ai;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class aa {
    public final long f973a;
    public final int f974b;

    public aa(long j10, int i10) {
        this.f973a = j10;
        this.f974b = i10;
    }

    public static aa a(int i10, long j10) {
        return new aa(j10, i10);
    }

    public static aa b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
            return new aa(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return new aa(messageObject.getDialogId(), messageObject.getId());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aa) {
            aa aaVar = (aa) obj;
            if (aaVar.f973a == this.f973a && aaVar.f974b == this.f974b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f973a), Integer.valueOf(this.f974b));
    }
}
