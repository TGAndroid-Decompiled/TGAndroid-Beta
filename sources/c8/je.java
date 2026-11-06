package c8;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class je {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e10);
                    StringBuilder u10 = a8.p0.u("<", str2, " threw ");
                    u10.append(e10.getClass().getName());
                    u10.append(">");
                    sb2 = u10.toString();
                }
            }
            objArr[i10] = sb2;
            i10++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i7 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i11, indexOf);
            sb3.append(objArr[i7]);
            i7++;
            i11 = indexOf + 2;
        }
        sb3.append((CharSequence) str, i11, str.length());
        if (i7 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i7]);
            for (int i12 = i7 + 1; i12 < objArr.length; i12++) {
                sb3.append(", ");
                sb3.append(objArr[i12]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
