package k2;

import j$.util.function.Function$CC;
import java.util.function.Function;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ht;
public final class f implements Function {
    public final int f14681a;

    public f(int i10) {
        this.f14681a = i10;
    }

    public Function andThen(Function function) {
        int i10 = this.f14681a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f14681a) {
            case 0:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 1:
                return Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) obj));
            case 2:
                return Long.valueOf(((MessageObject) obj).getFromChatId());
            case 3:
                return Integer.valueOf(((MessageObject) obj).getId());
            case 4:
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj;
                if (channelParticipant == null) {
                    return null;
                }
                return channelParticipant.banned_rights;
            case 5:
                return Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.GroupCallParticipant) obj).peer));
            case 6:
                return Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.GroupCallParticipant) obj).peer));
            case 7:
                return ((ht) obj).f37783a;
            default:
                return ((ht) obj).f37783a;
        }
    }

    public Function compose(Function function) {
        int i10 = this.f14681a;
        return Function$CC.$default$compose(this, function);
    }
}
