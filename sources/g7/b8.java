package g7;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class b8 {
    public static String a(Object... objArr) {
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
        StringBuilder sb2 = new StringBuilder((length * 16) + 29);
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i9 >= length2 || (indexOf = "expected a non-null reference".indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) "expected a non-null reference", i11, indexOf);
            sb2.append(objArr[i9]);
            i9++;
            i11 = indexOf + 2;
        }
        sb2.append((CharSequence) "expected a non-null reference", i11, 29);
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
