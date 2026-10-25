package a8;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class rg {
    public static qg f905a;

    public static synchronized kg a(cg cgVar) {
        kg kgVar;
        synchronized (rg.class) {
            try {
                if (f905a == null) {
                    f905a = new qg(0);
                }
                kgVar = (kg) f905a.R0(cgVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kgVar;
    }

    public static String b(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder v = a1.g.v("<", str2, " threw ");
                    v.append(e.getClass().getName());
                    v.append(">");
                    sb2 = v.toString();
                }
            }
            objArr[i11] = sb2;
            i11++;
        }
        StringBuilder sb3 = new StringBuilder((length * 16) + str.length());
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i12, indexOf);
            sb3.append(objArr[i10]);
            i10++;
            i12 = indexOf + 2;
        }
        sb3.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
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

    public static synchronized kg c() {
        kg a2;
        synchronized (rg.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = a(new Object());
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        return a2;
    }
}
