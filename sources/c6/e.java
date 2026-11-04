package c6;

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
public final class e extends p6.h {
    public final GoogleSignInOptions F;

    public e(Context context, Looper looper, o3 o3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, o3Var, kVar, lVar, 0);
        b6.a aVar;
        Set<Scope> set = (Set) o3Var.f18683b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f2444a = new HashSet();
            obj.h = new HashMap();
            obj.f2444a = new HashSet(googleSignInOptions.f6518b);
            obj.f2445b = googleSignInOptions.f6520e;
            obj.f2446c = googleSignInOptions.f6521f;
            obj.d = googleSignInOptions.d;
            obj.f2447e = googleSignInOptions.h;
            obj.f2448f = googleSignInOptions.f6519c;
            obj.f2449g = googleSignInOptions.f6522n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f6523r);
            obj.f2450i = googleSignInOptions.f6524s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f2444a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f2450i = k7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f2444a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f2444a;
        if (hashSet2.contains(GoogleSignInOptions.F)) {
            Scope scope2 = GoogleSignInOptions.E;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f2448f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f6516y);
        }
        this.F = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f2448f, aVar.d, aVar.f2445b, aVar.f2446c, aVar.f2447e, aVar.f2449g, aVar.h, aVar.f2450i);
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
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof k) {
            return (k) queryLocalInterface;
        }
        return new b8.a(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 6);
    }

    @Override
    public final String n() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
