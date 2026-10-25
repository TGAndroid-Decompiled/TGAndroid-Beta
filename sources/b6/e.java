package b6;

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
public final class e extends o6.g {
    public final GoogleSignInOptions U;

    public e(Context context, Looper looper, r3 r3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, r3Var, kVar, lVar, 0);
        a6.b bVar;
        Set<Scope> set = (Set) r3Var.f17845b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f329a = new HashSet();
            obj.h = new HashMap();
            obj.f329a = new HashSet(googleSignInOptions.f6409b);
            obj.f330b = googleSignInOptions.e;
            obj.f331c = googleSignInOptions.f6411f;
            obj.d = googleSignInOptions.d;
            obj.e = googleSignInOptions.h;
            obj.f332f = googleSignInOptions.f6410c;
            obj.f333g = googleSignInOptions.f6412n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f6413r);
            obj.f334i = googleSignInOptions.f6414s;
            bVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f329a = new HashSet();
            obj2.h = new HashMap();
            bVar = obj2;
        }
        bVar.f334i = j7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = bVar.f329a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = bVar.f329a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.f6407y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (bVar.d && (bVar.f332f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f6406x);
        }
        this.U = new GoogleSignInOptions(3, new ArrayList(hashSet2), bVar.f332f, bVar.d, bVar.f330b, bVar.f331c, bVar.e, bVar.f333g, bVar.h, bVar.f334i);
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f19127n, this.U);
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
        return new a8.a(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 6);
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
