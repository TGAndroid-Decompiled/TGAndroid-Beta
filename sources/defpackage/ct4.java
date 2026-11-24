package defpackage;

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
public final class ct4 extends b4 {
    public static final Parcelable.Creator<ct4> CREATOR = new c0f((byte) 1);
    public static final Scope[] F = new Scope[0];
    public static final f84[] G = new f84[0];
    public final String E;
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle h;
    public Account n;
    public f84[] r;
    public f84[] s;
    public final boolean w;
    public final int x;
    public boolean y;

    public ct4(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, f84[] f84VarArr, f84[] f84VarArr2, boolean z, int i4, boolean z2, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        f84[] f84VarArr3;
        Account account2;
        IInterface ezcVar;
        if (scopeArr == null) {
            scopeArr2 = F;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        f84[] f84VarArr4 = G;
        if (f84VarArr == null) {
            f84VarArr3 = f84VarArr4;
        } else {
            f84VarArr3 = f84VarArr;
        }
        f84VarArr4 = f84VarArr2 != null ? f84VarArr2 : f84VarArr4;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = e5.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof ug5) {
                    ezcVar = (ug5) queryLocalInterface;
                } else {
                    ezcVar = new ezc(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        kef kefVar = (kef) ezcVar;
                        Parcel P = kefVar.P(kefVar.R(), 2);
                        Account account3 = (Account) mgd.a(P, Account.CREATOR);
                        P.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.e = iBinder;
            account2 = account;
        }
        this.n = account2;
        this.f = scopeArr2;
        this.h = bundle2;
        this.r = f84VarArr3;
        this.s = f84VarArr4;
        this.w = z;
        this.x = i4;
        this.y = z2;
        this.E = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        c0f.a(this, parcel, i);
    }
}
