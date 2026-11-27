package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class xka extends d05 {
    public final boolean F;
    public final oxb G;
    public final Bundle H;
    public final Integer I;

    public xka(Context context, Looper looper, oxb oxbVar, Bundle bundle, k05 k05Var, l05 l05Var) {
        super(44, k05Var, l05Var, oxbVar, context, looper);
        this.F = true;
        this.G = oxbVar;
        this.H = bundle;
        this.I = (Integer) oxbVar.h;
    }

    public final void B(q5d q5dVar) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.G.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = a5b.a(this.h).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.I;
            xve.h(num);
            a8d a8dVar = new a8d(2, account, num.intValue(), googleSignInAccount);
            i7d i7dVar = (i7d) k();
            n7d n7dVar = new n7d(1, a8dVar);
            Parcel c = i7dVar.c();
            v6d.b(c, n7dVar);
            v6d.c(c, q5dVar);
            i7dVar.d(c, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                q5dVar.U(new t7d(1, new ws2(8, null, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof i7d) {
            return (i7d) queryLocalInterface;
        }
        return new v3d(iBinder, "com.google.android.gms.signin.internal.ISignInService", (byte) 1);
    }

    @Override
    public final Bundle h() {
        oxb oxbVar = this.G;
        boolean equals = this.h.getPackageName().equals((String) oxbVar.d);
        Bundle bundle = this.H;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) oxbVar.d);
        }
        return bundle;
    }

    @Override
    public final int i() {
        return 12451000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override
    public final boolean w() {
        return this.F;
    }
}
