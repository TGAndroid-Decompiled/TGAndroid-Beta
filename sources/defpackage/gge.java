package defpackage;
public abstract class gge {
    public static Exception a(h1 h1Var, String str, Exception exc) {
        if (exc instanceof l23) {
            return new l23(h1Var, str);
        }
        if (exc instanceof bv4) {
            return new bv4(h1Var, str);
        }
        throw new Exception();
    }
}
