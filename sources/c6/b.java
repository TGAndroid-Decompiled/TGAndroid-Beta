package c6;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
public final class b implements r {
    public final Status f4499a;
    public final GoogleSignInAccount f4500b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f4500b = googleSignInAccount;
        this.f4499a = status;
    }

    @Override
    public final Status a() {
        return this.f4499a;
    }
}
