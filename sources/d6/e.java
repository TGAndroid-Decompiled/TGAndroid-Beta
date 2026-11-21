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
        Set<Scope> set = (Set) o3Var.f20187b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f4489a = new HashSet();
            obj.h = new HashMap();
            obj.f4489a = new HashSet(googleSignInOptions.f6160b);
            obj.f4490b = googleSignInOptions.f6162e;
            obj.f4491c = googleSignInOptions.f6163f;
            obj.d = googleSignInOptions.d;
            obj.f4492e = googleSignInOptions.h;
            obj.f4493f = googleSignInOptions.f6161c;
            obj.f4494g = googleSignInOptions.f6164n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f6165r);
            obj.f4495i = googleSignInOptions.f6166s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f4489a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f4495i = l7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f4489a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f4489a;
        if (hashSet2.contains(GoogleSignInOptions.F)) {
            Scope scope2 = GoogleSignInOptions.E;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f4493f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f6158y);
        }
        this.F = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f4493f, aVar.d, aVar.f4490b, aVar.f4491c, aVar.f4492e, aVar.f4494g, aVar.h, aVar.f4495i);
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
