package d9;

import fb.n;
import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;
public final class f implements n {
    public final int f6659a;
    public final String f6660b;

    public f(String str, int i10) {
        this.f6659a = i10;
        this.f6660b = str;
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
                    sb2.append((CharSequence) this.f6660b);
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
        throw new RuntimeException(this.f6660b);
    }

    public String toString() {
        switch (this.f6659a) {
            case 1:
                return "<" + this.f6660b + '>';
            default:
                return super.toString();
        }
    }

    public f(String str) {
        this.f6659a = 0;
        str.getClass();
        this.f6660b = str;
    }
}
