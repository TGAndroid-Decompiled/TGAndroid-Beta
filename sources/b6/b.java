package b6;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f2451a;
    public final GoogleSignInAccount f2452b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f2452b = googleSignInAccount;
        this.f2451a = status;
    }

    @Override
    public final Status a() {
        return this.f2451a;
    }
}
