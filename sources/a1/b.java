package a1;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import v0.i;
import w0.h;
public final class b implements Runnable {
    public final int f29a;
    public final i f30b;

    public b(i iVar, int i10) {
        this.f29a = i10;
        this.f30b = iVar;
    }

    @Override
    public final void run() {
        switch (this.f29a) {
            case 0:
                CredentialProviderPlayServicesImpl.$r8$lambda$33t67ADGbdHQ3I8DmDG2pssxk8c(this.f30b);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.m0$r8$lambda$AHEPAGD45gIS5fVQxoF8ULIdY(this.f30b);
                return;
            case 2:
                CredentialProviderPlayServicesImpl.m1$r8$lambda$CzTvhVIglA1BRk85Mc5RmIPn9A(this.f30b);
                return;
            case 3:
                CredentialProviderPlayServicesImpl.$r8$lambda$5b_NZniORttBMkbFQZx_nT7Z9tM(this.f30b);
                return;
            case 4:
                CredentialProviderPlayServicesImpl.m3$r8$lambda$VaWGKHMq8i7ItapkClFK107fk(this.f30b);
                return;
            case 5:
                CredentialProviderPlayServicesImpl.$r8$lambda$DfT1zIu2fR0eiSNwtnuBSJy7kq8(this.f30b);
                return;
            case 6:
                CredentialProviderPlayServicesImpl.$r8$lambda$4jXvrTRoERmCISXRfwXYkLdVeEA(this.f30b);
                return;
            case 7:
                this.f30b.onError(new h("No provider data returned.", 2));
                return;
            case 8:
                this.f30b.onError(new w0.c((CharSequence) null, 2));
                return;
            case 9:
                this.f30b.onError(new w0.c((CharSequence) null, 2));
                return;
            default:
                this.f30b.onError(new h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
        }
    }
}
