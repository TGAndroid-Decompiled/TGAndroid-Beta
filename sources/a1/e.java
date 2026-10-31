package a1;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
public final class e implements Runnable {
    public final int f39a;
    public final v0.h f40b;

    public e(v0.h hVar, int i10) {
        this.f39a = i10;
        this.f40b = hVar;
    }

    @Override
    public final void run() {
        switch (this.f39a) {
            case 0:
                CredentialProviderPlayServicesImpl.$r8$lambda$33t67ADGbdHQ3I8DmDG2pssxk8c(this.f40b);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.m0$r8$lambda$AHEPAGD45gIS5fVQxoF8ULIdY(this.f40b);
                return;
            case 2:
                CredentialProviderPlayServicesImpl.m1$r8$lambda$CzTvhVIglA1BRk85Mc5RmIPn9A(this.f40b);
                return;
            case 3:
                CredentialProviderPlayServicesImpl.$r8$lambda$5b_NZniORttBMkbFQZx_nT7Z9tM(this.f40b);
                return;
            case 4:
                CredentialProviderPlayServicesImpl.m3$r8$lambda$VaWGKHMq8i7ItapkClFK107fk(this.f40b);
                return;
            case 5:
                CredentialProviderPlayServicesImpl.$r8$lambda$DfT1zIu2fR0eiSNwtnuBSJy7kq8(this.f40b);
                return;
            case 6:
                CredentialProviderPlayServicesImpl.$r8$lambda$4jXvrTRoERmCISXRfwXYkLdVeEA(this.f40b);
                return;
            case 7:
                this.f40b.g(new w0.h(2, "No provider data returned."));
                return;
            case 8:
                this.f40b.g(new w0.c(2, (CharSequence) null));
                return;
            case 9:
                this.f40b.g(new w0.c(2, (CharSequence) null));
                return;
            default:
                this.f40b.g(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
        }
    }
}
