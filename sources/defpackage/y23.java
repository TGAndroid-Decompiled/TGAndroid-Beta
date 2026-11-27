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
public final class y23 implements k23 {
    public final CredentialManager a;

    public y23(Context context) {
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
    public final void onCreateCredential(Context context, b13 b13Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var) {
        context.getClass();
        zm9 zm9Var = (zm9) h23Var;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            zm9Var.B(new v03("Your device doesn't support credential manager", (byte) 3));
            return;
        }
        x23 x23Var = new x23(zm9Var, (t13) b13Var, this);
        credentialManager.getClass();
        Bundle bundle = b13Var.a;
        j5 j5Var = b13Var.c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", j5Var.b);
        String str = j5Var.c;
        if (!TextUtils.isEmpty(str)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", str);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, 2131230865));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, b13Var.b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        alwaysSendAppInfoToProvider.getClass();
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        build.getClass();
        credentialManager.createCredential(context, build, cancellationSignal, executor, x23Var);
    }

    @Override
    public final void onGetCredential(Context context, av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var) {
        executor.getClass();
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            h23Var.B(new xu4("Your device doesn't support credential manager", (byte) 3));
            return;
        }
        x23 x23Var = new x23(h23Var, this);
        credentialManager.getClass();
        Bundle l = bs2.l("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        l.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", av4Var.b);
        l.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(l);
        for (j23 j23Var : av4Var.a) {
            builder.addCredentialOption(new CredentialOption.Builder(j23Var.a, j23Var.b, j23Var.c).setIsSystemProviderRequired(false).setAllowedProviders(j23Var.d).build());
        }
        GetCredentialRequest build = builder.build();
        build.getClass();
        credentialManager.getCredential(context, build, cancellationSignal, executor, x23Var);
    }
}
