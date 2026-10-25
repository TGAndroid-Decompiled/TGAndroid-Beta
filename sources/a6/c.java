package a6;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class c implements q {
    public final Status f335a;
    public final GoogleSignInAccount f336b;

    public c(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f336b = googleSignInAccount;
        this.f335a = status;
    }

    @Override
    public final Status h() {
        return this.f335a;
    }
}
