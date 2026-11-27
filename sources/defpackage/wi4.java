package defpackage;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
public final class wi4 implements OnSuccessListener {
    public final byte a;
    public final FirebaseMessaging b;

    public wi4(FirebaseMessaging firebaseMessaging, byte b) {
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
                q0c q0cVar = (q0c) obj;
                if (firebaseMessaging.f.x() && q0cVar.g.a() != null) {
                    synchronized (q0cVar) {
                        z = q0cVar.f;
                    }
                    if (!z) {
                        q0cVar.e(0L);
                        return;
                    }
                    return;
                }
                return;
            default:
                wj2 wj2Var = (wj2) obj;
                if (wj2Var != null) {
                    rte.b(wj2Var.a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
