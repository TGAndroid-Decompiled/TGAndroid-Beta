package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class bh8 implements Comparator {
    public final ih8 a;

    public bh8(ih8 ih8Var) {
        this.a = ih8Var;
    }

    public final int a(hh8 hh8Var) {
        TLRPC.Poll poll = this.a.s1;
        int size = poll.answers.size();
        for (int i = 0; i < size; i++) {
            if (Arrays.equals(poll.answers.get(i).option, hh8Var.d)) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a = a((hh8) obj);
        int a2 = a((hh8) obj2);
        if (a > a2) {
            return 1;
        }
        if (a < a2) {
            return -1;
        }
        return 0;
    }
}
