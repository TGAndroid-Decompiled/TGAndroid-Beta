package a;

import a6.c;
import a8.ng;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import b6.h;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import o6.l;
public abstract class a {
    public static a6.a a(Context context, GoogleSignInOptions googleSignInOptions) {
        l.h(googleSignInOptions);
        return new j(context, x5.a.f51401a, googleSignInOptions, new i(new Object(), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        c cVar;
        GoogleSignInAccount googleSignInAccount;
        ng ngVar = h.f3667a;
        Status status = Status.h;
        if (intent == null) {
            cVar = new c(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                cVar = new c(null, status);
            } else {
                cVar = new c(googleSignInAccount2, Status.e);
            }
        }
        Status status3 = cVar.f335a;
        if (status3.b() && (googleSignInAccount = cVar.f336b) != null) {
            return Tasks.forResult(googleSignInAccount);
        }
        return Tasks.forException(l.m(status3));
    }
}
