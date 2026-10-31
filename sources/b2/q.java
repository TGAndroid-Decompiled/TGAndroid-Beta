package b2;
public final class q {
    public static final q f2190c = new q(new Object());
    public static final String d;
    public static final String e;
    public final int f2191a = 0;
    public final int f2192b = 0;

    static {
        String str = e2.l0.f6165a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public q(x1 x1Var) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (this.f2191a == qVar.f2191a && this.f2192b == qVar.f2192b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f2191a) * 31) + this.f2192b) * 31;
    }
}
