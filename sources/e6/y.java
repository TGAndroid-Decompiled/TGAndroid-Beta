package e6;
public abstract class y {
    public static final m6.c f9788a;
    public static final m6.c f9789b;
    public static final m6.c f9790c;
    public static final m6.c d;
    public static final m6.c[] f9791e;

    static {
        m6.c cVar = new m6.c("client_side_logging", 1L);
        m6.c cVar2 = new m6.c("cxless_client_minimal", 1L);
        f9788a = cVar2;
        m6.c cVar3 = new m6.c("cxless_caf_control", 1L);
        m6.c cVar4 = new m6.c("module_flag_control", 1L);
        f9789b = cVar4;
        m6.c cVar5 = new m6.c("discovery_hint_supply", 1L);
        m6.c cVar6 = new m6.c("relay_casting_set_active_account", 1L);
        m6.c cVar7 = new m6.c("analytics_proto_enum_translation", 1L);
        f9790c = cVar7;
        m6.c cVar8 = new m6.c("integer_to_integer_map", 1L);
        d = cVar8;
        f9791e = new m6.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, new m6.c("relay_casting_set_remote_casting_mode", 1L), new m6.c("get_relay_access_token", 1L), new m6.c("get_cast_settings", 1L), new m6.c("set_bundle_setting", 1L), new m6.c("get_client_updated_info", 1L)};
    }

    public static String a(String str) {
        if (str != null) {
            return p4.q.I(new p4.q(str, (Object) null));
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }
}
