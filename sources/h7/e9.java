package h7;
public abstract class e9 {
    public static f7.s f7614a;

    public static synchronized a9 a(x8 x8Var) {
        a9 a9Var;
        synchronized (e9.class) {
            try {
                if (f7614a == null) {
                    f7614a = new f7.s(1);
                }
                a9Var = (a9) f7614a.G(x8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a9Var;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
