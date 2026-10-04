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
    public static final Parcelable.Creator<f> CREATOR = new m8.h(21);
    public static final Scope[] E = new Scope[0];
    public static final k6.c[] F = new k6.c[0];
    public final int f16668a;
    public final int f16669b;
    public final int f16670c;
    public String d;
    public IBinder f16671e;
    public Scope[] f16672f;
    public Bundle h;
    public Account f16673n;
    public k6.c[] f16674r;
    public k6.c[] f16675s;
    public final boolean v;
    public final int f16676w;
    public boolean f16677x;
    public final String f16678y;

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
        this.f16668a = i10;
        this.f16669b = i11;
        this.f16670c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = a.f16652b;
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
                        Parcel M0 = l0Var.M0(l0Var.O0(), 2);
                        Account account3 = (Account) m7.a.a(M0, Account.CREATOR);
                        M0.recycle();
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
            this.f16673n = account2;
        } else {
            this.f16671e = iBinder;
            this.f16673n = account;
        }
        this.f16672f = scopeArr2;
        this.h = bundle2;
        this.f16674r = cVarArr3;
        this.f16675s = cVarArr4;
        this.v = z10;
        this.f16676w = i13;
        this.f16677x = z11;
        this.f16678y = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        m8.h.a(this, parcel, i10);
    }
}
