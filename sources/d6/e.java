package d6;

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
public final class e extends q6.h {
    public final GoogleSignInOptions F;

    public e(Context context, Looper looper, q3 q3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, q3Var, kVar, lVar, 0);
        c6.a aVar;
        Set<Scope> set = (Set) q3Var.f19234b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f5358a = new HashSet();
            obj.h = new HashMap();
            obj.f5358a = new HashSet(googleSignInOptions.f6469b);
            obj.f5359b = googleSignInOptions.f6471e;
            obj.f5360c = googleSignInOptions.f6472f;
            obj.d = googleSignInOptions.d;
            obj.f5361e = googleSignInOptions.h;
            obj.f5362f = googleSignInOptions.f6470c;
            obj.f5363g = googleSignInOptions.f6473n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f6474r);
            obj.f5364i = googleSignInOptions.f6475s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f5358a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f5364i = l7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f5358a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f5358a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.D;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f5362f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f6467y);
        }
        this.F = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f5362f, aVar.d, aVar.f5359b, aVar.f5360c, aVar.f5361e, aVar.f5363g, aVar.h, aVar.f5364i);
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
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof k) {
            return (k) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 7);
    }

    @Override
    public final String o() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
