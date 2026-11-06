package f6;
public abstract class y {
    public static final n6.c f11345a;
    public static final n6.c f11346b;
    public static final n6.c f11347c;
    public static final n6.c d;
    public static final n6.c[] f11348e;

    static {
        n6.c cVar = new n6.c("client_side_logging", 1L);
        n6.c cVar2 = new n6.c("cxless_client_minimal", 1L);
        f11345a = cVar2;
        n6.c cVar3 = new n6.c("cxless_caf_control", 1L);
        n6.c cVar4 = new n6.c("module_flag_control", 1L);
        f11346b = cVar4;
        n6.c cVar5 = new n6.c("discovery_hint_supply", 1L);
        n6.c cVar6 = new n6.c("relay_casting_set_active_account", 1L);
        n6.c cVar7 = new n6.c("analytics_proto_enum_translation", 1L);
        f11347c = cVar7;
        n6.c cVar8 = new n6.c("integer_to_integer_map", 1L);
        d = cVar8;
        f11348e = new n6.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, new n6.c("relay_casting_set_remote_casting_mode", 1L), new n6.c("get_relay_access_token", 1L), new n6.c("get_cast_settings", 1L), new n6.c("set_bundle_setting", 1L), new n6.c("get_client_updated_info", 1L)};
    }

    public static String a(String str) {
        if (str != null) {
            return wf.b.n0(new wf.b(18, str, (Object) null));
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }
}
