package a1;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import v0.i;
import w0.h;

public final class b implements Runnable {

    public final int f32a;

    public final i f33b;

    public b(i iVar, int i10) {
        this.f32a = i10;
        this.f33b = iVar;
    }

    @Override
    public final void run() {
        switch (this.f32a) {
            case 0:
                this.f33b.onResult(null);
                break;
            case 1:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$5$lambda$4(this.f33b);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$3$lambda$2(this.f33b);
                break;
            case 3:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$lambda$0(this.f33b);
                break;
            case 4:
                this.f33b.onResult(null);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$7$lambda$6(this.f33b);
                break;
            case 6:
                this.f33b.onResult(null);
                break;
            case 7:
                this.f33b.onError(new h("No provider data returned.", 2));
                break;
            case 8:
                this.f33b.onError(new w0.c((CharSequence) null, 2));
                break;
            case 9:
                this.f33b.onError(new w0.c((CharSequence) null, 2));
                break;
            default:
                this.f33b.onError(new h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                break;
        }
    }
}
