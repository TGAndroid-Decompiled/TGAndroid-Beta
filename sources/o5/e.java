package o5;

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
import m.r3;
public final class e extends b6.g {
    public final GoogleSignInOptions R;

    public e(Context context, Looper looper, r3 r3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, r3Var, kVar, lVar, 0);
        n5.a aVar;
        Set<Scope> set = (Set) r3Var.f13328b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f15242a = new HashSet();
            obj.h = new HashMap();
            obj.f15242a = new HashSet(googleSignInOptions.f2583b);
            obj.f15243b = googleSignInOptions.f2585e;
            obj.f15244c = googleSignInOptions.f2586f;
            obj.d = googleSignInOptions.d;
            obj.f15245e = googleSignInOptions.h;
            obj.f15246f = googleSignInOptions.f2584c;
            obj.f15247g = googleSignInOptions.f2587n;
            obj.h = GoogleSignInOptions.f(googleSignInOptions.f2588r);
            obj.f15248i = googleSignInOptions.f2589s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f15242a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f15248i = w6.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f15242a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f15242a;
        if (hashSet2.contains(GoogleSignInOptions.B)) {
            Scope scope2 = GoogleSignInOptions.f2581y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f15246f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f2580x);
        }
        this.R = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f15246f, aVar.d, aVar.f15243b, aVar.f15244c, aVar.f15245e, aVar.f15247g, aVar.h, aVar.f15248i);
    }

    @Override
    public final int k() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f1718n, this.R);
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
        return new a7.a(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 10);
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
