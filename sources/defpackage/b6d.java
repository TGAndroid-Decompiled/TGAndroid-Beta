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
public final class b6d extends zz4 {
    public final GoogleSignInOptions F;

    public b6d(Context context, Looper looper, ovb ovbVar, GoogleSignInOptions googleSignInOptions, f05 f05Var, g05 g05Var) {
        super(91, f05Var, g05Var, ovbVar, context, looper);
        y05 y05Var;
        Set<Scope> set = (Set) ovbVar.b;
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
            y05Var = obj;
        } else {
            ?? obj2 = new Object();
            obj2.a = new HashSet();
            obj2.h = new HashMap();
            y05Var = obj2;
        }
        y05Var.i = u5d.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = y05Var.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = y05Var.a;
        if (hashSet2.contains(GoogleSignInOptions.F)) {
            Scope scope2 = GoogleSignInOptions.E;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (y05Var.d && (y05Var.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.y);
        }
        this.F = new GoogleSignInOptions(3, new ArrayList(hashSet2), y05Var.f, y05Var.d, y05Var.b, y05Var.c, y05Var.e, y05Var.g, y05Var.h, y05Var.i);
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof l6d) {
            return (l6d) queryLocalInterface;
        }
        return new f1d(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", (byte) 2);
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
        return j6d.a(this.h, this.F);
    }

    @Override
    public final String n() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
