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
        Set<Scope> set = (Set) o3Var.f19795b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f4179a = new HashSet();
            obj.h = new HashMap();
            obj.f4179a = new HashSet(googleSignInOptions.f5848b);
            obj.f4180b = googleSignInOptions.f5850e;
            obj.f4181c = googleSignInOptions.f5851f;
            obj.d = googleSignInOptions.d;
            obj.f4182e = googleSignInOptions.h;
            obj.f4183f = googleSignInOptions.f5849c;
            obj.f4184g = googleSignInOptions.f5852n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f5853r);
            obj.f4185i = googleSignInOptions.f5854s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f4179a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f4185i = l7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f4179a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f4179a;
        if (hashSet2.contains(GoogleSignInOptions.F)) {
            Scope scope2 = GoogleSignInOptions.E;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f4183f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f5846y);
        }
        this.F = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f4183f, aVar.d, aVar.f4180b, aVar.f4181c, aVar.f4182e, aVar.f4184g, aVar.h, aVar.f4185i);
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
