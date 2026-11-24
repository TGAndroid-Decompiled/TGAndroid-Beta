package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class pwe {
    public static String a(String str, Object... objArr) {
        int indexOf;
        String sb;
        String valueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder p = wi8.p("<", str2, " threw ");
                    p.append(e.getClass().getName());
                    p.append(">");
                    sb = p.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb2 = new StringBuilder(valueOf.length() + (objArr.length << 4));
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb2.append((CharSequence) valueOf, i3, indexOf);
            sb2.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
