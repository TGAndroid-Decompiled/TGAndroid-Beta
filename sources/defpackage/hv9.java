package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
public final class hv9 implements ServiceConnection {
    public fl5 a;
    public final iv9 b;

    public hv9(iv9 iv9Var) {
        this.b = iv9Var;
    }

    public final boolean a() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        boolean z;
        fl5 fl5Var = this.a;
        if (fl5Var != null) {
            dl5 dl5Var = (dl5) fl5Var;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i = sk2.a;
            if (intent == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel a = dl5Var.a(obtain, 1);
            if (a.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            a.recycle();
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        fl5 dl5Var;
        if (this.b.a) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i = el5.a;
        if (iBinder == null) {
            dl5Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            if (queryLocalInterface instanceof fl5) {
                dl5Var = (fl5) queryLocalInterface;
            } else {
                dl5Var = new dl5(iBinder);
            }
        }
        this.a = dl5Var;
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a = null;
        if (this.b.a) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
