package c8;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class hb {
    public static String a(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i7 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i7 >= length || (indexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, indexOf);
            sb2.append(b(objArr[i7]));
            i10 = indexOf + 2;
            i7++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i7 < length) {
            String str2 = " [";
            while (i7 < objArr.length) {
                sb2.append(str2);
                sb2.append(b(objArr[i7]));
                i7++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String b(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String n10 = org.telegram.ui.Cells.f1.n(name, "@", hexString, new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(n10), (Throwable) e10);
            String name2 = e10.getClass().getName();
            StringBuilder sb2 = new StringBuilder(n10.length() + 8 + name2.length() + 1);
            com.google.android.recaptcha.internal.a.s(sb2, "<", n10, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }
}
