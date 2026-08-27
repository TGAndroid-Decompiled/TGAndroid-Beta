package g7;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

public abstract class m8 {
    public static com.google.android.gms.internal.clearcut.v0 a(Context context, GoogleSignInOptions googleSignInOptions) {
        y5.l.h(googleSignInOptions);
        return new com.google.android.gms.internal.clearcut.v0(context, g5.a.f6387a, googleSignInOptions, new com.google.android.gms.common.api.i(new com.google.android.gms.common.api.internal.a(), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        j5.b bVar;
        GoogleSignInAccount googleSignInAccount;
        b6.a aVar = k5.h.f14477a;
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
                bVar = new j5.b(googleSignInAccount2, Status.f3182e);
            }
        }
        Status status3 = bVar.f12722a;
        return (!status3.b() || (googleSignInAccount = bVar.f12723b) == null) ? Tasks.forException(y5.l.m(status3)) : Tasks.forResult(googleSignInAccount);
    }
}
