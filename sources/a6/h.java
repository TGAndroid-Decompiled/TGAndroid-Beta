package a6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
public abstract class h {
    public static final a5.a f309a = new a5.a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f309a.f("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static void b(Context context) {
        i.G(context).I();
        Set<com.google.android.gms.common.api.m> set = com.google.android.gms.common.api.m.f5153a;
        synchronized (set) {
        }
        for (com.google.android.gms.common.api.m mVar : set) {
            mVar.e();
        }
        com.google.android.gms.common.api.internal.h.a();
    }
}
