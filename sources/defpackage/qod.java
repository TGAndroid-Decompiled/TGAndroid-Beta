package defpackage;
public abstract class qod {
    public static final a94 a;
    public static final a94[] b;

    static {
        a94 a94Var = new a94("wallet", 1L);
        a94 a94Var2 = new a94("wallet_biometric_auth_keys", 1L);
        a94 a94Var3 = new a94("wallet_payment_dynamic_update", 2L);
        a = a94Var3;
        b = new a94[]{a94Var, a94Var2, a94Var3, new a94("wallet_1p_initialize_buyflow", 1L), new a94("wallet_warm_up_ui_process", 1L), new a94("wallet_get_setup_wizard_intent", 4L), new a94("wallet_get_payment_card_recognition_intent", 1L)};
    }
}
