package n5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f14270a;
    public final GoogleSignInAccount f14271b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f14271b = googleSignInAccount;
        this.f14270a = status;
    }

    @Override
    public final Status i() {
        return this.f14270a;
    }
}
