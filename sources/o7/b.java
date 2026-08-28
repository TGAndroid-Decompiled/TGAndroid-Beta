package o7;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import f8.p;
import m.t3;
public final class b extends x5.g {
    public final Context Q;
    public final int R;
    public final String S;
    public final int T;
    public final boolean U;

    public b(Context context, Looper looper, t3 t3Var, k kVar, l lVar, int i9) {
        super(context, looper, 4, t3Var, kVar, lVar, 0);
        this.Q = context;
        this.R = i9;
        this.S = null;
        this.T = 1;
        this.U = true;
    }

    @Override
    public final boolean C() {
        return true;
    }

    public final Bundle G() {
        String packageName = this.Q.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.R);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.U);
        bundle.putString("androidPackageName", packageName);
        String str = this.S;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.T);
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
    public final u5.c[] r() {
        return p.f5969c;
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
