package hh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class o7 {

    public final long f9840a;

    public final int f9841b;

    public o7(long j10, int i10) {
        this.f9840a = j10;
        this.f9841b = i10;
    }

    public static o7 a(int i10, long j10) {
        return new o7(j10, i10);
    }

    public static o7 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        return (message == null || !(message.isThreadMessage || messageObject.isForwardedChannelPost()) || messageObject.messageOwner.fwd_from == null) ? new o7(messageObject.getDialogId(), messageObject.getId()) : new o7(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o7) {
            o7 o7Var = (o7) obj;
            if (o7Var.f9840a == this.f9840a && o7Var.f9841b == this.f9841b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f9840a), Integer.valueOf(this.f9841b));
    }
}
