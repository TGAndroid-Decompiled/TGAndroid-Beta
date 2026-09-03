package n5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f15251a;
    public final GoogleSignInAccount f15252b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f15252b = googleSignInAccount;
        this.f15251a = status;
    }

    @Override
    public final Status i() {
        return this.f15251a;
    }
}
