package defpackage;
public abstract class cjd {
    public static final a94 a;
    public static final a94 b;
    public static final a94[] c;

    static {
        a94 a94Var = new a94("GET_CREDENTIAL", 1L);
        a = a94Var;
        a94 a94Var2 = new a94("CREDENTIAL_REGISTRY", 1L);
        a94 a94Var3 = new a94("CLEAR_REGISTRY", 2L);
        a94 a94Var4 = new a94("CLEAR_CREATION_OPTIONS", 1L);
        a94 a94Var5 = new a94("CLEAR_CREDENTIAL_STATE", 1L);
        a94 a94Var6 = new a94("CREATE_CREDENTIAL", 3L);
        b = a94Var6;
        c = new a94[]{a94Var, a94Var2, a94Var3, a94Var4, a94Var5, a94Var6, new a94("REGISTER_CREATION_OPTIONS", 1L), new a94("REGISTER_EXPORT", 1L), new a94("IMPORT_CREDENTIALS", 1L), new a94("SIGNAL_CREDENTIAL_STATE", 1L), new a94("CLEAR_EXPORT", 1L), new a94("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new a94("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new a94("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }
}
