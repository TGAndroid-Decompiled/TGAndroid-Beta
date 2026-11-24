package defpackage;
public abstract class zjd {
    public static final f84 a;
    public static final f84[] b;

    static {
        f84 f84Var = new f84("wallet", 1L);
        f84 f84Var2 = new f84("wallet_biometric_auth_keys", 1L);
        f84 f84Var3 = new f84("wallet_payment_dynamic_update", 2L);
        a = f84Var3;
        b = new f84[]{f84Var, f84Var2, f84Var3, new f84("wallet_1p_initialize_buyflow", 1L), new f84("wallet_warm_up_ui_process", 1L), new f84("wallet_get_setup_wizard_intent", 4L), new f84("wallet_get_payment_card_recognition_intent", 1L)};
    }
}
