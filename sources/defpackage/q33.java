package defpackage;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
public final class q33 implements OutcomeReceiver {
    public final byte a = 1;
    public final a33 b;

    public q33(a33 a33Var, r33 r33Var) {
        this.b = a33Var;
    }

    public final void onError(Throwable th) {
        byte b = this.a;
        a33 a33Var = this.b;
        switch (b) {
            case 0:
                CreateCredentialException createCredentialException = (CreateCredentialException) th;
                createCredentialException.getClass();
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                String type = createCredentialException.getType();
                type.getClass();
                ((nl9) a33Var).A(gwd.a(createCredentialException.getMessage(), type));
                return;
            default:
                GetCredentialException getCredentialException = (GetCredentialException) th;
                getCredentialException.getClass();
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                String type2 = getCredentialException.getType();
                type2.getClass();
                a33Var.A(gwd.b(getCredentialException.getMessage(), type2));
                return;
        }
    }

    public final void onResult(Object obj) {
        byte b = this.a;
        a33 a33Var = this.b;
        switch (b) {
            case 0:
                CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) obj;
                createCredentialResponse.getClass();
                Log.i("CredManProvService", "Create Result returned from framework: ");
                Bundle data = createCredentialResponse.getData();
                data.getClass();
                ((nl9) a33Var).onResult(tbe.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
                return;
            default:
                GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
                getCredentialResponse.getClass();
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                Credential credential = getCredentialResponse.getCredential();
                credential.getClass();
                String type = credential.getType();
                type.getClass();
                Bundle data2 = credential.getData();
                data2.getClass();
                a33Var.onResult(new yu4(gce.a(type, data2)));
                return;
        }
    }

    public q33(nl9 nl9Var, m23 m23Var, r33 r33Var) {
        this.b = nl9Var;
    }
}
