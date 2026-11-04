package g8;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;
import x8.p;
public final class b extends p6.h {
    public final Context F;
    public final int G;
    public final String H;
    public final int I;
    public final boolean J;

    public b(Context context, Looper looper, o3 o3Var, k kVar, l lVar, int i3) {
        super(context, looper, 4, o3Var, kVar, lVar, 0);
        this.F = context;
        this.G = i3;
        this.H = null;
        this.I = 1;
        this.J = true;
    }

    public final Bundle A() {
        String packageName = this.F.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.G);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.J);
        bundle.putString("androidPackageName", packageName);
        String str = this.H;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.I);
        return bundle;
    }

    @Override
    public final int d() {
        return 12600000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof i) {
            return (i) queryLocalInterface;
        }
        return new i(iBinder);
    }

    @Override
    public final m6.c[] i() {
        return p.f58570c;
    }

    @Override
    public final String n() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override
    public final boolean w() {
        return true;
    }
}
