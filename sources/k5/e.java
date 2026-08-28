package k5;

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
import m.t3;
public final class e extends x5.g {
    public final GoogleSignInOptions Q;

    public e(Context context, Looper looper, t3 t3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, t3Var, kVar, lVar, 0);
        j5.a aVar;
        Set<Scope> set = (Set) t3Var.f17099b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f13617a = new HashSet();
            obj.h = new HashMap();
            obj.f13617a = new HashSet(googleSignInOptions.f2678b);
            obj.f13618b = googleSignInOptions.f2680e;
            obj.f13619c = googleSignInOptions.f2681f;
            obj.d = googleSignInOptions.d;
            obj.f13620e = googleSignInOptions.h;
            obj.f13621f = googleSignInOptions.f2679c;
            obj.f13622g = googleSignInOptions.f2682n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f2683r);
            obj.f13623i = googleSignInOptions.f2684s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f13617a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f13623i = s6.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f13617a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f13617a;
        if (hashSet2.contains(GoogleSignInOptions.A)) {
            Scope scope2 = GoogleSignInOptions.f2676y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f13621f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f2675x);
        }
        this.Q = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f13621f, aVar.d, aVar.f13618b, aVar.f13619c, aVar.f13620e, aVar.f13622g, aVar.h, aVar.f13623i);
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f48918n, this.Q);
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof k) {
            return (k) queryLocalInterface;
        }
        return new b7.a(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 9);
    }

    @Override
    public final String v() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
