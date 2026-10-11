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
    public final int f16683a;
    public final int f16684b;
    public final int f16685c;
    public String d;
    public IBinder f16686e;
    public Scope[] f16687f;
    public Bundle h;
    public Account f16688n;
    public k6.c[] f16689r;
    public k6.c[] f16690s;
    public final boolean v;
    public final int f16691w;
    public boolean f16692x;
    public final String f16693y;

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
        this.f16683a = i10;
        this.f16684b = i11;
        this.f16685c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = a.f16667b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof h) {
                    aVar = (h) queryLocalInterface;
                } else {
                    aVar = new a9.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 7);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        m0 m0Var = (m0) aVar;
                        Parcel L0 = m0Var.L0(m0Var.N0(), 2);
                        Account account3 = (Account) m7.a.a(L0, Account.CREATOR);
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
            this.f16688n = account2;
        } else {
            this.f16686e = iBinder;
            this.f16688n = account;
        }
        this.f16687f = scopeArr2;
        this.h = bundle2;
        this.f16689r = cVarArr3;
        this.f16690s = cVarArr4;
        this.v = z10;
        this.f16691w = i13;
        this.f16692x = z11;
        this.f16693y = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        m8.h.a(this, parcel, i10);
    }
}
