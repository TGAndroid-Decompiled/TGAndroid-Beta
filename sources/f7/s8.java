package f7;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
public abstract class s8 {
    public static com.google.android.gms.internal.clearcut.v0 a(Context context, GoogleSignInOptions googleSignInOptions) {
        x5.l.h(googleSignInOptions);
        return new com.google.android.gms.common.api.j(context, g5.a.f7109a, googleSignInOptions, new com.google.android.gms.common.api.i(new Object(), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        j5.b bVar;
        GoogleSignInAccount googleSignInAccount;
        a6.a aVar = k5.h.f14656a;
        Status status = Status.h;
        if (intent == null) {
            bVar = new j5.b(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                bVar = new j5.b(null, status);
            } else {
                bVar = new j5.b(googleSignInAccount2, Status.f2737e);
            }
        }
        Status status3 = bVar.f13624a;
        if (status3.b() && (googleSignInAccount = bVar.f13625b) != null) {
            return Tasks.forResult(googleSignInAccount);
        }
        return Tasks.forException(x5.l.m(status3));
    }
}
