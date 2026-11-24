package defpackage;

import java.util.Collection;
import java.util.List;
public final class xu4 {
    public final List a;
    public final boolean b;

    public xu4(List list, boolean z) {
        this.a = list;
        this.b = z;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<c33> list2 = list;
                int i = 0;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (c33 c33Var : list2) {
                        if ((c33Var instanceof zu4) && (i = i + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                if (i > 0 && i != this.a.size()) {
                    u36.j("Digital Credential Option cannot be used with other credential option.");
                    throw null;
                }
                for (c33 c33Var2 : this.a) {
                }
                return;
            }
            return;
        }
        u36.j("credentialOptions should not be empty");
        throw null;
    }
}
