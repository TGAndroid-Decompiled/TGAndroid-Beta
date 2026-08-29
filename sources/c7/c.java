package c7;
public abstract class c {
    public static final w5.c f2999a;
    public static final w5.c f3000b;
    public static final w5.c[] f3001c;

    static {
        w5.c cVar = new w5.c("GET_CREDENTIAL", 1L);
        f2999a = cVar;
        w5.c cVar2 = new w5.c("CREDENTIAL_REGISTRY", 1L);
        w5.c cVar3 = new w5.c("CLEAR_REGISTRY", 2L);
        w5.c cVar4 = new w5.c("CLEAR_CREATION_OPTIONS", 1L);
        w5.c cVar5 = new w5.c("CLEAR_CREDENTIAL_STATE", 1L);
        w5.c cVar6 = new w5.c("CREATE_CREDENTIAL", 3L);
        f3000b = cVar6;
        f3001c = new w5.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, new w5.c("REGISTER_CREATION_OPTIONS", 1L), new w5.c("REGISTER_EXPORT", 1L), new w5.c("IMPORT_CREDENTIALS", 1L), new w5.c("SIGNAL_CREDENTIAL_STATE", 1L), new w5.c("CLEAR_EXPORT", 1L), new w5.c("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new w5.c("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new w5.c("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }
}
