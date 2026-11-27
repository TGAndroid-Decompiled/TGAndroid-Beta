package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
public final class ow5 {
    public final byte a;
    public final String b;

    public ow5(String str, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = str;
                return;
            default:
                str.getClass();
                this.b = str;
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
                    sb.append((CharSequence) this.b);
                    sb.append(c(it.next()));
                }
            }
        } catch (IOException e) {
            hz6.e(e);
        }
    }

    public final String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }
}
