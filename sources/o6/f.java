package o6;

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
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new n4.x(19);
    public static final Scope[] E = new Scope[0];
    public static final l6.c[] F = new l6.c[0];
    public final int f19109a;
    public final int f19110b;
    public final int f19111c;
    public String d;
    public IBinder e;
    public Scope[] f19112f;
    public Bundle h;
    public Account f19113n;
    public l6.c[] f19114r;
    public l6.c[] f19115s;
    public final boolean v;
    public final int f19116w;
    public boolean f19117x;
    public final String f19118y;

    public f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, l6.c[] cVarArr, l6.c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        l6.c[] cVarArr3;
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
        l6.c[] cVarArr4 = F;
        if (cVarArr == null) {
            cVarArr3 = cVarArr4;
        } else {
            cVarArr3 = cVarArr;
        }
        cVarArr4 = cVarArr2 != null ? cVarArr2 : cVarArr4;
        this.f19109a = i10;
        this.f19110b = i11;
        this.f19111c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = a.f19094b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof h) {
                    aVar = (h) queryLocalInterface;
                } else {
                    aVar = new a8.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 8);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        l0 l0Var = (l0) aVar;
                        Parcel L0 = l0Var.L0(l0Var.N0(), 2);
                        Account account3 = (Account) n7.a.a(L0, Account.CREATOR);
                        L0.recycle();
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
            this.f19113n = account2;
        } else {
            this.e = iBinder;
            this.f19113n = account;
        }
        this.f19112f = scopeArr2;
        this.h = bundle2;
        this.f19114r = cVarArr3;
        this.f19115s = cVarArr4;
        this.v = z10;
        this.f19116w = i13;
        this.f19117x = z11;
        this.f19118y = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        n4.x.a(this, parcel, i10);
    }
}
