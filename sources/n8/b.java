package n8;

import a8.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
public abstract class b {
    public static final d f15184a;
    public static final e f15185b;

    static {
        ?? obj = new Object();
        d dVar = new d(9);
        f15184a = dVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        f15185b = new e("SignIn.API", dVar, obj);
    }
}
