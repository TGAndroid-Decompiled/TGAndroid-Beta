package l5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f14483a;
    public final GoogleSignInAccount f14484b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f14484b = googleSignInAccount;
        this.f14483a = status;
    }

    @Override
    public final Status i() {
        return this.f14483a;
    }
}
