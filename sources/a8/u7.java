package a8;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
public abstract class u7 {
    public static b9.j0 a(Context context, GoogleSignInOptions googleSignInOptions) {
        q6.m.g(googleSignInOptions);
        return new com.google.android.gms.common.api.j(context, z5.a.f59716a, googleSignInOptions, new com.google.android.gms.common.api.i(new sa.d(6), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        c6.b bVar;
        GoogleSignInAccount googleSignInAccount;
        org.telegram.messenger.d1 d1Var = d6.h.f8204a;
        Status status = Status.h;
        if (intent == null) {
            bVar = new c6.b(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                bVar = new c6.b(null, status);
            } else {
                bVar = new c6.b(googleSignInAccount2, Status.f6523e);
            }
        }
        Status status3 = bVar.f5360a;
        if (status3.b() && (googleSignInAccount = bVar.f5361b) != null) {
            return Tasks.forResult(googleSignInAccount);
        }
        return Tasks.forException(q6.m.l(status3));
    }
}
