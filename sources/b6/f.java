package b6;

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
public final class f extends c6.a {
    public final int f1701a;
    public final int f1702b;
    public final int f1703c;
    public String d;
    public IBinder f1704e;
    public Scope[] f1705f;
    public Bundle h;
    public Account f1706n;
    public y5.c[] f1707r;
    public y5.c[] f1708s;
    public final boolean v;
    public final int f1709w;
    public boolean f1710x;
    public final String f1711y;
    public static final Parcelable.Creator<f> CREATOR = new w.a(28);
    public static final Scope[] B = new Scope[0];
    public static final y5.c[] C = new y5.c[0];

    public f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, y5.c[] cVarArr, y5.c[] cVarArr2, boolean z4, int i13, boolean z10, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        y5.c[] cVarArr3;
        IInterface aVar;
        if (scopeArr == null) {
            scopeArr2 = B;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        y5.c[] cVarArr4 = C;
        if (cVarArr == null) {
            cVarArr3 = cVarArr4;
        } else {
            cVarArr3 = cVarArr;
        }
        cVarArr4 = cVarArr2 != null ? cVarArr2 : cVarArr4;
        this.f1701a = i10;
        this.f1702b = i11;
        this.f1703c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = a.f1685b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof i) {
                    aVar = (i) queryLocalInterface;
                } else {
                    aVar = new a7.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 0);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        m0 m0Var = (m0) aVar;
                        Parcel K0 = m0Var.K0(m0Var.M0(), 2);
                        Account account3 = (Account) a7.d.a(K0, Account.CREATOR);
                        K0.recycle();
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
            this.f1706n = account2;
        } else {
            this.f1704e = iBinder;
            this.f1706n = account;
        }
        this.f1705f = scopeArr2;
        this.h = bundle2;
        this.f1707r = cVarArr3;
        this.f1708s = cVarArr4;
        this.v = z4;
        this.f1709w = i13;
        this.f1710x = z10;
        this.f1711y = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        w.a.a(this, parcel, i10);
    }
}
