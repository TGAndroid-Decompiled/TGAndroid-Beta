package k2;

import j$.util.function.Function$CC;
import java.util.function.Function;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lt;
public final class g implements Function {
    public final int f16163a;

    public g(int i10) {
        this.f16163a = i10;
    }

    public Function andThen(Function function) {
        int i10 = this.f16163a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f16163a) {
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
                return ((lt) obj).f41258a;
            default:
                return ((lt) obj).f41258a;
        }
    }

    public Function compose(Function function) {
        int i10 = this.f16163a;
        return Function$CC.$default$compose(this, function);
    }
}
