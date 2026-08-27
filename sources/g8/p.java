package g8;

public abstract class p {

    public static final com.google.android.gms.common.api.e f6768a = new com.google.android.gms.common.api.e("Wallet.API", new a6.b(6), new com.google.android.gms.common.api.d());

    public static final v5.c f6769b;

    public static final v5.c[] f6770c;

    static {
        v5.c cVar = new v5.c("wallet", 1L);
        v5.c cVar2 = new v5.c("wallet_biometric_auth_keys", 1L);
        v5.c cVar3 = new v5.c("wallet_payment_dynamic_update", 2L);
        f6769b = cVar3;
        f6770c = new v5.c[]{cVar, cVar2, cVar3, new v5.c("wallet_1p_initialize_buyflow", 1L), new v5.c("wallet_warm_up_ui_process", 1L), new v5.c("wallet_get_setup_wizard_intent", 4L), new v5.c("wallet_get_payment_card_recognition_intent", 1L)};
    }
}
