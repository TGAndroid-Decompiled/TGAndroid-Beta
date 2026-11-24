package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class n7f {
    public static z0f a;

    public static String a(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length << 4));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(c(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(c(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static synchronized b6f b(i5f i5fVar) {
        b6f b6fVar;
        synchronized (n7f.class) {
            z0f z0fVar = a;
            if (z0fVar == null) {
                z0fVar = new z0f((byte) 2);
                a = z0fVar;
            }
            b6fVar = (b6f) z0fVar.c(i5fVar);
        }
        return b6fVar;
    }

    public static String c(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String p = kt6.p(name, "@", hexString, new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(p), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(p.length() + 8 + name2.length() + 1);
            kt6.v(sb, "<", p, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static synchronized b6f d() {
        b6f b;
        synchronized (n7f.class) {
            b = b(new Object());
        }
        return b;
    }
}
