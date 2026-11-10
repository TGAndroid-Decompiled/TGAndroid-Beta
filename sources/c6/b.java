package c6;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f5365a;
    public final GoogleSignInAccount f5366b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f5366b = googleSignInAccount;
        this.f5365a = status;
    }

    @Override
    public final Status a() {
        return this.f5365a;
    }
}
