package d6;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import m.o3;
public final class e extends q6.h {
    public final GoogleSignInOptions F;

    public e(Context context, Looper looper, o3 o3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, o3Var, kVar, lVar, 0);
        c6.a aVar;
        Set<Scope> set = (Set) o3Var.f20156b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f4455a = new HashSet();
            obj.h = new HashMap();
            obj.f4455a = new HashSet(googleSignInOptions.f6126b);
            obj.f4456b = googleSignInOptions.f6128e;
            obj.f4457c = googleSignInOptions.f6129f;
            obj.d = googleSignInOptions.d;
            obj.f4458e = googleSignInOptions.h;
            obj.f4459f = googleSignInOptions.f6127c;
            obj.f4460g = googleSignInOptions.f6130n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f6131r);
            obj.f4461i = googleSignInOptions.f6132s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f4455a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f4461i = l7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f4455a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f4455a;
        if (hashSet2.contains(GoogleSignInOptions.F)) {
            Scope scope2 = GoogleSignInOptions.E;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f4459f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f6124y);
        }
        this.F = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f4459f, aVar.d, aVar.f4456b, aVar.f4457c, aVar.f4458e, aVar.f4460g, aVar.h, aVar.f4461i);
    }

    @Override
    public final int d() {
        return 12451000;
    }

    @Override
    public final Intent e() {
        return h.a(this.h, this.F);
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof k) {
            return (k) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 7);
    }

    @Override
    public final String o() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
