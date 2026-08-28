package f7;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class g9 {
    public static d7.s f5686a;

    public static synchronized c9 a(z8 z8Var) {
        c9 c9Var;
        synchronized (g9.class) {
            try {
                if (f5686a == null) {
                    f5686a = new d7.s(1);
                }
                c9Var = (c9) f5686a.G(z8Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9Var;
    }

    public static String b(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String h;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                h = "null";
            } else {
                try {
                    h = obj.toString();
                } catch (Exception e10) {
                    String z10 = aa.d.z(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(z10), (Throwable) e10);
                    h = org.telegram.ui.Cells.j2.h("<", z10, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i10] = h;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i9 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, indexOf);
            sb2.append(objArr[i9]);
            i9++;
            i11 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i9 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i9]);
            for (int i12 = i9 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
