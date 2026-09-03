package i5;

import j$.util.Objects;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Iterator;
public final class c {
    public String f7246a;

    public c(String str, int i10) {
        switch (i10) {
            case 3:
                str.getClass();
                this.f7246a = str;
                return;
            default:
                this.f7246a = str;
                return;
        }
    }

    public static c b(h5.w wVar) {
        String str;
        wVar.G(2);
        int u10 = wVar.u();
        int i10 = u10 >> 1;
        int u11 = ((wVar.u() >> 3) & 31) | ((u10 & 1) << 5);
        if (i10 != 4 && i10 != 5 && i10 != 7) {
            if (i10 == 8) {
                str = "hev1";
            } else if (i10 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i10);
        if (u11 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(u11);
        return new c(sb.toString(), 0);
    }

    public void a(StringBuilder sb, AbstractCollection abstractCollection) {
        CharSequence obj;
        CharSequence obj2;
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb.append(obj);
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f7246a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb.append(obj2);
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
