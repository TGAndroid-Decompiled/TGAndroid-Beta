package d9;

import fb.n;
import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;
public final class f implements n {
    public String f8211a;

    public f(String str, int i10) {
        switch (i10) {
            case 1:
                this.f8211a = str;
                return;
            default:
                str.getClass();
                this.f8211a = str;
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
                    sb2.append((CharSequence) this.f8211a);
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
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override
    public Object v2() {
        throw new RuntimeException(this.f8211a);
    }
}
