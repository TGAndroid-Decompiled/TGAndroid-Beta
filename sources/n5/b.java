package n5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f14255a;
    public final GoogleSignInAccount f14256b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f14256b = googleSignInAccount;
        this.f14255a = status;
    }

    @Override
    public final Status i() {
        return this.f14255a;
    }
}
