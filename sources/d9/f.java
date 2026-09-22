package d9;

import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;
public final class f {
    public String f7564a;

    public f(String str, int i10) {
        switch (i10) {
            case 2:
                this.f7564a = str;
                return;
            default:
                str.getClass();
                this.f7564a = str;
                return;
        }
    }

    public void a(StringBuilder sb2, Iterator it) {
        CharSequence obj;
        CharSequence obj2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb2.append(obj);
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f7564a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb2.append(obj2);
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
