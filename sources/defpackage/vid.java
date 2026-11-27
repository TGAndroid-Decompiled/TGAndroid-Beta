package defpackage;
public abstract class vid {
    public static final a94 a;
    public static final a94[] b;

    static {
        a94 a94Var = new a94("sms_code_autofill", 2L);
        a94 a94Var2 = new a94("sms_code_browser", 2L);
        a94 a94Var3 = new a94("sms_retrieve", 1L);
        a = a94Var3;
        b = new a94[]{a94Var, a94Var2, a94Var3, new a94("user_consent", 3L)};
    }
}
