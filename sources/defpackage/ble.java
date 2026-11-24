package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
public abstract class ble {
    public static ua4 a(Context context, GoogleSignInOptions googleSignInOptions) {
        ite.h(googleSignInOptions);
        return new c05(context, o50.a, googleSignInOptions, new b05(new fgf((byte) 13), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        a15 a15Var;
        GoogleSignInAccount googleSignInAccount;
        li0 li0Var = j6d.a;
        Status status = Status.h;
        if (intent == null) {
            a15Var = new a15(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                a15Var = new a15(null, status);
            } else {
                a15Var = new a15(googleSignInAccount2, Status.e);
            }
        }
        Status status3 = a15Var.a;
        if (status3.b() && (googleSignInAccount = a15Var.b) != null) {
            return Tasks.forResult(googleSignInAccount);
        }
        return Tasks.forException(dod.a(status3));
    }
}
