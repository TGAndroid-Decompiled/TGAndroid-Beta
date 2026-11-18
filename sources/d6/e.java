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
import m.o3;
public final class e extends q6.h {
    public final GoogleSignInOptions F;

    public e(Context context, Looper looper, o3 o3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, o3Var, kVar, lVar, 0);
        c6.a aVar;
        Set<Scope> set = (Set) o3Var.f20159b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f4460a = new HashSet();
            obj.h = new HashMap();
            obj.f4460a = new HashSet(googleSignInOptions.f6131b);
            obj.f4461b = googleSignInOptions.f6133e;
            obj.f4462c = googleSignInOptions.f6134f;
            obj.d = googleSignInOptions.d;
            obj.f4463e = googleSignInOptions.h;
            obj.f4464f = googleSignInOptions.f6132c;
            obj.f4465g = googleSignInOptions.f6135n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f6136r);
            obj.f4466i = googleSignInOptions.f6137s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f4460a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f4466i = l7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f4460a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f4460a;
        if (hashSet2.contains(GoogleSignInOptions.F)) {
            Scope scope2 = GoogleSignInOptions.E;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f4464f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f6129y);
        }
        this.F = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f4464f, aVar.d, aVar.f4461b, aVar.f4462c, aVar.f4463e, aVar.f4465g, aVar.h, aVar.f4466i);
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
