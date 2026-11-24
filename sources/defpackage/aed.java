package defpackage;
public abstract class aed {
    public static final f84 a;
    public static final f84[] b;

    static {
        f84 f84Var = new f84("auth_api_credentials_begin_sign_in", 9L);
        f84 f84Var2 = new f84("auth_api_credentials_sign_out", 2L);
        a = f84Var2;
        b = new f84[]{f84Var, f84Var2, new f84("auth_api_credentials_authorize", 1L), new f84("auth_api_credentials_revoke_access", 1L), new f84("auth_api_credentials_save_password", 4L), new f84("auth_api_credentials_get_sign_in_intent", 6L), new f84("auth_api_credentials_save_account_linking_token", 3L), new f84("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }
}
