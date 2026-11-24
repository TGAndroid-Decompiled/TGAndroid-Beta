package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class ze8 implements Comparator {
    public final gf8 a;

    public ze8(gf8 gf8Var) {
        this.a = gf8Var;
    }

    public final int a(ff8 ff8Var) {
        TLRPC.Poll poll = this.a.s1;
        int size = poll.answers.size();
        for (int i = 0; i < size; i++) {
            if (Arrays.equals(poll.answers.get(i).option, ff8Var.d)) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a = a((ff8) obj);
        int a2 = a((ff8) obj2);
        if (a > a2) {
            return 1;
        }
        if (a < a2) {
            return -1;
        }
        return 0;
    }
}
