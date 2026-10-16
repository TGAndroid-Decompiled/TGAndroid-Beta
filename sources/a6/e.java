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
import m.t3;
public final class e extends n6.g {
    public final GoogleSignInOptions U;

    public e(Context context, Looper looper, t3 t3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, t3Var, kVar, lVar, 0);
        z5.a aVar;
        Set<Scope> set = (Set) t3Var.f14984b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f49320a = new HashSet();
            obj.h = new HashMap();
            obj.f49320a = new HashSet(googleSignInOptions.f4831b);
            obj.f49321b = googleSignInOptions.e;
            obj.f49322c = googleSignInOptions.f4833f;
            obj.d = googleSignInOptions.d;
            obj.e = googleSignInOptions.h;
            obj.f49323f = googleSignInOptions.f4832c;
            obj.f49324g = googleSignInOptions.f4834n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f4835r);
            obj.f49325i = googleSignInOptions.f4836s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f49320a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f49325i = i7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f49320a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f49320a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.f4829y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f49323f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f4828x);
        }
        this.U = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f49323f, aVar.d, aVar.f49321b, aVar.f49322c, aVar.e, aVar.f49324g, aVar.h, aVar.f49325i);
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f15803n, this.U);
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
