package i7;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.ui.th;
public abstract class s {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String j10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                j10 = "null";
            } else {
                try {
                    j10 = obj.toString();
                } catch (Exception e10) {
                    String y8 = a4.w.y(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(y8), (Throwable) e10);
                    j10 = th.j("<", y8, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i11] = j10;
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
