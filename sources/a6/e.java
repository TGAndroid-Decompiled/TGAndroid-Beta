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
import m.r3;
public final class e extends n6.g {
    public final GoogleSignInOptions U;

    public e(Context context, Looper looper, r3 r3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, r3Var, kVar, lVar, 0);
        z5.a aVar;
        Set<Scope> set = (Set) r3Var.f13138b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f47268a = new HashSet();
            obj.h = new HashMap();
            obj.f47268a = new HashSet(googleSignInOptions.f4739b);
            obj.f47269b = googleSignInOptions.e;
            obj.f47270c = googleSignInOptions.f4741f;
            obj.d = googleSignInOptions.d;
            obj.e = googleSignInOptions.h;
            obj.f47271f = googleSignInOptions.f4740c;
            obj.f47272g = googleSignInOptions.f4742n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f4743r);
            obj.f47273i = googleSignInOptions.f4744s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f47268a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f47273i = i7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f47268a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f47268a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.f4737y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f47271f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f4736x);
        }
        this.U = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f47271f, aVar.d, aVar.f47269b, aVar.f47270c, aVar.e, aVar.f47272g, aVar.h, aVar.f47273i);
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f13864n, this.U);
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
