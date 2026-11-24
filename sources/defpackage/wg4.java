package defpackage;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
public final class wg4 implements OnSuccessListener {
    public final byte a;
    public final FirebaseMessaging b;

    public wg4(FirebaseMessaging firebaseMessaging, byte b) {
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
                owb owbVar = (owb) obj;
                if (firebaseMessaging.f.A() && owbVar.g.a() != null) {
                    synchronized (owbVar) {
                        z = owbVar.f;
                    }
                    if (!z) {
                        owbVar.e(0L);
                        return;
                    }
                    return;
                }
                return;
            default:
                aj2 aj2Var = (aj2) obj;
                if (aj2Var != null) {
                    xoe.b(aj2Var.a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
