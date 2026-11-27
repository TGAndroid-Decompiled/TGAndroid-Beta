package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
public final class nad extends d05 {
    public final Context F;
    public final byte G;
    public final String H;
    public final boolean I;
    public final boolean J;

    public nad(int i, k05 k05Var, l05 l05Var, oxb oxbVar, Context context, Looper looper) {
        super(4, k05Var, l05Var, oxbVar, context, looper);
        this.F = context;
        this.G = i;
        this.H = null;
        this.I = true;
        this.J = true;
    }

    public final Bundle B() {
        String packageName = this.F.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.G);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.J);
        bundle.putString("androidPackageName", packageName);
        String str = this.H;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.I ? 1 : 0);
        return bundle;
    }

    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof mhf) {
            return (mhf) queryLocalInterface;
        }
        return new mhf(iBinder);
    }

    @Override
    public final a94[] f() {
        return qod.b;
    }

    @Override
    public final int i() {
        return 12600000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override
    public final boolean x() {
        return true;
    }
}
