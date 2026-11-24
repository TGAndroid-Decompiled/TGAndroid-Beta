package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
public final class r03 implements Runnable {
    public final byte a;
    public final o13 b;

    public r03(o13 o13Var, byte b) {
        this.a = b;
        this.b = o13Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        o13 o13Var = this.b;
        switch (b) {
            case 0:
                o13Var.M(new c03((CharSequence) null, (byte) 2));
                return;
            case 1:
                o13Var.M(new c03((CharSequence) null, (byte) 2));
                return;
            case 2:
                CredentialProviderPlayServicesImpl.$r8$lambda$33t67ADGbdHQ3I8DmDG2pssxk8c(o13Var);
                return;
            case 3:
                CredentialProviderPlayServicesImpl.m0$r8$lambda$AHEPAGD45gIS5fVQxoF8ULIdY(o13Var);
                return;
            case 4:
                CredentialProviderPlayServicesImpl.m1$r8$lambda$CzTvhVIglA1BRk85Mc5RmIPn9A(o13Var);
                return;
            case 5:
                CredentialProviderPlayServicesImpl.$r8$lambda$5b_NZniORttBMkbFQZx_nT7Z9tM(o13Var);
                return;
            case 6:
                CredentialProviderPlayServicesImpl.m2$r8$lambda$VaWGKHMq8i7ItapkClFK107fk(o13Var);
                return;
            case 7:
                CredentialProviderPlayServicesImpl.$r8$lambda$DfT1zIu2fR0eiSNwtnuBSJy7kq8(o13Var);
                return;
            case 8:
                CredentialProviderPlayServicesImpl.$r8$lambda$4jXvrTRoERmCISXRfwXYkLdVeEA(o13Var);
                return;
            case 9:
                o13Var.M(new ts4("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                return;
            default:
                o13Var.M(new ts4("No provider data returned.", (byte) 2));
                return;
        }
    }
}
