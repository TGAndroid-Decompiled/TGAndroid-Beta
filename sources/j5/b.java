package j5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;

public final class b implements q {

    public final Status f12722a;

    public final GoogleSignInAccount f12723b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f12723b = googleSignInAccount;
        this.f12722a = status;
    }

    @Override
    public final Status i() {
        return this.f12722a;
    }
}
