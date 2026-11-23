package a8;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class bb {
    public static ab f346a;

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

    public static synchronized ua b(na naVar) {
        ua uaVar;
        synchronized (bb.class) {
            try {
                if (f346a == null) {
                    f346a = new ab(0);
                }
                uaVar = (ua) f346a.R0(naVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uaVar;
    }

    public static synchronized ua c() {
        ua b10;
        synchronized (bb.class) {
            byte b11 = (byte) (((byte) 1) | 2);
            if (b11 == 3) {
                b10 = b(new Object());
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b11 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b11 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        return b10;
    }
}
