package defpackage;
public abstract class mgd {
    public static final o94 a;
    public static final o94 b;
    public static final o94[] c;

    static {
        o94 o94Var = new o94("GET_CREDENTIAL", 1L);
        a = o94Var;
        o94 o94Var2 = new o94("CREDENTIAL_REGISTRY", 1L);
        o94 o94Var3 = new o94("CLEAR_REGISTRY", 2L);
        o94 o94Var4 = new o94("CLEAR_CREATION_OPTIONS", 1L);
        o94 o94Var5 = new o94("CLEAR_CREDENTIAL_STATE", 1L);
        o94 o94Var6 = new o94("CREATE_CREDENTIAL", 3L);
        b = o94Var6;
        c = new o94[]{o94Var, o94Var2, o94Var3, o94Var4, o94Var5, o94Var6, new o94("REGISTER_CREATION_OPTIONS", 1L), new o94("REGISTER_EXPORT", 1L), new o94("IMPORT_CREDENTIALS", 1L), new o94("SIGNAL_CREDENTIAL_STATE", 1L), new o94("CLEAR_EXPORT", 1L), new o94("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new o94("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new o94("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }
}
