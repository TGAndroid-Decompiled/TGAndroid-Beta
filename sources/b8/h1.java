package b8;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
public abstract class h1 {
    public static a9.j0 a(Context context, GoogleSignInOptions googleSignInOptions) {
        p6.m.g(googleSignInOptions);
        return new com.google.android.gms.common.api.j(context, y5.a.f59031a, googleSignInOptions, new com.google.android.gms.common.api.i(new mb.b(5), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        b6.b bVar;
        GoogleSignInAccount googleSignInAccount;
        org.telegram.messenger.d1 d1Var = c6.h.f4232a;
        Status status = Status.h;
        if (intent == null) {
            bVar = new b6.b(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                bVar = new b6.b(null, status);
            } else {
                bVar = new b6.b(googleSignInAccount2, Status.f6577e);
            }
        }
        Status status3 = bVar.f2451a;
        if (status3.b() && (googleSignInAccount = bVar.f2452b) != null) {
            return Tasks.forResult(googleSignInAccount);
        }
        return Tasks.forException(p6.m.l(status3));
    }
}
