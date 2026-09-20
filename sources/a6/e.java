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
import m.p3;
public final class e extends n6.g {
    public final GoogleSignInOptions U;

    public e(Context context, Looper looper, p3 p3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, p3Var, kVar, lVar, 0);
        z5.a aVar;
        Set<Scope> set = (Set) p3Var.f14504b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f48452a = new HashSet();
            obj.h = new HashMap();
            obj.f48452a = new HashSet(googleSignInOptions.f5966b);
            obj.f48453b = googleSignInOptions.e;
            obj.f48454c = googleSignInOptions.f5968f;
            obj.d = googleSignInOptions.d;
            obj.e = googleSignInOptions.h;
            obj.f48455f = googleSignInOptions.f5967c;
            obj.f48456g = googleSignInOptions.f5969n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f5970r);
            obj.f48457i = googleSignInOptions.f5971s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f48452a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f48457i = i7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f48452a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f48452a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.f5964y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f48455f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f5963x);
        }
        this.U = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f48455f, aVar.d, aVar.f48453b, aVar.f48454c, aVar.e, aVar.f48456g, aVar.h, aVar.f48457i);
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f15257n, this.U);
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
