package n5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f15249a;
    public final GoogleSignInAccount f15250b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f15250b = googleSignInAccount;
        this.f15249a = status;
    }

    @Override
    public final Status i() {
        return this.f15249a;
    }
}
