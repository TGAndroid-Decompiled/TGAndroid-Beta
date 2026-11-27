package defpackage;
public abstract class kid {
    public static final a94 a;
    public static final a94[] b;

    static {
        a94 a94Var = new a94("fpnv_exchange_credential_response_for_phone_number_api", -1, 1L, true);
        a94 a94Var2 = new a94("fpnv_get_consent_screen_intent", -1, 1L, true);
        a94 a94Var3 = new a94("fpnv_get_digital_credential_payload_api", -1, 1L, true);
        a94 a94Var4 = new a94("fpnv_get_verification_support_info", -1, 1L, true);
        a = a94Var4;
        b = new a94[]{a94Var, a94Var2, a94Var3, a94Var4, new a94("fpnv_test_sessions", -1, 1L, true), new a94("fpnv_verify_phone_number", -1, 1L, true)};
    }
}
