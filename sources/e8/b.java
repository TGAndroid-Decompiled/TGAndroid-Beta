package e8;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.p3;
import v8.p;
public final class b extends n6.g {
    public final Context U;
    public final int V;
    public final String W;
    public final int X;
    public final boolean Y;

    public b(Context context, Looper looper, p3 p3Var, k kVar, l lVar, int i10) {
        super(context, looper, 4, p3Var, kVar, lVar, 0);
        this.U = context;
        this.V = i10;
        this.W = null;
        this.X = 1;
        this.Y = true;
    }

    @Override
    public final boolean C() {
        return true;
    }

    public final Bundle G() {
        String packageName = this.U.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.V);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.Y);
        bundle.putString("androidPackageName", packageName);
        String str = this.W;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.X);
        return bundle;
    }

    @Override
    public final int l() {
        return 12600000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
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
    public final k6.c[] r() {
        return p.f47768c;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.wallet.service.BIND";
    }
}
