package defpackage;

import java.util.Collection;
import java.util.List;
public final class ws4 {
    public final List a;
    public final boolean b;

    public ws4(List list, boolean z) {
        this.a = list;
        this.b = z;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<r13> list2 = list;
                int i = 0;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (r13 r13Var : list2) {
                        if ((r13Var instanceof ys4) && (i = i + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                if (i > 0 && i != this.a.size()) {
                    w26.j("Digital Credential Option cannot be used with other credential option.");
                    throw null;
                }
                for (r13 r13Var2 : this.a) {
                }
                return;
            }
            return;
        }
        w26.j("credentialOptions should not be empty");
        throw null;
    }
}
