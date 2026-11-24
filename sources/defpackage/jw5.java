package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
public final class jw5 {
    public final String a;

    public jw5(String str, byte b) {
        switch (b) {
            case 1:
                this.a = str;
                return;
            default:
                str.getClass();
                this.a = str;
                return;
        }
    }

    public static CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public final void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(c(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    sb.append(c(it.next()));
                }
            }
        } catch (IOException e) {
            bh7.j(e);
        }
    }

    public final String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }
}
