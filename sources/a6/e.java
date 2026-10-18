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
import m.s3;
public final class e extends n6.g {
    public final GoogleSignInOptions U;

    public e(Context context, Looper looper, s3 s3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, s3Var, kVar, lVar, 0);
        z5.a aVar;
        Set<Scope> set = (Set) s3Var.f16336b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f50750a = new HashSet();
            obj.h = new HashMap();
            obj.f50750a = new HashSet(googleSignInOptions.f6290b);
            obj.f50751b = googleSignInOptions.e;
            obj.f50752c = googleSignInOptions.f6292f;
            obj.d = googleSignInOptions.d;
            obj.e = googleSignInOptions.h;
            obj.f50753f = googleSignInOptions.f6291c;
            obj.f50754g = googleSignInOptions.f6293n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f6294r);
            obj.f50755i = googleSignInOptions.f6295s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f50750a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f50755i = i7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f50750a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f50750a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.f6288y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f50753f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f6287x);
        }
        this.U = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f50753f, aVar.d, aVar.f50751b, aVar.f50752c, aVar.e, aVar.f50754g, aVar.h, aVar.f50755i);
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f17186n, this.U);
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
