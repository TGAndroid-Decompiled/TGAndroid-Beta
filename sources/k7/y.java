package k7;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
public abstract class y {
    public static a8.e a(Context context, GoogleSignInOptions googleSignInOptions) {
        b6.m.h(googleSignInOptions);
        return new com.google.android.gms.common.api.j(context, k5.a.f9729a, googleSignInOptions, new com.google.android.gms.common.api.i(new Object(), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        n5.b bVar;
        GoogleSignInAccount googleSignInAccount;
        b4.e0 e0Var = o5.h.f16436a;
        Status status = Status.h;
        if (intent == null) {
            bVar = new n5.b(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                bVar = new n5.b(null, status);
            } else {
                bVar = new n5.b(googleSignInAccount2, Status.e);
            }
        }
        Status status3 = bVar.f14255a;
        if (status3.e() && (googleSignInAccount = bVar.f14256b) != null) {
            return Tasks.forResult(googleSignInAccount);
        }
        return Tasks.forException(b6.m.m(status3));
    }
}
