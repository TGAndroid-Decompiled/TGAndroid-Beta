package defpackage;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
public final class f23 implements OutcomeReceiver {
    public final byte a = 0;
    public final o13 b;

    public f23(o13 o13Var, g23 g23Var) {
        this.b = o13Var;
    }

    public final void onError(Throwable th) {
        byte b = this.a;
        o13 o13Var = this.b;
        switch (b) {
            case 0:
                CreateCredentialException createCredentialException = (CreateCredentialException) th;
                createCredentialException.getClass();
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                String type = createCredentialException.getType();
                type.getClass();
                ((i4d) o13Var).M(dud.a(createCredentialException.getMessage(), type));
                return;
            default:
                GetCredentialException getCredentialException = (GetCredentialException) th;
                getCredentialException.getClass();
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                String type2 = getCredentialException.getType();
                type2.getClass();
                o13Var.M(dud.b(getCredentialException.getMessage(), type2));
                return;
        }
    }

    public final void onResult(Object obj) {
        byte b = this.a;
        o13 o13Var = this.b;
        switch (b) {
            case 0:
                CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) obj;
                createCredentialResponse.getClass();
                Log.i("CredManProvService", "Create Result returned from framework: ");
                Bundle data = createCredentialResponse.getData();
                data.getClass();
                ((i4d) o13Var).onResult(s9e.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
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
                o13Var.onResult(new xs4(fae.a(type, data2)));
                return;
        }
    }

    public f23(i4d i4dVar, a13 a13Var, g23 g23Var) {
        this.b = i4dVar;
    }
}
