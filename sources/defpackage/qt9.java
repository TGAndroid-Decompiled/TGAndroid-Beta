package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
public final class qt9 implements ServiceConnection {
    public cl5 a;
    public final rt9 b;

    public qt9(rt9 rt9Var) {
        this.b = rt9Var;
    }

    public final boolean a() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        boolean z;
        cl5 cl5Var = this.a;
        if (cl5Var != null) {
            al5 al5Var = (al5) cl5Var;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i = kl2.a;
            if (intent == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel a = al5Var.a(obtain, 1);
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
        cl5 al5Var;
        if (this.b.a) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i = bl5.a;
        if (iBinder == null) {
            al5Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            if (queryLocalInterface instanceof cl5) {
                al5Var = (cl5) queryLocalInterface;
            } else {
                al5Var = new al5(iBinder);
            }
        }
        this.a = al5Var;
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a = null;
        if (this.b.a) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
