package defpackage;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class ln0 implements Comparator {
    public final byte a;
    public final Comparator b;

    public ln0(Comparator comparator, byte b) {
        this.a = b;
        this.b = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        Comparator comparator = this.b;
        switch (b) {
            case 0:
                return comparator.compare(((TLRPC.TL_help_country) obj).default_name, ((TLRPC.TL_help_country) obj2).default_name);
            case 1:
                return comparator.compare(((TLRPC.TL_help_country) obj).default_name, ((TLRPC.TL_help_country) obj2).default_name);
            default:
                return comparator.compare(((gy2) obj).a, ((gy2) obj2).a);
        }
    }
}
