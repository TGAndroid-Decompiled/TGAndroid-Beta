package defpackage;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
public final class yi4 implements OnSuccessListener {
    public final byte a;
    public final FirebaseMessaging b;

    public yi4(FirebaseMessaging firebaseMessaging, byte b) {
        this.a = b;
        this.b = firebaseMessaging;
    }

    @Override
    public final void onSuccess(Object obj) {
        boolean z;
        byte b = this.a;
        FirebaseMessaging firebaseMessaging = this.b;
        switch (b) {
            case 0:
                ryb rybVar = (ryb) obj;
                if (firebaseMessaging.f.z() && rybVar.g.a() != null) {
                    synchronized (rybVar) {
                        z = rybVar.f;
                    }
                    if (!z) {
                        rybVar.e(0L);
                        return;
                    }
                    return;
                }
                return;
            default:
                ok2 ok2Var = (ok2) obj;
                if (ok2Var != null) {
                    are.b(ok2Var.a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
