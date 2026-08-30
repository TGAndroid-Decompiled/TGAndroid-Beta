package o5;

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
public final class e extends b6.g {
    public final GoogleSignInOptions R;

    public e(Context context, Looper looper, s3 s3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, s3Var, kVar, lVar, 0);
        n5.a aVar;
        Set<Scope> set = (Set) s3Var.f13642b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f14264a = new HashSet();
            obj.h = new HashMap();
            obj.f14264a = new HashSet(googleSignInOptions.f2661b);
            obj.f14265b = googleSignInOptions.e;
            obj.f14266c = googleSignInOptions.f2663f;
            obj.d = googleSignInOptions.d;
            obj.e = googleSignInOptions.h;
            obj.f14267f = googleSignInOptions.f2662c;
            obj.f14268g = googleSignInOptions.f2664n;
            obj.h = GoogleSignInOptions.f(googleSignInOptions.f2665r);
            obj.f14269i = googleSignInOptions.f2666s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f14264a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f14269i = w6.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f14264a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f14264a;
        if (hashSet2.contains(GoogleSignInOptions.B)) {
            Scope scope2 = GoogleSignInOptions.f2659y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f14267f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f2658x);
        }
        this.R = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f14267f, aVar.d, aVar.f14265b, aVar.f14266c, aVar.e, aVar.f14268g, aVar.h, aVar.f14269i);
    }

    @Override
    public final int k() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f1588n, this.R);
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
        return new a7.a(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 10);
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
