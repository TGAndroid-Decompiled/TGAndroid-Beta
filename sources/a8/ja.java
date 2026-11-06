package a8;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class ja {
    public static String a(String str, Object... objArr) {
        int indexOf;
        String sb2;
        String valueOf = String.valueOf(str);
        int i7 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e10);
                    StringBuilder u10 = p0.u("<", str2, " threw ");
                    u10.append(e10.getClass().getName());
                    u10.append(">");
                    sb2 = u10.toString();
                }
            }
            objArr[i10] = sb2;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i11 = 0;
        while (i7 < objArr.length && (indexOf = valueOf.indexOf("%s", i11)) != -1) {
            sb3.append((CharSequence) valueOf, i11, indexOf);
            sb3.append(objArr[i7]);
            i11 = indexOf + 2;
            i7++;
        }
        sb3.append((CharSequence) valueOf, i11, valueOf.length());
        if (i7 < objArr.length) {
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
