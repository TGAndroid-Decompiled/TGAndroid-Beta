package n8;

import a8.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
public abstract class b {
    public static final d f13734a;
    public static final e f13735b;

    static {
        ?? obj = new Object();
        d dVar = new d(9);
        f13734a = dVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        f13735b = new e("SignIn.API", dVar, obj);
    }
}
