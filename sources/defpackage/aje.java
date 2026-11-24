package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
public abstract class aje {
    public static u84 a(Context context, GoogleSignInOptions googleSignInOptions) {
        fre.h(googleSignInOptions);
        return new by4(context, o40.a, googleSignInOptions, new ay4(new eef((byte) 13), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        bz4 bz4Var;
        GoogleSignInAccount googleSignInAccount;
        lh0 lh0Var = h4d.a;
        Status status = Status.h;
        if (intent == null) {
            bz4Var = new bz4(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                bz4Var = new bz4(null, status);
            } else {
                bz4Var = new bz4(googleSignInAccount2, Status.e);
            }
        }
        Status status3 = bz4Var.a;
        if (status3.b() && (googleSignInAccount = bz4Var.b) != null) {
            return Tasks.forResult(googleSignInAccount);
        }
        return Tasks.forException(bmd.a(status3));
    }
}
