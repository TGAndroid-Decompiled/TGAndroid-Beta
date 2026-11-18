package ab;

import a8.b1;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
public final class p implements OnSuccessListener {
    public final int f979a;
    public final FirebaseMessaging f980b;

    public p(FirebaseMessaging firebaseMessaging, int i7) {
        this.f979a = i7;
        this.f980b = firebaseMessaging;
    }

    @Override
    public final void onSuccess(Object obj) {
        boolean z10;
        switch (this.f979a) {
            case 0:
                j0 j0Var = (j0) obj;
                if (this.f980b.f7566f.s() && j0Var.f956g.a() != null) {
                    synchronized (j0Var) {
                        z10 = j0Var.f955f;
                    }
                    if (!z10) {
                        j0Var.e(0L);
                        return;
                    }
                    return;
                }
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f980b;
                m6.a aVar = (m6.a) obj;
                ob.c cVar = FirebaseMessaging.f7559m;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    b1.b(aVar.f20843a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
