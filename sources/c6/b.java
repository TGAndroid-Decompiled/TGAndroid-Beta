package c6;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
public final class b implements r {
    public final Status f4189a;
    public final GoogleSignInAccount f4190b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f4190b = googleSignInAccount;
        this.f4189a = status;
    }

    @Override
    public final Status a() {
        return this.f4189a;
    }
}
