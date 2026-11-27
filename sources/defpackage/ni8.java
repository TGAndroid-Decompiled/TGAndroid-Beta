package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class ni8 implements Comparator {
    public final ui8 a;

    public ni8(ui8 ui8Var) {
        this.a = ui8Var;
    }

    public final int a(ti8 ti8Var) {
        TLRPC.Poll poll = this.a.s1;
        int size = poll.answers.size();
        for (int i = 0; i < size; i++) {
            if (Arrays.equals(poll.answers.get(i).option, ti8Var.d)) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a = a((ti8) obj);
        int a2 = a((ti8) obj2);
        if (a > a2) {
            return 1;
        }
        if (a < a2) {
            return -1;
        }
        return 0;
    }
}
