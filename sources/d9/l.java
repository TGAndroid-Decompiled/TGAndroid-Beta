package d9;

import e2.x;
import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
public class l implements gb.o {
    public String f6436a;

    public l(String str, boolean z10) {
        this.f6436a = str;
    }

    public static l c(x xVar) {
        String str;
        String str2;
        xVar.O(2);
        int A = xVar.A();
        int i10 = A >> 1;
        int A2 = ((xVar.A() >> 3) & 31) | ((A & 1) << 5);
        if (i10 != 4 && i10 != 5 && i10 != 7 && i10 != 8) {
            if (i10 == 9) {
                str = "dvav";
            } else if (i10 == 10) {
                str = "dav1";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder u10 = a1.g.u(str);
        String str3 = ".";
        if (i10 >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        u10.append(str2);
        u10.append(i10);
        if (A2 < 10) {
            str3 = ".0";
        }
        u10.append(str3);
        u10.append(A2);
        return new l(u10.toString(), false);
    }

    public static CharSequence d(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                sb2.append(d(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f6436a);
                    sb2.append(d(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb2 = new StringBuilder();
        a(sb2, it);
        return sb2.toString();
    }

    @Override
    public Object f2() {
        throw new RuntimeException(this.f6436a);
    }

    public l(String str) {
        str.getClass();
        this.f6436a = str;
    }
}
