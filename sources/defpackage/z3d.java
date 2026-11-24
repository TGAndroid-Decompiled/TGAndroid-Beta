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
public final class z3d extends xx4 {
    public final GoogleSignInOptions F;

    public z3d(Context context, Looper looper, ntb ntbVar, GoogleSignInOptions googleSignInOptions, ey4 ey4Var, fy4 fy4Var) {
        super(91, ey4Var, fy4Var, ntbVar, context, looper);
        zy4 zy4Var;
        Set<Scope> set = (Set) ntbVar.b;
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
            zy4Var = obj;
        } else {
            ?? obj2 = new Object();
            obj2.a = new HashSet();
            obj2.h = new HashMap();
            zy4Var = obj2;
        }
        zy4Var.i = s3d.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = zy4Var.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = zy4Var.a;
        if (hashSet2.contains(GoogleSignInOptions.F)) {
            Scope scope2 = GoogleSignInOptions.E;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (zy4Var.d && (zy4Var.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.y);
        }
        this.F = new GoogleSignInOptions(3, new ArrayList(hashSet2), zy4Var.f, zy4Var.d, zy4Var.b, zy4Var.c, zy4Var.e, zy4Var.g, zy4Var.h, zy4Var.i);
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof j4d) {
            return (j4d) queryLocalInterface;
        }
        return new ezc(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", (byte) 2);
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
        return h4d.a(this.h, this.F);
    }

    @Override
    public final String n() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
