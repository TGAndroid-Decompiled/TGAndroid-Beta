package defpackage;

import java.util.Collection;
import java.util.List;
public final class av4 {
    public final List a;
    public final boolean b;

    public av4(List list, boolean z) {
        this.a = list;
        this.b = z;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<j23> list2 = list;
                int i = 0;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (j23 j23Var : list2) {
                        if ((j23Var instanceof cv4) && (i = i + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                if (i > 0 && i != this.a.size()) {
                    lq5.j("Digital Credential Option cannot be used with other credential option.");
                    throw null;
                }
                for (j23 j23Var2 : this.a) {
                }
                return;
            }
            return;
        }
        lq5.j("credentialOptions should not be empty");
        throw null;
    }
}
