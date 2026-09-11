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
        Set<Scope> set = (Set) p3Var.f15635b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f50758a = new HashSet();
            obj.h = new HashMap();
            obj.f50758a = new HashSet(googleSignInOptions.f4883b);
            obj.f50759b = googleSignInOptions.f4885e;
            obj.f50760c = googleSignInOptions.f4886f;
            obj.d = googleSignInOptions.d;
            obj.f50761e = googleSignInOptions.h;
            obj.f50762f = googleSignInOptions.f4884c;
            obj.f50763g = googleSignInOptions.f4887n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f4888r);
            obj.f50764i = googleSignInOptions.f4889s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f50758a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f50764i = i7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f50758a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f50758a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.f4881y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f50762f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f4880x);
        }
        this.U = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f50762f, aVar.d, aVar.f50759b, aVar.f50760c, aVar.f50761e, aVar.f50763g, aVar.h, aVar.f50764i);
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f16539n, this.U);
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
