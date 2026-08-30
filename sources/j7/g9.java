package j7;
public abstract class g9 {
    public static h7.r f9019a;

    public static int a(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }

    public static synchronized c9 b(z8 z8Var) {
        c9 c9Var;
        synchronized (g9.class) {
            try {
                if (f9019a == null) {
                    f9019a = new h7.r(1);
                }
                c9Var = (c9) f9019a.F(z8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c9Var;
    }
}
