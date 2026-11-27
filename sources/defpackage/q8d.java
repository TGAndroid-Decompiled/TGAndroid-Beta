package defpackage;

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
public final class q8d extends d05 {
    public final GoogleSignInOptions F;

    public q8d(Context context, Looper looper, oxb oxbVar, GoogleSignInOptions googleSignInOptions, k05 k05Var, l05 l05Var) {
        super(91, k05Var, l05Var, oxbVar, context, looper);
        d15 d15Var;
        Set<Scope> set = (Set) oxbVar.b;
        if (googleSignInOptions != null) {
            ?? obj = new Object();
            obj.a = new HashSet();
            obj.h = new HashMap();
            obj.a = new HashSet(googleSignInOptions.b);
            obj.b = googleSignInOptions.e;
            obj.c = googleSignInOptions.f;
            obj.d = googleSignInOptions.d;
            obj.e = googleSignInOptions.h;
            obj.f = googleSignInOptions.c;
            obj.g = googleSignInOptions.n;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.r);
            obj.i = googleSignInOptions.s;
            d15Var = obj;
        } else {
            ?? obj2 = new Object();
            obj2.a = new HashSet();
            obj2.h = new HashMap();
            d15Var = obj2;
        }
        d15Var.i = j8d.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = d15Var.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = d15Var.a;
        if (hashSet2.contains(GoogleSignInOptions.F)) {
            Scope scope2 = GoogleSignInOptions.E;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (d15Var.d && (d15Var.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.y);
        }
        this.F = new GoogleSignInOptions(3, new ArrayList(hashSet2), d15Var.f, d15Var.d, d15Var.b, d15Var.c, d15Var.e, d15Var.g, d15Var.h, d15Var.i);
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof a9d) {
            return (a9d) queryLocalInterface;
        }
        return new v3d(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", (byte) 2);
    }

    @Override
    public final int i() {
        return 12451000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override
    public final Intent m() {
        return y8d.a(this.h, this.F);
    }

    @Override
    public final String n() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
