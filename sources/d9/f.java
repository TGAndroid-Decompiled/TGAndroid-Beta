package d9;

import fb.n;
import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;
public final class f implements n {
    public final int f6632a;
    public final String f6633b;

    public f(String str, int i10) {
        this.f6632a = i10;
        this.f6633b = str;
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
                    sb2.append((CharSequence) this.f6633b);
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
    public Object h2() {
        throw new RuntimeException(this.f6633b);
    }

    public String toString() {
        switch (this.f6632a) {
            case 1:
                return "<" + this.f6633b + '>';
            default:
                return super.toString();
        }
    }

    public f(String str) {
        this.f6632a = 0;
        str.getClass();
        this.f6633b = str;
    }
}
