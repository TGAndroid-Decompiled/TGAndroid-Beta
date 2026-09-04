package e6;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.ui.Cells.p6;
public abstract class e {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String j3;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                j3 = "null";
            } else {
                try {
                    j3 = obj.toString();
                } catch (Exception e7) {
                    String C = a4.a.C(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(C), (Throwable) e7);
                    j3 = p6.j("<", C, " threw ", e7.getClass().getName(), ">");
                }
            }
            objArr[i11] = j3;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, indexOf);
            sb2.append(objArr[i10]);
            i10++;
            i12 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
