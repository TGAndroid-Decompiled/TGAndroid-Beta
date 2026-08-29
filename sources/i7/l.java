package i7;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
public abstract class l {
    public static com.google.android.gms.internal.clearcut.v0 a(Context context, GoogleSignInOptions googleSignInOptions) {
        z5.l.h(googleSignInOptions);
        return new com.google.android.gms.common.api.j(context, i5.a.f8249a, googleSignInOptions, new com.google.android.gms.common.api.i(new Object(), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        l5.b bVar;
        GoogleSignInAccount googleSignInAccount;
        ag.j2 j2Var = m5.h.f16877a;
        Status status = Status.h;
        if (intent == null) {
            bVar = new l5.b(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                bVar = new l5.b(null, status);
            } else {
                bVar = new l5.b(googleSignInAccount2, Status.f3751e);
            }
        }
        Status status3 = bVar.f14483a;
        if (status3.b() && (googleSignInAccount = bVar.f14484b) != null) {
            return Tasks.forResult(googleSignInAccount);
        }
        return Tasks.forException(z5.l.m(status3));
    }
}
