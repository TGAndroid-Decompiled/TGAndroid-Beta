package defpackage;
public abstract class bmd {
    public static final o94 a;
    public static final o94[] b;

    static {
        o94 o94Var = new o94("wallet", 1L);
        o94 o94Var2 = new o94("wallet_biometric_auth_keys", 1L);
        o94 o94Var3 = new o94("wallet_payment_dynamic_update", 2L);
        a = o94Var3;
        b = new o94[]{o94Var, o94Var2, o94Var3, new o94("wallet_1p_initialize_buyflow", 1L), new o94("wallet_warm_up_ui_process", 1L), new o94("wallet_get_setup_wizard_intent", 4L), new o94("wallet_get_payment_card_recognition_intent", 1L)};
    }
}
