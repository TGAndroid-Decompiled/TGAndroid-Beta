package k2;

import bi.t6;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kj;
import org.telegram.messenger.n10;
import org.telegram.messenger.o5;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mt;
public final class f implements Function {
    public final int f10647a;

    public f(int i10) {
        this.f10647a = i10;
    }

    public Function andThen(Function function) {
        int i10 = this.f10647a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        long j10;
        int[] array;
        switch (this.f10647a) {
            case 0:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 1:
                String str = (String) obj;
                Pattern pattern = Utilities.f14519a;
                try {
                    j10 = Long.parseLong(str);
                } catch (Exception unused) {
                    j10 = 0;
                }
                return Long.valueOf(j10);
            case 2:
                array = DesugarArrays.stream(((String) obj).split(",")).mapToInt(new t6(3)).toArray();
                return array;
            case 3:
                return String.valueOf((Long) obj);
            case 4:
                return wp.a((int[]) obj);
            case 5:
                return ((n10) obj).f17247b;
            case 6:
                return Long.valueOf(o5.o((TLRPC.Peer) obj));
            case 7:
                return Long.valueOf(((kj) obj).Z0());
            case 8:
                return Integer.valueOf(((kj) obj).f1());
            case 9:
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj;
                if (channelParticipant == null) {
                    return null;
                }
                return channelParticipant.banned_rights;
            case 10:
                return Long.valueOf(o5.o(((TLRPC.GroupCallParticipant) obj).peer));
            case 11:
                return Long.valueOf(o5.o(((TLRPC.GroupCallParticipant) obj).peer));
            case 12:
                return ((mt) obj).f39611a;
            default:
                return ((mt) obj).f39611a;
        }
    }

    public Function compose(Function function) {
        int i10 = this.f10647a;
        return Function$CC.$default$compose(this, function);
    }
}
