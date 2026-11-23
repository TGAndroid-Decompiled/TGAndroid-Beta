package f5;

import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
public class g {
    public String f11280a;

    public g(String str) {
        str.getClass();
        this.f11280a = str;
    }

    public static CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                sb2.append(c(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f11280a);
                    sb2.append(c(it.next()));
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb2 = new StringBuilder();
        a(sb2, it);
        return sb2.toString();
    }
}
