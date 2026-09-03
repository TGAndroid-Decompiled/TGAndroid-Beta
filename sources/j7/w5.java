package j7;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.ui.ai;
public abstract class w5 {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String k10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                k10 = "null";
            } else {
                try {
                    k10 = obj.toString();
                } catch (Exception e) {
                    String z4 = android.support.v4.media.a.z(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(z4), (Throwable) e);
                    k10 = ai.k("<", z4, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i11] = k10;
            i11++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i12, indexOf);
            sb.append(objArr[i10]);
            i10++;
            i12 = indexOf + 2;
        }
        sb.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
