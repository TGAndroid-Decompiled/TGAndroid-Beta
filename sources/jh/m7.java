package jh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class m7 {
    public final long f12468a;
    public final int f12469b;

    public m7(long j10, int i10) {
        this.f12468a = j10;
        this.f12469b = i10;
    }

    public static m7 a(int i10, long j10) {
        return new m7(j10, i10);
    }

    public static m7 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
            return new m7(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return new m7(messageObject.getDialogId(), messageObject.getId());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m7) {
            m7 m7Var = (m7) obj;
            if (m7Var.f12468a == this.f12468a && m7Var.f12469b == this.f12469b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12468a), Integer.valueOf(this.f12469b));
    }
}
