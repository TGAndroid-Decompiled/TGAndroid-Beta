package ab;

import a8.b1;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
public final class p implements OnSuccessListener {
    public final int f980a;
    public final FirebaseMessaging f981b;

    public p(FirebaseMessaging firebaseMessaging, int i7) {
        this.f980a = i7;
        this.f981b = firebaseMessaging;
    }

    @Override
    public final void onSuccess(Object obj) {
        boolean z10;
        switch (this.f980a) {
            case 0:
                j0 j0Var = (j0) obj;
                if (this.f981b.f7280f.s() && j0Var.f957g.a() != null) {
                    synchronized (j0Var) {
                        z10 = j0Var.f956f;
                    }
                    if (!z10) {
                        j0Var.e(0L);
                        return;
                    }
                    return;
                }
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f981b;
                m6.a aVar = (m6.a) obj;
                ob.c cVar = FirebaseMessaging.f7273m;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    b1.b(aVar.f20479a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
