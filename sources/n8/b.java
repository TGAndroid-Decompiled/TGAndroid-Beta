package n8;

import a8.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
public abstract class b {
    public static final d f15429a;
    public static final e f15430b;

    static {
        ?? obj = new Object();
        d dVar = new d(9);
        f15429a = dVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        f15430b = new e("SignIn.API", dVar, obj);
    }
}
