package k7;

import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import g6.d0;
public final class g extends j {
    public static final com.google.android.gms.common.api.e f17226l = new com.google.android.gms.common.api.e("IdentityCredentials.API", new a9.e(7), new Object());

    public final Task f(GetCredentialRequest getCredentialRequest) {
        s b10 = t.b();
        b10.d = new n6.c[]{t7.b.f55358a};
        b10.f6682c = new d0(getCredentialRequest, 8);
        b10.f6680a = 32701;
        Task e10 = e(0, b10.a());
        kotlin.jvm.internal.j.d(e10, "doRead(...)");
        return e10;
    }
}
