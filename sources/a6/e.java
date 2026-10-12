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
        Set<Scope> set = (Set) r3Var.f15556b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f53795a = new HashSet();
            obj.h = new HashMap();
            obj.f53795a = new HashSet(googleSignInOptions.f6460b);
            obj.f53796b = googleSignInOptions.f6462e;
            obj.f53797c = googleSignInOptions.f6463f;
            obj.d = googleSignInOptions.d;
            obj.f53798e = googleSignInOptions.h;
            obj.f53799f = googleSignInOptions.f6461c;
            obj.f53800g = googleSignInOptions.f6464n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f6465r);
            obj.f53801i = googleSignInOptions.f6466s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f53795a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f53801i = i7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f53795a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f53795a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.f6458y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f53799f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f6457x);
        }
        this.U = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f53799f, aVar.d, aVar.f53796b, aVar.f53797c, aVar.f53798e, aVar.f53800g, aVar.h, aVar.f53801i);
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f16404n, this.U);
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
