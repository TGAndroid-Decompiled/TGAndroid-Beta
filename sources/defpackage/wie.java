package defpackage;
public abstract class wie {
    public static Exception a(i1 i1Var, String str, Exception exc) {
        if (exc instanceof s13) {
            return new s13(i1Var, str);
        }
        if (exc instanceof ev4) {
            return new ev4(i1Var, str);
        }
        throw new Exception();
    }
}
