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
public final class eha extends xx4 {
    public final boolean F;
    public final ntb G;
    public final Bundle H;
    public final Integer I;

    public eha(Context context, Looper looper, ntb ntbVar, Bundle bundle, ey4 ey4Var, fy4 fy4Var) {
        super(44, ey4Var, fy4Var, ntbVar, context, looper);
        this.F = true;
        this.G = ntbVar;
        this.H = bundle;
        this.I = (Integer) ntbVar.h;
    }

    public final void B(z0d z0dVar) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.G.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = d1b.a(this.h).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.I;
            fre.h(num);
            j3d j3dVar = new j3d(2, account, num.intValue(), googleSignInAccount);
            r2d r2dVar = (r2d) k();
            w2d w2dVar = new w2d(1, j3dVar);
            Parcel c = r2dVar.c();
            e2d.b(c, w2dVar);
            e2d.c(c, z0dVar);
            r2dVar.d(c, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                z0dVar.U(new c3d(1, new ds2(8, null, null), null));
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
        if (queryLocalInterface instanceof r2d) {
            return (r2d) queryLocalInterface;
        }
        return new ezc(iBinder, "com.google.android.gms.signin.internal.ISignInService", (byte) 1);
    }

    @Override
    public final Bundle h() {
        ntb ntbVar = this.G;
        boolean equals = this.h.getPackageName().equals((String) ntbVar.d);
        Bundle bundle = this.H;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) ntbVar.d);
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
