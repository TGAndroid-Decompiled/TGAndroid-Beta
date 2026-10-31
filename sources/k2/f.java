package k2;

import bi.t6;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jj;
import org.telegram.messenger.m10;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nt;
public final class f implements Function {
    public final int f10646a;

    public f(int i10) {
        this.f10646a = i10;
    }

    public Function andThen(Function function) {
        int i10 = this.f10646a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        long j10;
        int[] array;
        switch (this.f10646a) {
            case 0:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 1:
                String str = (String) obj;
                Pattern pattern = Utilities.f14518a;
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
                return vp.a((int[]) obj);
            case 5:
                return ((m10) obj).f16858b;
            case 6:
                return Long.valueOf(o5.o((TLRPC.Peer) obj));
            case 7:
                return Long.valueOf(((jj) obj).Z0());
            case 8:
                return Integer.valueOf(((jj) obj).f1());
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
                return ((nt) obj).f40047a;
            default:
                return ((nt) obj).f40047a;
        }
    }

    public Function compose(Function function) {
        int i10 = this.f10646a;
        return Function$CC.$default$compose(this, function);
    }
}
