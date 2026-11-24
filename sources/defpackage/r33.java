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
public final class r33 implements d33 {
    public final CredentialManager a;

    public r33(Context context) {
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
    public final void onCreateCredential(Context context, u13 u13Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var) {
        context.getClass();
        nl9 nl9Var = (nl9) a33Var;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            nl9Var.A(new n13("Your device doesn't support credential manager", (byte) 3));
            return;
        }
        q33 q33Var = new q33(nl9Var, (m23) u13Var, this);
        credentialManager.getClass();
        Bundle bundle = u13Var.a;
        s13 s13Var = u13Var.c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", s13Var.b);
        String str = s13Var.c;
        if (!TextUtils.isEmpty(str)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", str);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, 2131230865));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, u13Var.b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        alwaysSendAppInfoToProvider.getClass();
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        build.getClass();
        credentialManager.createCredential(context, build, cancellationSignal, executor, q33Var);
    }

    @Override
    public final void onGetCredential(Context context, xu4 xu4Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var) {
        executor.getClass();
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            a33Var.A(new uu4("Your device doesn't support credential manager", (byte) 3));
            return;
        }
        q33 q33Var = new q33(a33Var, this);
        credentialManager.getClass();
        Bundle l = ts2.l("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        l.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", xu4Var.b);
        l.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(l);
        for (c33 c33Var : xu4Var.a) {
            builder.addCredentialOption(new CredentialOption.Builder(c33Var.a, c33Var.b, c33Var.c).setIsSystemProviderRequired(false).setAllowedProviders(c33Var.d).build());
        }
        GetCredentialRequest build = builder.build();
        build.getClass();
        credentialManager.getCredential(context, build, cancellationSignal, executor, q33Var);
    }
}
