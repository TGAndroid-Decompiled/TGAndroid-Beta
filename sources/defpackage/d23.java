package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
public final class d23 implements Runnable {
    public final byte a;
    public final a33 b;

    public d23(a33 a33Var, byte b) {
        this.a = b;
        this.b = a33Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        a33 a33Var = this.b;
        switch (b) {
            case 0:
                a33Var.A(new n13((CharSequence) null, (byte) 2));
                return;
            case 1:
                a33Var.A(new n13((CharSequence) null, (byte) 2));
                return;
            case 2:
                CredentialProviderPlayServicesImpl.$r8$lambda$33t67ADGbdHQ3I8DmDG2pssxk8c(a33Var);
                return;
            case 3:
                CredentialProviderPlayServicesImpl.m0$r8$lambda$AHEPAGD45gIS5fVQxoF8ULIdY(a33Var);
                return;
            case 4:
                CredentialProviderPlayServicesImpl.m1$r8$lambda$CzTvhVIglA1BRk85Mc5RmIPn9A(a33Var);
                return;
            case 5:
                CredentialProviderPlayServicesImpl.$r8$lambda$5b_NZniORttBMkbFQZx_nT7Z9tM(a33Var);
                return;
            case 6:
                CredentialProviderPlayServicesImpl.m2$r8$lambda$VaWGKHMq8i7ItapkClFK107fk(a33Var);
                return;
            case 7:
                CredentialProviderPlayServicesImpl.$r8$lambda$DfT1zIu2fR0eiSNwtnuBSJy7kq8(a33Var);
                return;
            case 8:
                CredentialProviderPlayServicesImpl.$r8$lambda$4jXvrTRoERmCISXRfwXYkLdVeEA(a33Var);
                return;
            case 9:
                a33Var.A(new uu4("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                return;
            default:
                a33Var.A(new uu4("No provider data returned.", (byte) 2));
                return;
        }
    }
}
