package defpackage;
public abstract class bgd {
    public static final o94 a;
    public static final o94[] b;

    static {
        o94 o94Var = new o94("auth_api_credentials_begin_sign_in", 9L);
        o94 o94Var2 = new o94("auth_api_credentials_sign_out", 2L);
        a = o94Var2;
        b = new o94[]{o94Var, o94Var2, new o94("auth_api_credentials_authorize", 1L), new o94("auth_api_credentials_revoke_access", 1L), new o94("auth_api_credentials_save_password", 4L), new o94("auth_api_credentials_get_sign_in_intent", 6L), new o94("auth_api_credentials_save_account_linking_token", 3L), new o94("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }
}
