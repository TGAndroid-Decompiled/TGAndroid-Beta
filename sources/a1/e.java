package a1;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import v0.i;
public final class e implements Runnable {
    public final int f46a;
    public final i f47b;

    public e(i iVar, int i10) {
        this.f46a = i10;
        this.f47b = iVar;
    }

    @Override
    public final void run() {
        switch (this.f46a) {
            case 0:
                CredentialProviderPlayServicesImpl.$r8$lambda$33t67ADGbdHQ3I8DmDG2pssxk8c(this.f47b);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.m0$r8$lambda$AHEPAGD45gIS5fVQxoF8ULIdY(this.f47b);
                return;
            case 2:
                CredentialProviderPlayServicesImpl.m1$r8$lambda$CzTvhVIglA1BRk85Mc5RmIPn9A(this.f47b);
                return;
            case 3:
                CredentialProviderPlayServicesImpl.$r8$lambda$5b_NZniORttBMkbFQZx_nT7Z9tM(this.f47b);
                return;
            case 4:
                CredentialProviderPlayServicesImpl.m3$r8$lambda$VaWGKHMq8i7ItapkClFK107fk(this.f47b);
                return;
            case 5:
                CredentialProviderPlayServicesImpl.$r8$lambda$DfT1zIu2fR0eiSNwtnuBSJy7kq8(this.f47b);
                return;
            case 6:
                CredentialProviderPlayServicesImpl.$r8$lambda$4jXvrTRoERmCISXRfwXYkLdVeEA(this.f47b);
                return;
            case 7:
                this.f47b.onError(new w0.h("No provider data returned.", 2));
                return;
            case 8:
                this.f47b.onError(new w0.c((CharSequence) null, 2));
                return;
            case 9:
                this.f47b.onError(new w0.c((CharSequence) null, 2));
                return;
            default:
                this.f47b.onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
        }
    }
}
