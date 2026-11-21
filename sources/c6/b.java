package c6;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
public final class b implements r {
    public final Status f4496a;
    public final GoogleSignInAccount f4497b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f4497b = googleSignInAccount;
        this.f4496a = status;
    }

    @Override
    public final Status a() {
        return this.f4496a;
    }
}
