package b8;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class ff {
    public static String a(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i3 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length || (indexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, indexOf);
            sb2.append(b(objArr[i3]));
            i10 = indexOf + 2;
            i3++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i3 < length) {
            String str2 = " [";
            while (i3 < objArr.length) {
                sb2.append(str2);
                sb2.append(b(objArr[i3]));
                i3++;
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
            String r5 = org.telegram.ui.Cells.f1.r(name, "@", hexString, new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(r5), (Throwable) e10);
            String name2 = e10.getClass().getName();
            StringBuilder sb2 = new StringBuilder(r5.length() + 8 + name2.length() + 1);
            com.google.android.recaptcha.internal.a.s(sb2, "<", r5, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }
}
