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
        Set<Scope> set = (Set) p3Var.f12520b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f54639a = new HashSet();
            obj.h = new HashMap();
            obj.f54639a = new HashSet(googleSignInOptions.f4277b);
            obj.f54640b = googleSignInOptions.e;
            obj.f54641c = googleSignInOptions.f4279f;
            obj.d = googleSignInOptions.d;
            obj.e = googleSignInOptions.h;
            obj.f54642f = googleSignInOptions.f4278c;
            obj.f54643g = googleSignInOptions.f4280n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f4281r);
            obj.f54644i = googleSignInOptions.f4282s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f54639a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f54644i = i7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f54639a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f54639a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.D;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f54642f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f4275y);
        }
        this.U = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f54642f, aVar.d, aVar.f54640b, aVar.f54641c, aVar.e, aVar.f54643g, aVar.h, aVar.f54644i);
    }

    @Override
    public final int m() {
        return 12451000;
    }

    @Override
    public final Intent p() {
        return h.a(this.f13586n, this.U);
    }

    @Override
    public final IInterface r(IBinder iBinder) {
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
    public final String w() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override
    public final String x() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
