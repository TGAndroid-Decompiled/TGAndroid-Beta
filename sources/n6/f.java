package n6;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new m8.i(18);
    public static final Scope[] E = new Scope[0];
    public static final k6.c[] F = new k6.c[0];
    public final String D;
    public final int f13568a;
    public final int f13569b;
    public final int f13570c;
    public String d;
    public IBinder e;
    public Scope[] f13571f;
    public Bundle h;
    public Account f13572n;
    public k6.c[] f13573r;
    public k6.c[] f13574s;
    public final boolean f13575w;
    public final int f13576x;
    public boolean f13577y;

    public f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, k6.c[] cVarArr, k6.c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        k6.c[] cVarArr3;
        IInterface aVar;
        if (scopeArr == null) {
            scopeArr2 = E;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        k6.c[] cVarArr4 = F;
        if (cVarArr == null) {
            cVarArr3 = cVarArr4;
        } else {
            cVarArr3 = cVarArr;
        }
        cVarArr4 = cVarArr2 != null ? cVarArr2 : cVarArr4;
        this.f13568a = i10;
        this.f13569b = i11;
        this.f13570c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = a.f13553b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof h) {
                    aVar = (h) queryLocalInterface;
                } else {
                    aVar = new a9.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 7);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        l0 l0Var = (l0) aVar;
                        Parcel N0 = l0Var.N0(l0Var.P0(), 2);
                        Account account3 = (Account) m7.a.a(N0, Account.CREATOR);
                        N0.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th2;
                }
            }
            this.f13572n = account2;
        } else {
            this.e = iBinder;
            this.f13572n = account;
        }
        this.f13571f = scopeArr2;
        this.h = bundle2;
        this.f13573r = cVarArr3;
        this.f13574s = cVarArr4;
        this.f13575w = z10;
        this.f13576x = i13;
        this.f13577y = z11;
        this.D = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        m8.i.a(this, parcel, i10);
    }
}
