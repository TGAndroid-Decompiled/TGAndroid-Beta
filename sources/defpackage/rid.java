package defpackage;
public abstract class rid {
    public static final a94 a;
    public static final a94[] b;

    static {
        a94 a94Var = new a94("auth_api_credentials_begin_sign_in", 9L);
        a94 a94Var2 = new a94("auth_api_credentials_sign_out", 2L);
        a = a94Var2;
        b = new a94[]{a94Var, a94Var2, new a94("auth_api_credentials_authorize", 1L), new a94("auth_api_credentials_revoke_access", 1L), new a94("auth_api_credentials_save_password", 4L), new a94("auth_api_credentials_get_sign_in_intent", 6L), new a94("auth_api_credentials_save_account_linking_token", 3L), new a94("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }
}
