package a8;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class p9 {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String m10;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                m10 = "null";
            } else {
                try {
                    m10 = obj.toString();
                } catch (Exception e10) {
                    String D = p0.D(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(D), (Throwable) e10);
                    m10 = org.telegram.ui.Cells.f1.m("<", D, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i10] = m10;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i7 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, indexOf);
            sb2.append(objArr[i7]);
            i7++;
            i11 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i7 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i12 = i7 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
