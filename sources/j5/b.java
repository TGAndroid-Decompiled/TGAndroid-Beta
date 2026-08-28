package j5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f13624a;
    public final GoogleSignInAccount f13625b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f13625b = googleSignInAccount;
        this.f13624a = status;
    }

    @Override
    public final Status i() {
        return this.f13624a;
    }
}
