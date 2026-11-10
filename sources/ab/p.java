package ab;

import a8.b1;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
public final class p implements OnSuccessListener {
    public final int f981a;
    public final FirebaseMessaging f982b;

    public p(FirebaseMessaging firebaseMessaging, int i7) {
        this.f981a = i7;
        this.f982b = firebaseMessaging;
    }

    @Override
    public final void onSuccess(Object obj) {
        boolean z9;
        switch (this.f981a) {
            case 0:
                j0 j0Var = (j0) obj;
                if (this.f982b.f7896f.s() && j0Var.f958g.a() != null) {
                    synchronized (j0Var) {
                        z9 = j0Var.f957f;
                    }
                    if (!z9) {
                        j0Var.e(0L);
                        return;
                    }
                    return;
                }
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f982b;
                m6.a aVar = (m6.a) obj;
                d0 d0Var = FirebaseMessaging.f7889m;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    b1.b(aVar.f19887a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
