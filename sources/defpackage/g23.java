package defpackage;

import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.concurrent.Executor;
public final class g23 implements s13 {
    public final CredentialManager a;

    public g23(Context context) {
        context.getClass();
        this.a = (CredentialManager) context.getSystemService("credential");
    }

    @Override
    public final boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT >= 34 && this.a != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void onCreateCredential(Context context, i03 i03Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var) {
        context.getClass();
        i4d i4dVar = (i4d) o13Var;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            i4dVar.L(new c03("Your device doesn't support credential manager", (byte) 3));
            return;
        }
        f23 f23Var = new f23(i4dVar, (a13) i03Var, this);
        credentialManager.getClass();
        Bundle bundle = i03Var.a;
        i5 i5Var = i03Var.c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", i5Var.a);
        String str = i5Var.b;
        if (!TextUtils.isEmpty(str)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", str);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, 2131230865));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, i03Var.b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        alwaysSendAppInfoToProvider.getClass();
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        build.getClass();
        credentialManager.createCredential(context, build, cancellationSignal, executor, f23Var);
    }

    @Override
    public final void onGetCredential(Context context, ws4 ws4Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var) {
        executor.getClass();
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            o13Var.L(new ts4("Your device doesn't support credential manager", (byte) 3));
            return;
        }
        f23 f23Var = new f23(o13Var, this);
        credentialManager.getClass();
        Bundle l = ir2.l("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        l.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", ws4Var.b);
        l.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(l);
        for (r13 r13Var : ws4Var.a) {
            builder.addCredentialOption(new CredentialOption.Builder(r13Var.a, r13Var.b, r13Var.c).setIsSystemProviderRequired(false).setAllowedProviders(r13Var.d).build());
        }
        GetCredentialRequest build = builder.build();
        build.getClass();
        credentialManager.getCredential(context, build, cancellationSignal, executor, f23Var);
    }
}
