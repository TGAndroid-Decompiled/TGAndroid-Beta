package m5;

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
public final class e extends z5.g {
    public final GoogleSignInOptions Q;

    public e(Context context, Looper looper, s3 s3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, s3Var, kVar, lVar, 0);
        l5.a aVar;
        Set<Scope> set = (Set) s3Var.f16689b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f14476a = new HashSet();
            obj.h = new HashMap();
            obj.f14476a = new HashSet(googleSignInOptions.f3692b);
            obj.f14477b = googleSignInOptions.f3694e;
            obj.f14478c = googleSignInOptions.f3695f;
            obj.d = googleSignInOptions.d;
            obj.f14479e = googleSignInOptions.h;
            obj.f14480f = googleSignInOptions.f3693c;
            obj.f14481g = googleSignInOptions.f3696n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f3697r);
            obj.f14482i = googleSignInOptions.f3698s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f14476a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f14482i = u6.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f14476a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f14476a;
        if (hashSet2.contains(GoogleSignInOptions.A)) {
            Scope scope2 = GoogleSignInOptions.f3690y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f14480f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f3689x);
        }
        this.Q = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f14480f, aVar.d, aVar.f14477b, aVar.f14478c, aVar.f14479e, aVar.f14481g, aVar.h, aVar.f14482i);
    }

    @Override
    public final int k() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f50618n, this.Q);
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
        return new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 9);
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
