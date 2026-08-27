package k5;

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

public final class e extends y5.g {
    public final GoogleSignInOptions Q;

    public e(Context context, Looper looper, t3 t3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        j5.a aVar;
        super(context, looper, 91, t3Var, kVar, lVar, 0);
        Set<Scope> set = (Set) t3Var.f17474b;
        if (googleSignInOptions != null) {
            aVar = new j5.a();
            aVar.f12715a = new HashSet();
            aVar.h = new HashMap();
            aVar.f12715a = new HashSet(googleSignInOptions.f3115b);
            aVar.f12716b = googleSignInOptions.f3117e;
            aVar.f12717c = googleSignInOptions.f3118f;
            aVar.d = googleSignInOptions.d;
            aVar.f12718e = googleSignInOptions.h;
            aVar.f12719f = googleSignInOptions.f3116c;
            aVar.f12720g = googleSignInOptions.f3119n;
            aVar.h = GoogleSignInOptions.c(googleSignInOptions.f3120r);
            aVar.f12721i = googleSignInOptions.f3121s;
        } else {
            aVar = new j5.a();
            aVar.f12715a = new HashSet();
            aVar.h = new HashMap();
        }
        aVar.f12721i = t6.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f12715a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f12715a;
        if (hashSet2.contains(GoogleSignInOptions.A)) {
            Scope scope2 = GoogleSignInOptions.f3113y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f12719f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f3112x);
        }
        this.Q = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f12719f, aVar.d, aVar.f12716b, aVar.f12717c, aVar.f12718e, aVar.f12720g, aVar.h, aVar.f12721i);
    }

    @Override
    public final int k() {
        return 12451000;
    }

    @Override
    public final Intent n() {
        return h.a(this.f49635n, this.Q);
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 9);
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
