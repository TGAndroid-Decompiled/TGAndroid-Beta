package f9;

import j$.util.Objects;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Iterator;

public final class y {

    public String f6013a;

    public y(String str) {
        str.getClass();
        this.f6013a = str;
    }

    public void a(StringBuilder sb2, AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f6013a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }
}
