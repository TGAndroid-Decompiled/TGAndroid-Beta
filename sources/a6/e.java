package a6;

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
import m.q3;
public final class e extends n6.g {
    public final GoogleSignInOptions U;

    public e(Context context, Looper looper, q3 q3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, q3Var, kVar, lVar, 0);
        z5.a aVar;
        Set<Scope> set = (Set) q3Var.f15220b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f49321a = new HashSet();
            obj.h = new HashMap();
            obj.f49321a = new HashSet(googleSignInOptions.f4828b);
            obj.f49322b = googleSignInOptions.e;
            obj.f49323c = googleSignInOptions.f4830f;
            obj.d = googleSignInOptions.d;
            obj.e = googleSignInOptions.h;
            obj.f49324f = googleSignInOptions.f4829c;
            obj.f49325g = googleSignInOptions.f4831n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f4832r);
            obj.f49326i = googleSignInOptions.f4833s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f49321a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f49326i = i7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f49321a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f49321a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.f4826y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f49324f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f4825x);
        }
        this.U = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f49324f, aVar.d, aVar.f49322b, aVar.f49323c, aVar.e, aVar.f49325g, aVar.h, aVar.f49326i);
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f16088n, this.U);
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
        return new a9.a(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 5);
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
