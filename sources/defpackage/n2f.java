package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class n2f {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                i = "null";
            } else {
                try {
                    i = obj.toString();
                } catch (Exception e) {
                    String o = kt6.o(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(o), (Throwable) e);
                    i = b10.i("<", o, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i3] = i;
            i3++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length << 4));
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (indexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i4, indexOf);
            sb.append(objArr[i2]);
            i2++;
            i4 = indexOf + 2;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i2 < length2) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
