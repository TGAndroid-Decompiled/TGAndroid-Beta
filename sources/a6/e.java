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
        Set<Scope> set = (Set) q3Var.f15800b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f53607a = new HashSet();
            obj.h = new HashMap();
            obj.f53607a = new HashSet(googleSignInOptions.f6462b);
            obj.f53608b = googleSignInOptions.f6464e;
            obj.f53609c = googleSignInOptions.f6465f;
            obj.d = googleSignInOptions.d;
            obj.f53610e = googleSignInOptions.h;
            obj.f53611f = googleSignInOptions.f6463c;
            obj.f53612g = googleSignInOptions.f6466n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f6467r);
            obj.f53613i = googleSignInOptions.f6468s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f53607a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f53613i = i7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f53607a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f53607a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.f6460y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f53611f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f6459x);
        }
        this.U = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f53611f, aVar.d, aVar.f53608b, aVar.f53609c, aVar.f53610e, aVar.f53612g, aVar.h, aVar.f53613i);
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f16658n, this.U);
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
