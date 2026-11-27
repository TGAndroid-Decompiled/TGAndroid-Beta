package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public final class f15 implements ie9 {
    public final Status a;
    public final GoogleSignInAccount b;

    public f15(GoogleSignInAccount googleSignInAccount, Status status) {
        this.b = googleSignInAccount;
        this.a = status;
    }

    @Override
    public final Status a() {
        return this.a;
    }
}
