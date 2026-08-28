package m5;
public abstract class y {
    public static final u5.c f17488a;
    public static final u5.c f17489b;
    public static final u5.c f17490c;
    public static final u5.c d;
    public static final u5.c[] f17491e;

    static {
        u5.c cVar = new u5.c("client_side_logging", 1L);
        u5.c cVar2 = new u5.c("cxless_client_minimal", 1L);
        f17488a = cVar2;
        u5.c cVar3 = new u5.c("cxless_caf_control", 1L);
        u5.c cVar4 = new u5.c("module_flag_control", 1L);
        f17489b = cVar4;
        u5.c cVar5 = new u5.c("discovery_hint_supply", 1L);
        u5.c cVar6 = new u5.c("relay_casting_set_active_account", 1L);
        u5.c cVar7 = new u5.c("analytics_proto_enum_translation", 1L);
        f17490c = cVar7;
        u5.c cVar8 = new u5.c("integer_to_integer_map", 1L);
        d = cVar8;
        f17491e = new u5.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, new u5.c("relay_casting_set_remote_casting_mode", 1L), new u5.c("get_relay_access_token", 1L), new u5.c("get_cast_settings", 1L), new u5.c("set_bundle_setting", 1L), new u5.c("get_client_updated_info", 1L)};
    }

    public static String a(String str) {
        if (str != null) {
            return g5.b.v(new g5.b(str, null, false, 20));
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }
}
