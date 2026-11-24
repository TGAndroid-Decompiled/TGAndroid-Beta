package defpackage;
public abstract class eze {
    public static xye a;

    public static synchronized sxe a(hwe hweVar) {
        sxe sxeVar;
        synchronized (eze.class) {
            xye xyeVar = a;
            if (xyeVar == null) {
                xyeVar = new xye((byte) 0);
                a = xyeVar;
            }
            sxeVar = (sxe) xyeVar.c(hweVar);
        }
        return sxeVar;
    }

    public static void b(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }
}
