package defpackage;
public abstract class led {
    public static final f84 a;
    public static final f84 b;
    public static final f84[] c;

    static {
        f84 f84Var = new f84("GET_CREDENTIAL", 1L);
        a = f84Var;
        f84 f84Var2 = new f84("CREDENTIAL_REGISTRY", 1L);
        f84 f84Var3 = new f84("CLEAR_REGISTRY", 2L);
        f84 f84Var4 = new f84("CLEAR_CREATION_OPTIONS", 1L);
        f84 f84Var5 = new f84("CLEAR_CREDENTIAL_STATE", 1L);
        f84 f84Var6 = new f84("CREATE_CREDENTIAL", 3L);
        b = f84Var6;
        c = new f84[]{f84Var, f84Var2, f84Var3, f84Var4, f84Var5, f84Var6, new f84("REGISTER_CREATION_OPTIONS", 1L), new f84("REGISTER_EXPORT", 1L), new f84("IMPORT_CREDENTIALS", 1L), new f84("SIGNAL_CREDENTIAL_STATE", 1L), new f84("CLEAR_EXPORT", 1L), new f84("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new f84("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new f84("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }
}
