package b8;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class ac {
    public static String a(String str, Object... objArr) {
        int indexOf;
        String sb2;
        String valueOf = String.valueOf(str);
        int i3 = 0;
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
                    StringBuilder u10 = a1.g.u("<", str2, " threw ");
                    u10.append(e10.getClass().getName());
                    u10.append(">");
                    sb2 = u10.toString();
                }
            }
            objArr[i10] = sb2;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i11 = 0;
        while (i3 < objArr.length && (indexOf = valueOf.indexOf("%s", i11)) != -1) {
            sb3.append((CharSequence) valueOf, i11, indexOf);
            sb3.append(objArr[i3]);
            i11 = indexOf + 2;
            i3++;
        }
        sb3.append((CharSequence) valueOf, i11, valueOf.length());
        if (i3 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i3]);
            for (int i12 = i3 + 1; i12 < objArr.length; i12++) {
                sb3.append(", ");
                sb3.append(objArr[i12]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
