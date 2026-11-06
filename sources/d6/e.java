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
        Set<Scope> set = (Set) q3Var.f19226b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f5355a = new HashSet();
            obj.h = new HashMap();
            obj.f5355a = new HashSet(googleSignInOptions.f6466b);
            obj.f5356b = googleSignInOptions.f6468e;
            obj.f5357c = googleSignInOptions.f6469f;
            obj.d = googleSignInOptions.d;
            obj.f5358e = googleSignInOptions.h;
            obj.f5359f = googleSignInOptions.f6467c;
            obj.f5360g = googleSignInOptions.f6470n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f6471r);
            obj.f5361i = googleSignInOptions.f6472s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f5355a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f5361i = l7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f5355a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f5355a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.D;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f5359f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f6464y);
        }
        this.F = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f5359f, aVar.d, aVar.f5356b, aVar.f5357c, aVar.f5358e, aVar.f5360g, aVar.h, aVar.f5361i);
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
