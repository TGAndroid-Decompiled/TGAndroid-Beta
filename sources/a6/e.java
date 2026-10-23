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
import m.s3;
public final class e extends n6.g {
    public final GoogleSignInOptions U;

    public e(Context context, Looper looper, s3 s3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, s3Var, kVar, lVar, 0);
        z5.a aVar;
        Set<Scope> set = (Set) s3Var.f16335b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.f50714a = new HashSet();
            obj.h = new HashMap();
            obj.f50714a = new HashSet(googleSignInOptions.f6287b);
            obj.f50715b = googleSignInOptions.e;
            obj.f50716c = googleSignInOptions.f6289f;
            obj.d = googleSignInOptions.d;
            obj.e = googleSignInOptions.h;
            obj.f50717f = googleSignInOptions.f6288c;
            obj.f50718g = googleSignInOptions.f6290n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.f6291r);
            obj.f50719i = googleSignInOptions.f6292s;
            aVar = obj;
        } else {
            ?? obj2 = new Object();
            obj2.f50714a = new HashSet();
            obj2.h = new HashMap();
            aVar = obj2;
        }
        aVar.f50719i = i7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f50714a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f50714a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.f6285y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f50717f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f6284x);
        }
        this.U = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f50717f, aVar.d, aVar.f50715b, aVar.f50716c, aVar.e, aVar.f50718g, aVar.h, aVar.f50719i);
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final Intent o() {
        return h.a(this.f17184n, this.U);
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
