package m5;

public abstract class z {

    public static final v5.c f17867a;

    public static final v5.c f17868b;

    public static final v5.c f17869c;
    public static final v5.c d;

    public static final v5.c[] f17870e;

    static {
        v5.c cVar = new v5.c("client_side_logging", 1L);
        v5.c cVar2 = new v5.c("cxless_client_minimal", 1L);
        f17867a = cVar2;
        v5.c cVar3 = new v5.c("cxless_caf_control", 1L);
        v5.c cVar4 = new v5.c("module_flag_control", 1L);
        f17868b = cVar4;
        v5.c cVar5 = new v5.c("discovery_hint_supply", 1L);
        v5.c cVar6 = new v5.c("relay_casting_set_active_account", 1L);
        v5.c cVar7 = new v5.c("analytics_proto_enum_translation", 1L);
        f17869c = cVar7;
        v5.c cVar8 = new v5.c("integer_to_integer_map", 1L);
        d = cVar8;
        f17870e = new v5.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, new v5.c("relay_casting_set_remote_casting_mode", 1L), new v5.c("get_relay_access_token", 1L), new v5.c("get_cast_settings", 1L), new v5.c("set_bundle_setting", 1L), new v5.c("get_client_updated_info", 1L)};
    }

    public static String a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        return g5.b.v(new g5.b(str, null, false, 21));
    }
}
