package a7;
public abstract class c {
    public static final u5.c f105a;
    public static final u5.c f106b;
    public static final u5.c[] f107c;

    static {
        u5.c cVar = new u5.c("GET_CREDENTIAL", 1L);
        f105a = cVar;
        u5.c cVar2 = new u5.c("CREDENTIAL_REGISTRY", 1L);
        u5.c cVar3 = new u5.c("CLEAR_REGISTRY", 2L);
        u5.c cVar4 = new u5.c("CLEAR_CREATION_OPTIONS", 1L);
        u5.c cVar5 = new u5.c("CLEAR_CREDENTIAL_STATE", 1L);
        u5.c cVar6 = new u5.c("CREATE_CREDENTIAL", 3L);
        f106b = cVar6;
        f107c = new u5.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, new u5.c("REGISTER_CREATION_OPTIONS", 1L), new u5.c("REGISTER_EXPORT", 1L), new u5.c("IMPORT_CREDENTIALS", 1L), new u5.c("SIGNAL_CREDENTIAL_STATE", 1L), new u5.c("CLEAR_EXPORT", 1L), new u5.c("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new u5.c("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new u5.c("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }
}
