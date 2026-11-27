package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
public final class k13 implements Runnable {
    public final byte a;
    public final h23 b;

    public k13(h23 h23Var, byte b) {
        this.a = b;
        this.b = h23Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        h23 h23Var = this.b;
        switch (b) {
            case 0:
                h23Var.B(new v03((CharSequence) null, (byte) 2));
                return;
            case 1:
                h23Var.B(new v03((CharSequence) null, (byte) 2));
                return;
            case 2:
                CredentialProviderPlayServicesImpl.$r8$lambda$33t67ADGbdHQ3I8DmDG2pssxk8c(h23Var);
                return;
            case 3:
                CredentialProviderPlayServicesImpl.m0$r8$lambda$AHEPAGD45gIS5fVQxoF8ULIdY(h23Var);
                return;
            case 4:
                CredentialProviderPlayServicesImpl.m1$r8$lambda$CzTvhVIglA1BRk85Mc5RmIPn9A(h23Var);
                return;
            case 5:
                CredentialProviderPlayServicesImpl.$r8$lambda$5b_NZniORttBMkbFQZx_nT7Z9tM(h23Var);
                return;
            case 6:
                CredentialProviderPlayServicesImpl.m2$r8$lambda$VaWGKHMq8i7ItapkClFK107fk(h23Var);
                return;
            case 7:
                CredentialProviderPlayServicesImpl.$r8$lambda$DfT1zIu2fR0eiSNwtnuBSJy7kq8(h23Var);
                return;
            case 8:
                CredentialProviderPlayServicesImpl.$r8$lambda$4jXvrTRoERmCISXRfwXYkLdVeEA(h23Var);
                return;
            case 9:
                h23Var.B(new xu4("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                return;
            default:
                h23Var.B(new xu4("No provider data returned.", (byte) 2));
                return;
        }
    }
}
