package n8;

import a8.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
public abstract class b {
    public static final d f13733a;
    public static final e f13734b;

    static {
        ?? obj = new Object();
        d dVar = new d(9);
        f13733a = dVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        f13734b = new e("SignIn.API", dVar, obj);
    }
}
