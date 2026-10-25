package a8;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class zb {
    public static String a(String str, Object... objArr) {
        int indexOf;
        String sb2;
        String valueOf = String.valueOf(str);
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e);
                    StringBuilder v = a1.g.v("<", str2, " threw ");
                    v.append(e.getClass().getName());
                    v.append(">");
                    sb2 = v.toString();
                }
            }
            objArr[i11] = sb2;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i12 = 0;
        while (i10 < objArr.length && (indexOf = valueOf.indexOf("%s", i12)) != -1) {
            sb3.append((CharSequence) valueOf, i12, indexOf);
            sb3.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb3.append((CharSequence) valueOf, i12, valueOf.length());
        if (i10 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb3.append(", ");
                sb3.append(objArr[i13]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
